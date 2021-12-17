// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.LogicApps.Inputs
{

    public sealed class IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The end time of the schedule, formatted as an RFC3339 string.
        /// </summary>
        [Input("endTime")]
        public Input<string>? EndTime { get; set; }

        /// <summary>
        /// The frequency of the schedule. Possible values are `Day`, `Hour`, `Minute`, `Month`, `Second`, `Week` and `Year`.
        /// </summary>
        [Input("frequency", required: true)]
        public Input<string> Frequency { get; set; } = null!;

        /// <summary>
        /// The number of `frequency`s between runs.
        /// </summary>
        [Input("interval", required: true)]
        public Input<int> Interval { get; set; } = null!;

        /// <summary>
        /// A `schedule` block as documented below.
        /// </summary>
        [Input("schedule")]
        public Input<Inputs.IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceScheduleGetArgs>? Schedule { get; set; }

        /// <summary>
        /// The start time of the schedule, formatted as an RFC3339 string.
        /// </summary>
        [Input("startTime")]
        public Input<string>? StartTime { get; set; }

        /// <summary>
        /// The timezone of the start/end time.
        /// </summary>
        [Input("timeZone")]
        public Input<string>? TimeZone { get; set; }

        public IntegrationAccountBatchConfigurationReleaseCriteriaRecurrenceGetArgs()
        {
        }
    }
}