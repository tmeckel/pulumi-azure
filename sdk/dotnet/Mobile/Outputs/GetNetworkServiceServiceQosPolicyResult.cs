// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Mobile.Outputs
{

    [OutputType]
    public sealed class GetNetworkServiceServiceQosPolicyResult
    {
        /// <summary>
        /// QoS Flow allocation and retention priority (ARP) level.
        /// </summary>
        public readonly int AllocationAndRetentionPriorityLevel;
        /// <summary>
        /// A `maximum_bit_rate` block as defined below. The Maximum Bit Rate (MBR) for all service data flows that use this PCC Rule or Service.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworkServiceServiceQosPolicyMaximumBitRateResult> MaximumBitRates;
        /// <summary>
        /// The Preemption Capability of a QoS Flow controls whether it can preempt another QoS Flow with a lower priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters.
        /// </summary>
        public readonly string PreemptionCapability;
        /// <summary>
        /// The Preemption Vulnerability of a QoS Flow controls whether it can be preempted by QoS Flow with a higher priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters.
        /// </summary>
        public readonly string PreemptionVulnerability;
        /// <summary>
        /// The QoS Indicator (5QI for 5G network /QCI for 4G net work) value identifies a set of QoS characteristics that control QoS forwarding treatment for QoS flows or EPS bearers.
        /// </summary>
        public readonly int QosIndicator;

        [OutputConstructor]
        private GetNetworkServiceServiceQosPolicyResult(
            int allocationAndRetentionPriorityLevel,

            ImmutableArray<Outputs.GetNetworkServiceServiceQosPolicyMaximumBitRateResult> maximumBitRates,

            string preemptionCapability,

            string preemptionVulnerability,

            int qosIndicator)
        {
            AllocationAndRetentionPriorityLevel = allocationAndRetentionPriorityLevel;
            MaximumBitRates = maximumBitRates;
            PreemptionCapability = preemptionCapability;
            PreemptionVulnerability = preemptionVulnerability;
            QosIndicator = qosIndicator;
        }
    }
}