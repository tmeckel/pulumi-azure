// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.ExpressRouteCircuitArgs;
import com.pulumi.azure.network.inputs.ExpressRouteCircuitState;
import com.pulumi.azure.network.outputs.ExpressRouteCircuitSku;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an ExpressRoute circuit.
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
 * import com.pulumi.azure.network.ExpressRouteCircuit;
 * import com.pulumi.azure.network.ExpressRouteCircuitArgs;
 * import com.pulumi.azure.network.inputs.ExpressRouteCircuitSkuArgs;
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
 *         var exampleExpressRouteCircuit = new ExpressRouteCircuit(&#34;exampleExpressRouteCircuit&#34;, ExpressRouteCircuitArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .serviceProviderName(&#34;Equinix&#34;)
 *             .peeringLocation(&#34;Silicon Valley&#34;)
 *             .bandwidthInMbps(50)
 *             .sku(ExpressRouteCircuitSkuArgs.builder()
 *                 .tier(&#34;Standard&#34;)
 *                 .family(&#34;MeteredData&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ExpressRoute circuits can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/expressRouteCircuit:ExpressRouteCircuit myExpressRoute /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/expressRouteCircuits/myExpressRoute
 * ```
 * 
 */
@ResourceType(type="azure:network/expressRouteCircuit:ExpressRouteCircuit")
public class ExpressRouteCircuit extends com.pulumi.resources.CustomResource {
    /**
     * Allow the circuit to interact with classic (RDFE) resources. Defaults to `false`.
     * 
     */
    @Export(name="allowClassicOperations", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowClassicOperations;

    /**
     * @return Allow the circuit to interact with classic (RDFE) resources. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> allowClassicOperations() {
        return Codegen.optional(this.allowClassicOperations);
    }
    /**
     * The bandwidth in Gbps of the circuit being created on the Express Route Port.
     * 
     */
    @Export(name="bandwidthInGbps", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> bandwidthInGbps;

    /**
     * @return The bandwidth in Gbps of the circuit being created on the Express Route Port.
     * 
     */
    public Output<Optional<Double>> bandwidthInGbps() {
        return Codegen.optional(this.bandwidthInGbps);
    }
    /**
     * The bandwidth in Mbps of the circuit being created on the Service Provider.
     * 
     */
    @Export(name="bandwidthInMbps", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> bandwidthInMbps;

    /**
     * @return The bandwidth in Mbps of the circuit being created on the Service Provider.
     * 
     */
    public Output<Optional<Integer>> bandwidthInMbps() {
        return Codegen.optional(this.bandwidthInMbps);
    }
    /**
     * The ID of the Express Route Port this Express Route Circuit is based on.
     * 
     */
    @Export(name="expressRoutePortId", type=String.class, parameters={})
    private Output</* @Nullable */ String> expressRoutePortId;

    /**
     * @return The ID of the Express Route Port this Express Route Circuit is based on.
     * 
     */
    public Output<Optional<String>> expressRoutePortId() {
        return Codegen.optional(this.expressRoutePortId);
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
     * The name of the ExpressRoute circuit. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ExpressRoute circuit. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the peering location and **not** the Azure resource location. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="peeringLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> peeringLocation;

    /**
     * @return The name of the peering location and **not** the Azure resource location. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> peeringLocation() {
        return Codegen.optional(this.peeringLocation);
    }
    /**
     * The name of the resource group in which to create the ExpressRoute circuit. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the ExpressRoute circuit. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The string needed by the service provider to provision the ExpressRoute circuit.
     * 
     */
    @Export(name="serviceKey", type=String.class, parameters={})
    private Output<String> serviceKey;

    /**
     * @return The string needed by the service provider to provision the ExpressRoute circuit.
     * 
     */
    public Output<String> serviceKey() {
        return this.serviceKey;
    }
    /**
     * The name of the ExpressRoute Service Provider. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="serviceProviderName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceProviderName;

    /**
     * @return The name of the ExpressRoute Service Provider. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> serviceProviderName() {
        return Codegen.optional(this.serviceProviderName);
    }
    /**
     * The ExpressRoute circuit provisioning state from your chosen service provider. Possible values are `NotProvisioned`, `Provisioning`, `Provisioned`, and `Deprovisioning`.
     * 
     */
    @Export(name="serviceProviderProvisioningState", type=String.class, parameters={})
    private Output<String> serviceProviderProvisioningState;

    /**
     * @return The ExpressRoute circuit provisioning state from your chosen service provider. Possible values are `NotProvisioned`, `Provisioning`, `Provisioned`, and `Deprovisioning`.
     * 
     */
    public Output<String> serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }
    /**
     * A `sku` block for the ExpressRoute circuit as documented below.
     * 
     */
    @Export(name="sku", type=ExpressRouteCircuitSku.class, parameters={})
    private Output<ExpressRouteCircuitSku> sku;

    /**
     * @return A `sku` block for the ExpressRoute circuit as documented below.
     * 
     */
    public Output<ExpressRouteCircuitSku> sku() {
        return this.sku;
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
    public ExpressRouteCircuit(String name) {
        this(name, ExpressRouteCircuitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExpressRouteCircuit(String name, ExpressRouteCircuitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressRouteCircuit(String name, ExpressRouteCircuitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/expressRouteCircuit:ExpressRouteCircuit", name, args == null ? ExpressRouteCircuitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExpressRouteCircuit(String name, Output<String> id, @Nullable ExpressRouteCircuitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/expressRouteCircuit:ExpressRouteCircuit", name, state, makeResourceOptions(options, id));
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
    public static ExpressRouteCircuit get(String name, Output<String> id, @Nullable ExpressRouteCircuitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRouteCircuit(name, id, state, options);
    }
}