// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationRuntimeAzureState extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeAzureState Empty = new IntegrationRuntimeAzureState();

    /**
     * Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
     * 
     */
    @Import(name="computeType")
    private @Nullable Output<String> computeType;

    /**
     * @return Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
     * 
     */
    public Optional<Output<String>> computeType() {
        return Optional.ofNullable(this.computeType);
    }

    /**
     * Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
     * 
     */
    @Import(name="coreCount")
    private @Nullable Output<Integer> coreCount;

    /**
     * @return Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
     * 
     */
    public Optional<Output<Integer>> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }

    /**
     * Integration runtime description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Integration runtime description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
     * 
     */
    @Import(name="synapseWorkspaceId")
    private @Nullable Output<String> synapseWorkspaceId;

    /**
     * @return The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
     * 
     */
    public Optional<Output<String>> synapseWorkspaceId() {
        return Optional.ofNullable(this.synapseWorkspaceId);
    }

    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
     * 
     */
    @Import(name="timeToLiveMin")
    private @Nullable Output<Integer> timeToLiveMin;

    /**
     * @return Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
     * 
     */
    public Optional<Output<Integer>> timeToLiveMin() {
        return Optional.ofNullable(this.timeToLiveMin);
    }

    private IntegrationRuntimeAzureState() {}

    private IntegrationRuntimeAzureState(IntegrationRuntimeAzureState $) {
        this.computeType = $.computeType;
        this.coreCount = $.coreCount;
        this.description = $.description;
        this.location = $.location;
        this.name = $.name;
        this.synapseWorkspaceId = $.synapseWorkspaceId;
        this.timeToLiveMin = $.timeToLiveMin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeAzureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeAzureState $;

        public Builder() {
            $ = new IntegrationRuntimeAzureState();
        }

        public Builder(IntegrationRuntimeAzureState defaults) {
            $ = new IntegrationRuntimeAzureState(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeType Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
         * 
         * @return builder
         * 
         */
        public Builder computeType(@Nullable Output<String> computeType) {
            $.computeType = computeType;
            return this;
        }

        /**
         * @param computeType Compute type of the cluster which will execute data flow job. Valid values are `General`, `ComputeOptimized` and `MemoryOptimized`. Defaults to `General`.
         * 
         * @return builder
         * 
         */
        public Builder computeType(String computeType) {
            return computeType(Output.of(computeType));
        }

        /**
         * @param coreCount Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
         * 
         * @return builder
         * 
         */
        public Builder coreCount(@Nullable Output<Integer> coreCount) {
            $.coreCount = coreCount;
            return this;
        }

        /**
         * @param coreCount Core count of the cluster which will execute data flow job. Valid values are `8`, `16`, `32`, `48`, `80`, `144` and `272`. Defaults to `8`.
         * 
         * @return builder
         * 
         */
        public Builder coreCount(Integer coreCount) {
            return coreCount(Output.of(coreCount));
        }

        /**
         * @param description Integration runtime description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Integration runtime description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param location The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the Synapse Azure Integration Runtime should exist. Use `AutoResolve` to create an auto-resolve integration runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Synapse Azure Integration Runtime. Changing this forces a new Synapse Azure Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param synapseWorkspaceId The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(@Nullable Output<String> synapseWorkspaceId) {
            $.synapseWorkspaceId = synapseWorkspaceId;
            return this;
        }

        /**
         * @param synapseWorkspaceId The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Azure Integration Runtime to be created.
         * 
         * @return builder
         * 
         */
        public Builder synapseWorkspaceId(String synapseWorkspaceId) {
            return synapseWorkspaceId(Output.of(synapseWorkspaceId));
        }

        /**
         * @param timeToLiveMin Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder timeToLiveMin(@Nullable Output<Integer> timeToLiveMin) {
            $.timeToLiveMin = timeToLiveMin;
            return this;
        }

        /**
         * @param timeToLiveMin Time to live (in minutes) setting of the cluster which will execute data flow job. Defaults to `0`.
         * 
         * @return builder
         * 
         */
        public Builder timeToLiveMin(Integer timeToLiveMin) {
            return timeToLiveMin(Output.of(timeToLiveMin));
        }

        public IntegrationRuntimeAzureState build() {
            return $;
        }
    }

}