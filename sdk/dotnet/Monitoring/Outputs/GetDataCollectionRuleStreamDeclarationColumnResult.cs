// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Monitoring.Outputs
{

    [OutputType]
    public sealed class GetDataCollectionRuleStreamDeclarationColumnResult
    {
        /// <summary>
        /// Specifies the name of the Data Collection Rule.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// cSpecifies the type of Managed Service Identity that should be configured on this Data Collection Rule. Possible values are `SystemAssigned` and `UserAssigned`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetDataCollectionRuleStreamDeclarationColumnResult(
            string name,

            string type)
        {
            Name = name;
            Type = type;
        }
    }
}