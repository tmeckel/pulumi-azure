// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package containerapp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about an existing Container App Environment.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/containerapp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := containerapp.LookupEnvironment(ctx, &containerapp.LookupEnvironmentArgs{
//				Name:              "example-environment",
//				ResourceGroupName: "example-resources",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupEnvironment(ctx *pulumi.Context, args *LookupEnvironmentArgs, opts ...pulumi.InvokeOption) (*LookupEnvironmentResult, error) {
	var rv LookupEnvironmentResult
	err := ctx.Invoke("azure:containerapp/getEnvironment:getEnvironment", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentArgs struct {
	// The name of the Container Apps Managed Environment.
	Name string `pulumi:"name"`
	// The name of the Resource Group where this Container App Environment exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResult struct {
	// The default publicly resolvable name of this Container App Environment. This is generated at creation time to be globally unique.
	DefaultDomain string `pulumi:"defaultDomain"`
	// The network addressing in which the Container Apps in this Container App Environment will reside in CIDR notation.
	DockerBridgeCidr string `pulumi:"dockerBridgeCidr"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The ID of the Subnet in use by the Container Apps Control Plane.
	InfrastructureSubnetId string `pulumi:"infrastructureSubnetId"`
	// Does the Container App Environment operate in Internal Load Balancing Mode?
	InternalLoadBalancerEnabled bool `pulumi:"internalLoadBalancerEnabled"`
	// The Azure Location where this Container App Environment exists.
	Location string `pulumi:"location"`
	// The name of the Log Analytics Workspace this Container Apps Managed Environment is linked to.
	LogAnalyticsWorkspaceName string `pulumi:"logAnalyticsWorkspaceName"`
	Name                      string `pulumi:"name"`
	// The IP range, in CIDR notation, that is reserved for environment infrastructure IP addresses.
	PlatformReservedCidr string `pulumi:"platformReservedCidr"`
	// The IP address from the IP range defined by `platformReservedCidr` that is reserved for the internal DNS server.
	PlatformReservedDnsIpAddress string `pulumi:"platformReservedDnsIpAddress"`
	ResourceGroupName            string `pulumi:"resourceGroupName"`
	// The Static IP address of the Environment.
	StaticIpAddress string `pulumi:"staticIpAddress"`
	// A mapping of tags assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
}

func LookupEnvironmentOutput(ctx *pulumi.Context, args LookupEnvironmentOutputArgs, opts ...pulumi.InvokeOption) LookupEnvironmentResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEnvironmentResult, error) {
			args := v.(LookupEnvironmentArgs)
			r, err := LookupEnvironment(ctx, &args, opts...)
			var s LookupEnvironmentResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEnvironmentResultOutput)
}

// A collection of arguments for invoking getEnvironment.
type LookupEnvironmentOutputArgs struct {
	// The name of the Container Apps Managed Environment.
	Name pulumi.StringInput `pulumi:"name"`
	// The name of the Resource Group where this Container App Environment exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
}

func (LookupEnvironmentOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironment.
type LookupEnvironmentResultOutput struct{ *pulumi.OutputState }

func (LookupEnvironmentResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentResult)(nil)).Elem()
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutput() LookupEnvironmentResultOutput {
	return o
}

func (o LookupEnvironmentResultOutput) ToLookupEnvironmentResultOutputWithContext(ctx context.Context) LookupEnvironmentResultOutput {
	return o
}

// The default publicly resolvable name of this Container App Environment. This is generated at creation time to be globally unique.
func (o LookupEnvironmentResultOutput) DefaultDomain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.DefaultDomain }).(pulumi.StringOutput)
}

// The network addressing in which the Container Apps in this Container App Environment will reside in CIDR notation.
func (o LookupEnvironmentResultOutput) DockerBridgeCidr() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.DockerBridgeCidr }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEnvironmentResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the Subnet in use by the Container Apps Control Plane.
func (o LookupEnvironmentResultOutput) InfrastructureSubnetId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.InfrastructureSubnetId }).(pulumi.StringOutput)
}

// Does the Container App Environment operate in Internal Load Balancing Mode?
func (o LookupEnvironmentResultOutput) InternalLoadBalancerEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) bool { return v.InternalLoadBalancerEnabled }).(pulumi.BoolOutput)
}

// The Azure Location where this Container App Environment exists.
func (o LookupEnvironmentResultOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Location }).(pulumi.StringOutput)
}

// The name of the Log Analytics Workspace this Container Apps Managed Environment is linked to.
func (o LookupEnvironmentResultOutput) LogAnalyticsWorkspaceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.LogAnalyticsWorkspaceName }).(pulumi.StringOutput)
}

func (o LookupEnvironmentResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.Name }).(pulumi.StringOutput)
}

// The IP range, in CIDR notation, that is reserved for environment infrastructure IP addresses.
func (o LookupEnvironmentResultOutput) PlatformReservedCidr() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.PlatformReservedCidr }).(pulumi.StringOutput)
}

// The IP address from the IP range defined by `platformReservedCidr` that is reserved for the internal DNS server.
func (o LookupEnvironmentResultOutput) PlatformReservedDnsIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.PlatformReservedDnsIpAddress }).(pulumi.StringOutput)
}

func (o LookupEnvironmentResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The Static IP address of the Environment.
func (o LookupEnvironmentResultOutput) StaticIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) string { return v.StaticIpAddress }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the resource.
func (o LookupEnvironmentResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupEnvironmentResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEnvironmentResultOutput{})
}