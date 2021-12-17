// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.StreamAnalytics
{
    /// <summary>
    /// Manages a Stream Analytics Managed Private Endpoint.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleAccount = new Azure.Storage.Account("exampleAccount", new Azure.Storage.AccountArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             AccountTier = "Standard",
    ///             AccountReplicationType = "LRS",
    ///             AccountKind = "StorageV2",
    ///             IsHnsEnabled = true,
    ///         });
    ///         var exampleCluster = new Azure.StreamAnalytics.Cluster("exampleCluster", new Azure.StreamAnalytics.ClusterArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             StreamingCapacity = 36,
    ///         });
    ///         var exampleManagedPrivateEndpoint = new Azure.StreamAnalytics.ManagedPrivateEndpoint("exampleManagedPrivateEndpoint", new Azure.StreamAnalytics.ManagedPrivateEndpointArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             StreamAnalyticsClusterName = exampleCluster.Name,
    ///             TargetResourceId = exampleAccount.Id,
    ///             SubresourceName = "blob",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Stream Analytics Private Endpoints can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:streamanalytics/managedPrivateEndpoint:ManagedPrivateEndpoint example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.StreamAnalytics/clusters/cluster1/privateEndpoints/endpoint1
    /// ```
    /// </summary>
    [AzureResourceType("azure:streamanalytics/managedPrivateEndpoint:ManagedPrivateEndpoint")]
    public partial class ManagedPrivateEndpoint : Pulumi.CustomResource
    {
        /// <summary>
        /// The name which should be used for this Stream Analytics Managed Private Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Resource Group where the Stream Analytics Managed Private Endpoint should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The name of the Stream Analytics Cluster where the Managed Private Endpoint should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("streamAnalyticsClusterName")]
        public Output<string> StreamAnalyticsClusterName { get; private set; } = null!;

        /// <summary>
        /// Specifies the sub resource name which the Stream Analytics Private Endpoint is able to connect to. Changing this forces a new resource to be created.
        /// </summary>
        [Output("subresourceName")]
        public Output<string> SubresourceName { get; private set; } = null!;

        /// <summary>
        /// The ID of the Private Link Enabled Remote Resource which this Stream Analytics Private endpoint should be connected to. Changing this forces a new resource to be created.
        /// </summary>
        [Output("targetResourceId")]
        public Output<string> TargetResourceId { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedPrivateEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedPrivateEndpoint(string name, ManagedPrivateEndpointArgs args, CustomResourceOptions? options = null)
            : base("azure:streamanalytics/managedPrivateEndpoint:ManagedPrivateEndpoint", name, args ?? new ManagedPrivateEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedPrivateEndpoint(string name, Input<string> id, ManagedPrivateEndpointState? state = null, CustomResourceOptions? options = null)
            : base("azure:streamanalytics/managedPrivateEndpoint:ManagedPrivateEndpoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ManagedPrivateEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedPrivateEndpoint Get(string name, Input<string> id, ManagedPrivateEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedPrivateEndpoint(name, id, state, options);
        }
    }

    public sealed class ManagedPrivateEndpointArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name which should be used for this Stream Analytics Managed Private Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Stream Analytics Managed Private Endpoint should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The name of the Stream Analytics Cluster where the Managed Private Endpoint should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("streamAnalyticsClusterName", required: true)]
        public Input<string> StreamAnalyticsClusterName { get; set; } = null!;

        /// <summary>
        /// Specifies the sub resource name which the Stream Analytics Private Endpoint is able to connect to. Changing this forces a new resource to be created.
        /// </summary>
        [Input("subresourceName", required: true)]
        public Input<string> SubresourceName { get; set; } = null!;

        /// <summary>
        /// The ID of the Private Link Enabled Remote Resource which this Stream Analytics Private endpoint should be connected to. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetResourceId", required: true)]
        public Input<string> TargetResourceId { get; set; } = null!;

        public ManagedPrivateEndpointArgs()
        {
        }
    }

    public sealed class ManagedPrivateEndpointState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name which should be used for this Stream Analytics Managed Private Endpoint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Resource Group where the Stream Analytics Managed Private Endpoint should exist. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The name of the Stream Analytics Cluster where the Managed Private Endpoint should be created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("streamAnalyticsClusterName")]
        public Input<string>? StreamAnalyticsClusterName { get; set; }

        /// <summary>
        /// Specifies the sub resource name which the Stream Analytics Private Endpoint is able to connect to. Changing this forces a new resource to be created.
        /// </summary>
        [Input("subresourceName")]
        public Input<string>? SubresourceName { get; set; }

        /// <summary>
        /// The ID of the Private Link Enabled Remote Resource which this Stream Analytics Private endpoint should be connected to. Changing this forces a new resource to be created.
        /// </summary>
        [Input("targetResourceId")]
        public Input<string>? TargetResourceId { get; set; }

        public ManagedPrivateEndpointState()
        {
        }
    }
}