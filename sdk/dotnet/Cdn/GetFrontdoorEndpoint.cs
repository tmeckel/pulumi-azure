// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cdn
{
    public static class GetFrontdoorEndpoint
    {
        /// <summary>
        /// Use this data source to access information about an existing CDN FrontDoor Endpoint.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Cdn.GetFrontdoorEndpoint.Invoke(new()
        ///     {
        ///         Name = "existing-endpoint",
        ///         ProfileName = "existing-cdn-profile",
        ///         ResourceGroupName = "existing-resources",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFrontdoorEndpointResult> InvokeAsync(GetFrontdoorEndpointArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFrontdoorEndpointResult>("azure:cdn/getFrontdoorEndpoint:getFrontdoorEndpoint", args ?? new GetFrontdoorEndpointArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to access information about an existing CDN FrontDoor Endpoint.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Azure.Cdn.GetFrontdoorEndpoint.Invoke(new()
        ///     {
        ///         Name = "existing-endpoint",
        ///         ProfileName = "existing-cdn-profile",
        ///         ResourceGroupName = "existing-resources",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetFrontdoorEndpointResult> Invoke(GetFrontdoorEndpointInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFrontdoorEndpointResult>("azure:cdn/getFrontdoorEndpoint:getFrontdoorEndpoint", args ?? new GetFrontdoorEndpointInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFrontdoorEndpointArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the FrontDoor Endpoint.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The name of the FrontDoor Profile within which CDN FrontDoor Endpoint exists.
        /// </summary>
        [Input("profileName", required: true)]
        public string ProfileName { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the CDN FrontDoor Profile exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        public GetFrontdoorEndpointArgs()
        {
        }
        public static new GetFrontdoorEndpointArgs Empty => new GetFrontdoorEndpointArgs();
    }

    public sealed class GetFrontdoorEndpointInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the name of the FrontDoor Endpoint.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the FrontDoor Profile within which CDN FrontDoor Endpoint exists.
        /// </summary>
        [Input("profileName", required: true)]
        public Input<string> ProfileName { get; set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the CDN FrontDoor Profile exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        public GetFrontdoorEndpointInvokeArgs()
        {
        }
        public static new GetFrontdoorEndpointInvokeArgs Empty => new GetFrontdoorEndpointInvokeArgs();
    }


    [OutputType]
    public sealed class GetFrontdoorEndpointResult
    {
        /// <summary>
        /// Specifies whether this CDN FrontDoor Endpoint is enabled or not.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Specifies the host name of the CDN FrontDoor Endpoint, in the format `{endpointName}.{dnsZone}` (for example, `contoso.azureedge.net`).
        /// </summary>
        public readonly string HostName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string ProfileName;
        public readonly string ResourceGroupName;
        /// <summary>
        /// Specifies a mapping of Tags assigned to this CDN FrontDoor Endpoint.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetFrontdoorEndpointResult(
            bool enabled,

            string hostName,

            string id,

            string name,

            string profileName,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags)
        {
            Enabled = enabled;
            HostName = hostName;
            Id = id;
            Name = name;
            ProfileName = profileName;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
        }
    }
}