// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.KeyVault.Outputs
{

    [OutputType]
    public sealed class GetManagedHardwareSecurityModuleRoleDefinitionPermissionResult
    {
        /// <summary>
        /// A list of action permission granted.
        /// </summary>
        public readonly ImmutableArray<string> Actions;
        /// <summary>
        /// A list of data action permission granted.
        /// </summary>
        public readonly ImmutableArray<string> DataActions;
        /// <summary>
        /// A list of action permission excluded (but not denied).
        /// </summary>
        public readonly ImmutableArray<string> NotActions;
        /// <summary>
        /// (Optional) A list of data action permission granted.
        /// </summary>
        public readonly ImmutableArray<string> NotDataActions;

        [OutputConstructor]
        private GetManagedHardwareSecurityModuleRoleDefinitionPermissionResult(
            ImmutableArray<string> actions,

            ImmutableArray<string> dataActions,

            ImmutableArray<string> notActions,

            ImmutableArray<string> notDataActions)
        {
            Actions = actions;
            DataActions = dataActions;
            NotActions = notActions;
            NotDataActions = notDataActions;
        }
    }
}