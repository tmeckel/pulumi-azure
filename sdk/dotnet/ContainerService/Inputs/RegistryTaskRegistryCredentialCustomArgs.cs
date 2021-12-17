// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ContainerService.Inputs
{

    public sealed class RegistryTaskRegistryCredentialCustomArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The managed identity assigned to this custom credential. For user assigned identity, the value is the client ID of the identity. For system assigned identity, the value is `system`.
        /// </summary>
        [Input("identity")]
        public Input<string>? Identity { get; set; }

        /// <summary>
        /// The login server of the custom Container Registry.
        /// </summary>
        [Input("loginServer", required: true)]
        public Input<string> LoginServer { get; set; } = null!;

        /// <summary>
        /// The password for logging into the custom Container Registry. It can be either a plain text of password, or a Keyvault Secret ID.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The username for logging into the custom Container Registry. It can be either a plain text of username, or a Keyvault Secret ID.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public RegistryTaskRegistryCredentialCustomArgs()
        {
        }
    }
}