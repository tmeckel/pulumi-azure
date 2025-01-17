// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this data source to get all variables in an Automation Account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleAccount = azure.automation.getAccount({
 *     name: "example-account",
 *     resourceGroupName: "example-resources",
 * });
 * const exampleVariables = exampleAccount.then(exampleAccount => azure.automation.getVariables({
 *     automationAccountId: exampleAccount.id,
 * }));
 * export const stringVars = data.azurerm_automation_variable_string.example.string;
 * ```
 */
export function getVariables(args: GetVariablesArgs, opts?: pulumi.InvokeOptions): Promise<GetVariablesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("azure:automation/getVariables:getVariables", {
        "automationAccountId": args.automationAccountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVariables.
 */
export interface GetVariablesArgs {
    /**
     * The resource ID of the automation account.
     */
    automationAccountId: string;
}

/**
 * A collection of values returned by getVariables.
 */
export interface GetVariablesResult {
    readonly automationAccountId: string;
    /**
     * One or more `variable` blocks as defined below for each boolean variable.
     */
    readonly bools: outputs.automation.GetVariablesBool[];
    /**
     * One or more `variable` blocks as defined below for each datetime variable.
     */
    readonly datetimes: outputs.automation.GetVariablesDatetime[];
    /**
     * Specifies if the Automation Variable is encrypted.
     */
    readonly encrypteds: outputs.automation.GetVariablesEncrypted[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * One or more `variable` blocks as defined below for each int variable.
     */
    readonly ints: outputs.automation.GetVariablesInt[];
    /**
     * One or more `variable` blocks as defined below for each null variable.
     */
    readonly nulls: outputs.automation.GetVariablesNull[];
    readonly objects: outputs.automation.GetVariablesObject[];
    /**
     * One or more `variable` blocks as defined below for each string variable.
     */
    readonly strings: outputs.automation.GetVariablesString[];
}
/**
 * Use this data source to get all variables in an Automation Account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as azure from "@pulumi/azure";
 *
 * const exampleAccount = azure.automation.getAccount({
 *     name: "example-account",
 *     resourceGroupName: "example-resources",
 * });
 * const exampleVariables = exampleAccount.then(exampleAccount => azure.automation.getVariables({
 *     automationAccountId: exampleAccount.id,
 * }));
 * export const stringVars = data.azurerm_automation_variable_string.example.string;
 * ```
 */
export function getVariablesOutput(args: GetVariablesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVariablesResult> {
    return pulumi.output(args).apply((a: any) => getVariables(a, opts))
}

/**
 * A collection of arguments for invoking getVariables.
 */
export interface GetVariablesOutputArgs {
    /**
     * The resource ID of the automation account.
     */
    automationAccountId: pulumi.Input<string>;
}
