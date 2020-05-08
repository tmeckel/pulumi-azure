// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SignalR.Outputs
{

    [OutputType]
    public sealed class ServiceCor
    {
        /// <summary>
        /// A list of origins which should be able to make cross-origin calls. `*` can be used to allow all calls.
        /// </summary>
        public readonly ImmutableArray<string> AllowedOrigins;

        [OutputConstructor]
        private ServiceCor(ImmutableArray<string> allowedOrigins)
        {
            AllowedOrigins = allowedOrigins;
        }
    }
}