// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceDelegation {
    /**
     * @return Should subscription requests be delegated to an external url? Defaults to `false`.
     * 
     */
    private @Nullable Boolean subscriptionsEnabled;
    /**
     * @return The delegation URL.
     * 
     */
    private @Nullable String url;
    /**
     * @return Should user registration requests be delegated to an external url? Defaults to `false`.
     * 
     */
    private @Nullable Boolean userRegistrationEnabled;
    /**
     * @return A base64-encoded validation key to validate, that a request is coming from Azure API Management.
     * 
     */
    private @Nullable String validationKey;

    private ServiceDelegation() {}
    /**
     * @return Should subscription requests be delegated to an external url? Defaults to `false`.
     * 
     */
    public Optional<Boolean> subscriptionsEnabled() {
        return Optional.ofNullable(this.subscriptionsEnabled);
    }
    /**
     * @return The delegation URL.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }
    /**
     * @return Should user registration requests be delegated to an external url? Defaults to `false`.
     * 
     */
    public Optional<Boolean> userRegistrationEnabled() {
        return Optional.ofNullable(this.userRegistrationEnabled);
    }
    /**
     * @return A base64-encoded validation key to validate, that a request is coming from Azure API Management.
     * 
     */
    public Optional<String> validationKey() {
        return Optional.ofNullable(this.validationKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDelegation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean subscriptionsEnabled;
        private @Nullable String url;
        private @Nullable Boolean userRegistrationEnabled;
        private @Nullable String validationKey;
        public Builder() {}
        public Builder(ServiceDelegation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscriptionsEnabled = defaults.subscriptionsEnabled;
    	      this.url = defaults.url;
    	      this.userRegistrationEnabled = defaults.userRegistrationEnabled;
    	      this.validationKey = defaults.validationKey;
        }

        @CustomType.Setter
        public Builder subscriptionsEnabled(@Nullable Boolean subscriptionsEnabled) {
            this.subscriptionsEnabled = subscriptionsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder userRegistrationEnabled(@Nullable Boolean userRegistrationEnabled) {
            this.userRegistrationEnabled = userRegistrationEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder validationKey(@Nullable String validationKey) {
            this.validationKey = validationKey;
            return this;
        }
        public ServiceDelegation build() {
            final var o = new ServiceDelegation();
            o.subscriptionsEnabled = subscriptionsEnabled;
            o.url = url;
            o.userRegistrationEnabled = userRegistrationEnabled;
            o.validationKey = validationKey;
            return o;
        }
    }
}