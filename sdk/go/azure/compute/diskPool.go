// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Disk Pool.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/compute"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/core"
// 	"github.com/pulumi/pulumi-azure/sdk/v4/go/azure/network"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "exampleVirtualNetwork", &network.VirtualNetworkArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Location:          exampleResourceGroup.Location,
// 			AddressSpaces: pulumi.StringArray{
// 				pulumi.String("10.0.0.0/16"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleSubnet, err := network.NewSubnet(ctx, "exampleSubnet", &network.SubnetArgs{
// 			ResourceGroupName:  exampleVirtualNetwork.ResourceGroupName,
// 			VirtualNetworkName: exampleVirtualNetwork.Name,
// 			AddressPrefixes: pulumi.StringArray{
// 				pulumi.String("10.0.0.0/24"),
// 			},
// 			Delegations: network.SubnetDelegationArray{
// 				&network.SubnetDelegationArgs{
// 					Name: pulumi.String("diskspool"),
// 					ServiceDelegation: &network.SubnetDelegationServiceDelegationArgs{
// 						Actions: pulumi.StringArray{
// 							pulumi.String("Microsoft.Network/virtualNetworks/read"),
// 						},
// 						Name: pulumi.String("Microsoft.StoragePool/diskPools"),
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = compute.NewDiskPool(ctx, "exampleDiskPool", &compute.DiskPoolArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Location:          exampleResourceGroup.Location,
// 			SkuName:           pulumi.String("Basic_B1"),
// 			SubnetId:          exampleSubnet.ID(),
// 			Zones: pulumi.StringArray{
// 				pulumi.String("1"),
// 			},
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
// Disk Pools can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:compute/diskPool:DiskPool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.StoragePool/diskPools/diskPool1
// ```
type DiskPool struct {
	pulumi.CustomResourceState

	// The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The Sku of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
	SkuName pulumi.StringOutput `pulumi:"skuName"`
	// The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
	SubnetId pulumi.StringOutput `pulumi:"subnetId"`
	// A mapping of tags which should be assigned to the Disk Pool.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A list of Zones where this Disk Pool should be deployed. Changing this forces a new Disk Pool to be created.
	Zones pulumi.StringArrayOutput `pulumi:"zones"`
}

// NewDiskPool registers a new resource with the given unique name, arguments, and options.
func NewDiskPool(ctx *pulumi.Context,
	name string, args *DiskPoolArgs, opts ...pulumi.ResourceOption) (*DiskPool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.SkuName == nil {
		return nil, errors.New("invalid value for required argument 'SkuName'")
	}
	if args.SubnetId == nil {
		return nil, errors.New("invalid value for required argument 'SubnetId'")
	}
	if args.Zones == nil {
		return nil, errors.New("invalid value for required argument 'Zones'")
	}
	var resource DiskPool
	err := ctx.RegisterResource("azure:compute/diskPool:DiskPool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDiskPool gets an existing DiskPool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDiskPool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiskPoolState, opts ...pulumi.ResourceOption) (*DiskPool, error) {
	var resource DiskPool
	err := ctx.ReadResource("azure:compute/diskPool:DiskPool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DiskPool resources.
type diskPoolState struct {
	// The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
	Location *string `pulumi:"location"`
	// The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The Sku of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
	SkuName *string `pulumi:"skuName"`
	// The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
	SubnetId *string `pulumi:"subnetId"`
	// A mapping of tags which should be assigned to the Disk Pool.
	Tags map[string]string `pulumi:"tags"`
	// A list of Zones where this Disk Pool should be deployed. Changing this forces a new Disk Pool to be created.
	Zones []string `pulumi:"zones"`
}

type DiskPoolState struct {
	// The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
	Location pulumi.StringPtrInput
	// The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The Sku of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
	SkuName pulumi.StringPtrInput
	// The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
	SubnetId pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Disk Pool.
	Tags pulumi.StringMapInput
	// A list of Zones where this Disk Pool should be deployed. Changing this forces a new Disk Pool to be created.
	Zones pulumi.StringArrayInput
}

func (DiskPoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*diskPoolState)(nil)).Elem()
}

type diskPoolArgs struct {
	// The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
	Location *string `pulumi:"location"`
	// The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The Sku of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
	SkuName string `pulumi:"skuName"`
	// The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
	SubnetId string `pulumi:"subnetId"`
	// A mapping of tags which should be assigned to the Disk Pool.
	Tags map[string]string `pulumi:"tags"`
	// A list of Zones where this Disk Pool should be deployed. Changing this forces a new Disk Pool to be created.
	Zones []string `pulumi:"zones"`
}

// The set of arguments for constructing a DiskPool resource.
type DiskPoolArgs struct {
	// The Azure Region where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
	Location pulumi.StringPtrInput
	// The name of the Disk Pool. Changing this forces a new Disk Pool to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Disk Pool should exist. Changing this forces a new Disk Pool to be created.
	ResourceGroupName pulumi.StringInput
	// The Sku of the Disk Pool. Possible values are `Basic_B1`, `Standard_S1` and `Premium_P1`. Changing this forces a new Disk Pool to be created.
	SkuName pulumi.StringInput
	// The ID of the Subnet where the Disk Pool should be created. Changing this forces a new Disk Pool to be created.
	SubnetId pulumi.StringInput
	// A mapping of tags which should be assigned to the Disk Pool.
	Tags pulumi.StringMapInput
	// A list of Zones where this Disk Pool should be deployed. Changing this forces a new Disk Pool to be created.
	Zones pulumi.StringArrayInput
}

func (DiskPoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*diskPoolArgs)(nil)).Elem()
}

