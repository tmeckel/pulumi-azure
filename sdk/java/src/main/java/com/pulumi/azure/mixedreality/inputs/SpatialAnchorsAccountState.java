// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mixedreality.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpatialAnchorsAccountState extends com.pulumi.resources.ResourceArgs {

    public static final SpatialAnchorsAccountState Empty = new SpatialAnchorsAccountState();

    /**
     * The domain of the Spatial Anchors Account.
     * 
     */
    @Import(name="accountDomain")
    private @Nullable Output<String> accountDomain;

    /**
     * @return The domain of the Spatial Anchors Account.
     * 
     */
    public Optional<Output<String>> accountDomain() {
        return Optional.ofNullable(this.accountDomain);
    }

    /**
     * The account ID of the Spatial Anchors Account.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account ID of the Spatial Anchors Account.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the Spatial Anchors Account.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Spatial Anchors Account.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SpatialAnchorsAccountState() {}

    private SpatialAnchorsAccountState(SpatialAnchorsAccountState $) {
        this.accountDomain = $.accountDomain;
        this.accountId = $.accountId;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpatialAnchorsAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpatialAnchorsAccountState $;

        public Builder() {
            $ = new SpatialAnchorsAccountState();
        }

        public Builder(SpatialAnchorsAccountState defaults) {
            $ = new SpatialAnchorsAccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountDomain The domain of the Spatial Anchors Account.
         * 
         * @return builder
         * 
         */
        public Builder accountDomain(@Nullable Output<String> accountDomain) {
            $.accountDomain = accountDomain;
            return this;
        }

        /**
         * @param accountDomain The domain of the Spatial Anchors Account.
         * 
         * @return builder
         * 
         */
        public Builder accountDomain(String accountDomain) {
            return accountDomain(Output.of(accountDomain));
        }

        /**
         * @param accountId The account ID of the Spatial Anchors Account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account ID of the Spatial Anchors Account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Spatial Anchors Account. Changing this forces a new resource to be created. Must be globally unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Spatial Anchors Account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Spatial Anchors Account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SpatialAnchorsAccountState build() {
            return $;
        }
    }

}