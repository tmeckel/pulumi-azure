// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Outputs
{

    [OutputType]
    public sealed class GetVirtualMachineScaleSetInstanceResult
    {
        /// <summary>
        /// The Hostname of this Virtual Machine.
        /// </summary>
        public readonly string ComputerName;
        /// <summary>
        /// The Instance ID of this Virtual Machine.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// Whether the latest model has been applied to this Virtual Machine.
        /// </summary>
        public readonly bool LatestModelApplied;
        /// <summary>
        /// The name of this Virtual Machine Scale Set.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Primary Private IP Address assigned to this Virtual Machine.
        /// </summary>
        public readonly string PrivateIpAddress;
        /// <summary>
        /// A list of Private IP Addresses assigned to this Virtual Machine.
        /// </summary>
        public readonly ImmutableArray<string> PrivateIpAddresses;
        /// <summary>
        /// The virtual machines scale set IP Configuration's PublicIPAddress configuration. The `public_ip_address` is documented below.
        /// </summary>
        public readonly string PublicIpAddress;
        /// <summary>
        /// A list of the Public IP Addresses assigned to this Virtual Machine.
        /// </summary>
        public readonly ImmutableArray<string> PublicIpAddresses;
        /// <summary>
        /// The unique ID of the virtual machine.
        /// </summary>
        public readonly string VirtualMachineId;
        /// <summary>
        /// The zones of the virtual machine.
        /// </summary>
        public readonly string Zone;

        [OutputConstructor]
        private GetVirtualMachineScaleSetInstanceResult(
            string computerName,

            string instanceId,

            bool latestModelApplied,

            string name,

            string privateIpAddress,

            ImmutableArray<string> privateIpAddresses,

            string publicIpAddress,

            ImmutableArray<string> publicIpAddresses,

            string virtualMachineId,

            string zone)
        {
            ComputerName = computerName;
            InstanceId = instanceId;
            LatestModelApplied = latestModelApplied;
            Name = name;
            PrivateIpAddress = privateIpAddress;
            PrivateIpAddresses = privateIpAddresses;
            PublicIpAddress = publicIpAddress;
            PublicIpAddresses = publicIpAddresses;
            VirtualMachineId = virtualMachineId;
            Zone = zone;
        }
    }
}