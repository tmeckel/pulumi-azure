// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a Frontdoor Security Policy.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleResourceGroup = new azure.core.ResourceGroup("exampleResourceGroup", {location: "West Europe"});
 * const exampleFrontdoorProfile = new azure.cdn.FrontdoorProfile("exampleFrontdoorProfile", {resourceGroupName: exampleResourceGroup.name});
 * const exampleFrontdoorFirewallPolicy = new azure.cdn.FrontdoorFirewallPolicy("exampleFrontdoorFirewallPolicy", {
 *     resourceGroupName: exampleResourceGroup.name,
 *     skuName: exampleFrontdoorProfile.skuName,
 *     enabled: true,
 *     mode: "Prevention",
 *     redirectUrl: "https://www.contoso.com",
 *     customBlockResponseStatusCode: 403,
 *     customBlockResponseBody: "PGh0bWw+CjxoZWFkZXI+PHRpdGxlPkhlbGxvPC90aXRsZT48L2hlYWRlcj4KPGJvZHk+CkhlbGxvIHdvcmxkCjwvYm9keT4KPC9odG1sPg==",
 *     customRules: [{
 *         name: "Rule1",
 *         enabled: true,
 *         priority: 1,
 *         rateLimitDurationInMinutes: 1,
 *         rateLimitThreshold: 10,
 *         type: "MatchRule",
 *         action: "Block",
 *         matchConditions: [{
 *             matchVariable: "RemoteAddr",
 *             operator: "IPMatch",
 *             negationCondition: false,
 *             matchValues: [
 *                 "192.168.1.0/24",
 *                 "10.0.1.0/24",
 *             ],
 *         }],
 *     }],
 * });
 * const exampleFrontdoorSecurityPolicy = new azure.cdn.FrontdoorSecurityPolicy("exampleFrontdoorSecurityPolicy", {
 *     cdnFrontdoorProfileId: exampleFrontdoorProfile.id,
 *     securityPolicies: {
 *         firewall: {
 *             cdnFrontdoorFirewallPolicyId: exampleFrontdoorFirewallPolicy.id,
 *             association: {
 *                 domains: [{
 *                     cdnFrontdoorDomainId: azurerm_cdn_frontdoor_custom_domain.domain1.id,
 *                 }],
 *             },
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Frontdoor Security Policies can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/securityPolicies/policy1
 * ```
 */
export class FrontdoorSecurityPolicy extends pulumi.CustomResource {
    /**
     * Get an existing FrontdoorSecurityPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FrontdoorSecurityPolicyState, opts?: pulumi.CustomResourceOptions): FrontdoorSecurityPolicy {
        return new FrontdoorSecurityPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:cdn/frontdoorSecurityPolicy:FrontdoorSecurityPolicy';

    /**
     * Returns true if the given object is an instance of FrontdoorSecurityPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FrontdoorSecurityPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FrontdoorSecurityPolicy.__pulumiType;
    }

    /**
     * The Frontdoor Profile Resource Id that is linked to this Frontdoor Security Policy. Changing this forces a new Frontdoor Security Policy to be created.
     */
    public readonly cdnFrontdoorProfileId!: pulumi.Output<string>;
    /**
     * The name which should be used for this Frontdoor Security Policy. Possible values must not be an empty string. Changing this forces a new Frontdoor Security Policy to be created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * An `securityPolicies` block as defined below. Changing this forces a new Frontdoor Security Policy to be created.
     */
    public readonly securityPolicies!: pulumi.Output<outputs.cdn.FrontdoorSecurityPolicySecurityPolicies>;

    /**
     * Create a FrontdoorSecurityPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FrontdoorSecurityPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FrontdoorSecurityPolicyArgs | FrontdoorSecurityPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FrontdoorSecurityPolicyState | undefined;
            resourceInputs["cdnFrontdoorProfileId"] = state ? state.cdnFrontdoorProfileId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["securityPolicies"] = state ? state.securityPolicies : undefined;
        } else {
            const args = argsOrState as FrontdoorSecurityPolicyArgs | undefined;
            if ((!args || args.cdnFrontdoorProfileId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cdnFrontdoorProfileId'");
            }
            if ((!args || args.securityPolicies === undefined) && !opts.urn) {
                throw new Error("Missing required property 'securityPolicies'");
            }
            resourceInputs["cdnFrontdoorProfileId"] = args ? args.cdnFrontdoorProfileId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["securityPolicies"] = args ? args.securityPolicies : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FrontdoorSecurityPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FrontdoorSecurityPolicy resources.
 */
export interface FrontdoorSecurityPolicyState {
    /**
     * The Frontdoor Profile Resource Id that is linked to this Frontdoor Security Policy. Changing this forces a new Frontdoor Security Policy to be created.
     */
    cdnFrontdoorProfileId?: pulumi.Input<string>;
    /**
     * The name which should be used for this Frontdoor Security Policy. Possible values must not be an empty string. Changing this forces a new Frontdoor Security Policy to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * An `securityPolicies` block as defined below. Changing this forces a new Frontdoor Security Policy to be created.
     */
    securityPolicies?: pulumi.Input<inputs.cdn.FrontdoorSecurityPolicySecurityPolicies>;
}

/**
 * The set of arguments for constructing a FrontdoorSecurityPolicy resource.
 */
export interface FrontdoorSecurityPolicyArgs {
    /**
     * The Frontdoor Profile Resource Id that is linked to this Frontdoor Security Policy. Changing this forces a new Frontdoor Security Policy to be created.
     */
    cdnFrontdoorProfileId: pulumi.Input<string>;
    /**
     * The name which should be used for this Frontdoor Security Policy. Possible values must not be an empty string. Changing this forces a new Frontdoor Security Policy to be created.
     */
    name?: pulumi.Input<string>;
    /**
     * An `securityPolicies` block as defined below. Changing this forces a new Frontdoor Security Policy to be created.
     */
    securityPolicies: pulumi.Input<inputs.cdn.FrontdoorSecurityPolicySecurityPolicies>;
}