// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogicApps.Outputs
{

    [OutputType]
    public sealed class WorkflowAccessControlTrigger
    {
        /// <summary>
        /// A list of the allowed caller IP address ranges.
        /// </summary>
        public readonly ImmutableArray<string> AllowedCallerIpAddressRanges;
        /// <summary>
        /// A `open_authentication_policy` block as defined below.
        /// </summary>
        public readonly ImmutableArray<Outputs.WorkflowAccessControlTriggerOpenAuthenticationPolicy> OpenAuthenticationPolicies;

        [OutputConstructor]
        private WorkflowAccessControlTrigger(
            ImmutableArray<string> allowedCallerIpAddressRanges,

            ImmutableArray<Outputs.WorkflowAccessControlTriggerOpenAuthenticationPolicy> openAuthenticationPolicies)
        {
            AllowedCallerIpAddressRanges = allowedCallerIpAddressRanges;
            OpenAuthenticationPolicies = openAuthenticationPolicies;
        }
    }
}