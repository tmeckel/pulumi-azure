// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.outputs;

import com.pulumi.azure.lb.outputs.GetLBFrontendIpConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLBResult {
    /**
     * @return A `frontend_ip_configuration` block as documented below.
     * 
     */
    private List<GetLBFrontendIpConfiguration> frontendIpConfigurations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure location where the Load Balancer exists.
     * 
     */
    private String location;
    /**
     * @return The name of the Frontend IP Configuration.
     * 
     */
    private String name;
    /**
     * @return Private IP Address to assign to the Load Balancer.
     * 
     */
    private String privateIpAddress;
    /**
     * @return The list of private IP address assigned to the load balancer in `frontend_ip_configuration` blocks, if any.
     * 
     */
    private List<String> privateIpAddresses;
    private String resourceGroupName;
    /**
     * @return The SKU of the Load Balancer.
     * 
     */
    private String sku;
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    private Map<String,String> tags;

    private GetLBResult() {}
    /**
     * @return A `frontend_ip_configuration` block as documented below.
     * 
     */
    public List<GetLBFrontendIpConfiguration> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure location where the Load Balancer exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the Frontend IP Configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Private IP Address to assign to the Load Balancer.
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * @return The list of private IP address assigned to the load balancer in `frontend_ip_configuration` blocks, if any.
     * 
     */
    public List<String> privateIpAddresses() {
        return this.privateIpAddresses;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The SKU of the Load Balancer.
     * 
     */
    public String sku() {
        return this.sku;
    }
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLBResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetLBFrontendIpConfiguration> frontendIpConfigurations;
        private String id;
        private String location;
        private String name;
        private String privateIpAddress;
        private List<String> privateIpAddresses;
        private String resourceGroupName;
        private String sku;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetLBResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frontendIpConfigurations = defaults.frontendIpConfigurations;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.privateIpAddresses = defaults.privateIpAddresses;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder frontendIpConfigurations(List<GetLBFrontendIpConfiguration> frontendIpConfigurations) {
            this.frontendIpConfigurations = Objects.requireNonNull(frontendIpConfigurations);
            return this;
        }
        public Builder frontendIpConfigurations(GetLBFrontendIpConfiguration... frontendIpConfigurations) {
            return frontendIpConfigurations(List.of(frontendIpConfigurations));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder privateIpAddresses(List<String> privateIpAddresses) {
            this.privateIpAddresses = Objects.requireNonNull(privateIpAddresses);
            return this;
        }
        public Builder privateIpAddresses(String... privateIpAddresses) {
            return privateIpAddresses(List.of(privateIpAddresses));
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetLBResult build() {
            final var o = new GetLBResult();
            o.frontendIpConfigurations = frontendIpConfigurations;
            o.id = id;
            o.location = location;
            o.name = name;
            o.privateIpAddress = privateIpAddress;
            o.privateIpAddresses = privateIpAddresses;
            o.resourceGroupName = resourceGroupName;
            o.sku = sku;
            o.tags = tags;
            return o;
        }
    }
}