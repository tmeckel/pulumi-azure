// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mobile

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information about a Mobile Network Sim.
func LookupNetworkSim(ctx *pulumi.Context, args *LookupNetworkSimArgs, opts ...pulumi.InvokeOption) (*LookupNetworkSimResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkSimResult
	err := ctx.Invoke("azure:mobile/getNetworkSim:getNetworkSim", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkSim.
type LookupNetworkSimArgs struct {
	// The ID of the Mobile Network which the Mobile Network Sim belongs to.
	MobileNetworkSimGroupId string `pulumi:"mobileNetworkSimGroupId"`
	// The name which should be used for this Mobile Network Sim.
	Name string `pulumi:"name"`
}

// A collection of values returned by getNetworkSim.
type LookupNetworkSimResult struct {
	// The device type this SIM is associated with.
	DeviceType string `pulumi:"deviceType"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The integrated circuit card ID (ICCID) for the SIM.
	IntegratedCircuitCardIdentifier string `pulumi:"integratedCircuitCardIdentifier"`
	// The international mobile subscriber identity (IMSI) for the SIM.
	InternationalMobileSubscriberIdentity string `pulumi:"internationalMobileSubscriberIdentity"`
	MobileNetworkSimGroupId               string `pulumi:"mobileNetworkSimGroupId"`
	Name                                  string `pulumi:"name"`
	// The ID of SIM policy used by this SIM.
	SimPolicyId string `pulumi:"simPolicyId"`
	// The state of the SIM resource.
	SimState string `pulumi:"simState"`
	// A `staticIpConfiguration` block as defined below.
	StaticIpConfigurations []GetNetworkSimStaticIpConfiguration `pulumi:"staticIpConfigurations"`
	// The public key fingerprint of the SIM vendor who provided this SIM.
	VendorKeyFingerprint string `pulumi:"vendorKeyFingerprint"`
	// The name of the SIM vendor who provided this SIM, if any.
	VendorName string `pulumi:"vendorName"`
}

func LookupNetworkSimOutput(ctx *pulumi.Context, args LookupNetworkSimOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkSimResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNetworkSimResult, error) {
			args := v.(LookupNetworkSimArgs)
			r, err := LookupNetworkSim(ctx, &args, opts...)
			var s LookupNetworkSimResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNetworkSimResultOutput)
}

// A collection of arguments for invoking getNetworkSim.
type LookupNetworkSimOutputArgs struct {
	// The ID of the Mobile Network which the Mobile Network Sim belongs to.
	MobileNetworkSimGroupId pulumi.StringInput `pulumi:"mobileNetworkSimGroupId"`
	// The name which should be used for this Mobile Network Sim.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupNetworkSimOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkSimArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkSim.
type LookupNetworkSimResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkSimResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkSimResult)(nil)).Elem()
}

func (o LookupNetworkSimResultOutput) ToLookupNetworkSimResultOutput() LookupNetworkSimResultOutput {
	return o
}

func (o LookupNetworkSimResultOutput) ToLookupNetworkSimResultOutputWithContext(ctx context.Context) LookupNetworkSimResultOutput {
	return o
}

// The device type this SIM is associated with.
func (o LookupNetworkSimResultOutput) DeviceType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) string { return v.DeviceType }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetworkSimResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) string { return v.Id }).(pulumi.StringOutput)
}

// The integrated circuit card ID (ICCID) for the SIM.
func (o LookupNetworkSimResultOutput) IntegratedCircuitCardIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) string { return v.IntegratedCircuitCardIdentifier }).(pulumi.StringOutput)
}

// The international mobile subscriber identity (IMSI) for the SIM.
func (o LookupNetworkSimResultOutput) InternationalMobileSubscriberIdentity() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) string { return v.InternationalMobileSubscriberIdentity }).(pulumi.StringOutput)
}

func (o LookupNetworkSimResultOutput) MobileNetworkSimGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) string { return v.MobileNetworkSimGroupId }).(pulumi.StringOutput)
}

func (o LookupNetworkSimResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) string { return v.Name }).(pulumi.StringOutput)
}

// The ID of SIM policy used by this SIM.
func (o LookupNetworkSimResultOutput) SimPolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) string { return v.SimPolicyId }).(pulumi.StringOutput)
}

// The state of the SIM resource.
func (o LookupNetworkSimResultOutput) SimState() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) string { return v.SimState }).(pulumi.StringOutput)
}

// A `staticIpConfiguration` block as defined below.
func (o LookupNetworkSimResultOutput) StaticIpConfigurations() GetNetworkSimStaticIpConfigurationArrayOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) []GetNetworkSimStaticIpConfiguration { return v.StaticIpConfigurations }).(GetNetworkSimStaticIpConfigurationArrayOutput)
}

// The public key fingerprint of the SIM vendor who provided this SIM.
func (o LookupNetworkSimResultOutput) VendorKeyFingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) string { return v.VendorKeyFingerprint }).(pulumi.StringOutput)
}

// The name of the SIM vendor who provided this SIM, if any.
func (o LookupNetworkSimResultOutput) VendorName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkSimResult) string { return v.VendorName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkSimResultOutput{})
}