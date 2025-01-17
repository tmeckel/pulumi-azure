// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package netapp

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Application Volume Groups can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:netapp/volumeGroupSapHana:VolumeGroupSapHana example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mytest-rg/providers/Microsoft.NetApp/netAppAccounts/netapp-account-test/volumeGroups/netapp-volumegroup-test
//
// ```
type VolumeGroupSapHana struct {
	pulumi.CustomResourceState

	// Name of the account where the application volume group belong to. Changing this forces a new Application Volume Group to be created and data will be lost.
	AccountName pulumi.StringOutput `pulumi:"accountName"`
	// The SAP System ID, maximum 3 characters, e.g. `SH9`. Changing this forces a new Application Volume Group to be created and data will be lost.
	ApplicationIdentifier pulumi.StringOutput `pulumi:"applicationIdentifier"`
	// Volume group description. Changing this forces a new Application Volume Group to be created and data will be lost.
	GroupDescription pulumi.StringOutput `pulumi:"groupDescription"`
	// The Azure Region where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name which should be used for this Application Volume Group. Changing this forces a new Application Volume Group to be created and data will be lost.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// One or more `volume` blocks as defined below.
	Volumes VolumeGroupSapHanaVolumeArrayOutput `pulumi:"volumes"`
}

// NewVolumeGroupSapHana registers a new resource with the given unique name, arguments, and options.
func NewVolumeGroupSapHana(ctx *pulumi.Context,
	name string, args *VolumeGroupSapHanaArgs, opts ...pulumi.ResourceOption) (*VolumeGroupSapHana, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountName == nil {
		return nil, errors.New("invalid value for required argument 'AccountName'")
	}
	if args.ApplicationIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationIdentifier'")
	}
	if args.GroupDescription == nil {
		return nil, errors.New("invalid value for required argument 'GroupDescription'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.Volumes == nil {
		return nil, errors.New("invalid value for required argument 'Volumes'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VolumeGroupSapHana
	err := ctx.RegisterResource("azure:netapp/volumeGroupSapHana:VolumeGroupSapHana", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVolumeGroupSapHana gets an existing VolumeGroupSapHana resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVolumeGroupSapHana(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VolumeGroupSapHanaState, opts ...pulumi.ResourceOption) (*VolumeGroupSapHana, error) {
	var resource VolumeGroupSapHana
	err := ctx.ReadResource("azure:netapp/volumeGroupSapHana:VolumeGroupSapHana", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VolumeGroupSapHana resources.
type volumeGroupSapHanaState struct {
	// Name of the account where the application volume group belong to. Changing this forces a new Application Volume Group to be created and data will be lost.
	AccountName *string `pulumi:"accountName"`
	// The SAP System ID, maximum 3 characters, e.g. `SH9`. Changing this forces a new Application Volume Group to be created and data will be lost.
	ApplicationIdentifier *string `pulumi:"applicationIdentifier"`
	// Volume group description. Changing this forces a new Application Volume Group to be created and data will be lost.
	GroupDescription *string `pulumi:"groupDescription"`
	// The Azure Region where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
	Location *string `pulumi:"location"`
	// The name which should be used for this Application Volume Group. Changing this forces a new Application Volume Group to be created and data will be lost.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// One or more `volume` blocks as defined below.
	Volumes []VolumeGroupSapHanaVolume `pulumi:"volumes"`
}

type VolumeGroupSapHanaState struct {
	// Name of the account where the application volume group belong to. Changing this forces a new Application Volume Group to be created and data will be lost.
	AccountName pulumi.StringPtrInput
	// The SAP System ID, maximum 3 characters, e.g. `SH9`. Changing this forces a new Application Volume Group to be created and data will be lost.
	ApplicationIdentifier pulumi.StringPtrInput
	// Volume group description. Changing this forces a new Application Volume Group to be created and data will be lost.
	GroupDescription pulumi.StringPtrInput
	// The Azure Region where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
	Location pulumi.StringPtrInput
	// The name which should be used for this Application Volume Group. Changing this forces a new Application Volume Group to be created and data will be lost.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
	ResourceGroupName pulumi.StringPtrInput
	// One or more `volume` blocks as defined below.
	Volumes VolumeGroupSapHanaVolumeArrayInput
}

func (VolumeGroupSapHanaState) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeGroupSapHanaState)(nil)).Elem()
}

type volumeGroupSapHanaArgs struct {
	// Name of the account where the application volume group belong to. Changing this forces a new Application Volume Group to be created and data will be lost.
	AccountName string `pulumi:"accountName"`
	// The SAP System ID, maximum 3 characters, e.g. `SH9`. Changing this forces a new Application Volume Group to be created and data will be lost.
	ApplicationIdentifier string `pulumi:"applicationIdentifier"`
	// Volume group description. Changing this forces a new Application Volume Group to be created and data will be lost.
	GroupDescription string `pulumi:"groupDescription"`
	// The Azure Region where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
	Location *string `pulumi:"location"`
	// The name which should be used for this Application Volume Group. Changing this forces a new Application Volume Group to be created and data will be lost.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// One or more `volume` blocks as defined below.
	Volumes []VolumeGroupSapHanaVolume `pulumi:"volumes"`
}

// The set of arguments for constructing a VolumeGroupSapHana resource.
type VolumeGroupSapHanaArgs struct {
	// Name of the account where the application volume group belong to. Changing this forces a new Application Volume Group to be created and data will be lost.
	AccountName pulumi.StringInput
	// The SAP System ID, maximum 3 characters, e.g. `SH9`. Changing this forces a new Application Volume Group to be created and data will be lost.
	ApplicationIdentifier pulumi.StringInput
	// Volume group description. Changing this forces a new Application Volume Group to be created and data will be lost.
	GroupDescription pulumi.StringInput
	// The Azure Region where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
	Location pulumi.StringPtrInput
	// The name which should be used for this Application Volume Group. Changing this forces a new Application Volume Group to be created and data will be lost.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
	ResourceGroupName pulumi.StringInput
	// One or more `volume` blocks as defined below.
	Volumes VolumeGroupSapHanaVolumeArrayInput
}

func (VolumeGroupSapHanaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeGroupSapHanaArgs)(nil)).Elem()
}

type VolumeGroupSapHanaInput interface {
	pulumi.Input

	ToVolumeGroupSapHanaOutput() VolumeGroupSapHanaOutput
	ToVolumeGroupSapHanaOutputWithContext(ctx context.Context) VolumeGroupSapHanaOutput
}

func (*VolumeGroupSapHana) ElementType() reflect.Type {
	return reflect.TypeOf((**VolumeGroupSapHana)(nil)).Elem()
}

func (i *VolumeGroupSapHana) ToVolumeGroupSapHanaOutput() VolumeGroupSapHanaOutput {
	return i.ToVolumeGroupSapHanaOutputWithContext(context.Background())
}

func (i *VolumeGroupSapHana) ToVolumeGroupSapHanaOutputWithContext(ctx context.Context) VolumeGroupSapHanaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeGroupSapHanaOutput)
}

