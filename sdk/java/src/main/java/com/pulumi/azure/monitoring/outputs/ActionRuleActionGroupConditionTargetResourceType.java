// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ActionRuleActionGroupConditionTargetResourceType {
    /**
     * @return The operator for a given condition. Possible values are `Equals` and `NotEquals`.
     * 
     */
    private String operator;
    /**
     * @return A list of values to match for a given condition. The values should be valid resource types.
     * 
     */
    private List<String> values;

    private ActionRuleActionGroupConditionTargetResourceType() {}
    /**
     * @return The operator for a given condition. Possible values are `Equals` and `NotEquals`.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return A list of values to match for a given condition. The values should be valid resource types.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionRuleActionGroupConditionTargetResourceType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private List<String> values;
        public Builder() {}
        public Builder(ActionRuleActionGroupConditionTargetResourceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public ActionRuleActionGroupConditionTargetResourceType build() {
            final var o = new ActionRuleActionGroupConditionTargetResourceType();
            o.operator = operator;
            o.values = values;
            return o;
        }
    }
}