// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection.inputs;

import com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleCriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BackupPolicyDiskRetentionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupPolicyDiskRetentionRuleArgs Empty = new BackupPolicyDiskRetentionRuleArgs();

    /**
     * A `criteria` block as defined below. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="criteria", required=true)
    private Output<BackupPolicyDiskRetentionRuleCriteriaArgs> criteria;

    /**
     * @return A `criteria` block as defined below. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Output<BackupPolicyDiskRetentionRuleCriteriaArgs> criteria() {
        return this.criteria;
    }

    /**
     * Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    /**
     * The name which should be used for this retention rule. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this retention rule. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Retention Tag priority. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return Retention Tag priority. Changing this forces a new Backup Policy Disk to be created.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    private BackupPolicyDiskRetentionRuleArgs() {}

    private BackupPolicyDiskRetentionRuleArgs(BackupPolicyDiskRetentionRuleArgs $) {
        this.criteria = $.criteria;
        this.duration = $.duration;
        this.name = $.name;
        this.priority = $.priority;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupPolicyDiskRetentionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupPolicyDiskRetentionRuleArgs $;

        public Builder() {
            $ = new BackupPolicyDiskRetentionRuleArgs();
        }

        public Builder(BackupPolicyDiskRetentionRuleArgs defaults) {
            $ = new BackupPolicyDiskRetentionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param criteria A `criteria` block as defined below. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder criteria(Output<BackupPolicyDiskRetentionRuleCriteriaArgs> criteria) {
            $.criteria = criteria;
            return this;
        }

        /**
         * @param criteria A `criteria` block as defined below. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder criteria(BackupPolicyDiskRetentionRuleCriteriaArgs criteria) {
            return criteria(Output.of(criteria));
        }

        /**
         * @param duration Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Duration of deletion after given timespan. It should follow `ISO 8601` duration format. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param name The name which should be used for this retention rule. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this retention rule. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority Retention Tag priority. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Retention Tag priority. Changing this forces a new Backup Policy Disk to be created.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public BackupPolicyDiskRetentionRuleArgs build() {
            $.criteria = Objects.requireNonNull($.criteria, "expected parameter 'criteria' to be non-null");
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            return $;
        }
    }

}
