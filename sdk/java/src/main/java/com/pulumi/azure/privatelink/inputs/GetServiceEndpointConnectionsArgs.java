// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatelink.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceEndpointConnectionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceEndpointConnectionsArgs Empty = new GetServiceEndpointConnectionsArgs();

    /**
     * The name of the resource group in which the private link service resides.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the private link service resides.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource ID of the private link service.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return The resource ID of the private link service.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    private GetServiceEndpointConnectionsArgs() {}

    private GetServiceEndpointConnectionsArgs(GetServiceEndpointConnectionsArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceEndpointConnectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceEndpointConnectionsArgs $;

        public Builder() {
            $ = new GetServiceEndpointConnectionsArgs();
        }

        public Builder(GetServiceEndpointConnectionsArgs defaults) {
            $ = new GetServiceEndpointConnectionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the private link service resides.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the private link service resides.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceId The resource ID of the private link service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The resource ID of the private link service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public GetServiceEndpointConnectionsArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}