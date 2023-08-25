package provider

import (
	"context"
	"fmt"
	"strings"

	"github.com/Azure/azure-sdk-for-go/profiles/latest/resourcegraph/mgmt/resourcegraph"
	"github.com/hashicorp/go-azure-sdk/sdk/auth"
	"github.com/hashicorp/go-azure-sdk/sdk/environments"
	"github.com/pulumi/pulumi-terraform-bridge/x/muxer"
	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/pulumi/pulumi/pkg/v3/resource/provider"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource/plugin"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/logging"
	pulumirpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
	"google.golang.org/protobuf/types/known/structpb"
)

func NewAzureMuxProvider() muxer.Provider {
	return &azureMuxProvider{
		packageSchema: schema.PackageSpec{
			Name: "azurerm",
			Types: map[string]schema.ComplexTypeSpec{
				"azure:core/getResourcesResource:getResourcesResource": {
					ObjectTypeSpec: schema.ObjectTypeSpec{
						Type:        "object",
						Description: "A collection of values returned by getResources.",
						Properties: map[string]schema.PropertySpec{
							"id": {
								Description: "The provider-assigned unique ID for this managed resource.",
								TypeSpec: schema.TypeSpec{
									Type: "string",
								},
							},
							"name": {
								Description: "The name of this Resource.",
								TypeSpec: schema.TypeSpec{
									Type: "string",
								},
							},
							"subscriptionId": {
								Description: "The subscription to which the resources is deployed.",
								TypeSpec: schema.TypeSpec{
									Type: "string",
								},
							},
							"resourceGroupName": {
								Description: "The resoure group to which the resources is deployed.",
								TypeSpec: schema.TypeSpec{
									Type: "string",
								},
							},
							"type": {
								Description: "The type of the resource.",
								TypeSpec: schema.TypeSpec{
									Type: "string",
								},
							},
							"location": {
								Description: "The location where the resource is deployed.",
								TypeSpec: schema.TypeSpec{
									Type: "string",
								},
							},
							"tags": {
								Description: "The tags assigned to the resource.",
								TypeSpec: schema.TypeSpec{
									Type: "object",
									AdditionalProperties: &schema.TypeSpec{
										Type: "string",
									},
								},
							},
						},
						Required: []string{
							"name",
							"type",
							"id",
						},
					},
				},
			},
			Functions: map[string]schema.FunctionSpec{
				"azure:core/getResources:getResources": {
					Description: "Use this data source to access information about existing resources.",
					Inputs: &schema.ObjectTypeSpec{
						Description: "A collection of arguments for invoking getResources.",
						Type:        "object",
						Properties: map[string]schema.PropertySpec{
							"name": {
								Description: "The name of the Resource to search for",
								TypeSpec: schema.TypeSpec{
									Type: "string",
								},
							},
							"resourceGroupName": {
								Description: "The name of the Resource group where the Resources are located",
								TypeSpec: schema.TypeSpec{
									Type: "string",
								},
							},
							"type": {
								Description: "The Resource Type of the Resources you want to list",
								TypeSpec: schema.TypeSpec{
									Type: "string",
								},
							},
							"location": {
								Description: "Only return resources that deployed at a specific location",
								TypeSpec: schema.TypeSpec{
									Type: "string",
								},
							},
							"requiredTags": {
								TypeSpec: schema.TypeSpec{
									Type: "object",
									AdditionalProperties: &schema.TypeSpec{
										Type: "string",
									},
								},
							},
							"subscriptionIds": {
								TypeSpec: schema.TypeSpec{
									Type: "array",
									Items: &schema.TypeSpec{
										Type: "string",
									},
								},
							},
							"managementGroupIds": {
								TypeSpec: schema.TypeSpec{
									Type: "array",
									Items: &schema.TypeSpec{
										Type: "string",
									},
								},
							},
						},
					},
					ReturnType: &schema.ReturnTypeSpec{
						ObjectTypeSpec: &schema.ObjectTypeSpec{
							Type: "object",
							Properties: map[string]schema.PropertySpec{
								"resources": {
									TypeSpec: schema.TypeSpec{
										Type: "array",
										Items: &schema.TypeSpec{
											Ref: "#/types/azure:core/getResourcesResource:getResourcesResource",
										},
									},
								},
							},
							Required: []string{
								"resources",
							},
						},
					},
				},
				"azure:core/getClientToken:getClientToken": {
					Description: "Use this function to get an Azure authentication token for the current login context.",
					// Inputs: &schema.ObjectTypeSpec{
					// 	Type: "object",
					// 	Properties: map[string]schema.PropertySpec{
					// 		"endpoint": {
					// 			Description: "Optional authentication endpoint. Defaults to the endpoint of Azure Resource Manager.",
					// 			TypeSpec:    schema.TypeSpec{Type: "string"},
					// 		},
					// 		"scope": {
					// 			Description: "Optional authnetication scope. Defaults to the endpoint of Azure Resource Manager.",
					// 			TypeSpec:    schema.TypeSpec{Type: "string"},
					// 		},
					// 	},
					// },
					Outputs: &schema.ObjectTypeSpec{
						Type:     "object",
						Required: []string{"token"},
						Properties: map[string]schema.PropertySpec{
							"token": {
								Description: "OAuth token for based on scope and endpoint.",
								TypeSpec:    schema.TypeSpec{Type: "string"},
								Secret:      true,
							},
							"expiresOn": {
								Description: "Expiration time of OAuth token",
								TypeSpec:    schema.TypeSpec{Type: "string"},
							},
						},
					},
				},
			},
		},
	}
}

