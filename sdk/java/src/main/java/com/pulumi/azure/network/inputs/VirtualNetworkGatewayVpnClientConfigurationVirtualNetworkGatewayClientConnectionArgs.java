// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs Empty = new VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs();

    /**
     * A list of address prefixes for P2S VPN Client.
     * 
     */
    @Import(name="addressPrefixes", required=true)
    private Output<List<String>> addressPrefixes;

    /**
     * @return A list of address prefixes for P2S VPN Client.
     * 
     */
    public Output<List<String>> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * The name of the Virtual Network Gateway Client Connection.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Virtual Network Gateway Client Connection.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A list of names of Virtual Network Gateway Policy Groups.
     * 
     */
    @Import(name="policyGroupNames", required=true)
    private Output<List<String>> policyGroupNames;

    /**
     * @return A list of names of Virtual Network Gateway Policy Groups.
     * 
     */
    public Output<List<String>> policyGroupNames() {
        return this.policyGroupNames;
    }

    private VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs() {}

    private VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs(VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs $) {
        this.addressPrefixes = $.addressPrefixes;
        this.name = $.name;
        this.policyGroupNames = $.policyGroupNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs();
        }

        public Builder(VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs defaults) {
            $ = new VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressPrefixes A list of address prefixes for P2S VPN Client.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(Output<List<String>> addressPrefixes) {
            $.addressPrefixes = addressPrefixes;
            return this;
        }

        /**
         * @param addressPrefixes A list of address prefixes for P2S VPN Client.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(List<String> addressPrefixes) {
            return addressPrefixes(Output.of(addressPrefixes));
        }

        /**
         * @param addressPrefixes A list of address prefixes for P2S VPN Client.
         * 
         * @return builder
         * 
         */
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }

        /**
         * @param name The name of the Virtual Network Gateway Client Connection.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Virtual Network Gateway Client Connection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyGroupNames A list of names of Virtual Network Gateway Policy Groups.
         * 
         * @return builder
         * 
         */
        public Builder policyGroupNames(Output<List<String>> policyGroupNames) {
            $.policyGroupNames = policyGroupNames;
            return this;
        }

        /**
         * @param policyGroupNames A list of names of Virtual Network Gateway Policy Groups.
         * 
         * @return builder
         * 
         */
        public Builder policyGroupNames(List<String> policyGroupNames) {
            return policyGroupNames(Output.of(policyGroupNames));
        }

        /**
         * @param policyGroupNames A list of names of Virtual Network Gateway Policy Groups.
         * 
         * @return builder
         * 
         */
        public Builder policyGroupNames(String... policyGroupNames) {
            return policyGroupNames(List.of(policyGroupNames));
        }

        public VirtualNetworkGatewayVpnClientConfigurationVirtualNetworkGatewayClientConnectionArgs build() {
            $.addressPrefixes = Objects.requireNonNull($.addressPrefixes, "expected parameter 'addressPrefixes' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.policyGroupNames = Objects.requireNonNull($.policyGroupNames, "expected parameter 'policyGroupNames' to be non-null");
            return $;
        }
    }

}
