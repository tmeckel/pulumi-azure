// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ScaleSetNetworkProfileDnsSettings {
    /**
     * @return Specifies an array of DNS servers.
     * 
     */
    private List<String> dnsServers;

    private ScaleSetNetworkProfileDnsSettings() {}
    /**
     * @return Specifies an array of DNS servers.
     * 
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleSetNetworkProfileDnsSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> dnsServers;
        public Builder() {}
        public Builder(ScaleSetNetworkProfileDnsSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
        }

        @CustomType.Setter
        public Builder dnsServers(List<String> dnsServers) {
            this.dnsServers = Objects.requireNonNull(dnsServers);
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        public ScaleSetNetworkProfileDnsSettings build() {
            final var o = new ScaleSetNetworkProfileDnsSettings();
            o.dnsServers = dnsServers;
            return o;
        }
    }
}