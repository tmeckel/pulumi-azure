// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Mobile Network Sim Policy.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleNetwork = new azure.mobile.Network("exampleNetwork", {
 *     location: exampleResourceGroup.location,
 *     resourceGroupName: exampleResourceGroup.name,
 *     mobileCountryCode: "001",
 *     mobileNetworkCode: "01",
 * });
 * const exampleNetworkDataNetwork = new azure.mobile.NetworkDataNetwork("exampleNetworkDataNetwork", {
 *     mobileNetworkId: exampleNetwork.id,
 *     location: exampleResourceGroup.location,
 * });
 * const exampleNetworkService = new azure.mobile.NetworkService("exampleNetworkService", {
 *     mobileNetworkId: exampleNetwork.id,
 *     location: exampleResourceGroup.location,
 *     servicePrecedence: 0,
 *     pccRules: [{
 *         name: "default-rule",
 *         precedence: 1,
 *         trafficControlEnabled: true,
 *         serviceDataFlowTemplates: [{
 *             direction: "Uplink",
 *             name: "IP-to-server",
 *             ports: [],
 *             protocols: ["ip"],
 *             remoteIpLists: ["10.3.4.0/24"],
 *         }],
 *     }],
 * });
 * const exampleNetworkSlice = new azure.mobile.NetworkSlice("exampleNetworkSlice", {
 *     mobileNetworkId: exampleNetwork.id,
 *     location: exampleResourceGroup.location,
 *     singleNetworkSliceSelectionAssistanceInformation: {
 *         sliceServiceType: 1,
 *     },
 * });
 * const exampleNetworkSimPolicy = new azure.mobile.NetworkSimPolicy("exampleNetworkSimPolicy", {
 *     mobileNetworkId: exampleNetwork.id,
 *     location: exampleResourceGroup.location,
 *     registrationTimerInSeconds: 3240,
 *     defaultSliceId: exampleNetworkSlice.id,
 *     slices: [{
 *         defaultDataNetworkId: exampleNetworkDataNetwork.id,
 *         sliceId: exampleNetworkSlice.id,
 *         dataNetworks: [{
 *             dataNetworkId: exampleNetworkDataNetwork.id,
 *             allocationAndRetentionPriorityLevel: 9,
 *             defaultSessionType: "IPv4",
 *             qosIndicator: 9,
 *             preemptionCapability: "NotPreempt",
 *             preemptionVulnerability: "Preemptable",
 *             allowedServicesIds: [exampleNetworkService.id],
 *             sessionAggregateMaximumBitRate: {
 *                 downlink: "1 Gbps",
 *                 uplink: "500 Mbps",
 *             },
 *         }],
 *     }],
 *     userEquipmentAggregateMaximumBitRate: {
 *         downlink: "1 Gbps",
 *         uplink: "500 Mbps",
 *     },
 *     tags: {
 *         key: "value",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Mobile Network Sim Policies can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:mobile/networkSimPolicy:NetworkSimPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.MobileNetwork/mobileNetworks/mobileNetwork1/simPolicies/simPolicy1
 * ```
 */
export class NetworkSimPolicy extends pulumi.CustomResource {
    /**
     * Get an existing NetworkSimPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkSimPolicyState, opts?: pulumi.CustomResourceOptions): NetworkSimPolicy {
        return new NetworkSimPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:mobile/networkSimPolicy:NetworkSimPolicy';

    /**
     * Returns true if the given object is an instance of NetworkSimPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkSimPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkSimPolicy.__pulumiType;
    }

    /**
     * The ID of default slice to use if the UE does not explicitly specify it. This slice must exist in the `slice` block.
     */
    public readonly defaultSliceId!: pulumi.Output<string>;
    /**
     * Specifies the Azure Region where the Mobile Network Sim Policy should exist. Changing this forces a new Mobile Network Sim Policies to be created.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * The ID of the Mobile Network which the Sim Policy belongs to. Changing this forces a new Mobile Network Sim Policies to be created.
     */
    public readonly mobileNetworkId!: pulumi.Output<string>;
    /**
     * The name which should be used for this Mobile Network Sim Policies. Changing this forces a new Mobile Network Sim Policies to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413.
     */
    public readonly ratFrequencySelectionPriorityIndex!: pulumi.Output<number | undefined>;
    /**
     * Interval for the user equipment periodic registration update procedure. Defaults to `3240`.
     */
    public readonly registrationTimerInSeconds!: pulumi.Output<number | undefined>;
    /**
     * An array of `slice` block as defined below. The allowed slices and the settings to use for them. The list must not contain duplicate items and must contain at least one item.
     */
    public readonly slices!: pulumi.Output<outputs.mobile.NetworkSimPolicySlice[]>;
    /**
     * A mapping of tags which should be assigned to the Mobile Network Sim Policies.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A `userEquipmentAggregateMaximumBitRate` block as defined below.
     */
    public readonly userEquipmentAggregateMaximumBitRate!: pulumi.Output<outputs.mobile.NetworkSimPolicyUserEquipmentAggregateMaximumBitRate>;

    /**
     * Create a NetworkSimPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkSimPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkSimPolicyArgs | NetworkSimPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkSimPolicyState | undefined;
            resourceInputs["defaultSliceId"] = state ? state.defaultSliceId : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["mobileNetworkId"] = state ? state.mobileNetworkId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ratFrequencySelectionPriorityIndex"] = state ? state.ratFrequencySelectionPriorityIndex : undefined;
            resourceInputs["registrationTimerInSeconds"] = state ? state.registrationTimerInSeconds : undefined;
            resourceInputs["slices"] = state ? state.slices : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userEquipmentAggregateMaximumBitRate"] = state ? state.userEquipmentAggregateMaximumBitRate : undefined;
        } else {
            const args = argsOrState as NetworkSimPolicyArgs | undefined;
            if ((!args || args.defaultSliceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultSliceId'");
            }
            if ((!args || args.mobileNetworkId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'mobileNetworkId'");
            }
            if ((!args || args.slices === undefined) && !opts.urn) {
                throw new Error("Missing required property 'slices'");
            }
            if ((!args || args.userEquipmentAggregateMaximumBitRate === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userEquipmentAggregateMaximumBitRate'");
            }
            resourceInputs["defaultSliceId"] = args ? args.defaultSliceId : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["mobileNetworkId"] = args ? args.mobileNetworkId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ratFrequencySelectionPriorityIndex"] = args ? args.ratFrequencySelectionPriorityIndex : undefined;
            resourceInputs["registrationTimerInSeconds"] = args ? args.registrationTimerInSeconds : undefined;
            resourceInputs["slices"] = args ? args.slices : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userEquipmentAggregateMaximumBitRate"] = args ? args.userEquipmentAggregateMaximumBitRate : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkSimPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkSimPolicy resources.
 */
export interface NetworkSimPolicyState {
    /**
     * The ID of default slice to use if the UE does not explicitly specify it. This slice must exist in the `slice` block.
     */
    defaultSliceId?: pulumi.Input<string>;
    /**
     * Specifies the Azure Region where the Mobile Network Sim Policy should exist. Changing this forces a new Mobile Network Sim Policies to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the Mobile Network which the Sim Policy belongs to. Changing this forces a new Mobile Network Sim Policies to be created.
     */
    mobileNetworkId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Mobile Network Sim Policies. Changing this forces a new Mobile Network Sim Policies to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413.
     */
    ratFrequencySelectionPriorityIndex?: pulumi.Input<number>;
    /**
     * Interval for the user equipment periodic registration update procedure. Defaults to `3240`.
     */
    registrationTimerInSeconds?: pulumi.Input<number>;
    /**
     * An array of `slice` block as defined below. The allowed slices and the settings to use for them. The list must not contain duplicate items and must contain at least one item.
     */
    slices?: pulumi.Input<pulumi.Input<inputs.mobile.NetworkSimPolicySlice>[]>;
    /**
     * A mapping of tags which should be assigned to the Mobile Network Sim Policies.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A `userEquipmentAggregateMaximumBitRate` block as defined below.
     */
    userEquipmentAggregateMaximumBitRate?: pulumi.Input<inputs.mobile.NetworkSimPolicyUserEquipmentAggregateMaximumBitRate>;
}

/**
 * The set of arguments for constructing a NetworkSimPolicy resource.
 */
export interface NetworkSimPolicyArgs {
    /**
     * The ID of default slice to use if the UE does not explicitly specify it. This slice must exist in the `slice` block.
     */
    defaultSliceId: pulumi.Input<string>;
    /**
     * Specifies the Azure Region where the Mobile Network Sim Policy should exist. Changing this forces a new Mobile Network Sim Policies to be created.
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the Mobile Network which the Sim Policy belongs to. Changing this forces a new Mobile Network Sim Policies to be created.
     */
    mobileNetworkId: pulumi.Input<string>;
    /**
     * The name which should be used for this Mobile Network Sim Policies. Changing this forces a new Mobile Network Sim Policies to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * RAT/Frequency Selection Priority Index, defined in 3GPP TS 36.413.
     */
    ratFrequencySelectionPriorityIndex?: pulumi.Input<number>;
    /**
     * Interval for the user equipment periodic registration update procedure. Defaults to `3240`.
     */
    registrationTimerInSeconds?: pulumi.Input<number>;
    /**
     * An array of `slice` block as defined below. The allowed slices and the settings to use for them. The list must not contain duplicate items and must contain at least one item.
     */
    slices: pulumi.Input<pulumi.Input<inputs.mobile.NetworkSimPolicySlice>[]>;
    /**
     * A mapping of tags which should be assigned to the Mobile Network Sim Policies.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A `userEquipmentAggregateMaximumBitRate` block as defined below.
     */
    userEquipmentAggregateMaximumBitRate: pulumi.Input<inputs.mobile.NetworkSimPolicyUserEquipmentAggregateMaximumBitRate>;
}