// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackupPolicyDiskRetentionRuleCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyDiskRetentionRuleCriteriaArgs Empty = new BackupPolicyDiskRetentionRuleCriteriaArgs();

    /**
     * Possible values are `FirstOfDay` and `FirstOfWeek`. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="absoluteCriteria")
    private @Nullable Output<String> absoluteCriteria;

    /**
     * @return Possible values are `FirstOfDay` and `FirstOfWeek`. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Optional<Output<String>> absoluteCriteria() {
        return Optional.ofNullable(this.absoluteCriteria);
    }

    private BackupPolicyDiskRetentionRuleCriteriaArgs() {}

    private BackupPolicyDiskRetentionRuleCriteriaArgs(BackupPolicyDiskRetentionRuleCriteriaArgs $) {
        this.absoluteCriteria = $.absoluteCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyDiskRetentionRuleCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyDiskRetentionRuleCriteriaArgs $;

        public Builder() {
            $ = new BackupPolicyDiskRetentionRuleCriteriaArgs();
        }

        public Builder(BackupPolicyDiskRetentionRuleCriteriaArgs defaults) {
            $ = new BackupPolicyDiskRetentionRuleCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param absoluteCriteria Possible values are `FirstOfDay` and `FirstOfWeek`. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder absoluteCriteria(@Nullable Output<String> absoluteCriteria) {
            $.absoluteCriteria = absoluteCriteria;
            return this;
        }

        /**
         * @param absoluteCriteria Possible values are `FirstOfDay` and `FirstOfWeek`. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder absoluteCriteria(String absoluteCriteria) {
            return absoluteCriteria(Output.of(absoluteCriteria));
        }

        public BackupPolicyDiskRetentionRuleCriteriaArgs build() {
            return $;
        }
    }

}