type azureMuxProvider struct {
	pulumirpc.UnimplementedResourceProviderServer

	packageSchema schema.PackageSpec
	authenticator auth.Authorizer
}

func (p *azureMuxProvider) GetSpec() (schema.PackageSpec, error) {
	return p.packageSchema, nil
}

func (p *azureMuxProvider) GetInstance(*provider.HostClient) (pulumirpc.ResourceProviderServer, error) {
	return p, nil
}

func (p *azureMuxProvider) Invoke(ctx context.Context, req *pulumirpc.InvokeRequest) (*pulumirpc.InvokeResponse, error) {
	logging.V(4).Infof("azureMuxProvider::Invoke called with request: %+v", req)

	props, err := plugin.UnmarshalProperties(req.GetArgs(), plugin.MarshalOptions{
		Label: req.Tok, KeepUnknowns: true, SkipNulls: true, KeepSecrets: true,
	})
	if err != nil {
		return nil, err
	}

	var result *structpb.Struct
	switch req.Tok {
	case "azure:core/getResources:getResources":
		{
			resourceGroupName := stringValue(props, "resourceGroupName", []string{})
			resourceName := stringValue(props, "name", []string{})
			resourceType := stringValue(props, "type", []string{})
			//requiredTags := arrayValue(props, "requiredTags", []string{}) FIXME: how to deserialize a map??
			resourceLocation := stringValue(props, "location", []string{})

			if resourceGroupName == "" && resourceName == "" && resourceType == "" {
				return nil, fmt.Errorf("at least one of `name`, `resourceGroupName` or `type` must be specified")
			}

			filterClauses := []string{}

			if resourceName != "" {
				filterClauses = append(filterClauses, fmt.Sprintf("name == '%s'", resourceName))
			}
			if resourceType != "" {
				filterClauses = append(filterClauses, fmt.Sprintf("type =~ '%s' ", resourceType))
			}
			if resourceGroupName != "" {
				filterClauses = append(filterClauses, fmt.Sprintf("resourceGroup =~ '%s'", resourceGroupName))
			}
			if resourceLocation != "" {
				filterClauses = append(filterClauses, fmt.Sprintf("location =~ '%s'", resourceLocation))
			}
			// if len(requiredTags) > 0 {
			// 	for requiredTagName, requiredTagVal := range requiredTags {
			// 		filterClauses = append(filterClauses, fmt.Sprintf("tags['%s'] == '%s'", requiredTagName, requiredTagVal))
			// 	}
			// }

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

			if subscriptions := arrayValue(props, "subscriptionIds", []string{}); len(subscriptions) > 0 {
				queryRequest.Subscriptions = &subscriptions
			}

			if managementgroups := arrayValue(props, "management_group_ids", []string{}); len(managementgroups) > 0 {
				queryRequest.ManagementGroups = &managementgroups
			}

			type returnVal struct {
				resId                string            `pulumi:"id"`
				resName              string            `pulumi:"name"`
				resSubscriptionId    string            `pulumi:"subscriptionId,optional"`
				resResourceGroupName string            `pulumi:"resourceGroupName,optional"`
				resType              string            `pulumi:"type"`
				resLocation          string            `pulumi:"location,optional"`
				resTags              map[string]string `pulumi:"tags,optional"`
			}
			outputs := make([]returnVal, 1)
			outputs[0] = returnVal{
				resId:   "##DUMMY##",
				resType: "##DUMMY##",
				resName: "##DUMMY##",
			}
			result, err = plugin.MarshalProperties(
				resource.NewPropertyMapFromMap(map[string]interface{}{
					"resources": outputs,
				}),
				plugin.MarshalOptions{Label: req.Tok, KeepUnknowns: true, SkipNulls: true},
			)
			if err != nil {
				return nil, err
			}

		}
	case "azure:core/getClientToken:getClientToken":
		token, err := p.authenticator.Token(ctx, nil)
		if err != nil {
			return nil, err
		}
		result, err = plugin.MarshalProperties(
			resource.NewPropertyMapFromMap(map[string]interface{}{"token": token.AccessToken}),
			plugin.MarshalOptions{Label: req.Tok, KeepUnknowns: true, SkipNulls: true},
		)
		if err != nil {
			return nil, err
		}
	default:
		return nil, fmt.Errorf("azureMuxProvider::Invoke: %q not supported", req.Tok)
	}
	return &pulumirpc.InvokeResponse{Return: result}, nil
}