type DiskPoolInput interface {
	pulumi.Input

	ToDiskPoolOutput() DiskPoolOutput
	ToDiskPoolOutputWithContext(ctx context.Context) DiskPoolOutput
}

func (*DiskPool) ElementType() reflect.Type {
	return reflect.TypeOf((*DiskPool)(nil))
}

func (i *DiskPool) ToDiskPoolOutput() DiskPoolOutput {
	return i.ToDiskPoolOutputWithContext(context.Background())
}

func (i *DiskPool) ToDiskPoolOutputWithContext(ctx context.Context) DiskPoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskPoolOutput)
}

func (i *DiskPool) ToDiskPoolPtrOutput() DiskPoolPtrOutput {
	return i.ToDiskPoolPtrOutputWithContext(context.Background())
}

func (i *DiskPool) ToDiskPoolPtrOutputWithContext(ctx context.Context) DiskPoolPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskPoolPtrOutput)
}

type DiskPoolPtrInput interface {
	pulumi.Input

	ToDiskPoolPtrOutput() DiskPoolPtrOutput
	ToDiskPoolPtrOutputWithContext(ctx context.Context) DiskPoolPtrOutput
}

type diskPoolPtrType DiskPoolArgs

func (*diskPoolPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskPool)(nil))
}

func (i *diskPoolPtrType) ToDiskPoolPtrOutput() DiskPoolPtrOutput {
	return i.ToDiskPoolPtrOutputWithContext(context.Background())
}

func (i *diskPoolPtrType) ToDiskPoolPtrOutputWithContext(ctx context.Context) DiskPoolPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskPoolPtrOutput)
}

// DiskPoolArrayInput is an input type that accepts DiskPoolArray and DiskPoolArrayOutput values.
// You can construct a concrete instance of `DiskPoolArrayInput` via:
//
//          DiskPoolArray{ DiskPoolArgs{...} }
type DiskPoolArrayInput interface {
	pulumi.Input

	ToDiskPoolArrayOutput() DiskPoolArrayOutput
	ToDiskPoolArrayOutputWithContext(context.Context) DiskPoolArrayOutput
}

type DiskPoolArray []DiskPoolInput

func (DiskPoolArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DiskPool)(nil)).Elem()
}

func (i DiskPoolArray) ToDiskPoolArrayOutput() DiskPoolArrayOutput {
	return i.ToDiskPoolArrayOutputWithContext(context.Background())
}

func (i DiskPoolArray) ToDiskPoolArrayOutputWithContext(ctx context.Context) DiskPoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskPoolArrayOutput)
}

