// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayLocationData {
    /**
     * @return The city or locality where the resource is located.
     * 
     */
    private String city;
    /**
     * @return The district, state, or province where the resource is located.
     * 
     */
    private String district;
    /**
     * @return The name of the API Management Gateway.
     * 
     */
    private String name;
    private String region;

    private GetGatewayLocationData() {}
    /**
     * @return The city or locality where the resource is located.
     * 
     */
    public String city() {
        return this.city;
    }
    /**
     * @return The district, state, or province where the resource is located.
     * 
     */
    public String district() {
        return this.district;
    }
    /**
     * @return The name of the API Management Gateway.
     * 
     */
    public String name() {
        return this.name;
    }
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayLocationData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String city;
        private String district;
        private String name;
        private String region;
        public Builder() {}
        public Builder(GetGatewayLocationData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.district = defaults.district;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        @CustomType.Setter
        public Builder district(String district) {
            this.district = Objects.requireNonNull(district);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetGatewayLocationData build() {
            final var o = new GetGatewayLocationData();
            o.city = city;
            o.district = district;
            o.name = name;
            o.region = region;
            return o;
        }
    }
}