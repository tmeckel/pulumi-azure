// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterKeyVaultSecretsProviderSecretIdentity;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKubernetesClusterKeyVaultSecretsProvider {
    /**
     * @return A `secret_identity` block as documented below.
     * 
     */
    private List<GetKubernetesClusterKeyVaultSecretsProviderSecretIdentity> secretIdentities;
    /**
     * @return Is secret rotation enabled?
     * 
     */
    private Boolean secretRotationEnabled;
    /**
     * @return The interval to poll for secret rotation.
     * 
     */
    private String secretRotationInterval;

    private GetKubernetesClusterKeyVaultSecretsProvider() {}
    /**
     * @return A `secret_identity` block as documented below.
     * 
     */
    public List<GetKubernetesClusterKeyVaultSecretsProviderSecretIdentity> secretIdentities() {
        return this.secretIdentities;
    }
    /**
     * @return Is secret rotation enabled?
     * 
     */
    public Boolean secretRotationEnabled() {
        return this.secretRotationEnabled;
    }
    /**
     * @return The interval to poll for secret rotation.
     * 
     */
    public String secretRotationInterval() {
        return this.secretRotationInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterKeyVaultSecretsProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetKubernetesClusterKeyVaultSecretsProviderSecretIdentity> secretIdentities;
        private Boolean secretRotationEnabled;
        private String secretRotationInterval;
        public Builder() {}
        public Builder(GetKubernetesClusterKeyVaultSecretsProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretIdentities = defaults.secretIdentities;
    	      this.secretRotationEnabled = defaults.secretRotationEnabled;
    	      this.secretRotationInterval = defaults.secretRotationInterval;
        }

        @CustomType.Setter
        public Builder secretIdentities(List<GetKubernetesClusterKeyVaultSecretsProviderSecretIdentity> secretIdentities) {
            this.secretIdentities = Objects.requireNonNull(secretIdentities);
            return this;
        }
        public Builder secretIdentities(GetKubernetesClusterKeyVaultSecretsProviderSecretIdentity... secretIdentities) {
            return secretIdentities(List.of(secretIdentities));
        }
        @CustomType.Setter
        public Builder secretRotationEnabled(Boolean secretRotationEnabled) {
            this.secretRotationEnabled = Objects.requireNonNull(secretRotationEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder secretRotationInterval(String secretRotationInterval) {
            this.secretRotationInterval = Objects.requireNonNull(secretRotationInterval);
            return this;
        }
        public GetKubernetesClusterKeyVaultSecretsProvider build() {
            final var o = new GetKubernetesClusterKeyVaultSecretsProvider();
            o.secretIdentities = secretIdentities;
            o.secretRotationEnabled = secretRotationEnabled;
            o.secretRotationInterval = secretRotationInterval;
            return o;
        }
    }
}