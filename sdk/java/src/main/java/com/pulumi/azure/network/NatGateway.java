// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.NatGatewayArgs;
import com.pulumi.azure.network.inputs.NatGatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Azure NAT Gateway.
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
 * import com.pulumi.azure.network.PublicIp;
 * import com.pulumi.azure.network.PublicIpArgs;
 * import com.pulumi.azure.network.PublicIpPrefix;
 * import com.pulumi.azure.network.PublicIpPrefixArgs;
 * import com.pulumi.azure.network.NatGateway;
 * import com.pulumi.azure.network.NatGatewayArgs;
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
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .allocationMethod(&#34;Static&#34;)
 *             .sku(&#34;Standard&#34;)
 *             .zones(&#34;1&#34;)
 *             .build());
 * 
 *         var examplePublicIpPrefix = new PublicIpPrefix(&#34;examplePublicIpPrefix&#34;, PublicIpPrefixArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .prefixLength(30)
 *             .zones(&#34;1&#34;)
 *             .build());
 * 
 *         var exampleNatGateway = new NatGateway(&#34;exampleNatGateway&#34;, NatGatewayArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(&#34;Standard&#34;)
 *             .idleTimeoutInMinutes(10)
 *             .zones(&#34;1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * NAT Gateway can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/natGateway:NatGateway test /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/natGateways/gateway1
 * ```
 * 
 */
@ResourceType(type="azure:network/natGateway:NatGateway")
public class NatGateway extends com.pulumi.resources.CustomResource {
    /**
     * The idle timeout which should be used in minutes. Defaults to `4`.
     * 
     */
    @Export(name="idleTimeoutInMinutes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> idleTimeoutInMinutes;

    /**
     * @return The idle timeout which should be used in minutes. Defaults to `4`.
     * 
     */
    public Output<Optional<Integer>> idleTimeoutInMinutes() {
        return Codegen.optional(this.idleTimeoutInMinutes);
    }
    /**
     * Specifies the supported Azure location where the NAT Gateway should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the NAT Gateway should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the NAT Gateway. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the NAT Gateway. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the Resource Group in which the NAT Gateway should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which the NAT Gateway should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The resource GUID property of the NAT Gateway.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the NAT Gateway.
     * 
     */
    public Output<String> resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The SKU which should be used. At this time the only supported value is `Standard`. Defaults to `Standard`.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output</* @Nullable */ String> skuName;

    /**
     * @return The SKU which should be used. At this time the only supported value is `Standard`. Defaults to `Standard`.
     * 
     */
    public Output<Optional<String>> skuName() {
        return Codegen.optional(this.skuName);
    }
    /**
     * A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies a list of Availability Zones in which this NAT Gateway should be located. Changing this forces a new NAT Gateway to be created.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which this NAT Gateway should be located. Changing this forces a new NAT Gateway to be created.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NatGateway(String name) {
        this(name, NatGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NatGateway(String name, NatGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NatGateway(String name, NatGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/natGateway:NatGateway", name, args == null ? NatGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NatGateway(String name, Output<String> id, @Nullable NatGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/natGateway:NatGateway", name, state, makeResourceOptions(options, id));
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
    public static NatGateway get(String name, Output<String> id, @Nullable NatGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NatGateway(name, id, state, options);
    }
}