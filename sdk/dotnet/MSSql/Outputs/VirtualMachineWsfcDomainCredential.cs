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
    public sealed class VirtualMachineWsfcDomainCredential
    {
        /// <summary>
        /// The account password used for creating cluster.
        /// </summary>
        public readonly string ClusterBootstrapAccountPassword;
        /// <summary>
        /// The account password used for operating cluster.
        /// </summary>
        public readonly string ClusterOperatorAccountPassword;
        /// <summary>
        /// The account password under which SQL service will run on all participating SQL virtual machines in the cluster.
        /// </summary>
        public readonly string SqlServiceAccountPassword;

        [OutputConstructor]
        private VirtualMachineWsfcDomainCredential(
            string clusterBootstrapAccountPassword,

            string clusterOperatorAccountPassword,

            string sqlServiceAccountPassword)
        {
            ClusterBootstrapAccountPassword = clusterBootstrapAccountPassword;
            ClusterOperatorAccountPassword = clusterOperatorAccountPassword;
            SqlServiceAccountPassword = sqlServiceAccountPassword;
        }
    }
}