// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SparkClusterMonitor {
    /**
     * @return The Operations Management Suite (OMS) workspace ID.
     * 
     */
    private String logAnalyticsWorkspaceId;
    /**
     * @return The Operations Management Suite (OMS) workspace key.
     * 
     */
    private String primaryKey;

    private SparkClusterMonitor() {}
    /**
     * @return The Operations Management Suite (OMS) workspace ID.
     * 
     */
    public String logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }
    /**
     * @return The Operations Management Suite (OMS) workspace key.
     * 
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkClusterMonitor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String logAnalyticsWorkspaceId;
        private String primaryKey;
        public Builder() {}
        public Builder(SparkClusterMonitor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logAnalyticsWorkspaceId = defaults.logAnalyticsWorkspaceId;
    	      this.primaryKey = defaults.primaryKey;
        }

        @CustomType.Setter
        public Builder logAnalyticsWorkspaceId(String logAnalyticsWorkspaceId) {
            this.logAnalyticsWorkspaceId = Objects.requireNonNull(logAnalyticsWorkspaceId);
            return this;
        }
        @CustomType.Setter
        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public SparkClusterMonitor build() {
            final var o = new SparkClusterMonitor();
            o.logAnalyticsWorkspaceId = logAnalyticsWorkspaceId;
            o.primaryKey = primaryKey;
            return o;
        }
    }
}