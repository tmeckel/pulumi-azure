// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Outputs
{

    [OutputType]
    public sealed class EnvironmentWorkloadProfile
    {
        public readonly int MaximumCount;
        public readonly int MinimumCount;
        /// <summary>
        /// The name of the workload profile.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Workload profile type for the workloads to run on. Possible values include `D4`, `D8`, `D16`, `D32`, `E4`, `E8`, `E16` and `E32`.
        /// </summary>
        public readonly string WorkloadProfileType;

        [OutputConstructor]
        private EnvironmentWorkloadProfile(
            int maximumCount,

            int minimumCount,

            string name,

            string workloadProfileType)
        {
            MaximumCount = maximumCount;
            MinimumCount = minimumCount;
            Name = name;
            WorkloadProfileType = workloadProfileType;
        }
    }
}
