// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontdoorBackendPoolHealthProbe {
    /**
     * @return Is this health probe enabled? Defaults to `true`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The ID of the FrontDoor.
     * 
     */
    private @Nullable String id;
    /**
     * @return The number of seconds between each Health Probe. Defaults to `120`.
     * 
     */
    private @Nullable Integer intervalInSeconds;
    /**
     * @return Specifies the name of the Health Probe.
     * 
     */
    private String name;
    /**
     * @return The path to use for the Health Probe. Default is `/`.
     * 
     */
    private @Nullable String path;
    /**
     * @return Specifies HTTP method the health probe uses when querying the backend pool instances. Possible values include: `GET` and `HEAD`. Defaults to `GET`.
     * 
     * &gt; **NOTE:** Use the `HEAD` method if you do not need to check the response body of your health probe.
     * 
     */
    private @Nullable String probeMethod;
    /**
     * @return Protocol scheme to use for the Health Probe. Possible values are `Http` and `Https`. Defaults to `Http`.
     * 
     */
    private @Nullable String protocol;

    private FrontdoorBackendPoolHealthProbe() {}
    /**
     * @return Is this health probe enabled? Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The ID of the FrontDoor.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The number of seconds between each Health Probe. Defaults to `120`.
     * 
     */
    public Optional<Integer> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }
    /**
     * @return Specifies the name of the Health Probe.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The path to use for the Health Probe. Default is `/`.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Specifies HTTP method the health probe uses when querying the backend pool instances. Possible values include: `GET` and `HEAD`. Defaults to `GET`.
     * 
     * &gt; **NOTE:** Use the `HEAD` method if you do not need to check the response body of your health probe.
     * 
     */
    public Optional<String> probeMethod() {
        return Optional.ofNullable(this.probeMethod);
    }
    /**
     * @return Protocol scheme to use for the Health Probe. Possible values are `Http` and `Https`. Defaults to `Http`.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontdoorBackendPoolHealthProbe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String id;
        private @Nullable Integer intervalInSeconds;
        private String name;
        private @Nullable String path;
        private @Nullable String probeMethod;
        private @Nullable String protocol;
        public Builder() {}
        public Builder(FrontdoorBackendPoolHealthProbe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.probeMethod = defaults.probeMethod;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder intervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder probeMethod(@Nullable String probeMethod) {
            this.probeMethod = probeMethod;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public FrontdoorBackendPoolHealthProbe build() {
            final var _resultValue = new FrontdoorBackendPoolHealthProbe();
            _resultValue.enabled = enabled;
            _resultValue.id = id;
            _resultValue.intervalInSeconds = intervalInSeconds;
            _resultValue.name = name;
            _resultValue.path = path;
            _resultValue.probeMethod = probeMethod;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}
