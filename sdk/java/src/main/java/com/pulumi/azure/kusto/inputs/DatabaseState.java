// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseState extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseState Empty = new DatabaseState();

    /**
     * Specifies the name of the Kusto Cluster this database will be added to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return Specifies the name of the Kusto Cluster this database will be added to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * The time the data that should be kept in cache for fast queries as ISO 8601 timespan. Default is unlimited. For more information see: [ISO 8601 Timespan](https://en.wikipedia.org/wiki/ISO_8601#Durations)
     * 
     */
    @Import(name="hotCachePeriod")
    private @Nullable Output<String> hotCachePeriod;

    /**
     * @return The time the data that should be kept in cache for fast queries as ISO 8601 timespan. Default is unlimited. For more information see: [ISO 8601 Timespan](https://en.wikipedia.org/wiki/ISO_8601#Durations)
     * 
     */
    public Optional<Output<String>> hotCachePeriod() {
        return Optional.ofNullable(this.hotCachePeriod);
    }

    /**
     * The location where the Kusto Database should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location where the Kusto Database should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Kusto Database to create. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Kusto Database to create. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The size of the database in bytes.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Double> size;

    /**
     * @return The size of the database in bytes.
     * 
     */
    public Optional<Output<Double>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The time the data should be kept before it stops being accessible to queries as ISO 8601 timespan. Default is unlimited. For more information see: [ISO 8601 Timespan](https://en.wikipedia.org/wiki/ISO_8601#Durations)
     * 
     */
    @Import(name="softDeletePeriod")
    private @Nullable Output<String> softDeletePeriod;

    /**
     * @return The time the data should be kept before it stops being accessible to queries as ISO 8601 timespan. Default is unlimited. For more information see: [ISO 8601 Timespan](https://en.wikipedia.org/wiki/ISO_8601#Durations)
     * 
     */
    public Optional<Output<String>> softDeletePeriod() {
        return Optional.ofNullable(this.softDeletePeriod);
    }

    private DatabaseState() {}

    private DatabaseState(DatabaseState $) {
        this.clusterName = $.clusterName;
        this.hotCachePeriod = $.hotCachePeriod;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.size = $.size;
        this.softDeletePeriod = $.softDeletePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseState $;

        public Builder() {
            $ = new DatabaseState();
        }

        public Builder(DatabaseState defaults) {
            $ = new DatabaseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Specifies the name of the Kusto Cluster this database will be added to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Specifies the name of the Kusto Cluster this database will be added to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param hotCachePeriod The time the data that should be kept in cache for fast queries as ISO 8601 timespan. Default is unlimited. For more information see: [ISO 8601 Timespan](https://en.wikipedia.org/wiki/ISO_8601#Durations)
         * 
         * @return builder
         * 
         */
        public Builder hotCachePeriod(@Nullable Output<String> hotCachePeriod) {
            $.hotCachePeriod = hotCachePeriod;
            return this;
        }

        /**
         * @param hotCachePeriod The time the data that should be kept in cache for fast queries as ISO 8601 timespan. Default is unlimited. For more information see: [ISO 8601 Timespan](https://en.wikipedia.org/wiki/ISO_8601#Durations)
         * 
         * @return builder
         * 
         */
        public Builder hotCachePeriod(String hotCachePeriod) {
            return hotCachePeriod(Output.of(hotCachePeriod));
        }

        /**
         * @param location The location where the Kusto Database should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location where the Kusto Database should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the Kusto Database to create. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Kusto Database to create. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the Resource Group where the Kusto Database should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param size The size of the database in bytes.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Double> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the database in bytes.
         * 
         * @return builder
         * 
         */
        public Builder size(Double size) {
            return size(Output.of(size));
        }

        /**
         * @param softDeletePeriod The time the data should be kept before it stops being accessible to queries as ISO 8601 timespan. Default is unlimited. For more information see: [ISO 8601 Timespan](https://en.wikipedia.org/wiki/ISO_8601#Durations)
         * 
         * @return builder
         * 
         */
        public Builder softDeletePeriod(@Nullable Output<String> softDeletePeriod) {
            $.softDeletePeriod = softDeletePeriod;
            return this;
        }

        /**
         * @param softDeletePeriod The time the data should be kept before it stops being accessible to queries as ISO 8601 timespan. Default is unlimited. For more information see: [ISO 8601 Timespan](https://en.wikipedia.org/wiki/ISO_8601#Durations)
         * 
         * @return builder
         * 
         */
        public Builder softDeletePeriod(String softDeletePeriod) {
            return softDeletePeriod(Output.of(softDeletePeriod));
        }

        public DatabaseState build() {
            return $;
        }
    }

}