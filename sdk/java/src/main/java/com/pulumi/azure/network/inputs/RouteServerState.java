// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteServerState extends com.pulumi.resources.ResourceArgs {

    public static final RouteServerState Empty = new RouteServerState();

    /**
     * Whether to enable route exchange between Azure Route Server and the gateway(s)
     * 
     */
    @Import(name="branchToBranchTrafficEnabled")
    private @Nullable Output<Boolean> branchToBranchTrafficEnabled;

    /**
     * @return Whether to enable route exchange between Azure Route Server and the gateway(s)
     * 
     */
    public Optional<Output<Boolean>> branchToBranchTrafficEnabled() {
        return Optional.ofNullable(this.branchToBranchTrafficEnabled);
    }

    /**
     * Specifies the supported Azure location where the Route Server should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the Route Server should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Route Server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Route Server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the Public IP Address. This option is required since September 1st 2021. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="publicIpAddressId")
    private @Nullable Output<String> publicIpAddressId;

    /**
     * @return The ID of the Public IP Address. This option is required since September 1st 2021. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> publicIpAddressId() {
        return Optional.ofNullable(this.publicIpAddressId);
    }

    /**
     * Specifies the name of the Resource Group where the Route Server should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Route Server should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    @Import(name="routingState")
    private @Nullable Output<String> routingState;

    public Optional<Output<String>> routingState() {
        return Optional.ofNullable(this.routingState);
    }

    @Import(name="sku")
    private @Nullable Output<String> sku;

    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * The ID of the Subnet that the Route Server will reside. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet that the Route Server will reside. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="virtualRouterAsn")
    private @Nullable Output<Integer> virtualRouterAsn;

    public Optional<Output<Integer>> virtualRouterAsn() {
        return Optional.ofNullable(this.virtualRouterAsn);
    }

    @Import(name="virtualRouterIps")
    private @Nullable Output<List<String>> virtualRouterIps;

    public Optional<Output<List<String>>> virtualRouterIps() {
        return Optional.ofNullable(this.virtualRouterIps);
    }

    private RouteServerState() {}

    private RouteServerState(RouteServerState $) {
        this.branchToBranchTrafficEnabled = $.branchToBranchTrafficEnabled;
        this.location = $.location;
        this.name = $.name;
        this.publicIpAddressId = $.publicIpAddressId;
        this.resourceGroupName = $.resourceGroupName;
        this.routingState = $.routingState;
        this.sku = $.sku;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
        this.virtualRouterAsn = $.virtualRouterAsn;
        this.virtualRouterIps = $.virtualRouterIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteServerState $;

        public Builder() {
            $ = new RouteServerState();
        }

        public Builder(RouteServerState defaults) {
            $ = new RouteServerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param branchToBranchTrafficEnabled Whether to enable route exchange between Azure Route Server and the gateway(s)
         * 
         * @return builder
         * 
         */
        public Builder branchToBranchTrafficEnabled(@Nullable Output<Boolean> branchToBranchTrafficEnabled) {
            $.branchToBranchTrafficEnabled = branchToBranchTrafficEnabled;
            return this;
        }

        /**
         * @param branchToBranchTrafficEnabled Whether to enable route exchange between Azure Route Server and the gateway(s)
         * 
         * @return builder
         * 
         */
        public Builder branchToBranchTrafficEnabled(Boolean branchToBranchTrafficEnabled) {
            return branchToBranchTrafficEnabled(Output.of(branchToBranchTrafficEnabled));
        }

        /**
         * @param location Specifies the supported Azure location where the Route Server should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the Route Server should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the Route Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Route Server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicIpAddressId The ID of the Public IP Address. This option is required since September 1st 2021. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(@Nullable Output<String> publicIpAddressId) {
            $.publicIpAddressId = publicIpAddressId;
            return this;
        }

        /**
         * @param publicIpAddressId The ID of the Public IP Address. This option is required since September 1st 2021. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(String publicIpAddressId) {
            return publicIpAddressId(Output.of(publicIpAddressId));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Route Server should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Route Server should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder routingState(@Nullable Output<String> routingState) {
            $.routingState = routingState;
            return this;
        }

        public Builder routingState(String routingState) {
            return routingState(Output.of(routingState));
        }

        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param subnetId The ID of the Subnet that the Route Server will reside. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet that the Route Server will reside. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder virtualRouterAsn(@Nullable Output<Integer> virtualRouterAsn) {
            $.virtualRouterAsn = virtualRouterAsn;
            return this;
        }

        public Builder virtualRouterAsn(Integer virtualRouterAsn) {
            return virtualRouterAsn(Output.of(virtualRouterAsn));
        }

        public Builder virtualRouterIps(@Nullable Output<List<String>> virtualRouterIps) {
            $.virtualRouterIps = virtualRouterIps;
            return this;
        }

        public Builder virtualRouterIps(List<String> virtualRouterIps) {
            return virtualRouterIps(Output.of(virtualRouterIps));
        }

        public Builder virtualRouterIps(String... virtualRouterIps) {
            return virtualRouterIps(List.of(virtualRouterIps));
        }

        public RouteServerState build() {
            return $;
        }
    }

}