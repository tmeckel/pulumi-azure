// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ElasticCloud.Inputs
{

    public sealed class GetElasticsearchLogInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("filteringTags", required: true)]
        private InputList<Inputs.GetElasticsearchLogFilteringTagInputArgs>? _filteringTags;

        /// <summary>
        /// A list of `filtering_tag` blocks as defined above.
        /// </summary>
        public InputList<Inputs.GetElasticsearchLogFilteringTagInputArgs> FilteringTags
        {
            get => _filteringTags ?? (_filteringTags = new InputList<Inputs.GetElasticsearchLogFilteringTagInputArgs>());
            set => _filteringTags = value;
        }

        /// <summary>
        /// Should the Azure Activity Logs should be sent to the Elasticsearch cluster?
        /// </summary>
        [Input("sendActivityLogs", required: true)]
        public Input<bool> SendActivityLogs { get; set; } = null!;

        /// <summary>
        /// Should the AzureAD Logs should be sent to the Elasticsearch cluster?
        /// </summary>
        [Input("sendAzureadLogs", required: true)]
        public Input<bool> SendAzureadLogs { get; set; } = null!;

        /// <summary>
        /// Should the Azure Subscription Logs should be sent to the Elasticsearch cluster?
        /// </summary>
        [Input("sendSubscriptionLogs", required: true)]
        public Input<bool> SendSubscriptionLogs { get; set; } = null!;

        public GetElasticsearchLogInputArgs()
        {
        }
        public static new GetElasticsearchLogInputArgs Empty => new GetElasticsearchLogInputArgs();
    }
}