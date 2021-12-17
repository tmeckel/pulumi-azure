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
    public sealed class FailoverGroupReadWriteEndpointFailoverPolicy
    {
        /// <summary>
        /// The grace period in minutes, before failover with data loss is attempted for the read-write endpoint. Required when `mode` is `Automatic`.
        /// </summary>
        public readonly int? GraceMinutes;
        /// <summary>
        /// The failover policy of the read-write endpoint for the failover group. Possible values are `Automatic` or `Manual`.
        /// </summary>
        public readonly string Mode;

        [OutputConstructor]
        private FailoverGroupReadWriteEndpointFailoverPolicy(
            int? graceMinutes,

            string mode)
        {
            GraceMinutes = graceMinutes;
            Mode = mode;
        }
    }
}