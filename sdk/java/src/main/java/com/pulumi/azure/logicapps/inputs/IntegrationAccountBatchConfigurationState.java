// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.azure.logicapps.inputs.IntegrationAccountBatchConfigurationReleaseCriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationAccountBatchConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationAccountBatchConfigurationState Empty = new IntegrationAccountBatchConfigurationState();

    /**
     * The batch group name of the Logic App Integration Batch Configuration. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="batchGroupName")
    private @Nullable Output<String> batchGroupName;

    /**
     * @return The batch group name of the Logic App Integration Batch Configuration. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> batchGroupName() {
        return Optional.ofNullable(this.batchGroupName);
    }

    /**
     * The name of the Logic App Integration Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="integrationAccountName")
    private @Nullable Output<String> integrationAccountName;

    /**
     * @return The name of the Logic App Integration Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> integrationAccountName() {
        return Optional.ofNullable(this.integrationAccountName);
    }

    /**
     * A JSON mapping of any Metadata for this Logic App Integration Account Batch Configuration.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return A JSON mapping of any Metadata for this Logic App Integration Account Batch Configuration.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name which should be used for this Logic App Integration Account Batch Configuration. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Logic App Integration Account Batch Configuration. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `release_criteria` block as documented below, which is used to select the criteria to meet before processing each batch.
     * 
     */
    @Import(name="releaseCriteria")
    private @Nullable Output<IntegrationAccountBatchConfigurationReleaseCriteriaArgs> releaseCriteria;

    /**
     * @return A `release_criteria` block as documented below, which is used to select the criteria to meet before processing each batch.
     * 
     */
    public Optional<Output<IntegrationAccountBatchConfigurationReleaseCriteriaArgs>> releaseCriteria() {
        return Optional.ofNullable(this.releaseCriteria);
    }

    /**
     * The name of the Resource Group where the Logic App Integration Account Batch Configuration should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Logic App Integration Account Batch Configuration should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private IntegrationAccountBatchConfigurationState() {}

    private IntegrationAccountBatchConfigurationState(IntegrationAccountBatchConfigurationState $) {
        this.batchGroupName = $.batchGroupName;
        this.integrationAccountName = $.integrationAccountName;
        this.metadata = $.metadata;
        this.name = $.name;
        this.releaseCriteria = $.releaseCriteria;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationAccountBatchConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationAccountBatchConfigurationState $;

        public Builder() {
            $ = new IntegrationAccountBatchConfigurationState();
        }

        public Builder(IntegrationAccountBatchConfigurationState defaults) {
            $ = new IntegrationAccountBatchConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchGroupName The batch group name of the Logic App Integration Batch Configuration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder batchGroupName(@Nullable Output<String> batchGroupName) {
            $.batchGroupName = batchGroupName;
            return this;
        }

        /**
         * @param batchGroupName The batch group name of the Logic App Integration Batch Configuration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder batchGroupName(String batchGroupName) {
            return batchGroupName(Output.of(batchGroupName));
        }

        /**
         * @param integrationAccountName The name of the Logic App Integration Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(@Nullable Output<String> integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        /**
         * @param integrationAccountName The name of the Logic App Integration Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder integrationAccountName(String integrationAccountName) {
            return integrationAccountName(Output.of(integrationAccountName));
        }

        /**
         * @param metadata A JSON mapping of any Metadata for this Logic App Integration Account Batch Configuration.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A JSON mapping of any Metadata for this Logic App Integration Account Batch Configuration.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name which should be used for this Logic App Integration Account Batch Configuration. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Logic App Integration Account Batch Configuration. Only Alphanumeric characters allowed. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param releaseCriteria A `release_criteria` block as documented below, which is used to select the criteria to meet before processing each batch.
         * 
         * @return builder
         * 
         */
        public Builder releaseCriteria(@Nullable Output<IntegrationAccountBatchConfigurationReleaseCriteriaArgs> releaseCriteria) {
            $.releaseCriteria = releaseCriteria;
            return this;
        }

        /**
         * @param releaseCriteria A `release_criteria` block as documented below, which is used to select the criteria to meet before processing each batch.
         * 
         * @return builder
         * 
         */
        public Builder releaseCriteria(IntegrationAccountBatchConfigurationReleaseCriteriaArgs releaseCriteria) {
            return releaseCriteria(Output.of(releaseCriteria));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Logic App Integration Account Batch Configuration should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Logic App Integration Account Batch Configuration should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public IntegrationAccountBatchConfigurationState build() {
            return $;
        }
    }

}