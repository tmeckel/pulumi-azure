// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionTypeFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionTypeFieldArgs Empty = new ConnectionTypeFieldArgs();

    /**
     * Whether to set the isEncrypted flag of the connection field definition.
     * 
     */
    @Import(name="isEncrypted")
    private @Nullable Output<Boolean> isEncrypted;

    /**
     * @return Whether to set the isEncrypted flag of the connection field definition.
     * 
     */
    public Optional<Output<Boolean>> isEncrypted() {
        return Optional.ofNullable(this.isEncrypted);
    }

    /**
     * Whether to set the isOptional flag of the connection field definition.
     * 
     */
    @Import(name="isOptional")
    private @Nullable Output<Boolean> isOptional;

    /**
     * @return Whether to set the isOptional flag of the connection field definition.
     * 
     */
    public Optional<Output<Boolean>> isOptional() {
        return Optional.ofNullable(this.isOptional);
    }

    /**
     * The name which should be used for this connection field definition.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this connection field definition.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The type of the connection field definition.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the connection field definition.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ConnectionTypeFieldArgs() {}

    private ConnectionTypeFieldArgs(ConnectionTypeFieldArgs $) {
        this.isEncrypted = $.isEncrypted;
        this.isOptional = $.isOptional;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionTypeFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionTypeFieldArgs $;

        public Builder() {
            $ = new ConnectionTypeFieldArgs();
        }

        public Builder(ConnectionTypeFieldArgs defaults) {
            $ = new ConnectionTypeFieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isEncrypted Whether to set the isEncrypted flag of the connection field definition.
         * 
         * @return builder
         * 
         */
        public Builder isEncrypted(@Nullable Output<Boolean> isEncrypted) {
            $.isEncrypted = isEncrypted;
            return this;
        }

        /**
         * @param isEncrypted Whether to set the isEncrypted flag of the connection field definition.
         * 
         * @return builder
         * 
         */
        public Builder isEncrypted(Boolean isEncrypted) {
            return isEncrypted(Output.of(isEncrypted));
        }

        /**
         * @param isOptional Whether to set the isOptional flag of the connection field definition.
         * 
         * @return builder
         * 
         */
        public Builder isOptional(@Nullable Output<Boolean> isOptional) {
            $.isOptional = isOptional;
            return this;
        }

        /**
         * @param isOptional Whether to set the isOptional flag of the connection field definition.
         * 
         * @return builder
         * 
         */
        public Builder isOptional(Boolean isOptional) {
            return isOptional(Output.of(isOptional));
        }

        /**
         * @param name The name which should be used for this connection field definition.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this connection field definition.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of the connection field definition.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the connection field definition.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ConnectionTypeFieldArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}