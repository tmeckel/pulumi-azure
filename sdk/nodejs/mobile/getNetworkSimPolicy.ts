// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Get information about a Mobile Network Sim Policy.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleNetwork = azure.mobile.getNetwork({
 *     name: "example-mn",
 *     resourceGroupName: "example-rg",
 * });
 * const exampleNetworkSimPolicy = exampleNetwork.then(exampleNetwork => azure.mobile.getNetworkSimPolicy({
 *     name: "example-mnsp",
 *     mobileNetworkId: exampleNetwork.id,
 * }));
 * ```
 */
export function getNetworkSimPolicy(args: GetNetworkSimPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkSimPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:mobile/getNetworkSimPolicy:getNetworkSimPolicy", {
        "mobileNetworkId": args.mobileNetworkId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkSimPolicy.
 */
export interface GetNetworkSimPolicyArgs {
    /**
     * The ID of the Mobile Network which the Sim Policy belongs to.
     */
    mobileNetworkId: string;
    /**
     * The name which should be used for this Mobile Network Sim Policies.
     */
    name: string;
}

/**
 * A collection of values returned by getNetworkSimPolicy.
 */
export interface GetNetworkSimPolicyResult {
    /**
     * The ID of default slice to use if the UE does not explicitly specify it.
     */
    readonly defaultSliceId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The Azure Region where the Mobile Network Sim Policy should exist.
     */
    readonly location: string;
    readonly mobileNetworkId: string;
    readonly name: string;
    /**
     * RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413.
     */
    readonly ratFrequencySelectionPriorityIndex: number;
    /**
     * Interval for the UE periodic registration update procedure.
     */
    readonly registrationTimerInSeconds: number;
    /**
     * An array of `slice` block as defined below. The allowed slices and the settings to use for them.
     */
    readonly slices: outputs.mobile.GetNetworkSimPolicySlice[];
    /**
     * A mapping of tags which should be assigned to the Mobile Network Sim Policies.
     */
    readonly tags: {[key: string]: string};
    /**
     * A `userEquipmentAggregateMaximumBitRate` block as defined below.
     */
    readonly userEquipmentAggregateMaximumBitRates: outputs.mobile.GetNetworkSimPolicyUserEquipmentAggregateMaximumBitRate[];
}
/**
 * Get information about a Mobile Network Sim Policy.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleNetwork = azure.mobile.getNetwork({
 *     name: "example-mn",
 *     resourceGroupName: "example-rg",
 * });
 * const exampleNetworkSimPolicy = exampleNetwork.then(exampleNetwork => azure.mobile.getNetworkSimPolicy({
 *     name: "example-mnsp",
 *     mobileNetworkId: exampleNetwork.id,
 * }));
 * ```
 */
export function getNetworkSimPolicyOutput(args: GetNetworkSimPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkSimPolicyResult> {
    return pulumi.output(args).apply((a: any) => getNetworkSimPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getNetworkSimPolicy.
 */
export interface GetNetworkSimPolicyOutputArgs {
    /**
     * The ID of the Mobile Network which the Sim Policy belongs to.
     */
    mobileNetworkId: pulumi.Input<string>;
    /**
     * The name which should be used for this Mobile Network Sim Policies.
     */
    name: pulumi.Input<string>;
}