// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network
{
    public static class GetTrafficManagerProfile
    {
        /// <summary>
        /// Use this data source to access information about an existing Traffic Manager Profile.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Azure.Network.GetTrafficManagerProfile.InvokeAsync(new Azure.Network.GetTrafficManagerProfileArgs
        ///         {
        ///             Name = "test",
        ///             ResourceGroupName = "test",
        ///         }));
        ///         this.TrafficRoutingMethod = data.Azurerm_traffic_manager_profile.Traffic_routing_method;
        ///     }
        /// 
        ///     [Output("trafficRoutingMethod")]
        ///     public Output&lt;string&gt; TrafficRoutingMethod { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTrafficManagerProfileResult> InvokeAsync(GetTrafficManagerProfileArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTrafficManagerProfileResult>("azure:network/getTrafficManagerProfile:getTrafficManagerProfile", args ?? new GetTrafficManagerProfileArgs(), options.WithVersion());
    }


    public sealed class GetTrafficManagerProfileArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the Traffic Manager Profile.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetTrafficManagerProfileArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTrafficManagerProfileResult
    {
        /// <summary>
        /// This block specifies the DNS configuration of the Profile.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTrafficManagerProfileDnsConfigResult> DnsConfigs;
        /// <summary>
        /// The FQDN of the created Profile.
        /// </summary>
        public readonly string Fqdn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// This block specifies the Endpoint monitoring configuration for the Profile.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTrafficManagerProfileMonitorConfigResult> MonitorConfigs;
        /// <summary>
        /// The name of the custom header.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The status of the profile.
        /// </summary>
        public readonly string ProfileStatus;
        public readonly string ResourceGroupName;
        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        /// <summary>
        /// Specifies the algorithm used to route traffic.
        /// </summary>
        public readonly string TrafficRoutingMethod;

        [OutputConstructor]
        private GetTrafficManagerProfileResult(
            ImmutableArray<Outputs.GetTrafficManagerProfileDnsConfigResult> dnsConfigs,

            string fqdn,

            string id,

            ImmutableArray<Outputs.GetTrafficManagerProfileMonitorConfigResult> monitorConfigs,

            string name,

            string profileStatus,

            string resourceGroupName,

            ImmutableDictionary<string, string>? tags,

            string trafficRoutingMethod)
        {
            DnsConfigs = dnsConfigs;
            Fqdn = fqdn;
            Id = id;
            MonitorConfigs = monitorConfigs;
            Name = name;
            ProfileStatus = profileStatus;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
            TrafficRoutingMethod = trafficRoutingMethod;
        }
    }
}