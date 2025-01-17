// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetVirtualHubConnectionRouting;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualHubConnectionResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Whether Internet Security is enabled to secure internet traffic on this connection
     * 
     */
    private Boolean internetSecurityEnabled;
    /**
     * @return The name which is used for this Static Route.
     * 
     */
    private String name;
    /**
     * @return The ID of the Virtual Network which the Virtual Hub is connected
     * 
     */
    private String remoteVirtualNetworkId;
    private String resourceGroupName;
    /**
     * @return A `routing` block as defined below.
     * 
     */
    private List<GetVirtualHubConnectionRouting> routings;
    /**
     * @return The ID of the Virtual Hub within which this connection is created
     * 
     */
    private String virtualHubId;
    private String virtualHubName;

    private GetVirtualHubConnectionResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether Internet Security is enabled to secure internet traffic on this connection
     * 
     */
    public Boolean internetSecurityEnabled() {
        return this.internetSecurityEnabled;
    }
    /**
     * @return The name which is used for this Static Route.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the Virtual Network which the Virtual Hub is connected
     * 
     */
    public String remoteVirtualNetworkId() {
        return this.remoteVirtualNetworkId;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A `routing` block as defined below.
     * 
     */
    public List<GetVirtualHubConnectionRouting> routings() {
        return this.routings;
    }
    /**
     * @return The ID of the Virtual Hub within which this connection is created
     * 
     */
    public String virtualHubId() {
        return this.virtualHubId;
    }
    public String virtualHubName() {
        return this.virtualHubName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualHubConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Boolean internetSecurityEnabled;
        private String name;
        private String remoteVirtualNetworkId;
        private String resourceGroupName;
        private List<GetVirtualHubConnectionRouting> routings;
        private String virtualHubId;
        private String virtualHubName;
        public Builder() {}
        public Builder(GetVirtualHubConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.internetSecurityEnabled = defaults.internetSecurityEnabled;
    	      this.name = defaults.name;
    	      this.remoteVirtualNetworkId = defaults.remoteVirtualNetworkId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routings = defaults.routings;
    	      this.virtualHubId = defaults.virtualHubId;
    	      this.virtualHubName = defaults.virtualHubName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder internetSecurityEnabled(Boolean internetSecurityEnabled) {
            this.internetSecurityEnabled = Objects.requireNonNull(internetSecurityEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder remoteVirtualNetworkId(String remoteVirtualNetworkId) {
            this.remoteVirtualNetworkId = Objects.requireNonNull(remoteVirtualNetworkId);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder routings(List<GetVirtualHubConnectionRouting> routings) {
            this.routings = Objects.requireNonNull(routings);
            return this;
        }
        public Builder routings(GetVirtualHubConnectionRouting... routings) {
            return routings(List.of(routings));
        }
        @CustomType.Setter
        public Builder virtualHubId(String virtualHubId) {
            this.virtualHubId = Objects.requireNonNull(virtualHubId);
            return this;
        }
        @CustomType.Setter
        public Builder virtualHubName(String virtualHubName) {
            this.virtualHubName = Objects.requireNonNull(virtualHubName);
            return this;
        }
        public GetVirtualHubConnectionResult build() {
            final var _resultValue = new GetVirtualHubConnectionResult();
            _resultValue.id = id;
            _resultValue.internetSecurityEnabled = internetSecurityEnabled;
            _resultValue.name = name;
            _resultValue.remoteVirtualNetworkId = remoteVirtualNetworkId;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.routings = routings;
            _resultValue.virtualHubId = virtualHubId;
            _resultValue.virtualHubName = virtualHubName;
            return _resultValue;
        }
    }
}
