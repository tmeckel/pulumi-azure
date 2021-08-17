// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.VideoAnalyzer
{
    /// <summary>
    /// Manages a Video Analyzer Edge Module.
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
    ///             AccountReplicationType = "GRS",
    ///         });
    ///         var exampleUserAssignedIdentity = new Azure.Authorization.UserAssignedIdentity("exampleUserAssignedIdentity", new Azure.Authorization.UserAssignedIdentityArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///         });
    ///         var contributor = new Azure.Authorization.Assignment("contributor", new Azure.Authorization.AssignmentArgs
    ///         {
    ///             Scope = exampleAccount.Id,
    ///             RoleDefinitionName = "Storage Blob Data Contributor",
    ///             PrincipalId = exampleUserAssignedIdentity.PrincipalId,
    ///         });
    ///         var reader = new Azure.Authorization.Assignment("reader", new Azure.Authorization.AssignmentArgs
    ///         {
    ///             Scope = exampleAccount.Id,
    ///             RoleDefinitionName = "Reader",
    ///             PrincipalId = exampleUserAssignedIdentity.PrincipalId,
    ///         });
    ///         var exampleAnalyzer = new Azure.VideoAnalyzer.Analyzer("exampleAnalyzer", new Azure.VideoAnalyzer.AnalyzerArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             StorageAccount = new Azure.VideoAnalyzer.Inputs.AnalyzerStorageAccountArgs
    ///             {
    ///                 Id = exampleAccount.Id,
    ///                 UserAssignedIdentityId = exampleUserAssignedIdentity.Id,
    ///             },
    ///             Identity = new Azure.VideoAnalyzer.Inputs.AnalyzerIdentityArgs
    ///             {
    ///                 Type = "UserAssigned",
    ///                 IdentityIds = 
    ///                 {
    ///                     exampleUserAssignedIdentity.Id,
    ///                 },
    ///             },
    ///             Tags = 
    ///             {
    ///                 { "environment", "staging" },
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 exampleUserAssignedIdentity,
    ///                 contributor,
    ///                 reader,
    ///             },
    ///         });
    ///         var exampleEdgeModule = new Azure.VideoAnalyzer.EdgeModule("exampleEdgeModule", new Azure.VideoAnalyzer.EdgeModuleArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             VideoAnalyzerName = exampleAnalyzer.Name,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Video Analyzer Edge Module can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:videoanalyzer/edgeModule:EdgeModule edge /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Media/videoAnalyzers/analyzer1/edgeModules/edge1
    /// ```
    /// </summary>
    [AzureResourceType("azure:videoanalyzer/edgeModule:EdgeModule")]
    public partial class EdgeModule : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the name of the Video Analyzer Edge Module. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the resource group in which to create the Video Analyzer Edge Module. Changing this forces a new resource to be created.
        /// </summary>
        [Output("resourceGroupName")]
        public Output<string> ResourceGroupName { get; private set; } = null!;

        /// <summary>
        /// The name of the Video Analyzer in which to create the Edge Module. Changing this forces a new resource to be created.
        /// </summary>
        [Output("videoAnalyzerName")]
        public Output<string> VideoAnalyzerName { get; private set; } = null!;


        /// <summary>
        /// Create a EdgeModule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EdgeModule(string name, EdgeModuleArgs args, CustomResourceOptions? options = null)
            : base("azure:videoanalyzer/edgeModule:EdgeModule", name, args ?? new EdgeModuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EdgeModule(string name, Input<string> id, EdgeModuleState? state = null, CustomResourceOptions? options = null)
            : base("azure:videoanalyzer/edgeModule:EdgeModule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EdgeModule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EdgeModule Get(string name, Input<string> id, EdgeModuleState? state = null, CustomResourceOptions? options = null)
        {
            return new EdgeModule(name, id, state, options);
        }
    }

    public sealed class EdgeModuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Video Analyzer Edge Module. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the Video Analyzer Edge Module. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// The name of the Video Analyzer in which to create the Edge Module. Changing this forces a new resource to be created.
        /// </summary>
        [Input("videoAnalyzerName", required: true)]
        public Input<string> VideoAnalyzerName { get; set; } = null!;

        public EdgeModuleArgs()
        {
        }
    }

    public sealed class EdgeModuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Video Analyzer Edge Module. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the resource group in which to create the Video Analyzer Edge Module. Changing this forces a new resource to be created.
        /// </summary>
        [Input("resourceGroupName")]
        public Input<string>? ResourceGroupName { get; set; }

        /// <summary>
        /// The name of the Video Analyzer in which to create the Edge Module. Changing this forces a new resource to be created.
        /// </summary>
        [Input("videoAnalyzerName")]
        public Input<string>? VideoAnalyzerName { get; set; }

        public EdgeModuleState()
        {
        }
    }
}