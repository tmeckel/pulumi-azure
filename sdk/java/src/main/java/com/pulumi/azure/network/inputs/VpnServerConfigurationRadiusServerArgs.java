// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VpnServerConfigurationRadiusServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnServerConfigurationRadiusServerArgs Empty = new VpnServerConfigurationRadiusServerArgs();

    /**
     * The Address of the Radius Server.
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The Address of the Radius Server.
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * The Score of the Radius Server determines the priority of the server. Ranges from 1 to 30.
     * 
     */
    @Import(name="score", required=true)
    private Output<Integer> score;

    /**
     * @return The Score of the Radius Server determines the priority of the server. Ranges from 1 to 30.
     * 
     */
    public Output<Integer> score() {
        return this.score;
    }

    /**
     * The Secret used to communicate with the Radius Server.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    /**
     * @return The Secret used to communicate with the Radius Server.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    private VpnServerConfigurationRadiusServerArgs() {}

    private VpnServerConfigurationRadiusServerArgs(VpnServerConfigurationRadiusServerArgs $) {
        this.address = $.address;
        this.score = $.score;
        this.secret = $.secret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnServerConfigurationRadiusServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnServerConfigurationRadiusServerArgs $;

        public Builder() {
            $ = new VpnServerConfigurationRadiusServerArgs();
        }

        public Builder(VpnServerConfigurationRadiusServerArgs defaults) {
            $ = new VpnServerConfigurationRadiusServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The Address of the Radius Server.
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The Address of the Radius Server.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param score The Score of the Radius Server determines the priority of the server. Ranges from 1 to 30.
         * 
         * @return builder
         * 
         */
        public Builder score(Output<Integer> score) {
            $.score = score;
            return this;
        }

        /**
         * @param score The Score of the Radius Server determines the priority of the server. Ranges from 1 to 30.
         * 
         * @return builder
         * 
         */
        public Builder score(Integer score) {
            return score(Output.of(score));
        }

        /**
         * @param secret The Secret used to communicate with the Radius Server.
         * 
         * @return builder
         * 
         */
        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret The Secret used to communicate with the Radius Server.
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public VpnServerConfigurationRadiusServerArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            $.score = Objects.requireNonNull($.score, "expected parameter 'score' to be non-null");
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}