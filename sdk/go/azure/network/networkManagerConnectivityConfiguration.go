// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package network

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Network Manager Connectivity Configuration.
//
// > **Note:** The `network.NetworkManagerConnectivityConfiguration` deployment may modify or delete existing Network Peering resource.
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
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			current, err := core.LookupSubscription(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			exampleNetworkManager, err := network.NewNetworkManager(ctx, "exampleNetworkManager", &network.NetworkManagerArgs{
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				Scope: &network.NetworkManagerScopeArgs{
//					SubscriptionIds: pulumi.StringArray{
//						*pulumi.String(current.Id),
//					},
//				},
//				ScopeAccesses: pulumi.StringArray{
//					pulumi.String("Connectivity"),
//					pulumi.String("SecurityAdmin"),
//				},
//				Description: pulumi.String("example network manager"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleNetworkManagerNetworkGroup, err := network.NewNetworkManagerNetworkGroup(ctx, "exampleNetworkManagerNetworkGroup", &network.NetworkManagerNetworkGroupArgs{
//				NetworkManagerId: exampleNetworkManager.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVirtualNetwork, err := network.NewVirtualNetwork(ctx, "exampleVirtualNetwork", &network.VirtualNetworkArgs{
//				Location:          exampleResourceGroup.Location,
//				ResourceGroupName: exampleResourceGroup.Name,
//				AddressSpaces: pulumi.StringArray{
//					pulumi.String("10.0.0.0/16"),
//				},
//				FlowTimeoutInMinutes: pulumi.Int(10),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = network.NewNetworkManagerConnectivityConfiguration(ctx, "exampleNetworkManagerConnectivityConfiguration", &network.NetworkManagerConnectivityConfigurationArgs{
//				NetworkManagerId:     exampleNetworkManager.ID(),
//				ConnectivityTopology: pulumi.String("HubAndSpoke"),
//				AppliesToGroups: network.NetworkManagerConnectivityConfigurationAppliesToGroupArray{
//					&network.NetworkManagerConnectivityConfigurationAppliesToGroupArgs{
//						GroupConnectivity: pulumi.String("DirectlyConnected"),
//						NetworkGroupId:    exampleNetworkManagerNetworkGroup.ID(),
//					},
//				},
//				Hub: &network.NetworkManagerConnectivityConfigurationHubArgs{
//					ResourceId:   exampleVirtualNetwork.ID(),
//					ResourceType: pulumi.String("Microsoft.Network/virtualNetworks"),
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
// Network Manager Connectivity Configuration can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:network/networkManagerConnectivityConfiguration:NetworkManagerConnectivityConfiguration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/networkManagers/networkManager1/connectivityConfigurations/configuration1
//
// ```
type NetworkManagerConnectivityConfiguration struct {
	pulumi.CustomResourceState

	// An `appliesToGroup` block as defined below.
	AppliesToGroups NetworkManagerConnectivityConfigurationAppliesToGroupArrayOutput `pulumi:"appliesToGroups"`
	// Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
	ConnectivityTopology pulumi.StringOutput `pulumi:"connectivityTopology"`
	// Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
	DeleteExistingPeeringEnabled pulumi.BoolPtrOutput `pulumi:"deleteExistingPeeringEnabled"`
	// A description of the Connectivity Configuration.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Indicates whether to global mesh is supported. Possible values are `true` and `false`.
	GlobalMeshEnabled pulumi.BoolPtrOutput `pulumi:"globalMeshEnabled"`
	// A `hub` block as defined below.
	Hub NetworkManagerConnectivityConfigurationHubPtrOutput `pulumi:"hub"`
	// Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
	NetworkManagerId pulumi.StringOutput `pulumi:"networkManagerId"`
}

// NewNetworkManagerConnectivityConfiguration registers a new resource with the given unique name, arguments, and options.
func NewNetworkManagerConnectivityConfiguration(ctx *pulumi.Context,
	name string, args *NetworkManagerConnectivityConfigurationArgs, opts ...pulumi.ResourceOption) (*NetworkManagerConnectivityConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppliesToGroups == nil {
		return nil, errors.New("invalid value for required argument 'AppliesToGroups'")
	}
	if args.ConnectivityTopology == nil {
		return nil, errors.New("invalid value for required argument 'ConnectivityTopology'")
	}
	if args.NetworkManagerId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkManagerId'")
	}
	var resource NetworkManagerConnectivityConfiguration
	err := ctx.RegisterResource("azure:network/networkManagerConnectivityConfiguration:NetworkManagerConnectivityConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkManagerConnectivityConfiguration gets an existing NetworkManagerConnectivityConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkManagerConnectivityConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkManagerConnectivityConfigurationState, opts ...pulumi.ResourceOption) (*NetworkManagerConnectivityConfiguration, error) {
	var resource NetworkManagerConnectivityConfiguration
	err := ctx.ReadResource("azure:network/networkManagerConnectivityConfiguration:NetworkManagerConnectivityConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkManagerConnectivityConfiguration resources.
type networkManagerConnectivityConfigurationState struct {
	// An `appliesToGroup` block as defined below.
	AppliesToGroups []NetworkManagerConnectivityConfigurationAppliesToGroup `pulumi:"appliesToGroups"`
	// Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
	ConnectivityTopology *string `pulumi:"connectivityTopology"`
	// Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
	DeleteExistingPeeringEnabled *bool `pulumi:"deleteExistingPeeringEnabled"`
	// A description of the Connectivity Configuration.
	Description *string `pulumi:"description"`
	// Indicates whether to global mesh is supported. Possible values are `true` and `false`.
	GlobalMeshEnabled *bool `pulumi:"globalMeshEnabled"`
	// A `hub` block as defined below.
	Hub *NetworkManagerConnectivityConfigurationHub `pulumi:"hub"`
	// Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
	Name *string `pulumi:"name"`
	// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
	NetworkManagerId *string `pulumi:"networkManagerId"`
}

type NetworkManagerConnectivityConfigurationState struct {
	// An `appliesToGroup` block as defined below.
	AppliesToGroups NetworkManagerConnectivityConfigurationAppliesToGroupArrayInput
	// Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
	ConnectivityTopology pulumi.StringPtrInput
	// Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
	DeleteExistingPeeringEnabled pulumi.BoolPtrInput
	// A description of the Connectivity Configuration.
	Description pulumi.StringPtrInput
	// Indicates whether to global mesh is supported. Possible values are `true` and `false`.
	GlobalMeshEnabled pulumi.BoolPtrInput
	// A `hub` block as defined below.
	Hub NetworkManagerConnectivityConfigurationHubPtrInput
	// Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
	Name pulumi.StringPtrInput
	// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
	NetworkManagerId pulumi.StringPtrInput
}

func (NetworkManagerConnectivityConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkManagerConnectivityConfigurationState)(nil)).Elem()
}

type networkManagerConnectivityConfigurationArgs struct {
	// An `appliesToGroup` block as defined below.
	AppliesToGroups []NetworkManagerConnectivityConfigurationAppliesToGroup `pulumi:"appliesToGroups"`
	// Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
	ConnectivityTopology string `pulumi:"connectivityTopology"`
	// Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
	DeleteExistingPeeringEnabled *bool `pulumi:"deleteExistingPeeringEnabled"`
	// A description of the Connectivity Configuration.
	Description *string `pulumi:"description"`
	// Indicates whether to global mesh is supported. Possible values are `true` and `false`.
	GlobalMeshEnabled *bool `pulumi:"globalMeshEnabled"`
	// A `hub` block as defined below.
	Hub *NetworkManagerConnectivityConfigurationHub `pulumi:"hub"`
	// Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
	Name *string `pulumi:"name"`
	// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
	NetworkManagerId string `pulumi:"networkManagerId"`
}

// The set of arguments for constructing a NetworkManagerConnectivityConfiguration resource.
type NetworkManagerConnectivityConfigurationArgs struct {
	// An `appliesToGroup` block as defined below.
	AppliesToGroups NetworkManagerConnectivityConfigurationAppliesToGroupArrayInput
	// Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
	ConnectivityTopology pulumi.StringInput
	// Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
	DeleteExistingPeeringEnabled pulumi.BoolPtrInput
	// A description of the Connectivity Configuration.
	Description pulumi.StringPtrInput
	// Indicates whether to global mesh is supported. Possible values are `true` and `false`.
	GlobalMeshEnabled pulumi.BoolPtrInput
	// A `hub` block as defined below.
	Hub NetworkManagerConnectivityConfigurationHubPtrInput
	// Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
	Name pulumi.StringPtrInput
	// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
	NetworkManagerId pulumi.StringInput
}

func (NetworkManagerConnectivityConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkManagerConnectivityConfigurationArgs)(nil)).Elem()
}

type NetworkManagerConnectivityConfigurationInput interface {
	pulumi.Input

	ToNetworkManagerConnectivityConfigurationOutput() NetworkManagerConnectivityConfigurationOutput
	ToNetworkManagerConnectivityConfigurationOutputWithContext(ctx context.Context) NetworkManagerConnectivityConfigurationOutput
}

func (*NetworkManagerConnectivityConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkManagerConnectivityConfiguration)(nil)).Elem()
}

