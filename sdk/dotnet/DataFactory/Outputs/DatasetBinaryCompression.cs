// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.DataFactory.Outputs
{

    [OutputType]
    public sealed class DatasetBinaryCompression
    {
        /// <summary>
        /// The level of compression. Possible values are `Fastest` and `Optimal`.
        /// </summary>
        public readonly string? Level;
        /// <summary>
        /// The type of compression used during transport.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private DatasetBinaryCompression(
            string? level,

            string type)
        {
            Level = level;
            Type = type;
        }
    }
}