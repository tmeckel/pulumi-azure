// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.PublicIpPrefixArgs;
import com.pulumi.azure.network.inputs.PublicIpPrefixState;
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
 * Manages a Public IP Prefix.
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
 * import com.pulumi.azure.network.PublicIpPrefix;
 * import com.pulumi.azure.network.PublicIpPrefixArgs;
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
 *         var examplePublicIpPrefix = new PublicIpPrefix(&#34;examplePublicIpPrefix&#34;, PublicIpPrefixArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .prefixLength(31)
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Public IP Prefixes can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/publicIpPrefix:PublicIpPrefix myPublicIpPrefix /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/publicIPPrefixes/myPublicIpPrefix1
 * ```
 * 
 */
@ResourceType(type="azure:network/publicIpPrefix:PublicIpPrefix")
public class PublicIpPrefix extends com.pulumi.resources.CustomResource {
    /**
     * The IP address prefix value that was allocated.
     * 
     */
    @Export(name="ipPrefix", type=String.class, parameters={})
    private Output<String> ipPrefix;

    /**
     * @return The IP address prefix value that was allocated.
     * 
     */
    public Output<String> ipPrefix() {
        return this.ipPrefix;
    }
    /**
     * The IP Version to use, `IPv6` or `IPv4`. Changing this forces a new resource to be created. Default is `IPv4`.
     * 
     */
    @Export(name="ipVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipVersion;

    /**
     * @return The IP Version to use, `IPv6` or `IPv4`. Changing this forces a new resource to be created. Default is `IPv4`.
     * 
     */
    public Output<Optional<String>> ipVersion() {
        return Codegen.optional(this.ipVersion);
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
     * Specifies the name of the Public IP Prefix resource . Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Public IP Prefix resource . Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the number of bits of the prefix. The value can be set between 0 (4,294,967,296 addresses) and 31 (2 addresses). Defaults to `28`(16 addresses). Changing this forces a new resource to be created.
     * 
     */
    @Export(name="prefixLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> prefixLength;

    /**
     * @return Specifies the number of bits of the prefix. The value can be set between 0 (4,294,967,296 addresses) and 31 (2 addresses). Defaults to `28`(16 addresses). Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Integer>> prefixLength() {
        return Codegen.optional(this.prefixLength);
    }
    /**
     * The name of the resource group in which to create the Public IP Prefix.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Public IP Prefix.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The SKU of the Public IP Prefix. Accepted values are `Standard`. Defaults to `Standard`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sku;

    /**
     * @return The SKU of the Public IP Prefix. Accepted values are `Standard`. Defaults to `Standard`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> sku() {
        return Codegen.optional(this.sku);
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
     * Specifies a list of Availability Zones in which this Public IP Prefix should be located. Changing this forces a new Public IP Prefix to be created.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which this Public IP Prefix should be located. Changing this forces a new Public IP Prefix to be created.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublicIpPrefix(String name) {
        this(name, PublicIpPrefixArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublicIpPrefix(String name, PublicIpPrefixArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublicIpPrefix(String name, PublicIpPrefixArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/publicIpPrefix:PublicIpPrefix", name, args == null ? PublicIpPrefixArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PublicIpPrefix(String name, Output<String> id, @Nullable PublicIpPrefixState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/publicIpPrefix:PublicIpPrefix", name, state, makeResourceOptions(options, id));
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
    public static PublicIpPrefix get(String name, Output<String> id, @Nullable PublicIpPrefixState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PublicIpPrefix(name, id, state, options);
    }
}