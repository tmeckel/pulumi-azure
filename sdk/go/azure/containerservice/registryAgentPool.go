// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package containerservice

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Azure Container Registry Agent Pool.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/containerservice"
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europ"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleRegistry, err := containerservice.NewRegistry(ctx, "exampleRegistry", &containerservice.RegistryArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Location:          exampleResourceGroup.Location,
// 			Sku:               pulumi.String("Premium"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = containerservice.NewRegistryAgentPool(ctx, "exampleRegistryAgentPool", &containerservice.RegistryAgentPoolArgs{
// 			ResourceGroupName:     exampleResourceGroup.Name,
// 			Location:              exampleResourceGroup.Location,
// 			ContainerRegistryName: exampleRegistry.Name,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Azure Container Registry Agent Pool can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:containerservice/registryAgentPool:RegistryAgentPool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.ContainerRegistry/registries/registry1/agentPools/agentpool1
// ```
type RegistryAgentPool struct {
	pulumi.CustomResourceState

	// Name of Azure Container Registry to create an Agent Pool for. Changing this forces a new Azure Container Registry Agent Pool to be created.
	ContainerRegistryName pulumi.StringOutput `pulumi:"containerRegistryName"`
	// VMSS instance count. Defaults to `1`.
	InstanceCount pulumi.IntPtrOutput `pulumi:"instanceCount"`
	// The Azure Region where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name which should be used for this Azure Container Registry Agent Pool. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Azure Container Registry Agent Pool.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Sets the VM your agent pool will run on. Valid values are: `S1` (2 vCPUs, 3 GiB RAM), `S2` (4 vCPUs, 8 GiB RAM), `S3` (8 vCPUs, 16 GiB RAM) or `I6` (64 vCPUs, 216 GiB RAM, Isolated). Defaults to `S1`. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Tier pulumi.StringPtrOutput `pulumi:"tier"`
	// The ID of the Virtual Network Subnet Resource where the agent machines will be running. Changing this forces a new Azure Container Registry Agent Pool to be created.
	VirtualNetworkSubnetId pulumi.StringPtrOutput `pulumi:"virtualNetworkSubnetId"`
}

