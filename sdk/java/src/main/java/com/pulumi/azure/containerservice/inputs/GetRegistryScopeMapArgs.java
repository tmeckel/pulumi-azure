// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryScopeMapArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryScopeMapArgs Empty = new GetRegistryScopeMapArgs();

    /**
     * The Name of the Container Registry where the token exists.
     * 
     */
    @Import(name="containerRegistryName", required=true)
    private Output<String> containerRegistryName;

    /**
     * @return The Name of the Container Registry where the token exists.
     * 
     */
    public Output<String> containerRegistryName() {
        return this.containerRegistryName;
    }

    /**
     * The name of the Container Registry token.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Container Registry token.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where this Container Registry token exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where this Container Registry token exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetRegistryScopeMapArgs() {}

    private GetRegistryScopeMapArgs(GetRegistryScopeMapArgs $) {
        this.containerRegistryName = $.containerRegistryName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryScopeMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryScopeMapArgs $;

        public Builder() {
            $ = new GetRegistryScopeMapArgs();
        }

        public Builder(GetRegistryScopeMapArgs defaults) {
            $ = new GetRegistryScopeMapArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerRegistryName The Name of the Container Registry where the token exists.
         * 
         * @return builder
         * 
         */
        public Builder containerRegistryName(Output<String> containerRegistryName) {
            $.containerRegistryName = containerRegistryName;
            return this;
        }

        /**
         * @param containerRegistryName The Name of the Container Registry where the token exists.
         * 
         * @return builder
         * 
         */
        public Builder containerRegistryName(String containerRegistryName) {
            return containerRegistryName(Output.of(containerRegistryName));
        }

        /**
         * @param name The name of the Container Registry token.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Container Registry token.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where this Container Registry token exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where this Container Registry token exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetRegistryScopeMapArgs build() {
            $.containerRegistryName = Objects.requireNonNull($.containerRegistryName, "expected parameter 'containerRegistryName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}