// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskPoolManagedDiskAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final DiskPoolManagedDiskAttachmentState Empty = new DiskPoolManagedDiskAttachmentState();

    /**
     * The ID of the Disk Pool. Changing this forces a new Disk Pool Managed Disk Attachment to be created.
     * 
     */
    @Import(name="diskPoolId")
    private @Nullable Output<String> diskPoolId;

    /**
     * @return The ID of the Disk Pool. Changing this forces a new Disk Pool Managed Disk Attachment to be created.
     * 
     */
    public Optional<Output<String>> diskPoolId() {
        return Optional.ofNullable(this.diskPoolId);
    }

    /**
     * The ID of the Managed Disk. Changing this forces a new Disks Pool Managed Disk Attachment to be created.
     * 
     */
    @Import(name="managedDiskId")
    private @Nullable Output<String> managedDiskId;

    /**
     * @return The ID of the Managed Disk. Changing this forces a new Disks Pool Managed Disk Attachment to be created.
     * 
     */
    public Optional<Output<String>> managedDiskId() {
        return Optional.ofNullable(this.managedDiskId);
    }

    private DiskPoolManagedDiskAttachmentState() {}

    private DiskPoolManagedDiskAttachmentState(DiskPoolManagedDiskAttachmentState $) {
        this.diskPoolId = $.diskPoolId;
        this.managedDiskId = $.managedDiskId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskPoolManagedDiskAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskPoolManagedDiskAttachmentState $;

        public Builder() {
            $ = new DiskPoolManagedDiskAttachmentState();
        }

        public Builder(DiskPoolManagedDiskAttachmentState defaults) {
            $ = new DiskPoolManagedDiskAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskPoolId The ID of the Disk Pool. Changing this forces a new Disk Pool Managed Disk Attachment to be created.
         * 
         * @return builder
         * 
         */
        public Builder diskPoolId(@Nullable Output<String> diskPoolId) {
            $.diskPoolId = diskPoolId;
            return this;
        }

        /**
         * @param diskPoolId The ID of the Disk Pool. Changing this forces a new Disk Pool Managed Disk Attachment to be created.
         * 
         * @return builder
         * 
         */
        public Builder diskPoolId(String diskPoolId) {
            return diskPoolId(Output.of(diskPoolId));
        }

        /**
         * @param managedDiskId The ID of the Managed Disk. Changing this forces a new Disks Pool Managed Disk Attachment to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskId(@Nullable Output<String> managedDiskId) {
            $.managedDiskId = managedDiskId;
            return this;
        }

        /**
         * @param managedDiskId The ID of the Managed Disk. Changing this forces a new Disks Pool Managed Disk Attachment to be created.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskId(String managedDiskId) {
            return managedDiskId(Output.of(managedDiskId));
        }

        public DiskPoolManagedDiskAttachmentState build() {
            return $;
        }
    }

}