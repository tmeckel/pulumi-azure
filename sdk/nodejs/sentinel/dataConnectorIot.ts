// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages an Iot Data Connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleAnalyticsWorkspace = new azure.operationalinsights.AnalyticsWorkspace("exampleAnalyticsWorkspace", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     sku: "PerGB2018",
 * });
 * const exampleAnalyticsSolution = new azure.operationalinsights.AnalyticsSolution("exampleAnalyticsSolution", {
 *     solutionName: "SecurityInsights",
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     workspaceResourceId: exampleAnalyticsWorkspace.id,
 *     workspaceName: exampleAnalyticsWorkspace.name,
 *     plan: {
 *         publisher: "Microsoft",
 *         product: "OMSGallery/SecurityInsights",
 *     },
 * });
 * const exampleDataConnectorIot = new azure.sentinel.DataConnectorIot("exampleDataConnectorIot", {logAnalyticsWorkspaceId: exampleAnalyticsSolution.workspaceResourceId});
 * ```
 *
 * ## Import
 *
 * Iot Data Connectors can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:sentinel/dataConnectorIot:DataConnectorIot example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
 * ```
 */
export class DataConnectorIot extends pulumi.CustomResource {
    /**
     * Get an existing DataConnectorIot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DataConnectorIotState, opts?: pulumi.CustomResourceOptions): DataConnectorIot {
        return new DataConnectorIot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:sentinel/dataConnectorIot:DataConnectorIot';

    /**
     * Returns true if the given object is an instance of DataConnectorIot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DataConnectorIot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DataConnectorIot.__pulumiType;
    }

    /**
     * The ID of the Log Analytics Workspace that this Iot Data Connector resides in. Changing this forces a new Iot Data Connector to be created.
     */
    public readonly logAnalyticsWorkspaceId!: pulumi.Output<string>;
    /**
     * The name which should be used for this Iot Data Connector. Changing this forces a new Iot Data Connector to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the subscription that this Iot Data Connector connects to. Changing this forces a new Iot Data Connector to be created.
     */
    public readonly subscriptionId!: pulumi.Output<string>;

    /**
     * Create a DataConnectorIot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DataConnectorIotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DataConnectorIotArgs | DataConnectorIotState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DataConnectorIotState | undefined;
            resourceInputs["logAnalyticsWorkspaceId"] = state ? state.logAnalyticsWorkspaceId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["subscriptionId"] = state ? state.subscriptionId : undefined;
        } else {
            const args = argsOrState as DataConnectorIotArgs | undefined;
            if ((!args || args.logAnalyticsWorkspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'logAnalyticsWorkspaceId'");
            }
            resourceInputs["logAnalyticsWorkspaceId"] = args ? args.logAnalyticsWorkspaceId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["subscriptionId"] = args ? args.subscriptionId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DataConnectorIot.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DataConnectorIot resources.
 */
export interface DataConnectorIotState {
    /**
     * The ID of the Log Analytics Workspace that this Iot Data Connector resides in. Changing this forces a new Iot Data Connector to be created.
     */
    logAnalyticsWorkspaceId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Iot Data Connector. Changing this forces a new Iot Data Connector to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the subscription that this Iot Data Connector connects to. Changing this forces a new Iot Data Connector to be created.
     */
    subscriptionId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DataConnectorIot resource.
 */
export interface DataConnectorIotArgs {
    /**
     * The ID of the Log Analytics Workspace that this Iot Data Connector resides in. Changing this forces a new Iot Data Connector to be created.
     */
    logAnalyticsWorkspaceId: pulumi.Input<string>;
    /**
     * The name which should be used for this Iot Data Connector. Changing this forces a new Iot Data Connector to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the subscription that this Iot Data Connector connects to. Changing this forces a new Iot Data Connector to be created.
     */
    subscriptionId?: pulumi.Input<string>;
}