// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertRuleScheduledIncidentConfigurationGroupingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleScheduledIncidentConfigurationGroupingArgs Empty = new AlertRuleScheduledIncidentConfigurationGroupingArgs();

    /**
     * Enable grouping incidents created from alerts triggered by this Sentinel Scheduled Alert Rule. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable grouping incidents created from alerts triggered by this Sentinel Scheduled Alert Rule. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The method used to group incidents. Possible values are `AnyAlert`, `Selected` and `AllEntities`. Defaults to `AnyAlert`.
     * 
     */
    @Import(name="entityMatchingMethod")
    private @Nullable Output<String> entityMatchingMethod;

    /**
     * @return The method used to group incidents. Possible values are `AnyAlert`, `Selected` and `AllEntities`. Defaults to `AnyAlert`.
     * 
     */
    public Optional<Output<String>> entityMatchingMethod() {
        return Optional.ofNullable(this.entityMatchingMethod);
    }

    @Import(name="groupByAlertDetails")
    private @Nullable Output<List<String>> groupByAlertDetails;

    public Optional<Output<List<String>>> groupByAlertDetails() {
        return Optional.ofNullable(this.groupByAlertDetails);
    }

    @Import(name="groupByCustomDetails")
    private @Nullable Output<List<String>> groupByCustomDetails;

    public Optional<Output<List<String>>> groupByCustomDetails() {
        return Optional.ofNullable(this.groupByCustomDetails);
    }

    /**
     * A list of entity types to group by, only when the `entity_matching_method` is `Selected`. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
     * 
     */
    @Import(name="groupByEntities")
    private @Nullable Output<List<String>> groupByEntities;

    /**
     * @return A list of entity types to group by, only when the `entity_matching_method` is `Selected`. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
     * 
     */
    public Optional<Output<List<String>>> groupByEntities() {
        return Optional.ofNullable(this.groupByEntities);
    }

    /**
     * Limit the group to alerts created within the lookback duration (in ISO 8601 duration format). Defaults to `PT5M`.
     * 
     */
    @Import(name="lookbackDuration")
    private @Nullable Output<String> lookbackDuration;

    /**
     * @return Limit the group to alerts created within the lookback duration (in ISO 8601 duration format). Defaults to `PT5M`.
     * 
     */
    public Optional<Output<String>> lookbackDuration() {
        return Optional.ofNullable(this.lookbackDuration);
    }

    /**
     * Whether to re-open closed matching incidents? Defaults to `false`.
     * 
     */
    @Import(name="reopenClosedIncidents")
    private @Nullable Output<Boolean> reopenClosedIncidents;

    /**
     * @return Whether to re-open closed matching incidents? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> reopenClosedIncidents() {
        return Optional.ofNullable(this.reopenClosedIncidents);
    }

    private AlertRuleScheduledIncidentConfigurationGroupingArgs() {}

    private AlertRuleScheduledIncidentConfigurationGroupingArgs(AlertRuleScheduledIncidentConfigurationGroupingArgs $) {
        this.enabled = $.enabled;
        this.entityMatchingMethod = $.entityMatchingMethod;
        this.groupByAlertDetails = $.groupByAlertDetails;
        this.groupByCustomDetails = $.groupByCustomDetails;
        this.groupByEntities = $.groupByEntities;
        this.lookbackDuration = $.lookbackDuration;
        this.reopenClosedIncidents = $.reopenClosedIncidents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleScheduledIncidentConfigurationGroupingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleScheduledIncidentConfigurationGroupingArgs $;

        public Builder() {
            $ = new AlertRuleScheduledIncidentConfigurationGroupingArgs();
        }

        public Builder(AlertRuleScheduledIncidentConfigurationGroupingArgs defaults) {
            $ = new AlertRuleScheduledIncidentConfigurationGroupingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable grouping incidents created from alerts triggered by this Sentinel Scheduled Alert Rule. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable grouping incidents created from alerts triggered by this Sentinel Scheduled Alert Rule. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param entityMatchingMethod The method used to group incidents. Possible values are `AnyAlert`, `Selected` and `AllEntities`. Defaults to `AnyAlert`.
         * 
         * @return builder
         * 
         */
        public Builder entityMatchingMethod(@Nullable Output<String> entityMatchingMethod) {
            $.entityMatchingMethod = entityMatchingMethod;
            return this;
        }

        /**
         * @param entityMatchingMethod The method used to group incidents. Possible values are `AnyAlert`, `Selected` and `AllEntities`. Defaults to `AnyAlert`.
         * 
         * @return builder
         * 
         */
        public Builder entityMatchingMethod(String entityMatchingMethod) {
            return entityMatchingMethod(Output.of(entityMatchingMethod));
        }

        public Builder groupByAlertDetails(@Nullable Output<List<String>> groupByAlertDetails) {
            $.groupByAlertDetails = groupByAlertDetails;
            return this;
        }

        public Builder groupByAlertDetails(List<String> groupByAlertDetails) {
            return groupByAlertDetails(Output.of(groupByAlertDetails));
        }

        public Builder groupByAlertDetails(String... groupByAlertDetails) {
            return groupByAlertDetails(List.of(groupByAlertDetails));
        }

        public Builder groupByCustomDetails(@Nullable Output<List<String>> groupByCustomDetails) {
            $.groupByCustomDetails = groupByCustomDetails;
            return this;
        }

        public Builder groupByCustomDetails(List<String> groupByCustomDetails) {
            return groupByCustomDetails(Output.of(groupByCustomDetails));
        }

        public Builder groupByCustomDetails(String... groupByCustomDetails) {
            return groupByCustomDetails(List.of(groupByCustomDetails));
        }

        /**
         * @param groupByEntities A list of entity types to group by, only when the `entity_matching_method` is `Selected`. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
         * 
         * @return builder
         * 
         */
        public Builder groupByEntities(@Nullable Output<List<String>> groupByEntities) {
            $.groupByEntities = groupByEntities;
            return this;
        }

        /**
         * @param groupByEntities A list of entity types to group by, only when the `entity_matching_method` is `Selected`. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
         * 
         * @return builder
         * 
         */
        public Builder groupByEntities(List<String> groupByEntities) {
            return groupByEntities(Output.of(groupByEntities));
        }

        /**
         * @param groupByEntities A list of entity types to group by, only when the `entity_matching_method` is `Selected`. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
         * 
         * @return builder
         * 
         */
        public Builder groupByEntities(String... groupByEntities) {
            return groupByEntities(List.of(groupByEntities));
        }

        /**
         * @param lookbackDuration Limit the group to alerts created within the lookback duration (in ISO 8601 duration format). Defaults to `PT5M`.
         * 
         * @return builder
         * 
         */
        public Builder lookbackDuration(@Nullable Output<String> lookbackDuration) {
            $.lookbackDuration = lookbackDuration;
            return this;
        }

        /**
         * @param lookbackDuration Limit the group to alerts created within the lookback duration (in ISO 8601 duration format). Defaults to `PT5M`.
         * 
         * @return builder
         * 
         */
        public Builder lookbackDuration(String lookbackDuration) {
            return lookbackDuration(Output.of(lookbackDuration));
        }

        /**
         * @param reopenClosedIncidents Whether to re-open closed matching incidents? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder reopenClosedIncidents(@Nullable Output<Boolean> reopenClosedIncidents) {
            $.reopenClosedIncidents = reopenClosedIncidents;
            return this;
        }

        /**
         * @param reopenClosedIncidents Whether to re-open closed matching incidents? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder reopenClosedIncidents(Boolean reopenClosedIncidents) {
            return reopenClosedIncidents(Output.of(reopenClosedIncidents));
        }

        public AlertRuleScheduledIncidentConfigurationGroupingArgs build() {
            return $;
        }
    }

}