// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Sql.Outputs
{

    [OutputType]
    public sealed class GetSqlManagedInstanceIdentityResult
    {
        public readonly string PrincipalId;
        public readonly string TenantId;
        public readonly string Type;
        public readonly string UserAssignedIdentityId;

        [OutputConstructor]
        private GetSqlManagedInstanceIdentityResult(
            string principalId,

            string tenantId,

            string type,

            string userAssignedIdentityId)
        {
            PrincipalId = principalId;
            TenantId = tenantId;
            Type = type;
            UserAssignedIdentityId = userAssignedIdentityId;
        }
    }
}