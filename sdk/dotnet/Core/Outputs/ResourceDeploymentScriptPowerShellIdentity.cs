// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core.Outputs
{

    [OutputType]
    public sealed class ResourceDeploymentScriptPowerShellIdentity
    {
        /// <summary>
        /// Specifies the list of user-assigned managed identity IDs associated with the resource.
        /// </summary>
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// Type of the managed identity. The only possible value is `UserAssigned`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ResourceDeploymentScriptPowerShellIdentity(
            ImmutableArray<string> identityIds,

            string type)
        {
            IdentityIds = identityIds;
            Type = type;
        }
    }
}