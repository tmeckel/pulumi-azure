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
    public sealed class WindowsWebAppSlotLogs
    {
        /// <summary>
        /// A `application_logs` block as defined above.
        /// </summary>
        public readonly Outputs.WindowsWebAppSlotLogsApplicationLogs? ApplicationLogs;
        /// <summary>
        /// Should detailed error messages be enabled.
        /// </summary>
        public readonly bool? DetailedErrorMessages;
        /// <summary>
        /// Should failed request tracing be enabled.
        /// </summary>
        public readonly bool? FailedRequestTracing;
        /// <summary>
        /// An `http_logs` block as defined above.
        /// </summary>
        public readonly Outputs.WindowsWebAppSlotLogsHttpLogs? HttpLogs;

        [OutputConstructor]
        private WindowsWebAppSlotLogs(
            Outputs.WindowsWebAppSlotLogsApplicationLogs? applicationLogs,

            bool? detailedErrorMessages,

            bool? failedRequestTracing,

            Outputs.WindowsWebAppSlotLogsHttpLogs? httpLogs)
        {
            ApplicationLogs = applicationLogs;
            DetailedErrorMessages = detailedErrorMessages;
            FailedRequestTracing = failedRequestTracing;
            HttpLogs = httpLogs;
        }
    }
}