func (p *azureMuxProvider) CheckConfig(ctx context.Context, req *pulumirpc.CheckRequest) (*pulumirpc.CheckResponse, error) {
	logging.V(4).Infof("azureMuxProvider::CheckConfig called with request: %+v", req)

	return &pulumirpc.CheckResponse{}, nil
}

func (p *azureMuxProvider) DiffConfig(ctx context.Context, req *pulumirpc.DiffRequest) (*pulumirpc.DiffResponse, error) {
	logging.V(4).Infof("azureMuxProvider::DiffConfig called with request: %+v", req)

	return &pulumirpc.DiffResponse{}, nil
}

func (p *azureMuxProvider) Configure(ctx context.Context, req *pulumirpc.ConfigureRequest) (*pulumirpc.ConfigureResponse, error) {
	logging.V(4).Infof("azureMuxProvider::Configure called with request: %+v", req)

	varMap := map[string]interface{}{}
	for key, val := range req.GetVariables() {
		varMap[strings.TrimPrefix(key, "azure:config:")] = val
	}
	propMap := resource.NewPropertyMapFromMap(varMap)

	envName := stringValue(propMap, "environment", []string{"ARM_ENVIRONMENT"})
	if envName == "" {
		envName = "public"
	}

	env, err := environments.FromName(envName)
	if err != nil {
		return nil, fmt.Errorf("failed to read Azure environment \"%s\": %v", envName, err)
	}

	auth, err := createAuthenticator(propMap, env, env.ResourceManager)
	if err != nil {
		return nil, err
	}
	p.authenticator = auth

	return &pulumirpc.ConfigureResponse{
		AcceptSecrets:   true,
		SupportsPreview: true,
		AcceptResources: true,
		AcceptOutputs:   true,
	}, nil
}
