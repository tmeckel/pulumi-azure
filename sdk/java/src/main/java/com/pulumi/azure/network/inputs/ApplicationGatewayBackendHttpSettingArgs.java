// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingAuthenticationCertificateArgs;
import com.pulumi.azure.network.inputs.ApplicationGatewayBackendHttpSettingConnectionDrainingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayBackendHttpSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayBackendHttpSettingArgs Empty = new ApplicationGatewayBackendHttpSettingArgs();

    /**
     * The name of the affinity cookie.
     * 
     */
    @Import(name="affinityCookieName")
    private @Nullable Output<String> affinityCookieName;

    /**
     * @return The name of the affinity cookie.
     * 
     */
    public Optional<Output<String>> affinityCookieName() {
        return Optional.ofNullable(this.affinityCookieName);
    }

    /**
     * One or more `authentication_certificate` blocks.
     * 
     */
    @Import(name="authenticationCertificates")
    private @Nullable Output<List<ApplicationGatewayBackendHttpSettingAuthenticationCertificateArgs>> authenticationCertificates;

    /**
     * @return One or more `authentication_certificate` blocks.
     * 
     */
    public Optional<Output<List<ApplicationGatewayBackendHttpSettingAuthenticationCertificateArgs>>> authenticationCertificates() {
        return Optional.ofNullable(this.authenticationCertificates);
    }

    /**
     * A `connection_draining` block as defined below.
     * 
     */
    @Import(name="connectionDraining")
    private @Nullable Output<ApplicationGatewayBackendHttpSettingConnectionDrainingArgs> connectionDraining;

    /**
     * @return A `connection_draining` block as defined below.
     * 
     */
    public Optional<Output<ApplicationGatewayBackendHttpSettingConnectionDrainingArgs>> connectionDraining() {
        return Optional.ofNullable(this.connectionDraining);
    }

    /**
     * Is Cookie-Based Affinity enabled? Possible values are `Enabled` and `Disabled`.
     * 
     */
    @Import(name="cookieBasedAffinity", required=true)
    private Output<String> cookieBasedAffinity;

    /**
     * @return Is Cookie-Based Affinity enabled? Possible values are `Enabled` and `Disabled`.
     * 
     */
    public Output<String> cookieBasedAffinity() {
        return this.cookieBasedAffinity;
    }

    /**
     * Host header to be sent to the backend servers. Cannot be set if `pick_host_name_from_backend_address` is set to `true`.
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    /**
     * @return Host header to be sent to the backend servers. Cannot be set if `pick_host_name_from_backend_address` is set to `true`.
     * 
     */
    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * The ID of the Rewrite Rule Set
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the Backend HTTP Settings Collection.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Backend HTTP Settings Collection.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Path which should be used as a prefix for all HTTP requests.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The Path which should be used as a prefix for all HTTP requests.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Whether host header should be picked from the host name of the backend server. Defaults to `false`.
     * 
     */
    @Import(name="pickHostNameFromBackendAddress")
    private @Nullable Output<Boolean> pickHostNameFromBackendAddress;

    /**
     * @return Whether host header should be picked from the host name of the backend server. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> pickHostNameFromBackendAddress() {
        return Optional.ofNullable(this.pickHostNameFromBackendAddress);
    }

    /**
     * The port which should be used for this Backend HTTP Settings Collection.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port which should be used for this Backend HTTP Settings Collection.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The ID of the associated Probe.
     * 
     */
    @Import(name="probeId")
    private @Nullable Output<String> probeId;

    /**
     * @return The ID of the associated Probe.
     * 
     */
    public Optional<Output<String>> probeId() {
        return Optional.ofNullable(this.probeId);
    }

    /**
     * The name of an associated HTTP Probe.
     * 
     */
    @Import(name="probeName")
    private @Nullable Output<String> probeName;

    /**
     * @return The name of an associated HTTP Probe.
     * 
     */
    public Optional<Output<String>> probeName() {
        return Optional.ofNullable(this.probeName);
    }

    /**
     * The Protocol which should be used. Possible values are `Http` and `Https`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The Protocol which should be used. Possible values are `Http` and `Https`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * The request timeout in seconds, which must be between 1 and 86400 seconds. Defaults to `30`.
     * 
     */
    @Import(name="requestTimeout")
    private @Nullable Output<Integer> requestTimeout;

    /**
     * @return The request timeout in seconds, which must be between 1 and 86400 seconds. Defaults to `30`.
     * 
     */
    public Optional<Output<Integer>> requestTimeout() {
        return Optional.ofNullable(this.requestTimeout);
    }

    /**
     * A list of `trusted_root_certificate` names.
     * 
     */
    @Import(name="trustedRootCertificateNames")
    private @Nullable Output<List<String>> trustedRootCertificateNames;

    /**
     * @return A list of `trusted_root_certificate` names.
     * 
     */
    public Optional<Output<List<String>>> trustedRootCertificateNames() {
        return Optional.ofNullable(this.trustedRootCertificateNames);
    }

    private ApplicationGatewayBackendHttpSettingArgs() {}

    private ApplicationGatewayBackendHttpSettingArgs(ApplicationGatewayBackendHttpSettingArgs $) {
        this.affinityCookieName = $.affinityCookieName;
        this.authenticationCertificates = $.authenticationCertificates;
        this.connectionDraining = $.connectionDraining;
        this.cookieBasedAffinity = $.cookieBasedAffinity;
        this.hostName = $.hostName;
        this.id = $.id;
        this.name = $.name;
        this.path = $.path;
        this.pickHostNameFromBackendAddress = $.pickHostNameFromBackendAddress;
        this.port = $.port;
        this.probeId = $.probeId;
        this.probeName = $.probeName;
        this.protocol = $.protocol;
        this.requestTimeout = $.requestTimeout;
        this.trustedRootCertificateNames = $.trustedRootCertificateNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayBackendHttpSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayBackendHttpSettingArgs $;

        public Builder() {
            $ = new ApplicationGatewayBackendHttpSettingArgs();
        }

        public Builder(ApplicationGatewayBackendHttpSettingArgs defaults) {
            $ = new ApplicationGatewayBackendHttpSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param affinityCookieName The name of the affinity cookie.
         * 
         * @return builder
         * 
         */
        public Builder affinityCookieName(@Nullable Output<String> affinityCookieName) {
            $.affinityCookieName = affinityCookieName;
            return this;
        }

        /**
         * @param affinityCookieName The name of the affinity cookie.
         * 
         * @return builder
         * 
         */
        public Builder affinityCookieName(String affinityCookieName) {
            return affinityCookieName(Output.of(affinityCookieName));
        }

        /**
         * @param authenticationCertificates One or more `authentication_certificate` blocks.
         * 
         * @return builder
         * 
         */
        public Builder authenticationCertificates(@Nullable Output<List<ApplicationGatewayBackendHttpSettingAuthenticationCertificateArgs>> authenticationCertificates) {
            $.authenticationCertificates = authenticationCertificates;
            return this;
        }

        /**
         * @param authenticationCertificates One or more `authentication_certificate` blocks.
         * 
         * @return builder
         * 
         */
        public Builder authenticationCertificates(List<ApplicationGatewayBackendHttpSettingAuthenticationCertificateArgs> authenticationCertificates) {
            return authenticationCertificates(Output.of(authenticationCertificates));
        }

        /**
         * @param authenticationCertificates One or more `authentication_certificate` blocks.
         * 
         * @return builder
         * 
         */
        public Builder authenticationCertificates(ApplicationGatewayBackendHttpSettingAuthenticationCertificateArgs... authenticationCertificates) {
            return authenticationCertificates(List.of(authenticationCertificates));
        }

        /**
         * @param connectionDraining A `connection_draining` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionDraining(@Nullable Output<ApplicationGatewayBackendHttpSettingConnectionDrainingArgs> connectionDraining) {
            $.connectionDraining = connectionDraining;
            return this;
        }

        /**
         * @param connectionDraining A `connection_draining` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder connectionDraining(ApplicationGatewayBackendHttpSettingConnectionDrainingArgs connectionDraining) {
            return connectionDraining(Output.of(connectionDraining));
        }

        /**
         * @param cookieBasedAffinity Is Cookie-Based Affinity enabled? Possible values are `Enabled` and `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder cookieBasedAffinity(Output<String> cookieBasedAffinity) {
            $.cookieBasedAffinity = cookieBasedAffinity;
            return this;
        }

        /**
         * @param cookieBasedAffinity Is Cookie-Based Affinity enabled? Possible values are `Enabled` and `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder cookieBasedAffinity(String cookieBasedAffinity) {
            return cookieBasedAffinity(Output.of(cookieBasedAffinity));
        }

        /**
         * @param hostName Host header to be sent to the backend servers. Cannot be set if `pick_host_name_from_backend_address` is set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName Host header to be sent to the backend servers. Cannot be set if `pick_host_name_from_backend_address` is set to `true`.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param id The ID of the Rewrite Rule Set
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Rewrite Rule Set
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the Backend HTTP Settings Collection.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Backend HTTP Settings Collection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The Path which should be used as a prefix for all HTTP requests.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The Path which should be used as a prefix for all HTTP requests.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param pickHostNameFromBackendAddress Whether host header should be picked from the host name of the backend server. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder pickHostNameFromBackendAddress(@Nullable Output<Boolean> pickHostNameFromBackendAddress) {
            $.pickHostNameFromBackendAddress = pickHostNameFromBackendAddress;
            return this;
        }

        /**
         * @param pickHostNameFromBackendAddress Whether host header should be picked from the host name of the backend server. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder pickHostNameFromBackendAddress(Boolean pickHostNameFromBackendAddress) {
            return pickHostNameFromBackendAddress(Output.of(pickHostNameFromBackendAddress));
        }

        /**
         * @param port The port which should be used for this Backend HTTP Settings Collection.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port which should be used for this Backend HTTP Settings Collection.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param probeId The ID of the associated Probe.
         * 
         * @return builder
         * 
         */
        public Builder probeId(@Nullable Output<String> probeId) {
            $.probeId = probeId;
            return this;
        }

        /**
         * @param probeId The ID of the associated Probe.
         * 
         * @return builder
         * 
         */
        public Builder probeId(String probeId) {
            return probeId(Output.of(probeId));
        }

        /**
         * @param probeName The name of an associated HTTP Probe.
         * 
         * @return builder
         * 
         */
        public Builder probeName(@Nullable Output<String> probeName) {
            $.probeName = probeName;
            return this;
        }

        /**
         * @param probeName The name of an associated HTTP Probe.
         * 
         * @return builder
         * 
         */
        public Builder probeName(String probeName) {
            return probeName(Output.of(probeName));
        }

        /**
         * @param protocol The Protocol which should be used. Possible values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The Protocol which should be used. Possible values are `Http` and `Https`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param requestTimeout The request timeout in seconds, which must be between 1 and 86400 seconds. Defaults to `30`.
         * 
         * @return builder
         * 
         */
        public Builder requestTimeout(@Nullable Output<Integer> requestTimeout) {
            $.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * @param requestTimeout The request timeout in seconds, which must be between 1 and 86400 seconds. Defaults to `30`.
         * 
         * @return builder
         * 
         */
        public Builder requestTimeout(Integer requestTimeout) {
            return requestTimeout(Output.of(requestTimeout));
        }

        /**
         * @param trustedRootCertificateNames A list of `trusted_root_certificate` names.
         * 
         * @return builder
         * 
         */
        public Builder trustedRootCertificateNames(@Nullable Output<List<String>> trustedRootCertificateNames) {
            $.trustedRootCertificateNames = trustedRootCertificateNames;
            return this;
        }

        /**
         * @param trustedRootCertificateNames A list of `trusted_root_certificate` names.
         * 
         * @return builder
         * 
         */
        public Builder trustedRootCertificateNames(List<String> trustedRootCertificateNames) {
            return trustedRootCertificateNames(Output.of(trustedRootCertificateNames));
        }

        /**
         * @param trustedRootCertificateNames A list of `trusted_root_certificate` names.
         * 
         * @return builder
         * 
         */
        public Builder trustedRootCertificateNames(String... trustedRootCertificateNames) {
            return trustedRootCertificateNames(List.of(trustedRootCertificateNames));
        }

        public ApplicationGatewayBackendHttpSettingArgs build() {
            $.cookieBasedAffinity = Objects.requireNonNull($.cookieBasedAffinity, "expected parameter 'cookieBasedAffinity' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}