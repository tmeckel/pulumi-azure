// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class ResourceGroupPolicyRemediation extends pulumi.CustomResource {
    /**
     * Get an existing ResourceGroupPolicyRemediation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResourceGroupPolicyRemediationState, opts?: pulumi.CustomResourceOptions): ResourceGroupPolicyRemediation {
        return new ResourceGroupPolicyRemediation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:core/resourceGroupPolicyRemediation:ResourceGroupPolicyRemediation';

    /**
     * Returns true if the given object is an instance of ResourceGroupPolicyRemediation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourceGroupPolicyRemediation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourceGroupPolicyRemediation.__pulumiType;
    }

    public readonly locationFilters!: pulumi.Output<string[] | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly policyAssignmentId!: pulumi.Output<string>;
    public readonly policyDefinitionId!: pulumi.Output<string | undefined>;
    public readonly resourceDiscoveryMode!: pulumi.Output<string | undefined>;
    public readonly resourceGroupId!: pulumi.Output<string>;

    /**
     * Create a ResourceGroupPolicyRemediation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResourceGroupPolicyRemediationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResourceGroupPolicyRemediationArgs | ResourceGroupPolicyRemediationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResourceGroupPolicyRemediationState | undefined;
            resourceInputs["locationFilters"] = state ? state.locationFilters : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyAssignmentId"] = state ? state.policyAssignmentId : undefined;
            resourceInputs["policyDefinitionId"] = state ? state.policyDefinitionId : undefined;
            resourceInputs["resourceDiscoveryMode"] = state ? state.resourceDiscoveryMode : undefined;
            resourceInputs["resourceGroupId"] = state ? state.resourceGroupId : undefined;
        } else {
            const args = argsOrState as ResourceGroupPolicyRemediationArgs | undefined;
            if ((!args || args.policyAssignmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyAssignmentId'");
            }
            if ((!args || args.resourceGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceGroupId'");
            }
            resourceInputs["locationFilters"] = args ? args.locationFilters : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyAssignmentId"] = args ? args.policyAssignmentId : undefined;
            resourceInputs["policyDefinitionId"] = args ? args.policyDefinitionId : undefined;
            resourceInputs["resourceDiscoveryMode"] = args ? args.resourceDiscoveryMode : undefined;
            resourceInputs["resourceGroupId"] = args ? args.resourceGroupId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ResourceGroupPolicyRemediation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResourceGroupPolicyRemediation resources.
 */
export interface ResourceGroupPolicyRemediationState {
    locationFilters?: pulumi.Input<pulumi.Input<string>[]>;
    name?: pulumi.Input<string>;
    policyAssignmentId?: pulumi.Input<string>;
    policyDefinitionId?: pulumi.Input<string>;
    resourceDiscoveryMode?: pulumi.Input<string>;
    resourceGroupId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ResourceGroupPolicyRemediation resource.
 */
export interface ResourceGroupPolicyRemediationArgs {
    locationFilters?: pulumi.Input<pulumi.Input<string>[]>;
    name?: pulumi.Input<string>;
    policyAssignmentId: pulumi.Input<string>;
    policyDefinitionId?: pulumi.Input<string>;
    resourceDiscoveryMode?: pulumi.Input<string>;
    resourceGroupId: pulumi.Input<string>;
}