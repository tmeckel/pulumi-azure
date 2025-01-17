// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ChannelLineLineChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelLineLineChannelArgs Empty = new ChannelLineLineChannelArgs();

    /**
     * The access token which is used to call the Line Channel API.
     * 
     */
    @Import(name="accessToken", required=true)
    private Output<String> accessToken;

    /**
     * @return The access token which is used to call the Line Channel API.
     * 
     */
    public Output<String> accessToken() {
        return this.accessToken;
    }

    /**
     * The secret which is used to access the Line Channel.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The secret which is used to access the Line Channel.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    private ChannelLineLineChannelArgs() {}

    private ChannelLineLineChannelArgs(ChannelLineLineChannelArgs $) {
        this.accessToken = $.accessToken;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelLineLineChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelLineLineChannelArgs $;

        public Builder() {
            $ = new ChannelLineLineChannelArgs();
        }

        public Builder(ChannelLineLineChannelArgs defaults) {
            $ = new ChannelLineLineChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken The access token which is used to call the Line Channel API.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken The access token which is used to call the Line Channel API.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param secret The secret which is used to access the Line Channel.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The secret which is used to access the Line Channel.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public ChannelLineLineChannelArgs build() {
            $.accessToken = Objects.requireNonNull($.accessToken, "expected parameter 'accessToken' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}