// DiskPoolMapInput is an input type that accepts DiskPoolMap and DiskPoolMapOutput values.
// You can construct a concrete instance of `DiskPoolMapInput` via:
//
//          DiskPoolMap{ "key": DiskPoolArgs{...} }
type DiskPoolMapInput interface {
	pulumi.Input

	ToDiskPoolMapOutput() DiskPoolMapOutput
	ToDiskPoolMapOutputWithContext(context.Context) DiskPoolMapOutput
}

type DiskPoolMap map[string]DiskPoolInput

func (DiskPoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DiskPool)(nil)).Elem()
}

func (i DiskPoolMap) ToDiskPoolMapOutput() DiskPoolMapOutput {
	return i.ToDiskPoolMapOutputWithContext(context.Background())
}

func (i DiskPoolMap) ToDiskPoolMapOutputWithContext(ctx context.Context) DiskPoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskPoolMapOutput)
}

type DiskPoolOutput struct{ *pulumi.OutputState }

func (DiskPoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DiskPool)(nil))
}

func (o DiskPoolOutput) ToDiskPoolOutput() DiskPoolOutput {
	return o
}

func (o DiskPoolOutput) ToDiskPoolOutputWithContext(ctx context.Context) DiskPoolOutput {
	return o
}

func (o DiskPoolOutput) ToDiskPoolPtrOutput() DiskPoolPtrOutput {
	return o.ToDiskPoolPtrOutputWithContext(context.Background())
}

func (o DiskPoolOutput) ToDiskPoolPtrOutputWithContext(ctx context.Context) DiskPoolPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v DiskPool) *DiskPool {
		return &v
	}).(DiskPoolPtrOutput)
}

type DiskPoolPtrOutput struct{ *pulumi.OutputState }

func (DiskPoolPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DiskPool)(nil))
}

func (o DiskPoolPtrOutput) ToDiskPoolPtrOutput() DiskPoolPtrOutput {
	return o
}

func (o DiskPoolPtrOutput) ToDiskPoolPtrOutputWithContext(ctx context.Context) DiskPoolPtrOutput {
	return o
}

func (o DiskPoolPtrOutput) Elem() DiskPoolOutput {
	return o.ApplyT(func(v *DiskPool) DiskPool {
		if v != nil {
			return *v
		}
		var ret DiskPool
		return ret
	}).(DiskPoolOutput)
}

type DiskPoolArrayOutput struct{ *pulumi.OutputState }

func (DiskPoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]DiskPool)(nil))
}

func (o DiskPoolArrayOutput) ToDiskPoolArrayOutput() DiskPoolArrayOutput {
	return o
}

func (o DiskPoolArrayOutput) ToDiskPoolArrayOutputWithContext(ctx context.Context) DiskPoolArrayOutput {
	return o
}

func (o DiskPoolArrayOutput) Index(i pulumi.IntInput) DiskPoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) DiskPool {
		return vs[0].([]DiskPool)[vs[1].(int)]
	}).(DiskPoolOutput)
}

type DiskPoolMapOutput struct{ *pulumi.OutputState }

func (DiskPoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]DiskPool)(nil))
}

func (o DiskPoolMapOutput) ToDiskPoolMapOutput() DiskPoolMapOutput {
	return o
}

func (o DiskPoolMapOutput) ToDiskPoolMapOutputWithContext(ctx context.Context) DiskPoolMapOutput {
	return o
}

func (o DiskPoolMapOutput) MapIndex(k pulumi.StringInput) DiskPoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) DiskPool {
		return vs[0].(map[string]DiskPool)[vs[1].(string)]
	}).(DiskPoolOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiskPoolInput)(nil)).Elem(), &DiskPool{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskPoolPtrInput)(nil)).Elem(), &DiskPool{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskPoolArrayInput)(nil)).Elem(), DiskPoolArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskPoolMapInput)(nil)).Elem(), DiskPoolMap{})
	pulumi.RegisterOutputType(DiskPoolOutput{})
	pulumi.RegisterOutputType(DiskPoolPtrOutput{})
	pulumi.RegisterOutputType(DiskPoolArrayOutput{})
	pulumi.RegisterOutputType(DiskPoolMapOutput{})
}