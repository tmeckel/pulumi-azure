// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicationLoadBalancerSubnetAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final LicationLoadBalancerSubnetAssociationState Empty = new LicationLoadBalancerSubnetAssociationState();

    /**
     * The ID of the Application Gateway for Containers. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="applicationLoadBalancerId")
    private @Nullable Output<String> applicationLoadBalancerId;

    /**
     * @return The ID of the Application Gateway for Containers. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> applicationLoadBalancerId() {
        return Optional.ofNullable(this.applicationLoadBalancerId);
    }

    /**
     * The name which should be used for this Application Gateway for Containers Association. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Application Gateway for Containers Association. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the subnet which the Application Gateway for Containers associated to. Changing this forces a new resource to be created.
     * 
     * **Note:** The subnet to be used must have a delegation for  `Microsoft.ServiceNetworking/trafficControllers` as shown in the example above.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the subnet which the Application Gateway for Containers associated to. Changing this forces a new resource to be created.
     * 
     * **Note:** The subnet to be used must have a delegation for  `Microsoft.ServiceNetworking/trafficControllers` as shown in the example above.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * A mapping of tags which should be assigned to the Application Gateway for Containers Association.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Application Gateway for Containers Association.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private LicationLoadBalancerSubnetAssociationState() {}

    private LicationLoadBalancerSubnetAssociationState(LicationLoadBalancerSubnetAssociationState $) {
        this.applicationLoadBalancerId = $.applicationLoadBalancerId;
        this.name = $.name;
        this.subnetId = $.subnetId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicationLoadBalancerSubnetAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicationLoadBalancerSubnetAssociationState $;

        public Builder() {
            $ = new LicationLoadBalancerSubnetAssociationState();
        }

        public Builder(LicationLoadBalancerSubnetAssociationState defaults) {
            $ = new LicationLoadBalancerSubnetAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationLoadBalancerId The ID of the Application Gateway for Containers. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationLoadBalancerId(@Nullable Output<String> applicationLoadBalancerId) {
            $.applicationLoadBalancerId = applicationLoadBalancerId;
            return this;
        }

        /**
         * @param applicationLoadBalancerId The ID of the Application Gateway for Containers. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationLoadBalancerId(String applicationLoadBalancerId) {
            return applicationLoadBalancerId(Output.of(applicationLoadBalancerId));
        }

        /**
         * @param name The name which should be used for this Application Gateway for Containers Association. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Application Gateway for Containers Association. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param subnetId The ID of the subnet which the Application Gateway for Containers associated to. Changing this forces a new resource to be created.
         * 
         * **Note:** The subnet to be used must have a delegation for  `Microsoft.ServiceNetworking/trafficControllers` as shown in the example above.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the subnet which the Application Gateway for Containers associated to. Changing this forces a new resource to be created.
         * 
         * **Note:** The subnet to be used must have a delegation for  `Microsoft.ServiceNetworking/trafficControllers` as shown in the example above.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Application Gateway for Containers Association.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Application Gateway for Containers Association.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public LicationLoadBalancerSubnetAssociationState build() {
            return $;
        }
    }

}