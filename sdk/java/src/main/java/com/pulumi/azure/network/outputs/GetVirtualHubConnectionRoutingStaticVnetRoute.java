// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualHubConnectionRoutingStaticVnetRoute {
    /**
     * @return A list of CIDR Ranges which is used as Address Prefixes.
     * 
     */
    private List<String> addressPrefixes;
    /**
     * @return The name of the Connection which should be retrieved.
     * 
     */
    private String name;
    /**
     * @return The IP Address which is used for the Next Hop.
     * 
     */
    private String nextHopIpAddress;

    private GetVirtualHubConnectionRoutingStaticVnetRoute() {}
    /**
     * @return A list of CIDR Ranges which is used as Address Prefixes.
     * 
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }
    /**
     * @return The name of the Connection which should be retrieved.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The IP Address which is used for the Next Hop.
     * 
     */
    public String nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualHubConnectionRoutingStaticVnetRoute defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> addressPrefixes;
        private String name;
        private String nextHopIpAddress;
        public Builder() {}
        public Builder(GetVirtualHubConnectionRoutingStaticVnetRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
    	      this.name = defaults.name;
    	      this.nextHopIpAddress = defaults.nextHopIpAddress;
        }

        @CustomType.Setter
        public Builder addressPrefixes(List<String> addressPrefixes) {
            this.addressPrefixes = Objects.requireNonNull(addressPrefixes);
            return this;
        }
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nextHopIpAddress(String nextHopIpAddress) {
            this.nextHopIpAddress = Objects.requireNonNull(nextHopIpAddress);
            return this;
        }
        public GetVirtualHubConnectionRoutingStaticVnetRoute build() {
            final var o = new GetVirtualHubConnectionRoutingStaticVnetRoute();
            o.addressPrefixes = addressPrefixes;
            o.name = name;
            o.nextHopIpAddress = nextHopIpAddress;
            return o;
        }
    }
}