// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Azure Stack HCI Cluster instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.stack.getHciCluster({
 *     name: "existing",
 *     resourceGroupName: "existing",
 * });
 * export const id = example.then(example => example.id);
 * export const location = example.then(example => example.location);
 * export const clientId = example.then(example => example.clientId);
 * ```
 */
export function getHciCluster(args: GetHciClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetHciClusterResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:stack/getHciCluster:getHciCluster", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getHciCluster.
 */
export interface GetHciClusterArgs {
    /**
     * The name of the Azure Stack HCI Cluster.
     */
    name: string;
    /**
     * The name of the Resource Group where the Azure Stack HCI Cluster exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getHciCluster.
 */
export interface GetHciClusterResult {
    /**
     * The ID of the Automanage Configuration assigned to the Azure Stack HCI Cluster.
     */
    readonly automanageConfigurationId: string;
    /**
     * The Client ID of the Azure Active Directory used by the Azure Stack HCI Cluster.
     */
    readonly clientId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure Region where the Azure Stack HCI Cluster exists.
     */
    readonly location: string;
    readonly name: string;
    readonly resourceGroupName: string;
    /**
     * A mapping of tags assigned to the Azure Stack HCI Cluster.
     */
    readonly tags: {[key: string]: string};
    /**
     * The Tenant ID of the Azure Active Directory used by the Azure Stack HCI Cluster.
     */
    readonly tenantId: string;
}
/**
 * Use this data source to access information about an existing Azure Stack HCI Cluster instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.stack.getHciCluster({
 *     name: "existing",
 *     resourceGroupName: "existing",
 * });
 * export const id = example.then(example => example.id);
 * export const location = example.then(example => example.location);
 * export const clientId = example.then(example => example.clientId);
 * ```
 */
export function getHciClusterOutput(args: GetHciClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetHciClusterResult> {
    return pulumi.output(args).apply((a: any) => getHciCluster(a, opts))
}

/**
 * A collection of arguments for invoking getHciCluster.
 */
export interface GetHciClusterOutputArgs {
    /**
     * The name of the Azure Stack HCI Cluster.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group where the Azure Stack HCI Cluster exists.
     */
    resourceGroupName: pulumi.Input<string>;
}