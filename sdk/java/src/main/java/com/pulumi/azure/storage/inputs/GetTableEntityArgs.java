// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTableEntityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTableEntityArgs Empty = new GetTableEntityArgs();

    /**
     * The key for the partition where the entity will be retrieved.
     * 
     */
    @Import(name="partitionKey", required=true)
    private Output<String> partitionKey;

    /**
     * @return The key for the partition where the entity will be retrieved.
     * 
     */
    public Output<String> partitionKey() {
        return this.partitionKey;
    }

    /**
     * The key for the row where the entity will be retrieved.
     * 
     */
    @Import(name="rowKey", required=true)
    private Output<String> rowKey;

    /**
     * @return The key for the row where the entity will be retrieved.
     * 
     */
    public Output<String> rowKey() {
        return this.rowKey;
    }

    /**
     * The name of the Storage Account where the Table exists.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private Output<String> storageAccountName;

    /**
     * @return The name of the Storage Account where the Table exists.
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * The name of the Table.
     * 
     */
    @Import(name="tableName", required=true)
    private Output<String> tableName;

    /**
     * @return The name of the Table.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }

    private GetTableEntityArgs() {}

    private GetTableEntityArgs(GetTableEntityArgs $) {
        this.partitionKey = $.partitionKey;
        this.rowKey = $.rowKey;
        this.storageAccountName = $.storageAccountName;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableEntityArgs $;

        public Builder() {
            $ = new GetTableEntityArgs();
        }

        public Builder(GetTableEntityArgs defaults) {
            $ = new GetTableEntityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param partitionKey The key for the partition where the entity will be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(Output<String> partitionKey) {
            $.partitionKey = partitionKey;
            return this;
        }

        /**
         * @param partitionKey The key for the partition where the entity will be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(String partitionKey) {
            return partitionKey(Output.of(partitionKey));
        }

        /**
         * @param rowKey The key for the row where the entity will be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder rowKey(Output<String> rowKey) {
            $.rowKey = rowKey;
            return this;
        }

        /**
         * @param rowKey The key for the row where the entity will be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder rowKey(String rowKey) {
            return rowKey(Output.of(rowKey));
        }

        /**
         * @param storageAccountName The name of the Storage Account where the Table exists.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The name of the Storage Account where the Table exists.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        /**
         * @param tableName The name of the Table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName The name of the Table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public GetTableEntityArgs build() {
            $.partitionKey = Objects.requireNonNull($.partitionKey, "expected parameter 'partitionKey' to be non-null");
            $.rowKey = Objects.requireNonNull($.rowKey, "expected parameter 'rowKey' to be non-null");
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}