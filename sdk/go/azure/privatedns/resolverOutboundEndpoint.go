// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package privatedns

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Private DNS Resolver Outbound Endpoint.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/network"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/privatedns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("west europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "exampleVirtualNetwork", &network.VirtualNetworkArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.0.0.0/16"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleSubnet, err := network.NewSubnet(ctx, "exampleSubnet", &network.SubnetArgs{
//				ResourceGroupName:  exampleResourceGroup.Name,
//				VirtualNetworkName: exampleVirtualNetwork.Name,
//				AddressPrefixes: pulumi.StringArray{
//					pulumi.String("10.0.0.64/28"),
//				},
//				Delegations: network.SubnetDelegationArray{
//					&network.SubnetDelegationArgs{
//						Name: pulumi.String("Microsoft.Network.dnsResolvers"),
//						ServiceDelegation: &network.SubnetDelegationServiceDelegationArgs{
//							Actions: pulumi.StringArray{
//								pulumi.String("Microsoft.Network/virtualNetworks/subnets/join/action"),
//							},
//							Name: pulumi.String("Microsoft.Network/dnsResolvers"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleResolver, err := privatedns.NewResolver(ctx, "exampleResolver", &privatedns.ResolverArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				VirtualNetworkId:  exampleVirtualNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = privatedns.NewResolverOutboundEndpoint(ctx, "exampleResolverOutboundEndpoint", &privatedns.ResolverOutboundEndpointArgs{
//				PrivateDnsResolverId: exampleResolver.ID(),
//				Location:             exampleResolver.Location,
//				SubnetId:             exampleSubnet.ID(),
//				Tags: pulumi.StringMap{
//					"key": pulumi.String("value"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Private DNS Resolver Outbound Endpoint can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/dnsResolvers/dnsResolver1/outboundEndpoints/outboundEndpoint1
//
// ```
type ResolverOutboundEndpoint struct {
	pulumi.CustomResourceState

	// Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	PrivateDnsResolverId pulumi.StringOutput `pulumi:"privateDnsResolverId"`
	// The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint.
	SubnetId pulumi.StringOutput `pulumi:"subnetId"`
	// A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewResolverOutboundEndpoint registers a new resource with the given unique name, arguments, and options.
func NewResolverOutboundEndpoint(ctx *pulumi.Context,
	name string, args *ResolverOutboundEndpointArgs, opts ...pulumi.ResourceOption) (*ResolverOutboundEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PrivateDnsResolverId == nil {
		return nil, errors.New("invalid value for required argument 'PrivateDnsResolverId'")
	}
	if args.SubnetId == nil {
		return nil, errors.New("invalid value for required argument 'SubnetId'")
	}
	var resource ResolverOutboundEndpoint
	err := ctx.RegisterResource("azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResolverOutboundEndpoint gets an existing ResolverOutboundEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResolverOutboundEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResolverOutboundEndpointState, opts ...pulumi.ResourceOption) (*ResolverOutboundEndpoint, error) {
	var resource ResolverOutboundEndpoint
	err := ctx.ReadResource("azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResolverOutboundEndpoint resources.
type resolverOutboundEndpointState struct {
	// Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	Location *string `pulumi:"location"`
	// Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	Name *string `pulumi:"name"`
	// Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	PrivateDnsResolverId *string `pulumi:"privateDnsResolverId"`
	// The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint.
	SubnetId *string `pulumi:"subnetId"`
	// A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
	Tags map[string]string `pulumi:"tags"`
}

type ResolverOutboundEndpointState struct {
	// Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	Location pulumi.StringPtrInput
	// Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	Name pulumi.StringPtrInput
	// Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	PrivateDnsResolverId pulumi.StringPtrInput
	// The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint.
	SubnetId pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
	Tags pulumi.StringMapInput
}

func (ResolverOutboundEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverOutboundEndpointState)(nil)).Elem()
}

type resolverOutboundEndpointArgs struct {
	// Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	Location *string `pulumi:"location"`
	// Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	Name *string `pulumi:"name"`
	// Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	PrivateDnsResolverId string `pulumi:"privateDnsResolverId"`
	// The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint.
	SubnetId string `pulumi:"subnetId"`
	// A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ResolverOutboundEndpoint resource.
type ResolverOutboundEndpointArgs struct {
	// Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	Location pulumi.StringPtrInput
	// Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	Name pulumi.StringPtrInput
	// Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
	PrivateDnsResolverId pulumi.StringInput
	// The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint.
	SubnetId pulumi.StringInput
	// A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
	Tags pulumi.StringMapInput
}

func (ResolverOutboundEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverOutboundEndpointArgs)(nil)).Elem()
}

type ResolverOutboundEndpointInput interface {
	pulumi.Input

	ToResolverOutboundEndpointOutput() ResolverOutboundEndpointOutput
	ToResolverOutboundEndpointOutputWithContext(ctx context.Context) ResolverOutboundEndpointOutput
}

func (*ResolverOutboundEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverOutboundEndpoint)(nil)).Elem()
}

func (i *ResolverOutboundEndpoint) ToResolverOutboundEndpointOutput() ResolverOutboundEndpointOutput {
	return i.ToResolverOutboundEndpointOutputWithContext(context.Background())
}

func (i *ResolverOutboundEndpoint) ToResolverOutboundEndpointOutputWithContext(ctx context.Context) ResolverOutboundEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverOutboundEndpointOutput)
}

