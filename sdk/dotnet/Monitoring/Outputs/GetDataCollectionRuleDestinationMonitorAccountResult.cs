// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Outputs
{

    [OutputType]
    public sealed class GetDataCollectionRuleDestinationMonitorAccountResult
    {
        /// <summary>
        /// The resource ID of the Monitor Account.
        /// </summary>
        public readonly string MonitorAccountId;
        /// <summary>
        /// Specifies the name of the Data Collection Rule.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetDataCollectionRuleDestinationMonitorAccountResult(
            string monitorAccountId,

            string name)
        {
            MonitorAccountId = monitorAccountId;
            Name = name;
        }
    }
}