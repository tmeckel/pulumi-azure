// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.outputs;

import com.pulumi.azure.appconfiguration.outputs.GetConfigurationStorePrimaryReadKey;
import com.pulumi.azure.appconfiguration.outputs.GetConfigurationStorePrimaryWriteKey;
import com.pulumi.azure.appconfiguration.outputs.GetConfigurationStoreSecondaryReadKey;
import com.pulumi.azure.appconfiguration.outputs.GetConfigurationStoreSecondaryWriteKey;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConfigurationStoreResult {
    /**
     * @return The Endpoint used to access this App Configuration.
     * 
     */
    private String endpoint;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region where the App Configuration exists.
     * 
     */
    private String location;
    private String name;
    /**
     * @return A `primary_read_key` block as defined below containing the primary read access key.
     * 
     */
    private List<GetConfigurationStorePrimaryReadKey> primaryReadKeys;
    /**
     * @return A `primary_write_key` block as defined below containing the primary write access key.
     * 
     */
    private List<GetConfigurationStorePrimaryWriteKey> primaryWriteKeys;
    /**
     * @return The Public Network Access setting of this App Configuration.
     * 
     */
    private String publicNetworkAccess;
    private String resourceGroupName;
    /**
     * @return A `secondary_read_key` block as defined below containing the secondary read access key.
     * 
     */
    private List<GetConfigurationStoreSecondaryReadKey> secondaryReadKeys;
    /**
     * @return A `secondary_write_key` block as defined below containing the secondary write access key.
     * 
     */
    private List<GetConfigurationStoreSecondaryWriteKey> secondaryWriteKeys;
    /**
     * @return The name of the SKU used for this App Configuration.
     * 
     */
    private String sku;
    /**
     * @return A mapping of tags assigned to the App Configuration.
     * 
     */
    private Map<String,String> tags;

    private GetConfigurationStoreResult() {}
    /**
     * @return The Endpoint used to access this App Configuration.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region where the App Configuration exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return A `primary_read_key` block as defined below containing the primary read access key.
     * 
     */
    public List<GetConfigurationStorePrimaryReadKey> primaryReadKeys() {
        return this.primaryReadKeys;
    }
    /**
     * @return A `primary_write_key` block as defined below containing the primary write access key.
     * 
     */
    public List<GetConfigurationStorePrimaryWriteKey> primaryWriteKeys() {
        return this.primaryWriteKeys;
    }
    /**
     * @return The Public Network Access setting of this App Configuration.
     * 
     */
    public String publicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A `secondary_read_key` block as defined below containing the secondary read access key.
     * 
     */
    public List<GetConfigurationStoreSecondaryReadKey> secondaryReadKeys() {
        return this.secondaryReadKeys;
    }
    /**
     * @return A `secondary_write_key` block as defined below containing the secondary write access key.
     * 
     */
    public List<GetConfigurationStoreSecondaryWriteKey> secondaryWriteKeys() {
        return this.secondaryWriteKeys;
    }
    /**
     * @return The name of the SKU used for this App Configuration.
     * 
     */
    public String sku() {
        return this.sku;
    }
    /**
     * @return A mapping of tags assigned to the App Configuration.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationStoreResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoint;
        private String id;
        private String location;
        private String name;
        private List<GetConfigurationStorePrimaryReadKey> primaryReadKeys;
        private List<GetConfigurationStorePrimaryWriteKey> primaryWriteKeys;
        private String publicNetworkAccess;
        private String resourceGroupName;
        private List<GetConfigurationStoreSecondaryReadKey> secondaryReadKeys;
        private List<GetConfigurationStoreSecondaryWriteKey> secondaryWriteKeys;
        private String sku;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetConfigurationStoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.primaryReadKeys = defaults.primaryReadKeys;
    	      this.primaryWriteKeys = defaults.primaryWriteKeys;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryReadKeys = defaults.secondaryReadKeys;
    	      this.secondaryWriteKeys = defaults.secondaryWriteKeys;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder primaryReadKeys(List<GetConfigurationStorePrimaryReadKey> primaryReadKeys) {
            this.primaryReadKeys = Objects.requireNonNull(primaryReadKeys);
            return this;
        }
        public Builder primaryReadKeys(GetConfigurationStorePrimaryReadKey... primaryReadKeys) {
            return primaryReadKeys(List.of(primaryReadKeys));
        }
        @CustomType.Setter
        public Builder primaryWriteKeys(List<GetConfigurationStorePrimaryWriteKey> primaryWriteKeys) {
            this.primaryWriteKeys = Objects.requireNonNull(primaryWriteKeys);
            return this;
        }
        public Builder primaryWriteKeys(GetConfigurationStorePrimaryWriteKey... primaryWriteKeys) {
            return primaryWriteKeys(List.of(primaryWriteKeys));
        }
        @CustomType.Setter
        public Builder publicNetworkAccess(String publicNetworkAccess) {
            this.publicNetworkAccess = Objects.requireNonNull(publicNetworkAccess);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryReadKeys(List<GetConfigurationStoreSecondaryReadKey> secondaryReadKeys) {
            this.secondaryReadKeys = Objects.requireNonNull(secondaryReadKeys);
            return this;
        }
        public Builder secondaryReadKeys(GetConfigurationStoreSecondaryReadKey... secondaryReadKeys) {
            return secondaryReadKeys(List.of(secondaryReadKeys));
        }
        @CustomType.Setter
        public Builder secondaryWriteKeys(List<GetConfigurationStoreSecondaryWriteKey> secondaryWriteKeys) {
            this.secondaryWriteKeys = Objects.requireNonNull(secondaryWriteKeys);
            return this;
        }
        public Builder secondaryWriteKeys(GetConfigurationStoreSecondaryWriteKey... secondaryWriteKeys) {
            return secondaryWriteKeys(List.of(secondaryWriteKeys));
        }
        @CustomType.Setter
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetConfigurationStoreResult build() {
            final var o = new GetConfigurationStoreResult();
            o.endpoint = endpoint;
            o.id = id;
            o.location = location;
            o.name = name;
            o.primaryReadKeys = primaryReadKeys;
            o.primaryWriteKeys = primaryWriteKeys;
            o.publicNetworkAccess = publicNetworkAccess;
            o.resourceGroupName = resourceGroupName;
            o.secondaryReadKeys = secondaryReadKeys;
            o.secondaryWriteKeys = secondaryWriteKeys;
            o.sku = sku;
            o.tags = tags;
            return o;
        }
    }
}