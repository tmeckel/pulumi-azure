// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mobile.NetworkSliceArgs;
import com.pulumi.azure.mobile.inputs.NetworkSliceState;
import com.pulumi.azure.mobile.outputs.NetworkSliceSingleNetworkSliceSelectionAssistanceInformation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Mobile Network Slice.
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
 * import com.pulumi.azure.mobile.Network;
 * import com.pulumi.azure.mobile.NetworkArgs;
 * import com.pulumi.azure.mobile.NetworkSlice;
 * import com.pulumi.azure.mobile.NetworkSliceArgs;
 * import com.pulumi.azure.mobile.inputs.NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs;
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
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .mobileCountryCode(&#34;001&#34;)
 *             .mobileNetworkCode(&#34;01&#34;)
 *             .build());
 * 
 *         var exampleNetworkSlice = new NetworkSlice(&#34;exampleNetworkSlice&#34;, NetworkSliceArgs.builder()        
 *             .mobileNetworkId(azurerm_mobile_network.test().id())
 *             .location(exampleResourceGroup.location())
 *             .description(&#34;an example slice&#34;)
 *             .singleNetworkSliceSelectionAssistanceInformation(NetworkSliceSingleNetworkSliceSelectionAssistanceInformationArgs.builder()
 *                 .sliceServiceType(1)
 *                 .build())
 *             .tags(Map.of(&#34;key&#34;, &#34;value&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Mobile Network Slice can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mobile/networkSlice:NetworkSlice example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.MobileNetwork/mobileNetworks/mobileNetwork1/slices/slice1
 * ```
 * 
 */
@ResourceType(type="azure:mobile/networkSlice:NetworkSlice")
public class NetworkSlice extends com.pulumi.resources.CustomResource {
    /**
     * A description for this Mobile Network Slice.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for this Mobile Network Slice.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the Azure Region where the Mobile Network Slice should exist. Changing this forces a new Mobile Network Slice to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Mobile Network Slice should exist. Changing this forces a new Mobile Network Slice to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The ID of Mobile Network which the Mobile Network Slice belongs to. Changing this forces a new Mobile Network Slice to be created.
     * 
     */
    @Export(name="mobileNetworkId", refs={String.class}, tree="[0]")
    private Output<String> mobileNetworkId;

    /**
     * @return The ID of Mobile Network which the Mobile Network Slice belongs to. Changing this forces a new Mobile Network Slice to be created.
     * 
     */
    public Output<String> mobileNetworkId() {
        return this.mobileNetworkId;
    }
    /**
     * Specifies the name which should be used for this Mobile Network Slice. Changing this forces a new Mobile Network Slice to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Mobile Network Slice. Changing this forces a new Mobile Network Slice to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `single_network_slice_selection_assistance_information` block as defined below. Single-network slice selection assistance information (S-NSSAI). Unique at the scope of a mobile network.
     * 
     */
    @Export(name="singleNetworkSliceSelectionAssistanceInformation", refs={NetworkSliceSingleNetworkSliceSelectionAssistanceInformation.class}, tree="[0]")
    private Output<NetworkSliceSingleNetworkSliceSelectionAssistanceInformation> singleNetworkSliceSelectionAssistanceInformation;

    /**
     * @return A `single_network_slice_selection_assistance_information` block as defined below. Single-network slice selection assistance information (S-NSSAI). Unique at the scope of a mobile network.
     * 
     */
    public Output<NetworkSliceSingleNetworkSliceSelectionAssistanceInformation> singleNetworkSliceSelectionAssistanceInformation() {
        return this.singleNetworkSliceSelectionAssistanceInformation;
    }
    /**
     * A mapping of tags which should be assigned to the Mobile Network Slice.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Mobile Network Slice.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkSlice(String name) {
        this(name, NetworkSliceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkSlice(String name, NetworkSliceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkSlice(String name, NetworkSliceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mobile/networkSlice:NetworkSlice", name, args == null ? NetworkSliceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkSlice(String name, Output<String> id, @Nullable NetworkSliceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mobile/networkSlice:NetworkSlice", name, state, makeResourceOptions(options, id));
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
    public static NetworkSlice get(String name, Output<String> id, @Nullable NetworkSliceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkSlice(name, id, state, options);
    }
}