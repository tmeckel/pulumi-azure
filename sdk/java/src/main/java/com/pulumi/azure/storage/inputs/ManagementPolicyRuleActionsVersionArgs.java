// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementPolicyRuleActionsVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyRuleActionsVersionArgs Empty = new ManagementPolicyRuleActionsVersionArgs();

    /**
     * The age in days after creation to tier blob version to archive storage. Must be between 0 and 99999.
     * 
     */
    @Import(name="changeTierToArchiveAfterDaysSinceCreation")
    private @Nullable Output<Integer> changeTierToArchiveAfterDaysSinceCreation;

    /**
     * @return The age in days after creation to tier blob version to archive storage. Must be between 0 and 99999.
     * 
     */
    public Optional<Output<Integer>> changeTierToArchiveAfterDaysSinceCreation() {
        return Optional.ofNullable(this.changeTierToArchiveAfterDaysSinceCreation);
    }

    /**
     * The age in days creation create to  tier blob version to cool storage. Must be between 0 and 99999.
     * 
     */
    @Import(name="changeTierToCoolAfterDaysSinceCreation")
    private @Nullable Output<Integer> changeTierToCoolAfterDaysSinceCreation;

    /**
     * @return The age in days creation create to  tier blob version to cool storage. Must be between 0 and 99999.
     * 
     */
    public Optional<Output<Integer>> changeTierToCoolAfterDaysSinceCreation() {
        return Optional.ofNullable(this.changeTierToCoolAfterDaysSinceCreation);
    }

    /**
     * The age in days after creation to delete the blob version. Must be between 0 and 99999.
     * 
     */
    @Import(name="deleteAfterDaysSinceCreation")
    private @Nullable Output<Integer> deleteAfterDaysSinceCreation;

    /**
     * @return The age in days after creation to delete the blob version. Must be between 0 and 99999.
     * 
     */
    public Optional<Output<Integer>> deleteAfterDaysSinceCreation() {
        return Optional.ofNullable(this.deleteAfterDaysSinceCreation);
    }

    private ManagementPolicyRuleActionsVersionArgs() {}

    private ManagementPolicyRuleActionsVersionArgs(ManagementPolicyRuleActionsVersionArgs $) {
        this.changeTierToArchiveAfterDaysSinceCreation = $.changeTierToArchiveAfterDaysSinceCreation;
        this.changeTierToCoolAfterDaysSinceCreation = $.changeTierToCoolAfterDaysSinceCreation;
        this.deleteAfterDaysSinceCreation = $.deleteAfterDaysSinceCreation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementPolicyRuleActionsVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicyRuleActionsVersionArgs $;

        public Builder() {
            $ = new ManagementPolicyRuleActionsVersionArgs();
        }

        public Builder(ManagementPolicyRuleActionsVersionArgs defaults) {
            $ = new ManagementPolicyRuleActionsVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param changeTierToArchiveAfterDaysSinceCreation The age in days after creation to tier blob version to archive storage. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder changeTierToArchiveAfterDaysSinceCreation(@Nullable Output<Integer> changeTierToArchiveAfterDaysSinceCreation) {
            $.changeTierToArchiveAfterDaysSinceCreation = changeTierToArchiveAfterDaysSinceCreation;
            return this;
        }

        /**
         * @param changeTierToArchiveAfterDaysSinceCreation The age in days after creation to tier blob version to archive storage. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder changeTierToArchiveAfterDaysSinceCreation(Integer changeTierToArchiveAfterDaysSinceCreation) {
            return changeTierToArchiveAfterDaysSinceCreation(Output.of(changeTierToArchiveAfterDaysSinceCreation));
        }

        /**
         * @param changeTierToCoolAfterDaysSinceCreation The age in days creation create to  tier blob version to cool storage. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder changeTierToCoolAfterDaysSinceCreation(@Nullable Output<Integer> changeTierToCoolAfterDaysSinceCreation) {
            $.changeTierToCoolAfterDaysSinceCreation = changeTierToCoolAfterDaysSinceCreation;
            return this;
        }

        /**
         * @param changeTierToCoolAfterDaysSinceCreation The age in days creation create to  tier blob version to cool storage. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder changeTierToCoolAfterDaysSinceCreation(Integer changeTierToCoolAfterDaysSinceCreation) {
            return changeTierToCoolAfterDaysSinceCreation(Output.of(changeTierToCoolAfterDaysSinceCreation));
        }

        /**
         * @param deleteAfterDaysSinceCreation The age in days after creation to delete the blob version. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfterDaysSinceCreation(@Nullable Output<Integer> deleteAfterDaysSinceCreation) {
            $.deleteAfterDaysSinceCreation = deleteAfterDaysSinceCreation;
            return this;
        }

        /**
         * @param deleteAfterDaysSinceCreation The age in days after creation to delete the blob version. Must be between 0 and 99999.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfterDaysSinceCreation(Integer deleteAfterDaysSinceCreation) {
            return deleteAfterDaysSinceCreation(Output.of(deleteAfterDaysSinceCreation));
        }

        public ManagementPolicyRuleActionsVersionArgs build() {
            return $;
        }
    }

}