// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs;
import com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState;
import com.pulumi.azure.siterecovery.outputs.ReplicationRecoveryPlanRecoveryGroup;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Site Recovery Plan within a Recovery Services vault. A recovery plan gathers machines into recovery groups for the purpose of failover.
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
 * import com.pulumi.azure.siterecovery.Fabric;
 * import com.pulumi.azure.siterecovery.FabricArgs;
 * import com.pulumi.azure.siterecovery.ReplicationRecoveryPlan;
 * import com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs;
 * import com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanRecoveryGroupArgs;
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
 *         var sourceResourceGroup = new ResourceGroup(&#34;sourceResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;west us&#34;)
 *             .build());
 * 
 *         var targetResourceGroup = new ResourceGroup(&#34;targetResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;east us&#34;)
 *             .build());
 * 
 *         var exampleVault = new Vault(&#34;exampleVault&#34;, VaultArgs.builder()        
 *             .location(targetResourceGroup.location())
 *             .resourceGroupName(targetResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .build());
 * 
 *         var sourceFabric = new Fabric(&#34;sourceFabric&#34;, FabricArgs.builder()        
 *             .resourceGroupName(azurerm_resource_group.example().name())
 *             .recoveryVaultName(exampleVault.name())
 *             .location(sourceResourceGroup.location())
 *             .build());
 * 
 *         var targetFabric = new Fabric(&#34;targetFabric&#34;, FabricArgs.builder()        
 *             .resourceGroupName(targetResourceGroup.name())
 *             .recoveryVaultName(exampleVault.name())
 *             .location(targetResourceGroup.location())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(sourceFabric)
 *                 .build());
 * 
 *         var exampleReplicationRecoveryPlan = new ReplicationRecoveryPlan(&#34;exampleReplicationRecoveryPlan&#34;, ReplicationRecoveryPlanArgs.builder()        
 *             .recoveryVaultId(azurerm_recovery_services_vault.target().id())
 *             .sourceRecoveryFabricId(sourceFabric.id())
 *             .targetRecoveryFabricId(targetFabric.id())
 *             .recoveryGroups(            
 *                 ReplicationRecoveryPlanRecoveryGroupArgs.builder()
 *                     .type(&#34;Boot&#34;)
 *                     .replicatedProtectedItems(azurerm_site_recovery_replicated_vm.test().id())
 *                     .build(),
 *                 ReplicationRecoveryPlanRecoveryGroupArgs.builder()
 *                     .type(&#34;Failover&#34;)
 *                     .build(),
 *                 ReplicationRecoveryPlanRecoveryGroupArgs.builder()
 *                     .type(&#34;Shutdown&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Site Recovery Fabric can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan RecoveryServices/vaults/vaultName/replicationRecoveryPlans/planName
 * ```
 * 
 */
@ResourceType(type="azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan")
public class ReplicationRecoveryPlan extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Three or more `recovery_group` block.
     * 
     */
    @Export(name="recoveryGroups", type=List.class, parameters={ReplicationRecoveryPlanRecoveryGroup.class})
    private Output</* @Nullable */ List<ReplicationRecoveryPlanRecoveryGroup>> recoveryGroups;

    /**
     * @return Three or more `recovery_group` block.
     * 
     */
    public Output<Optional<List<ReplicationRecoveryPlanRecoveryGroup>>> recoveryGroups() {
        return Codegen.optional(this.recoveryGroups);
    }
    /**
     * The ID of the vault that should be updated.
     * 
     */
    @Export(name="recoveryVaultId", type=String.class, parameters={})
    private Output<String> recoveryVaultId;

    /**
     * @return The ID of the vault that should be updated.
     * 
     */
    public Output<String> recoveryVaultId() {
        return this.recoveryVaultId;
    }
    /**
     * ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
     * 
     */
    @Export(name="sourceRecoveryFabricId", type=String.class, parameters={})
    private Output<String> sourceRecoveryFabricId;

    /**
     * @return ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
     * 
     */
    public Output<String> sourceRecoveryFabricId() {
        return this.sourceRecoveryFabricId;
    }
    /**
     * ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
     * 
     */
    @Export(name="targetRecoveryFabricId", type=String.class, parameters={})
    private Output<String> targetRecoveryFabricId;

    /**
     * @return ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
     * 
     */
    public Output<String> targetRecoveryFabricId() {
        return this.targetRecoveryFabricId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationRecoveryPlan(String name) {
        this(name, ReplicationRecoveryPlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationRecoveryPlan(String name, ReplicationRecoveryPlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationRecoveryPlan(String name, ReplicationRecoveryPlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan", name, args == null ? ReplicationRecoveryPlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationRecoveryPlan(String name, Output<String> id, @Nullable ReplicationRecoveryPlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan", name, state, makeResourceOptions(options, id));
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
    public static ReplicationRecoveryPlan get(String name, Output<String> id, @Nullable ReplicationRecoveryPlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationRecoveryPlan(name, id, state, options);
    }
}