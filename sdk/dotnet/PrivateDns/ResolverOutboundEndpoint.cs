// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PrivateDns
{
    /// <summary>
    /// Manages a Private DNS Resolver Outbound Endpoint.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "west europe",
    ///     });
    /// 
    ///     var exampleVirtualNetwork = new Azure.Network.VirtualNetwork("exampleVirtualNetwork", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         AddressSpaces = new[]
    ///         {
    ///             "10.0.0.0/16",
    ///         },
    ///     });
    /// 
    ///     var exampleSubnet = new Azure.Network.Subnet("exampleSubnet", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         VirtualNetworkName = exampleVirtualNetwork.Name,
    ///         AddressPrefixes = new[]
    ///         {
    ///             "10.0.0.64/28",
    ///         },
    ///         Delegations = new[]
    ///         {
    ///             new Azure.Network.Inputs.SubnetDelegationArgs
    ///             {
    ///                 Name = "Microsoft.Network.dnsResolvers",
    ///                 ServiceDelegation = new Azure.Network.Inputs.SubnetDelegationServiceDelegationArgs
    ///                 {
    ///                     Actions = new[]
    ///                     {
    ///                         "Microsoft.Network/virtualNetworks/subnets/join/action",
    ///                     },
    ///                     Name = "Microsoft.Network/dnsResolvers",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleResolver = new Azure.PrivateDns.Resolver("exampleResolver", new()
    ///     {
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Location = exampleResourceGroup.Location,
    ///         VirtualNetworkId = exampleVirtualNetwork.Id,
    ///     });
    /// 
    ///     var exampleResolverOutboundEndpoint = new Azure.PrivateDns.ResolverOutboundEndpoint("exampleResolverOutboundEndpoint", new()
    ///     {
    ///         PrivateDnsResolverId = exampleResolver.Id,
    ///         Location = exampleResolver.Location,
    ///         SubnetId = exampleSubnet.Id,
    ///         Tags = 
    ///         {
    ///             { "key", "value" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Private DNS Resolver Outbound Endpoint can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Network/dnsResolvers/dnsResolver1/outboundEndpoints/outboundEndpoint1
    /// ```
    /// </summary>
    [AzureResourceType("azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint")]
    public partial class ResolverOutboundEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
        /// </summary>
        [Output("privateDnsResolverId")]
        public Output<string> PrivateDnsResolverId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint.
        /// </summary>
        [Output("subnetId")]
        public Output<string> SubnetId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a ResolverOutboundEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResolverOutboundEndpoint(string name, ResolverOutboundEndpointArgs args, CustomResourceOptions? options = null)
            : base("azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint", name, args ?? new ResolverOutboundEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResolverOutboundEndpoint(string name, Input<string> id, ResolverOutboundEndpointState? state = null, CustomResourceOptions? options = null)
            : base("azure:privatedns/resolverOutboundEndpoint:ResolverOutboundEndpoint", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ResolverOutboundEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResolverOutboundEndpoint Get(string name, Input<string> id, ResolverOutboundEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new ResolverOutboundEndpoint(name, id, state, options);
        }
    }

    public sealed class ResolverOutboundEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
        /// </summary>
        [Input("privateDnsResolverId", required: true)]
        public Input<string> PrivateDnsResolverId { get; set; } = null!;

        /// <summary>
        /// The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ResolverOutboundEndpointArgs()
        {
        }
        public static new ResolverOutboundEndpointArgs Empty => new ResolverOutboundEndpointArgs();
    }

    public sealed class ResolverOutboundEndpointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the Azure Region where the Private DNS Resolver Outbound Endpoint should exist. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Specifies the name which should be used for this Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the ID of the Private DNS Resolver Outbound Endpoint. Changing this forces a new Private DNS Resolver Outbound Endpoint to be created.
        /// </summary>
        [Input("privateDnsResolverId")]
        public Input<string>? PrivateDnsResolverId { get; set; }

        /// <summary>
        /// The ID of the Subnet that is linked to the Private DNS Resolver Outbound Endpoint.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the Private DNS Resolver Outbound Endpoint.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ResolverOutboundEndpointState()
        {
        }
        public static new ResolverOutboundEndpointState Empty => new ResolverOutboundEndpointState();
    }
}