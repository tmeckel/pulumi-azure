// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleExternalMappingArgs;
import com.pulumi.azure.network.inputs.VirtualNetworkGatewayNatRuleInternalMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayNatRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayNatRuleArgs Empty = new VirtualNetworkGatewayNatRuleArgs();

    /**
     * One or more `external_mapping` blocks as documented below.
     * 
     */
    @Import(name="externalMappings", required=true)
    private Output<List<VirtualNetworkGatewayNatRuleExternalMappingArgs>> externalMappings;

    /**
     * @return One or more `external_mapping` blocks as documented below.
     * 
     */
    public Output<List<VirtualNetworkGatewayNatRuleExternalMappingArgs>> externalMappings() {
        return this.externalMappings;
    }

    /**
     * One or more `internal_mapping` blocks as documented below.
     * 
     */
    @Import(name="internalMappings", required=true)
    private Output<List<VirtualNetworkGatewayNatRuleInternalMappingArgs>> internalMappings;

    /**
     * @return One or more `internal_mapping` blocks as documented below.
     * 
     */
    public Output<List<VirtualNetworkGatewayNatRuleInternalMappingArgs>> internalMappings() {
        return this.internalMappings;
    }

    /**
     * The ID of the IP Configuration this Virtual Network Gateway Nat Rule applies to.
     * 
     */
    @Import(name="ipConfigurationId")
    private @Nullable Output<String> ipConfigurationId;

    /**
     * @return The ID of the IP Configuration this Virtual Network Gateway Nat Rule applies to.
     * 
     */
    public Optional<Output<String>> ipConfigurationId() {
        return Optional.ofNullable(this.ipConfigurationId);
    }

    /**
     * The source Nat direction of the Virtual Network Gateway Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The source Nat direction of the Virtual Network Gateway Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The name which should be used for this Virtual Network Gateway Nat Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Virtual Network Gateway Nat Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Name of the Resource Group in which this Virtual Network Gateway Nat Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group in which this Virtual Network Gateway Nat Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The type of the Virtual Network Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the Virtual Network Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The ID of the Virtual Network Gateway that this Virtual Network Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="virtualNetworkGatewayId", required=true)
    private Output<String> virtualNetworkGatewayId;

    /**
     * @return The ID of the Virtual Network Gateway that this Virtual Network Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualNetworkGatewayId() {
        return this.virtualNetworkGatewayId;
    }

    private VirtualNetworkGatewayNatRuleArgs() {}

    private VirtualNetworkGatewayNatRuleArgs(VirtualNetworkGatewayNatRuleArgs $) {
        this.externalMappings = $.externalMappings;
        this.internalMappings = $.internalMappings;
        this.ipConfigurationId = $.ipConfigurationId;
        this.mode = $.mode;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.type = $.type;
        this.virtualNetworkGatewayId = $.virtualNetworkGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayNatRuleArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayNatRuleArgs();
        }

        public Builder(VirtualNetworkGatewayNatRuleArgs defaults) {
            $ = new VirtualNetworkGatewayNatRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalMappings One or more `external_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalMappings(Output<List<VirtualNetworkGatewayNatRuleExternalMappingArgs>> externalMappings) {
            $.externalMappings = externalMappings;
            return this;
        }

        /**
         * @param externalMappings One or more `external_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalMappings(List<VirtualNetworkGatewayNatRuleExternalMappingArgs> externalMappings) {
            return externalMappings(Output.of(externalMappings));
        }

        /**
         * @param externalMappings One or more `external_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalMappings(VirtualNetworkGatewayNatRuleExternalMappingArgs... externalMappings) {
            return externalMappings(List.of(externalMappings));
        }

        /**
         * @param internalMappings One or more `internal_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder internalMappings(Output<List<VirtualNetworkGatewayNatRuleInternalMappingArgs>> internalMappings) {
            $.internalMappings = internalMappings;
            return this;
        }

        /**
         * @param internalMappings One or more `internal_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder internalMappings(List<VirtualNetworkGatewayNatRuleInternalMappingArgs> internalMappings) {
            return internalMappings(Output.of(internalMappings));
        }

        /**
         * @param internalMappings One or more `internal_mapping` blocks as documented below.
         * 
         * @return builder
         * 
         */
        public Builder internalMappings(VirtualNetworkGatewayNatRuleInternalMappingArgs... internalMappings) {
            return internalMappings(List.of(internalMappings));
        }

        /**
         * @param ipConfigurationId The ID of the IP Configuration this Virtual Network Gateway Nat Rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurationId(@Nullable Output<String> ipConfigurationId) {
            $.ipConfigurationId = ipConfigurationId;
            return this;
        }

        /**
         * @param ipConfigurationId The ID of the IP Configuration this Virtual Network Gateway Nat Rule applies to.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurationId(String ipConfigurationId) {
            return ipConfigurationId(Output.of(ipConfigurationId));
        }

        /**
         * @param mode The source Nat direction of the Virtual Network Gateway Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The source Nat direction of the Virtual Network Gateway Nat. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name The name which should be used for this Virtual Network Gateway Nat Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Virtual Network Gateway Nat Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which this Virtual Network Gateway Nat Rule should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which this Virtual Network Gateway Nat Rule should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param type The type of the Virtual Network Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the Virtual Network Gateway Nat Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param virtualNetworkGatewayId The ID of the Virtual Network Gateway that this Virtual Network Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkGatewayId(Output<String> virtualNetworkGatewayId) {
            $.virtualNetworkGatewayId = virtualNetworkGatewayId;
            return this;
        }

        /**
         * @param virtualNetworkGatewayId The ID of the Virtual Network Gateway that this Virtual Network Gateway Nat Rule belongs to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkGatewayId(String virtualNetworkGatewayId) {
            return virtualNetworkGatewayId(Output.of(virtualNetworkGatewayId));
        }

        public VirtualNetworkGatewayNatRuleArgs build() {
            $.externalMappings = Objects.requireNonNull($.externalMappings, "expected parameter 'externalMappings' to be non-null");
            $.internalMappings = Objects.requireNonNull($.internalMappings, "expected parameter 'internalMappings' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkGatewayId = Objects.requireNonNull($.virtualNetworkGatewayId, "expected parameter 'virtualNetworkGatewayId' to be non-null");
            return $;
        }
    }

}
