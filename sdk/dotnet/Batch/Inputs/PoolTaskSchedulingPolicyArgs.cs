// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Batch.Inputs
{

    public sealed class PoolTaskSchedulingPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Supported values are "Pack" and "Spread". "Pack" means as many tasks as possible (taskSlotsPerNode) should be assigned to each node in the pool before any tasks are assigned to the next node in the pool. "Spread" means that tasks should be assigned evenly across all nodes in the pool.
        /// </summary>
        [Input("nodeFillType")]
        public Input<string>? NodeFillType { get; set; }

        public PoolTaskSchedulingPolicyArgs()
        {
        }
        public static new PoolTaskSchedulingPolicyArgs Empty => new PoolTaskSchedulingPolicyArgs();
    }
}