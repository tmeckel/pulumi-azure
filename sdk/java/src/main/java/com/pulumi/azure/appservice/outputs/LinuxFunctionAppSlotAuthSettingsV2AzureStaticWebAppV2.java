// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LinuxFunctionAppSlotAuthSettingsV2AzureStaticWebAppV2 {
    /**
     * @return The OpenID Connect Client ID for the Apple web application.
     * 
     */
    private String clientId;

    private LinuxFunctionAppSlotAuthSettingsV2AzureStaticWebAppV2() {}
    /**
     * @return The OpenID Connect Client ID for the Apple web application.
     * 
     */
    public String clientId() {
        return this.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxFunctionAppSlotAuthSettingsV2AzureStaticWebAppV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        public Builder() {}
        public Builder(LinuxFunctionAppSlotAuthSettingsV2AzureStaticWebAppV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public LinuxFunctionAppSlotAuthSettingsV2AzureStaticWebAppV2 build() {
            final var o = new LinuxFunctionAppSlotAuthSettingsV2AzureStaticWebAppV2();
            o.clientId = clientId;
            return o;
        }
    }
}