// VolumeGroupSapHanaArrayInput is an input type that accepts VolumeGroupSapHanaArray and VolumeGroupSapHanaArrayOutput values.
// You can construct a concrete instance of `VolumeGroupSapHanaArrayInput` via:
//
//	VolumeGroupSapHanaArray{ VolumeGroupSapHanaArgs{...} }
type VolumeGroupSapHanaArrayInput interface {
	pulumi.Input

	ToVolumeGroupSapHanaArrayOutput() VolumeGroupSapHanaArrayOutput
	ToVolumeGroupSapHanaArrayOutputWithContext(context.Context) VolumeGroupSapHanaArrayOutput
}

type VolumeGroupSapHanaArray []VolumeGroupSapHanaInput

func (VolumeGroupSapHanaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VolumeGroupSapHana)(nil)).Elem()
}

func (i VolumeGroupSapHanaArray) ToVolumeGroupSapHanaArrayOutput() VolumeGroupSapHanaArrayOutput {
	return i.ToVolumeGroupSapHanaArrayOutputWithContext(context.Background())
}

func (i VolumeGroupSapHanaArray) ToVolumeGroupSapHanaArrayOutputWithContext(ctx context.Context) VolumeGroupSapHanaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeGroupSapHanaArrayOutput)
}

// VolumeGroupSapHanaMapInput is an input type that accepts VolumeGroupSapHanaMap and VolumeGroupSapHanaMapOutput values.
// You can construct a concrete instance of `VolumeGroupSapHanaMapInput` via:
//
//	VolumeGroupSapHanaMap{ "key": VolumeGroupSapHanaArgs{...} }
type VolumeGroupSapHanaMapInput interface {
	pulumi.Input

	ToVolumeGroupSapHanaMapOutput() VolumeGroupSapHanaMapOutput
	ToVolumeGroupSapHanaMapOutputWithContext(context.Context) VolumeGroupSapHanaMapOutput
}

type VolumeGroupSapHanaMap map[string]VolumeGroupSapHanaInput

func (VolumeGroupSapHanaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VolumeGroupSapHana)(nil)).Elem()
}

func (i VolumeGroupSapHanaMap) ToVolumeGroupSapHanaMapOutput() VolumeGroupSapHanaMapOutput {
	return i.ToVolumeGroupSapHanaMapOutputWithContext(context.Background())
}

