// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesFleetManagerHubProfileArgs : global::Pulumi.ResourceArgs
    {
        [Input("dnsPrefix", required: true)]
        public Input<string> DnsPrefix { get; set; } = null!;

        [Input("fqdn")]
        public Input<string>? Fqdn { get; set; }

        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        public KubernetesFleetManagerHubProfileArgs()
        {
        }
        public static new KubernetesFleetManagerHubProfileArgs Empty => new KubernetesFleetManagerHubProfileArgs();
    }
}