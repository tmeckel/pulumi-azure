// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Container App Environment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.containerapp.getEnvironment({
 *     name: "example-environment",
 *     resourceGroupName: "example-resources",
 * });
 * ```
 */
export function getEnvironment(args: GetEnvironmentArgs, opts?: pulumi.InvokeOptions): Promise<GetEnvironmentResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:containerapp/getEnvironment:getEnvironment", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnvironment.
 */
export interface GetEnvironmentArgs {
    /**
     * The name of the Container Apps Managed Environment.
     */
    name: string;
    /**
     * The name of the Resource Group where this Container App Environment exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getEnvironment.
 */
export interface GetEnvironmentResult {
    /**
     * The default publicly resolvable name of this Container App Environment. This is generated at creation time to be globally unique.
     */
    readonly defaultDomain: string;
    /**
     * The network addressing in which the Container Apps in this Container App Environment will reside in CIDR notation.
     */
    readonly dockerBridgeCidr: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the Subnet in use by the Container Apps Control Plane.
     */
    readonly infrastructureSubnetId: string;
    /**
     * Does the Container App Environment operate in Internal Load Balancing Mode?
     */
    readonly internalLoadBalancerEnabled: boolean;
    /**
     * The Azure Location where this Container App Environment exists.
     */
    readonly location: string;
    /**
     * The name of the Log Analytics Workspace this Container Apps Managed Environment is linked to.
     */
    readonly logAnalyticsWorkspaceName: string;
    readonly name: string;
    /**
     * The IP range, in CIDR notation, that is reserved for environment infrastructure IP addresses.
     */
    readonly platformReservedCidr: string;
    /**
     * The IP address from the IP range defined by `platformReservedCidr` that is reserved for the internal DNS server.
     */
    readonly platformReservedDnsIpAddress: string;
    readonly resourceGroupName: string;
    /**
     * The Static IP address of the Environment.
     */
    readonly staticIpAddress: string;
    /**
     * A mapping of tags assigned to the resource.
     */
    readonly tags: {[key: string]: string};
}
/**
 * Use this data source to access information about an existing Container App Environment.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.containerapp.getEnvironment({
 *     name: "example-environment",
 *     resourceGroupName: "example-resources",
 * });
 * ```
 */
export function getEnvironmentOutput(args: GetEnvironmentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEnvironmentResult> {
    return pulumi.output(args).apply((a: any) => getEnvironment(a, opts))
}

/**
 * A collection of arguments for invoking getEnvironment.
 */
export interface GetEnvironmentOutputArgs {
    /**
     * The name of the Container Apps Managed Environment.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group where this Container App Environment exists.
     */
    resourceGroupName: pulumi.Input<string>;
}