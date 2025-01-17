// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Site Recovery Replication Recovery Plan within a Recovery Services vault. A recovery plan gathers machines into recovery groups for the purpose of failover.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const primaryResourceGroup = new azure.core.ResourceGroup("primaryResourceGroup", {location: "West US"});
 * const secondaryResourceGroup = new azure.core.ResourceGroup("secondaryResourceGroup", {location: "East US"});
 * const primaryVirtualNetwork = new azure.network.VirtualNetwork("primaryVirtualNetwork", {
 *     resourceGroupName: primaryResourceGroup.name,
 *     addressSpaces: ["192.168.1.0/24"],
 *     location: primaryResourceGroup.location,
 * });
 * const primarySubnet = new azure.network.Subnet("primarySubnet", {
 *     resourceGroupName: primaryResourceGroup.name,
 *     virtualNetworkName: primaryVirtualNetwork.name,
 *     addressPrefixes: ["192.168.1.0/24"],
 * });
 * const primaryPublicIp = new azure.network.PublicIp("primaryPublicIp", {
 *     allocationMethod: "Static",
 *     location: primaryResourceGroup.location,
 *     resourceGroupName: primaryResourceGroup.name,
 *     sku: "Basic",
 * });
 * const vmNetworkInterface = new azure.network.NetworkInterface("vmNetworkInterface", {
 *     location: primaryResourceGroup.location,
 *     resourceGroupName: primaryResourceGroup.name,
 *     ipConfigurations: [{
 *         name: "vm",
 *         subnetId: primarySubnet.id,
 *         privateIpAddressAllocation: "Dynamic",
 *         publicIpAddressId: primaryPublicIp.id,
 *     }],
 * });
 * const vmVirtualMachine = new azure.compute.VirtualMachine("vmVirtualMachine", {
 *     location: primaryResourceGroup.location,
 *     resourceGroupName: primaryResourceGroup.name,
 *     vmSize: "Standard_B1s",
 *     networkInterfaceIds: [vmNetworkInterface.id],
 *     storageImageReference: {
 *         publisher: "Canonical",
 *         offer: "0001-com-ubuntu-server-jammy",
 *         sku: "22_04-lts",
 *         version: "latest",
 *     },
 *     storageOsDisk: {
 *         name: "vm-os-disk",
 *         osType: "Linux",
 *         caching: "ReadWrite",
 *         createOption: "FromImage",
 *         managedDiskType: "Premium_LRS",
 *     },
 *     osProfile: {
 *         adminUsername: "test-admin-123",
 *         adminPassword: "test-pwd-123",
 *         computerName: "vm",
 *     },
 *     osProfileLinuxConfig: {
 *         disablePasswordAuthentication: false,
 *     },
 * });
 * const vault = new azure.recoveryservices.Vault("vault", {
 *     location: secondaryResourceGroup.location,
 *     resourceGroupName: secondaryResourceGroup.name,
 *     sku: "Standard",
 * });
 * const primaryFabric = new azure.siterecovery.Fabric("primaryFabric", {
 *     resourceGroupName: secondaryResourceGroup.name,
 *     recoveryVaultName: vault.name,
 *     location: primaryResourceGroup.location,
 * });
 * const secondaryFabric = new azure.siterecovery.Fabric("secondaryFabric", {
 *     resourceGroupName: secondaryResourceGroup.name,
 *     recoveryVaultName: vault.name,
 *     location: secondaryResourceGroup.location,
 * });
 * const primaryProtectionContainer = new azure.siterecovery.ProtectionContainer("primaryProtectionContainer", {
 *     resourceGroupName: secondaryResourceGroup.name,
 *     recoveryVaultName: vault.name,
 *     recoveryFabricName: primaryFabric.name,
 * });
 * const secondaryProtectionContainer = new azure.siterecovery.ProtectionContainer("secondaryProtectionContainer", {
 *     resourceGroupName: secondaryResourceGroup.name,
 *     recoveryVaultName: vault.name,
 *     recoveryFabricName: secondaryFabric.name,
 * });
 * const policy = new azure.siterecovery.ReplicationPolicy("policy", {
 *     resourceGroupName: secondaryResourceGroup.name,
 *     recoveryVaultName: vault.name,
 *     recoveryPointRetentionInMinutes: 24 * 60,
 *     applicationConsistentSnapshotFrequencyInMinutes: 4 * 60,
 * });
 * const container_mapping = new azure.siterecovery.ProtectionContainerMapping("container-mapping", {
 *     resourceGroupName: secondaryResourceGroup.name,
 *     recoveryVaultName: vault.name,
 *     recoveryFabricName: primaryFabric.name,
 *     recoverySourceProtectionContainerName: primaryProtectionContainer.name,
 *     recoveryTargetProtectionContainerId: secondaryProtectionContainer.id,
 *     recoveryReplicationPolicyId: policy.id,
 * });
 * const secondaryVirtualNetwork = new azure.network.VirtualNetwork("secondaryVirtualNetwork", {
 *     resourceGroupName: secondaryResourceGroup.name,
 *     addressSpaces: ["192.168.2.0/24"],
 *     location: secondaryResourceGroup.location,
 * });
 * const network_mapping = new azure.siterecovery.NetworkMapping("network-mapping", {
 *     resourceGroupName: secondaryResourceGroup.name,
 *     recoveryVaultName: vault.name,
 *     sourceRecoveryFabricName: primaryFabric.name,
 *     targetRecoveryFabricName: secondaryFabric.name,
 *     sourceNetworkId: primaryVirtualNetwork.id,
 *     targetNetworkId: secondaryVirtualNetwork.id,
 * });
 * const primaryAccount = new azure.storage.Account("primaryAccount", {
 *     location: primaryResourceGroup.location,
 *     resourceGroupName: primaryResourceGroup.name,
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const secondarySubnet = new azure.network.Subnet("secondarySubnet", {
 *     resourceGroupName: secondaryResourceGroup.name,
 *     virtualNetworkName: secondaryVirtualNetwork.name,
 *     addressPrefixes: ["192.168.2.0/24"],
 * });
 * const secondaryPublicIp = new azure.network.PublicIp("secondaryPublicIp", {
 *     allocationMethod: "Static",
 *     location: secondaryResourceGroup.location,
 *     resourceGroupName: secondaryResourceGroup.name,
 *     sku: "Basic",
 * });
 * const vm_replication = new azure.siterecovery.ReplicatedVM("vm-replication", {
 *     resourceGroupName: secondaryResourceGroup.name,
 *     recoveryVaultName: vault.name,
 *     sourceRecoveryFabricName: primaryFabric.name,
 *     sourceVmId: vmVirtualMachine.id,
 *     recoveryReplicationPolicyId: policy.id,
 *     sourceRecoveryProtectionContainerName: primaryProtectionContainer.name,
 *     targetResourceGroupId: secondaryResourceGroup.id,
 *     targetRecoveryFabricId: secondaryFabric.id,
 *     targetRecoveryProtectionContainerId: secondaryProtectionContainer.id,
 *     managedDisks: [{
 *         diskId: vmVirtualMachine.storageOsDisk.apply(storageOsDisk => storageOsDisk.managedDiskId),
 *         stagingStorageAccountId: primaryAccount.id,
 *         targetResourceGroupId: secondaryResourceGroup.id,
 *         targetDiskType: "Premium_LRS",
 *         targetReplicaDiskType: "Premium_LRS",
 *     }],
 *     networkInterfaces: [{
 *         sourceNetworkInterfaceId: vmNetworkInterface.id,
 *         targetSubnetName: secondarySubnet.name,
 *         recoveryPublicIpAddressId: secondaryPublicIp.id,
 *     }],
 * }, {
 *     dependsOn: [
 *         container_mapping,
 *         network_mapping,
 *     ],
 * });
 * const example = new azure.siterecovery.ReplicationRecoveryPlan("example", {
 *     recoveryVaultId: vault.id,
 *     sourceRecoveryFabricId: primaryFabric.id,
 *     targetRecoveryFabricId: secondaryFabric.id,
 *     shutdownRecoveryGroup: {},
 *     failoverRecoveryGroup: {},
 *     bootRecoveryGroups: [{
 *         replicatedProtectedItems: [vm_replication.id],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Site Recovery Fabric can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan azurerm_site_recovery_replication_recovery_plan.example /subscriptions/00000000-0000-0000-0000-00000000000/resourceGroups/groupName/providers/Microsoft.RecoveryServices/vaults/vaultName/replicationRecoveryPlans/planName
 * ```
 */
export class ReplicationRecoveryPlan extends pulumi.CustomResource {
    /**
     * Get an existing ReplicationRecoveryPlan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReplicationRecoveryPlanState, opts?: pulumi.CustomResourceOptions): ReplicationRecoveryPlan {
        return new ReplicationRecoveryPlan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:siterecovery/replicationRecoveryPlan:ReplicationRecoveryPlan';

    /**
     * Returns true if the given object is an instance of ReplicationRecoveryPlan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ReplicationRecoveryPlan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ReplicationRecoveryPlan.__pulumiType;
    }

    /**
     * An `azureToAzureSettings` block as defined below.
     */
    public readonly azureToAzureSettings!: pulumi.Output<outputs.siterecovery.ReplicationRecoveryPlanAzureToAzureSettings | undefined>;
    /**
     * One or more `bootRecoveryGroup` blocks as defined below.
     *
     * > **NOTE:** At least one `bootRecoveryGroup` block will be required in the next major version of the AzureRM Provider.
     */
    public readonly bootRecoveryGroups!: pulumi.Output<outputs.siterecovery.ReplicationRecoveryPlanBootRecoveryGroup[]>;
    /**
     * One `failoverRecoveryGroup` block as defined below.
     *
     * > **NOTE:** `failoverRecoveryGroup` will be required in the next major version of the AzureRM Provider.
     */
    public readonly failoverRecoveryGroup!: pulumi.Output<outputs.siterecovery.ReplicationRecoveryPlanFailoverRecoveryGroup>;
    /**
     * The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Three or more `recoveryGroup` block defined as below.
     *
     * > **Note:** The `recoveryGroup` block is deprecated in favor of `shutdownRecoveryGroup`, `failoverRecoveryGroup` and `bootRecoveryGroup`. It will be removed in v4.0 of the Azure Provider.
     *
     * @deprecated the `recovery_group` block has been deprecated in favour of the `shutdown_recovery_group`, `failover_recovery_group` and `boot_recovery_group` and will be removed in version 4.0 of the provider.
     */
    public readonly recoveryGroups!: pulumi.Output<outputs.siterecovery.ReplicationRecoveryPlanRecoveryGroup[]>;
    /**
     * The ID of the vault that should be updated. Changing this forces a new resource to be created.
     */
    public readonly recoveryVaultId!: pulumi.Output<string>;
    /**
     * One `shutdownRecoveryGroup` block as defined below.
     *
     * > **NOTE:** `shutdownRecoveryGroup` will be required in the next major version of the AzureRM Provider.
     */
    public readonly shutdownRecoveryGroup!: pulumi.Output<outputs.siterecovery.ReplicationRecoveryPlanShutdownRecoveryGroup>;
    /**
     * ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
     */
    public readonly sourceRecoveryFabricId!: pulumi.Output<string>;
    /**
     * ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
     */
    public readonly targetRecoveryFabricId!: pulumi.Output<string>;

    /**
     * Create a ReplicationRecoveryPlan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReplicationRecoveryPlanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReplicationRecoveryPlanArgs | ReplicationRecoveryPlanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReplicationRecoveryPlanState | undefined;
            resourceInputs["azureToAzureSettings"] = state ? state.azureToAzureSettings : undefined;
            resourceInputs["bootRecoveryGroups"] = state ? state.bootRecoveryGroups : undefined;
            resourceInputs["failoverRecoveryGroup"] = state ? state.failoverRecoveryGroup : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["recoveryGroups"] = state ? state.recoveryGroups : undefined;
            resourceInputs["recoveryVaultId"] = state ? state.recoveryVaultId : undefined;
            resourceInputs["shutdownRecoveryGroup"] = state ? state.shutdownRecoveryGroup : undefined;
            resourceInputs["sourceRecoveryFabricId"] = state ? state.sourceRecoveryFabricId : undefined;
            resourceInputs["targetRecoveryFabricId"] = state ? state.targetRecoveryFabricId : undefined;
        } else {
            const args = argsOrState as ReplicationRecoveryPlanArgs | undefined;
            if ((!args || args.recoveryVaultId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'recoveryVaultId'");
            }
            if ((!args || args.sourceRecoveryFabricId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceRecoveryFabricId'");
            }
            if ((!args || args.targetRecoveryFabricId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetRecoveryFabricId'");
            }
            resourceInputs["azureToAzureSettings"] = args ? args.azureToAzureSettings : undefined;
            resourceInputs["bootRecoveryGroups"] = args ? args.bootRecoveryGroups : undefined;
            resourceInputs["failoverRecoveryGroup"] = args ? args.failoverRecoveryGroup : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["recoveryGroups"] = args ? args.recoveryGroups : undefined;
            resourceInputs["recoveryVaultId"] = args ? args.recoveryVaultId : undefined;
            resourceInputs["shutdownRecoveryGroup"] = args ? args.shutdownRecoveryGroup : undefined;
            resourceInputs["sourceRecoveryFabricId"] = args ? args.sourceRecoveryFabricId : undefined;
            resourceInputs["targetRecoveryFabricId"] = args ? args.targetRecoveryFabricId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ReplicationRecoveryPlan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ReplicationRecoveryPlan resources.
 */
export interface ReplicationRecoveryPlanState {
    /**
     * An `azureToAzureSettings` block as defined below.
     */
    azureToAzureSettings?: pulumi.Input<inputs.siterecovery.ReplicationRecoveryPlanAzureToAzureSettings>;
    /**
     * One or more `bootRecoveryGroup` blocks as defined below.
     *
     * > **NOTE:** At least one `bootRecoveryGroup` block will be required in the next major version of the AzureRM Provider.
     */
    bootRecoveryGroups?: pulumi.Input<pulumi.Input<inputs.siterecovery.ReplicationRecoveryPlanBootRecoveryGroup>[]>;
    /**
     * One `failoverRecoveryGroup` block as defined below.
     *
     * > **NOTE:** `failoverRecoveryGroup` will be required in the next major version of the AzureRM Provider.
     */
    failoverRecoveryGroup?: pulumi.Input<inputs.siterecovery.ReplicationRecoveryPlanFailoverRecoveryGroup>;
    /**
     * The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Three or more `recoveryGroup` block defined as below.
     *
     * > **Note:** The `recoveryGroup` block is deprecated in favor of `shutdownRecoveryGroup`, `failoverRecoveryGroup` and `bootRecoveryGroup`. It will be removed in v4.0 of the Azure Provider.
     *
     * @deprecated the `recovery_group` block has been deprecated in favour of the `shutdown_recovery_group`, `failover_recovery_group` and `boot_recovery_group` and will be removed in version 4.0 of the provider.
     */
    recoveryGroups?: pulumi.Input<pulumi.Input<inputs.siterecovery.ReplicationRecoveryPlanRecoveryGroup>[]>;
    /**
     * The ID of the vault that should be updated. Changing this forces a new resource to be created.
     */
    recoveryVaultId?: pulumi.Input<string>;
    /**
     * One `shutdownRecoveryGroup` block as defined below.
     *
     * > **NOTE:** `shutdownRecoveryGroup` will be required in the next major version of the AzureRM Provider.
     */
    shutdownRecoveryGroup?: pulumi.Input<inputs.siterecovery.ReplicationRecoveryPlanShutdownRecoveryGroup>;
    /**
     * ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
     */
    sourceRecoveryFabricId?: pulumi.Input<string>;
    /**
     * ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
     */
    targetRecoveryFabricId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ReplicationRecoveryPlan resource.
 */
export interface ReplicationRecoveryPlanArgs {
    /**
     * An `azureToAzureSettings` block as defined below.
     */
    azureToAzureSettings?: pulumi.Input<inputs.siterecovery.ReplicationRecoveryPlanAzureToAzureSettings>;
    /**
     * One or more `bootRecoveryGroup` blocks as defined below.
     *
     * > **NOTE:** At least one `bootRecoveryGroup` block will be required in the next major version of the AzureRM Provider.
     */
    bootRecoveryGroups?: pulumi.Input<pulumi.Input<inputs.siterecovery.ReplicationRecoveryPlanBootRecoveryGroup>[]>;
    /**
     * One `failoverRecoveryGroup` block as defined below.
     *
     * > **NOTE:** `failoverRecoveryGroup` will be required in the next major version of the AzureRM Provider.
     */
    failoverRecoveryGroup?: pulumi.Input<inputs.siterecovery.ReplicationRecoveryPlanFailoverRecoveryGroup>;
    /**
     * The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Three or more `recoveryGroup` block defined as below.
     *
     * > **Note:** The `recoveryGroup` block is deprecated in favor of `shutdownRecoveryGroup`, `failoverRecoveryGroup` and `bootRecoveryGroup`. It will be removed in v4.0 of the Azure Provider.
     *
     * @deprecated the `recovery_group` block has been deprecated in favour of the `shutdown_recovery_group`, `failover_recovery_group` and `boot_recovery_group` and will be removed in version 4.0 of the provider.
     */
    recoveryGroups?: pulumi.Input<pulumi.Input<inputs.siterecovery.ReplicationRecoveryPlanRecoveryGroup>[]>;
    /**
     * The ID of the vault that should be updated. Changing this forces a new resource to be created.
     */
    recoveryVaultId: pulumi.Input<string>;
    /**
     * One `shutdownRecoveryGroup` block as defined below.
     *
     * > **NOTE:** `shutdownRecoveryGroup` will be required in the next major version of the AzureRM Provider.
     */
    shutdownRecoveryGroup?: pulumi.Input<inputs.siterecovery.ReplicationRecoveryPlanShutdownRecoveryGroup>;
    /**
     * ID of source fabric to be recovered from. Changing this forces a new Replication Plan to be created.
     */
    sourceRecoveryFabricId: pulumi.Input<string>;
    /**
     * ID of target fabric to recover. Changing this forces a new Replication Plan to be created.
     */
    targetRecoveryFabricId: pulumi.Input<string>;
}
