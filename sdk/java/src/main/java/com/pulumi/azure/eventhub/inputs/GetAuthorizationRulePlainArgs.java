// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthorizationRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationRulePlainArgs Empty = new GetAuthorizationRulePlainArgs();

    /**
     * Specifies the name of the EventHub.
     * 
     */
    @Import(name="eventhubName", required=true)
    private String eventhubName;

    /**
     * @return Specifies the name of the EventHub.
     * 
     */
    public String eventhubName() {
        return this.eventhubName;
    }

    @Import(name="listen")
    private @Nullable Boolean listen;

    public Optional<Boolean> listen() {
        return Optional.ofNullable(this.listen);
    }

    @Import(name="manage")
    private @Nullable Boolean manage;

    public Optional<Boolean> manage() {
        return Optional.ofNullable(this.manage);
    }

    /**
     * Specifies the name of the EventHub Authorization Rule resource. be created.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the EventHub Authorization Rule resource. be created.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies the name of the grandparent EventHub Namespace.
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return Specifies the name of the grandparent EventHub Namespace.
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * The name of the resource group in which the EventHub Authorization Rule&#39;s grandparent Namespace exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group in which the EventHub Authorization Rule&#39;s grandparent Namespace exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="send")
    private @Nullable Boolean send;

    public Optional<Boolean> send() {
        return Optional.ofNullable(this.send);
    }

    private GetAuthorizationRulePlainArgs() {}

    private GetAuthorizationRulePlainArgs(GetAuthorizationRulePlainArgs $) {
        this.eventhubName = $.eventhubName;
        this.listen = $.listen;
        this.manage = $.manage;
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
        this.send = $.send;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizationRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizationRulePlainArgs $;

        public Builder() {
            $ = new GetAuthorizationRulePlainArgs();
        }

        public Builder(GetAuthorizationRulePlainArgs defaults) {
            $ = new GetAuthorizationRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventhubName Specifies the name of the EventHub.
         * 
         * @return builder
         * 
         */
        public Builder eventhubName(String eventhubName) {
            $.eventhubName = eventhubName;
            return this;
        }

        public Builder listen(@Nullable Boolean listen) {
            $.listen = listen;
            return this;
        }

        public Builder manage(@Nullable Boolean manage) {
            $.manage = manage;
            return this;
        }

        /**
         * @param name Specifies the name of the EventHub Authorization Rule resource. be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespaceName Specifies the name of the grandparent EventHub Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventHub Authorization Rule&#39;s grandparent Namespace exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder send(@Nullable Boolean send) {
            $.send = send;
            return this;
        }

        public GetAuthorizationRulePlainArgs build() {
            $.eventhubName = Objects.requireNonNull($.eventhubName, "expected parameter 'eventhubName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}