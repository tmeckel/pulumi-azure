// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package apimanagement

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Global Schema within an API Management Service.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"io/ioutil"
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/apimanagement"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := ioutil.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleService, err := apimanagement.NewService(ctx, "exampleService", &apimanagement.ServiceArgs{
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				PublisherName:     pulumi.String("pub1"),
//				PublisherEmail:    pulumi.String("pub1@email.com"),
//				SkuName:           pulumi.String("Consumption_0"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = apimanagement.NewGlobalSchema(ctx, "exampleGlobalSchema", &apimanagement.GlobalSchemaArgs{
//				SchemaId:          pulumi.String("example-schema1"),
//				ApiManagementName: exampleService.Name,
//				ResourceGroupName: exampleResourceGroup.Name,
//				Type:              pulumi.String("xml"),
//				Value:             readFileOrPanic("api_management_api_schema.xml"),
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
// API Management API Schema's can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:apimanagement/globalSchema:GlobalSchema example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ApiManagement/service/instance1/schemas/schema1
//
// ```
type GlobalSchema struct {
	pulumi.CustomResourceState

	// The Name of the API Management Service where the API exists. Changing this forces a
	// new resource to be created.
	ApiManagementName pulumi.StringOutput `pulumi:"apiManagementName"`
	// The description of the schema.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The Name of the Resource Group in which the API Management Service exists. Changing
	// this forces a new resource to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A unique identifier for this Schema. Changing this forces a new resource to be created.
	SchemaId pulumi.StringOutput `pulumi:"schemaId"`
	// The content type of the Schema. Possible values are `xml` and `json`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The string defining the document representing the Schema.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewGlobalSchema registers a new resource with the given unique name, arguments, and options.
func NewGlobalSchema(ctx *pulumi.Context,
	name string, args *GlobalSchemaArgs, opts ...pulumi.ResourceOption) (*GlobalSchema, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiManagementName == nil {
		return nil, errors.New("invalid value for required argument 'ApiManagementName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.SchemaId == nil {
		return nil, errors.New("invalid value for required argument 'SchemaId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	var resource GlobalSchema
	err := ctx.RegisterResource("azure:apimanagement/globalSchema:GlobalSchema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGlobalSchema gets an existing GlobalSchema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGlobalSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GlobalSchemaState, opts ...pulumi.ResourceOption) (*GlobalSchema, error) {
	var resource GlobalSchema
	err := ctx.ReadResource("azure:apimanagement/globalSchema:GlobalSchema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GlobalSchema resources.
type globalSchemaState struct {
	// The Name of the API Management Service where the API exists. Changing this forces a
	// new resource to be created.
	ApiManagementName *string `pulumi:"apiManagementName"`
	// The description of the schema.
	Description *string `pulumi:"description"`
	// The Name of the Resource Group in which the API Management Service exists. Changing
	// this forces a new resource to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A unique identifier for this Schema. Changing this forces a new resource to be created.
	SchemaId *string `pulumi:"schemaId"`
	// The content type of the Schema. Possible values are `xml` and `json`.
	Type *string `pulumi:"type"`
	// The string defining the document representing the Schema.
	Value *string `pulumi:"value"`
}

type GlobalSchemaState struct {
	// The Name of the API Management Service where the API exists. Changing this forces a
	// new resource to be created.
	ApiManagementName pulumi.StringPtrInput
	// The description of the schema.
	Description pulumi.StringPtrInput
	// The Name of the Resource Group in which the API Management Service exists. Changing
	// this forces a new resource to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A unique identifier for this Schema. Changing this forces a new resource to be created.
	SchemaId pulumi.StringPtrInput
	// The content type of the Schema. Possible values are `xml` and `json`.
	Type pulumi.StringPtrInput
	// The string defining the document representing the Schema.
	Value pulumi.StringPtrInput
}

func (GlobalSchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*globalSchemaState)(nil)).Elem()
}

type globalSchemaArgs struct {
	// The Name of the API Management Service where the API exists. Changing this forces a
	// new resource to be created.
	ApiManagementName string `pulumi:"apiManagementName"`
	// The description of the schema.
	Description *string `pulumi:"description"`
	// The Name of the Resource Group in which the API Management Service exists. Changing
	// this forces a new resource to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A unique identifier for this Schema. Changing this forces a new resource to be created.
	SchemaId string `pulumi:"schemaId"`
	// The content type of the Schema. Possible values are `xml` and `json`.
	Type string `pulumi:"type"`
	// The string defining the document representing the Schema.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a GlobalSchema resource.
type GlobalSchemaArgs struct {
	// The Name of the API Management Service where the API exists. Changing this forces a
	// new resource to be created.
	ApiManagementName pulumi.StringInput
	// The description of the schema.
	Description pulumi.StringPtrInput
	// The Name of the Resource Group in which the API Management Service exists. Changing
	// this forces a new resource to be created.
	ResourceGroupName pulumi.StringInput
	// A unique identifier for this Schema. Changing this forces a new resource to be created.
	SchemaId pulumi.StringInput
	// The content type of the Schema. Possible values are `xml` and `json`.
	Type pulumi.StringInput
	// The string defining the document representing the Schema.
	Value pulumi.StringInput
}

func (GlobalSchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*globalSchemaArgs)(nil)).Elem()
}

type GlobalSchemaInput interface {
	pulumi.Input

	ToGlobalSchemaOutput() GlobalSchemaOutput
	ToGlobalSchemaOutputWithContext(ctx context.Context) GlobalSchemaOutput
}

func (*GlobalSchema) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalSchema)(nil)).Elem()
}

func (i *GlobalSchema) ToGlobalSchemaOutput() GlobalSchemaOutput {
	return i.ToGlobalSchemaOutputWithContext(context.Background())
}

func (i *GlobalSchema) ToGlobalSchemaOutputWithContext(ctx context.Context) GlobalSchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalSchemaOutput)
}

