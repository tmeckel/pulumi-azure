// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.storage.inputs.ManagementPolicyRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyArgs Empty = new ManagementPolicyArgs();

    /**
     * A `rule` block as documented below.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<ManagementPolicyRuleArgs>> rules;

    /**
     * @return A `rule` block as documented below.
     * 
     */
    public Optional<Output<List<ManagementPolicyRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Specifies the id of the storage account to apply the management policy to.
     * 
     */
    @Import(name="storageAccountId", required=true)
    private Output<String> storageAccountId;

    /**
     * @return Specifies the id of the storage account to apply the management policy to.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    private ManagementPolicyArgs() {}

    private ManagementPolicyArgs(ManagementPolicyArgs $) {
        this.rules = $.rules;
        this.storageAccountId = $.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyArgs $;

        public Builder() {
            $ = new ManagementPolicyArgs();
        }

        public Builder(ManagementPolicyArgs defaults) {
            $ = new ManagementPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rules A `rule` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<ManagementPolicyRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A `rule` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ManagementPolicyRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules A `rule` block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(ManagementPolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param storageAccountId Specifies the id of the storage account to apply the management policy to.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId Specifies the id of the storage account to apply the management policy to.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        public ManagementPolicyArgs build() {
            $.storageAccountId = Objects.requireNonNull($.storageAccountId, "expected parameter 'storageAccountId' to be non-null");
            return $;
        }
    }

}