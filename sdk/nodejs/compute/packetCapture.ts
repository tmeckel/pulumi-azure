// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Configures Network Packet Capturing against a Virtual Machine using a Network Watcher.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleNetworkWatcher = new azure.network.NetworkWatcher("exampleNetworkWatcher", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("exampleVirtualNetwork", {
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const exampleSubnet = new azure.network.Subnet("exampleSubnet", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.2.0/24"],
 * });
 * const exampleNetworkInterface = new azure.network.NetworkInterface("exampleNetworkInterface", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     ipConfigurations: [{
 *         name: "testconfiguration1",
 *         subnetId: exampleSubnet.id,
 *         privateIpAddressAllocation: "Dynamic",
 *     }],
 * });
 * const exampleVirtualMachine = new azure.compute.VirtualMachine("exampleVirtualMachine", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkInterfaceIds: [exampleNetworkInterface.id],
 *     vmSize: "Standard_F2",
 *     storageImageReference: {
 *         publisher: "Canonical",
 *         offer: "UbuntuServer",
 *         sku: "16.04-LTS",
 *         version: "latest",
 *     },
 *     storageOsDisk: {
 *         name: "osdisk",
 *         caching: "ReadWrite",
 *         createOption: "FromImage",
 *         managedDiskType: "Standard_LRS",
 *     },
 *     osProfile: {
 *         computerName: "pctest-vm",
 *         adminUsername: "testadmin",
 *         adminPassword: "Password1234!",
 *     },
 *     osProfileLinuxConfig: {
 *         disablePasswordAuthentication: false,
 *     },
 * });
 * const exampleExtension = new azure.compute.Extension("exampleExtension", {
 *     virtualMachineId: exampleVirtualMachine.id,
 *     publisher: "Microsoft.Azure.NetworkWatcher",
 *     type: "NetworkWatcherAgentLinux",
 *     typeHandlerVersion: "1.4",
 *     autoUpgradeMinorVersion: true,
 * });
 * const exampleAccount = new azure.storage.Account("exampleAccount", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const examplePacketCapture = new azure.compute.PacketCapture("examplePacketCapture", {
 *     networkWatcherId: exampleNetworkWatcher.id,
 *     virtualMachineId: exampleVirtualMachine.id,
 *     storageLocation: {
 *         storageAccountId: exampleAccount.id,
 *     },
 * }, {
 *     dependsOn: [exampleExtension],
 * });
 * ```
 *
 * > **NOTE:** This Resource requires that [the Network Watcher Virtual Machine Extension](https://docs.microsoft.com/azure/network-watcher/network-watcher-packet-capture-manage-portal#before-you-begin) is installed on the Virtual Machine before capturing can be enabled which can be installed via the `azure.compute.Extension` resource.
 *
 * ## Import
 *
 * Virtual Machine Packet Captures can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:compute/packetCapture:PacketCapture capture1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/networkWatchers/watcher1/packetCaptures/capture1
 * ```
 */
export class PacketCapture extends pulumi.CustomResource {
    /**
     * Get an existing PacketCapture resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PacketCaptureState, opts?: pulumi.CustomResourceOptions): PacketCapture {
        return new PacketCapture(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:compute/packetCapture:PacketCapture';

    /**
     * Returns true if the given object is an instance of PacketCapture.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PacketCapture {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PacketCapture.__pulumiType;
    }

    /**
     * One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     */
    public readonly filters!: pulumi.Output<outputs.compute.PacketCaptureFilter[] | undefined>;
    /**
     * The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     */
    public readonly maximumBytesPerPacket!: pulumi.Output<number | undefined>;
    /**
     * Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     */
    public readonly maximumBytesPerSession!: pulumi.Output<number | undefined>;
    /**
     * The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     */
    public readonly maximumCaptureDurationInSeconds!: pulumi.Output<number | undefined>;
    /**
     * The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     */
    public readonly networkWatcherId!: pulumi.Output<string>;
    /**
     * A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     */
    public readonly storageLocation!: pulumi.Output<outputs.compute.PacketCaptureStorageLocation>;
    /**
     * The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
     */
    public readonly virtualMachineId!: pulumi.Output<string>;

    /**
     * Create a PacketCapture resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PacketCaptureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PacketCaptureArgs | PacketCaptureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PacketCaptureState | undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["maximumBytesPerPacket"] = state ? state.maximumBytesPerPacket : undefined;
            resourceInputs["maximumBytesPerSession"] = state ? state.maximumBytesPerSession : undefined;
            resourceInputs["maximumCaptureDurationInSeconds"] = state ? state.maximumCaptureDurationInSeconds : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkWatcherId"] = state ? state.networkWatcherId : undefined;
            resourceInputs["storageLocation"] = state ? state.storageLocation : undefined;
            resourceInputs["virtualMachineId"] = state ? state.virtualMachineId : undefined;
        } else {
            const args = argsOrState as PacketCaptureArgs | undefined;
            if ((!args || args.networkWatcherId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkWatcherId'");
            }
            if ((!args || args.storageLocation === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageLocation'");
            }
            if ((!args || args.virtualMachineId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'virtualMachineId'");
            }
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["maximumBytesPerPacket"] = args ? args.maximumBytesPerPacket : undefined;
            resourceInputs["maximumBytesPerSession"] = args ? args.maximumBytesPerSession : undefined;
            resourceInputs["maximumCaptureDurationInSeconds"] = args ? args.maximumCaptureDurationInSeconds : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkWatcherId"] = args ? args.networkWatcherId : undefined;
            resourceInputs["storageLocation"] = args ? args.storageLocation : undefined;
            resourceInputs["virtualMachineId"] = args ? args.virtualMachineId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PacketCapture.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PacketCapture resources.
 */
export interface PacketCaptureState {
    /**
     * One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.compute.PacketCaptureFilter>[]>;
    /**
     * The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     */
    maximumBytesPerPacket?: pulumi.Input<number>;
    /**
     * Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     */
    maximumBytesPerSession?: pulumi.Input<number>;
    /**
     * The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     */
    maximumCaptureDurationInSeconds?: pulumi.Input<number>;
    /**
     * The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     */
    networkWatcherId?: pulumi.Input<string>;
    /**
     * A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     */
    storageLocation?: pulumi.Input<inputs.compute.PacketCaptureStorageLocation>;
    /**
     * The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
     */
    virtualMachineId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PacketCapture resource.
 */
export interface PacketCaptureArgs {
    /**
     * One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.compute.PacketCaptureFilter>[]>;
    /**
     * The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     */
    maximumBytesPerPacket?: pulumi.Input<number>;
    /**
     * Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     */
    maximumBytesPerSession?: pulumi.Input<number>;
    /**
     * The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     */
    maximumCaptureDurationInSeconds?: pulumi.Input<number>;
    /**
     * The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     */
    networkWatcherId: pulumi.Input<string>;
    /**
     * A `storageLocation` block as defined below. Changing this forces a new resource to be created.
     */
    storageLocation: pulumi.Input<inputs.compute.PacketCaptureStorageLocation>;
    /**
     * The resource ID of the target Virtual Machine to capture packets from. Changing this forces a new resource to be created.
     */
    virtualMachineId: pulumi.Input<string>;
}