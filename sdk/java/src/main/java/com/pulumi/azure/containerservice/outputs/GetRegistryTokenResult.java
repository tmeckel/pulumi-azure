// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegistryTokenResult {
    private String containerRegistryName;
    /**
     * @return Whether this Token is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private String resourceGroupName;
    /**
     * @return The Scope Map ID used by the token.
     * 
     */
    private String scopeMapId;

    private GetRegistryTokenResult() {}
    public String containerRegistryName() {
        return this.containerRegistryName;
    }
    /**
     * @return Whether this Token is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The Scope Map ID used by the token.
     * 
     */
    public String scopeMapId() {
        return this.scopeMapId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryTokenResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String containerRegistryName;
        private Boolean enabled;
        private String id;
        private String name;
        private String resourceGroupName;
        private String scopeMapId;
        public Builder() {}
        public Builder(GetRegistryTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerRegistryName = defaults.containerRegistryName;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopeMapId = defaults.scopeMapId;
        }

        @CustomType.Setter
        public Builder containerRegistryName(String containerRegistryName) {
            this.containerRegistryName = Objects.requireNonNull(containerRegistryName);
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder scopeMapId(String scopeMapId) {
            this.scopeMapId = Objects.requireNonNull(scopeMapId);
            return this;
        }
        public GetRegistryTokenResult build() {
            final var o = new GetRegistryTokenResult();
            o.containerRegistryName = containerRegistryName;
            o.enabled = enabled;
            o.id = id;
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            o.scopeMapId = scopeMapId;
            return o;
        }
    }
}