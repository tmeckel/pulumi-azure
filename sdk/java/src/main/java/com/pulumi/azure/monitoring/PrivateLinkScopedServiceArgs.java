// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkScopedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkScopedServiceArgs Empty = new PrivateLinkScopedServiceArgs();

    /**
     * The ID of the linked resource. It must be the Log Analytics workspace or the Application Insights component or the Data Collection endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="linkedResourceId", required=true)
    private Output<String> linkedResourceId;

    /**
     * @return The ID of the linked resource. It must be the Log Analytics workspace or the Application Insights component or the Data Collection endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> linkedResourceId() {
        return this.linkedResourceId;
    }

    /**
     * The name of the Azure Monitor Private Link Scoped Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Azure Monitor Private Link Scoped Service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Azure Monitor Private Link Scoped Service should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Azure Monitor Private Link Scoped Service should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="scopeName", required=true)
    private Output<String> scopeName;

    /**
     * @return The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> scopeName() {
        return this.scopeName;
    }

    private PrivateLinkScopedServiceArgs() {}

    private PrivateLinkScopedServiceArgs(PrivateLinkScopedServiceArgs $) {
        this.linkedResourceId = $.linkedResourceId;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.scopeName = $.scopeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkScopedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkScopedServiceArgs $;

        public Builder() {
            $ = new PrivateLinkScopedServiceArgs();
        }

        public Builder(PrivateLinkScopedServiceArgs defaults) {
            $ = new PrivateLinkScopedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkedResourceId The ID of the linked resource. It must be the Log Analytics workspace or the Application Insights component or the Data Collection endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedResourceId(Output<String> linkedResourceId) {
            $.linkedResourceId = linkedResourceId;
            return this;
        }

        /**
         * @param linkedResourceId The ID of the linked resource. It must be the Log Analytics workspace or the Application Insights component or the Data Collection endpoint. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedResourceId(String linkedResourceId) {
            return linkedResourceId(Output.of(linkedResourceId));
        }

        /**
         * @param name The name of the Azure Monitor Private Link Scoped Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Azure Monitor Private Link Scoped Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Azure Monitor Private Link Scoped Service should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Azure Monitor Private Link Scoped Service should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scopeName The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scopeName(Output<String> scopeName) {
            $.scopeName = scopeName;
            return this;
        }

        /**
         * @param scopeName The name of the Azure Monitor Private Link Scope. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scopeName(String scopeName) {
            return scopeName(Output.of(scopeName));
        }

        public PrivateLinkScopedServiceArgs build() {
            $.linkedResourceId = Objects.requireNonNull($.linkedResourceId, "expected parameter 'linkedResourceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scopeName = Objects.requireNonNull($.scopeName, "expected parameter 'scopeName' to be non-null");
            return $;
        }
    }

}