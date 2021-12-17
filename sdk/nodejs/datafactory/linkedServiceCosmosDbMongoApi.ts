// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Linked Service (connection) between a CosmosDB and Azure Data Factory using Mongo API.
 *
 * > **Note:** All arguments including the client secret will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
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
 * });
 * const exampleLinkedServiceCosmosDbMongoApi = new azure.datafactory.LinkedServiceCosmosDbMongoApi("exampleLinkedServiceCosmosDbMongoApi", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     dataFactoryId: exampleFactory.id,
 *     connectionString: "mongodb://testinstance:testkey@testinstance.documents.azure.com:10255/?ssl=true",
 *     database: "foo",
 * });
 * ```
 *
 * ## Import
 *
 * Data Factory Linked Service's can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:datafactory/linkedServiceCosmosDbMongoApi:LinkedServiceCosmosDbMongoApi example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
 * ```
 */
export class LinkedServiceCosmosDbMongoApi extends pulumi.CustomResource {
    /**
     * Get an existing LinkedServiceCosmosDbMongoApi resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LinkedServiceCosmosDbMongoApiState, opts?: pulumi.CustomResourceOptions): LinkedServiceCosmosDbMongoApi {
        return new LinkedServiceCosmosDbMongoApi(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:datafactory/linkedServiceCosmosDbMongoApi:LinkedServiceCosmosDbMongoApi';

    /**
     * Returns true if the given object is an instance of LinkedServiceCosmosDbMongoApi.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LinkedServiceCosmosDbMongoApi {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LinkedServiceCosmosDbMongoApi.__pulumiType;
    }

    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     */
    public readonly additionalProperties!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     */
    public readonly annotations!: pulumi.Output<string[] | undefined>;
    /**
     * The connection string.
     */
    public readonly connectionString!: pulumi.Output<string | undefined>;
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     */
    public readonly dataFactoryId!: pulumi.Output<string>;
    /**
     * The Data Factory name in which to associate the Linked Service with. Changing this forces a new resource.
     *
     * @deprecated `data_factory_name` is deprecated in favour of `data_factory_id` and will be removed in version 3.0 of the AzureRM provider
     */
    public readonly dataFactoryName!: pulumi.Output<string>;
    /**
     * The name of the database.
     */
    public readonly database!: pulumi.Output<string | undefined>;
    /**
     * The description for the Data Factory Linked Service.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     */
    public readonly integrationRuntimeName!: pulumi.Output<string | undefined>;
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The name of the resource group in which to create the Data Factory Linked Service. Changing this forces a new resource
     */
    public readonly resourceGroupName!: pulumi.Output<string>;
    /**
     * Whether API server version is 3.2 or higher. Defaults to `false`.
     */
    public readonly serverVersionIs32OrHigher!: pulumi.Output<boolean | undefined>;

    /**
     * Create a LinkedServiceCosmosDbMongoApi resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LinkedServiceCosmosDbMongoApiArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LinkedServiceCosmosDbMongoApiArgs | LinkedServiceCosmosDbMongoApiState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LinkedServiceCosmosDbMongoApiState | undefined;
            inputs["additionalProperties"] = state ? state.additionalProperties : undefined;
            inputs["annotations"] = state ? state.annotations : undefined;
            inputs["connectionString"] = state ? state.connectionString : undefined;
            inputs["dataFactoryId"] = state ? state.dataFactoryId : undefined;
            inputs["dataFactoryName"] = state ? state.dataFactoryName : undefined;
            inputs["database"] = state ? state.database : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["integrationRuntimeName"] = state ? state.integrationRuntimeName : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["parameters"] = state ? state.parameters : undefined;
            inputs["resourceGroupName"] = state ? state.resourceGroupName : undefined;
            inputs["serverVersionIs32OrHigher"] = state ? state.serverVersionIs32OrHigher : undefined;
        } else {
            const args = argsOrState as LinkedServiceCosmosDbMongoApiArgs | undefined;
            if ((!args || args.resourceGroupName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupName'");
            }
            inputs["additionalProperties"] = args ? args.additionalProperties : undefined;
            inputs["annotations"] = args ? args.annotations : undefined;
            inputs["connectionString"] = args ? args.connectionString : undefined;
            inputs["dataFactoryId"] = args ? args.dataFactoryId : undefined;
            inputs["dataFactoryName"] = args ? args.dataFactoryName : undefined;
            inputs["database"] = args ? args.database : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["integrationRuntimeName"] = args ? args.integrationRuntimeName : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["parameters"] = args ? args.parameters : undefined;
            inputs["resourceGroupName"] = args ? args.resourceGroupName : undefined;
            inputs["serverVersionIs32OrHigher"] = args ? args.serverVersionIs32OrHigher : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(LinkedServiceCosmosDbMongoApi.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LinkedServiceCosmosDbMongoApi resources.
 */
export interface LinkedServiceCosmosDbMongoApiState {
    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     */
    additionalProperties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     */
    annotations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The connection string.
     */
    connectionString?: pulumi.Input<string>;
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     */
    dataFactoryId?: pulumi.Input<string>;
    /**
     * The Data Factory name in which to associate the Linked Service with. Changing this forces a new resource.
     *
     * @deprecated `data_factory_name` is deprecated in favour of `data_factory_id` and will be removed in version 3.0 of the AzureRM provider
     */
    dataFactoryName?: pulumi.Input<string>;
    /**
     * The name of the database.
     */
    database?: pulumi.Input<string>;
    /**
     * The description for the Data Factory Linked Service.
     */
    description?: pulumi.Input<string>;
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     */
    integrationRuntimeName?: pulumi.Input<string>;
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the resource group in which to create the Data Factory Linked Service. Changing this forces a new resource
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * Whether API server version is 3.2 or higher. Defaults to `false`.
     */
    serverVersionIs32OrHigher?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a LinkedServiceCosmosDbMongoApi resource.
 */
export interface LinkedServiceCosmosDbMongoApiArgs {
    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     */
    additionalProperties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     */
    annotations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The connection string.
     */
    connectionString?: pulumi.Input<string>;
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     */
    dataFactoryId?: pulumi.Input<string>;
    /**
     * The Data Factory name in which to associate the Linked Service with. Changing this forces a new resource.
     *
     * @deprecated `data_factory_name` is deprecated in favour of `data_factory_id` and will be removed in version 3.0 of the AzureRM provider
     */
    dataFactoryName?: pulumi.Input<string>;
    /**
     * The name of the database.
     */
    database?: pulumi.Input<string>;
    /**
     * The description for the Data Factory Linked Service.
     */
    description?: pulumi.Input<string>;
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     */
    integrationRuntimeName?: pulumi.Input<string>;
    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     */
    name?: pulumi.Input<string>;
    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the resource group in which to create the Data Factory Linked Service. Changing this forces a new resource
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Whether API server version is 3.2 or higher. Defaults to `false`.
     */
    serverVersionIs32OrHigher?: pulumi.Input<boolean>;
}