// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.securitycenter.outputs;

import com.pulumi.azure.securitycenter.outputs.AutomationSourceRuleSetRule;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AutomationSourceRuleSet {
    /**
     * @return One or more `rule` blocks as defined below.
     * 
     */
    private List<AutomationSourceRuleSetRule> rules;

    private AutomationSourceRuleSet() {}
    /**
     * @return One or more `rule` blocks as defined below.
     * 
     */
    public List<AutomationSourceRuleSetRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationSourceRuleSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<AutomationSourceRuleSetRule> rules;
        public Builder() {}
        public Builder(AutomationSourceRuleSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder rules(List<AutomationSourceRuleSetRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(AutomationSourceRuleSetRule... rules) {
            return rules(List.of(rules));
        }
        public AutomationSourceRuleSet build() {
            final var o = new AutomationSourceRuleSet();
            o.rules = rules;
            return o;
        }
    }
}