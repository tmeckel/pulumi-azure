// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerApp.Inputs
{

    public sealed class AppTemplateAzureQueueScaleRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("authentications", required: true)]
        private InputList<Inputs.AppTemplateAzureQueueScaleRuleAuthenticationGetArgs>? _authentications;

        /// <summary>
        /// One or more `authentication` blocks as defined below.
        /// </summary>
        public InputList<Inputs.AppTemplateAzureQueueScaleRuleAuthenticationGetArgs> Authentications
        {
            get => _authentications ?? (_authentications = new InputList<Inputs.AppTemplateAzureQueueScaleRuleAuthenticationGetArgs>());
            set => _authentications = value;
        }

        /// <summary>
        /// The name of the Scaling Rule
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The value of the length of the queue to trigger scaling actions.
        /// </summary>
        [Input("queueLength", required: true)]
        public Input<int> QueueLength { get; set; } = null!;

        /// <summary>
        /// The name of the Azure Queue
        /// </summary>
        [Input("queueName", required: true)]
        public Input<string> QueueName { get; set; } = null!;

        public AppTemplateAzureQueueScaleRuleGetArgs()
        {
        }
        public static new AppTemplateAzureQueueScaleRuleGetArgs Empty => new AppTemplateAzureQueueScaleRuleGetArgs();
    }
}