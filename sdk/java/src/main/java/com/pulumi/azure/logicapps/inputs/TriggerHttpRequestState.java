// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerHttpRequestState extends com.pulumi.resources.ResourceArgs {

    public static final TriggerHttpRequestState Empty = new TriggerHttpRequestState();

    /**
     * The URL for the workflow trigger
     * 
     */
    @Import(name="callbackUrl")
    private @Nullable Output<String> callbackUrl;

    /**
     * @return The URL for the workflow trigger
     * 
     */
    public Optional<Output<String>> callbackUrl() {
        return Optional.ofNullable(this.callbackUrl);
    }

    /**
     * Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="logicAppId")
    private @Nullable Output<String> logicAppId;

    /**
     * @return Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> logicAppId() {
        return Optional.ofNullable(this.logicAppId);
    }

    /**
     * Specifies the HTTP Method which the request be using. Possible values include `DELETE`, `GET`, `PATCH`, `POST` or `PUT`.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return Specifies the HTTP Method which the request be using. Possible values include `DELETE`, `GET`, `PATCH`, `POST` or `PUT`.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Specifies the name of the HTTP Request Trigger to be created within the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the HTTP Request Trigger to be created within the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the Relative Path used for this Request.
     * 
     */
    @Import(name="relativePath")
    private @Nullable Output<String> relativePath;

    /**
     * @return Specifies the Relative Path used for this Request.
     * 
     */
    public Optional<Output<String>> relativePath() {
        return Optional.ofNullable(this.relativePath);
    }

    /**
     * A JSON Blob defining the Schema of the incoming request. This needs to be valid JSON.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return A JSON Blob defining the Schema of the incoming request. This needs to be valid JSON.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    private TriggerHttpRequestState() {}

    private TriggerHttpRequestState(TriggerHttpRequestState $) {
        this.callbackUrl = $.callbackUrl;
        this.logicAppId = $.logicAppId;
        this.method = $.method;
        this.name = $.name;
        this.relativePath = $.relativePath;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerHttpRequestState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerHttpRequestState $;

        public Builder() {
            $ = new TriggerHttpRequestState();
        }

        public Builder(TriggerHttpRequestState defaults) {
            $ = new TriggerHttpRequestState(Objects.requireNonNull(defaults));
        }

        /**
         * @param callbackUrl The URL for the workflow trigger
         * 
         * @return builder
         * 
         */
        public Builder callbackUrl(@Nullable Output<String> callbackUrl) {
            $.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * @param callbackUrl The URL for the workflow trigger
         * 
         * @return builder
         * 
         */
        public Builder callbackUrl(String callbackUrl) {
            return callbackUrl(Output.of(callbackUrl));
        }

        /**
         * @param logicAppId Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder logicAppId(@Nullable Output<String> logicAppId) {
            $.logicAppId = logicAppId;
            return this;
        }

        /**
         * @param logicAppId Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder logicAppId(String logicAppId) {
            return logicAppId(Output.of(logicAppId));
        }

        /**
         * @param method Specifies the HTTP Method which the request be using. Possible values include `DELETE`, `GET`, `PATCH`, `POST` or `PUT`.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Specifies the HTTP Method which the request be using. Possible values include `DELETE`, `GET`, `PATCH`, `POST` or `PUT`.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param name Specifies the name of the HTTP Request Trigger to be created within the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the HTTP Request Trigger to be created within the Logic App Workflow. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param relativePath Specifies the Relative Path used for this Request.
         * 
         * @return builder
         * 
         */
        public Builder relativePath(@Nullable Output<String> relativePath) {
            $.relativePath = relativePath;
            return this;
        }

        /**
         * @param relativePath Specifies the Relative Path used for this Request.
         * 
         * @return builder
         * 
         */
        public Builder relativePath(String relativePath) {
            return relativePath(Output.of(relativePath));
        }

        /**
         * @param schema A JSON Blob defining the Schema of the incoming request. This needs to be valid JSON.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema A JSON Blob defining the Schema of the incoming request. This needs to be valid JSON.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public TriggerHttpRequestState build() {
            return $;
        }
    }

}