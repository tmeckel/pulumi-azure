// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ResourceDeploymentScriptPowerShellIdentity {
    /**
     * @return Specifies the list of user-assigned managed identity IDs associated with the resource.
     * 
     */
    private List<String> identityIds;
    /**
     * @return Type of the managed identity. The only possible value is `UserAssigned`.
     * 
     */
    private String type;

    private ResourceDeploymentScriptPowerShellIdentity() {}
    /**
     * @return Specifies the list of user-assigned managed identity IDs associated with the resource.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds;
    }
    /**
     * @return Type of the managed identity. The only possible value is `UserAssigned`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceDeploymentScriptPowerShellIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> identityIds;
        private String type;
        public Builder() {}
        public Builder(ResourceDeploymentScriptPowerShellIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder identityIds(List<String> identityIds) {
            this.identityIds = Objects.requireNonNull(identityIds);
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ResourceDeploymentScriptPowerShellIdentity build() {
            final var o = new ResourceDeploymentScriptPowerShellIdentity();
            o.identityIds = identityIds;
            o.type = type;
            return o;
        }
    }
}