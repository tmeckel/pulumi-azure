// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalSsoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudDevToolPortalArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudDevToolPortalArgs Empty = new SpringCloudDevToolPortalArgs();

    /**
     * Should the Accelerator plugin be enabled?
     * 
     */
    @Import(name="applicationAcceleratorEnabled")
    private @Nullable Output<Boolean> applicationAcceleratorEnabled;

    /**
     * @return Should the Accelerator plugin be enabled?
     * 
     */
    public Optional<Output<Boolean>> applicationAcceleratorEnabled() {
        return Optional.ofNullable(this.applicationAcceleratorEnabled);
    }

    /**
     * Should the Application Live View be enabled?
     * 
     */
    @Import(name="applicationLiveViewEnabled")
    private @Nullable Output<Boolean> applicationLiveViewEnabled;

    /**
     * @return Should the Application Live View be enabled?
     * 
     */
    public Optional<Output<Boolean>> applicationLiveViewEnabled() {
        return Optional.ofNullable(this.applicationLiveViewEnabled);
    }

    /**
     * The name which should be used for this Spring Cloud Dev Tool Portal. The only possible value is `default`. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud Dev Tool Portal. The only possible value is `default`. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Is public network access enabled?
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Is public network access enabled?
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
     * 
     */
    @Import(name="springCloudServiceId", required=true)
    private Output<String> springCloudServiceId;

    /**
     * @return The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
     * 
     */
    public Output<String> springCloudServiceId() {
        return this.springCloudServiceId;
    }

    /**
     * A `sso` block as defined below.
     * 
     */
    @Import(name="sso")
    private @Nullable Output<SpringCloudDevToolPortalSsoArgs> sso;

    /**
     * @return A `sso` block as defined below.
     * 
     */
    public Optional<Output<SpringCloudDevToolPortalSsoArgs>> sso() {
        return Optional.ofNullable(this.sso);
    }

    private SpringCloudDevToolPortalArgs() {}

    private SpringCloudDevToolPortalArgs(SpringCloudDevToolPortalArgs $) {
        this.applicationAcceleratorEnabled = $.applicationAcceleratorEnabled;
        this.applicationLiveViewEnabled = $.applicationLiveViewEnabled;
        this.name = $.name;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.springCloudServiceId = $.springCloudServiceId;
        this.sso = $.sso;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudDevToolPortalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudDevToolPortalArgs $;

        public Builder() {
            $ = new SpringCloudDevToolPortalArgs();
        }

        public Builder(SpringCloudDevToolPortalArgs defaults) {
            $ = new SpringCloudDevToolPortalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationAcceleratorEnabled Should the Accelerator plugin be enabled?
         * 
         * @return builder
         * 
         */
        public Builder applicationAcceleratorEnabled(@Nullable Output<Boolean> applicationAcceleratorEnabled) {
            $.applicationAcceleratorEnabled = applicationAcceleratorEnabled;
            return this;
        }

        /**
         * @param applicationAcceleratorEnabled Should the Accelerator plugin be enabled?
         * 
         * @return builder
         * 
         */
        public Builder applicationAcceleratorEnabled(Boolean applicationAcceleratorEnabled) {
            return applicationAcceleratorEnabled(Output.of(applicationAcceleratorEnabled));
        }

        /**
         * @param applicationLiveViewEnabled Should the Application Live View be enabled?
         * 
         * @return builder
         * 
         */
        public Builder applicationLiveViewEnabled(@Nullable Output<Boolean> applicationLiveViewEnabled) {
            $.applicationLiveViewEnabled = applicationLiveViewEnabled;
            return this;
        }

        /**
         * @param applicationLiveViewEnabled Should the Application Live View be enabled?
         * 
         * @return builder
         * 
         */
        public Builder applicationLiveViewEnabled(Boolean applicationLiveViewEnabled) {
            return applicationLiveViewEnabled(Output.of(applicationLiveViewEnabled));
        }

        /**
         * @param name The name which should be used for this Spring Cloud Dev Tool Portal. The only possible value is `default`. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Spring Cloud Dev Tool Portal. The only possible value is `default`. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicNetworkAccessEnabled Is public network access enabled?
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Is public network access enabled?
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param springCloudServiceId The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudServiceId(Output<String> springCloudServiceId) {
            $.springCloudServiceId = springCloudServiceId;
            return this;
        }

        /**
         * @param springCloudServiceId The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudServiceId(String springCloudServiceId) {
            return springCloudServiceId(Output.of(springCloudServiceId));
        }

        /**
         * @param sso A `sso` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sso(@Nullable Output<SpringCloudDevToolPortalSsoArgs> sso) {
            $.sso = sso;
            return this;
        }

        /**
         * @param sso A `sso` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sso(SpringCloudDevToolPortalSsoArgs sso) {
            return sso(Output.of(sso));
        }

        public SpringCloudDevToolPortalArgs build() {
            $.springCloudServiceId = Objects.requireNonNull($.springCloudServiceId, "expected parameter 'springCloudServiceId' to be non-null");
            return $;
        }
    }

}
