// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceSchemaGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceSchemaGroupArgs Empty = new NamespaceSchemaGroupArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="namespaceId", required=true)
    private Output<String> namespaceId;

    /**
     * @return The ID of the EventHub Namespace. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    /**
     * The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="schemaCompatibility", required=true)
    private Output<String> schemaCompatibility;

    /**
     * @return The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> schemaCompatibility() {
        return this.schemaCompatibility;
    }

    /**
     * The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="schemaType", required=true)
    private Output<String> schemaType;

    /**
     * @return The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> schemaType() {
        return this.schemaType;
    }

    private NamespaceSchemaGroupArgs() {}

    private NamespaceSchemaGroupArgs(NamespaceSchemaGroupArgs $) {
        this.name = $.name;
        this.namespaceId = $.namespaceId;
        this.schemaCompatibility = $.schemaCompatibility;
        this.schemaType = $.schemaType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceSchemaGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceSchemaGroupArgs $;

        public Builder() {
            $ = new NamespaceSchemaGroupArgs();
        }

        public Builder(NamespaceSchemaGroupArgs defaults) {
            $ = new NamespaceSchemaGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceId The ID of the EventHub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The ID of the EventHub Namespace. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param schemaCompatibility The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder schemaCompatibility(Output<String> schemaCompatibility) {
            $.schemaCompatibility = schemaCompatibility;
            return this;
        }

        /**
         * @param schemaCompatibility The compatibility of this schema group. Possible values are `None`, `Backward`, `Forward`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder schemaCompatibility(String schemaCompatibility) {
            return schemaCompatibility(Output.of(schemaCompatibility));
        }

        /**
         * @param schemaType The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder schemaType(Output<String> schemaType) {
            $.schemaType = schemaType;
            return this;
        }

        /**
         * @param schemaType The Type of this schema group. Possible values are `Avro`, `Unknown`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder schemaType(String schemaType) {
            return schemaType(Output.of(schemaType));
        }

        public NamespaceSchemaGroupArgs build() {
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            $.schemaCompatibility = Objects.requireNonNull($.schemaCompatibility, "expected parameter 'schemaCompatibility' to be non-null");
            $.schemaType = Objects.requireNonNull($.schemaType, "expected parameter 'schemaType' to be non-null");
            return $;
        }
    }

}