// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Outputs
{

    [OutputType]
    public sealed class ApplicationGatewayBackendHttpSettingConnectionDraining
    {
        /// <summary>
        /// The number of seconds connection draining is active. Acceptable values are from `1` second to `3600` seconds.
        /// </summary>
        public readonly int DrainTimeoutSec;
        /// <summary>
        /// If connection draining is enabled or not.
        /// </summary>
        public readonly bool Enabled;

        [OutputConstructor]
        private ApplicationGatewayBackendHttpSettingConnectionDraining(
            int drainTimeoutSec,

            bool enabled)
        {
            DrainTimeoutSec = drainTimeoutSec;
            Enabled = enabled;
        }
    }
}