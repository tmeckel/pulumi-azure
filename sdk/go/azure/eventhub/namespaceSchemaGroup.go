// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package eventhub

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/eventhub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := core.NewResourceGroup(ctx, "example", &core.ResourceGroupArgs{
//				Location: pulumi.String("East US"),
//			})
//			if err != nil {
//				return err
//			}
//			testEventHubNamespace, err := eventhub.NewEventHubNamespace(ctx, "testEventHubNamespace", &eventhub.EventHubNamespaceArgs{
//				Location:          pulumi.Any(azurerm_resource_group.Test.Location),
//				ResourceGroupName: pulumi.Any(azurerm_resource_group.Test.Name),
//				Sku:               pulumi.String("Standard"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = eventhub.NewNamespaceSchemaGroup(ctx, "testNamespaceSchemaGroup", &eventhub.NamespaceSchemaGroupArgs{
//				NamespaceId:         testEventHubNamespace.ID(),
//				SchemaCompatibility: pulumi.String("Forward"),
//				SchemaType:          pulumi.String("Avro"),
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
// Schema Group for a EventHub Namespace can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventHub/namespaces/namespace1/schemagroups/group1
//
// ```
type NamespaceSchemaGroup struct {
	pulumi.CustomResourceState

	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the EventHub Namespace. Changing this forces a new resource to be created.
	NamespaceId pulumi.StringOutput `pulumi:"namespaceId"`
	// The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
	SchemaCompatibility pulumi.StringOutput `pulumi:"schemaCompatibility"`
	// The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
	SchemaType pulumi.StringOutput `pulumi:"schemaType"`
}

// NewNamespaceSchemaGroup registers a new resource with the given unique name, arguments, and options.
func NewNamespaceSchemaGroup(ctx *pulumi.Context,
	name string, args *NamespaceSchemaGroupArgs, opts ...pulumi.ResourceOption) (*NamespaceSchemaGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NamespaceId == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceId'")
	}
	if args.SchemaCompatibility == nil {
		return nil, errors.New("invalid value for required argument 'SchemaCompatibility'")
	}
	if args.SchemaType == nil {
		return nil, errors.New("invalid value for required argument 'SchemaType'")
	}
	var resource NamespaceSchemaGroup
	err := ctx.RegisterResource("azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNamespaceSchemaGroup gets an existing NamespaceSchemaGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNamespaceSchemaGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NamespaceSchemaGroupState, opts ...pulumi.ResourceOption) (*NamespaceSchemaGroup, error) {
	var resource NamespaceSchemaGroup
	err := ctx.ReadResource("azure:eventhub/namespaceSchemaGroup:NamespaceSchemaGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NamespaceSchemaGroup resources.
type namespaceSchemaGroupState struct {
	Name *string `pulumi:"name"`
	// The ID of the EventHub Namespace. Changing this forces a new resource to be created.
	NamespaceId *string `pulumi:"namespaceId"`
	// The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
	SchemaCompatibility *string `pulumi:"schemaCompatibility"`
	// The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
	SchemaType *string `pulumi:"schemaType"`
}

type NamespaceSchemaGroupState struct {
	Name pulumi.StringPtrInput
	// The ID of the EventHub Namespace. Changing this forces a new resource to be created.
	NamespaceId pulumi.StringPtrInput
	// The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
	SchemaCompatibility pulumi.StringPtrInput
	// The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
	SchemaType pulumi.StringPtrInput
}

func (NamespaceSchemaGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceSchemaGroupState)(nil)).Elem()
}

type namespaceSchemaGroupArgs struct {
	Name *string `pulumi:"name"`
	// The ID of the EventHub Namespace. Changing this forces a new resource to be created.
	NamespaceId string `pulumi:"namespaceId"`
	// The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
	SchemaCompatibility string `pulumi:"schemaCompatibility"`
	// The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
	SchemaType string `pulumi:"schemaType"`
}

// The set of arguments for constructing a NamespaceSchemaGroup resource.
type NamespaceSchemaGroupArgs struct {
	Name pulumi.StringPtrInput
	// The ID of the EventHub Namespace. Changing this forces a new resource to be created.
	NamespaceId pulumi.StringInput
	// The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
	SchemaCompatibility pulumi.StringInput
	// The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
	SchemaType pulumi.StringInput
}

func (NamespaceSchemaGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*namespaceSchemaGroupArgs)(nil)).Elem()
}

type NamespaceSchemaGroupInput interface {
	pulumi.Input

	ToNamespaceSchemaGroupOutput() NamespaceSchemaGroupOutput
	ToNamespaceSchemaGroupOutputWithContext(ctx context.Context) NamespaceSchemaGroupOutput
}

func (*NamespaceSchemaGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**NamespaceSchemaGroup)(nil)).Elem()
}

func (i *NamespaceSchemaGroup) ToNamespaceSchemaGroupOutput() NamespaceSchemaGroupOutput {
	return i.ToNamespaceSchemaGroupOutputWithContext(context.Background())
}

func (i *NamespaceSchemaGroup) ToNamespaceSchemaGroupOutputWithContext(ctx context.Context) NamespaceSchemaGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceSchemaGroupOutput)
}

// NamespaceSchemaGroupArrayInput is an input type that accepts NamespaceSchemaGroupArray and NamespaceSchemaGroupArrayOutput values.
// You can construct a concrete instance of `NamespaceSchemaGroupArrayInput` via:
//
//	NamespaceSchemaGroupArray{ NamespaceSchemaGroupArgs{...} }
type NamespaceSchemaGroupArrayInput interface {
	pulumi.Input

	ToNamespaceSchemaGroupArrayOutput() NamespaceSchemaGroupArrayOutput
	ToNamespaceSchemaGroupArrayOutputWithContext(context.Context) NamespaceSchemaGroupArrayOutput
}

