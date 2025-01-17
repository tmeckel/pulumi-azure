// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkDdosProtectionPlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkDdosProtectionPlanArgs Empty = new GetNetworkDdosProtectionPlanArgs();

    /**
     * The name of the Network DDoS Protection Plan.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Network DDoS Protection Plan.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group where the Network DDoS Protection Plan exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the Network DDoS Protection Plan exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNetworkDdosProtectionPlanArgs() {}

    private GetNetworkDdosProtectionPlanArgs(GetNetworkDdosProtectionPlanArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkDdosProtectionPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkDdosProtectionPlanArgs $;

        public Builder() {
            $ = new GetNetworkDdosProtectionPlanArgs();
        }

        public Builder(GetNetworkDdosProtectionPlanArgs defaults) {
            $ = new GetNetworkDdosProtectionPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Network DDoS Protection Plan.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Network DDoS Protection Plan.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group where the Network DDoS Protection Plan exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the Network DDoS Protection Plan exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetNetworkDdosProtectionPlanArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
