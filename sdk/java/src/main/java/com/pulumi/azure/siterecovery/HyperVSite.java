// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.siterecovery.HyperVSiteArgs;
import com.pulumi.azure.siterecovery.inputs.HyperVSiteState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a HyperV Site in Recovery Service Vault.
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
 * import com.pulumi.azure.recoveryservices.Vault;
 * import com.pulumi.azure.recoveryservices.VaultArgs;
 * import com.pulumi.azure.siterecovery.HyperVSite;
 * import com.pulumi.azure.siterecovery.HyperVSiteArgs;
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
 *             .location(&#34;eastus&#34;)
 *             .build());
 * 
 *         var exampleVault = new Vault(&#34;exampleVault&#34;, VaultArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .softDeleteEnabled(false)
 *             .build());
 * 
 *         var exampleHyperVSite = new HyperVSite(&#34;exampleHyperVSite&#34;, HyperVSiteArgs.builder()        
 *             .recoveryVaultId(exampleVault.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Recovery Services can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:siterecovery/hyperVSite:HyperVSite example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.RecoveryServices/vaults/vault1/replicationFabrics/fabric1
 * ```
 * 
 */
@ResourceType(type="azure:siterecovery/hyperVSite:HyperVSite")
public class HyperVSite extends com.pulumi.resources.CustomResource {
    /**
     * The name which should be used for this Recovery Service. Changing this forces a new Site to be created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name which should be used for this Recovery Service. Changing this forces a new Site to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Recovery Services Vault where the Site created. Changing this forces a new Site to be created.
     * 
     */
    @Export(name="recoveryVaultId", refs={String.class}, tree="[0]")
    private Output<String> recoveryVaultId;

    /**
     * @return The ID of the Recovery Services Vault where the Site created. Changing this forces a new Site to be created.
     * 
     */
    public Output<String> recoveryVaultId() {
        return this.recoveryVaultId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HyperVSite(String name) {
        this(name, HyperVSiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HyperVSite(String name, HyperVSiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HyperVSite(String name, HyperVSiteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/hyperVSite:HyperVSite", name, args == null ? HyperVSiteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HyperVSite(String name, Output<String> id, @Nullable HyperVSiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/hyperVSite:HyperVSite", name, state, makeResourceOptions(options, id));
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
    public static HyperVSite get(String name, Output<String> id, @Nullable HyperVSiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HyperVSite(name, id, state, options);
    }
}