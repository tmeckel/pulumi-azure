// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FrontdoorFrontendEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final FrontdoorFrontendEndpointArgs Empty = new FrontdoorFrontendEndpointArgs();

    /**
     * Specifies the host name of the `frontend_endpoint`. Must be a domain name. In order to use a name.azurefd.net domain, the name value must match the Front Door name.
     * 
     */
    @Import(name="hostName", required=true)
    private Output<String> hostName;

    /**
     * @return Specifies the host name of the `frontend_endpoint`. Must be a domain name. In order to use a name.azurefd.net domain, the name value must match the Front Door name.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }

    /**
     * The ID of the FrontDoor.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the FrontDoor.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies the name of the `frontend_endpoint`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the `frontend_endpoint`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Whether to allow session affinity on this host. Valid options are `true` or `false` Defaults to `false`.
     * 
     */
    @Import(name="sessionAffinityEnabled")
    private @Nullable Output<Boolean> sessionAffinityEnabled;

    /**
     * @return Whether to allow session affinity on this host. Valid options are `true` or `false` Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> sessionAffinityEnabled() {
        return Optional.ofNullable(this.sessionAffinityEnabled);
    }

    /**
     * The TTL to use in seconds for session affinity, if applicable. Defaults to `0`.
     * 
     */
    @Import(name="sessionAffinityTtlSeconds")
    private @Nullable Output<Integer> sessionAffinityTtlSeconds;

    /**
     * @return The TTL to use in seconds for session affinity, if applicable. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> sessionAffinityTtlSeconds() {
        return Optional.ofNullable(this.sessionAffinityTtlSeconds);
    }

    /**
     * Defines the Web Application Firewall policy `ID` for each host.
     * 
     */
    @Import(name="webApplicationFirewallPolicyLinkId")
    private @Nullable Output<String> webApplicationFirewallPolicyLinkId;

    /**
     * @return Defines the Web Application Firewall policy `ID` for each host.
     * 
     */
    public Optional<Output<String>> webApplicationFirewallPolicyLinkId() {
        return Optional.ofNullable(this.webApplicationFirewallPolicyLinkId);
    }

    private FrontdoorFrontendEndpointArgs() {}

    private FrontdoorFrontendEndpointArgs(FrontdoorFrontendEndpointArgs $) {
        this.hostName = $.hostName;
        this.id = $.id;
        this.name = $.name;
        this.sessionAffinityEnabled = $.sessionAffinityEnabled;
        this.sessionAffinityTtlSeconds = $.sessionAffinityTtlSeconds;
        this.webApplicationFirewallPolicyLinkId = $.webApplicationFirewallPolicyLinkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontdoorFrontendEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontdoorFrontendEndpointArgs $;

        public Builder() {
            $ = new FrontdoorFrontendEndpointArgs();
        }

        public Builder(FrontdoorFrontendEndpointArgs defaults) {
            $ = new FrontdoorFrontendEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostName Specifies the host name of the `frontend_endpoint`. Must be a domain name. In order to use a name.azurefd.net domain, the name value must match the Front Door name.
         * 
         * @return builder
         * 
         */
        public Builder hostName(Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName Specifies the host name of the `frontend_endpoint`. Must be a domain name. In order to use a name.azurefd.net domain, the name value must match the Front Door name.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param id The ID of the FrontDoor.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the FrontDoor.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Specifies the name of the `frontend_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the `frontend_endpoint`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sessionAffinityEnabled Whether to allow session affinity on this host. Valid options are `true` or `false` Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityEnabled(@Nullable Output<Boolean> sessionAffinityEnabled) {
            $.sessionAffinityEnabled = sessionAffinityEnabled;
            return this;
        }

        /**
         * @param sessionAffinityEnabled Whether to allow session affinity on this host. Valid options are `true` or `false` Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityEnabled(Boolean sessionAffinityEnabled) {
            return sessionAffinityEnabled(Output.of(sessionAffinityEnabled));
        }

        /**
         * @param sessionAffinityTtlSeconds The TTL to use in seconds for session affinity, if applicable. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityTtlSeconds(@Nullable Output<Integer> sessionAffinityTtlSeconds) {
            $.sessionAffinityTtlSeconds = sessionAffinityTtlSeconds;
            return this;
        }

        /**
         * @param sessionAffinityTtlSeconds The TTL to use in seconds for session affinity, if applicable. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder sessionAffinityTtlSeconds(Integer sessionAffinityTtlSeconds) {
            return sessionAffinityTtlSeconds(Output.of(sessionAffinityTtlSeconds));
        }

        /**
         * @param webApplicationFirewallPolicyLinkId Defines the Web Application Firewall policy `ID` for each host.
         * 
         * @return builder
         * 
         */
        public Builder webApplicationFirewallPolicyLinkId(@Nullable Output<String> webApplicationFirewallPolicyLinkId) {
            $.webApplicationFirewallPolicyLinkId = webApplicationFirewallPolicyLinkId;
            return this;
        }

        /**
         * @param webApplicationFirewallPolicyLinkId Defines the Web Application Firewall policy `ID` for each host.
         * 
         * @return builder
         * 
         */
        public Builder webApplicationFirewallPolicyLinkId(String webApplicationFirewallPolicyLinkId) {
            return webApplicationFirewallPolicyLinkId(Output.of(webApplicationFirewallPolicyLinkId));
        }

        public FrontdoorFrontendEndpointArgs build() {
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}