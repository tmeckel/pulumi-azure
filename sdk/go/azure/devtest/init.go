// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package devtest

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-azure/sdk/v3/go/azure"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "azure:devtest/globalVMShutdownSchedule:GlobalVMShutdownSchedule":
		r, err = NewGlobalVMShutdownSchedule(ctx, name, nil, pulumi.URN_(urn))
	case "azure:devtest/lab:Lab":
		r, err = NewLab(ctx, name, nil, pulumi.URN_(urn))
	case "azure:devtest/linuxVirtualMachine:LinuxVirtualMachine":
		r, err = NewLinuxVirtualMachine(ctx, name, nil, pulumi.URN_(urn))
	case "azure:devtest/policy:Policy":
		r, err = NewPolicy(ctx, name, nil, pulumi.URN_(urn))
	case "azure:devtest/schedule:Schedule":
		r, err = NewSchedule(ctx, name, nil, pulumi.URN_(urn))
	case "azure:devtest/virtualNetwork:VirtualNetwork":
		r, err = NewVirtualNetwork(ctx, name, nil, pulumi.URN_(urn))
	case "azure:devtest/windowsVirtualMachine:WindowsVirtualMachine":
		r, err = NewWindowsVirtualMachine(ctx, name, nil, pulumi.URN_(urn))
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	return
}

func init() {
	version, err := azure.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"azure",
		"devtest/globalVMShutdownSchedule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"devtest/lab",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"devtest/linuxVirtualMachine",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"devtest/policy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"devtest/schedule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"devtest/virtualNetwork",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"azure",
		"devtest/windowsVirtualMachine",
		&module{version},
	)
}