// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { SpacecraftArgs, SpacecraftState } from "./spacecraft";
export type Spacecraft = import("./spacecraft").Spacecraft;
export const Spacecraft: typeof import("./spacecraft").Spacecraft = null as any;
utilities.lazyLoad(exports, ["Spacecraft"], () => require("./spacecraft"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:orbital/spacecraft:Spacecraft":
                return new Spacecraft(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "orbital/spacecraft", _module)