func (i *NetworkManagerConnectivityConfiguration) ToNetworkManagerConnectivityConfigurationOutput() NetworkManagerConnectivityConfigurationOutput {
	return i.ToNetworkManagerConnectivityConfigurationOutputWithContext(context.Background())
}

func (i *NetworkManagerConnectivityConfiguration) ToNetworkManagerConnectivityConfigurationOutputWithContext(ctx context.Context) NetworkManagerConnectivityConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkManagerConnectivityConfigurationOutput)
}

// NetworkManagerConnectivityConfigurationArrayInput is an input type that accepts NetworkManagerConnectivityConfigurationArray and NetworkManagerConnectivityConfigurationArrayOutput values.
// You can construct a concrete instance of `NetworkManagerConnectivityConfigurationArrayInput` via:
//
//	NetworkManagerConnectivityConfigurationArray{ NetworkManagerConnectivityConfigurationArgs{...} }
type NetworkManagerConnectivityConfigurationArrayInput interface {
	pulumi.Input

	ToNetworkManagerConnectivityConfigurationArrayOutput() NetworkManagerConnectivityConfigurationArrayOutput
	ToNetworkManagerConnectivityConfigurationArrayOutputWithContext(context.Context) NetworkManagerConnectivityConfigurationArrayOutput
}

