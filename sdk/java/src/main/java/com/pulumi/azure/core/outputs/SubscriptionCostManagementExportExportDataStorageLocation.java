// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SubscriptionCostManagementExportExportDataStorageLocation {
    /**
     * @return The Resource Manager ID of the container where exports will be uploaded.
     * 
     */
    private String containerId;
    /**
     * @return The path of the directory where exports will be uploaded.
     * 
     */
    private String rootFolderPath;

    private SubscriptionCostManagementExportExportDataStorageLocation() {}
    /**
     * @return The Resource Manager ID of the container where exports will be uploaded.
     * 
     */
    public String containerId() {
        return this.containerId;
    }
    /**
     * @return The path of the directory where exports will be uploaded.
     * 
     */
    public String rootFolderPath() {
        return this.rootFolderPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionCostManagementExportExportDataStorageLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String containerId;
        private String rootFolderPath;
        public Builder() {}
        public Builder(SubscriptionCostManagementExportExportDataStorageLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerId = defaults.containerId;
    	      this.rootFolderPath = defaults.rootFolderPath;
        }

        @CustomType.Setter
        public Builder containerId(String containerId) {
            this.containerId = Objects.requireNonNull(containerId);
            return this;
        }
        @CustomType.Setter
        public Builder rootFolderPath(String rootFolderPath) {
            this.rootFolderPath = Objects.requireNonNull(rootFolderPath);
            return this;
        }
        public SubscriptionCostManagementExportExportDataStorageLocation build() {
            final var o = new SubscriptionCostManagementExportExportDataStorageLocation();
            o.containerId = containerId;
            o.rootFolderPath = rootFolderPath;
            return o;
        }
    }
}