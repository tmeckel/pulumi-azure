// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform.Inputs
{

    public sealed class SpringCloudGatewayClientAuthorizationArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificateIds")]
        private InputList<string>? _certificateIds;

        /// <summary>
        /// Specifies the Spring Cloud Certificate IDs of the Spring Cloud Gateway.
        /// </summary>
        public InputList<string> CertificateIds
        {
            get => _certificateIds ?? (_certificateIds = new InputList<string>());
            set => _certificateIds = value;
        }

        /// <summary>
        /// Specifies whether the client certificate verification is enabled.
        /// </summary>
        [Input("verificationEnabled")]
        public Input<bool>? VerificationEnabled { get; set; }

        public SpringCloudGatewayClientAuthorizationArgs()
        {
        }
        public static new SpringCloudGatewayClientAuthorizationArgs Empty => new SpringCloudGatewayClientAuthorizationArgs();
    }
}