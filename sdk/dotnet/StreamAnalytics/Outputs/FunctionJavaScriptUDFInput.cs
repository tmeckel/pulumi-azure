// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.StreamAnalytics.Outputs
{

    [OutputType]
    public sealed class FunctionJavaScriptUDFInput
    {
        /// <summary>
        /// The Data Type for the Input Argument of this JavaScript Function. Possible values include `array`, `any`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private FunctionJavaScriptUDFInput(string type)
        {
            Type = type;
        }
    }
}