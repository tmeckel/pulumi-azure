// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationAccountCertificateKeyVaultKey {
    /**
     * @return The name of Key Vault Key.
     * 
     */
    private String keyName;
    /**
     * @return The ID of the Key Vault.
     * 
     */
    private String keyVaultId;
    /**
     * @return The version of Key Vault Key.
     * 
     */
    private @Nullable String keyVersion;

    private IntegrationAccountCertificateKeyVaultKey() {}
    /**
     * @return The name of Key Vault Key.
     * 
     */
    public String keyName() {
        return this.keyName;
    }
    /**
     * @return The ID of the Key Vault.
     * 
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }
    /**
     * @return The version of Key Vault Key.
     * 
     */
    public Optional<String> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountCertificateKeyVaultKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String keyName;
        private String keyVaultId;
        private @Nullable String keyVersion;
        public Builder() {}
        public Builder(IntegrationAccountCertificateKeyVaultKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVersion = defaults.keyVersion;
        }

        @CustomType.Setter
        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultId(String keyVaultId) {
            this.keyVaultId = Objects.requireNonNull(keyVaultId);
            return this;
        }
        @CustomType.Setter
        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        public IntegrationAccountCertificateKeyVaultKey build() {
            final var o = new IntegrationAccountCertificateKeyVaultKey();
            o.keyName = keyName;
            o.keyVaultId = keyVaultId;
            o.keyVersion = keyVersion;
            return o;
        }
    }
}