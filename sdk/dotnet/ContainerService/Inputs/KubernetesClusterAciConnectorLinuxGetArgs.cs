// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class KubernetesClusterAciConnectorLinuxGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The subnet name for the virtual nodes to run.
        /// </summary>
        [Input("subnetName", required: true)]
        public Input<string> SubnetName { get; set; } = null!;

        public KubernetesClusterAciConnectorLinuxGetArgs()
        {
        }
    }
}