// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Inputs
{

    public sealed class WindowsWebAppSlotSiteConfigAutoHealSettingTriggerStatusCodeGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of occurrences of the defined `status_code` in the specified `interval` on which to trigger this rule.
        /// </summary>
        [Input("count", required: true)]
        public Input<int> Count { get; set; } = null!;

        /// <summary>
        /// The time interval in the form `hh:mm:ss`.
        /// </summary>
        [Input("interval", required: true)]
        public Input<string> Interval { get; set; } = null!;

        /// <summary>
        /// The path to which this rule status code applies.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The status code for this rule, accepts single status codes and status code ranges. e.g. `500` or `400-499`. Possible values are integers between `101` and `599`
        /// </summary>
        [Input("statusCodeRange", required: true)]
        public Input<string> StatusCodeRange { get; set; } = null!;

        /// <summary>
        /// The Request Sub Status of the Status Code.
        /// </summary>
        [Input("subStatus")]
        public Input<int>? SubStatus { get; set; }

        /// <summary>
        /// The Win32 Status Code of the Request.
        /// </summary>
        [Input("win32Status")]
        public Input<string>? Win32Status { get; set; }

        public WindowsWebAppSlotSiteConfigAutoHealSettingTriggerStatusCodeGetArgs()
        {
        }
    }
}