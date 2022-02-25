// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MSSql.Outputs
{

    [OutputType]
    public sealed class ServerFoo
    {
        public readonly ImmutableArray<string> IdentityIds;
        /// <summary>
        /// The Principal ID for the Service Principal associated with the Identity of this SQL Server.
        /// </summary>
        public readonly string? PrincipalId;
        /// <summary>
        /// The tenant id of the Azure AD Administrator of this SQL Server.
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// Specifies the identity type of the Microsoft SQL Server. Possible values are `SystemAssigned` (where Azure will generate a Service Principal for you) and `UserAssigned` where you can specify the Service Principal IDs in the `user_assigned_identity_ids` field.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ServerFoo(
            ImmutableArray<string> identityIds,

            string? principalId,

            string? tenantId,

            string type)
        {
            IdentityIds = identityIds;
            PrincipalId = principalId;
            TenantId = tenantId;
            Type = type;
        }
    }
}