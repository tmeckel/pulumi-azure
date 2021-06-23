// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class BlobInventoryPolicyRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `filter` block as defined above.
        /// </summary>
        [Input("filter", required: true)]
        public Input<Inputs.BlobInventoryPolicyRuleFilterArgs> Filter { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this Blob Inventory Policy Rule.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public BlobInventoryPolicyRuleArgs()
        {
        }
    }
}