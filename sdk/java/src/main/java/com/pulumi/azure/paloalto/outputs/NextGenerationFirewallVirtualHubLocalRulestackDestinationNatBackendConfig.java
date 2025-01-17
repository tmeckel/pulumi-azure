// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig {
    private Integer port;
    private String publicIpAddress;

    private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig() {}
    public Integer port() {
        return this.port;
    }
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer port;
        private String publicIpAddress;
        public Builder() {}
        public Builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.publicIpAddress = defaults.publicIpAddress;
        }

        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }
        public NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig build() {
            final var _resultValue = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatBackendConfig();
            _resultValue.port = port;
            _resultValue.publicIpAddress = publicIpAddress;
            return _resultValue;
        }
    }
}
