// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PaloAlto.Inputs
{

    public sealed class NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs : global::Pulumi.ResourceArgs
    {
        [Input("backendConfig")]
        public Input<Inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatBackendConfigArgs>? BackendConfig { get; set; }

        [Input("frontendConfig")]
        public Input<Inputs.NextGenerationFirewallVirtualHubPanoramaDestinationNatFrontendConfigArgs>? FrontendConfig { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        public NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs()
        {
        }
        public static new NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs Empty => new NextGenerationFirewallVirtualHubPanoramaDestinationNatArgs();
    }
}