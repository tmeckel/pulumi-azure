// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataCollectionRuleDestinationsStorageBlobDirectArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataCollectionRuleDestinationsStorageBlobDirectArgs Empty = new DataCollectionRuleDestinationsStorageBlobDirectArgs();

    /**
     * The Storage Container name.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return The Storage Container name.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The resource ID of the Storage Account.
     * 
     */
    @Import(name="storageAccountId", required=true)
    private Output<String> storageAccountId;

    /**
     * @return The resource ID of the Storage Account.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    private DataCollectionRuleDestinationsStorageBlobDirectArgs() {}

    private DataCollectionRuleDestinationsStorageBlobDirectArgs(DataCollectionRuleDestinationsStorageBlobDirectArgs $) {
        this.containerName = $.containerName;
        this.name = $.name;
        this.storageAccountId = $.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCollectionRuleDestinationsStorageBlobDirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCollectionRuleDestinationsStorageBlobDirectArgs $;

        public Builder() {
            $ = new DataCollectionRuleDestinationsStorageBlobDirectArgs();
        }

        public Builder(DataCollectionRuleDestinationsStorageBlobDirectArgs defaults) {
            $ = new DataCollectionRuleDestinationsStorageBlobDirectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName The Storage Container name.
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName The Storage Container name.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param name The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this destination. This name should be unique across all destinations regardless of type within the Data Collection Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageAccountId The resource ID of the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The resource ID of the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        public DataCollectionRuleDestinationsStorageBlobDirectArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.storageAccountId = Objects.requireNonNull($.storageAccountId, "expected parameter 'storageAccountId' to be non-null");
            return $;
        }
    }

}