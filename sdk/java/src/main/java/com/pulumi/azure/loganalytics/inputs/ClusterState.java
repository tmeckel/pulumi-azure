// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics.inputs;

import com.pulumi.azure.loganalytics.inputs.ClusterIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * The GUID of the cluster.
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The GUID of the cluster.
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * An `identity` block as defined below. Changing this forces a new Log Analytics Cluster to be created.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ClusterIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new Log Analytics Cluster to be created.
     * 
     */
    public Optional<Output<ClusterIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The Azure Region where the Log Analytics Cluster should exist. Changing this forces a new Log Analytics Cluster to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Log Analytics Cluster should exist. Changing this forces a new Log Analytics Cluster to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Log Analytics Cluster. Changing this forces a new Log Analytics Cluster to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Log Analytics Cluster. Changing this forces a new Log Analytics Cluster to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Log Analytics Cluster should exist. Changing this forces a new Log Analytics Cluster to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Log Analytics Cluster should exist. Changing this forces a new Log Analytics Cluster to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The capacity of the Log Analytics Cluster is specified in GB/day. Possible values include `500`, `1000`, `2000` or `5000`. Defaults to `1000`.
     * 
     */
    @Import(name="sizeGb")
    private @Nullable Output<Integer> sizeGb;

    /**
     * @return The capacity of the Log Analytics Cluster is specified in GB/day. Possible values include `500`, `1000`, `2000` or `5000`. Defaults to `1000`.
     * 
     */
    public Optional<Output<Integer>> sizeGb() {
        return Optional.ofNullable(this.sizeGb);
    }

    /**
     * A mapping of tags which should be assigned to the Log Analytics Cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Log Analytics Cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ClusterState() {}

    private ClusterState(ClusterState $) {
        this.clusterId = $.clusterId;
        this.identity = $.identity;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.sizeGb = $.sizeGb;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterState $;

        public Builder() {
            $ = new ClusterState();
        }

        public Builder(ClusterState defaults) {
            $ = new ClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The GUID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The GUID of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Log Analytics Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ClusterIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Log Analytics Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(ClusterIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location The Azure Region where the Log Analytics Cluster should exist. Changing this forces a new Log Analytics Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Log Analytics Cluster should exist. Changing this forces a new Log Analytics Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Log Analytics Cluster. Changing this forces a new Log Analytics Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Log Analytics Cluster. Changing this forces a new Log Analytics Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Cluster should exist. Changing this forces a new Log Analytics Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Cluster should exist. Changing this forces a new Log Analytics Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sizeGb The capacity of the Log Analytics Cluster is specified in GB/day. Possible values include `500`, `1000`, `2000` or `5000`. Defaults to `1000`.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(@Nullable Output<Integer> sizeGb) {
            $.sizeGb = sizeGb;
            return this;
        }

        /**
         * @param sizeGb The capacity of the Log Analytics Cluster is specified in GB/day. Possible values include `500`, `1000`, `2000` or `5000`. Defaults to `1000`.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(Integer sizeGb) {
            return sizeGb(Output.of(sizeGb));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Log Analytics Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Log Analytics Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ClusterState build() {
            return $;
        }
    }

}