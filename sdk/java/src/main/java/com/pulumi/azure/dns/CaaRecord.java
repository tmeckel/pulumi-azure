// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dns;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.dns.CaaRecordArgs;
import com.pulumi.azure.dns.inputs.CaaRecordState;
import com.pulumi.azure.dns.outputs.CaaRecordRecord;
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
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.dns.Zone;
 * import com.pulumi.azure.dns.ZoneArgs;
 * import com.pulumi.azure.dns.CaaRecord;
 * import com.pulumi.azure.dns.CaaRecordArgs;
 * import com.pulumi.azure.dns.inputs.CaaRecordRecordArgs;
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
 *         var exampleZone = new Zone(&#34;exampleZone&#34;, ZoneArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleCaaRecord = new CaaRecord(&#34;exampleCaaRecord&#34;, CaaRecordArgs.builder()        
 *             .zoneName(exampleZone.name())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .ttl(300)
 *             .records(            
 *                 CaaRecordRecordArgs.builder()
 *                     .flags(0)
 *                     .tag(&#34;issue&#34;)
 *                     .value(&#34;example.com&#34;)
 *                     .build(),
 *                 CaaRecordRecordArgs.builder()
 *                     .flags(0)
 *                     .tag(&#34;issue&#34;)
 *                     .value(&#34;example.net&#34;)
 *                     .build(),
 *                 CaaRecordRecordArgs.builder()
 *                     .flags(0)
 *                     .tag(&#34;issuewild&#34;)
 *                     .value(&#34;;&#34;)
 *                     .build(),
 *                 CaaRecordRecordArgs.builder()
 *                     .flags(0)
 *                     .tag(&#34;iodef&#34;)
 *                     .value(&#34;mailto:user@nonexisting.tld&#34;)
 *                     .build())
 *             .tags(Map.of(&#34;Environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * CAA records can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:dns/caaRecord:CaaRecord example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/dnszones/zone1/CAA/myrecord1
 * ```
 * 
 */
@ResourceType(type="azure:dns/caaRecord:CaaRecord")
public class CaaRecord extends com.pulumi.resources.CustomResource {
    /**
     * The FQDN of the DNS CAA Record.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return The FQDN of the DNS CAA Record.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * The name of the DNS CAA Record. If you are creating the record in the apex of the zone use `&#34;@&#34;` as the name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the DNS CAA Record. If you are creating the record in the apex of the zone use `&#34;@&#34;` as the name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of values that make up the CAA record. Each `record` block supports fields documented below.
     * 
     */
    @Export(name="records", type=List.class, parameters={CaaRecordRecord.class})
    private Output<List<CaaRecordRecord>> records;

    /**
     * @return A list of values that make up the CAA record. Each `record` block supports fields documented below.
     * 
     */
    public Output<List<CaaRecordRecord>> records() {
        return this.records;
    }
    /**
     * Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the resource group where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
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
     * The Time To Live (TTL) of the DNS record in seconds.
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output<Integer> ttl;

    /**
     * @return The Time To Live (TTL) of the DNS record in seconds.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="zoneName", type=String.class, parameters={})
    private Output<String> zoneName;

    /**
     * @return Specifies the DNS Zone where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> zoneName() {
        return this.zoneName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CaaRecord(String name) {
        this(name, CaaRecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CaaRecord(String name, CaaRecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CaaRecord(String name, CaaRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:dns/caaRecord:CaaRecord", name, args == null ? CaaRecordArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CaaRecord(String name, Output<String> id, @Nullable CaaRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:dns/caaRecord:CaaRecord", name, state, makeResourceOptions(options, id));
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
    public static CaaRecord get(String name, Output<String> id, @Nullable CaaRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CaaRecord(name, id, state, options);
    }
}