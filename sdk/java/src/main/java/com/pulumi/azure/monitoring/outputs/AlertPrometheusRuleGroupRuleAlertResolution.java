// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertPrometheusRuleGroupRuleAlertResolution {
    /**
     * @return Is the alert auto-resolution? Possible values are `true` and `false`.
     * 
     */
    private @Nullable Boolean autoResolved;
    /**
     * @return Specifies the alert auto-resolution interval, represented in ISO 8601 duration format.
     * 
     */
    private @Nullable String timeToResolve;

    private AlertPrometheusRuleGroupRuleAlertResolution() {}
    /**
     * @return Is the alert auto-resolution? Possible values are `true` and `false`.
     * 
     */
    public Optional<Boolean> autoResolved() {
        return Optional.ofNullable(this.autoResolved);
    }
    /**
     * @return Specifies the alert auto-resolution interval, represented in ISO 8601 duration format.
     * 
     */
    public Optional<String> timeToResolve() {
        return Optional.ofNullable(this.timeToResolve);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPrometheusRuleGroupRuleAlertResolution defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoResolved;
        private @Nullable String timeToResolve;
        public Builder() {}
        public Builder(AlertPrometheusRuleGroupRuleAlertResolution defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoResolved = defaults.autoResolved;
    	      this.timeToResolve = defaults.timeToResolve;
        }

        @CustomType.Setter
        public Builder autoResolved(@Nullable Boolean autoResolved) {
            this.autoResolved = autoResolved;
            return this;
        }
        @CustomType.Setter
        public Builder timeToResolve(@Nullable String timeToResolve) {
            this.timeToResolve = timeToResolve;
            return this;
        }
        public AlertPrometheusRuleGroupRuleAlertResolution build() {
            final var o = new AlertPrometheusRuleGroupRuleAlertResolution();
            o.autoResolved = autoResolved;
            o.timeToResolve = timeToResolve;
            return o;
        }
    }
}