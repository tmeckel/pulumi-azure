// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.DiskAccessArgs;
import com.pulumi.azure.compute.inputs.DiskAccessState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Disk Access.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.compute.DiskAccess;
 * import com.pulumi.azure.compute.DiskAccessArgs;
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
 *         var example = new DiskAccess(&#34;example&#34;, DiskAccessArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .resourceGroupName(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Disk Access resource can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/diskAccess:DiskAccess example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Compute/diskAccesses/diskAccess1
 * ```
 * 
 */
@ResourceType(type="azure:compute/diskAccess:DiskAccess")
public class DiskAccess extends com.pulumi.resources.CustomResource {
    /**
     * The Azure Region where the Disk Access should exist. Changing this forces a new Disk to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Disk Access should exist. Changing this forces a new Disk to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Disk Access. Changing this forces a new Disk Access to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Disk Access. Changing this forces a new Disk Access to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Disk Access should exist. Changing this forces a new Disk Access to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Disk Access should exist. Changing this forces a new Disk Access to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags which should be assigned to the Disk Access.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Disk Access.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskAccess(String name) {
        this(name, DiskAccessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskAccess(String name, DiskAccessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskAccess(String name, DiskAccessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/diskAccess:DiskAccess", name, args == null ? DiskAccessArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiskAccess(String name, Output<String> id, @Nullable DiskAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/diskAccess:DiskAccess", name, state, makeResourceOptions(options, id));
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
    public static DiskAccess get(String name, Output<String> id, @Nullable DiskAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiskAccess(name, id, state, options);
    }
}