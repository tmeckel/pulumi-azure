// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.HDInsight.Outputs
{

    [OutputType]
    public sealed class InteractiveQueryClusterComputeIsolation
    {
        public readonly bool? ComputeIsolationEnabled;
        /// <summary>
        /// The name of the host SKU.
        /// </summary>
        public readonly string? HostSku;

        [OutputConstructor]
        private InteractiveQueryClusterComputeIsolation(
            bool? computeIsolationEnabled,

            string? hostSku)
        {
            ComputeIsolationEnabled = computeIsolationEnabled;
            HostSku = hostSku;
        }
    }
}