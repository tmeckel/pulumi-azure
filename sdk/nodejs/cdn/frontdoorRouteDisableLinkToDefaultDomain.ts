// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages the Link To Default Domain property of a CDN FrontDoor Route.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const example = new azure.cdn.FrontdoorRouteDisableLinkToDefaultDomain("example", {
 *     cdnFrontdoorRouteId: azurerm_cdn_frontdoor_route.example.id,
 *     cdnFrontdoorCustomDomainIds: [
 *         azurerm_cdn_frontdoor_custom_domain.contoso.id,
 *         azurerm_cdn_frontdoor_custom_domain.fabrikam.id,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Frontdoor Routes can be imported using the `resource id`, e.g.
 *
 * ```sh
 *  $ pulumi import azure:cdn/frontdoorRouteDisableLinkToDefaultDomain:FrontdoorRouteDisableLinkToDefaultDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/afdEndpoints/endpoint1/routes/route1/disableLinkToDefaultDomain/disableLinkToDefaultDomain1
 * ```
 */
export class FrontdoorRouteDisableLinkToDefaultDomain extends pulumi.CustomResource {
    /**
     * Get an existing FrontdoorRouteDisableLinkToDefaultDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FrontdoorRouteDisableLinkToDefaultDomainState, opts?: pulumi.CustomResourceOptions): FrontdoorRouteDisableLinkToDefaultDomain {
        return new FrontdoorRouteDisableLinkToDefaultDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'azure:cdn/frontdoorRouteDisableLinkToDefaultDomain:FrontdoorRouteDisableLinkToDefaultDomain';

    /**
     * Returns true if the given object is an instance of FrontdoorRouteDisableLinkToDefaultDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FrontdoorRouteDisableLinkToDefaultDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FrontdoorRouteDisableLinkToDefaultDomain.__pulumiType;
    }

    /**
     * The resource IDs of the CDN FrontDoor Custom Domains which are associated with this CDN FrontDoor Route. Changing this forces a new Frontdoor Route to be created.
     */
    public readonly cdnFrontdoorCustomDomainIds!: pulumi.Output<string[]>;
    /**
     * The resource ID of the CDN FrontDoor Route where the Link To Default Domain property should be `disabled`. Changing this forces a new Frontdoor Route to be created.
     */
    public readonly cdnFrontdoorRouteId!: pulumi.Output<string>;

    /**
     * Create a FrontdoorRouteDisableLinkToDefaultDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FrontdoorRouteDisableLinkToDefaultDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FrontdoorRouteDisableLinkToDefaultDomainArgs | FrontdoorRouteDisableLinkToDefaultDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FrontdoorRouteDisableLinkToDefaultDomainState | undefined;
            resourceInputs["cdnFrontdoorCustomDomainIds"] = state ? state.cdnFrontdoorCustomDomainIds : undefined;
            resourceInputs["cdnFrontdoorRouteId"] = state ? state.cdnFrontdoorRouteId : undefined;
        } else {
            const args = argsOrState as FrontdoorRouteDisableLinkToDefaultDomainArgs | undefined;
            if ((!args || args.cdnFrontdoorCustomDomainIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cdnFrontdoorCustomDomainIds'");
            }
            if ((!args || args.cdnFrontdoorRouteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cdnFrontdoorRouteId'");
            }
            resourceInputs["cdnFrontdoorCustomDomainIds"] = args ? args.cdnFrontdoorCustomDomainIds : undefined;
            resourceInputs["cdnFrontdoorRouteId"] = args ? args.cdnFrontdoorRouteId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FrontdoorRouteDisableLinkToDefaultDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FrontdoorRouteDisableLinkToDefaultDomain resources.
 */
export interface FrontdoorRouteDisableLinkToDefaultDomainState {
    /**
     * The resource IDs of the CDN FrontDoor Custom Domains which are associated with this CDN FrontDoor Route. Changing this forces a new Frontdoor Route to be created.
     */
    cdnFrontdoorCustomDomainIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The resource ID of the CDN FrontDoor Route where the Link To Default Domain property should be `disabled`. Changing this forces a new Frontdoor Route to be created.
     */
    cdnFrontdoorRouteId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FrontdoorRouteDisableLinkToDefaultDomain resource.
 */
export interface FrontdoorRouteDisableLinkToDefaultDomainArgs {
    /**
     * The resource IDs of the CDN FrontDoor Custom Domains which are associated with this CDN FrontDoor Route. Changing this forces a new Frontdoor Route to be created.
     */
    cdnFrontdoorCustomDomainIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The resource ID of the CDN FrontDoor Route where the Link To Default Domain property should be `disabled`. Changing this forces a new Frontdoor Route to be created.
     */
    cdnFrontdoorRouteId: pulumi.Input<string>;
}