// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package paloalto

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type VirtualNetworkAppliance struct {
	pulumi.CustomResourceState

	Name         pulumi.StringOutput `pulumi:"name"`
	VirtualHubId pulumi.StringOutput `pulumi:"virtualHubId"`
}

// NewVirtualNetworkAppliance registers a new resource with the given unique name, arguments, and options.
func NewVirtualNetworkAppliance(ctx *pulumi.Context,
	name string, args *VirtualNetworkApplianceArgs, opts ...pulumi.ResourceOption) (*VirtualNetworkAppliance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VirtualHubId == nil {
		return nil, errors.New("invalid value for required argument 'VirtualHubId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VirtualNetworkAppliance
	err := ctx.RegisterResource("azure:paloalto/virtualNetworkAppliance:VirtualNetworkAppliance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualNetworkAppliance gets an existing VirtualNetworkAppliance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualNetworkAppliance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualNetworkApplianceState, opts ...pulumi.ResourceOption) (*VirtualNetworkAppliance, error) {
	var resource VirtualNetworkAppliance
	err := ctx.ReadResource("azure:paloalto/virtualNetworkAppliance:VirtualNetworkAppliance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualNetworkAppliance resources.
type virtualNetworkApplianceState struct {
	Name         *string `pulumi:"name"`
	VirtualHubId *string `pulumi:"virtualHubId"`
}

type VirtualNetworkApplianceState struct {
	Name         pulumi.StringPtrInput
	VirtualHubId pulumi.StringPtrInput
}

func (VirtualNetworkApplianceState) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualNetworkApplianceState)(nil)).Elem()
}

type virtualNetworkApplianceArgs struct {
	Name         *string `pulumi:"name"`
	VirtualHubId string  `pulumi:"virtualHubId"`
}

// The set of arguments for constructing a VirtualNetworkAppliance resource.
type VirtualNetworkApplianceArgs struct {
	Name         pulumi.StringPtrInput
	VirtualHubId pulumi.StringInput
}

func (VirtualNetworkApplianceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualNetworkApplianceArgs)(nil)).Elem()
}

type VirtualNetworkApplianceInput interface {
	pulumi.Input

	ToVirtualNetworkApplianceOutput() VirtualNetworkApplianceOutput
	ToVirtualNetworkApplianceOutputWithContext(ctx context.Context) VirtualNetworkApplianceOutput
}

func (*VirtualNetworkAppliance) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualNetworkAppliance)(nil)).Elem()
}

func (i *VirtualNetworkAppliance) ToVirtualNetworkApplianceOutput() VirtualNetworkApplianceOutput {
	return i.ToVirtualNetworkApplianceOutputWithContext(context.Background())
}

func (i *VirtualNetworkAppliance) ToVirtualNetworkApplianceOutputWithContext(ctx context.Context) VirtualNetworkApplianceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkApplianceOutput)
}

// VirtualNetworkApplianceArrayInput is an input type that accepts VirtualNetworkApplianceArray and VirtualNetworkApplianceArrayOutput values.
// You can construct a concrete instance of `VirtualNetworkApplianceArrayInput` via:
//
//	VirtualNetworkApplianceArray{ VirtualNetworkApplianceArgs{...} }
type VirtualNetworkApplianceArrayInput interface {
	pulumi.Input

	ToVirtualNetworkApplianceArrayOutput() VirtualNetworkApplianceArrayOutput
	ToVirtualNetworkApplianceArrayOutputWithContext(context.Context) VirtualNetworkApplianceArrayOutput
}

type VirtualNetworkApplianceArray []VirtualNetworkApplianceInput

func (VirtualNetworkApplianceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualNetworkAppliance)(nil)).Elem()
}

func (i VirtualNetworkApplianceArray) ToVirtualNetworkApplianceArrayOutput() VirtualNetworkApplianceArrayOutput {
	return i.ToVirtualNetworkApplianceArrayOutputWithContext(context.Background())
}

func (i VirtualNetworkApplianceArray) ToVirtualNetworkApplianceArrayOutputWithContext(ctx context.Context) VirtualNetworkApplianceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkApplianceArrayOutput)
}

