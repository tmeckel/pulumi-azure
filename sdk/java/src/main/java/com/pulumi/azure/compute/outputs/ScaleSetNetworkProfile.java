// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.ScaleSetNetworkProfileDnsSettings;
import com.pulumi.azure.compute.outputs.ScaleSetNetworkProfileIpConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleSetNetworkProfile {
    /**
     * @return Specifies whether to enable accelerated networking or not. Defaults to `false`.
     * 
     */
    private @Nullable Boolean acceleratedNetworking;
    /**
     * @return A dns_settings block as documented below.
     * 
     */
    private @Nullable ScaleSetNetworkProfileDnsSettings dnsSettings;
    /**
     * @return An ip_configuration block as documented below.
     * 
     */
    private List<ScaleSetNetworkProfileIpConfiguration> ipConfigurations;
    /**
     * @return Whether IP forwarding is enabled on this NIC. Defaults to `false`.
     * 
     */
    private @Nullable Boolean ipForwarding;
    /**
     * @return Specifies the name of the network interface configuration.
     * 
     */
    private String name;
    /**
     * @return Specifies the identifier for the network security group.
     * 
     */
    private @Nullable String networkSecurityGroupId;
    /**
     * @return Indicates whether network interfaces created from the network interface configuration will be the primary NIC of the VM.
     * 
     */
    private Boolean primary;

    private ScaleSetNetworkProfile() {}
    /**
     * @return Specifies whether to enable accelerated networking or not. Defaults to `false`.
     * 
     */
    public Optional<Boolean> acceleratedNetworking() {
        return Optional.ofNullable(this.acceleratedNetworking);
    }
    /**
     * @return A dns_settings block as documented below.
     * 
     */
    public Optional<ScaleSetNetworkProfileDnsSettings> dnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    /**
     * @return An ip_configuration block as documented below.
     * 
     */
    public List<ScaleSetNetworkProfileIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * @return Whether IP forwarding is enabled on this NIC. Defaults to `false`.
     * 
     */
    public Optional<Boolean> ipForwarding() {
        return Optional.ofNullable(this.ipForwarding);
    }
    /**
     * @return Specifies the name of the network interface configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies the identifier for the network security group.
     * 
     */
    public Optional<String> networkSecurityGroupId() {
        return Optional.ofNullable(this.networkSecurityGroupId);
    }
    /**
     * @return Indicates whether network interfaces created from the network interface configuration will be the primary NIC of the VM.
     * 
     */
    public Boolean primary() {
        return this.primary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetNetworkProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean acceleratedNetworking;
        private @Nullable ScaleSetNetworkProfileDnsSettings dnsSettings;
        private List<ScaleSetNetworkProfileIpConfiguration> ipConfigurations;
        private @Nullable Boolean ipForwarding;
        private String name;
        private @Nullable String networkSecurityGroupId;
        private Boolean primary;
        public Builder() {}
        public Builder(ScaleSetNetworkProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratedNetworking = defaults.acceleratedNetworking;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.ipForwarding = defaults.ipForwarding;
    	      this.name = defaults.name;
    	      this.networkSecurityGroupId = defaults.networkSecurityGroupId;
    	      this.primary = defaults.primary;
        }

        @CustomType.Setter
        public Builder acceleratedNetworking(@Nullable Boolean acceleratedNetworking) {
            this.acceleratedNetworking = acceleratedNetworking;
            return this;
        }
        @CustomType.Setter
        public Builder dnsSettings(@Nullable ScaleSetNetworkProfileDnsSettings dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }
        @CustomType.Setter
        public Builder ipConfigurations(List<ScaleSetNetworkProfileIpConfiguration> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(ScaleSetNetworkProfileIpConfiguration... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        @CustomType.Setter
        public Builder ipForwarding(@Nullable Boolean ipForwarding) {
            this.ipForwarding = ipForwarding;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networkSecurityGroupId(@Nullable String networkSecurityGroupId) {
            this.networkSecurityGroupId = networkSecurityGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder primary(Boolean primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }
        public ScaleSetNetworkProfile build() {
            final var o = new ScaleSetNetworkProfile();
            o.acceleratedNetworking = acceleratedNetworking;
            o.dnsSettings = dnsSettings;
            o.ipConfigurations = ipConfigurations;
            o.ipForwarding = ipForwarding;
            o.name = name;
            o.networkSecurityGroupId = networkSecurityGroupId;
            o.primary = primary;
            return o;
        }
    }
}