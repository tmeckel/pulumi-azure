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
    public sealed class ScheduledQueryRulesAlertV2CriteriaFailingPeriods
    {
        /// <summary>
        /// Specifies the number of violations to trigger an alert. Should be smaller or equal to `number_of_evaluation_periods`. Possible value is integer between 1 and 6.
        /// </summary>
        public readonly int MinimumFailingPeriodsToTriggerAlert;
        /// <summary>
        /// Specifies the number of aggregated look-back points. The look-back time window is calculated based on the aggregation granularity `window_duration` and the selected number of aggregated points. Possible value is integer between 1 and 6.
        /// </summary>
        public readonly int NumberOfEvaluationPeriods;

        [OutputConstructor]
        private ScheduledQueryRulesAlertV2CriteriaFailingPeriods(
            int minimumFailingPeriodsToTriggerAlert,

            int numberOfEvaluationPeriods)
        {
            MinimumFailingPeriodsToTriggerAlert = minimumFailingPeriodsToTriggerAlert;
            NumberOfEvaluationPeriods = numberOfEvaluationPeriods;
        }
    }
}