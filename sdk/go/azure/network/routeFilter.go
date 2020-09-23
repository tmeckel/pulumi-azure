// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a Route Filter.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure/network"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := network.NewRouteFilter(ctx, "example", &network.RouteFilterArgs{
// 			Location:          pulumi.String("East US"),
// 			ResourceGroupName: pulumi.String("example"),
// 			Rule: &network.RouteFilterRuleArgs{
// 				Access: pulumi.String("Allow"),
// 				Communities: pulumi.StringArray{
// 					pulumi.String("12076:52004"),
// 				},
// 				Name:     pulumi.String("rule"),
// 				RuleType: pulumi.String("Community"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type RouteFilter struct {
	pulumi.CustomResourceState

	// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The Name which should be used for this Route Filter.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A `rules` block as defined below.
	Rule RouteFilterRuleOutput `pulumi:"rule"`
	// A mapping of tags which should be assigned to the Route Filter.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewRouteFilter registers a new resource with the given unique name, arguments, and options.
func NewRouteFilter(ctx *pulumi.Context,
	name string, args *RouteFilterArgs, opts ...pulumi.ResourceOption) (*RouteFilter, error) {
	if args == nil || args.ResourceGroupName == nil {
		return nil, errors.New("missing required argument 'ResourceGroupName'")
	}
	if args == nil {
		args = &RouteFilterArgs{}
	}
	var resource RouteFilter
	err := ctx.RegisterResource("azure:network/routeFilter:RouteFilter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouteFilter gets an existing RouteFilter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouteFilter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteFilterState, opts ...pulumi.ResourceOption) (*RouteFilter, error) {
	var resource RouteFilter
	err := ctx.ReadResource("azure:network/routeFilter:RouteFilter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouteFilter resources.
type routeFilterState struct {
	// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	Location *string `pulumi:"location"`
	// The Name which should be used for this Route Filter.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A `rules` block as defined below.
	Rule *RouteFilterRule `pulumi:"rule"`
	// A mapping of tags which should be assigned to the Route Filter.
	Tags map[string]string `pulumi:"tags"`
}

type RouteFilterState struct {
	// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	Location pulumi.StringPtrInput
	// The Name which should be used for this Route Filter.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A `rules` block as defined below.
	Rule RouteFilterRulePtrInput
	// A mapping of tags which should be assigned to the Route Filter.
	Tags pulumi.StringMapInput
}

func (RouteFilterState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeFilterState)(nil)).Elem()
}

type routeFilterArgs struct {
	// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	Location *string `pulumi:"location"`
	// The Name which should be used for this Route Filter.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A `rules` block as defined below.
	Rule *RouteFilterRule `pulumi:"rule"`
	// A mapping of tags which should be assigned to the Route Filter.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a RouteFilter resource.
type RouteFilterArgs struct {
	// The Azure Region where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	Location pulumi.StringPtrInput
	// The Name which should be used for this Route Filter.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Route Filter should exist. Changing this forces a new Route Filter to be created.
	ResourceGroupName pulumi.StringInput
	// A `rules` block as defined below.
	Rule RouteFilterRulePtrInput
	// A mapping of tags which should be assigned to the Route Filter.
	Tags pulumi.StringMapInput
}

func (RouteFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeFilterArgs)(nil)).Elem()
}