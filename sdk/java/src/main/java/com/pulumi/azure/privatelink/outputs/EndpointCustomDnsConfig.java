// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatelink.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointCustomDnsConfig {
    /**
     * @return The fully qualified domain name to the `private_dns_zone`.
     * 
     */
    private @Nullable String fqdn;
    /**
     * @return A list of all IP Addresses that map to the `private_dns_zone` fqdn.
     * 
     */
    private @Nullable List<String> ipAddresses;

    private EndpointCustomDnsConfig() {}
    /**
     * @return The fully qualified domain name to the `private_dns_zone`.
     * 
     */
    public Optional<String> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }
    /**
     * @return A list of all IP Addresses that map to the `private_dns_zone` fqdn.
     * 
     */
    public List<String> ipAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointCustomDnsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fqdn;
        private @Nullable List<String> ipAddresses;
        public Builder() {}
        public Builder(EndpointCustomDnsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        @CustomType.Setter
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public EndpointCustomDnsConfig build() {
            final var o = new EndpointCustomDnsConfig();
            o.fqdn = fqdn;
            o.ipAddresses = ipAddresses;
            return o;
        }
    }
}