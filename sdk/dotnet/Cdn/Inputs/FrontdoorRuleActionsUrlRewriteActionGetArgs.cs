// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Inputs
{

    public sealed class FrontdoorRuleActionsUrlRewriteActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The destination path to use in the rewrite. The destination path overwrites the source pattern.
        /// </summary>
        [Input("destination", required: true)]
        public Input<string> Destination { get; set; } = null!;

        /// <summary>
        /// Append the remaining path after the source pattern to the new destination path? Possible values `true` or `false`. Defaults to `false`.
        /// </summary>
        [Input("preserveUnmatchedPath")]
        public Input<bool>? PreserveUnmatchedPath { get; set; }

        /// <summary>
        /// The source pattern in the URL path to replace. This uses prefix-based matching. For example, to match all URL paths use a forward slash `"/"` as the source pattern value.
        /// </summary>
        [Input("sourcePattern", required: true)]
        public Input<string> SourcePattern { get; set; } = null!;

        public FrontdoorRuleActionsUrlRewriteActionGetArgs()
        {
        }
        public static new FrontdoorRuleActionsUrlRewriteActionGetArgs Empty => new FrontdoorRuleActionsUrlRewriteActionGetArgs();
    }
}