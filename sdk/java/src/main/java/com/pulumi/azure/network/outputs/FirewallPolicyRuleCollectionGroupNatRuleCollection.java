// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.FirewallPolicyRuleCollectionGroupNatRuleCollectionRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FirewallPolicyRuleCollectionGroupNatRuleCollection {
    /**
     * @return The action to take for the NAT rules in this collection. Currently, the only possible value is `Dnat`.
     * 
     */
    private String action;
    /**
     * @return The name which should be used for this NAT rule collection.
     * 
     */
    private String name;
    /**
     * @return The priority of the NAT rule collection. The range is `100` - `65000`.
     * 
     */
    private Integer priority;
    /**
     * @return A `rule` (NAT rule) block as defined above.
     * 
     */
    private List<FirewallPolicyRuleCollectionGroupNatRuleCollectionRule> rules;

    private FirewallPolicyRuleCollectionGroupNatRuleCollection() {}
    /**
     * @return The action to take for the NAT rules in this collection. Currently, the only possible value is `Dnat`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return The name which should be used for this NAT rule collection.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The priority of the NAT rule collection. The range is `100` - `65000`.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return A `rule` (NAT rule) block as defined above.
     * 
     */
    public List<FirewallPolicyRuleCollectionGroupNatRuleCollectionRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleCollectionGroupNatRuleCollection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private String name;
        private Integer priority;
        private List<FirewallPolicyRuleCollectionGroupNatRuleCollectionRule> rules;
        public Builder() {}
        public Builder(FirewallPolicyRuleCollectionGroupNatRuleCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<FirewallPolicyRuleCollectionGroupNatRuleCollectionRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(FirewallPolicyRuleCollectionGroupNatRuleCollectionRule... rules) {
            return rules(List.of(rules));
        }
        public FirewallPolicyRuleCollectionGroupNatRuleCollection build() {
            final var o = new FirewallPolicyRuleCollectionGroupNatRuleCollection();
            o.action = action;
            o.name = name;
            o.priority = priority;
            o.rules = rules;
            return o;
        }
    }
}