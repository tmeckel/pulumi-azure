// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Use this data source to access information about an existing EventGrid Domain Topic
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = pulumi.output(azure.eventgrid.getDomainTopic({
 *     name: "my-eventgrid-domain-topic",
 *     resourceGroupName: "example-resources",
 * }, { async: true }));
 * ```
 */
export function getDomainTopic(args: GetDomainTopicArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainTopicResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("azure:eventgrid/getDomainTopic:getDomainTopic", {
        "domainName": args.domainName,
        "name": args.name,
        "resourceGroupName": args.resourceGroupName,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomainTopic.
 */
export interface GetDomainTopicArgs {
    /**
     * The name of the EventGrid Domain Topic domain.
     */
    readonly domainName: string;
    /**
     * The name of the EventGrid Domain Topic resource.
     */
    readonly name: string;
    /**
     * The name of the resource group in which the EventGrid Domain Topic exists.
     */
    readonly resourceGroupName: string;
}

/**
 * A collection of values returned by getDomainTopic.
 */
export interface GetDomainTopicResult {
    /**
     * The EventGrid Domain Topic Domain name.
     */
    readonly domainName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly resourceGroupName: string;
}