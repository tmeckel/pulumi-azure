// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterExtensionAksAssignedIdentity {
    /**
     * @return The principal ID of resource identity.
     * 
     */
    private @Nullable String principalId;
    /**
     * @return The tenant ID of resource.
     * 
     */
    private @Nullable String tenantId;
    /**
     * @return The identity type.
     * 
     */
    private @Nullable String type;

    private KubernetesClusterExtensionAksAssignedIdentity() {}
    /**
     * @return The principal ID of resource identity.
     * 
     */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * @return The tenant ID of resource.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return The identity type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterExtensionAksAssignedIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private @Nullable String type;
        public Builder() {}
        public Builder(KubernetesClusterExtensionAksAssignedIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public KubernetesClusterExtensionAksAssignedIdentity build() {
            final var _resultValue = new KubernetesClusterExtensionAksAssignedIdentity();
            _resultValue.principalId = principalId;
            _resultValue.tenantId = tenantId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
