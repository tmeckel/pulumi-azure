// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class WindowsWebAppSlotSiteConfigAutoHealSettingTriggerRequests
    {
        /// <summary>
        /// The number of requests in the specified `interval` to trigger this rule.
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// The interval in `hh:mm:ss`.
        /// </summary>
        public readonly string Interval;

        [OutputConstructor]
        private WindowsWebAppSlotSiteConfigAutoHealSettingTriggerRequests(
            int count,

            string interval)
        {
            Count = count;
            Interval = interval;
        }
    }
}