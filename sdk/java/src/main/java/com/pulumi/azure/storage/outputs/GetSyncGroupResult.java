// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSyncGroupResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    private String storageSyncId;

    private GetSyncGroupResult() {}
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
    public String storageSyncId() {
        return this.storageSyncId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSyncGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private String storageSyncId;
        public Builder() {}
        public Builder(GetSyncGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.storageSyncId = defaults.storageSyncId;
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
        public Builder storageSyncId(String storageSyncId) {
            this.storageSyncId = Objects.requireNonNull(storageSyncId);
            return this;
        }
        public GetSyncGroupResult build() {
            final var o = new GetSyncGroupResult();
            o.id = id;
            o.name = name;
            o.storageSyncId = storageSyncId;
            return o;
        }
    }
}