func (i VolumeGroupSapHanaMap) ToVolumeGroupSapHanaMapOutputWithContext(ctx context.Context) VolumeGroupSapHanaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeGroupSapHanaMapOutput)
}

type VolumeGroupSapHanaOutput struct{ *pulumi.OutputState }

func (VolumeGroupSapHanaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VolumeGroupSapHana)(nil)).Elem()
}

func (o VolumeGroupSapHanaOutput) ToVolumeGroupSapHanaOutput() VolumeGroupSapHanaOutput {
	return o
}

func (o VolumeGroupSapHanaOutput) ToVolumeGroupSapHanaOutputWithContext(ctx context.Context) VolumeGroupSapHanaOutput {
	return o
}

// Name of the account where the application volume group belong to. Changing this forces a new Application Volume Group to be created and data will be lost.
func (o VolumeGroupSapHanaOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *VolumeGroupSapHana) pulumi.StringOutput { return v.AccountName }).(pulumi.StringOutput)
}

// The SAP System ID, maximum 3 characters, e.g. `SH9`. Changing this forces a new Application Volume Group to be created and data will be lost.
func (o VolumeGroupSapHanaOutput) ApplicationIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *VolumeGroupSapHana) pulumi.StringOutput { return v.ApplicationIdentifier }).(pulumi.StringOutput)
}

// Volume group description. Changing this forces a new Application Volume Group to be created and data will be lost.
func (o VolumeGroupSapHanaOutput) GroupDescription() pulumi.StringOutput {
	return o.ApplyT(func(v *VolumeGroupSapHana) pulumi.StringOutput { return v.GroupDescription }).(pulumi.StringOutput)
}

// The Azure Region where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
func (o VolumeGroupSapHanaOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *VolumeGroupSapHana) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name which should be used for this Application Volume Group. Changing this forces a new Application Volume Group to be created and data will be lost.
func (o VolumeGroupSapHanaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VolumeGroupSapHana) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Application Volume Group should exist. Changing this forces a new Application Volume Group to be created and data will be lost.
func (o VolumeGroupSapHanaOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *VolumeGroupSapHana) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// One or more `volume` blocks as defined below.
func (o VolumeGroupSapHanaOutput) Volumes() VolumeGroupSapHanaVolumeArrayOutput {
	return o.ApplyT(func(v *VolumeGroupSapHana) VolumeGroupSapHanaVolumeArrayOutput { return v.Volumes }).(VolumeGroupSapHanaVolumeArrayOutput)
}

type VolumeGroupSapHanaArrayOutput struct{ *pulumi.OutputState }

func (VolumeGroupSapHanaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VolumeGroupSapHana)(nil)).Elem()
}

func (o VolumeGroupSapHanaArrayOutput) ToVolumeGroupSapHanaArrayOutput() VolumeGroupSapHanaArrayOutput {
	return o
}

func (o VolumeGroupSapHanaArrayOutput) ToVolumeGroupSapHanaArrayOutputWithContext(ctx context.Context) VolumeGroupSapHanaArrayOutput {
	return o
}

func (o VolumeGroupSapHanaArrayOutput) Index(i pulumi.IntInput) VolumeGroupSapHanaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VolumeGroupSapHana {
		return vs[0].([]*VolumeGroupSapHana)[vs[1].(int)]
	}).(VolumeGroupSapHanaOutput)
}

type VolumeGroupSapHanaMapOutput struct{ *pulumi.OutputState }

func (VolumeGroupSapHanaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VolumeGroupSapHana)(nil)).Elem()
}

func (o VolumeGroupSapHanaMapOutput) ToVolumeGroupSapHanaMapOutput() VolumeGroupSapHanaMapOutput {
	return o
}

func (o VolumeGroupSapHanaMapOutput) ToVolumeGroupSapHanaMapOutputWithContext(ctx context.Context) VolumeGroupSapHanaMapOutput {
	return o
}

func (o VolumeGroupSapHanaMapOutput) MapIndex(k pulumi.StringInput) VolumeGroupSapHanaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VolumeGroupSapHana {
		return vs[0].(map[string]*VolumeGroupSapHana)[vs[1].(string)]
	}).(VolumeGroupSapHanaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeGroupSapHanaInput)(nil)).Elem(), &VolumeGroupSapHana{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeGroupSapHanaArrayInput)(nil)).Elem(), VolumeGroupSapHanaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VolumeGroupSapHanaMapInput)(nil)).Elem(), VolumeGroupSapHanaMap{})
	pulumi.RegisterOutputType(VolumeGroupSapHanaOutput{})
	pulumi.RegisterOutputType(VolumeGroupSapHanaArrayOutput{})
	pulumi.RegisterOutputType(VolumeGroupSapHanaMapOutput{})
}
