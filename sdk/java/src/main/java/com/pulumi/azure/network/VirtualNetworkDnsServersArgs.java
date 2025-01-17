// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkDnsServersArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkDnsServersArgs Empty = new VirtualNetworkDnsServersArgs();

    /**
     * List of IP addresses of DNS servers
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<List<String>> dnsServers;

    /**
     * @return List of IP addresses of DNS servers
     * 
     */
    public Optional<Output<List<String>>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    /**
     * The ID of the Virtual Network that should be linked to the DNS Zone. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualNetworkId", required=true)
    private Output<String> virtualNetworkId;

    /**
     * @return The ID of the Virtual Network that should be linked to the DNS Zone. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualNetworkId() {
        return this.virtualNetworkId;
    }

    private VirtualNetworkDnsServersArgs() {}

    private VirtualNetworkDnsServersArgs(VirtualNetworkDnsServersArgs $) {
        this.dnsServers = $.dnsServers;
        this.virtualNetworkId = $.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkDnsServersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkDnsServersArgs $;

        public Builder() {
            $ = new VirtualNetworkDnsServersArgs();
        }

        public Builder(VirtualNetworkDnsServersArgs defaults) {
            $ = new VirtualNetworkDnsServersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsServers List of IP addresses of DNS servers
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        /**
         * @param dnsServers List of IP addresses of DNS servers
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(List<String> dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        /**
         * @param dnsServers List of IP addresses of DNS servers
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        /**
         * @param virtualNetworkId The ID of the Virtual Network that should be linked to the DNS Zone. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(Output<String> virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        /**
         * @param virtualNetworkId The ID of the Virtual Network that should be linked to the DNS Zone. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkId(String virtualNetworkId) {
            return virtualNetworkId(Output.of(virtualNetworkId));
        }

        public VirtualNetworkDnsServersArgs build() {
            $.virtualNetworkId = Objects.requireNonNull($.virtualNetworkId, "expected parameter 'virtualNetworkId' to be non-null");
            return $;
        }
    }

}
