// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWorkspaceIdentity {
    /**
     * @return A list of User Assigned Identity IDs assigned to this Machine Learning Workspace.
     * 
     */
    private List<String> identityIds;
    /**
     * @return The Principal ID of the System Assigned Managed Identity assigned to this Machine Learning Workspace.
     * 
     */
    private String principalId;
    /**
     * @return The Tenant ID of the System Assigned Managed Identity assigned to this Machine Learning Workspace.
     * 
     */
    private String tenantId;
    /**
     * @return The Type of Managed Identity assigned to this Machine Learning Workspace.
     * 
     */
    private String type;

    private GetWorkspaceIdentity() {}
    /**
     * @return A list of User Assigned Identity IDs assigned to this Machine Learning Workspace.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds;
    }
    /**
     * @return The Principal ID of the System Assigned Managed Identity assigned to this Machine Learning Workspace.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The Tenant ID of the System Assigned Managed Identity assigned to this Machine Learning Workspace.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The Type of Managed Identity assigned to this Machine Learning Workspace.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> identityIds;
        private String principalId;
        private String tenantId;
        private String type;
        public Builder() {}
        public Builder(GetWorkspaceIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
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
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWorkspaceIdentity build() {
            final var o = new GetWorkspaceIdentity();
            o.identityIds = identityIds;
            o.principalId = principalId;
            o.tenantId = tenantId;
            o.type = type;
            return o;
        }
    }
}