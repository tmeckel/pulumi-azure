// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Dashboard.Outputs
{

    [OutputType]
    public sealed class GrafanaIdentity
    {
        /// <summary>
        /// The Principal ID associated with this Managed Service Identity.
        /// </summary>
        public readonly string? PrincipalId;
        /// <summary>
        /// The Tenant ID associated with this Managed Service Identity.
        /// </summary>
        public readonly string? TenantId;
        /// <summary>
        /// Specifies the type of Managed Service Identity. The only possible values is `SystemAssigned`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GrafanaIdentity(
            string? principalId,

            string? tenantId,

            string type)
        {
            PrincipalId = principalId;
            TenantId = tenantId;
            Type = type;
        }
    }
}