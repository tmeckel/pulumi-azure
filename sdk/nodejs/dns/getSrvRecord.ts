// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.dns.SrvRecord("example", {
 *     zoneName: "test-zone",
 *     resourceGroupName: "test-rg",
 * });
 * export const dnsSrvRecordId = example.id;
 * ```
 */
export function getSrvRecord(args: GetSrvRecordArgs, opts?: pulumi.InvokeOptions): Promise<GetSrvRecordResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("azure:dns/getSrvRecord:getSrvRecord", {
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
        "zoneName": args.zoneName,
    }, opts);
}

/**
 * A collection of arguments for invoking getSrvRecord.
 */
export interface GetSrvRecordArgs {
    /**
     * The name of the DNS SRV Record.
     */
    name: string;
    /**
     * Specifies the resource group where the DNS Zone (parent resource) exists.
     */
    resourceGroupName: string;
    /**
     * Specifies the DNS Zone where the resource exists.
     */
    zoneName: string;
}

/**
 * A collection of values returned by getSrvRecord.
 */
export interface GetSrvRecordResult {
    /**
     * The FQDN of the DNS SRV Record.
     */
    readonly fqdn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * A list of values that make up the SRV record. Each `record` block supports fields documented below.
     */
    readonly records: outputs.dns.GetSrvRecordRecord[];
    readonly resourceGroupName: string;
    /**
     * A mapping of tags assigned to the resource.
     */
    readonly tags: {[key: string]: string};
    /**
     * The Time To Live (TTL) of the DNS record in seconds.
     */
    readonly ttl: number;
    readonly zoneName: string;
}

export function getSrvRecordOutput(args: GetSrvRecordOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSrvRecordResult> {
    return pulumi.output(args).apply(a => getSrvRecord(a, opts))
}

/**
 * A collection of arguments for invoking getSrvRecord.
 */
export interface GetSrvRecordOutputArgs {
    /**
     * The name of the DNS SRV Record.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the resource group where the DNS Zone (parent resource) exists.
     */
    resourceGroupName: pulumi.Input<string>;
    /**
     * Specifies the DNS Zone where the resource exists.
     */
    zoneName: pulumi.Input<string>;
}