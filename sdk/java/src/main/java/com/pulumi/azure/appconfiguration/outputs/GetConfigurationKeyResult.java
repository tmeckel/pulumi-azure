// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConfigurationKeyResult {
    private String configurationStoreId;
    /**
     * @return The content type of the App Configuration Key.
     * 
     */
    private String contentType;
    /**
     * @return The ETag of the key.
     * 
     */
    private String etag;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String key;
    private @Nullable String label;
    /**
     * @return Is this App Configuration Key be Locked to prevent changes.
     * 
     */
    private Boolean locked;
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The type of the App Configuration Key. It can either be `kv` (simple [key/value](https://docs.microsoft.com/azure/azure-app-configuration/concept-key-value)) or `vault` (where the value is a reference to a [Key Vault Secret](https://azure.microsoft.com/en-gb/services/key-vault/).
     * 
     */
    private String type;
    /**
     * @return The value of the App Configuration Key.
     * 
     */
    private String value;
    /**
     * @return The ID of the vault secret this App Configuration Key refers to, when `type` is `vault`.
     * 
     */
    private String vaultKeyReference;

    private GetConfigurationKeyResult() {}
    public String configurationStoreId() {
        return this.configurationStoreId;
    }
    /**
     * @return The content type of the App Configuration Key.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return The ETag of the key.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String key() {
        return this.key;
    }
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return Is this App Configuration Key be Locked to prevent changes.
     * 
     */
    public Boolean locked() {
        return this.locked;
    }
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The type of the App Configuration Key. It can either be `kv` (simple [key/value](https://docs.microsoft.com/azure/azure-app-configuration/concept-key-value)) or `vault` (where the value is a reference to a [Key Vault Secret](https://azure.microsoft.com/en-gb/services/key-vault/).
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The value of the App Configuration Key.
     * 
     */
    public String value() {
        return this.value;
    }
    /**
     * @return The ID of the vault secret this App Configuration Key refers to, when `type` is `vault`.
     * 
     */
    public String vaultKeyReference() {
        return this.vaultKeyReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationKeyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String configurationStoreId;
        private String contentType;
        private String etag;
        private String id;
        private String key;
        private @Nullable String label;
        private Boolean locked;
        private Map<String,String> tags;
        private String type;
        private String value;
        private String vaultKeyReference;
        public Builder() {}
        public Builder(GetConfigurationKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationStoreId = defaults.configurationStoreId;
    	      this.contentType = defaults.contentType;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.label = defaults.label;
    	      this.locked = defaults.locked;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
    	      this.vaultKeyReference = defaults.vaultKeyReference;
        }

        @CustomType.Setter
        public Builder configurationStoreId(String configurationStoreId) {
            this.configurationStoreId = Objects.requireNonNull(configurationStoreId);
            return this;
        }
        @CustomType.Setter
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder locked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        @CustomType.Setter
        public Builder vaultKeyReference(String vaultKeyReference) {
            this.vaultKeyReference = Objects.requireNonNull(vaultKeyReference);
            return this;
        }
        public GetConfigurationKeyResult build() {
            final var o = new GetConfigurationKeyResult();
            o.configurationStoreId = configurationStoreId;
            o.contentType = contentType;
            o.etag = etag;
            o.id = id;
            o.key = key;
            o.label = label;
            o.locked = locked;
            o.tags = tags;
            o.type = type;
            o.value = value;
            o.vaultKeyReference = vaultKeyReference;
            return o;
        }
    }
}