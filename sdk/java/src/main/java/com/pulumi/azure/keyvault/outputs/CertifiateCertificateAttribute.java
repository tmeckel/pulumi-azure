// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertifiateCertificateAttribute {
    /**
     * @return The create time of the Key Vault Certificate.
     * 
     */
    private @Nullable String created;
    /**
     * @return whether the Key Vault Certificate is enabled.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The expires time of the Key Vault Certificate.
     * 
     */
    private @Nullable String expires;
    /**
     * @return The not before valid time of the Key Vault Certificate.
     * 
     */
    private @Nullable String notBefore;
    /**
     * @return The deletion recovery level of the Key Vault Certificate.
     * 
     */
    private @Nullable String recoveryLevel;
    /**
     * @return The recent update time of the Key Vault Certificate.
     * 
     */
    private @Nullable String updated;

    private CertifiateCertificateAttribute() {}
    /**
     * @return The create time of the Key Vault Certificate.
     * 
     */
    public Optional<String> created() {
        return Optional.ofNullable(this.created);
    }
    /**
     * @return whether the Key Vault Certificate is enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The expires time of the Key Vault Certificate.
     * 
     */
    public Optional<String> expires() {
        return Optional.ofNullable(this.expires);
    }
    /**
     * @return The not before valid time of the Key Vault Certificate.
     * 
     */
    public Optional<String> notBefore() {
        return Optional.ofNullable(this.notBefore);
    }
    /**
     * @return The deletion recovery level of the Key Vault Certificate.
     * 
     */
    public Optional<String> recoveryLevel() {
        return Optional.ofNullable(this.recoveryLevel);
    }
    /**
     * @return The recent update time of the Key Vault Certificate.
     * 
     */
    public Optional<String> updated() {
        return Optional.ofNullable(this.updated);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertifiateCertificateAttribute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String created;
        private @Nullable Boolean enabled;
        private @Nullable String expires;
        private @Nullable String notBefore;
        private @Nullable String recoveryLevel;
        private @Nullable String updated;
        public Builder() {}
        public Builder(CertifiateCertificateAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.enabled = defaults.enabled;
    	      this.expires = defaults.expires;
    	      this.notBefore = defaults.notBefore;
    	      this.recoveryLevel = defaults.recoveryLevel;
    	      this.updated = defaults.updated;
        }

        @CustomType.Setter
        public Builder created(@Nullable String created) {
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder expires(@Nullable String expires) {
            this.expires = expires;
            return this;
        }
        @CustomType.Setter
        public Builder notBefore(@Nullable String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        @CustomType.Setter
        public Builder recoveryLevel(@Nullable String recoveryLevel) {
            this.recoveryLevel = recoveryLevel;
            return this;
        }
        @CustomType.Setter
        public Builder updated(@Nullable String updated) {
            this.updated = updated;
            return this;
        }
        public CertifiateCertificateAttribute build() {
            final var o = new CertifiateCertificateAttribute();
            o.created = created;
            o.enabled = enabled;
            o.expires = expires;
            o.notBefore = notBefore;
            o.recoveryLevel = recoveryLevel;
            o.updated = updated;
            return o;
        }
    }
}