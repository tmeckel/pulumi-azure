// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.SnapshotEncryptionSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotState extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotState Empty = new SnapshotState();

    /**
     * Indicates how the snapshot is to be created. Possible values are `Copy` or `Import`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="createOption")
    private @Nullable Output<String> createOption;

    /**
     * @return Indicates how the snapshot is to be created. Possible values are `Copy` or `Import`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> createOption() {
        return Optional.ofNullable(this.createOption);
    }

    /**
     * The size of the Snapshotted Disk in GB.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return The size of the Snapshotted Disk in GB.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    @Import(name="encryptionSettings")
    private @Nullable Output<SnapshotEncryptionSettingsArgs> encryptionSettings;

    public Optional<Output<SnapshotEncryptionSettingsArgs>> encryptionSettings() {
        return Optional.ofNullable(this.encryptionSettings);
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
     * Specifies the name of the Snapshot resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Snapshot resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the Snapshot. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Snapshot. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * Specifies a reference to an existing snapshot, when `create_option` is `Copy`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sourceResourceId")
    private @Nullable Output<String> sourceResourceId;

    /**
     * @return Specifies a reference to an existing snapshot, when `create_option` is `Copy`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Specifies the URI to a Managed or Unmanaged Disk. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sourceUri")
    private @Nullable Output<String> sourceUri;

    /**
     * @return Specifies the URI to a Managed or Unmanaged Disk. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sourceUri() {
        return Optional.ofNullable(this.sourceUri);
    }

    /**
     * Specifies the ID of an storage account. Used with `source_uri` to allow authorization during import of unmanaged blobs from a different subscription. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return Specifies the ID of an storage account. Used with `source_uri` to allow authorization during import of unmanaged blobs from a different subscription. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
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

    /**
     * Whether Trusted Launch is enabled for the Snapshot.
     * 
     */
    @Import(name="trustedLaunchEnabled")
    private @Nullable Output<Boolean> trustedLaunchEnabled;

    /**
     * @return Whether Trusted Launch is enabled for the Snapshot.
     * 
     */
    public Optional<Output<Boolean>> trustedLaunchEnabled() {
        return Optional.ofNullable(this.trustedLaunchEnabled);
    }

    private SnapshotState() {}

    private SnapshotState(SnapshotState $) {
        this.createOption = $.createOption;
        this.diskSizeGb = $.diskSizeGb;
        this.encryptionSettings = $.encryptionSettings;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.sourceResourceId = $.sourceResourceId;
        this.sourceUri = $.sourceUri;
        this.storageAccountId = $.storageAccountId;
        this.tags = $.tags;
        this.trustedLaunchEnabled = $.trustedLaunchEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotState $;

        public Builder() {
            $ = new SnapshotState();
        }

        public Builder(SnapshotState defaults) {
            $ = new SnapshotState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createOption Indicates how the snapshot is to be created. Possible values are `Copy` or `Import`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder createOption(@Nullable Output<String> createOption) {
            $.createOption = createOption;
            return this;
        }

        /**
         * @param createOption Indicates how the snapshot is to be created. Possible values are `Copy` or `Import`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder createOption(String createOption) {
            return createOption(Output.of(createOption));
        }

        /**
         * @param diskSizeGb The size of the Snapshotted Disk in GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb The size of the Snapshotted Disk in GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        public Builder encryptionSettings(@Nullable Output<SnapshotEncryptionSettingsArgs> encryptionSettings) {
            $.encryptionSettings = encryptionSettings;
            return this;
        }

        public Builder encryptionSettings(SnapshotEncryptionSettingsArgs encryptionSettings) {
            return encryptionSettings(Output.of(encryptionSettings));
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
         * @param name Specifies the name of the Snapshot resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Snapshot resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Snapshot. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Snapshot. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sourceResourceId Specifies a reference to an existing snapshot, when `create_option` is `Copy`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceResourceId(@Nullable Output<String> sourceResourceId) {
            $.sourceResourceId = sourceResourceId;
            return this;
        }

        /**
         * @param sourceResourceId Specifies a reference to an existing snapshot, when `create_option` is `Copy`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceResourceId(String sourceResourceId) {
            return sourceResourceId(Output.of(sourceResourceId));
        }

        /**
         * @param sourceUri Specifies the URI to a Managed or Unmanaged Disk. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceUri(@Nullable Output<String> sourceUri) {
            $.sourceUri = sourceUri;
            return this;
        }

        /**
         * @param sourceUri Specifies the URI to a Managed or Unmanaged Disk. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceUri(String sourceUri) {
            return sourceUri(Output.of(sourceUri));
        }

        /**
         * @param storageAccountId Specifies the ID of an storage account. Used with `source_uri` to allow authorization during import of unmanaged blobs from a different subscription. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId Specifies the ID of an storage account. Used with `source_uri` to allow authorization during import of unmanaged blobs from a different subscription. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
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

        /**
         * @param trustedLaunchEnabled Whether Trusted Launch is enabled for the Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder trustedLaunchEnabled(@Nullable Output<Boolean> trustedLaunchEnabled) {
            $.trustedLaunchEnabled = trustedLaunchEnabled;
            return this;
        }

        /**
         * @param trustedLaunchEnabled Whether Trusted Launch is enabled for the Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder trustedLaunchEnabled(Boolean trustedLaunchEnabled) {
            return trustedLaunchEnabled(Output.of(trustedLaunchEnabled));
        }

        public SnapshotState build() {
            return $;
        }
    }

}