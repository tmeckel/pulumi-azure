// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceHostnameConfigurationDeveloperPortal {
    /**
     * @return One or more (up to 10) `certificate` blocks as defined below.
     * 
     */
    private @Nullable String certificate;
    /**
     * @return The password for the certificate.
     * 
     */
    private @Nullable String certificatePassword;
    /**
     * @return The source of the certificate.
     * 
     */
    private @Nullable String certificateSource;
    /**
     * @return The status of the certificate.
     * 
     */
    private @Nullable String certificateStatus;
    /**
     * @return The expiration date of the certificate in RFC3339 format: `2000-01-02T03:04:05Z`.
     * 
     */
    private @Nullable String expiry;
    /**
     * @return The Hostname to use for the Management API.
     * 
     */
    private String hostName;
    /**
     * @return The ID of the Key Vault Secret containing the SSL Certificate, which must be should be of the type `application/x-pkcs12`.
     * 
     */
    private @Nullable String keyVaultId;
    /**
     * @return Should Client Certificate Negotiation be enabled for this Hostname? Defaults to `false`.
     * 
     */
    private @Nullable Boolean negotiateClientCertificate;
    /**
     * @return The client id of the System or User Assigned Managed identity generated by Azure AD, which has `GET` access to the keyVault containing the SSL certificate.
     * 
     */
    private @Nullable String sslKeyvaultIdentityClientId;
    /**
     * @return The subject of the certificate.
     * 
     */
    private @Nullable String subject;
    /**
     * @return The thumbprint of the certificate.
     * 
     */
    private @Nullable String thumbprint;

    private ServiceHostnameConfigurationDeveloperPortal() {}
    /**
     * @return One or more (up to 10) `certificate` blocks as defined below.
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return The password for the certificate.
     * 
     */
    public Optional<String> certificatePassword() {
        return Optional.ofNullable(this.certificatePassword);
    }
    /**
     * @return The source of the certificate.
     * 
     */
    public Optional<String> certificateSource() {
        return Optional.ofNullable(this.certificateSource);
    }
    /**
     * @return The status of the certificate.
     * 
     */
    public Optional<String> certificateStatus() {
        return Optional.ofNullable(this.certificateStatus);
    }
    /**
     * @return The expiration date of the certificate in RFC3339 format: `2000-01-02T03:04:05Z`.
     * 
     */
    public Optional<String> expiry() {
        return Optional.ofNullable(this.expiry);
    }
    /**
     * @return The Hostname to use for the Management API.
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return The ID of the Key Vault Secret containing the SSL Certificate, which must be should be of the type `application/x-pkcs12`.
     * 
     */
    public Optional<String> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }
    /**
     * @return Should Client Certificate Negotiation be enabled for this Hostname? Defaults to `false`.
     * 
     */
    public Optional<Boolean> negotiateClientCertificate() {
        return Optional.ofNullable(this.negotiateClientCertificate);
    }
    /**
     * @return The client id of the System or User Assigned Managed identity generated by Azure AD, which has `GET` access to the keyVault containing the SSL certificate.
     * 
     */
    public Optional<String> sslKeyvaultIdentityClientId() {
        return Optional.ofNullable(this.sslKeyvaultIdentityClientId);
    }
    /**
     * @return The subject of the certificate.
     * 
     */
    public Optional<String> subject() {
        return Optional.ofNullable(this.subject);
    }
    /**
     * @return The thumbprint of the certificate.
     * 
     */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHostnameConfigurationDeveloperPortal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificate;
        private @Nullable String certificatePassword;
        private @Nullable String certificateSource;
        private @Nullable String certificateStatus;
        private @Nullable String expiry;
        private String hostName;
        private @Nullable String keyVaultId;
        private @Nullable Boolean negotiateClientCertificate;
        private @Nullable String sslKeyvaultIdentityClientId;
        private @Nullable String subject;
        private @Nullable String thumbprint;
        public Builder() {}
        public Builder(ServiceHostnameConfigurationDeveloperPortal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificatePassword = defaults.certificatePassword;
    	      this.certificateSource = defaults.certificateSource;
    	      this.certificateStatus = defaults.certificateStatus;
    	      this.expiry = defaults.expiry;
    	      this.hostName = defaults.hostName;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.negotiateClientCertificate = defaults.negotiateClientCertificate;
    	      this.sslKeyvaultIdentityClientId = defaults.sslKeyvaultIdentityClientId;
    	      this.subject = defaults.subject;
    	      this.thumbprint = defaults.thumbprint;
        }

        @CustomType.Setter
        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder certificatePassword(@Nullable String certificatePassword) {
            this.certificatePassword = certificatePassword;
            return this;
        }
        @CustomType.Setter
        public Builder certificateSource(@Nullable String certificateSource) {
            this.certificateSource = certificateSource;
            return this;
        }
        @CustomType.Setter
        public Builder certificateStatus(@Nullable String certificateStatus) {
            this.certificateStatus = certificateStatus;
            return this;
        }
        @CustomType.Setter
        public Builder expiry(@Nullable String expiry) {
            this.expiry = expiry;
            return this;
        }
        @CustomType.Setter
        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }
        @CustomType.Setter
        public Builder negotiateClientCertificate(@Nullable Boolean negotiateClientCertificate) {
            this.negotiateClientCertificate = negotiateClientCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder sslKeyvaultIdentityClientId(@Nullable String sslKeyvaultIdentityClientId) {
            this.sslKeyvaultIdentityClientId = sslKeyvaultIdentityClientId;
            return this;
        }
        @CustomType.Setter
        public Builder subject(@Nullable String subject) {
            this.subject = subject;
            return this;
        }
        @CustomType.Setter
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public ServiceHostnameConfigurationDeveloperPortal build() {
            final var o = new ServiceHostnameConfigurationDeveloperPortal();
            o.certificate = certificate;
            o.certificatePassword = certificatePassword;
            o.certificateSource = certificateSource;
            o.certificateStatus = certificateStatus;
            o.expiry = expiry;
            o.hostName = hostName;
            o.keyVaultId = keyVaultId;
            o.negotiateClientCertificate = negotiateClientCertificate;
            o.sslKeyvaultIdentityClientId = sslKeyvaultIdentityClientId;
            o.subject = subject;
            o.thumbprint = thumbprint;
            return o;
        }
    }
}