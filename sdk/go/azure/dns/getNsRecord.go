// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/dns"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := dns.NewNsRecord(ctx, "example", &dns.NsRecordArgs{
//				ZoneName:          pulumi.String("test-zone"),
//				ResourceGroupName: pulumi.String("test-rg"),
//			})
//			if err != nil {
//				return err
//			}
//			ctx.Export("dnsNsRecordId", example.ID())
//			return nil
//		})
//	}
//
// ```
func LookupNsRecord(ctx *pulumi.Context, args *LookupNsRecordArgs, opts ...pulumi.InvokeOption) (*LookupNsRecordResult, error) {
	var rv LookupNsRecordResult
	err := ctx.Invoke("azure:dns/getNsRecord:getNsRecord", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNsRecord.
type LookupNsRecordArgs struct {
	// The name of the DNS NS Record.
	Name string `pulumi:"name"`
	// Specifies the resource group where the DNS Zone (parent resource) exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// Specifies the DNS Zone where the resource exists.
	ZoneName string `pulumi:"zoneName"`
}

// A collection of values returned by getNsRecord.
type LookupNsRecordResult struct {
	// The FQDN of the DNS NS Record.
	Fqdn string `pulumi:"fqdn"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// A list of values that make up the NS record.
	Records           []string `pulumi:"records"`
	ResourceGroupName string   `pulumi:"resourceGroupName"`
	// A mapping of tags assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
	// The Time To Live (TTL) of the DNS record in seconds.
	Ttl      int    `pulumi:"ttl"`
	ZoneName string `pulumi:"zoneName"`
}

func LookupNsRecordOutput(ctx *pulumi.Context, args LookupNsRecordOutputArgs, opts ...pulumi.InvokeOption) LookupNsRecordResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNsRecordResult, error) {
			args := v.(LookupNsRecordArgs)
			r, err := LookupNsRecord(ctx, &args, opts...)
			var s LookupNsRecordResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNsRecordResultOutput)
}

// A collection of arguments for invoking getNsRecord.
type LookupNsRecordOutputArgs struct {
	// The name of the DNS NS Record.
	Name pulumi.StringInput `pulumi:"name"`
	// Specifies the resource group where the DNS Zone (parent resource) exists.
	ResourceGroupName pulumi.StringInput `pulumi:"resourceGroupName"`
	// Specifies the DNS Zone where the resource exists.
	ZoneName pulumi.StringInput `pulumi:"zoneName"`
}

func (LookupNsRecordOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNsRecordArgs)(nil)).Elem()
}

// A collection of values returned by getNsRecord.
type LookupNsRecordResultOutput struct{ *pulumi.OutputState }

func (LookupNsRecordResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNsRecordResult)(nil)).Elem()
}

func (o LookupNsRecordResultOutput) ToLookupNsRecordResultOutput() LookupNsRecordResultOutput {
	return o
}

func (o LookupNsRecordResultOutput) ToLookupNsRecordResultOutputWithContext(ctx context.Context) LookupNsRecordResultOutput {
	return o
}

// The FQDN of the DNS NS Record.
func (o LookupNsRecordResultOutput) Fqdn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNsRecordResult) string { return v.Fqdn }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNsRecordResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNsRecordResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupNsRecordResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNsRecordResult) string { return v.Name }).(pulumi.StringOutput)
}

// A list of values that make up the NS record.
func (o LookupNsRecordResultOutput) Records() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNsRecordResult) []string { return v.Records }).(pulumi.StringArrayOutput)
}

func (o LookupNsRecordResultOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNsRecordResult) string { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags assigned to the resource.
func (o LookupNsRecordResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupNsRecordResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The Time To Live (TTL) of the DNS record in seconds.
func (o LookupNsRecordResultOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNsRecordResult) int { return v.Ttl }).(pulumi.IntOutput)
}

func (o LookupNsRecordResultOutput) ZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNsRecordResult) string { return v.ZoneName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNsRecordResultOutput{})
}