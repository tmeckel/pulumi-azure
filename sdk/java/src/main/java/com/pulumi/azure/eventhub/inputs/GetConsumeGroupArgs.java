// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConsumeGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConsumeGroupArgs Empty = new GetConsumeGroupArgs();

    /**
     * Specifies the name of the EventHub.
     * 
     */
    @Import(name="eventhubName", required=true)
    private Output<String> eventhubName;

    /**
     * @return Specifies the name of the EventHub.
     * 
     */
    public Output<String> eventhubName() {
        return this.eventhubName;
    }

    /**
     * Specifies the name of the EventHub Consumer Group resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the EventHub Consumer Group resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the name of the grandparent EventHub Namespace.
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return Specifies the name of the grandparent EventHub Namespace.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetConsumeGroupArgs() {}

    private GetConsumeGroupArgs(GetConsumeGroupArgs $) {
        this.eventhubName = $.eventhubName;
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConsumeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConsumeGroupArgs $;

        public Builder() {
            $ = new GetConsumeGroupArgs();
        }

        public Builder(GetConsumeGroupArgs defaults) {
            $ = new GetConsumeGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventhubName Specifies the name of the EventHub.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(Output<String> eventhubName) {
            $.eventhubName = eventhubName;
            return this;
        }

        /**
         * @param eventhubName Specifies the name of the EventHub.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(String eventhubName) {
            return eventhubName(Output.of(eventhubName));
        }

        /**
         * @param name Specifies the name of the EventHub Consumer Group resource.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the EventHub Consumer Group resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName Specifies the name of the grandparent EventHub Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName Specifies the name of the grandparent EventHub Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventHub Consumer Group&#39;s grandparent Namespace exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetConsumeGroupArgs build() {
            $.eventhubName = Objects.requireNonNull($.eventhubName, "expected parameter 'eventhubName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}