// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateMultiSelectObservationArgs;
import com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs;
import com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateRequiredDataConnectorArgs;
import com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateSingleSelectObservationArgs;
import com.pulumi.azure.sentinel.inputs.AlertRuleAnomalyDuplicateThresholdObservationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertRuleAnomalyDuplicateState extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleAnomalyDuplicateState Empty = new AlertRuleAnomalyDuplicateState();

    /**
     * The version of the Anomaly Security ML Analytics Settings.
     * 
     */
    @Import(name="anomalySettingsVersion")
    private @Nullable Output<Integer> anomalySettingsVersion;

    /**
     * @return The version of the Anomaly Security ML Analytics Settings.
     * 
     */
    public Optional<Output<Integer>> anomalySettingsVersion() {
        return Optional.ofNullable(this.anomalySettingsVersion);
    }

    /**
     * The anomaly version of the Anomaly Alert Rule.
     * 
     */
    @Import(name="anomalyVersion")
    private @Nullable Output<String> anomalyVersion;

    /**
     * @return The anomaly version of the Anomaly Alert Rule.
     * 
     */
    public Optional<Output<String>> anomalyVersion() {
        return Optional.ofNullable(this.anomalyVersion);
    }

    /**
     * The ID of the built-in Anomaly Alert Rule. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
     * 
     */
    @Import(name="builtInRuleId")
    private @Nullable Output<String> builtInRuleId;

    /**
     * @return The ID of the built-in Anomaly Alert Rule. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
     * 
     */
    public Optional<Output<String>> builtInRuleId() {
        return Optional.ofNullable(this.builtInRuleId);
    }

    /**
     * The description of the multi select observation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the multi select observation.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Display Name of the built-in Anomaly Alert Rule. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The Display Name of the built-in Anomaly Alert Rule. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Should the Duplicated Anomaly Alert Rule be enabled?
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Should the Duplicated Anomaly Alert Rule be enabled?
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The frequency the Anomaly Alert Rule will be run, such as &#34;P1D&#34;.
     * 
     */
    @Import(name="frequency")
    private @Nullable Output<String> frequency;

    /**
     * @return The frequency the Anomaly Alert Rule will be run, such as &#34;P1D&#34;.
     * 
     */
    public Optional<Output<String>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * Whether the current settings of the Anomaly Alert Rule equals default settings.
     * 
     */
    @Import(name="isDefaultSettings")
    private @Nullable Output<Boolean> isDefaultSettings;

    /**
     * @return Whether the current settings of the Anomaly Alert Rule equals default settings.
     * 
     */
    public Optional<Output<Boolean>> isDefaultSettings() {
        return Optional.ofNullable(this.isDefaultSettings);
    }

    /**
     * The ID of the Log Analytics Workspace. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
     * 
     */
    @Import(name="logAnalyticsWorkspaceId")
    private @Nullable Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
     * 
     */
    public Optional<Output<String>> logAnalyticsWorkspaceId() {
        return Optional.ofNullable(this.logAnalyticsWorkspaceId);
    }

    /**
     * mode of the Duplicated Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return mode of the Duplicated Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * A list of `multi_select_observation` blocks as defined below.
     * 
     */
    @Import(name="multiSelectObservations")
    private @Nullable Output<List<AlertRuleAnomalyDuplicateMultiSelectObservationArgs>> multiSelectObservations;

    /**
     * @return A list of `multi_select_observation` blocks as defined below.
     * 
     */
    public Optional<Output<List<AlertRuleAnomalyDuplicateMultiSelectObservationArgs>>> multiSelectObservations() {
        return Optional.ofNullable(this.multiSelectObservations);
    }

    /**
     * The name of the multi select observation.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the multi select observation.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of `prioritized_exclude_observation` blocks as defined below.
     * 
     */
    @Import(name="prioritizedExcludeObservations")
    private @Nullable Output<List<AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs>> prioritizedExcludeObservations;

    /**
     * @return A list of `prioritized_exclude_observation` blocks as defined below.
     * 
     */
    public Optional<Output<List<AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs>>> prioritizedExcludeObservations() {
        return Optional.ofNullable(this.prioritizedExcludeObservations);
    }

    /**
     * A `required_data_connector` block as defined below.
     * 
     */
    @Import(name="requiredDataConnectors")
    private @Nullable Output<List<AlertRuleAnomalyDuplicateRequiredDataConnectorArgs>> requiredDataConnectors;

    /**
     * @return A `required_data_connector` block as defined below.
     * 
     */
    public Optional<Output<List<AlertRuleAnomalyDuplicateRequiredDataConnectorArgs>>> requiredDataConnectors() {
        return Optional.ofNullable(this.requiredDataConnectors);
    }

    /**
     * The ID of the anomaly settings definition Id.
     * 
     */
    @Import(name="settingsDefinitionId")
    private @Nullable Output<String> settingsDefinitionId;

    /**
     * @return The ID of the anomaly settings definition Id.
     * 
     */
    public Optional<Output<String>> settingsDefinitionId() {
        return Optional.ofNullable(this.settingsDefinitionId);
    }

    /**
     * A list of `single_select_observation` blocks as defined below.
     * 
     */
    @Import(name="singleSelectObservations")
    private @Nullable Output<List<AlertRuleAnomalyDuplicateSingleSelectObservationArgs>> singleSelectObservations;

    /**
     * @return A list of `single_select_observation` blocks as defined below.
     * 
     */
    public Optional<Output<List<AlertRuleAnomalyDuplicateSingleSelectObservationArgs>>> singleSelectObservations() {
        return Optional.ofNullable(this.singleSelectObservations);
    }

    /**
     * A list of categories of attacks by which to classify the rule.
     * 
     */
    @Import(name="tactics")
    private @Nullable Output<List<String>> tactics;

    /**
     * @return A list of categories of attacks by which to classify the rule.
     * 
     */
    public Optional<Output<List<String>>> tactics() {
        return Optional.ofNullable(this.tactics);
    }

    /**
     * A list of techniques of attacks by which to classify the rule.
     * 
     */
    @Import(name="techniques")
    private @Nullable Output<List<String>> techniques;

    /**
     * @return A list of techniques of attacks by which to classify the rule.
     * 
     */
    public Optional<Output<List<String>>> techniques() {
        return Optional.ofNullable(this.techniques);
    }

    /**
     * A list of `threshold_observation` blocks as defined below.
     * 
     */
    @Import(name="thresholdObservations")
    private @Nullable Output<List<AlertRuleAnomalyDuplicateThresholdObservationArgs>> thresholdObservations;

    /**
     * @return A list of `threshold_observation` blocks as defined below.
     * 
     */
    public Optional<Output<List<AlertRuleAnomalyDuplicateThresholdObservationArgs>>> thresholdObservations() {
        return Optional.ofNullable(this.thresholdObservations);
    }

    private AlertRuleAnomalyDuplicateState() {}

    private AlertRuleAnomalyDuplicateState(AlertRuleAnomalyDuplicateState $) {
        this.anomalySettingsVersion = $.anomalySettingsVersion;
        this.anomalyVersion = $.anomalyVersion;
        this.builtInRuleId = $.builtInRuleId;
        this.description = $.description;
        this.displayName = $.displayName;
        this.enabled = $.enabled;
        this.frequency = $.frequency;
        this.isDefaultSettings = $.isDefaultSettings;
        this.logAnalyticsWorkspaceId = $.logAnalyticsWorkspaceId;
        this.mode = $.mode;
        this.multiSelectObservations = $.multiSelectObservations;
        this.name = $.name;
        this.prioritizedExcludeObservations = $.prioritizedExcludeObservations;
        this.requiredDataConnectors = $.requiredDataConnectors;
        this.settingsDefinitionId = $.settingsDefinitionId;
        this.singleSelectObservations = $.singleSelectObservations;
        this.tactics = $.tactics;
        this.techniques = $.techniques;
        this.thresholdObservations = $.thresholdObservations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleAnomalyDuplicateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleAnomalyDuplicateState $;

        public Builder() {
            $ = new AlertRuleAnomalyDuplicateState();
        }

        public Builder(AlertRuleAnomalyDuplicateState defaults) {
            $ = new AlertRuleAnomalyDuplicateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param anomalySettingsVersion The version of the Anomaly Security ML Analytics Settings.
         * 
         * @return builder
         * 
         */
        public Builder anomalySettingsVersion(@Nullable Output<Integer> anomalySettingsVersion) {
            $.anomalySettingsVersion = anomalySettingsVersion;
            return this;
        }

        /**
         * @param anomalySettingsVersion The version of the Anomaly Security ML Analytics Settings.
         * 
         * @return builder
         * 
         */
        public Builder anomalySettingsVersion(Integer anomalySettingsVersion) {
            return anomalySettingsVersion(Output.of(anomalySettingsVersion));
        }

        /**
         * @param anomalyVersion The anomaly version of the Anomaly Alert Rule.
         * 
         * @return builder
         * 
         */
        public Builder anomalyVersion(@Nullable Output<String> anomalyVersion) {
            $.anomalyVersion = anomalyVersion;
            return this;
        }

        /**
         * @param anomalyVersion The anomaly version of the Anomaly Alert Rule.
         * 
         * @return builder
         * 
         */
        public Builder anomalyVersion(String anomalyVersion) {
            return anomalyVersion(Output.of(anomalyVersion));
        }

        /**
         * @param builtInRuleId The ID of the built-in Anomaly Alert Rule. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder builtInRuleId(@Nullable Output<String> builtInRuleId) {
            $.builtInRuleId = builtInRuleId;
            return this;
        }

        /**
         * @param builtInRuleId The ID of the built-in Anomaly Alert Rule. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder builtInRuleId(String builtInRuleId) {
            return builtInRuleId(Output.of(builtInRuleId));
        }

        /**
         * @param description The description of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The Display Name of the built-in Anomaly Alert Rule. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The Display Name of the built-in Anomaly Alert Rule. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enabled Should the Duplicated Anomaly Alert Rule be enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should the Duplicated Anomaly Alert Rule be enabled?
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param frequency The frequency the Anomaly Alert Rule will be run, such as &#34;P1D&#34;.
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable Output<String> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency The frequency the Anomaly Alert Rule will be run, such as &#34;P1D&#34;.
         * 
         * @return builder
         * 
         */
        public Builder frequency(String frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param isDefaultSettings Whether the current settings of the Anomaly Alert Rule equals default settings.
         * 
         * @return builder
         * 
         */
        public Builder isDefaultSettings(@Nullable Output<Boolean> isDefaultSettings) {
            $.isDefaultSettings = isDefaultSettings;
            return this;
        }

        /**
         * @param isDefaultSettings Whether the current settings of the Anomaly Alert Rule equals default settings.
         * 
         * @return builder
         * 
         */
        public Builder isDefaultSettings(Boolean isDefaultSettings) {
            return isDefaultSettings(Output.of(isDefaultSettings));
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(@Nullable Output<String> logAnalyticsWorkspaceId) {
            $.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            return this;
        }

        /**
         * @param logAnalyticsWorkspaceId The ID of the Log Analytics Workspace. Changing this forces a new Duplicated Anomaly Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            return logAnalyticsWorkspaceId(Output.of(logAnalyticsWorkspaceId));
        }

        /**
         * @param mode mode of the Duplicated Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode mode of the Duplicated Anomaly Alert Rule. Possible Values are `Production` and `Flighting`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param multiSelectObservations A list of `multi_select_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder multiSelectObservations(@Nullable Output<List<AlertRuleAnomalyDuplicateMultiSelectObservationArgs>> multiSelectObservations) {
            $.multiSelectObservations = multiSelectObservations;
            return this;
        }

        /**
         * @param multiSelectObservations A list of `multi_select_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder multiSelectObservations(List<AlertRuleAnomalyDuplicateMultiSelectObservationArgs> multiSelectObservations) {
            return multiSelectObservations(Output.of(multiSelectObservations));
        }

        /**
         * @param multiSelectObservations A list of `multi_select_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder multiSelectObservations(AlertRuleAnomalyDuplicateMultiSelectObservationArgs... multiSelectObservations) {
            return multiSelectObservations(List.of(multiSelectObservations));
        }

        /**
         * @param name The name of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the multi select observation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param prioritizedExcludeObservations A list of `prioritized_exclude_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder prioritizedExcludeObservations(@Nullable Output<List<AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs>> prioritizedExcludeObservations) {
            $.prioritizedExcludeObservations = prioritizedExcludeObservations;
            return this;
        }

        /**
         * @param prioritizedExcludeObservations A list of `prioritized_exclude_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder prioritizedExcludeObservations(List<AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs> prioritizedExcludeObservations) {
            return prioritizedExcludeObservations(Output.of(prioritizedExcludeObservations));
        }

        /**
         * @param prioritizedExcludeObservations A list of `prioritized_exclude_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder prioritizedExcludeObservations(AlertRuleAnomalyDuplicatePrioritizedExcludeObservationArgs... prioritizedExcludeObservations) {
            return prioritizedExcludeObservations(List.of(prioritizedExcludeObservations));
        }

        /**
         * @param requiredDataConnectors A `required_data_connector` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder requiredDataConnectors(@Nullable Output<List<AlertRuleAnomalyDuplicateRequiredDataConnectorArgs>> requiredDataConnectors) {
            $.requiredDataConnectors = requiredDataConnectors;
            return this;
        }

        /**
         * @param requiredDataConnectors A `required_data_connector` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder requiredDataConnectors(List<AlertRuleAnomalyDuplicateRequiredDataConnectorArgs> requiredDataConnectors) {
            return requiredDataConnectors(Output.of(requiredDataConnectors));
        }

        /**
         * @param requiredDataConnectors A `required_data_connector` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder requiredDataConnectors(AlertRuleAnomalyDuplicateRequiredDataConnectorArgs... requiredDataConnectors) {
            return requiredDataConnectors(List.of(requiredDataConnectors));
        }

        /**
         * @param settingsDefinitionId The ID of the anomaly settings definition Id.
         * 
         * @return builder
         * 
         */
        public Builder settingsDefinitionId(@Nullable Output<String> settingsDefinitionId) {
            $.settingsDefinitionId = settingsDefinitionId;
            return this;
        }

        /**
         * @param settingsDefinitionId The ID of the anomaly settings definition Id.
         * 
         * @return builder
         * 
         */
        public Builder settingsDefinitionId(String settingsDefinitionId) {
            return settingsDefinitionId(Output.of(settingsDefinitionId));
        }

        /**
         * @param singleSelectObservations A list of `single_select_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder singleSelectObservations(@Nullable Output<List<AlertRuleAnomalyDuplicateSingleSelectObservationArgs>> singleSelectObservations) {
            $.singleSelectObservations = singleSelectObservations;
            return this;
        }

        /**
         * @param singleSelectObservations A list of `single_select_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder singleSelectObservations(List<AlertRuleAnomalyDuplicateSingleSelectObservationArgs> singleSelectObservations) {
            return singleSelectObservations(Output.of(singleSelectObservations));
        }

        /**
         * @param singleSelectObservations A list of `single_select_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder singleSelectObservations(AlertRuleAnomalyDuplicateSingleSelectObservationArgs... singleSelectObservations) {
            return singleSelectObservations(List.of(singleSelectObservations));
        }

        /**
         * @param tactics A list of categories of attacks by which to classify the rule.
         * 
         * @return builder
         * 
         */
        public Builder tactics(@Nullable Output<List<String>> tactics) {
            $.tactics = tactics;
            return this;
        }

        /**
         * @param tactics A list of categories of attacks by which to classify the rule.
         * 
         * @return builder
         * 
         */
        public Builder tactics(List<String> tactics) {
            return tactics(Output.of(tactics));
        }

        /**
         * @param tactics A list of categories of attacks by which to classify the rule.
         * 
         * @return builder
         * 
         */
        public Builder tactics(String... tactics) {
            return tactics(List.of(tactics));
        }

        /**
         * @param techniques A list of techniques of attacks by which to classify the rule.
         * 
         * @return builder
         * 
         */
        public Builder techniques(@Nullable Output<List<String>> techniques) {
            $.techniques = techniques;
            return this;
        }

        /**
         * @param techniques A list of techniques of attacks by which to classify the rule.
         * 
         * @return builder
         * 
         */
        public Builder techniques(List<String> techniques) {
            return techniques(Output.of(techniques));
        }

        /**
         * @param techniques A list of techniques of attacks by which to classify the rule.
         * 
         * @return builder
         * 
         */
        public Builder techniques(String... techniques) {
            return techniques(List.of(techniques));
        }

        /**
         * @param thresholdObservations A list of `threshold_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder thresholdObservations(@Nullable Output<List<AlertRuleAnomalyDuplicateThresholdObservationArgs>> thresholdObservations) {
            $.thresholdObservations = thresholdObservations;
            return this;
        }

        /**
         * @param thresholdObservations A list of `threshold_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder thresholdObservations(List<AlertRuleAnomalyDuplicateThresholdObservationArgs> thresholdObservations) {
            return thresholdObservations(Output.of(thresholdObservations));
        }

        /**
         * @param thresholdObservations A list of `threshold_observation` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder thresholdObservations(AlertRuleAnomalyDuplicateThresholdObservationArgs... thresholdObservations) {
            return thresholdObservations(List.of(thresholdObservations));
        }

        public AlertRuleAnomalyDuplicateState build() {
            return $;
        }
    }

}