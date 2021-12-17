// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class GetVpnGatewayBgpSettingInstance0BgpPeeringAddressResult
    {
        /// <summary>
        /// A list of custom BGP peering addresses to assigned to this instance.
        /// </summary>
        public readonly ImmutableArray<string> CustomIps;
        /// <summary>
        /// The list of default BGP peering addresses which belong to the pre-defined VPN Gateway IP configuration.
        /// </summary>
        public readonly ImmutableArray<string> DefaultIps;
        /// <summary>
        /// The pre-defined id of VPN Gateway Ip Configuration.
        /// </summary>
        public readonly string IpConfigurationId;
        /// <summary>
        /// The list of tunnel public IP addresses which belong to the pre-defined VPN Gateway IP configuration.
        /// </summary>
        public readonly ImmutableArray<string> TunnelIps;

        [OutputConstructor]
        private GetVpnGatewayBgpSettingInstance0BgpPeeringAddressResult(
            ImmutableArray<string> customIps,

            ImmutableArray<string> defaultIps,

            string ipConfigurationId,

            ImmutableArray<string> tunnelIps)
        {
            CustomIps = customIps;
            DefaultIps = defaultIps;
            IpConfigurationId = ipConfigurationId;
            TunnelIps = tunnelIps;
        }
    }
}