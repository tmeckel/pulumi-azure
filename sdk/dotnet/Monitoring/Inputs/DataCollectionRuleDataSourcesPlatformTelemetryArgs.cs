// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class DataCollectionRuleDataSourcesPlatformTelemetryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("streams", required: true)]
        private InputList<string>? _streams;

        /// <summary>
        /// Specifies a list of streams that this data source will be sent to. A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to. Possible values include but not limited to `Microsoft.Cache/redis:Metrics-Group-All`.
        /// </summary>
        public InputList<string> Streams
        {
            get => _streams ?? (_streams = new InputList<string>());
            set => _streams = value;
        }

        public DataCollectionRuleDataSourcesPlatformTelemetryArgs()
        {
        }
        public static new DataCollectionRuleDataSourcesPlatformTelemetryArgs Empty => new DataCollectionRuleDataSourcesPlatformTelemetryArgs();
    }
}