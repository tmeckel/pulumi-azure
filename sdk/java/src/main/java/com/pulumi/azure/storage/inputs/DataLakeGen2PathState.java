// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.azure.storage.inputs.DataLakeGen2PathAceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataLakeGen2PathState extends com.pulumi.resources.ResourceArgs {

    public static final DataLakeGen2PathState Empty = new DataLakeGen2PathState();

    /**
     * One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * 
     */
    @Import(name="aces")
    private @Nullable Output<List<DataLakeGen2PathAceArgs>> aces;

    /**
     * @return One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * 
     */
    public Optional<Output<List<DataLakeGen2PathAceArgs>>> aces() {
        return Optional.ofNullable(this.aces);
    }

    /**
     * The name of the Data Lake Gen2 File System which should be created within the Storage Account. Must be unique within the storage account the queue is located. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="filesystemName")
    private @Nullable Output<String> filesystemName;

    /**
     * @return The name of the Data Lake Gen2 File System which should be created within the Storage Account. Must be unique within the storage account the queue is located. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> filesystemName() {
        return Optional.ofNullable(this.filesystemName);
    }

    /**
     * Specifies the Object ID of the Azure Active Directory Group to make the owning group. Possible values also include `$superuser`.
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return Specifies the Object ID of the Azure Active Directory Group to make the owning group. Possible values also include `$superuser`.
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * Specifies the Object ID of the Azure Active Directory User to make the owning user. Possible values also include `$superuser`.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Specifies the Object ID of the Azure Active Directory User to make the owning user. Possible values also include `$superuser`.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * The path which should be created within the Data Lake Gen2 File System in the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path which should be created within the Data Lake Gen2 File System in the Storage Account. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Specifies the type for path to create. Currently only `directory` is supported.
     * 
     */
    @Import(name="resource")
    private @Nullable Output<String> resource;

    /**
     * @return Specifies the type for path to create. Currently only `directory` is supported.
     * 
     */
    public Optional<Output<String>> resource() {
        return Optional.ofNullable(this.resource);
    }

    /**
     * Specifies the ID of the Storage Account in which the Data Lake Gen2 File System should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return Specifies the ID of the Storage Account in which the Data Lake Gen2 File System should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }

    private DataLakeGen2PathState() {}

    private DataLakeGen2PathState(DataLakeGen2PathState $) {
        this.aces = $.aces;
        this.filesystemName = $.filesystemName;
        this.group = $.group;
        this.owner = $.owner;
        this.path = $.path;
        this.resource = $.resource;
        this.storageAccountId = $.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataLakeGen2PathState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataLakeGen2PathState $;

        public Builder() {
            $ = new DataLakeGen2PathState();
        }

        public Builder(DataLakeGen2PathState defaults) {
            $ = new DataLakeGen2PathState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
         * 
         * @return builder
         * 
         */
        public Builder aces(@Nullable Output<List<DataLakeGen2PathAceArgs>> aces) {
            $.aces = aces;
            return this;
        }

        /**
         * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
         * 
         * @return builder
         * 
         */
        public Builder aces(List<DataLakeGen2PathAceArgs> aces) {
            return aces(Output.of(aces));
        }

        /**
         * @param aces One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
         * 
         * @return builder
         * 
         */
        public Builder aces(DataLakeGen2PathAceArgs... aces) {
            return aces(List.of(aces));
        }

        /**
         * @param filesystemName The name of the Data Lake Gen2 File System which should be created within the Storage Account. Must be unique within the storage account the queue is located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder filesystemName(@Nullable Output<String> filesystemName) {
            $.filesystemName = filesystemName;
            return this;
        }

        /**
         * @param filesystemName The name of the Data Lake Gen2 File System which should be created within the Storage Account. Must be unique within the storage account the queue is located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder filesystemName(String filesystemName) {
            return filesystemName(Output.of(filesystemName));
        }

        /**
         * @param group Specifies the Object ID of the Azure Active Directory Group to make the owning group. Possible values also include `$superuser`.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group Specifies the Object ID of the Azure Active Directory Group to make the owning group. Possible values also include `$superuser`.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param owner Specifies the Object ID of the Azure Active Directory User to make the owning user. Possible values also include `$superuser`.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Specifies the Object ID of the Azure Active Directory User to make the owning user. Possible values also include `$superuser`.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param path The path which should be created within the Data Lake Gen2 File System in the Storage Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path which should be created within the Data Lake Gen2 File System in the Storage Account. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param resource Specifies the type for path to create. Currently only `directory` is supported.
         * 
         * @return builder
         * 
         */
        public Builder resource(@Nullable Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource Specifies the type for path to create. Currently only `directory` is supported.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param storageAccountId Specifies the ID of the Storage Account in which the Data Lake Gen2 File System should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId Specifies the ID of the Storage Account in which the Data Lake Gen2 File System should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        public DataLakeGen2PathState build() {
            return $;
        }
    }

}