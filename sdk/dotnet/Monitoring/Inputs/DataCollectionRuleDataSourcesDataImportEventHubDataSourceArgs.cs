// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class DataCollectionRuleDataSourcesDataImportEventHubDataSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Event Hub consumer group name.
        /// </summary>
        [Input("consumerGroup")]
        public Input<string>? ConsumerGroup { get; set; }

        /// <summary>
        /// The name which should be used for this data source. This name should be unique across all data sources regardless of type within the Data Collection Rule.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The stream to collect from Event Hub. Possible value should be a custom stream name.
        /// </summary>
        [Input("stream", required: true)]
        public Input<string> Stream { get; set; } = null!;

        public DataCollectionRuleDataSourcesDataImportEventHubDataSourceArgs()
        {
        }
        public static new DataCollectionRuleDataSourcesDataImportEventHubDataSourceArgs Empty => new DataCollectionRuleDataSourcesDataImportEventHubDataSourceArgs();
    }
}