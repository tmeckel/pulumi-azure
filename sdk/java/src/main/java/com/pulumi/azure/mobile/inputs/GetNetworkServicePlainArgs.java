// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkServicePlainArgs Empty = new GetNetworkServicePlainArgs();

    /**
     * Specifies the ID of the Mobile Network Service.
     * 
     */
    @Import(name="mobileNetworkId", required=true)
    private String mobileNetworkId;

    /**
     * @return Specifies the ID of the Mobile Network Service.
     * 
     */
    public String mobileNetworkId() {
        return this.mobileNetworkId;
    }

    /**
     * Specifies the name which should be used for this Mobile Network Service.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name which should be used for this Mobile Network Service.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetNetworkServicePlainArgs() {}

    private GetNetworkServicePlainArgs(GetNetworkServicePlainArgs $) {
        this.mobileNetworkId = $.mobileNetworkId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkServicePlainArgs $;

        public Builder() {
            $ = new GetNetworkServicePlainArgs();
        }

        public Builder(GetNetworkServicePlainArgs defaults) {
            $ = new GetNetworkServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mobileNetworkId Specifies the ID of the Mobile Network Service.
         * 
         * @return builder
         * 
         */
        public Builder mobileNetworkId(String mobileNetworkId) {
            $.mobileNetworkId = mobileNetworkId;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Mobile Network Service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetNetworkServicePlainArgs build() {
            $.mobileNetworkId = Objects.requireNonNull($.mobileNetworkId, "expected parameter 'mobileNetworkId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}