// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Inputs
{

    public sealed class ActionGroupEventHubReceiverArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource ID of the respective Event Hub.
        /// </summary>
        [Input("eventHubId", required: true)]
        public Input<string> EventHubId { get; set; } = null!;

        /// <summary>
        /// The name of the EventHub Receiver, must be unique within action group.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The Tenant ID for the subscription containing this Event Hub.
        /// </summary>
        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        /// <summary>
        /// Indicates whether to use common alert schema.
        /// </summary>
        [Input("useCommonAlertSchema")]
        public Input<bool>? UseCommonAlertSchema { get; set; }

        public ActionGroupEventHubReceiverArgs()
        {
        }
    }
}