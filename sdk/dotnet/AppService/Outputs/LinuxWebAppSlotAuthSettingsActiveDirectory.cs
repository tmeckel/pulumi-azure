// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class LinuxWebAppSlotAuthSettingsActiveDirectory
    {
        /// <summary>
        /// Specifies a list of Allowed audience values to consider when validating JWTs issued by Azure Active Directory.
        /// </summary>
        public readonly ImmutableArray<string> AllowedAudiences;
        /// <summary>
        /// The ID of the Client to use to authenticate with Azure Active Directory.
        /// </summary>
        public readonly string ClientId;
        /// <summary>
        /// The Client Secret for the Client ID. Cannot be used with `client_secret_setting_name`.
        /// </summary>
        public readonly string? ClientSecret;
        /// <summary>
        /// The App Setting name that contains the client secret of the Client. Cannot be used with `client_secret`.
        /// </summary>
        public readonly string? ClientSecretSettingName;

        [OutputConstructor]
        private LinuxWebAppSlotAuthSettingsActiveDirectory(
            ImmutableArray<string> allowedAudiences,

            string clientId,

            string? clientSecret,

            string? clientSecretSettingName)
        {
            AllowedAudiences = allowedAudiences;
            ClientId = clientId;
            ClientSecret = clientSecret;
            ClientSecretSettingName = clientSecretSettingName;
        }
    }
}