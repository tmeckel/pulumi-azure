// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class GetLinuxFunctionAppSiteConfigIpRestrictionResult
    {
        /// <summary>
        /// The action taken.
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// A `headers` block as defined above.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigIpRestrictionHeaderResult> Headers;
        /// <summary>
        /// The CIDR notation of the IP or IP Range matched.
        /// </summary>
        public readonly string IpAddress;
        /// <summary>
        /// The Site Credentials Username used for publishing.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The priority value of this `ip_restriction`.
        /// </summary>
        public readonly int Priority;
        /// <summary>
        /// The Service Tag used for this IP Restriction.
        /// </summary>
        public readonly string ServiceTag;
        /// <summary>
        /// The Virtual Network Subnet ID used for this IP Restriction.
        /// </summary>
        public readonly string VirtualNetworkSubnetId;

        [OutputConstructor]
        private GetLinuxFunctionAppSiteConfigIpRestrictionResult(
            string action,

            ImmutableArray<Outputs.GetLinuxFunctionAppSiteConfigIpRestrictionHeaderResult> headers,

            string ipAddress,

            string name,

            int priority,

            string serviceTag,

            string virtualNetworkSubnetId)
        {
            Action = action;
            Headers = headers;
            IpAddress = ipAddress;
            Name = name;
            Priority = priority;
            ServiceTag = serviceTag;
            VirtualNetworkSubnetId = virtualNetworkSubnetId;
        }
    }
}