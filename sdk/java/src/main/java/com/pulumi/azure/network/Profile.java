// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.ProfileArgs;
import com.pulumi.azure.network.inputs.ProfileState;
import com.pulumi.azure.network.outputs.ProfileContainerNetworkInterface;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Network Profile.
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
 * import com.pulumi.azure.network.VirtualNetwork;
 * import com.pulumi.azure.network.VirtualNetworkArgs;
 * import com.pulumi.azure.network.Subnet;
 * import com.pulumi.azure.network.SubnetArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
 * import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
 * import com.pulumi.azure.network.Profile;
 * import com.pulumi.azure.network.ProfileArgs;
 * import com.pulumi.azure.network.inputs.ProfileContainerNetworkInterfaceArgs;
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
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .addressSpaces(&#34;10.1.0.0/16&#34;)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .virtualNetworkName(exampleVirtualNetwork.name())
 *             .addressPrefixes(&#34;10.1.0.0/24&#34;)
 *             .delegations(SubnetDelegationArgs.builder()
 *                 .name(&#34;delegation&#34;)
 *                 .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
 *                     .name(&#34;Microsoft.ContainerInstance/containerGroups&#34;)
 *                     .actions(&#34;Microsoft.Network/virtualNetworks/subnets/action&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleProfile = new Profile(&#34;exampleProfile&#34;, ProfileArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .containerNetworkInterface(ProfileContainerNetworkInterfaceArgs.builder()
 *                 .name(&#34;examplecnic&#34;)
 *                 .ipConfigurations(ProfileContainerNetworkInterfaceIpConfigurationArgs.builder()
 *                     .name(&#34;exampleipconfig&#34;)
 *                     .subnetId(exampleSubnet.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Network Profile can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/profile:Profile example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/networkProfiles/examplenetprofile
 * ```
 * 
 */
@ResourceType(type="azure:network/profile:Profile")
public class Profile extends com.pulumi.resources.CustomResource {
    /**
     * A `container_network_interface` block as documented below.
     * 
     */
    @Export(name="containerNetworkInterface", type=ProfileContainerNetworkInterface.class, parameters={})
    private Output<ProfileContainerNetworkInterface> containerNetworkInterface;

    /**
     * @return A `container_network_interface` block as documented below.
     * 
     */
    public Output<ProfileContainerNetworkInterface> containerNetworkInterface() {
        return this.containerNetworkInterface;
    }
    /**
     * A list of Container Network Interface IDs.
     * 
     */
    @Export(name="containerNetworkInterfaceIds", type=List.class, parameters={String.class})
    private Output<List<String>> containerNetworkInterfaceIds;

    /**
     * @return A list of Container Network Interface IDs.
     * 
     */
    public Output<List<String>> containerNetworkInterfaceIds() {
        return this.containerNetworkInterfaceIds;
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Network Profile. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Network Profile. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Profile(String name) {
        this(name, ProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Profile(String name, ProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Profile(String name, ProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/profile:Profile", name, args == null ? ProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Profile(String name, Output<String> id, @Nullable ProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/profile:Profile", name, state, makeResourceOptions(options, id));
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
    public static Profile get(String name, Output<String> id, @Nullable ProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Profile(name, id, state, options);
    }
}