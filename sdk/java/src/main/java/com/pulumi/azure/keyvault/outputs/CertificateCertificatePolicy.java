// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicyIssuerParameters;
import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicyKeyProperties;
import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicyLifetimeAction;
import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicySecretProperties;
import com.pulumi.azure.keyvault.outputs.CertificateCertificatePolicyX509CertificateProperties;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificatePolicy {
    /**
     * @return A `issuer_parameters` block as defined below.
     * 
     */
    private CertificateCertificatePolicyIssuerParameters issuerParameters;
    /**
     * @return A `key_properties` block as defined below.
     * 
     */
    private CertificateCertificatePolicyKeyProperties keyProperties;
    /**
     * @return A `lifetime_action` block as defined below.
     * 
     */
    private @Nullable List<CertificateCertificatePolicyLifetimeAction> lifetimeActions;
    /**
     * @return A `secret_properties` block as defined below.
     * 
     */
    private CertificateCertificatePolicySecretProperties secretProperties;
    /**
     * @return A `x509_certificate_properties` block as defined below. Required when `certificate` block is not specified.
     * 
     */
    private @Nullable CertificateCertificatePolicyX509CertificateProperties x509CertificateProperties;

    private CertificateCertificatePolicy() {}
    /**
     * @return A `issuer_parameters` block as defined below.
     * 
     */
    public CertificateCertificatePolicyIssuerParameters issuerParameters() {
        return this.issuerParameters;
    }
    /**
     * @return A `key_properties` block as defined below.
     * 
     */
    public CertificateCertificatePolicyKeyProperties keyProperties() {
        return this.keyProperties;
    }
    /**
     * @return A `lifetime_action` block as defined below.
     * 
     */
    public List<CertificateCertificatePolicyLifetimeAction> lifetimeActions() {
        return this.lifetimeActions == null ? List.of() : this.lifetimeActions;
    }
    /**
     * @return A `secret_properties` block as defined below.
     * 
     */
    public CertificateCertificatePolicySecretProperties secretProperties() {
        return this.secretProperties;
    }
    /**
     * @return A `x509_certificate_properties` block as defined below. Required when `certificate` block is not specified.
     * 
     */
    public Optional<CertificateCertificatePolicyX509CertificateProperties> x509CertificateProperties() {
        return Optional.ofNullable(this.x509CertificateProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificatePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private CertificateCertificatePolicyIssuerParameters issuerParameters;
        private CertificateCertificatePolicyKeyProperties keyProperties;
        private @Nullable List<CertificateCertificatePolicyLifetimeAction> lifetimeActions;
        private CertificateCertificatePolicySecretProperties secretProperties;
        private @Nullable CertificateCertificatePolicyX509CertificateProperties x509CertificateProperties;
        public Builder() {}
        public Builder(CertificateCertificatePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuerParameters = defaults.issuerParameters;
    	      this.keyProperties = defaults.keyProperties;
    	      this.lifetimeActions = defaults.lifetimeActions;
    	      this.secretProperties = defaults.secretProperties;
    	      this.x509CertificateProperties = defaults.x509CertificateProperties;
        }

        @CustomType.Setter
        public Builder issuerParameters(CertificateCertificatePolicyIssuerParameters issuerParameters) {
            this.issuerParameters = Objects.requireNonNull(issuerParameters);
            return this;
        }
        @CustomType.Setter
        public Builder keyProperties(CertificateCertificatePolicyKeyProperties keyProperties) {
            this.keyProperties = Objects.requireNonNull(keyProperties);
            return this;
        }
        @CustomType.Setter
        public Builder lifetimeActions(@Nullable List<CertificateCertificatePolicyLifetimeAction> lifetimeActions) {
            this.lifetimeActions = lifetimeActions;
            return this;
        }
        public Builder lifetimeActions(CertificateCertificatePolicyLifetimeAction... lifetimeActions) {
            return lifetimeActions(List.of(lifetimeActions));
        }
        @CustomType.Setter
        public Builder secretProperties(CertificateCertificatePolicySecretProperties secretProperties) {
            this.secretProperties = Objects.requireNonNull(secretProperties);
            return this;
        }
        @CustomType.Setter
        public Builder x509CertificateProperties(@Nullable CertificateCertificatePolicyX509CertificateProperties x509CertificateProperties) {
            this.x509CertificateProperties = x509CertificateProperties;
            return this;
        }
        public CertificateCertificatePolicy build() {
            final var o = new CertificateCertificatePolicy();
            o.issuerParameters = issuerParameters;
            o.keyProperties = keyProperties;
            o.lifetimeActions = lifetimeActions;
            o.secretProperties = secretProperties;
            o.x509CertificateProperties = x509CertificateProperties;
            return o;
        }
    }
}