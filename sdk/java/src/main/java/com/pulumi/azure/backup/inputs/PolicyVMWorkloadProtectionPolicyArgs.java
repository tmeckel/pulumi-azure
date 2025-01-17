// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup.inputs;

import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyBackupArgs;
import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionDailyArgs;
import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs;
import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionWeeklyArgs;
import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicyRetentionYearlyArgs;
import com.pulumi.azure.backup.inputs.PolicyVMWorkloadProtectionPolicySimpleRetentionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyVMWorkloadProtectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyVMWorkloadProtectionPolicyArgs Empty = new PolicyVMWorkloadProtectionPolicyArgs();

    /**
     * A `backup` block as defined below.
     * 
     */
    @Import(name="backup", required=true)
    private Output<PolicyVMWorkloadProtectionPolicyBackupArgs> backup;

    /**
     * @return A `backup` block as defined below.
     * 
     */
    public Output<PolicyVMWorkloadProtectionPolicyBackupArgs> backup() {
        return this.backup;
    }

    /**
     * The type of the VM Workload Backup Policy. Possible values are `Differential`, `Full`, `Incremental` and `Log`.
     * 
     */
    @Import(name="policyType", required=true)
    private Output<String> policyType;

    /**
     * @return The type of the VM Workload Backup Policy. Possible values are `Differential`, `Full`, `Incremental` and `Log`.
     * 
     */
    public Output<String> policyType() {
        return this.policyType;
    }

    /**
     * A `retention_daily` block as defined below.
     * 
     */
    @Import(name="retentionDaily")
    private @Nullable Output<PolicyVMWorkloadProtectionPolicyRetentionDailyArgs> retentionDaily;

    /**
     * @return A `retention_daily` block as defined below.
     * 
     */
    public Optional<Output<PolicyVMWorkloadProtectionPolicyRetentionDailyArgs>> retentionDaily() {
        return Optional.ofNullable(this.retentionDaily);
    }

    /**
     * A `retention_monthly` block as defined below.
     * 
     */
    @Import(name="retentionMonthly")
    private @Nullable Output<PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs> retentionMonthly;

    /**
     * @return A `retention_monthly` block as defined below.
     * 
     */
    public Optional<Output<PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs>> retentionMonthly() {
        return Optional.ofNullable(this.retentionMonthly);
    }

    /**
     * A `retention_weekly` block as defined below.
     * 
     */
    @Import(name="retentionWeekly")
    private @Nullable Output<PolicyVMWorkloadProtectionPolicyRetentionWeeklyArgs> retentionWeekly;

    /**
     * @return A `retention_weekly` block as defined below.
     * 
     */
    public Optional<Output<PolicyVMWorkloadProtectionPolicyRetentionWeeklyArgs>> retentionWeekly() {
        return Optional.ofNullable(this.retentionWeekly);
    }

    /**
     * A `retention_yearly` block as defined below.
     * 
     */
    @Import(name="retentionYearly")
    private @Nullable Output<PolicyVMWorkloadProtectionPolicyRetentionYearlyArgs> retentionYearly;

    /**
     * @return A `retention_yearly` block as defined below.
     * 
     */
    public Optional<Output<PolicyVMWorkloadProtectionPolicyRetentionYearlyArgs>> retentionYearly() {
        return Optional.ofNullable(this.retentionYearly);
    }

    /**
     * A `simple_retention` block as defined below.
     * 
     */
    @Import(name="simpleRetention")
    private @Nullable Output<PolicyVMWorkloadProtectionPolicySimpleRetentionArgs> simpleRetention;

    /**
     * @return A `simple_retention` block as defined below.
     * 
     */
    public Optional<Output<PolicyVMWorkloadProtectionPolicySimpleRetentionArgs>> simpleRetention() {
        return Optional.ofNullable(this.simpleRetention);
    }

    private PolicyVMWorkloadProtectionPolicyArgs() {}

    private PolicyVMWorkloadProtectionPolicyArgs(PolicyVMWorkloadProtectionPolicyArgs $) {
        this.backup = $.backup;
        this.policyType = $.policyType;
        this.retentionDaily = $.retentionDaily;
        this.retentionMonthly = $.retentionMonthly;
        this.retentionWeekly = $.retentionWeekly;
        this.retentionYearly = $.retentionYearly;
        this.simpleRetention = $.simpleRetention;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyVMWorkloadProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyVMWorkloadProtectionPolicyArgs $;

        public Builder() {
            $ = new PolicyVMWorkloadProtectionPolicyArgs();
        }

        public Builder(PolicyVMWorkloadProtectionPolicyArgs defaults) {
            $ = new PolicyVMWorkloadProtectionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backup A `backup` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder backup(Output<PolicyVMWorkloadProtectionPolicyBackupArgs> backup) {
            $.backup = backup;
            return this;
        }

        /**
         * @param backup A `backup` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder backup(PolicyVMWorkloadProtectionPolicyBackupArgs backup) {
            return backup(Output.of(backup));
        }

        /**
         * @param policyType The type of the VM Workload Backup Policy. Possible values are `Differential`, `Full`, `Incremental` and `Log`.
         * 
         * @return builder
         * 
         */
        public Builder policyType(Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType The type of the VM Workload Backup Policy. Possible values are `Differential`, `Full`, `Incremental` and `Log`.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        /**
         * @param retentionDaily A `retention_daily` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionDaily(@Nullable Output<PolicyVMWorkloadProtectionPolicyRetentionDailyArgs> retentionDaily) {
            $.retentionDaily = retentionDaily;
            return this;
        }

        /**
         * @param retentionDaily A `retention_daily` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionDaily(PolicyVMWorkloadProtectionPolicyRetentionDailyArgs retentionDaily) {
            return retentionDaily(Output.of(retentionDaily));
        }

        /**
         * @param retentionMonthly A `retention_monthly` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionMonthly(@Nullable Output<PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs> retentionMonthly) {
            $.retentionMonthly = retentionMonthly;
            return this;
        }

        /**
         * @param retentionMonthly A `retention_monthly` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionMonthly(PolicyVMWorkloadProtectionPolicyRetentionMonthlyArgs retentionMonthly) {
            return retentionMonthly(Output.of(retentionMonthly));
        }

        /**
         * @param retentionWeekly A `retention_weekly` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionWeekly(@Nullable Output<PolicyVMWorkloadProtectionPolicyRetentionWeeklyArgs> retentionWeekly) {
            $.retentionWeekly = retentionWeekly;
            return this;
        }

        /**
         * @param retentionWeekly A `retention_weekly` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionWeekly(PolicyVMWorkloadProtectionPolicyRetentionWeeklyArgs retentionWeekly) {
            return retentionWeekly(Output.of(retentionWeekly));
        }

        /**
         * @param retentionYearly A `retention_yearly` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionYearly(@Nullable Output<PolicyVMWorkloadProtectionPolicyRetentionYearlyArgs> retentionYearly) {
            $.retentionYearly = retentionYearly;
            return this;
        }

        /**
         * @param retentionYearly A `retention_yearly` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionYearly(PolicyVMWorkloadProtectionPolicyRetentionYearlyArgs retentionYearly) {
            return retentionYearly(Output.of(retentionYearly));
        }

        /**
         * @param simpleRetention A `simple_retention` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder simpleRetention(@Nullable Output<PolicyVMWorkloadProtectionPolicySimpleRetentionArgs> simpleRetention) {
            $.simpleRetention = simpleRetention;
            return this;
        }

        /**
         * @param simpleRetention A `simple_retention` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder simpleRetention(PolicyVMWorkloadProtectionPolicySimpleRetentionArgs simpleRetention) {
            return simpleRetention(Output.of(simpleRetention));
        }

        public PolicyVMWorkloadProtectionPolicyArgs build() {
            $.backup = Objects.requireNonNull($.backup, "expected parameter 'backup' to be non-null");
            $.policyType = Objects.requireNonNull($.policyType, "expected parameter 'policyType' to be non-null");
            return $;
        }
    }

}
