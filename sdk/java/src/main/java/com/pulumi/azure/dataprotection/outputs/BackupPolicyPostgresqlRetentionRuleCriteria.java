// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupPolicyPostgresqlRetentionRuleCriteria {
    /**
     * @return Possible values are `AllBackup`, `FirstOfDay`, `FirstOfWeek`, `FirstOfMonth` and `FirstOfYear`. These values mean the first successful backup of the day/week/month/year. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    private @Nullable String absoluteCriteria;
    /**
     * @return Possible values are `Monday`, `Tuesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    private @Nullable List<String> daysOfWeeks;
    /**
     * @return Possible values are `January`, `February`, `March`, `April`, `May`, `June`, `July`, `August`, `September`, `October`, `November` and `December`. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    private @Nullable List<String> monthsOfYears;
    /**
     * @return Specifies a list of backup times for backup in the `RFC3339` format. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    private @Nullable List<String> scheduledBackupTimes;
    /**
     * @return Possible values are `First`, `Second`, `Third`, `Fourth` and `Last`. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    private @Nullable List<String> weeksOfMonths;

    private BackupPolicyPostgresqlRetentionRuleCriteria() {}
    /**
     * @return Possible values are `AllBackup`, `FirstOfDay`, `FirstOfWeek`, `FirstOfMonth` and `FirstOfYear`. These values mean the first successful backup of the day/week/month/year. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public Optional<String> absoluteCriteria() {
        return Optional.ofNullable(this.absoluteCriteria);
    }
    /**
     * @return Possible values are `Monday`, `Tuesday`, `Thursday`, `Friday`, `Saturday` and `Sunday`. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public List<String> daysOfWeeks() {
        return this.daysOfWeeks == null ? List.of() : this.daysOfWeeks;
    }
    /**
     * @return Possible values are `January`, `February`, `March`, `April`, `May`, `June`, `July`, `August`, `September`, `October`, `November` and `December`. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public List<String> monthsOfYears() {
        return this.monthsOfYears == null ? List.of() : this.monthsOfYears;
    }
    /**
     * @return Specifies a list of backup times for backup in the `RFC3339` format. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public List<String> scheduledBackupTimes() {
        return this.scheduledBackupTimes == null ? List.of() : this.scheduledBackupTimes;
    }
    /**
     * @return Possible values are `First`, `Second`, `Third`, `Fourth` and `Last`. Changing this forces a new Backup Policy PostgreSQL to be created.
     * 
     */
    public List<String> weeksOfMonths() {
        return this.weeksOfMonths == null ? List.of() : this.weeksOfMonths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyPostgresqlRetentionRuleCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String absoluteCriteria;
        private @Nullable List<String> daysOfWeeks;
        private @Nullable List<String> monthsOfYears;
        private @Nullable List<String> scheduledBackupTimes;
        private @Nullable List<String> weeksOfMonths;
        public Builder() {}
        public Builder(BackupPolicyPostgresqlRetentionRuleCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.absoluteCriteria = defaults.absoluteCriteria;
    	      this.daysOfWeeks = defaults.daysOfWeeks;
    	      this.monthsOfYears = defaults.monthsOfYears;
    	      this.scheduledBackupTimes = defaults.scheduledBackupTimes;
    	      this.weeksOfMonths = defaults.weeksOfMonths;
        }

        @CustomType.Setter
        public Builder absoluteCriteria(@Nullable String absoluteCriteria) {
            this.absoluteCriteria = absoluteCriteria;
            return this;
        }
        @CustomType.Setter
        public Builder daysOfWeeks(@Nullable List<String> daysOfWeeks) {
            this.daysOfWeeks = daysOfWeeks;
            return this;
        }
        public Builder daysOfWeeks(String... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }
        @CustomType.Setter
        public Builder monthsOfYears(@Nullable List<String> monthsOfYears) {
            this.monthsOfYears = monthsOfYears;
            return this;
        }
        public Builder monthsOfYears(String... monthsOfYears) {
            return monthsOfYears(List.of(monthsOfYears));
        }
        @CustomType.Setter
        public Builder scheduledBackupTimes(@Nullable List<String> scheduledBackupTimes) {
            this.scheduledBackupTimes = scheduledBackupTimes;
            return this;
        }
        public Builder scheduledBackupTimes(String... scheduledBackupTimes) {
            return scheduledBackupTimes(List.of(scheduledBackupTimes));
        }
        @CustomType.Setter
        public Builder weeksOfMonths(@Nullable List<String> weeksOfMonths) {
            this.weeksOfMonths = weeksOfMonths;
            return this;
        }
        public Builder weeksOfMonths(String... weeksOfMonths) {
            return weeksOfMonths(List.of(weeksOfMonths));
        }
        public BackupPolicyPostgresqlRetentionRuleCriteria build() {
            final var o = new BackupPolicyPostgresqlRetentionRuleCriteria();
            o.absoluteCriteria = absoluteCriteria;
            o.daysOfWeeks = daysOfWeeks;
            o.monthsOfYears = monthsOfYears;
            o.scheduledBackupTimes = scheduledBackupTimes;
            o.weeksOfMonths = weeksOfMonths;
            return o;
        }
    }
}