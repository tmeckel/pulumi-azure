// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn.Outputs
{

    [OutputType]
    public sealed class FrontdoorRuleActionsUrlRewriteAction
    {
        /// <summary>
        /// The destination path to use in the rewrite. The destination path overwrites the source pattern.
        /// </summary>
        public readonly string Destination;
        /// <summary>
        /// Append the remaining path after the source pattern to the new destination path? Possible values `true` or `false`. Defaults to `false`.
        /// </summary>
        public readonly bool? PreserveUnmatchedPath;
        /// <summary>
        /// The source pattern in the URL path to replace. This uses prefix-based matching. For example, to match all URL paths use a forward slash `"/"` as the source pattern value.
        /// </summary>
        public readonly string SourcePattern;

        [OutputConstructor]
        private FrontdoorRuleActionsUrlRewriteAction(
            string destination,

            bool? preserveUnmatchedPath,

            string sourcePattern)
        {
            Destination = destination;
            PreserveUnmatchedPath = preserveUnmatchedPath;
            SourcePattern = sourcePattern;
        }
    }
}