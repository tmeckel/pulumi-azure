// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NetworkPacketCoreControlPlaneIdentity {
    /**
     * @return A list of the IDs for User Assigned Managed Identity resources to be assigned.
     * 
     */
    private List<String> identityIds;
    /**
     * @return Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    private String type;

    private NetworkPacketCoreControlPlaneIdentity() {}
    /**
     * @return A list of the IDs for User Assigned Managed Identity resources to be assigned.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds;
    }
    /**
     * @return Specifies the type of Managed Service Identity. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPacketCoreControlPlaneIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> identityIds;
        private String type;
        public Builder() {}
        public Builder(NetworkPacketCoreControlPlaneIdentity defaults) {
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
        public NetworkPacketCoreControlPlaneIdentity build() {
            final var _resultValue = new NetworkPacketCoreControlPlaneIdentity();
            _resultValue.identityIds = identityIds;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
