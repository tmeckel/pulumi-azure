// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.azure.cdn.inputs.FrontdoorSecurityPolicySecurityPoliciesFirewallArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class FrontdoorSecurityPolicySecurityPoliciesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorSecurityPolicySecurityPoliciesArgs Empty = new FrontdoorSecurityPolicySecurityPoliciesArgs();

    /**
     * An `firewall` block as defined below. Changing this forces a new Front Door Security Policy to be created.
     * 
     */
    @Import(name="firewall", required=true)
    private Output<FrontdoorSecurityPolicySecurityPoliciesFirewallArgs> firewall;

    /**
     * @return An `firewall` block as defined below. Changing this forces a new Front Door Security Policy to be created.
     * 
     */
    public Output<FrontdoorSecurityPolicySecurityPoliciesFirewallArgs> firewall() {
        return this.firewall;
    }

    private FrontdoorSecurityPolicySecurityPoliciesArgs() {}

    private FrontdoorSecurityPolicySecurityPoliciesArgs(FrontdoorSecurityPolicySecurityPoliciesArgs $) {
        this.firewall = $.firewall;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorSecurityPolicySecurityPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorSecurityPolicySecurityPoliciesArgs $;

        public Builder() {
            $ = new FrontdoorSecurityPolicySecurityPoliciesArgs();
        }

        public Builder(FrontdoorSecurityPolicySecurityPoliciesArgs defaults) {
            $ = new FrontdoorSecurityPolicySecurityPoliciesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param firewall An `firewall` block as defined below. Changing this forces a new Front Door Security Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder firewall(Output<FrontdoorSecurityPolicySecurityPoliciesFirewallArgs> firewall) {
            $.firewall = firewall;
            return this;
        }

        /**
         * @param firewall An `firewall` block as defined below. Changing this forces a new Front Door Security Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder firewall(FrontdoorSecurityPolicySecurityPoliciesFirewallArgs firewall) {
            return firewall(Output.of(firewall));
        }

        public FrontdoorSecurityPolicySecurityPoliciesArgs build() {
            $.firewall = Objects.requireNonNull($.firewall, "expected parameter 'firewall' to be non-null");
            return $;
        }
    }

}
