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
    public sealed class GetLinuxWebAppSiteConfigApplicationStackResult
    {
        /// <summary>
        /// The Docker image reference, including repository.
        /// </summary>
        public readonly string DockerImage;
        /// <summary>
        /// The image Tag.
        /// </summary>
        public readonly string DockerImageTag;
        /// <summary>
        /// The version of .Net in use.
        /// </summary>
        public readonly string DotnetVersion;
        /// <summary>
        /// The java server type.
        /// </summary>
        public readonly string JavaServer;
        /// <summary>
        /// The Version of the `java_server` in use.
        /// </summary>
        public readonly string JavaServerVersion;
        /// <summary>
        /// The Version of Java in use.
        /// </summary>
        public readonly string JavaVersion;
        /// <summary>
        /// The version of Node in use.
        /// </summary>
        public readonly string NodeVersion;
        /// <summary>
        /// The version of PHP in use.
        /// </summary>
        public readonly string PhpVersion;
        /// <summary>
        /// The version of Python in use.
        /// </summary>
        public readonly string PythonVersion;
        /// <summary>
        /// The version of Ruby in use.
        /// </summary>
        public readonly string RubyVersion;

        [OutputConstructor]
        private GetLinuxWebAppSiteConfigApplicationStackResult(
            string dockerImage,

            string dockerImageTag,

            string dotnetVersion,

            string javaServer,

            string javaServerVersion,

            string javaVersion,

            string nodeVersion,

            string phpVersion,

            string pythonVersion,

            string rubyVersion)
        {
            DockerImage = dockerImage;
            DockerImageTag = dockerImageTag;
            DotnetVersion = dotnetVersion;
            JavaServer = javaServer;
            JavaServerVersion = javaServerVersion;
            JavaVersion = javaVersion;
            NodeVersion = nodeVersion;
            PhpVersion = phpVersion;
            PythonVersion = pythonVersion;
            RubyVersion = rubyVersion;
        }
    }
}