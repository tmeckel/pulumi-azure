// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkPeeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkPeeringArgs Empty = new VirtualNetworkPeeringArgs();

    /**
     * Controls if forwarded traffic from  VMs
     * in the remote virtual network is allowed. Defaults to false.
     * 
     */
    @Import(name="allowForwardedTraffic")
    private @Nullable Output<Boolean> allowForwardedTraffic;

    /**
     * @return Controls if forwarded traffic from  VMs
     * in the remote virtual network is allowed. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> allowForwardedTraffic() {
        return Optional.ofNullable(this.allowForwardedTraffic);
    }

    /**
     * Controls gatewayLinks can be used in the
     * remote virtual network’s link to the local virtual network.
     * 
     */
    @Import(name="allowGatewayTransit")
    private @Nullable Output<Boolean> allowGatewayTransit;

    /**
     * @return Controls gatewayLinks can be used in the
     * remote virtual network’s link to the local virtual network.
     * 
     */
    public Optional<Output<Boolean>> allowGatewayTransit() {
        return Optional.ofNullable(this.allowGatewayTransit);
    }

    /**
     * Controls if the VMs in the remote
     * virtual network can access VMs in the local virtual network. Defaults to
     * true.
     * 
     */
    @Import(name="allowVirtualNetworkAccess")
    private @Nullable Output<Boolean> allowVirtualNetworkAccess;

    /**
     * @return Controls if the VMs in the remote
     * virtual network can access VMs in the local virtual network. Defaults to
     * true.
     * 
     */
    public Optional<Output<Boolean>> allowVirtualNetworkAccess() {
        return Optional.ofNullable(this.allowVirtualNetworkAccess);
    }

    /**
     * The name of the virtual network peering. Changing this
     * forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the virtual network peering. Changing this
     * forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The full Azure resource ID of the
     * remote virtual network.  Changing this forces a new resource to be created.
     * 
     */
    @Import(name="remoteVirtualNetworkId", required=true)
    private Output<String> remoteVirtualNetworkId;

    /**
     * @return The full Azure resource ID of the
     * remote virtual network.  Changing this forces a new resource to be created.
     * 
     */
    public Output<String> remoteVirtualNetworkId() {
        return this.remoteVirtualNetworkId;
    }

    /**
     * The name of the resource group in which to
     * create the virtual network peering. Changing this forces a new resource to be
     * created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to
     * create the virtual network peering. Changing this forces a new resource to be
     * created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Controls if remote gateways can be used on
     * the local virtual network. If the flag is set to `true`, and
     * `allow_gateway_transit` on the remote peering is also `true`, virtual network will
     * use gateways of remote virtual network for transit. Only one peering can
     * have this flag set to `true`. This flag cannot be set if virtual network
     * already has a gateway. Defaults to `false`.
     * 
     */
    @Import(name="useRemoteGateways")
    private @Nullable Output<Boolean> useRemoteGateways;

    /**
     * @return Controls if remote gateways can be used on
     * the local virtual network. If the flag is set to `true`, and
     * `allow_gateway_transit` on the remote peering is also `true`, virtual network will
     * use gateways of remote virtual network for transit. Only one peering can
     * have this flag set to `true`. This flag cannot be set if virtual network
     * already has a gateway. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> useRemoteGateways() {
        return Optional.ofNullable(this.useRemoteGateways);
    }

    /**
     * The name of the virtual network. Changing
     * this forces a new resource to be created.
     * 
     */
    @Import(name="virtualNetworkName", required=true)
    private Output<String> virtualNetworkName;

    /**
     * @return The name of the virtual network. Changing
     * this forces a new resource to be created.
     * 
     */
    public Output<String> virtualNetworkName() {
        return this.virtualNetworkName;
    }

    private VirtualNetworkPeeringArgs() {}

    private VirtualNetworkPeeringArgs(VirtualNetworkPeeringArgs $) {
        this.allowForwardedTraffic = $.allowForwardedTraffic;
        this.allowGatewayTransit = $.allowGatewayTransit;
        this.allowVirtualNetworkAccess = $.allowVirtualNetworkAccess;
        this.name = $.name;
        this.remoteVirtualNetworkId = $.remoteVirtualNetworkId;
        this.resourceGroupName = $.resourceGroupName;
        this.useRemoteGateways = $.useRemoteGateways;
        this.virtualNetworkName = $.virtualNetworkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkPeeringArgs $;

        public Builder() {
            $ = new VirtualNetworkPeeringArgs();
        }

        public Builder(VirtualNetworkPeeringArgs defaults) {
            $ = new VirtualNetworkPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowForwardedTraffic Controls if forwarded traffic from  VMs
         * in the remote virtual network is allowed. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder allowForwardedTraffic(@Nullable Output<Boolean> allowForwardedTraffic) {
            $.allowForwardedTraffic = allowForwardedTraffic;
            return this;
        }

        /**
         * @param allowForwardedTraffic Controls if forwarded traffic from  VMs
         * in the remote virtual network is allowed. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder allowForwardedTraffic(Boolean allowForwardedTraffic) {
            return allowForwardedTraffic(Output.of(allowForwardedTraffic));
        }

        /**
         * @param allowGatewayTransit Controls gatewayLinks can be used in the
         * remote virtual network’s link to the local virtual network.
         * 
         * @return builder
         * 
         */
        public Builder allowGatewayTransit(@Nullable Output<Boolean> allowGatewayTransit) {
            $.allowGatewayTransit = allowGatewayTransit;
            return this;
        }

        /**
         * @param allowGatewayTransit Controls gatewayLinks can be used in the
         * remote virtual network’s link to the local virtual network.
         * 
         * @return builder
         * 
         */
        public Builder allowGatewayTransit(Boolean allowGatewayTransit) {
            return allowGatewayTransit(Output.of(allowGatewayTransit));
        }

        /**
         * @param allowVirtualNetworkAccess Controls if the VMs in the remote
         * virtual network can access VMs in the local virtual network. Defaults to
         * true.
         * 
         * @return builder
         * 
         */
        public Builder allowVirtualNetworkAccess(@Nullable Output<Boolean> allowVirtualNetworkAccess) {
            $.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
            return this;
        }

        /**
         * @param allowVirtualNetworkAccess Controls if the VMs in the remote
         * virtual network can access VMs in the local virtual network. Defaults to
         * true.
         * 
         * @return builder
         * 
         */
        public Builder allowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess) {
            return allowVirtualNetworkAccess(Output.of(allowVirtualNetworkAccess));
        }

        /**
         * @param name The name of the virtual network peering. Changing this
         * forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the virtual network peering. Changing this
         * forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param remoteVirtualNetworkId The full Azure resource ID of the
         * remote virtual network.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder remoteVirtualNetworkId(Output<String> remoteVirtualNetworkId) {
            $.remoteVirtualNetworkId = remoteVirtualNetworkId;
            return this;
        }

        /**
         * @param remoteVirtualNetworkId The full Azure resource ID of the
         * remote virtual network.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder remoteVirtualNetworkId(String remoteVirtualNetworkId) {
            return remoteVirtualNetworkId(Output.of(remoteVirtualNetworkId));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the virtual network peering. Changing this forces a new resource to be
         * created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the virtual network peering. Changing this forces a new resource to be
         * created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param useRemoteGateways Controls if remote gateways can be used on
         * the local virtual network. If the flag is set to `true`, and
         * `allow_gateway_transit` on the remote peering is also `true`, virtual network will
         * use gateways of remote virtual network for transit. Only one peering can
         * have this flag set to `true`. This flag cannot be set if virtual network
         * already has a gateway. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder useRemoteGateways(@Nullable Output<Boolean> useRemoteGateways) {
            $.useRemoteGateways = useRemoteGateways;
            return this;
        }

        /**
         * @param useRemoteGateways Controls if remote gateways can be used on
         * the local virtual network. If the flag is set to `true`, and
         * `allow_gateway_transit` on the remote peering is also `true`, virtual network will
         * use gateways of remote virtual network for transit. Only one peering can
         * have this flag set to `true`. This flag cannot be set if virtual network
         * already has a gateway. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder useRemoteGateways(Boolean useRemoteGateways) {
            return useRemoteGateways(Output.of(useRemoteGateways));
        }

        /**
         * @param virtualNetworkName The name of the virtual network. Changing
         * this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(Output<String> virtualNetworkName) {
            $.virtualNetworkName = virtualNetworkName;
            return this;
        }

        /**
         * @param virtualNetworkName The name of the virtual network. Changing
         * this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkName(String virtualNetworkName) {
            return virtualNetworkName(Output.of(virtualNetworkName));
        }

        public VirtualNetworkPeeringArgs build() {
            $.remoteVirtualNetworkId = Objects.requireNonNull($.remoteVirtualNetworkId, "expected parameter 'remoteVirtualNetworkId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkName = Objects.requireNonNull($.virtualNetworkName, "expected parameter 'virtualNetworkName' to be non-null");
            return $;
        }
    }

}