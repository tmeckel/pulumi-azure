// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ApiManagement.Outputs
{

    [OutputType]
    public sealed class CustomDomainGateway
    {
        /// <summary>
        /// The Base64 Encoded Certificate. (Mutually exclusive with `key_vault_id`.)
        /// </summary>
        public readonly string? Certificate;
        /// <summary>
        /// The password associated with the certificate provided above.
        /// </summary>
        public readonly string? CertificatePassword;
        /// <summary>
        /// Is the certificate associated with this Hostname the Default SSL Certificate? This is used when an SNI header isn't specified by a client. Defaults to false.
        /// </summary>
        public readonly bool? DefaultSslBinding;
        public readonly string? Expiry;
        /// <summary>
        /// The Hostname to use for the API Proxy Endpoint.
        /// </summary>
        public readonly string HostName;
        /// <summary>
        /// The ID of the Key Vault Secret containing the SSL Certificate, which must be should be of the type application/x-pkcs12.
        /// </summary>
        public readonly string? KeyVaultId;
        /// <summary>
        /// Should Client Certificate Negotiation be enabled for this Hostname? Defaults to false.
        /// </summary>
        public readonly bool? NegotiateClientCertificate;
        public readonly string? SslKeyvaultIdentityClientId;
        public readonly string? Subject;
        public readonly string? Thumbprint;

        [OutputConstructor]
        private CustomDomainGateway(
            string? certificate,

            string? certificatePassword,

            bool? defaultSslBinding,

            string? expiry,

            string hostName,

            string? keyVaultId,

            bool? negotiateClientCertificate,

            string? sslKeyvaultIdentityClientId,

            string? subject,

            string? thumbprint)
        {
            Certificate = certificate;
            CertificatePassword = certificatePassword;
            DefaultSslBinding = defaultSslBinding;
            Expiry = expiry;
            HostName = hostName;
            KeyVaultId = keyVaultId;
            NegotiateClientCertificate = negotiateClientCertificate;
            SslKeyvaultIdentityClientId = sslKeyvaultIdentityClientId;
            Subject = subject;
            Thumbprint = thumbprint;
        }
    }
}