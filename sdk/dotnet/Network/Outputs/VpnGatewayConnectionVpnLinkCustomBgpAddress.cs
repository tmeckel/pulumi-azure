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
    public sealed class VpnGatewayConnectionVpnLinkCustomBgpAddress
    {
        /// <summary>
        /// The custom bgp ip address which belongs to the IP Configuration.
        /// </summary>
        public readonly string IpAddress;
        /// <summary>
        /// The ID of the IP Configuration which belongs to the VPN Gateway.
        /// </summary>
        public readonly string IpConfigurationId;

        [OutputConstructor]
        private VpnGatewayConnectionVpnLinkCustomBgpAddress(
            string ipAddress,

            string ipConfigurationId)
        {
            IpAddress = ipAddress;
            IpConfigurationId = ipConfigurationId;
        }
    }
}