// GlobalSchemaArrayInput is an input type that accepts GlobalSchemaArray and GlobalSchemaArrayOutput values.
// You can construct a concrete instance of `GlobalSchemaArrayInput` via:
//
//	GlobalSchemaArray{ GlobalSchemaArgs{...} }
type GlobalSchemaArrayInput interface {
	pulumi.Input

	ToGlobalSchemaArrayOutput() GlobalSchemaArrayOutput
	ToGlobalSchemaArrayOutputWithContext(context.Context) GlobalSchemaArrayOutput
}

type GlobalSchemaArray []GlobalSchemaInput

func (GlobalSchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalSchema)(nil)).Elem()
}

func (i GlobalSchemaArray) ToGlobalSchemaArrayOutput() GlobalSchemaArrayOutput {
	return i.ToGlobalSchemaArrayOutputWithContext(context.Background())
}

func (i GlobalSchemaArray) ToGlobalSchemaArrayOutputWithContext(ctx context.Context) GlobalSchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalSchemaArrayOutput)
}

// GlobalSchemaMapInput is an input type that accepts GlobalSchemaMap and GlobalSchemaMapOutput values.
// You can construct a concrete instance of `GlobalSchemaMapInput` via:
//
//	GlobalSchemaMap{ "key": GlobalSchemaArgs{...} }
type GlobalSchemaMapInput interface {
	pulumi.Input

	ToGlobalSchemaMapOutput() GlobalSchemaMapOutput
	ToGlobalSchemaMapOutputWithContext(context.Context) GlobalSchemaMapOutput
}

type GlobalSchemaMap map[string]GlobalSchemaInput

func (GlobalSchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalSchema)(nil)).Elem()
}

func (i GlobalSchemaMap) ToGlobalSchemaMapOutput() GlobalSchemaMapOutput {
	return i.ToGlobalSchemaMapOutputWithContext(context.Background())
}

func (i GlobalSchemaMap) ToGlobalSchemaMapOutputWithContext(ctx context.Context) GlobalSchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GlobalSchemaMapOutput)
}

type GlobalSchemaOutput struct{ *pulumi.OutputState }

func (GlobalSchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GlobalSchema)(nil)).Elem()
}

func (o GlobalSchemaOutput) ToGlobalSchemaOutput() GlobalSchemaOutput {
	return o
}

func (o GlobalSchemaOutput) ToGlobalSchemaOutputWithContext(ctx context.Context) GlobalSchemaOutput {
	return o
}

// The Name of the API Management Service where the API exists. Changing this forces a
// new resource to be created.
func (o GlobalSchemaOutput) ApiManagementName() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalSchema) pulumi.StringOutput { return v.ApiManagementName }).(pulumi.StringOutput)
}

// The description of the schema.
func (o GlobalSchemaOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GlobalSchema) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The Name of the Resource Group in which the API Management Service exists. Changing
// this forces a new resource to be created.
func (o GlobalSchemaOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalSchema) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A unique identifier for this Schema. Changing this forces a new resource to be created.
func (o GlobalSchemaOutput) SchemaId() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalSchema) pulumi.StringOutput { return v.SchemaId }).(pulumi.StringOutput)
}

// The content type of the Schema. Possible values are `xml` and `json`.
func (o GlobalSchemaOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalSchema) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The string defining the document representing the Schema.
func (o GlobalSchemaOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *GlobalSchema) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type GlobalSchemaArrayOutput struct{ *pulumi.OutputState }

func (GlobalSchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GlobalSchema)(nil)).Elem()
}

func (o GlobalSchemaArrayOutput) ToGlobalSchemaArrayOutput() GlobalSchemaArrayOutput {
	return o
}

func (o GlobalSchemaArrayOutput) ToGlobalSchemaArrayOutputWithContext(ctx context.Context) GlobalSchemaArrayOutput {
	return o
}

func (o GlobalSchemaArrayOutput) Index(i pulumi.IntInput) GlobalSchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GlobalSchema {
		return vs[0].([]*GlobalSchema)[vs[1].(int)]
	}).(GlobalSchemaOutput)
}

type GlobalSchemaMapOutput struct{ *pulumi.OutputState }

func (GlobalSchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GlobalSchema)(nil)).Elem()
}

func (o GlobalSchemaMapOutput) ToGlobalSchemaMapOutput() GlobalSchemaMapOutput {
	return o
}

func (o GlobalSchemaMapOutput) ToGlobalSchemaMapOutputWithContext(ctx context.Context) GlobalSchemaMapOutput {
	return o
}

func (o GlobalSchemaMapOutput) MapIndex(k pulumi.StringInput) GlobalSchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GlobalSchema {
		return vs[0].(map[string]*GlobalSchema)[vs[1].(string)]
	}).(GlobalSchemaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalSchemaInput)(nil)).Elem(), &GlobalSchema{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalSchemaArrayInput)(nil)).Elem(), GlobalSchemaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GlobalSchemaMapInput)(nil)).Elem(), GlobalSchemaMap{})
	pulumi.RegisterOutputType(GlobalSchemaOutput{})
	pulumi.RegisterOutputType(GlobalSchemaArrayOutput{})
	pulumi.RegisterOutputType(GlobalSchemaMapOutput{})
}