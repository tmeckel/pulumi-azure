// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiSchemaArgs Empty = new ApiSchemaArgs();

    /**
     * The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private Output<String> apiManagementName;

    /**
     * @return The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * The name of the API within the API Management Service where this API Schema should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiName", required=true)
    private Output<String> apiName;

    /**
     * @return The name of the API within the API Management Service where this API Schema should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiName() {
        return this.apiName;
    }

    /**
     * Types definitions. Used for Swagger/OpenAPI v2/v3 schemas only.
     * 
     */
    @Import(name="components")
    private @Nullable Output<String> components;

    /**
     * @return Types definitions. Used for Swagger/OpenAPI v2/v3 schemas only.
     * 
     */
    public Optional<Output<String>> components() {
        return Optional.ofNullable(this.components);
    }

    /**
     * The content type of the API Schema.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<String> contentType;

    /**
     * @return The content type of the API Schema.
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * Types definitions. Used for Swagger/OpenAPI v1 schemas only.
     * 
     */
    @Import(name="definitions")
    private @Nullable Output<String> definitions;

    /**
     * @return Types definitions. Used for Swagger/OpenAPI v1 schemas only.
     * 
     */
    public Optional<Output<String>> definitions() {
        return Optional.ofNullable(this.definitions);
    }

    /**
     * The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A unique identifier for this API Schema. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="schemaId", required=true)
    private Output<String> schemaId;

    /**
     * @return A unique identifier for this API Schema. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> schemaId() {
        return this.schemaId;
    }

    /**
     * The JSON escaped string defining the document representing the Schema.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The JSON escaped string defining the document representing the Schema.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ApiSchemaArgs() {}

    private ApiSchemaArgs(ApiSchemaArgs $) {
        this.apiManagementName = $.apiManagementName;
        this.apiName = $.apiName;
        this.components = $.components;
        this.contentType = $.contentType;
        this.definitions = $.definitions;
        this.resourceGroupName = $.resourceGroupName;
        this.schemaId = $.schemaId;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiSchemaArgs $;

        public Builder() {
            $ = new ApiSchemaArgs();
        }

        public Builder(ApiSchemaArgs defaults) {
            $ = new ApiSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The Name of the API Management Service where the API exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param apiName The name of the API within the API Management Service where this API Schema should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiName(Output<String> apiName) {
            $.apiName = apiName;
            return this;
        }

        /**
         * @param apiName The name of the API within the API Management Service where this API Schema should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiName(String apiName) {
            return apiName(Output.of(apiName));
        }

        /**
         * @param components Types definitions. Used for Swagger/OpenAPI v2/v3 schemas only.
         * 
         * @return builder
         * 
         */
        public Builder components(@Nullable Output<String> components) {
            $.components = components;
            return this;
        }

        /**
         * @param components Types definitions. Used for Swagger/OpenAPI v2/v3 schemas only.
         * 
         * @return builder
         * 
         */
        public Builder components(String components) {
            return components(Output.of(components));
        }

        /**
         * @param contentType The content type of the API Schema.
         * 
         * @return builder
         * 
         */
        public Builder contentType(Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        /**
         * @param contentType The content type of the API Schema.
         * 
         * @return builder
         * 
         */
        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        /**
         * @param definitions Types definitions. Used for Swagger/OpenAPI v1 schemas only.
         * 
         * @return builder
         * 
         */
        public Builder definitions(@Nullable Output<String> definitions) {
            $.definitions = definitions;
            return this;
        }

        /**
         * @param definitions Types definitions. Used for Swagger/OpenAPI v1 schemas only.
         * 
         * @return builder
         * 
         */
        public Builder definitions(String definitions) {
            return definitions(Output.of(definitions));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group in which the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param schemaId A unique identifier for this API Schema. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder schemaId(Output<String> schemaId) {
            $.schemaId = schemaId;
            return this;
        }

        /**
         * @param schemaId A unique identifier for this API Schema. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder schemaId(String schemaId) {
            return schemaId(Output.of(schemaId));
        }

        /**
         * @param value The JSON escaped string defining the document representing the Schema.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The JSON escaped string defining the document representing the Schema.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ApiSchemaArgs build() {
            $.apiManagementName = Objects.requireNonNull($.apiManagementName, "expected parameter 'apiManagementName' to be non-null");
            $.apiName = Objects.requireNonNull($.apiName, "expected parameter 'apiName' to be non-null");
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.schemaId = Objects.requireNonNull($.schemaId, "expected parameter 'schemaId' to be non-null");
            return $;
        }
    }

}