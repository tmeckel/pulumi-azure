// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertRuleAnomalyBuiltInMultiSelectObservationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertRuleAnomalyBuiltInMultiSelectObservationArgs Empty = new AlertRuleAnomalyBuiltInMultiSelectObservationArgs();

    /**
     * The description of the threshold observation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the threshold observation.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Name of the built-in Anomaly Alert Rule. Changing this forces a new Built-in Anomaly Alert Rule to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name of the built-in Anomaly Alert Rule. Changing this forces a new Built-in Anomaly Alert Rule to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of supported values of the single select observation.
     * 
     */
    @Import(name="supportedValues")
    private @Nullable Output<List<String>> supportedValues;

    /**
     * @return A list of supported values of the single select observation.
     * 
     */
    public Optional<Output<List<String>>> supportedValues() {
        return Optional.ofNullable(this.supportedValues);
    }

    /**
     * A list of values of the single select observation.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return A list of values of the single select observation.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private AlertRuleAnomalyBuiltInMultiSelectObservationArgs() {}

    private AlertRuleAnomalyBuiltInMultiSelectObservationArgs(AlertRuleAnomalyBuiltInMultiSelectObservationArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.supportedValues = $.supportedValues;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertRuleAnomalyBuiltInMultiSelectObservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertRuleAnomalyBuiltInMultiSelectObservationArgs $;

        public Builder() {
            $ = new AlertRuleAnomalyBuiltInMultiSelectObservationArgs();
        }

        public Builder(AlertRuleAnomalyBuiltInMultiSelectObservationArgs defaults) {
            $ = new AlertRuleAnomalyBuiltInMultiSelectObservationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the threshold observation.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the threshold observation.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The Name of the built-in Anomaly Alert Rule. Changing this forces a new Built-in Anomaly Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name of the built-in Anomaly Alert Rule. Changing this forces a new Built-in Anomaly Alert Rule to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param supportedValues A list of supported values of the single select observation.
         * 
         * @return builder
         * 
         */
        public Builder supportedValues(@Nullable Output<List<String>> supportedValues) {
            $.supportedValues = supportedValues;
            return this;
        }

        /**
         * @param supportedValues A list of supported values of the single select observation.
         * 
         * @return builder
         * 
         */
        public Builder supportedValues(List<String> supportedValues) {
            return supportedValues(Output.of(supportedValues));
        }

        /**
         * @param supportedValues A list of supported values of the single select observation.
         * 
         * @return builder
         * 
         */
        public Builder supportedValues(String... supportedValues) {
            return supportedValues(List.of(supportedValues));
        }

        /**
         * @param values A list of values of the single select observation.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values A list of values of the single select observation.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values A list of values of the single select observation.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public AlertRuleAnomalyBuiltInMultiSelectObservationArgs build() {
            return $;
        }
    }

}