// ResolverOutboundEndpointArrayInput is an input type that accepts ResolverOutboundEndpointArray and ResolverOutboundEndpointArrayOutput values.
// You can construct a concrete instance of `ResolverOutboundEndpointArrayInput` via:
//
//	ResolverOutboundEndpointArray{ ResolverOutboundEndpointArgs{...} }
type ResolverOutboundEndpointArrayInput interface {
	pulumi.Input

	ToResolverOutboundEndpointArrayOutput() ResolverOutboundEndpointArrayOutput
	ToResolverOutboundEndpointArrayOutputWithContext(context.Context) ResolverOutboundEndpointArrayOutput
}

type ResolverOutboundEndpointArray []ResolverOutboundEndpointInput

func (ResolverOutboundEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverOutboundEndpoint)(nil)).Elem()
}

func (i ResolverOutboundEndpointArray) ToResolverOutboundEndpointArrayOutput() ResolverOutboundEndpointArrayOutput {
	return i.ToResolverOutboundEndpointArrayOutputWithContext(context.Background())
}

func (i ResolverOutboundEndpointArray) ToResolverOutboundEndpointArrayOutputWithContext(ctx context.Context) ResolverOutboundEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverOutboundEndpointArrayOutput)
}

// ResolverOutboundEndpointMapInput is an input type that accepts ResolverOutboundEndpointMap and ResolverOutboundEndpointMapOutput values.
// You can construct a concrete instance of `ResolverOutboundEndpointMapInput` via:
//
//	ResolverOutboundEndpointMap{ "key": ResolverOutboundEndpointArgs{...} }
type ResolverOutboundEndpointMapInput interface {
	pulumi.Input

	ToResolverOutboundEndpointMapOutput() ResolverOutboundEndpointMapOutput
	ToResolverOutboundEndpointMapOutputWithContext(context.Context) ResolverOutboundEndpointMapOutput
}

type ResolverOutboundEndpointMap map[string]ResolverOutboundEndpointInput

func (ResolverOutboundEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverOutboundEndpoint)(nil)).Elem()
}

func (i ResolverOutboundEndpointMap) ToResolverOutboundEndpointMapOutput() ResolverOutboundEndpointMapOutput {
	return i.ToResolverOutboundEndpointMapOutputWithContext(context.Background())
}

func (i ResolverOutboundEndpointMap) ToResolverOutboundEndpointMapOutputWithContext(ctx context.Context) ResolverOutboundEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverOutboundEndpointMapOutput)
}

type ResolverOutboundEndpointOutput struct{ *pulumi.OutputState }

func (ResolverOutboundEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResolverOutboundEndpoint)(nil)).Elem()
}

func (o ResolverOutboundEndpointOutput) ToResolverOutboundEndpointOutput() ResolverOutboundEndpointOutput {
	return o
}

func (o ResolverOutboundEndpointOutput) ToResolverOutboundEndpointOutputWithContext(ctx context.Context) ResolverOutboundEndpointOutput {
	return o
}

// Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
func (o ResolverOutboundEndpointOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverOutboundEndpoint) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
func (o ResolverOutboundEndpointOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverOutboundEndpoint) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
func (o ResolverOutboundEndpointOutput) PrivateDnsResolverId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverOutboundEndpoint) pulumi.StringOutput { return v.PrivateDnsResolverId }).(pulumi.StringOutput)
}

// The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint.
func (o ResolverOutboundEndpointOutput) SubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v *ResolverOutboundEndpoint) pulumi.StringOutput { return v.SubnetId }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
func (o ResolverOutboundEndpointOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ResolverOutboundEndpoint) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type ResolverOutboundEndpointArrayOutput struct{ *pulumi.OutputState }

func (ResolverOutboundEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResolverOutboundEndpoint)(nil)).Elem()
}

func (o ResolverOutboundEndpointArrayOutput) ToResolverOutboundEndpointArrayOutput() ResolverOutboundEndpointArrayOutput {
	return o
}

func (o ResolverOutboundEndpointArrayOutput) ToResolverOutboundEndpointArrayOutputWithContext(ctx context.Context) ResolverOutboundEndpointArrayOutput {
	return o
}

func (o ResolverOutboundEndpointArrayOutput) Index(i pulumi.IntInput) ResolverOutboundEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResolverOutboundEndpoint {
		return vs[0].([]*ResolverOutboundEndpoint)[vs[1].(int)]
	}).(ResolverOutboundEndpointOutput)
}

type ResolverOutboundEndpointMapOutput struct{ *pulumi.OutputState }

func (ResolverOutboundEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResolverOutboundEndpoint)(nil)).Elem()
}

func (o ResolverOutboundEndpointMapOutput) ToResolverOutboundEndpointMapOutput() ResolverOutboundEndpointMapOutput {
	return o
}

func (o ResolverOutboundEndpointMapOutput) ToResolverOutboundEndpointMapOutputWithContext(ctx context.Context) ResolverOutboundEndpointMapOutput {
	return o
}

func (o ResolverOutboundEndpointMapOutput) MapIndex(k pulumi.StringInput) ResolverOutboundEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResolverOutboundEndpoint {
		return vs[0].(map[string]*ResolverOutboundEndpoint)[vs[1].(string)]
	}).(ResolverOutboundEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverOutboundEndpointInput)(nil)).Elem(), &ResolverOutboundEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverOutboundEndpointArrayInput)(nil)).Elem(), ResolverOutboundEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverOutboundEndpointMapInput)(nil)).Elem(), ResolverOutboundEndpointMap{})
	pulumi.RegisterOutputType(ResolverOutboundEndpointOutput{})
	pulumi.RegisterOutputType(ResolverOutboundEndpointArrayOutput{})
	pulumi.RegisterOutputType(ResolverOutboundEndpointMapOutput{})
}