// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.ScaleSetPacketCaptureArgs;
import com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureState;
import com.pulumi.azure.compute.outputs.ScaleSetPacketCaptureFilter;
import com.pulumi.azure.compute.outputs.ScaleSetPacketCaptureMachineScope;
import com.pulumi.azure.compute.outputs.ScaleSetPacketCaptureStorageLocation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Configures Network Packet Capturing against a Virtual Machine Scale Set using a Network Watcher.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.network.NetworkWatcher;
 * import com.pulumi.azure.network.NetworkWatcherArgs;
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.compute.LinuxVirtualMachineScaleSet;
 * import com.pulumi.azure.compute.LinuxVirtualMachineScaleSetArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetSourceImageReferenceArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetOsDiskArgs;
 * import com.pulumi.azure.compute.inputs.LinuxVirtualMachineScaleSetNetworkInterfaceArgs;
 * import com.pulumi.azure.compute.VirtualMachineScaleSetExtension;
 * import com.pulumi.azure.compute.VirtualMachineScaleSetExtensionArgs;
 * import com.pulumi.azure.compute.ScaleSetPacketCapture;
 * import com.pulumi.azure.compute.ScaleSetPacketCaptureArgs;
 * import com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureStorageLocationArgs;
 * import com.pulumi.azure.compute.inputs.ScaleSetPacketCaptureMachineScopeArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleNetworkWatcher = new NetworkWatcher(&#34;exampleNetworkWatcher&#34;, NetworkWatcherArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var exampleLinuxVirtualMachineScaleSet = new LinuxVirtualMachineScaleSet(&#34;exampleLinuxVirtualMachineScaleSet&#34;, LinuxVirtualMachineScaleSetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .sku(&#34;Standard_F2&#34;)
 *             .instances(4)
 *             .adminUsername(&#34;adminuser&#34;)
 *             .adminPassword(&#34;P@ssword1234!&#34;)
 *             .computerNamePrefix(&#34;my-linux-computer-name-prefix&#34;)
 *             .upgradeMode(&#34;Automatic&#34;)
 *             .disablePasswordAuthentication(false)
 *             .sourceImageReference(LinuxVirtualMachineScaleSetSourceImageReferenceArgs.builder()
 *                 .publisher(&#34;Canonical&#34;)
 *                 .offer(&#34;UbuntuServer&#34;)
 *                 .sku(&#34;16.04-LTS&#34;)
 *                 .version(&#34;latest&#34;)
 *                 .build())
 *             .osDisk(LinuxVirtualMachineScaleSetOsDiskArgs.builder()
 *                 .storageAccountType(&#34;Standard_LRS&#34;)
 *                 .caching(&#34;ReadWrite&#34;)
 *                 .build())
 *             .networkInterfaces(LinuxVirtualMachineScaleSetNetworkInterfaceArgs.builder()
 *                 .name(&#34;example&#34;)
 *                 .primary(true)
 *                 .ipConfigurations(LinuxVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs.builder()
 *                     .name(&#34;internal&#34;)
 *                     .primary(true)
 *                     .subnetId(exampleSubnet.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleVirtualMachineScaleSetExtension = new VirtualMachineScaleSetExtension(&#34;exampleVirtualMachineScaleSetExtension&#34;, VirtualMachineScaleSetExtensionArgs.builder()        
 *             .virtualMachineScaleSetId(exampleLinuxVirtualMachineScaleSet.id())
 *             .publisher(&#34;Microsoft.Azure.NetworkWatcher&#34;)
 *             .type(&#34;NetworkWatcherAgentLinux&#34;)
 *             .typeHandlerVersion(&#34;1.4&#34;)
 *             .autoUpgradeMinorVersion(true)
 *             .automaticUpgradeEnabled(true)
 *             .build());
 * 
 *         var exampleScaleSetPacketCapture = new ScaleSetPacketCapture(&#34;exampleScaleSetPacketCapture&#34;, ScaleSetPacketCaptureArgs.builder()        
 *             .networkWatcherId(exampleNetworkWatcher.id())
 *             .virtualMachineScaleSetId(exampleLinuxVirtualMachineScaleSet.id())
 *             .storageLocation(ScaleSetPacketCaptureStorageLocationArgs.builder()
 *                 .filePath(&#34;/var/captures/packet.cap&#34;)
 *                 .build())
 *             .machineScope(ScaleSetPacketCaptureMachineScopeArgs.builder()
 *                 .includeInstanceIds(&#34;0&#34;)
 *                 .excludeInstanceIds(&#34;1&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleVirtualMachineScaleSetExtension)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * &gt; **NOTE:** This Resource requires that [the Network Watcher Extension](https://docs.microsoft.com/azure/network-watcher/network-watcher-packet-capture-manage-portal#before-you-begin) is installed on the Virtual Machine Scale Set before capturing can be enabled which can be installed via the `azure.compute.VirtualMachineScaleSetExtension` resource.
 * 
 * ## Import
 * 
 * Virtual Machine Scale Set Packet Captures can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/scaleSetPacketCapture:ScaleSetPacketCapture capture1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/networkWatchers/watcher1/packetCaptures/capture1
 * ```
 * 
 */
@ResourceType(type="azure:compute/scaleSetPacketCapture:ScaleSetPacketCapture")
public class ScaleSetPacketCapture extends com.pulumi.resources.CustomResource {
    /**
     * One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="filters", type=List.class, parameters={ScaleSetPacketCaptureFilter.class})
    private Output</* @Nullable */ List<ScaleSetPacketCaptureFilter>> filters;

    /**
     * @return One or more `filter` blocks as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<List<ScaleSetPacketCaptureFilter>>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * A `machine_scope` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="machineScope", type=ScaleSetPacketCaptureMachineScope.class, parameters={})
    private Output</* @Nullable */ ScaleSetPacketCaptureMachineScope> machineScope;

    /**
     * @return A `machine_scope` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<ScaleSetPacketCaptureMachineScope>> machineScope() {
        return Codegen.optional(this.machineScope);
    }
    /**
     * The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maximumBytesPerPacket", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumBytesPerPacket;

    /**
     * @return The number of bytes captured per packet. The remaining bytes are truncated. Defaults to `0` (Entire Packet Captured). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> maximumBytesPerPacket() {
        return Codegen.optional(this.maximumBytesPerPacket);
    }
    /**
     * Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maximumBytesPerSession", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumBytesPerSession;

    /**
     * @return Maximum size of the capture in Bytes. Defaults to `1073741824` (1GB). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> maximumBytesPerSession() {
        return Codegen.optional(this.maximumBytesPerSession);
    }
    /**
     * The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="maximumCaptureDurationInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumCaptureDurationInSeconds;

    /**
     * @return The maximum duration of the capture session in seconds. Defaults to `18000` (5 hours). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> maximumCaptureDurationInSeconds() {
        return Codegen.optional(this.maximumCaptureDurationInSeconds);
    }
    /**
     * The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name to use for this Network Packet Capture. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="networkWatcherId", type=String.class, parameters={})
    private Output<String> networkWatcherId;

    /**
     * @return The resource ID of the Network Watcher. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> networkWatcherId() {
        return this.networkWatcherId;
    }
    /**
     * A `storage_location` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageLocation", type=ScaleSetPacketCaptureStorageLocation.class, parameters={})
    private Output<ScaleSetPacketCaptureStorageLocation> storageLocation;

    /**
     * @return A `storage_location` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<ScaleSetPacketCaptureStorageLocation> storageLocation() {
        return this.storageLocation;
    }
    /**
     * The resource ID of the Virtual Machine Scale Set to capture packets from. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualMachineScaleSetId", type=String.class, parameters={})
    private Output<String> virtualMachineScaleSetId;

    /**
     * @return The resource ID of the Virtual Machine Scale Set to capture packets from. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualMachineScaleSetId() {
        return this.virtualMachineScaleSetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScaleSetPacketCapture(String name) {
        this(name, ScaleSetPacketCaptureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScaleSetPacketCapture(String name, ScaleSetPacketCaptureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScaleSetPacketCapture(String name, ScaleSetPacketCaptureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/scaleSetPacketCapture:ScaleSetPacketCapture", name, args == null ? ScaleSetPacketCaptureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScaleSetPacketCapture(String name, Output<String> id, @Nullable ScaleSetPacketCaptureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/scaleSetPacketCapture:ScaleSetPacketCapture", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ScaleSetPacketCapture get(String name, Output<String> id, @Nullable ScaleSetPacketCaptureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScaleSetPacketCapture(name, id, state, options);
    }
}