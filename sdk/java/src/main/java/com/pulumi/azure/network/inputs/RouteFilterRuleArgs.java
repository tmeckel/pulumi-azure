// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RouteFilterRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteFilterRuleArgs Empty = new RouteFilterRuleArgs();

    /**
     * The access type of the rule. The only possible value is `Allow`.
     * 
     */
    @Import(name="access", required=true)
    private Output<String> access;

    /**
     * @return The access type of the rule. The only possible value is `Allow`.
     * 
     */
    public Output<String> access() {
        return this.access;
    }

    /**
     * The collection for bgp community values to filter on. e.g. [&#39;12076:5010&#39;,&#39;12076:5020&#39;].
     * 
     */
    @Import(name="communities", required=true)
    private Output<List<String>> communities;

    /**
     * @return The collection for bgp community values to filter on. e.g. [&#39;12076:5010&#39;,&#39;12076:5020&#39;].
     * 
     */
    public Output<List<String>> communities() {
        return this.communities;
    }

    /**
     * The name of the route filter rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the route filter rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The rule type of the rule. The only possible value is `Community`.
     * 
     */
    @Import(name="ruleType", required=true)
    private Output<String> ruleType;

    /**
     * @return The rule type of the rule. The only possible value is `Community`.
     * 
     */
    public Output<String> ruleType() {
        return this.ruleType;
    }

    private RouteFilterRuleArgs() {}

    private RouteFilterRuleArgs(RouteFilterRuleArgs $) {
        this.access = $.access;
        this.communities = $.communities;
        this.name = $.name;
        this.ruleType = $.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteFilterRuleArgs $;

        public Builder() {
            $ = new RouteFilterRuleArgs();
        }

        public Builder(RouteFilterRuleArgs defaults) {
            $ = new RouteFilterRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param access The access type of the rule. The only possible value is `Allow`.
         * 
         * @return builder
         * 
         */
        public Builder access(Output<String> access) {
            $.access = access;
            return this;
        }

        /**
         * @param access The access type of the rule. The only possible value is `Allow`.
         * 
         * @return builder
         * 
         */
        public Builder access(String access) {
            return access(Output.of(access));
        }

        /**
         * @param communities The collection for bgp community values to filter on. e.g. [&#39;12076:5010&#39;,&#39;12076:5020&#39;].
         * 
         * @return builder
         * 
         */
        public Builder communities(Output<List<String>> communities) {
            $.communities = communities;
            return this;
        }

        /**
         * @param communities The collection for bgp community values to filter on. e.g. [&#39;12076:5010&#39;,&#39;12076:5020&#39;].
         * 
         * @return builder
         * 
         */
        public Builder communities(List<String> communities) {
            return communities(Output.of(communities));
        }

        /**
         * @param communities The collection for bgp community values to filter on. e.g. [&#39;12076:5010&#39;,&#39;12076:5020&#39;].
         * 
         * @return builder
         * 
         */
        public Builder communities(String... communities) {
            return communities(List.of(communities));
        }

        /**
         * @param name The name of the route filter rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the route filter rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ruleType The rule type of the rule. The only possible value is `Community`.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(Output<String> ruleType) {
            $.ruleType = ruleType;
            return this;
        }

        /**
         * @param ruleType The rule type of the rule. The only possible value is `Community`.
         * 
         * @return builder
         * 
         */
        public Builder ruleType(String ruleType) {
            return ruleType(Output.of(ruleType));
        }

        public RouteFilterRuleArgs build() {
            $.access = Objects.requireNonNull($.access, "expected parameter 'access' to be non-null");
            $.communities = Objects.requireNonNull($.communities, "expected parameter 'communities' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.ruleType = Objects.requireNonNull($.ruleType, "expected parameter 'ruleType' to be non-null");
            return $;
        }
    }

}
