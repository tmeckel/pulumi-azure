// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.frontdoor.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontdoorBackendPoolSetting {
    /**
     * @return Specifies the send and receive timeout on forwarding request to the backend. When the timeout is reached, the request fails and returns. Possible values are between `0` - `240`. Defaults to `60`.
     * 
     */
    private @Nullable Integer backendPoolsSendReceiveTimeoutSeconds;
    /**
     * @return Enforce certificate name check on `HTTPS` requests to all backend pools, this setting will have no effect on `HTTP` requests. Permitted values are `true` or `false`.
     * 
     */
    private Boolean enforceBackendPoolsCertificateNameCheck;

    private FrontdoorBackendPoolSetting() {}
    /**
     * @return Specifies the send and receive timeout on forwarding request to the backend. When the timeout is reached, the request fails and returns. Possible values are between `0` - `240`. Defaults to `60`.
     * 
     */
    public Optional<Integer> backendPoolsSendReceiveTimeoutSeconds() {
        return Optional.ofNullable(this.backendPoolsSendReceiveTimeoutSeconds);
    }
    /**
     * @return Enforce certificate name check on `HTTPS` requests to all backend pools, this setting will have no effect on `HTTP` requests. Permitted values are `true` or `false`.
     * 
     */
    public Boolean enforceBackendPoolsCertificateNameCheck() {
        return this.enforceBackendPoolsCertificateNameCheck;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontdoorBackendPoolSetting defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer backendPoolsSendReceiveTimeoutSeconds;
        private Boolean enforceBackendPoolsCertificateNameCheck;
        public Builder() {}
        public Builder(FrontdoorBackendPoolSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPoolsSendReceiveTimeoutSeconds = defaults.backendPoolsSendReceiveTimeoutSeconds;
    	      this.enforceBackendPoolsCertificateNameCheck = defaults.enforceBackendPoolsCertificateNameCheck;
        }

        @CustomType.Setter
        public Builder backendPoolsSendReceiveTimeoutSeconds(@Nullable Integer backendPoolsSendReceiveTimeoutSeconds) {
            this.backendPoolsSendReceiveTimeoutSeconds = backendPoolsSendReceiveTimeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder enforceBackendPoolsCertificateNameCheck(Boolean enforceBackendPoolsCertificateNameCheck) {
            this.enforceBackendPoolsCertificateNameCheck = Objects.requireNonNull(enforceBackendPoolsCertificateNameCheck);
            return this;
        }
        public FrontdoorBackendPoolSetting build() {
            final var o = new FrontdoorBackendPoolSetting();
            o.backendPoolsSendReceiveTimeoutSeconds = backendPoolsSendReceiveTimeoutSeconds;
            o.enforceBackendPoolsCertificateNameCheck = enforceBackendPoolsCertificateNameCheck;
            return o;
        }
    }
}