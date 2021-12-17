// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing Batch Application instance.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = azure.batch.getApplication({
 *     name: "testapplication",
 *     resourceGroupName: "test",
 *     accountName: "testbatchaccount",
 * });
 * export const batchApplicationId = example.then(example => example.id);
 * ```
 */
export function getApplication(args: GetApplicationArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("azure:batch/getApplication:getApplication", {
        "accountName": args.accountName,
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplication.
 */
export interface GetApplicationArgs {
    /**
     * The name of the Batch account.
     */
    accountName: string;
    /**
     * The name of the Application.
     */
    name: string;
    /**
     * The name of the Resource Group where this Batch account exists.
     */
    resourceGroupName: string;
}

/**
 * A collection of values returned by getApplication.
 */
export interface GetApplicationResult {
    readonly accountName: string;
    /**
     * May packages within the application be overwritten using the same version string.
     */
    readonly allowUpdates: boolean;
    /**
     * The package to use if a client requests the application but does not specify a version.
     */
    readonly defaultVersion: string;
    /**
     * The display name for the application.
     */
    readonly displayName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Batch application name.
     */
    readonly name: string;
    readonly resourceGroupName: string;
}

export function getApplicationOutput(args: GetApplicationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApplicationResult> {
    return pulumi.output(args).apply(a => getApplication(a, opts))
}

/**
 * A collection of arguments for invoking getApplication.
 */
export interface GetApplicationOutputArgs {
    /**
     * The name of the Batch account.
     */
    accountName: pulumi.Input<string>;
    /**
     * The name of the Application.
     */
    name: pulumi.Input<string>;
    /**
     * The name of the Resource Group where this Batch account exists.
     */
    resourceGroupName: pulumi.Input<string>;
}