// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PaloAlto.Outputs
{

    [OutputType]
    public sealed class NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfiguration
    {
        public readonly string? IpOfTrustForUserDefinedRoutes;
        /// <summary>
        /// The ID of the Trust subnet.
        /// </summary>
        public readonly string? TrustedSubnetId;
        /// <summary>
        /// The ID of the UnTrust subnet.
        /// </summary>
        public readonly string? UntrustedSubnetId;
        /// <summary>
        /// The ID of the Virtual Network.
        /// </summary>
        public readonly string VirtualNetworkId;

        [OutputConstructor]
        private NextGenerationFirewallVirtualNetworkLocalRulestackNetworkProfileVnetConfiguration(
            string? ipOfTrustForUserDefinedRoutes,

            string? trustedSubnetId,

            string? untrustedSubnetId,

            string virtualNetworkId)
        {
            IpOfTrustForUserDefinedRoutes = ipOfTrustForUserDefinedRoutes;
            TrustedSubnetId = trustedSubnetId;
            UntrustedSubnetId = untrustedSubnetId;
            VirtualNetworkId = virtualNetworkId;
        }
    }
}