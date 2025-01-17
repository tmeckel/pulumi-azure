// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetIpRuleArgs;
import com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetVirtualNetworkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryNetworkRuleSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryNetworkRuleSetArgs Empty = new RegistryNetworkRuleSetArgs();

    /**
     * The behaviour for requests matching no rules. Either `Allow` or `Deny`. Defaults to `Allow`
     * 
     */
    @Import(name="defaultAction")
    private @Nullable Output<String> defaultAction;

    /**
     * @return The behaviour for requests matching no rules. Either `Allow` or `Deny`. Defaults to `Allow`
     * 
     */
    public Optional<Output<String>> defaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }

    /**
     * One or more `ip_rule` blocks as defined below.
     * 
     * &gt; **NOTE:** `network_rule_set` is only supported with the `Premium` SKU at this time.
     * 
     * &gt; **NOTE:** Azure automatically configures Network Rules - to remove these you&#39;ll need to specify an `network_rule_set` block with `default_action` set to `Deny`.
     * 
     */
    @Import(name="ipRules")
    private @Nullable Output<List<RegistryNetworkRuleSetIpRuleArgs>> ipRules;

    /**
     * @return One or more `ip_rule` blocks as defined below.
     * 
     * &gt; **NOTE:** `network_rule_set` is only supported with the `Premium` SKU at this time.
     * 
     * &gt; **NOTE:** Azure automatically configures Network Rules - to remove these you&#39;ll need to specify an `network_rule_set` block with `default_action` set to `Deny`.
     * 
     */
    public Optional<Output<List<RegistryNetworkRuleSetIpRuleArgs>>> ipRules() {
        return Optional.ofNullable(this.ipRules);
    }

    /**
     * @deprecated
     *  This is only used exclusively for service endpoints (which is a feature being deprecated). Users are expected to use Private Endpoints instead
     * 
     */
    @Deprecated /*  This is only used exclusively for service endpoints (which is a feature being deprecated). Users are expected to use Private Endpoints instead */
    @Import(name="virtualNetworks")
    private @Nullable Output<List<RegistryNetworkRuleSetVirtualNetworkArgs>> virtualNetworks;

    /**
     * @deprecated
     *  This is only used exclusively for service endpoints (which is a feature being deprecated). Users are expected to use Private Endpoints instead
     * 
     */
    @Deprecated /*  This is only used exclusively for service endpoints (which is a feature being deprecated). Users are expected to use Private Endpoints instead */
    public Optional<Output<List<RegistryNetworkRuleSetVirtualNetworkArgs>>> virtualNetworks() {
        return Optional.ofNullable(this.virtualNetworks);
    }

    private RegistryNetworkRuleSetArgs() {}

    private RegistryNetworkRuleSetArgs(RegistryNetworkRuleSetArgs $) {
        this.defaultAction = $.defaultAction;
        this.ipRules = $.ipRules;
        this.virtualNetworks = $.virtualNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryNetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryNetworkRuleSetArgs $;

        public Builder() {
            $ = new RegistryNetworkRuleSetArgs();
        }

        public Builder(RegistryNetworkRuleSetArgs defaults) {
            $ = new RegistryNetworkRuleSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultAction The behaviour for requests matching no rules. Either `Allow` or `Deny`. Defaults to `Allow`
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(@Nullable Output<String> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        /**
         * @param defaultAction The behaviour for requests matching no rules. Either `Allow` or `Deny`. Defaults to `Allow`
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(String defaultAction) {
            return defaultAction(Output.of(defaultAction));
        }

        /**
         * @param ipRules One or more `ip_rule` blocks as defined below.
         * 
         * &gt; **NOTE:** `network_rule_set` is only supported with the `Premium` SKU at this time.
         * 
         * &gt; **NOTE:** Azure automatically configures Network Rules - to remove these you&#39;ll need to specify an `network_rule_set` block with `default_action` set to `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(@Nullable Output<List<RegistryNetworkRuleSetIpRuleArgs>> ipRules) {
            $.ipRules = ipRules;
            return this;
        }

        /**
         * @param ipRules One or more `ip_rule` blocks as defined below.
         * 
         * &gt; **NOTE:** `network_rule_set` is only supported with the `Premium` SKU at this time.
         * 
         * &gt; **NOTE:** Azure automatically configures Network Rules - to remove these you&#39;ll need to specify an `network_rule_set` block with `default_action` set to `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(List<RegistryNetworkRuleSetIpRuleArgs> ipRules) {
            return ipRules(Output.of(ipRules));
        }

        /**
         * @param ipRules One or more `ip_rule` blocks as defined below.
         * 
         * &gt; **NOTE:** `network_rule_set` is only supported with the `Premium` SKU at this time.
         * 
         * &gt; **NOTE:** Azure automatically configures Network Rules - to remove these you&#39;ll need to specify an `network_rule_set` block with `default_action` set to `Deny`.
         * 
         * @return builder
         * 
         */
        public Builder ipRules(RegistryNetworkRuleSetIpRuleArgs... ipRules) {
            return ipRules(List.of(ipRules));
        }

        /**
         * @return builder
         * 
         * @deprecated
         *  This is only used exclusively for service endpoints (which is a feature being deprecated). Users are expected to use Private Endpoints instead
         * 
         */
        @Deprecated /*  This is only used exclusively for service endpoints (which is a feature being deprecated). Users are expected to use Private Endpoints instead */
        public Builder virtualNetworks(@Nullable Output<List<RegistryNetworkRuleSetVirtualNetworkArgs>> virtualNetworks) {
            $.virtualNetworks = virtualNetworks;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         *  This is only used exclusively for service endpoints (which is a feature being deprecated). Users are expected to use Private Endpoints instead
         * 
         */
        @Deprecated /*  This is only used exclusively for service endpoints (which is a feature being deprecated). Users are expected to use Private Endpoints instead */
        public Builder virtualNetworks(List<RegistryNetworkRuleSetVirtualNetworkArgs> virtualNetworks) {
            return virtualNetworks(Output.of(virtualNetworks));
        }

        /**
         * @return builder
         * 
         * @deprecated
         *  This is only used exclusively for service endpoints (which is a feature being deprecated). Users are expected to use Private Endpoints instead
         * 
         */
        @Deprecated /*  This is only used exclusively for service endpoints (which is a feature being deprecated). Users are expected to use Private Endpoints instead */
        public Builder virtualNetworks(RegistryNetworkRuleSetVirtualNetworkArgs... virtualNetworks) {
            return virtualNetworks(List.of(virtualNetworks));
        }

        public RegistryNetworkRuleSetArgs build() {
            return $;
        }
    }

}
