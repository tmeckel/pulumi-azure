// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.MoverSourceEndpointArgs;
import com.pulumi.azure.storage.inputs.MoverSourceEndpointState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Storage Mover Source Endpoint.
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
 * import com.pulumi.azure.storage.Mover;
 * import com.pulumi.azure.storage.MoverArgs;
 * import com.pulumi.azure.storage.MoverSourceEndpoint;
 * import com.pulumi.azure.storage.MoverSourceEndpointArgs;
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
 *         var exampleMover = new Mover(&#34;exampleMover&#34;, MoverArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleMoverSourceEndpoint = new MoverSourceEndpoint(&#34;exampleMoverSourceEndpoint&#34;, MoverSourceEndpointArgs.builder()        
 *             .storageMoverId(exampleMover.id())
 *             .export(&#34;/&#34;)
 *             .host(&#34;192.168.0.1&#34;)
 *             .nfsVersion(&#34;NFSv3&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Storage Mover Source Endpoint can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:storage/moverSourceEndpoint:MoverSourceEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.StorageMover/storageMovers/storageMover1/endpoints/endpoint1
 * ```
 * 
 */
@ResourceType(type="azure:storage/moverSourceEndpoint:MoverSourceEndpoint")
public class MoverSourceEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a description for the Storage Mover Source Endpoint.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies a description for the Storage Mover Source Endpoint.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the directory being exported from the server. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="export", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> export;

    /**
     * @return Specifies the directory being exported from the server. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> export() {
        return Codegen.optional(this.export);
    }
    /**
     * Specifies the host name or IP address of the server exporting the file system. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="host", refs={String.class}, tree="[0]")
    private Output<String> host;

    /**
     * @return Specifies the host name or IP address of the server exporting the file system. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * Specifies the name which should be used for this Storage Mover Source Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name which should be used for this Storage Mover Source Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the NFS protocol version. Possible values are `NFSauto`, `NFSv3` and `NFSv4`. Defaults to `NFSauto`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="nfsVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nfsVersion;

    /**
     * @return Specifies the NFS protocol version. Possible values are `NFSauto`, `NFSv3` and `NFSv4`. Defaults to `NFSauto`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> nfsVersion() {
        return Codegen.optional(this.nfsVersion);
    }
    /**
     * Specifies the ID of the Storage Mover for this Storage Mover Source Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageMoverId", refs={String.class}, tree="[0]")
    private Output<String> storageMoverId;

    /**
     * @return Specifies the ID of the Storage Mover for this Storage Mover Source Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageMoverId() {
        return this.storageMoverId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MoverSourceEndpoint(String name) {
        this(name, MoverSourceEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MoverSourceEndpoint(String name, MoverSourceEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MoverSourceEndpoint(String name, MoverSourceEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/moverSourceEndpoint:MoverSourceEndpoint", name, args == null ? MoverSourceEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MoverSourceEndpoint(String name, Output<String> id, @Nullable MoverSourceEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/moverSourceEndpoint:MoverSourceEndpoint", name, state, makeResourceOptions(options, id));
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
    public static MoverSourceEndpoint get(String name, Output<String> id, @Nullable MoverSourceEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MoverSourceEndpoint(name, id, state, options);
    }
}