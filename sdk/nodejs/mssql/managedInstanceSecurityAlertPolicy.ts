// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Security Alert Policy for an MS SQL Managed Instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleNetworkSecurityGroup = new azure.network.NetworkSecurityGroup("exampleNetworkSecurityGroup", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 * });
 * const allowManagementInbound = new azure.network.NetworkSecurityRule("allowManagementInbound", {
 *     priority: 106,
 *     direction: "Inbound",
 *     access: "Allow",
 *     protocol: "Tcp",
 *     sourcePortRange: "*",
 *     destinationPortRanges: [
 *         "9000",
 *         "9003",
 *         "1438",
 *         "1440",
 *         "1452",
 *     ],
 *     sourceAddressPrefix: "*",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const allowMisubnetInbound = new azure.network.NetworkSecurityRule("allowMisubnetInbound", {
 *     priority: 200,
 *     direction: "Inbound",
 *     access: "Allow",
 *     protocol: "*",
 *     sourcePortRange: "*",
 *     destinationPortRange: "*",
 *     sourceAddressPrefix: "10.0.0.0/24",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const allowHealthProbeInbound = new azure.network.NetworkSecurityRule("allowHealthProbeInbound", {
 *     priority: 300,
 *     direction: "Inbound",
 *     access: "Allow",
 *     protocol: "*",
 *     sourcePortRange: "*",
 *     destinationPortRange: "*",
 *     sourceAddressPrefix: "AzureLoadBalancer",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const allowTdsInbound = new azure.network.NetworkSecurityRule("allowTdsInbound", {
 *     priority: 1000,
 *     direction: "Inbound",
 *     access: "Allow",
 *     protocol: "Tcp",
 *     sourcePortRange: "*",
 *     destinationPortRange: "1433",
 *     sourceAddressPrefix: "VirtualNetwork",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const denyAllInbound = new azure.network.NetworkSecurityRule("denyAllInbound", {
 *     priority: 4096,
 *     direction: "Inbound",
 *     access: "Deny",
 *     protocol: "*",
 *     sourcePortRange: "*",
 *     destinationPortRange: "*",
 *     sourceAddressPrefix: "*",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const allowManagementOutbound = new azure.network.NetworkSecurityRule("allowManagementOutbound", {
 *     priority: 102,
 *     direction: "Outbound",
 *     access: "Allow",
 *     protocol: "Tcp",
 *     sourcePortRange: "*",
 *     destinationPortRanges: [
 *         "80",
 *         "443",
 *         "12000",
 *     ],
 *     sourceAddressPrefix: "*",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const allowMisubnetOutbound = new azure.network.NetworkSecurityRule("allowMisubnetOutbound", {
 *     priority: 200,
 *     direction: "Outbound",
 *     access: "Allow",
 *     protocol: "*",
 *     sourcePortRange: "*",
 *     destinationPortRange: "*",
 *     sourceAddressPrefix: "10.0.0.0/24",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const denyAllOutbound = new azure.network.NetworkSecurityRule("denyAllOutbound", {
 *     priority: 4096,
 *     direction: "Outbound",
 *     access: "Deny",
 *     protocol: "*",
 *     sourcePortRange: "*",
 *     destinationPortRange: "*",
 *     sourceAddressPrefix: "*",
 *     destinationAddressPrefix: "*",
 *     resourceGroupName: exampleResourceGroup.name,
 *     networkSecurityGroupName: exampleNetworkSecurityGroup.name,
 * });
 * const exampleVirtualNetwork = new azure.network.VirtualNetwork("exampleVirtualNetwork", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     addressSpaces: ["10.0.0.0/16"],
 *     location: exampleResourceGroup.location,
 * });
 * const exampleSubnet = new azure.network.Subnet("exampleSubnet", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     virtualNetworkName: exampleVirtualNetwork.name,
 *     addressPrefixes: ["10.0.0.0/24"],
 *     delegations: [{
 *         name: "managedinstancedelegation",
 *         serviceDelegation: {
 *             name: "Microsoft.Sql/managedInstances",
 *             actions: [
 *                 "Microsoft.Network/virtualNetworks/subnets/join/action",
 *                 "Microsoft.Network/virtualNetworks/subnets/prepareNetworkPolicies/action",
 *                 "Microsoft.Network/virtualNetworks/subnets/unprepareNetworkPolicies/action",
 *             ],
 *         },
 *     }],
 * });
 * const exampleSubnetNetworkSecurityGroupAssociation = new azure.network.SubnetNetworkSecurityGroupAssociation("exampleSubnetNetworkSecurityGroupAssociation", {
 *     subnetId: exampleSubnet.id,
 *     networkSecurityGroupId: exampleNetworkSecurityGroup.id,
 * });
 * const exampleRouteTable = new azure.network.RouteTable("exampleRouteTable", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     disableBgpRoutePropagation: false,
 * }, {
 *     dependsOn: [exampleSubnet],
 * });
 * const exampleSubnetRouteTableAssociation = new azure.network.SubnetRouteTableAssociation("exampleSubnetRouteTableAssociation", {
 *     subnetId: exampleSubnet.id,
 *     routeTableId: exampleRouteTable.id,
 * });
 * const exampleManagedInstance = new azure.mssql.ManagedInstance("exampleManagedInstance", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     licenseType: "BasePrice",
 *     skuName: "GP_Gen5",
 *     storageSizeInGb: 32,
 *     subnetId: exampleSubnet.id,
 *     vcores: 4,
 *     administratorLogin: "mradministrator",
 *     administratorLoginPassword: "thisIsDog11",
 * }, {
 *     dependsOn: [
 *         exampleSubnetNetworkSecurityGroupAssociation,
 *         exampleSubnetRouteTableAssociation,
 *     ],
 * });
 * const exampleManagedInstanceSecurityAlertPolicy = new azure.mssql.ManagedInstanceSecurityAlertPolicy("exampleManagedInstanceSecurityAlertPolicy", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     managedInstanceName: exampleManagedInstance.name,
 *     enabled: true,
 *     storageEndpoint: azurerm_storage_account.example.primary_blob_endpoint,
 *     storageAccountAccessKey: azurerm_storage_account.example.primary_access_key,
 *     disabledAlerts: [
 *         "Sql_Injection",
 *         "Data_Exfiltration",
 *     ],
 *     retentionDays: 20,
 * });
 * ```
 *
 * ## Import
 *
 * MS SQL Managed Instance Security Alert Policy can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:mssql/managedInstanceSecurityAlertPolicy:ManagedInstanceSecurityAlertPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/acceptanceTestResourceGroup1/providers/Microsoft.Sql/managedInstances/instance1/securityAlertPolicies/Default
 * ```
 */
export class ManagedInstanceSecurityAlertPolicy extends pulumi.CustomResource {
    /**
     * Get an existing ManagedInstanceSecurityAlertPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedInstanceSecurityAlertPolicyState, opts?: pulumi.CustomResourceOptions): ManagedInstanceSecurityAlertPolicy {
        return new ManagedInstanceSecurityAlertPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mssql/managedInstanceSecurityAlertPolicy:ManagedInstanceSecurityAlertPolicy';

    /**
     * Returns true if the given object is an instance of ManagedInstanceSecurityAlertPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedInstanceSecurityAlertPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedInstanceSecurityAlertPolicy.__pulumiType;
    }

    /**
     * Specifies an array of alerts that are disabled. Possible values are `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action` and `Brute_Force`.
     */
    public readonly disabledAlerts!: pulumi.Output<string[] | undefined>;
    /**
     * Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
     */
    public readonly emailAccountAdminsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies an array of email addresses to which the alert is sent.
     */
    public readonly emailAddresses!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the state of the Security Alert Policy, whether it is enabled or disabled. Possible values are `true`, `false`. Defaults to `false`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the name of the MS SQL Managed Instance. Changing this forces a new resource to be created.
     */
    public readonly managedInstanceName!: pulumi.Output<string>;
    /**
     * The name of the resource group that contains the MS SQL Managed Instance. Changing this forces a new resource to be created.
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
     */
    public readonly retentionDays!: pulumi.Output<number | undefined>;
    /**
     * Specifies the identifier key of the Threat Detection audit storage account. This is mandatory when you use `storageEndpoint` to specify a storage account blob endpoint.
     */
    public readonly storageAccountAccessKey!: pulumi.Output<string | undefined>;
    /**
     * Specifies the blob storage endpoint (e.g. https://example.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     */
    public readonly storageEndpoint!: pulumi.Output<string | undefined>;

    /**
     * Create a ManagedInstanceSecurityAlertPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedInstanceSecurityAlertPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedInstanceSecurityAlertPolicyArgs | ManagedInstanceSecurityAlertPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedInstanceSecurityAlertPolicyState | undefined;
            resourceInputs["disabledAlerts"] = state ? state.disabledAlerts : undefined;
            resourceInputs["emailAccountAdminsEnabled"] = state ? state.emailAccountAdminsEnabled : undefined;
            resourceInputs["emailAddresses"] = state ? state.emailAddresses : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["managedInstanceName"] = state ? state.managedInstanceName : undefined;
            resourceInputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            resourceInputs["retentionDays"] = state ? state.retentionDays : undefined;
            resourceInputs["storageAccountAccessKey"] = state ? state.storageAccountAccessKey : undefined;
            resourceInputs["storageEndpoint"] = state ? state.storageEndpoint : undefined;
        } else {
            const args = argsOrState as ManagedInstanceSecurityAlertPolicyArgs | undefined;
            if ((!args || args.managedInstanceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'managedInstanceName'");
            }
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            resourceInputs["disabledAlerts"] = args ? args.disabledAlerts : undefined;
            resourceInputs["emailAccountAdminsEnabled"] = args ? args.emailAccountAdminsEnabled : undefined;
            resourceInputs["emailAddresses"] = args ? args.emailAddresses : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["managedInstanceName"] = args ? args.managedInstanceName : undefined;
            resourceInputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            resourceInputs["retentionDays"] = args ? args.retentionDays : undefined;
            resourceInputs["storageAccountAccessKey"] = args ? args.storageAccountAccessKey : undefined;
            resourceInputs["storageEndpoint"] = args ? args.storageEndpoint : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ManagedInstanceSecurityAlertPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedInstanceSecurityAlertPolicy resources.
 */
export interface ManagedInstanceSecurityAlertPolicyState {
    /**
     * Specifies an array of alerts that are disabled. Possible values are `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action` and `Brute_Force`.
     */
    disabledAlerts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
     */
    emailAccountAdminsEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies an array of email addresses to which the alert is sent.
     */
    emailAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the state of the Security Alert Policy, whether it is enabled or disabled. Possible values are `true`, `false`. Defaults to `false`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the MS SQL Managed Instance. Changing this forces a new resource to be created.
     */
    managedInstanceName?: pulumi.Input<string>;
    /**
     * The name of the resource group that contains the MS SQL Managed Instance. Changing this forces a new resource to be created.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
     */
    retentionDays?: pulumi.Input<number>;
    /**
     * Specifies the identifier key of the Threat Detection audit storage account. This is mandatory when you use `storageEndpoint` to specify a storage account blob endpoint.
     */
    storageAccountAccessKey?: pulumi.Input<string>;
    /**
     * Specifies the blob storage endpoint (e.g. https://example.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     */
    storageEndpoint?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedInstanceSecurityAlertPolicy resource.
 */
export interface ManagedInstanceSecurityAlertPolicyArgs {
    /**
     * Specifies an array of alerts that are disabled. Possible values are `Sql_Injection`, `Sql_Injection_Vulnerability`, `Access_Anomaly`, `Data_Exfiltration`, `Unsafe_Action` and `Brute_Force`.
     */
    disabledAlerts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean flag which specifies if the alert is sent to the account administrators or not. Defaults to `false`.
     */
    emailAccountAdminsEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies an array of email addresses to which the alert is sent.
     */
    emailAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the state of the Security Alert Policy, whether it is enabled or disabled. Possible values are `true`, `false`. Defaults to `false`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the MS SQL Managed Instance. Changing this forces a new resource to be created.
     */
    managedInstanceName: pulumi.Input<string>;
    /**
     * The name of the resource group that contains the MS SQL Managed Instance. Changing this forces a new resource to be created.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specifies the number of days to keep in the Threat Detection audit logs. Defaults to `0`.
     */
    retentionDays?: pulumi.Input<number>;
    /**
     * Specifies the identifier key of the Threat Detection audit storage account. This is mandatory when you use `storageEndpoint` to specify a storage account blob endpoint.
     */
    storageAccountAccessKey?: pulumi.Input<string>;
    /**
     * Specifies the blob storage endpoint (e.g. https://example.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     */
    storageEndpoint?: pulumi.Input<string>;
}