// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.domainservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceInitialReplicaSet {
    /**
     * @return A list of subnet IP addresses for the domain controllers in the initial replica set, typically two.
     * 
     */
    private @Nullable List<String> domainControllerIpAddresses;
    /**
     * @return The publicly routable IP address for the domain controllers in the initial replica set.
     * 
     */
    private @Nullable String externalAccessIpAddress;
    /**
     * @return The ID of the Domain Service.
     * 
     */
    private @Nullable String id;
    /**
     * @return The Azure location where the Domain Service exists. Changing this forces a new resource to be created.
     * 
     */
    private @Nullable String location;
    /**
     * @return The current service status for the initial replica set.
     * 
     */
    private @Nullable String serviceStatus;
    /**
     * @return The ID of the subnet in which to place the initial replica set.
     * 
     */
    private String subnetId;

    private ServiceInitialReplicaSet() {}
    /**
     * @return A list of subnet IP addresses for the domain controllers in the initial replica set, typically two.
     * 
     */
    public List<String> domainControllerIpAddresses() {
        return this.domainControllerIpAddresses == null ? List.of() : this.domainControllerIpAddresses;
    }
    /**
     * @return The publicly routable IP address for the domain controllers in the initial replica set.
     * 
     */
    public Optional<String> externalAccessIpAddress() {
        return Optional.ofNullable(this.externalAccessIpAddress);
    }
    /**
     * @return The ID of the Domain Service.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The Azure location where the Domain Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The current service status for the initial replica set.
     * 
     */
    public Optional<String> serviceStatus() {
        return Optional.ofNullable(this.serviceStatus);
    }
    /**
     * @return The ID of the subnet in which to place the initial replica set.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceInitialReplicaSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> domainControllerIpAddresses;
        private @Nullable String externalAccessIpAddress;
        private @Nullable String id;
        private @Nullable String location;
        private @Nullable String serviceStatus;
        private String subnetId;
        public Builder() {}
        public Builder(ServiceInitialReplicaSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainControllerIpAddresses = defaults.domainControllerIpAddresses;
    	      this.externalAccessIpAddress = defaults.externalAccessIpAddress;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.serviceStatus = defaults.serviceStatus;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder domainControllerIpAddresses(@Nullable List<String> domainControllerIpAddresses) {
            this.domainControllerIpAddresses = domainControllerIpAddresses;
            return this;
        }
        public Builder domainControllerIpAddresses(String... domainControllerIpAddresses) {
            return domainControllerIpAddresses(List.of(domainControllerIpAddresses));
        }
        @CustomType.Setter
        public Builder externalAccessIpAddress(@Nullable String externalAccessIpAddress) {
            this.externalAccessIpAddress = externalAccessIpAddress;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder serviceStatus(@Nullable String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public ServiceInitialReplicaSet build() {
            final var o = new ServiceInitialReplicaSet();
            o.domainControllerIpAddresses = domainControllerIpAddresses;
            o.externalAccessIpAddress = externalAccessIpAddress;
            o.id = id;
            o.location = location;
            o.serviceStatus = serviceStatus;
            o.subnetId = subnetId;
            return o;
        }
    }
}