type NetworkManagerConnectivityConfigurationArray []NetworkManagerConnectivityConfigurationInput

func (NetworkManagerConnectivityConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkManagerConnectivityConfiguration)(nil)).Elem()
}

func (i NetworkManagerConnectivityConfigurationArray) ToNetworkManagerConnectivityConfigurationArrayOutput() NetworkManagerConnectivityConfigurationArrayOutput {
	return i.ToNetworkManagerConnectivityConfigurationArrayOutputWithContext(context.Background())
}

func (i NetworkManagerConnectivityConfigurationArray) ToNetworkManagerConnectivityConfigurationArrayOutputWithContext(ctx context.Context) NetworkManagerConnectivityConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkManagerConnectivityConfigurationArrayOutput)
}

// NetworkManagerConnectivityConfigurationMapInput is an input type that accepts NetworkManagerConnectivityConfigurationMap and NetworkManagerConnectivityConfigurationMapOutput values.
// You can construct a concrete instance of `NetworkManagerConnectivityConfigurationMapInput` via:
//
//	NetworkManagerConnectivityConfigurationMap{ "key": NetworkManagerConnectivityConfigurationArgs{...} }
type NetworkManagerConnectivityConfigurationMapInput interface {
	pulumi.Input

	ToNetworkManagerConnectivityConfigurationMapOutput() NetworkManagerConnectivityConfigurationMapOutput
	ToNetworkManagerConnectivityConfigurationMapOutputWithContext(context.Context) NetworkManagerConnectivityConfigurationMapOutput
}

type NetworkManagerConnectivityConfigurationMap map[string]NetworkManagerConnectivityConfigurationInput

func (NetworkManagerConnectivityConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkManagerConnectivityConfiguration)(nil)).Elem()
}

func (i NetworkManagerConnectivityConfigurationMap) ToNetworkManagerConnectivityConfigurationMapOutput() NetworkManagerConnectivityConfigurationMapOutput {
	return i.ToNetworkManagerConnectivityConfigurationMapOutputWithContext(context.Background())
}

func (i NetworkManagerConnectivityConfigurationMap) ToNetworkManagerConnectivityConfigurationMapOutputWithContext(ctx context.Context) NetworkManagerConnectivityConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkManagerConnectivityConfigurationMapOutput)
}

type NetworkManagerConnectivityConfigurationOutput struct{ *pulumi.OutputState }

func (NetworkManagerConnectivityConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkManagerConnectivityConfiguration)(nil)).Elem()
}

func (o NetworkManagerConnectivityConfigurationOutput) ToNetworkManagerConnectivityConfigurationOutput() NetworkManagerConnectivityConfigurationOutput {
	return o
}

func (o NetworkManagerConnectivityConfigurationOutput) ToNetworkManagerConnectivityConfigurationOutputWithContext(ctx context.Context) NetworkManagerConnectivityConfigurationOutput {
	return o
}

// An `appliesToGroup` block as defined below.
func (o NetworkManagerConnectivityConfigurationOutput) AppliesToGroups() NetworkManagerConnectivityConfigurationAppliesToGroupArrayOutput {
	return o.ApplyT(func(v *NetworkManagerConnectivityConfiguration) NetworkManagerConnectivityConfigurationAppliesToGroupArrayOutput {
		return v.AppliesToGroups
	}).(NetworkManagerConnectivityConfigurationAppliesToGroupArrayOutput)
}

// Specifies the connectivity topology type. Possible values are `HubAndSpoke` and `Mesh`.
func (o NetworkManagerConnectivityConfigurationOutput) ConnectivityTopology() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkManagerConnectivityConfiguration) pulumi.StringOutput { return v.ConnectivityTopology }).(pulumi.StringOutput)
}

