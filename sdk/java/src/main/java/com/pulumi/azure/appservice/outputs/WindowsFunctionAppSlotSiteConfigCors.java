// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsFunctionAppSlotSiteConfigCors {
    /**
     * @return an `allowed_origins` block as detailed below.
     * 
     */
    private List<String> allowedOrigins;
    /**
     * @return Are credentials allowed in CORS requests? Defaults to `false`.
     * 
     */
    private @Nullable Boolean supportCredentials;

    private WindowsFunctionAppSlotSiteConfigCors() {}
    /**
     * @return an `allowed_origins` block as detailed below.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return Are credentials allowed in CORS requests? Defaults to `false`.
     * 
     */
    public Optional<Boolean> supportCredentials() {
        return Optional.ofNullable(this.supportCredentials);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsFunctionAppSlotSiteConfigCors defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedOrigins;
        private @Nullable Boolean supportCredentials;
        public Builder() {}
        public Builder(WindowsFunctionAppSlotSiteConfigCors defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.supportCredentials = defaults.supportCredentials;
        }

        @CustomType.Setter
        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        @CustomType.Setter
        public Builder supportCredentials(@Nullable Boolean supportCredentials) {
            this.supportCredentials = supportCredentials;
            return this;
        }
        public WindowsFunctionAppSlotSiteConfigCors build() {
            final var o = new WindowsFunctionAppSlotSiteConfigCors();
            o.allowedOrigins = allowedOrigins;
            o.supportCredentials = supportCredentials;
            return o;
        }
    }
}