// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MongoRoleDefinitionPrivilegeResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MongoRoleDefinitionPrivilegeResourceArgs Empty = new MongoRoleDefinitionPrivilegeResourceArgs();

    /**
     * The name of the Mongo DB Collection that the Role Definition is applied.
     * 
     */
    @Import(name="collectionName")
    private @Nullable Output<String> collectionName;

    /**
     * @return The name of the Mongo DB Collection that the Role Definition is applied.
     * 
     */
    public Optional<Output<String>> collectionName() {
        return Optional.ofNullable(this.collectionName);
    }

    /**
     * The name of the Mongo DB that the Role Definition is applied.
     * 
     */
    @Import(name="dbName")
    private @Nullable Output<String> dbName;

    /**
     * @return The name of the Mongo DB that the Role Definition is applied.
     * 
     */
    public Optional<Output<String>> dbName() {
        return Optional.ofNullable(this.dbName);
    }

    private MongoRoleDefinitionPrivilegeResourceArgs() {}

    private MongoRoleDefinitionPrivilegeResourceArgs(MongoRoleDefinitionPrivilegeResourceArgs $) {
        this.collectionName = $.collectionName;
        this.dbName = $.dbName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MongoRoleDefinitionPrivilegeResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MongoRoleDefinitionPrivilegeResourceArgs $;

        public Builder() {
            $ = new MongoRoleDefinitionPrivilegeResourceArgs();
        }

        public Builder(MongoRoleDefinitionPrivilegeResourceArgs defaults) {
            $ = new MongoRoleDefinitionPrivilegeResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param collectionName The name of the Mongo DB Collection that the Role Definition is applied.
         * 
         * @return builder
         * 
         */
        public Builder collectionName(@Nullable Output<String> collectionName) {
            $.collectionName = collectionName;
            return this;
        }

        /**
         * @param collectionName The name of the Mongo DB Collection that the Role Definition is applied.
         * 
         * @return builder
         * 
         */
        public Builder collectionName(String collectionName) {
            return collectionName(Output.of(collectionName));
        }

        /**
         * @param dbName The name of the Mongo DB that the Role Definition is applied.
         * 
         * @return builder
         * 
         */
        public Builder dbName(@Nullable Output<String> dbName) {
            $.dbName = dbName;
            return this;
        }

        /**
         * @param dbName The name of the Mongo DB that the Role Definition is applied.
         * 
         * @return builder
         * 
         */
        public Builder dbName(String dbName) {
            return dbName(Output.of(dbName));
        }

        public MongoRoleDefinitionPrivilegeResourceArgs build() {
            return $;
        }
    }

}