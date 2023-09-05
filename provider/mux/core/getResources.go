package core

import (
	"fmt"
	"strings"

	"github.com/Azure/azure-sdk-for-go/services/resourcegraph/mgmt/2021-03-01/resourcegraph" // nolint: staticcheck
	"github.com/Azure/go-autorest/autorest"
	"github.com/hashicorp/go-azure-sdk/sdk/auth"
	"github.com/hashicorp/go-azure-sdk/sdk/environments"
	"github.com/pulumi/pulumi-azure/provider/v5/mux/config"
	"github.com/pulumi/pulumi-azure/provider/v5/pkg/util"
	p "github.com/pulumi/pulumi-go-provider"
	"github.com/pulumi/pulumi-go-provider/infer"
)

type GetResourcesArgs struct {
	Name               *string            `pulumi:"name,optional"`
	ResourceGroupName  *string            `pulumi:"resourceGroupName,optional"`
	Type               *string            `pulumi:"type,optional"`
	Location           *string            `pulumi:"location,optional"`
	RequiredTags       *map[string]string `pulumi:"requiredTags,optional"`
	SubscriptionIds    *[]string          `pulumi:"subscriptionIds,optional"`
	ManagementGroupIds *[]string          `pulumi:"managementGroupIds,optional"`
}

func (args *GetResourcesArgs) Annotate(a infer.Annotator) {
	a.Describe(args, "A collection of arguments for invoking getResources.")
	a.Describe(&args.Name, "The name of the Resource to search for")
	a.Describe(&args.ResourceGroupName, "The name of the Resource group where the Resources are located")
	a.Describe(&args.Type, "The Resource Type of the Resources you want to list")
	a.Describe(&args.Location, "Only return resources that deployed at a specific location")
}

type ResourceItem struct {
	Id                string             `pulumi:"id"`
	Name              string             `pulumi:"name"`
	Type              string             `pulumi:"type"`
	SubscriptionId    *string            `pulumi:"subscriptionId,optional"`
	ResourceGroupName *string            `pulumi:"resourceGroupName,optional"`
	Location          *string            `pulumi:"location,optional"`
	Tags              *map[string]string `pulumi:"tags,optional"`
}

func (i *ResourceItem) Annotate(a infer.Annotator) {
	a.SetToken("core/getResourcesResource", "getResourcesResource")
	a.Describe(i, "A collection of values returned by getResources.")
	a.Describe(&i.Id, "The provider-assigned unique ID for this managed resource.")
	a.Describe(&i.Name, "The name of this Resource.")
	a.Describe(&i.Type, "The type of the resource.")
	a.Describe(&i.SubscriptionId, "The subscription to which the resources is deployed.")
	a.Describe(&i.ResourceGroupName, "The resoure group to which the resources is deployed.")
	a.Describe(&i.Location, "The location where the resource is deployed.")
	a.Describe(&i.Tags, "The tags assigned to the resource.")
}

type GetResourcesResult struct {
	Resources []ResourceItem `pulumi:"resources"`
}

type GetResources struct{}

func (f *GetResources) Annotate(a infer.Annotator) {
	a.Describe(f, "Use this data source to access information about existing resources.")
	a.SetToken("core/getResources", "getResources")
}

type oAuthProvider struct {
	ctx  p.Context
	auth auth.Authorizer
}

func (a oAuthProvider) OAuthToken() string {
	tok, _ := a.auth.Token(a.ctx, nil)
	return tok.AccessToken
}

func (f GetResources) Call(ctx p.Context, args GetResourcesArgs) (res GetResourcesResult, err error) {
	res = GetResourcesResult{}
	if (args.ResourceGroupName == nil || *args.ResourceGroupName == "") && (args.Name == nil || *args.Name == "") && (args.Type == nil || *args.Type == "") {
		err = fmt.Errorf("at least one of `name`, `resourceGroupName` or `type` must be specified")
		return
	}

	filterClauses := []string{}

	if args.Name != nil && *args.Name != "" {
		filterClauses = append(filterClauses, fmt.Sprintf("name == '%s'", *args.Name))
	}
	if args.Type != nil && *args.Type != "" {
		filterClauses = append(filterClauses, fmt.Sprintf("type =~ '%s' ", *args.Type))
	}
	if args.ResourceGroupName != nil && *args.ResourceGroupName != "" {
		filterClauses = append(filterClauses, fmt.Sprintf("resourceGroup =~ '%s'", *args.ResourceGroupName))
	}
	if args.Location != nil && *args.Location != "" {
		filterClauses = append(filterClauses, fmt.Sprintf("location =~ '%s'", *args.Location))
	}

	filter := strings.Join(filterClauses, " and ")
	query := fmt.Sprintf(`resources
| project name, id, subscriptionId, resourceGroup, type, location, tags
| where %s`, filter)

	opts := resourcegraph.QueryRequestOptions{
		ResultFormat: resourcegraph.ResultFormatObjectArray,
	}

	queryRequest := resourcegraph.QueryRequest{
		Options: &opts,
		Query:   &query,
	}

	queryRequest.Subscriptions = args.SubscriptionIds
	queryRequest.ManagementGroups = args.ManagementGroupIds

	envName := util.StringValue(config.ConfigValueMap, "environment", []string{"ARM_ENVIRONMENT"})
	if envName == "" {
		envName = "public"
	}

	env, err := environments.FromName(envName)
	if err != nil {
		err = fmt.Errorf("failed to read Azure environment \"%s\": %v", envName, err)
		return
	}

	auth, err := util.CreateAuthenticator(config.ConfigValueMap, env, env.ResourceManager)
	if err != nil {
		return
	}

	ep, _ := env.ResourceManager.Endpoint()
	resourceGraphClient := resourcegraph.NewWithBaseURI(*ep)
	resourceGraphClient.Authorizer = autorest.NewBearerAuthorizer(oAuthProvider{
		ctx:  ctx,
		auth: auth,
	})

	res.Resources = []ResourceItem{}

	for {
		resp, ierr := resourceGraphClient.Resources(ctx, queryRequest)
		if ierr != nil {
			err = ierr
			return
		}
		if resp.Count != nil && *resp.Count > 0 && resp.Data != nil {
			for _, v := range resp.Data.([]interface{}) {
				data := v.(map[string]interface{})
				item := ResourceItem{
					Id:   data["id"].(string),
					Name: data["name"].(string),
					Type: data["type"].(string),
				}
				if vd, ok := data["subscriptionId"]; ok {
					vs := vd.(string)
					item.SubscriptionId = &vs
				}
				if vd, ok := data["resourceGroup"]; ok {
					vs := vd.(string)
					item.ResourceGroupName = &vs

				}
				if vd, ok := data["location"]; ok {
					vs := vd.(string)
					item.Location = &vs

				}
				if vd, ok := data["tags"]; ok {
					vs := vd.(map[string]interface{})
					if len(vs) > 0 {
						tags := make(map[string]string, len(vs))
						for k, iv := range vs {
							tags[k] = iv.(string)
						}
						item.Tags = &tags
					}
				}
				res.Resources = append(res.Resources, item)
			}
		}
		if resp.SkipToken == nil {
			break
		}
		queryRequest.Options.SkipToken = resp.SkipToken
	}

	return
}
