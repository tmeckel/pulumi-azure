// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpringCloudServiceNetwork {
    /**
     * @return Specifies the Name of the resource group containing network resources of Azure Spring Cloud Apps. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String appNetworkResourceGroup;
    /**
     * @return Specifies the ID of the Subnet which should host the Spring Boot Applications deployed in this Spring Cloud Service. Changing this forces a new resource to be created.
     * 
     */
    private String appSubnetId;
    /**
     * @return A list of (at least 3) CIDR ranges (at least /16) which are used to host the Spring Cloud infrastructure, which must not overlap with any existing CIDR ranges in the Subnet. Changing this forces a new resource to be created.
     * 
     */
    private List<String> cidrRanges;
    /**
     * @return Ingress read time out in seconds. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable Integer readTimeoutSeconds;
    /**
     * @return Specifies the Name of the resource group containing network resources of Azure Spring Cloud Service Runtime. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String serviceRuntimeNetworkResourceGroup;
    /**
     * @return Specifies the ID of the Subnet where the Service Runtime components of the Spring Cloud Service will exist. Changing this forces a new resource to be created.
     * 
     */
    private String serviceRuntimeSubnetId;

    private SpringCloudServiceNetwork() {}
    /**
     * @return Specifies the Name of the resource group containing network resources of Azure Spring Cloud Apps. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> appNetworkResourceGroup() {
        return Optional.ofNullable(this.appNetworkResourceGroup);
    }
    /**
     * @return Specifies the ID of the Subnet which should host the Spring Boot Applications deployed in this Spring Cloud Service. Changing this forces a new resource to be created.
     * 
     */
    public String appSubnetId() {
        return this.appSubnetId;
    }
    /**
     * @return A list of (at least 3) CIDR ranges (at least /16) which are used to host the Spring Cloud infrastructure, which must not overlap with any existing CIDR ranges in the Subnet. Changing this forces a new resource to be created.
     * 
     */
    public List<String> cidrRanges() {
        return this.cidrRanges;
    }
    /**
     * @return Ingress read time out in seconds. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Integer> readTimeoutSeconds() {
        return Optional.ofNullable(this.readTimeoutSeconds);
    }
    /**
     * @return Specifies the Name of the resource group containing network resources of Azure Spring Cloud Service Runtime. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> serviceRuntimeNetworkResourceGroup() {
        return Optional.ofNullable(this.serviceRuntimeNetworkResourceGroup);
    }
    /**
     * @return Specifies the ID of the Subnet where the Service Runtime components of the Spring Cloud Service will exist. Changing this forces a new resource to be created.
     * 
     */
    public String serviceRuntimeSubnetId() {
        return this.serviceRuntimeSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpringCloudServiceNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String appNetworkResourceGroup;
        private String appSubnetId;
        private List<String> cidrRanges;
        private @Nullable Integer readTimeoutSeconds;
        private @Nullable String serviceRuntimeNetworkResourceGroup;
        private String serviceRuntimeSubnetId;
        public Builder() {}
        public Builder(SpringCloudServiceNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appNetworkResourceGroup = defaults.appNetworkResourceGroup;
    	      this.appSubnetId = defaults.appSubnetId;
    	      this.cidrRanges = defaults.cidrRanges;
    	      this.readTimeoutSeconds = defaults.readTimeoutSeconds;
    	      this.serviceRuntimeNetworkResourceGroup = defaults.serviceRuntimeNetworkResourceGroup;
    	      this.serviceRuntimeSubnetId = defaults.serviceRuntimeSubnetId;
        }

        @CustomType.Setter
        public Builder appNetworkResourceGroup(@Nullable String appNetworkResourceGroup) {
            this.appNetworkResourceGroup = appNetworkResourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder appSubnetId(String appSubnetId) {
            this.appSubnetId = Objects.requireNonNull(appSubnetId);
            return this;
        }
        @CustomType.Setter
        public Builder cidrRanges(List<String> cidrRanges) {
            this.cidrRanges = Objects.requireNonNull(cidrRanges);
            return this;
        }
        public Builder cidrRanges(String... cidrRanges) {
            return cidrRanges(List.of(cidrRanges));
        }
        @CustomType.Setter
        public Builder readTimeoutSeconds(@Nullable Integer readTimeoutSeconds) {
            this.readTimeoutSeconds = readTimeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder serviceRuntimeNetworkResourceGroup(@Nullable String serviceRuntimeNetworkResourceGroup) {
            this.serviceRuntimeNetworkResourceGroup = serviceRuntimeNetworkResourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder serviceRuntimeSubnetId(String serviceRuntimeSubnetId) {
            this.serviceRuntimeSubnetId = Objects.requireNonNull(serviceRuntimeSubnetId);
            return this;
        }
        public SpringCloudServiceNetwork build() {
            final var o = new SpringCloudServiceNetwork();
            o.appNetworkResourceGroup = appNetworkResourceGroup;
            o.appSubnetId = appSubnetId;
            o.cidrRanges = cidrRanges;
            o.readTimeoutSeconds = readTimeoutSeconds;
            o.serviceRuntimeNetworkResourceGroup = serviceRuntimeNetworkResourceGroup;
            o.serviceRuntimeSubnetId = serviceRuntimeSubnetId;
            return o;
        }
    }
}