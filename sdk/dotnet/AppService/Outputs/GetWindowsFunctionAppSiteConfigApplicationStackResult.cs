// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService.Outputs
{

    [OutputType]
    public sealed class GetWindowsFunctionAppSiteConfigApplicationStackResult
    {
        /// <summary>
        /// The version of .Net to use.
        /// </summary>
        public readonly string DotnetVersion;
        /// <summary>
        /// The version of Java to use.
        /// </summary>
        public readonly string JavaVersion;
        /// <summary>
        /// The version of Node to use.
        /// </summary>
        public readonly string NodeVersion;
        /// <summary>
        /// The version of PowerShell Core to use.
        /// </summary>
        public readonly string PowershellCoreVersion;
        /// <summary>
        /// Is the Windows Function App using a custom runtime?.
        /// </summary>
        public readonly bool UseCustomRuntime;
        public readonly bool UseDotnetIsolatedRuntime;

        [OutputConstructor]
        private GetWindowsFunctionAppSiteConfigApplicationStackResult(
            string dotnetVersion,

            string javaVersion,

            string nodeVersion,

            string powershellCoreVersion,

            bool useCustomRuntime,

            bool useDotnetIsolatedRuntime)
        {
            DotnetVersion = dotnetVersion;
            JavaVersion = javaVersion;
            NodeVersion = nodeVersion;
            PowershellCoreVersion = powershellCoreVersion;
            UseCustomRuntime = useCustomRuntime;
            UseDotnetIsolatedRuntime = useDotnetIsolatedRuntime;
        }
    }
}