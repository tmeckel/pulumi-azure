// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SlotStorageAccount {
    /**
     * @return The access key for the storage account.
     * 
     */
    private String accessKey;
    /**
     * @return The name of the storage account.
     * 
     */
    private String accountName;
    /**
     * @return The path to mount the storage within the site&#39;s runtime environment.
     * 
     */
    private @Nullable String mountPath;
    /**
     * @return The name of the storage account identifier.
     * 
     */
    private String name;
    /**
     * @return The name of the file share (container name, for Blob storage).
     * 
     */
    private String shareName;
    /**
     * @return The type of storage. Possible values are `AzureBlob` and `AzureFiles`.
     * 
     */
    private String type;

    private SlotStorageAccount() {}
    /**
     * @return The access key for the storage account.
     * 
     */
    public String accessKey() {
        return this.accessKey;
    }
    /**
     * @return The name of the storage account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The path to mount the storage within the site&#39;s runtime environment.
     * 
     */
    public Optional<String> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }
    /**
     * @return The name of the storage account identifier.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the file share (container name, for Blob storage).
     * 
     */
    public String shareName() {
        return this.shareName;
    }
    /**
     * @return The type of storage. Possible values are `AzureBlob` and `AzureFiles`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlotStorageAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private String accountName;
        private @Nullable String mountPath;
        private String name;
        private String shareName;
        private String type;
        public Builder() {}
        public Builder(SlotStorageAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accountName = defaults.accountName;
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.shareName = defaults.shareName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            this.accessKey = Objects.requireNonNull(accessKey);
            return this;
        }
        @CustomType.Setter
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        @CustomType.Setter
        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder shareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SlotStorageAccount build() {
            final var o = new SlotStorageAccount();
            o.accessKey = accessKey;
            o.accountName = accountName;
            o.mountPath = mountPath;
            o.name = name;
            o.shareName = shareName;
            o.type = type;
            return o;
        }
    }
}