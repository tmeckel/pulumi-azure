// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SiteRecovery.Outputs
{

    [OutputType]
    public sealed class ReplicationRecoveryPlanBootRecoveryGroup
    {
        /// <summary>
        /// one or more `action` block as defined below. which will be executed after the group recovery.
        /// </summary>
        public readonly ImmutableArray<Outputs.ReplicationRecoveryPlanBootRecoveryGroupPostAction> PostActions;
        /// <summary>
        /// one or more `action` block as defined below. which will be executed before the group recovery.
        /// </summary>
        public readonly ImmutableArray<Outputs.ReplicationRecoveryPlanBootRecoveryGroupPreAction> PreActions;
        /// <summary>
        /// One or more protected VM IDs. It must not be specified when `type` is `Shutdown`.
        /// </summary>
        public readonly ImmutableArray<string> ReplicatedProtectedItems;

        [OutputConstructor]
        private ReplicationRecoveryPlanBootRecoveryGroup(
            ImmutableArray<Outputs.ReplicationRecoveryPlanBootRecoveryGroupPostAction> postActions,

            ImmutableArray<Outputs.ReplicationRecoveryPlanBootRecoveryGroupPreAction> preActions,

            ImmutableArray<string> replicatedProtectedItems)
        {
            PostActions = postActions;
            PreActions = preActions;
            ReplicatedProtectedItems = replicatedProtectedItems;
        }
    }
}