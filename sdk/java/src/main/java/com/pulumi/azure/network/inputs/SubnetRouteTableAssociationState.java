// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetRouteTableAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final SubnetRouteTableAssociationState Empty = new SubnetRouteTableAssociationState();

    /**
     * The ID of the Route Table which should be associated with the Subnet. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="routeTableId")
    private @Nullable Output<String> routeTableId;

    /**
     * @return The ID of the Route Table which should be associated with the Subnet. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> routeTableId() {
        return Optional.ofNullable(this.routeTableId);
    }

    /**
     * The ID of the Subnet. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    private SubnetRouteTableAssociationState() {}

    private SubnetRouteTableAssociationState(SubnetRouteTableAssociationState $) {
        this.routeTableId = $.routeTableId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetRouteTableAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetRouteTableAssociationState $;

        public Builder() {
            $ = new SubnetRouteTableAssociationState();
        }

        public Builder(SubnetRouteTableAssociationState defaults) {
            $ = new SubnetRouteTableAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param routeTableId The ID of the Route Table which should be associated with the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(@Nullable Output<String> routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        /**
         * @param routeTableId The ID of the Route Table which should be associated with the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(String routeTableId) {
            return routeTableId(Output.of(routeTableId));
        }

        /**
         * @param subnetId The ID of the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public SubnetRouteTableAssociationState build() {
            return $;
        }
    }

}