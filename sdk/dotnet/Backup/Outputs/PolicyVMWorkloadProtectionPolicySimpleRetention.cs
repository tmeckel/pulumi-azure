// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Backup.Outputs
{

    [OutputType]
    public sealed class PolicyVMWorkloadProtectionPolicySimpleRetention
    {
        /// <summary>
        /// The count that is used to count retention duration with duration type `Days`. Possible values are between `7` and `35`.
        /// </summary>
        public readonly int Count;

        [OutputConstructor]
        private PolicyVMWorkloadProtectionPolicySimpleRetention(int count)
        {
            Count = count;
        }
    }
}