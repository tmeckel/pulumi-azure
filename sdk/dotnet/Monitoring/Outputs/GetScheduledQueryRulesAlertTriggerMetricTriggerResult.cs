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
    public sealed class GetScheduledQueryRulesAlertTriggerMetricTriggerResult
    {
        public readonly string MetricColumn;
        public readonly string MetricTriggerType;
        /// <summary>
        /// Evaluation operation for rule.
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// Result or count threshold based on which rule should be triggered.
        /// </summary>
        public readonly double Threshold;

        [OutputConstructor]
        private GetScheduledQueryRulesAlertTriggerMetricTriggerResult(
            string metricColumn,

            string metricTriggerType,

            string @operator,

            double threshold)
        {
            MetricColumn = metricColumn;
            MetricTriggerType = metricTriggerType;
            Operator = @operator;
            Threshold = threshold;
        }
    }
}