// NewRegistryAgentPool registers a new resource with the given unique name, arguments, and options.
func NewRegistryAgentPool(ctx *pulumi.Context,
	name string, args *RegistryAgentPoolArgs, opts ...pulumi.ResourceOption) (*RegistryAgentPool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContainerRegistryName == nil {
		return nil, errors.New("invalid value for required argument 'ContainerRegistryName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	var resource RegistryAgentPool
	err := ctx.RegisterResource("azure:containerservice/registryAgentPool:RegistryAgentPool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRegistryAgentPool gets an existing RegistryAgentPool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRegistryAgentPool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RegistryAgentPoolState, opts ...pulumi.ResourceOption) (*RegistryAgentPool, error) {
	var resource RegistryAgentPool
	err := ctx.ReadResource("azure:containerservice/registryAgentPool:RegistryAgentPool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RegistryAgentPool resources.
type registryAgentPoolState struct {
	// Name of Azure Container Registry to create an Agent Pool for. Changing this forces a new Azure Container Registry Agent Pool to be created.
	ContainerRegistryName *string `pulumi:"containerRegistryName"`
	// VMSS instance count. Defaults to `1`.
	InstanceCount *int `pulumi:"instanceCount"`
	// The Azure Region where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Azure Container Registry Agent Pool. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Azure Container Registry Agent Pool.
	Tags map[string]string `pulumi:"tags"`
	// Sets the VM your agent pool will run on. Valid values are: `S1` (2 vCPUs, 3 GiB RAM), `S2` (4 vCPUs, 8 GiB RAM), `S3` (8 vCPUs, 16 GiB RAM) or `I6` (64 vCPUs, 216 GiB RAM, Isolated). Defaults to `S1`. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Tier *string `pulumi:"tier"`
	// The ID of the Virtual Network Subnet Resource where the agent machines will be running. Changing this forces a new Azure Container Registry Agent Pool to be created.
	VirtualNetworkSubnetId *string `pulumi:"virtualNetworkSubnetId"`
}

type RegistryAgentPoolState struct {
	// Name of Azure Container Registry to create an Agent Pool for. Changing this forces a new Azure Container Registry Agent Pool to be created.
	ContainerRegistryName pulumi.StringPtrInput
	// VMSS instance count. Defaults to `1`.
	InstanceCount pulumi.IntPtrInput
	// The Azure Region where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Azure Container Registry Agent Pool. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Azure Container Registry Agent Pool.
	Tags pulumi.StringMapInput
	// Sets the VM your agent pool will run on. Valid values are: `S1` (2 vCPUs, 3 GiB RAM), `S2` (4 vCPUs, 8 GiB RAM), `S3` (8 vCPUs, 16 GiB RAM) or `I6` (64 vCPUs, 216 GiB RAM, Isolated). Defaults to `S1`. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Tier pulumi.StringPtrInput
	// The ID of the Virtual Network Subnet Resource where the agent machines will be running. Changing this forces a new Azure Container Registry Agent Pool to be created.
	VirtualNetworkSubnetId pulumi.StringPtrInput
}

func (RegistryAgentPoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*registryAgentPoolState)(nil)).Elem()
}

type registryAgentPoolArgs struct {
	// Name of Azure Container Registry to create an Agent Pool for. Changing this forces a new Azure Container Registry Agent Pool to be created.
	ContainerRegistryName string `pulumi:"containerRegistryName"`
	// VMSS instance count. Defaults to `1`.
	InstanceCount *int `pulumi:"instanceCount"`
	// The Azure Region where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Azure Container Registry Agent Pool. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Azure Container Registry Agent Pool.
	Tags map[string]string `pulumi:"tags"`
	// Sets the VM your agent pool will run on. Valid values are: `S1` (2 vCPUs, 3 GiB RAM), `S2` (4 vCPUs, 8 GiB RAM), `S3` (8 vCPUs, 16 GiB RAM) or `I6` (64 vCPUs, 216 GiB RAM, Isolated). Defaults to `S1`. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Tier *string `pulumi:"tier"`
	// The ID of the Virtual Network Subnet Resource where the agent machines will be running. Changing this forces a new Azure Container Registry Agent Pool to be created.
	VirtualNetworkSubnetId *string `pulumi:"virtualNetworkSubnetId"`
}

// The set of arguments for constructing a RegistryAgentPool resource.
type RegistryAgentPoolArgs struct {
	// Name of Azure Container Registry to create an Agent Pool for. Changing this forces a new Azure Container Registry Agent Pool to be created.
	ContainerRegistryName pulumi.StringInput
	// VMSS instance count. Defaults to `1`.
	InstanceCount pulumi.IntPtrInput
	// The Azure Region where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Azure Container Registry Agent Pool. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Azure Container Registry Agent Pool should exist. Changing this forces a new Azure Container Registry Agent Pool to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Azure Container Registry Agent Pool.
	Tags pulumi.StringMapInput
	// Sets the VM your agent pool will run on. Valid values are: `S1` (2 vCPUs, 3 GiB RAM), `S2` (4 vCPUs, 8 GiB RAM), `S3` (8 vCPUs, 16 GiB RAM) or `I6` (64 vCPUs, 216 GiB RAM, Isolated). Defaults to `S1`. Changing this forces a new Azure Container Registry Agent Pool to be created.
	Tier pulumi.StringPtrInput
	// The ID of the Virtual Network Subnet Resource where the agent machines will be running. Changing this forces a new Azure Container Registry Agent Pool to be created.
	VirtualNetworkSubnetId pulumi.StringPtrInput
}

func (RegistryAgentPoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*registryAgentPoolArgs)(nil)).Elem()
}

type RegistryAgentPoolInput interface {
	pulumi.Input

	ToRegistryAgentPoolOutput() RegistryAgentPoolOutput
	ToRegistryAgentPoolOutputWithContext(ctx context.Context) RegistryAgentPoolOutput
}

func (*RegistryAgentPool) ElementType() reflect.Type {
	return reflect.TypeOf((**RegistryAgentPool)(nil)).Elem()
}

func (i *RegistryAgentPool) ToRegistryAgentPoolOutput() RegistryAgentPoolOutput {
	return i.ToRegistryAgentPoolOutputWithContext(context.Background())
}

func (i *RegistryAgentPool) ToRegistryAgentPoolOutputWithContext(ctx context.Context) RegistryAgentPoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryAgentPoolOutput)
}

// RegistryAgentPoolArrayInput is an input type that accepts RegistryAgentPoolArray and RegistryAgentPoolArrayOutput values.
// You can construct a concrete instance of `RegistryAgentPoolArrayInput` via:
//
//          RegistryAgentPoolArray{ RegistryAgentPoolArgs{...} }
type RegistryAgentPoolArrayInput interface {
	pulumi.Input

	ToRegistryAgentPoolArrayOutput() RegistryAgentPoolArrayOutput
	ToRegistryAgentPoolArrayOutputWithContext(context.Context) RegistryAgentPoolArrayOutput
}