// VirtualNetworkApplianceMapInput is an input type that accepts VirtualNetworkApplianceMap and VirtualNetworkApplianceMapOutput values.
// You can construct a concrete instance of `VirtualNetworkApplianceMapInput` via:
//
//	VirtualNetworkApplianceMap{ "key": VirtualNetworkApplianceArgs{...} }
type VirtualNetworkApplianceMapInput interface {
	pulumi.Input

	ToVirtualNetworkApplianceMapOutput() VirtualNetworkApplianceMapOutput
	ToVirtualNetworkApplianceMapOutputWithContext(context.Context) VirtualNetworkApplianceMapOutput
}

type VirtualNetworkApplianceMap map[string]VirtualNetworkApplianceInput

func (VirtualNetworkApplianceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualNetworkAppliance)(nil)).Elem()
}

func (i VirtualNetworkApplianceMap) ToVirtualNetworkApplianceMapOutput() VirtualNetworkApplianceMapOutput {
	return i.ToVirtualNetworkApplianceMapOutputWithContext(context.Background())
}

func (i VirtualNetworkApplianceMap) ToVirtualNetworkApplianceMapOutputWithContext(ctx context.Context) VirtualNetworkApplianceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualNetworkApplianceMapOutput)
}

type VirtualNetworkApplianceOutput struct{ *pulumi.OutputState }

func (VirtualNetworkApplianceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualNetworkAppliance)(nil)).Elem()
}

func (o VirtualNetworkApplianceOutput) ToVirtualNetworkApplianceOutput() VirtualNetworkApplianceOutput {
	return o
}

func (o VirtualNetworkApplianceOutput) ToVirtualNetworkApplianceOutputWithContext(ctx context.Context) VirtualNetworkApplianceOutput {
	return o
}

func (o VirtualNetworkApplianceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkAppliance) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o VirtualNetworkApplianceOutput) VirtualHubId() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualNetworkAppliance) pulumi.StringOutput { return v.VirtualHubId }).(pulumi.StringOutput)
}

type VirtualNetworkApplianceArrayOutput struct{ *pulumi.OutputState }

func (VirtualNetworkApplianceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualNetworkAppliance)(nil)).Elem()
}

func (o VirtualNetworkApplianceArrayOutput) ToVirtualNetworkApplianceArrayOutput() VirtualNetworkApplianceArrayOutput {
	return o
}

func (o VirtualNetworkApplianceArrayOutput) ToVirtualNetworkApplianceArrayOutputWithContext(ctx context.Context) VirtualNetworkApplianceArrayOutput {
	return o
}

func (o VirtualNetworkApplianceArrayOutput) Index(i pulumi.IntInput) VirtualNetworkApplianceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualNetworkAppliance {
		return vs[0].([]*VirtualNetworkAppliance)[vs[1].(int)]
	}).(VirtualNetworkApplianceOutput)
}

type VirtualNetworkApplianceMapOutput struct{ *pulumi.OutputState }

func (VirtualNetworkApplianceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualNetworkAppliance)(nil)).Elem()
}

func (o VirtualNetworkApplianceMapOutput) ToVirtualNetworkApplianceMapOutput() VirtualNetworkApplianceMapOutput {
	return o
}

func (o VirtualNetworkApplianceMapOutput) ToVirtualNetworkApplianceMapOutputWithContext(ctx context.Context) VirtualNetworkApplianceMapOutput {
	return o
}

func (o VirtualNetworkApplianceMapOutput) MapIndex(k pulumi.StringInput) VirtualNetworkApplianceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualNetworkAppliance {
		return vs[0].(map[string]*VirtualNetworkAppliance)[vs[1].(string)]
	}).(VirtualNetworkApplianceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkApplianceInput)(nil)).Elem(), &VirtualNetworkAppliance{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkApplianceArrayInput)(nil)).Elem(), VirtualNetworkApplianceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualNetworkApplianceMapInput)(nil)).Elem(), VirtualNetworkApplianceMap{})
	pulumi.RegisterOutputType(VirtualNetworkApplianceOutput{})
	pulumi.RegisterOutputType(VirtualNetworkApplianceArrayOutput{})
	pulumi.RegisterOutputType(VirtualNetworkApplianceMapOutput{})
}