// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.azure.batch.outputs.GetPoolNetworkConfigurationEndpointConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPoolNetworkConfiguration {
    /**
     * @return The inbound NAT pools that are used to address specific ports on the individual compute node externally.
     * 
     */
    private List<GetPoolNetworkConfigurationEndpointConfiguration> endpointConfigurations;
    private String publicAddressProvisioningType;
    private List<String> publicIps;
    /**
     * @return The ARM resource identifier of the virtual network subnet which the compute nodes of the pool are joined too.
     * 
     */
    private String subnetId;

    private GetPoolNetworkConfiguration() {}
    /**
     * @return The inbound NAT pools that are used to address specific ports on the individual compute node externally.
     * 
     */
    public List<GetPoolNetworkConfigurationEndpointConfiguration> endpointConfigurations() {
        return this.endpointConfigurations;
    }
    public String publicAddressProvisioningType() {
        return this.publicAddressProvisioningType;
    }
    public List<String> publicIps() {
        return this.publicIps;
    }
    /**
     * @return The ARM resource identifier of the virtual network subnet which the compute nodes of the pool are joined too.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolNetworkConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetPoolNetworkConfigurationEndpointConfiguration> endpointConfigurations;
        private String publicAddressProvisioningType;
        private List<String> publicIps;
        private String subnetId;
        public Builder() {}
        public Builder(GetPoolNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointConfigurations = defaults.endpointConfigurations;
    	      this.publicAddressProvisioningType = defaults.publicAddressProvisioningType;
    	      this.publicIps = defaults.publicIps;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder endpointConfigurations(List<GetPoolNetworkConfigurationEndpointConfiguration> endpointConfigurations) {
            this.endpointConfigurations = Objects.requireNonNull(endpointConfigurations);
            return this;
        }
        public Builder endpointConfigurations(GetPoolNetworkConfigurationEndpointConfiguration... endpointConfigurations) {
            return endpointConfigurations(List.of(endpointConfigurations));
        }
        @CustomType.Setter
        public Builder publicAddressProvisioningType(String publicAddressProvisioningType) {
            this.publicAddressProvisioningType = Objects.requireNonNull(publicAddressProvisioningType);
            return this;
        }
        @CustomType.Setter
        public Builder publicIps(List<String> publicIps) {
            this.publicIps = Objects.requireNonNull(publicIps);
            return this;
        }
        public Builder publicIps(String... publicIps) {
            return publicIps(List.of(publicIps));
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public GetPoolNetworkConfiguration build() {
            final var o = new GetPoolNetworkConfiguration();
            o.endpointConfigurations = endpointConfigurations;
            o.publicAddressProvisioningType = publicAddressProvisioningType;
            o.publicIps = publicIps;
            o.subnetId = subnetId;
            return o;
        }
    }
}