type RegistryAgentPoolArray []RegistryAgentPoolInput

func (RegistryAgentPoolArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegistryAgentPool)(nil)).Elem()
}

func (i RegistryAgentPoolArray) ToRegistryAgentPoolArrayOutput() RegistryAgentPoolArrayOutput {
	return i.ToRegistryAgentPoolArrayOutputWithContext(context.Background())
}

func (i RegistryAgentPoolArray) ToRegistryAgentPoolArrayOutputWithContext(ctx context.Context) RegistryAgentPoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryAgentPoolArrayOutput)
}

// RegistryAgentPoolMapInput is an input type that accepts RegistryAgentPoolMap and RegistryAgentPoolMapOutput values.
// You can construct a concrete instance of `RegistryAgentPoolMapInput` via:
//
//          RegistryAgentPoolMap{ "key": RegistryAgentPoolArgs{...} }
type RegistryAgentPoolMapInput interface {
	pulumi.Input

	ToRegistryAgentPoolMapOutput() RegistryAgentPoolMapOutput
	ToRegistryAgentPoolMapOutputWithContext(context.Context) RegistryAgentPoolMapOutput
}

type RegistryAgentPoolMap map[string]RegistryAgentPoolInput

func (RegistryAgentPoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegistryAgentPool)(nil)).Elem()
}

func (i RegistryAgentPoolMap) ToRegistryAgentPoolMapOutput() RegistryAgentPoolMapOutput {
	return i.ToRegistryAgentPoolMapOutputWithContext(context.Background())
}

func (i RegistryAgentPoolMap) ToRegistryAgentPoolMapOutputWithContext(ctx context.Context) RegistryAgentPoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RegistryAgentPoolMapOutput)
}

type RegistryAgentPoolOutput struct{ *pulumi.OutputState }

func (RegistryAgentPoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RegistryAgentPool)(nil)).Elem()
}

func (o RegistryAgentPoolOutput) ToRegistryAgentPoolOutput() RegistryAgentPoolOutput {
	return o
}

func (o RegistryAgentPoolOutput) ToRegistryAgentPoolOutputWithContext(ctx context.Context) RegistryAgentPoolOutput {
	return o
}

type RegistryAgentPoolArrayOutput struct{ *pulumi.OutputState }

func (RegistryAgentPoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RegistryAgentPool)(nil)).Elem()
}

func (o RegistryAgentPoolArrayOutput) ToRegistryAgentPoolArrayOutput() RegistryAgentPoolArrayOutput {
	return o
}

func (o RegistryAgentPoolArrayOutput) ToRegistryAgentPoolArrayOutputWithContext(ctx context.Context) RegistryAgentPoolArrayOutput {
	return o
}

func (o RegistryAgentPoolArrayOutput) Index(i pulumi.IntInput) RegistryAgentPoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RegistryAgentPool {
		return vs[0].([]*RegistryAgentPool)[vs[1].(int)]
	}).(RegistryAgentPoolOutput)
}

type RegistryAgentPoolMapOutput struct{ *pulumi.OutputState }

func (RegistryAgentPoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RegistryAgentPool)(nil)).Elem()
}

func (o RegistryAgentPoolMapOutput) ToRegistryAgentPoolMapOutput() RegistryAgentPoolMapOutput {
	return o
}

func (o RegistryAgentPoolMapOutput) ToRegistryAgentPoolMapOutputWithContext(ctx context.Context) RegistryAgentPoolMapOutput {
	return o
}

func (o RegistryAgentPoolMapOutput) MapIndex(k pulumi.StringInput) RegistryAgentPoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RegistryAgentPool {
		return vs[0].(map[string]*RegistryAgentPool)[vs[1].(string)]
	}).(RegistryAgentPoolOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryAgentPoolInput)(nil)).Elem(), &RegistryAgentPool{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryAgentPoolArrayInput)(nil)).Elem(), RegistryAgentPoolArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RegistryAgentPoolMapInput)(nil)).Elem(), RegistryAgentPoolMap{})
	pulumi.RegisterOutputType(RegistryAgentPoolOutput{})
	pulumi.RegisterOutputType(RegistryAgentPoolArrayOutput{})
	pulumi.RegisterOutputType(RegistryAgentPoolMapOutput{})
}