type NamespaceSchemaGroupArray []NamespaceSchemaGroupInput

func (NamespaceSchemaGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NamespaceSchemaGroup)(nil)).Elem()
}

func (i NamespaceSchemaGroupArray) ToNamespaceSchemaGroupArrayOutput() NamespaceSchemaGroupArrayOutput {
	return i.ToNamespaceSchemaGroupArrayOutputWithContext(context.Background())
}

func (i NamespaceSchemaGroupArray) ToNamespaceSchemaGroupArrayOutputWithContext(ctx context.Context) NamespaceSchemaGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceSchemaGroupArrayOutput)
}

// NamespaceSchemaGroupMapInput is an input type that accepts NamespaceSchemaGroupMap and NamespaceSchemaGroupMapOutput values.
// You can construct a concrete instance of `NamespaceSchemaGroupMapInput` via:
//
//	NamespaceSchemaGroupMap{ "key": NamespaceSchemaGroupArgs{...} }
type NamespaceSchemaGroupMapInput interface {
	pulumi.Input

	ToNamespaceSchemaGroupMapOutput() NamespaceSchemaGroupMapOutput
	ToNamespaceSchemaGroupMapOutputWithContext(context.Context) NamespaceSchemaGroupMapOutput
}

type NamespaceSchemaGroupMap map[string]NamespaceSchemaGroupInput

func (NamespaceSchemaGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NamespaceSchemaGroup)(nil)).Elem()
}

func (i NamespaceSchemaGroupMap) ToNamespaceSchemaGroupMapOutput() NamespaceSchemaGroupMapOutput {
	return i.ToNamespaceSchemaGroupMapOutputWithContext(context.Background())
}

func (i NamespaceSchemaGroupMap) ToNamespaceSchemaGroupMapOutputWithContext(ctx context.Context) NamespaceSchemaGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NamespaceSchemaGroupMapOutput)
}

type NamespaceSchemaGroupOutput struct{ *pulumi.OutputState }

func (NamespaceSchemaGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NamespaceSchemaGroup)(nil)).Elem()
}

func (o NamespaceSchemaGroupOutput) ToNamespaceSchemaGroupOutput() NamespaceSchemaGroupOutput {
	return o
}

func (o NamespaceSchemaGroupOutput) ToNamespaceSchemaGroupOutputWithContext(ctx context.Context) NamespaceSchemaGroupOutput {
	return o
}

func (o NamespaceSchemaGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceSchemaGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the EventHub Namespace. Changing this forces a new resource to be created.
func (o NamespaceSchemaGroupOutput) NamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceSchemaGroup) pulumi.StringOutput { return v.NamespaceId }).(pulumi.StringOutput)
}

// The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
func (o NamespaceSchemaGroupOutput) SchemaCompatibility() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceSchemaGroup) pulumi.StringOutput { return v.SchemaCompatibility }).(pulumi.StringOutput)
}

// The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
func (o NamespaceSchemaGroupOutput) SchemaType() pulumi.StringOutput {
	return o.ApplyT(func(v *NamespaceSchemaGroup) pulumi.StringOutput { return v.SchemaType }).(pulumi.StringOutput)
}

type NamespaceSchemaGroupArrayOutput struct{ *pulumi.OutputState }

func (NamespaceSchemaGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NamespaceSchemaGroup)(nil)).Elem()
}

func (o NamespaceSchemaGroupArrayOutput) ToNamespaceSchemaGroupArrayOutput() NamespaceSchemaGroupArrayOutput {
	return o
}

func (o NamespaceSchemaGroupArrayOutput) ToNamespaceSchemaGroupArrayOutputWithContext(ctx context.Context) NamespaceSchemaGroupArrayOutput {
	return o
}

func (o NamespaceSchemaGroupArrayOutput) Index(i pulumi.IntInput) NamespaceSchemaGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NamespaceSchemaGroup {
		return vs[0].([]*NamespaceSchemaGroup)[vs[1].(int)]
	}).(NamespaceSchemaGroupOutput)
}

type NamespaceSchemaGroupMapOutput struct{ *pulumi.OutputState }

func (NamespaceSchemaGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NamespaceSchemaGroup)(nil)).Elem()
}

func (o NamespaceSchemaGroupMapOutput) ToNamespaceSchemaGroupMapOutput() NamespaceSchemaGroupMapOutput {
	return o
}

func (o NamespaceSchemaGroupMapOutput) ToNamespaceSchemaGroupMapOutputWithContext(ctx context.Context) NamespaceSchemaGroupMapOutput {
	return o
}

func (o NamespaceSchemaGroupMapOutput) MapIndex(k pulumi.StringInput) NamespaceSchemaGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NamespaceSchemaGroup {
		return vs[0].(map[string]*NamespaceSchemaGroup)[vs[1].(string)]
	}).(NamespaceSchemaGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceSchemaGroupInput)(nil)).Elem(), &NamespaceSchemaGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceSchemaGroupArrayInput)(nil)).Elem(), NamespaceSchemaGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NamespaceSchemaGroupMapInput)(nil)).Elem(), NamespaceSchemaGroupMap{})
	pulumi.RegisterOutputType(NamespaceSchemaGroupOutput{})
	pulumi.RegisterOutputType(NamespaceSchemaGroupArrayOutput{})
	pulumi.RegisterOutputType(NamespaceSchemaGroupMapOutput{})
}