// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IotHubDpsSku {
    /**
     * @return The number of provisioned IoT Device Provisioning Service units.
     * 
     */
    private Integer capacity;
    /**
     * @return The name of the sku. Currently can only be set to `S1`.
     * 
     */
    private String name;

    private IotHubDpsSku() {}
    /**
     * @return The number of provisioned IoT Device Provisioning Service units.
     * 
     */
    public Integer capacity() {
        return this.capacity;
    }
    /**
     * @return The name of the sku. Currently can only be set to `S1`.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubDpsSku defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer capacity;
        private String name;
        public Builder() {}
        public Builder(IotHubDpsSku defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder capacity(Integer capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public IotHubDpsSku build() {
            final var o = new IotHubDpsSku();
            o.capacity = capacity;
            o.name = name;
            return o;
        }
    }
}