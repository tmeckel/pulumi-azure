// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.notificationhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class HubGcmCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final HubGcmCredentialArgs Empty = new HubGcmCredentialArgs();

    /**
     * The API Key associated with the Google Cloud Messaging service.
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    /**
     * @return The API Key associated with the Google Cloud Messaging service.
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }

    private HubGcmCredentialArgs() {}

    private HubGcmCredentialArgs(HubGcmCredentialArgs $) {
        this.apiKey = $.apiKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HubGcmCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HubGcmCredentialArgs $;

        public Builder() {
            $ = new HubGcmCredentialArgs();
        }

        public Builder(HubGcmCredentialArgs defaults) {
            $ = new HubGcmCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKey The API Key associated with the Google Cloud Messaging service.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey The API Key associated with the Google Cloud Messaging service.
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        public HubGcmCredentialArgs build() {
            $.apiKey = Objects.requireNonNull($.apiKey, "expected parameter 'apiKey' to be non-null");
            return $;
        }
    }

}