// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class RegistryTaskSourceTriggerAuthenticationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Time in seconds that the token remains valid.
        /// </summary>
        [Input("expireInSeconds")]
        public Input<int>? ExpireInSeconds { get; set; }

        /// <summary>
        /// The refresh token used to refresh the access token.
        /// </summary>
        [Input("refreshToken")]
        public Input<string>? RefreshToken { get; set; }

        /// <summary>
        /// The scope of the access token.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// The access token used to access the source control provider.
        /// </summary>
        [Input("token", required: true)]
        public Input<string> Token { get; set; } = null!;

        /// <summary>
        /// The type of the token. Possible values are `PAT` (personal access token) and `OAuth`.
        /// </summary>
        [Input("tokenType", required: true)]
        public Input<string> TokenType { get; set; } = null!;

        public RegistryTaskSourceTriggerAuthenticationArgs()
        {
        }
    }
}