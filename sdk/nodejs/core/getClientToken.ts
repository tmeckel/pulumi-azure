// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this function to get an Azure authentication token for the current login context.
 */
export function getClientToken(opts?: pulumi.InvokeOptions): Promise<GetClientTokenResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:core/getClientToken:getClientToken", {
    }, opts);
}

export interface GetClientTokenResult {
    /**
     * Expiration time of OAuth token
     */
    readonly expiresOn?: string;
    /**
     * OAuth token for based on scope and endpoint.
     */
    readonly token: string;
}