// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    /**
     * @return The primary key used to authenticate and authorize access to the Maps REST APIs.
     * 
     */
    private String primaryAccessKey;
    private String resourceGroupName;
    /**
     * @return The primary key used to authenticate and authorize access to the Maps REST APIs. The second key is given to provide seamless key regeneration.
     * 
     */
    private String secondaryAccessKey;
    /**
     * @return The SKU of the Azure Maps Account.
     * 
     */
    private String skuName;
    private @Nullable Map<String,String> tags;
    /**
     * @return A unique identifier for the Maps Account.
     * 
     */
    private String xMsClientId;

    private GetAccountResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The primary key used to authenticate and authorize access to the Maps REST APIs.
     * 
     */
    public String primaryAccessKey() {
        return this.primaryAccessKey;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The primary key used to authenticate and authorize access to the Maps REST APIs. The second key is given to provide seamless key regeneration.
     * 
     */
    public String secondaryAccessKey() {
        return this.secondaryAccessKey;
    }
    /**
     * @return The SKU of the Azure Maps Account.
     * 
     */
    public String skuName() {
        return this.skuName;
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return A unique identifier for the Maps Account.
     * 
     */
    public String xMsClientId() {
        return this.xMsClientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String primaryAccessKey;
        private String resourceGroupName;
        private String secondaryAccessKey;
        private String skuName;
        private @Nullable Map<String,String> tags;
        private String xMsClientId;
        public Builder() {}
        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.primaryAccessKey = defaults.primaryAccessKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryAccessKey = defaults.secondaryAccessKey;
    	      this.skuName = defaults.skuName;
    	      this.tags = defaults.tags;
    	      this.xMsClientId = defaults.xMsClientId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder primaryAccessKey(String primaryAccessKey) {
            this.primaryAccessKey = Objects.requireNonNull(primaryAccessKey);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryAccessKey(String secondaryAccessKey) {
            this.secondaryAccessKey = Objects.requireNonNull(secondaryAccessKey);
            return this;
        }
        @CustomType.Setter
        public Builder skuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder xMsClientId(String xMsClientId) {
            this.xMsClientId = Objects.requireNonNull(xMsClientId);
            return this;
        }
        public GetAccountResult build() {
            final var o = new GetAccountResult();
            o.id = id;
            o.name = name;
            o.primaryAccessKey = primaryAccessKey;
            o.resourceGroupName = resourceGroupName;
            o.secondaryAccessKey = secondaryAccessKey;
            o.skuName = skuName;
            o.tags = tags;
            o.xMsClientId = xMsClientId;
            return o;
        }
    }
}