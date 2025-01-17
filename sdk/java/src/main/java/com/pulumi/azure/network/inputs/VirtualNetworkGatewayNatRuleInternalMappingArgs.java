// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayNatRuleInternalMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayNatRuleInternalMappingArgs Empty = new VirtualNetworkGatewayNatRuleInternalMappingArgs();

    /**
     * The string CIDR representing the address space for the Virtual Network Gateway Nat Rule internal mapping.
     * 
     */
    @Import(name="addressSpace", required=true)
    private Output<String> addressSpace;

    /**
     * @return The string CIDR representing the address space for the Virtual Network Gateway Nat Rule internal mapping.
     * 
     */
    public Output<String> addressSpace() {
        return this.addressSpace;
    }

    /**
     * The single port range for the Virtual Network Gateway Nat Rule internal mapping.
     * 
     */
    @Import(name="portRange")
    private @Nullable Output<String> portRange;

    /**
     * @return The single port range for the Virtual Network Gateway Nat Rule internal mapping.
     * 
     */
    public Optional<Output<String>> portRange() {
        return Optional.ofNullable(this.portRange);
    }

    private VirtualNetworkGatewayNatRuleInternalMappingArgs() {}

    private VirtualNetworkGatewayNatRuleInternalMappingArgs(VirtualNetworkGatewayNatRuleInternalMappingArgs $) {
        this.addressSpace = $.addressSpace;
        this.portRange = $.portRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayNatRuleInternalMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayNatRuleInternalMappingArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayNatRuleInternalMappingArgs();
        }

        public Builder(VirtualNetworkGatewayNatRuleInternalMappingArgs defaults) {
            $ = new VirtualNetworkGatewayNatRuleInternalMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressSpace The string CIDR representing the address space for the Virtual Network Gateway Nat Rule internal mapping.
         * 
         * @return builder
         * 
         */
        public Builder addressSpace(Output<String> addressSpace) {
            $.addressSpace = addressSpace;
            return this;
        }

        /**
         * @param addressSpace The string CIDR representing the address space for the Virtual Network Gateway Nat Rule internal mapping.
         * 
         * @return builder
         * 
         */
        public Builder addressSpace(String addressSpace) {
            return addressSpace(Output.of(addressSpace));
        }

        /**
         * @param portRange The single port range for the Virtual Network Gateway Nat Rule internal mapping.
         * 
         * @return builder
         * 
         */
        public Builder portRange(@Nullable Output<String> portRange) {
            $.portRange = portRange;
            return this;
        }

        /**
         * @param portRange The single port range for the Virtual Network Gateway Nat Rule internal mapping.
         * 
         * @return builder
         * 
         */
        public Builder portRange(String portRange) {
            return portRange(Output.of(portRange));
        }

        public VirtualNetworkGatewayNatRuleInternalMappingArgs build() {
            $.addressSpace = Objects.requireNonNull($.addressSpace, "expected parameter 'addressSpace' to be non-null");
            return $;
        }
    }

}
