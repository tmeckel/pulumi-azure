// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Compute.Inputs
{

    public sealed class LinuxVirtualMachineOsDiskArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
        /// </summary>
        [Input("caching", required: true)]
        public Input<string> Caching { get; set; } = null!;

        /// <summary>
        /// A `diff_disk_settings` block as defined above.
        /// </summary>
        [Input("diffDiskSettings")]
        public Input<Inputs.LinuxVirtualMachineOsDiskDiffDiskSettingsArgs>? DiffDiskSettings { get; set; }

        /// <summary>
        /// The ID of the Disk Encryption Set which should be used to Encrypt this OS Disk.
        /// </summary>
        [Input("diskEncryptionSetId")]
        public Input<string>? DiskEncryptionSetId { get; set; }

        /// <summary>
        /// The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine is sourced from.
        /// </summary>
        [Input("diskSizeGb")]
        public Input<int>? DiskSizeGb { get; set; }

        /// <summary>
        /// The name which should be used for the Internal OS Disk. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The Type of Storage Account which should back this the Internal OS Disk. Possible values are `Standard_LRS`, `StandardSSD_LRS` and `Premium_LRS`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("storageAccountType", required: true)]
        public Input<string> StorageAccountType { get; set; } = null!;

        /// <summary>
        /// Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
        /// </summary>
        [Input("writeAcceleratorEnabled")]
        public Input<bool>? WriteAcceleratorEnabled { get; set; }

        public LinuxVirtualMachineOsDiskArgs()
        {
        }
    }
}