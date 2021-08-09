// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Data Factory Managed Private Endpoint.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleFactory = new azure.datafactory.Factory("exampleFactory", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     managedVirtualNetworkEnabled: true,
 * });
 * const exampleAccount = new azure.storage.Account("exampleAccount", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     location: exampleResourceGroup.location,
 *     accountKind: "BlobStorage",
 *     accountTier: "Standard",
 *     accountReplicationType: "LRS",
 * });
 * const exampleManagedPrivateEndpoint = new azure.datafactory.ManagedPrivateEndpoint("exampleManagedPrivateEndpoint", {
 *     dataFactoryId: exampleFactory.id,
 *     targetResourceId: exampleAccount.id,
 *     subresourceName: "blob",
 * });
 * ```
 *
 * ## Import
 *
 * Data Factory Managed Private Endpoint can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:datafactory/managedPrivateEndpoint:ManagedPrivateEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/managedVirtualNetworks/default/managedPrivateEndpoints/endpoint1
 * ```
 */
export class ManagedPrivateEndpoint extends pulumi.CustomResource {
    /**
     * Get an existing ManagedPrivateEndpoint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ManagedPrivateEndpointState, opts?: pulumi.CustomResourceOptions): ManagedPrivateEndpoint {
        return new ManagedPrivateEndpoint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:datafactory/managedPrivateEndpoint:ManagedPrivateEndpoint';

    /**
     * Returns true if the given object is an instance of ManagedPrivateEndpoint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ManagedPrivateEndpoint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ManagedPrivateEndpoint.__pulumiType;
    }

    /**
     * The ID of the Data Factory on which to create the Managed Private Endpoint. Changing this forces a new resource to be created.
     */
    public readonly dataFactoryId!: pulumi.Output<string>;
    /**
     * Specifies the name which should be used for this Managed Private Endpoint. Changing this forces a new resource to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the sub resource name which the Data Factory Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     */
    public readonly subresourceName!: pulumi.Output<string>;
    /**
     * The ID of the Private Link Enabled Remote Resource which this Data Factory Private Endpoint should be connected to. Changing this forces a new resource to be created.
     */
    public readonly targetResourceId!: pulumi.Output<string>;

    /**
     * Create a ManagedPrivateEndpoint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ManagedPrivateEndpointArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ManagedPrivateEndpointArgs | ManagedPrivateEndpointState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ManagedPrivateEndpointState | undefined;
            inputs["dataFactoryId"] = state ? state.dataFactoryId : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["subresourceName"] = state ? state.subresourceName : undefined;
            inputs["targetResourceId"] = state ? state.targetResourceId : undefined;
        } else {
            const args = argsOrState as ManagedPrivateEndpointArgs | undefined;
            if ((!args || args.dataFactoryId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataFactoryId'");
            }
            if ((!args || args.subresourceName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subresourceName'");
            }
            if ((!args || args.targetResourceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetResourceId'");
            }
            inputs["dataFactoryId"] = args ? args.dataFactoryId : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["subresourceName"] = args ? args.subresourceName : undefined;
            inputs["targetResourceId"] = args ? args.targetResourceId : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ManagedPrivateEndpoint.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ManagedPrivateEndpoint resources.
 */
export interface ManagedPrivateEndpointState {
    /**
     * The ID of the Data Factory on which to create the Managed Private Endpoint. Changing this forces a new resource to be created.
     */
    dataFactoryId?: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Managed Private Endpoint. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the sub resource name which the Data Factory Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     */
    subresourceName?: pulumi.Input<string>;
    /**
     * The ID of the Private Link Enabled Remote Resource which this Data Factory Private Endpoint should be connected to. Changing this forces a new resource to be created.
     */
    targetResourceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ManagedPrivateEndpoint resource.
 */
export interface ManagedPrivateEndpointArgs {
    /**
     * The ID of the Data Factory on which to create the Managed Private Endpoint. Changing this forces a new resource to be created.
     */
    dataFactoryId: pulumi.Input<string>;
    /**
     * Specifies the name which should be used for this Managed Private Endpoint. Changing this forces a new resource to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the sub resource name which the Data Factory Private Endpoint is able to connect to. Changing this forces a new resource to be created.
     */
    subresourceName: pulumi.Input<string>;
    /**
     * The ID of the Private Link Enabled Remote Resource which this Data Factory Private Endpoint should be connected to. Changing this forces a new resource to be created.
     */
    targetResourceId: pulumi.Input<string>;
}