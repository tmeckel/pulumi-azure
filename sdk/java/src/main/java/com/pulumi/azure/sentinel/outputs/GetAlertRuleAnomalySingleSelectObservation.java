// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAlertRuleAnomalySingleSelectObservation {
    /**
     * @return The description of the threshold observation.
     * 
     */
    private String description;
    /**
     * @return The guid of this Sentinel Alert Rule Template. Either `display_name` or `name` have to be specified.
     * 
     */
    private String name;
    /**
     * @return A list of supported values of the single select observation.
     * 
     */
    private List<String> supportedValues;
    /**
     * @return The value of the threshold observation.
     * 
     */
    private String value;

    private GetAlertRuleAnomalySingleSelectObservation() {}
    /**
     * @return The description of the threshold observation.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The guid of this Sentinel Alert Rule Template. Either `display_name` or `name` have to be specified.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of supported values of the single select observation.
     * 
     */
    public List<String> supportedValues() {
        return this.supportedValues;
    }
    /**
     * @return The value of the threshold observation.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlertRuleAnomalySingleSelectObservation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String name;
        private List<String> supportedValues;
        private String value;
        public Builder() {}
        public Builder(GetAlertRuleAnomalySingleSelectObservation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.supportedValues = defaults.supportedValues;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder supportedValues(List<String> supportedValues) {
            this.supportedValues = Objects.requireNonNull(supportedValues);
            return this;
        }
        public Builder supportedValues(String... supportedValues) {
            return supportedValues(List.of(supportedValues));
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetAlertRuleAnomalySingleSelectObservation build() {
            final var o = new GetAlertRuleAnomalySingleSelectObservation();
            o.description = description;
            o.name = name;
            o.supportedValues = supportedValues;
            o.value = value;
            return o;
        }
    }
}