// Indicates whether to remove current existing Virtual Network Peering in the Connectivity Configuration affected scope. Possible values are `true` and `false`.
func (o NetworkManagerConnectivityConfigurationOutput) DeleteExistingPeeringEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *NetworkManagerConnectivityConfiguration) pulumi.BoolPtrOutput {
		return v.DeleteExistingPeeringEnabled
	}).(pulumi.BoolPtrOutput)
}

// A description of the Connectivity Configuration.
func (o NetworkManagerConnectivityConfigurationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NetworkManagerConnectivityConfiguration) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Indicates whether to global mesh is supported. Possible values are `true` and `false`.
func (o NetworkManagerConnectivityConfigurationOutput) GlobalMeshEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *NetworkManagerConnectivityConfiguration) pulumi.BoolPtrOutput { return v.GlobalMeshEnabled }).(pulumi.BoolPtrOutput)
}

// A `hub` block as defined below.
func (o NetworkManagerConnectivityConfigurationOutput) Hub() NetworkManagerConnectivityConfigurationHubPtrOutput {
	return o.ApplyT(func(v *NetworkManagerConnectivityConfiguration) NetworkManagerConnectivityConfigurationHubPtrOutput {
		return v.Hub
	}).(NetworkManagerConnectivityConfigurationHubPtrOutput)
}

// Specifies the name which should be used for this Network Manager Connectivity Configuration. Changing this forces a new Network Manager Connectivity Configuration to be created.
func (o NetworkManagerConnectivityConfigurationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkManagerConnectivityConfiguration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the ID of the Network Manager. Changing this forces a new Network Manager Connectivity Configuration to be created.
func (o NetworkManagerConnectivityConfigurationOutput) NetworkManagerId() pulumi.StringOutput {
	return o.ApplyT(func(v *NetworkManagerConnectivityConfiguration) pulumi.StringOutput { return v.NetworkManagerId }).(pulumi.StringOutput)
}

type NetworkManagerConnectivityConfigurationArrayOutput struct{ *pulumi.OutputState }

func (NetworkManagerConnectivityConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NetworkManagerConnectivityConfiguration)(nil)).Elem()
}

func (o NetworkManagerConnectivityConfigurationArrayOutput) ToNetworkManagerConnectivityConfigurationArrayOutput() NetworkManagerConnectivityConfigurationArrayOutput {
	return o
}

func (o NetworkManagerConnectivityConfigurationArrayOutput) ToNetworkManagerConnectivityConfigurationArrayOutputWithContext(ctx context.Context) NetworkManagerConnectivityConfigurationArrayOutput {
	return o
}

func (o NetworkManagerConnectivityConfigurationArrayOutput) Index(i pulumi.IntInput) NetworkManagerConnectivityConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NetworkManagerConnectivityConfiguration {
		return vs[0].([]*NetworkManagerConnectivityConfiguration)[vs[1].(int)]
	}).(NetworkManagerConnectivityConfigurationOutput)
}

type NetworkManagerConnectivityConfigurationMapOutput struct{ *pulumi.OutputState }

func (NetworkManagerConnectivityConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NetworkManagerConnectivityConfiguration)(nil)).Elem()
}

func (o NetworkManagerConnectivityConfigurationMapOutput) ToNetworkManagerConnectivityConfigurationMapOutput() NetworkManagerConnectivityConfigurationMapOutput {
	return o
}

func (o NetworkManagerConnectivityConfigurationMapOutput) ToNetworkManagerConnectivityConfigurationMapOutputWithContext(ctx context.Context) NetworkManagerConnectivityConfigurationMapOutput {
	return o
}

func (o NetworkManagerConnectivityConfigurationMapOutput) MapIndex(k pulumi.StringInput) NetworkManagerConnectivityConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NetworkManagerConnectivityConfiguration {
		return vs[0].(map[string]*NetworkManagerConnectivityConfiguration)[vs[1].(string)]
	}).(NetworkManagerConnectivityConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkManagerConnectivityConfigurationInput)(nil)).Elem(), &NetworkManagerConnectivityConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkManagerConnectivityConfigurationArrayInput)(nil)).Elem(), NetworkManagerConnectivityConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NetworkManagerConnectivityConfigurationMapInput)(nil)).Elem(), NetworkManagerConnectivityConfigurationMap{})
	pulumi.RegisterOutputType(NetworkManagerConnectivityConfigurationOutput{})
	pulumi.RegisterOutputType(NetworkManagerConnectivityConfigurationArrayOutput{})
	pulumi.RegisterOutputType(NetworkManagerConnectivityConfigurationMapOutput{})
}