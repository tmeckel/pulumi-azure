// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkConnectionMonitorTestConfigurationTcpConfiguration {
    /**
     * @return The destination port behavior for the TCP connection. Possible values are `None` and `ListenIfAvailable`.
     * 
     */
    private @Nullable String destinationPortBehavior;
    /**
     * @return The port for the TCP connection.
     * 
     */
    private Integer port;
    /**
     * @return Should path evaluation with trace route be enabled? Defaults to `true`.
     * 
     */
    private @Nullable Boolean traceRouteEnabled;

    private NetworkConnectionMonitorTestConfigurationTcpConfiguration() {}
    /**
     * @return The destination port behavior for the TCP connection. Possible values are `None` and `ListenIfAvailable`.
     * 
     */
    public Optional<String> destinationPortBehavior() {
        return Optional.ofNullable(this.destinationPortBehavior);
    }
    /**
     * @return The port for the TCP connection.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Should path evaluation with trace route be enabled? Defaults to `true`.
     * 
     */
    public Optional<Boolean> traceRouteEnabled() {
        return Optional.ofNullable(this.traceRouteEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConnectionMonitorTestConfigurationTcpConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destinationPortBehavior;
        private Integer port;
        private @Nullable Boolean traceRouteEnabled;
        public Builder() {}
        public Builder(NetworkConnectionMonitorTestConfigurationTcpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPortBehavior = defaults.destinationPortBehavior;
    	      this.port = defaults.port;
    	      this.traceRouteEnabled = defaults.traceRouteEnabled;
        }

        @CustomType.Setter
        public Builder destinationPortBehavior(@Nullable String destinationPortBehavior) {
            this.destinationPortBehavior = destinationPortBehavior;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder traceRouteEnabled(@Nullable Boolean traceRouteEnabled) {
            this.traceRouteEnabled = traceRouteEnabled;
            return this;
        }
        public NetworkConnectionMonitorTestConfigurationTcpConfiguration build() {
            final var o = new NetworkConnectionMonitorTestConfigurationTcpConfiguration();
            o.destinationPortBehavior = destinationPortBehavior;
            o.port = port;
            o.traceRouteEnabled = traceRouteEnabled;
            return o;
        }
    }
}