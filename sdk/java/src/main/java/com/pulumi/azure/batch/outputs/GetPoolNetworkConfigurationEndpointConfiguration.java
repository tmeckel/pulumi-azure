// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.azure.batch.outputs.GetPoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPoolNetworkConfigurationEndpointConfiguration {
    /**
     * @return The port number on the compute node.
     * 
     */
    private Integer backendPort;
    /**
     * @return The range of external ports that are used to provide inbound access to the backendPort on the individual compute nodes in the format of `1000-1100`.
     * 
     */
    private String frontendPortRange;
    /**
     * @return The name of the user account.
     * 
     */
    private String name;
    /**
     * @return The list of network security group rules that are applied to the endpoint.
     * 
     */
    private List<GetPoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule> networkSecurityGroupRules;
    /**
     * @return The protocol of the endpoint.
     * 
     */
    private String protocol;

    private GetPoolNetworkConfigurationEndpointConfiguration() {}
    /**
     * @return The port number on the compute node.
     * 
     */
    public Integer backendPort() {
        return this.backendPort;
    }
    /**
     * @return The range of external ports that are used to provide inbound access to the backendPort on the individual compute nodes in the format of `1000-1100`.
     * 
     */
    public String frontendPortRange() {
        return this.frontendPortRange;
    }
    /**
     * @return The name of the user account.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The list of network security group rules that are applied to the endpoint.
     * 
     */
    public List<GetPoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule> networkSecurityGroupRules() {
        return this.networkSecurityGroupRules;
    }
    /**
     * @return The protocol of the endpoint.
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolNetworkConfigurationEndpointConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer backendPort;
        private String frontendPortRange;
        private String name;
        private List<GetPoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule> networkSecurityGroupRules;
        private String protocol;
        public Builder() {}
        public Builder(GetPoolNetworkConfigurationEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.frontendPortRange = defaults.frontendPortRange;
    	      this.name = defaults.name;
    	      this.networkSecurityGroupRules = defaults.networkSecurityGroupRules;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder backendPort(Integer backendPort) {
            this.backendPort = Objects.requireNonNull(backendPort);
            return this;
        }
        @CustomType.Setter
        public Builder frontendPortRange(String frontendPortRange) {
            this.frontendPortRange = Objects.requireNonNull(frontendPortRange);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networkSecurityGroupRules(List<GetPoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule> networkSecurityGroupRules) {
            this.networkSecurityGroupRules = Objects.requireNonNull(networkSecurityGroupRules);
            return this;
        }
        public Builder networkSecurityGroupRules(GetPoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRule... networkSecurityGroupRules) {
            return networkSecurityGroupRules(List.of(networkSecurityGroupRules));
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public GetPoolNetworkConfigurationEndpointConfiguration build() {
            final var o = new GetPoolNetworkConfigurationEndpointConfiguration();
            o.backendPort = backendPort;
            o.frontendPortRange = frontendPortRange;
            o.name = name;
            o.networkSecurityGroupRules = networkSecurityGroupRules;
            o.protocol = protocol;
            return o;
        }
    }
}