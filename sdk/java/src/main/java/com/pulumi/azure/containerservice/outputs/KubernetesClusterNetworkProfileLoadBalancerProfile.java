// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterNetworkProfileLoadBalancerProfile {
    /**
     * @return The outcome (resource IDs) of the specified arguments.
     * 
     */
    private @Nullable List<String> effectiveOutboundIps;
    /**
     * @return Desired outbound flow idle timeout in minutes for the cluster load balancer. Must be between `4` and `120` inclusive. Defaults to `30`.
     * 
     */
    private @Nullable Integer idleTimeoutInMinutes;
    /**
     * @return Count of desired managed outbound IPs for the cluster load balancer. Must be between `1` and `100` inclusive.
     * 
     */
    private @Nullable Integer managedOutboundIpCount;
    /**
     * @return The ID of the Public IP Addresses which should be used for outbound communication for the cluster load balancer.
     * 
     */
    private @Nullable List<String> outboundIpAddressIds;
    /**
     * @return The ID of the outbound Public IP Address Prefixes which should be used for the cluster load balancer.
     * 
     */
    private @Nullable List<String> outboundIpPrefixIds;
    /**
     * @return Number of desired SNAT port for each VM in the clusters load balancer. Must be between `0` and `64000` inclusive. Defaults to `0`.
     * 
     */
    private @Nullable Integer outboundPortsAllocated;

    private KubernetesClusterNetworkProfileLoadBalancerProfile() {}
    /**
     * @return The outcome (resource IDs) of the specified arguments.
     * 
     */
    public List<String> effectiveOutboundIps() {
        return this.effectiveOutboundIps == null ? List.of() : this.effectiveOutboundIps;
    }
    /**
     * @return Desired outbound flow idle timeout in minutes for the cluster load balancer. Must be between `4` and `120` inclusive. Defaults to `30`.
     * 
     */
    public Optional<Integer> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    /**
     * @return Count of desired managed outbound IPs for the cluster load balancer. Must be between `1` and `100` inclusive.
     * 
     */
    public Optional<Integer> managedOutboundIpCount() {
        return Optional.ofNullable(this.managedOutboundIpCount);
    }
    /**
     * @return The ID of the Public IP Addresses which should be used for outbound communication for the cluster load balancer.
     * 
     */
    public List<String> outboundIpAddressIds() {
        return this.outboundIpAddressIds == null ? List.of() : this.outboundIpAddressIds;
    }
    /**
     * @return The ID of the outbound Public IP Address Prefixes which should be used for the cluster load balancer.
     * 
     */
    public List<String> outboundIpPrefixIds() {
        return this.outboundIpPrefixIds == null ? List.of() : this.outboundIpPrefixIds;
    }
    /**
     * @return Number of desired SNAT port for each VM in the clusters load balancer. Must be between `0` and `64000` inclusive. Defaults to `0`.
     * 
     */
    public Optional<Integer> outboundPortsAllocated() {
        return Optional.ofNullable(this.outboundPortsAllocated);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterNetworkProfileLoadBalancerProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> effectiveOutboundIps;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable Integer managedOutboundIpCount;
        private @Nullable List<String> outboundIpAddressIds;
        private @Nullable List<String> outboundIpPrefixIds;
        private @Nullable Integer outboundPortsAllocated;
        public Builder() {}
        public Builder(KubernetesClusterNetworkProfileLoadBalancerProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveOutboundIps = defaults.effectiveOutboundIps;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.managedOutboundIpCount = defaults.managedOutboundIpCount;
    	      this.outboundIpAddressIds = defaults.outboundIpAddressIds;
    	      this.outboundIpPrefixIds = defaults.outboundIpPrefixIds;
    	      this.outboundPortsAllocated = defaults.outboundPortsAllocated;
        }

        @CustomType.Setter
        public Builder effectiveOutboundIps(@Nullable List<String> effectiveOutboundIps) {
            this.effectiveOutboundIps = effectiveOutboundIps;
            return this;
        }
        public Builder effectiveOutboundIps(String... effectiveOutboundIps) {
            return effectiveOutboundIps(List.of(effectiveOutboundIps));
        }
        @CustomType.Setter
        public Builder idleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }
        @CustomType.Setter
        public Builder managedOutboundIpCount(@Nullable Integer managedOutboundIpCount) {
            this.managedOutboundIpCount = managedOutboundIpCount;
            return this;
        }
        @CustomType.Setter
        public Builder outboundIpAddressIds(@Nullable List<String> outboundIpAddressIds) {
            this.outboundIpAddressIds = outboundIpAddressIds;
            return this;
        }
        public Builder outboundIpAddressIds(String... outboundIpAddressIds) {
            return outboundIpAddressIds(List.of(outboundIpAddressIds));
        }
        @CustomType.Setter
        public Builder outboundIpPrefixIds(@Nullable List<String> outboundIpPrefixIds) {
            this.outboundIpPrefixIds = outboundIpPrefixIds;
            return this;
        }
        public Builder outboundIpPrefixIds(String... outboundIpPrefixIds) {
            return outboundIpPrefixIds(List.of(outboundIpPrefixIds));
        }
        @CustomType.Setter
        public Builder outboundPortsAllocated(@Nullable Integer outboundPortsAllocated) {
            this.outboundPortsAllocated = outboundPortsAllocated;
            return this;
        }
        public KubernetesClusterNetworkProfileLoadBalancerProfile build() {
            final var o = new KubernetesClusterNetworkProfileLoadBalancerProfile();
            o.effectiveOutboundIps = effectiveOutboundIps;
            o.idleTimeoutInMinutes = idleTimeoutInMinutes;
            o.managedOutboundIpCount = managedOutboundIpCount;
            o.outboundIpAddressIds = outboundIpAddressIds;
            o.outboundIpPrefixIds = outboundIpPrefixIds;
            o.outboundPortsAllocated = outboundPortsAllocated;
            return o;
        }
    }
}