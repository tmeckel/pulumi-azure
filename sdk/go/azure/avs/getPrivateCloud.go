// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package avs

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupPrivateCloud(ctx *pulumi.Context, args *LookupPrivateCloudArgs, opts ...pulumi.InvokeOption) (*LookupPrivateCloudResult, error) {
	var rv LookupPrivateCloudResult
	err := ctx.Invoke("azure:avs/getPrivateCloud:getPrivateCloud", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrivateCloud.
type LookupPrivateCloudArgs struct {
	// The name of this Vmware Private Cloud.
	Name string `pulumi:"name"`
	// The name of the Resource Group where the Vmware Private Cloud exists.
	ResourceGroupName string `pulumi:"resourceGroupName"`
}

// A collection of values returned by getPrivateCloud.
type LookupPrivateCloudResult struct {
	// A `circuit` block as defined below.
	Circuits []GetPrivateCloudCircuit `pulumi:"circuits"`
	// The endpoint for the HCX Cloud Manager.
	HcxCloudManagerEndpoint string `pulumi:"hcxCloudManagerEndpoint"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Is the Vmware Private Cluster connected to the internet?
	InternetConnectionEnabled bool `pulumi:"internetConnectionEnabled"`
	// The Azure Region where the Vmware Private Cloud exists.
	Location string `pulumi:"location"`
	// A `managementCluster` block as defined below.
	ManagementClusters []GetPrivateCloudManagementCluster `pulumi:"managementClusters"`
	// The network used to access vCenter Server and NSX-T Manager.
	ManagementSubnetCidr string `pulumi:"managementSubnetCidr"`
	Name                 string `pulumi:"name"`
	// The subnet cidr of the Vmware Private Cloud.
	NetworkSubnetCidr string `pulumi:"networkSubnetCidr"`
	// The thumbprint of the NSX-T Manager SSL certificate.
	NsxtCertificateThumbprint string `pulumi:"nsxtCertificateThumbprint"`
	// The endpoint for the NSX-T Data Center manager.
	NsxtManagerEndpoint string `pulumi:"nsxtManagerEndpoint"`
	// The network which isused for virtual machine cold migration, cloning, and snapshot migration.
	ProvisioningSubnetCidr string `pulumi:"provisioningSubnetCidr"`
	ResourceGroupName      string `pulumi:"resourceGroupName"`
	// The Name of the SKU used for this Private Cloud.
	SkuName string `pulumi:"skuName"`
	// A mapping of tags assigned to the Vmware Private Cloud.
	Tags map[string]string `pulumi:"tags"`
	// The thumbprint of the vCenter Server SSL certificate.
	VcenterCertificateThumbprint string `pulumi:"vcenterCertificateThumbprint"`
	// The endpoint for Virtual Center Server Appliance.
	VcsaEndpoint string `pulumi:"vcsaEndpoint"`
	// The network which is used for live migration of virtual machines.
	VmotionSubnetCidr string `pulumi:"vmotionSubnetCidr"`
}