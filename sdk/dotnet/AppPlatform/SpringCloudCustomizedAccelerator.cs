// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform
{
    /// <summary>
    /// Manages a Spring Cloud Customized Accelerator.
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
    ///     var exampleSpringCloudService = new Azure.AppPlatform.SpringCloudService("exampleSpringCloudService", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         SkuName = "E0",
    ///     });
    /// 
    ///     var exampleSpringCloudAccelerator = new Azure.AppPlatform.SpringCloudAccelerator("exampleSpringCloudAccelerator", new()
    ///     {
    ///         SpringCloudServiceId = exampleSpringCloudService.Id,
    ///     });
    /// 
    ///     var exampleSpringCloudCustomizedAccelerator = new Azure.AppPlatform.SpringCloudCustomizedAccelerator("exampleSpringCloudCustomizedAccelerator", new()
    ///     {
    ///         SpringCloudAcceleratorId = exampleSpringCloudAccelerator.Id,
    ///         GitRepository = new Azure.AppPlatform.Inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs
    ///         {
    ///             Url = "https://github.com/Azure-Samples/piggymetrics",
    ///             GitTag = "spring.version.2.0.3",
    ///             IntervalInSeconds = 100,
    ///         },
    ///         AcceleratorTags = new[]
    ///         {
    ///             "tag-a",
    ///             "tag-b",
    ///         },
    ///         Description = "example description",
    ///         DisplayName = "example name",
    ///         IconUrl = "https://images.freecreatives.com/wp-content/uploads/2015/05/smiley-559124_640.jpg",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Spring Cloud Customized Accelerators can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:appplatform/springCloudCustomizedAccelerator:SpringCloudCustomizedAccelerator example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.AppPlatform/Spring/spring1/applicationAccelerators/default/customizedAccelerators/customizedAccelerator1
    /// ```
    /// </summary>
    [AzureResourceType("azure:appplatform/springCloudCustomizedAccelerator:SpringCloudCustomizedAccelerator")]
    public partial class SpringCloudCustomizedAccelerator : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a list of accelerator tags.
        /// </summary>
        [Output("acceleratorTags")]
        public Output<ImmutableArray<string>> AcceleratorTags { get; private set; } = null!;

        /// <summary>
        /// Specifies the description of the Spring Cloud Customized Accelerator.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Specifies the display name of the Spring Cloud Customized Accelerator..
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// A `git_repository` block as defined below.
        /// </summary>
        [Output("gitRepository")]
        public Output<Outputs.SpringCloudCustomizedAcceleratorGitRepository> GitRepository { get; private set; } = null!;

        /// <summary>
        /// Specifies the icon URL of the Spring Cloud Customized Accelerator..
        /// </summary>
        [Output("iconUrl")]
        public Output<string?> IconUrl { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        /// </summary>
        [Output("springCloudAcceleratorId")]
        public Output<string> SpringCloudAcceleratorId { get; private set; } = null!;


        /// <summary>
        /// Create a SpringCloudCustomizedAccelerator resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SpringCloudCustomizedAccelerator(string name, SpringCloudCustomizedAcceleratorArgs args, CustomResourceOptions? options = null)
            : base("azure:appplatform/springCloudCustomizedAccelerator:SpringCloudCustomizedAccelerator", name, args ?? new SpringCloudCustomizedAcceleratorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SpringCloudCustomizedAccelerator(string name, Input<string> id, SpringCloudCustomizedAcceleratorState? state = null, CustomResourceOptions? options = null)
            : base("azure:appplatform/springCloudCustomizedAccelerator:SpringCloudCustomizedAccelerator", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SpringCloudCustomizedAccelerator resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SpringCloudCustomizedAccelerator Get(string name, Input<string> id, SpringCloudCustomizedAcceleratorState? state = null, CustomResourceOptions? options = null)
        {
            return new SpringCloudCustomizedAccelerator(name, id, state, options);
        }
    }

    public sealed class SpringCloudCustomizedAcceleratorArgs : global::Pulumi.ResourceArgs
    {
        [Input("acceleratorTags")]
        private InputList<string>? _acceleratorTags;

        /// <summary>
        /// Specifies a list of accelerator tags.
        /// </summary>
        public InputList<string> AcceleratorTags
        {
            get => _acceleratorTags ?? (_acceleratorTags = new InputList<string>());
            set => _acceleratorTags = value;
        }

        /// <summary>
        /// Specifies the description of the Spring Cloud Customized Accelerator.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies the display name of the Spring Cloud Customized Accelerator..
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// A `git_repository` block as defined below.
        /// </summary>
        [Input("gitRepository", required: true)]
        public Input<Inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs> GitRepository { get; set; } = null!;

        /// <summary>
        /// Specifies the icon URL of the Spring Cloud Customized Accelerator..
        /// </summary>
        [Input("iconUrl")]
        public Input<string>? IconUrl { get; set; }

        /// <summary>
        /// The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        /// </summary>
        [Input("springCloudAcceleratorId", required: true)]
        public Input<string> SpringCloudAcceleratorId { get; set; } = null!;

        public SpringCloudCustomizedAcceleratorArgs()
        {
        }
        public static new SpringCloudCustomizedAcceleratorArgs Empty => new SpringCloudCustomizedAcceleratorArgs();
    }

    public sealed class SpringCloudCustomizedAcceleratorState : global::Pulumi.ResourceArgs
    {
        [Input("acceleratorTags")]
        private InputList<string>? _acceleratorTags;

        /// <summary>
        /// Specifies a list of accelerator tags.
        /// </summary>
        public InputList<string> AcceleratorTags
        {
            get => _acceleratorTags ?? (_acceleratorTags = new InputList<string>());
            set => _acceleratorTags = value;
        }

        /// <summary>
        /// Specifies the description of the Spring Cloud Customized Accelerator.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies the display name of the Spring Cloud Customized Accelerator..
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// A `git_repository` block as defined below.
        /// </summary>
        [Input("gitRepository")]
        public Input<Inputs.SpringCloudCustomizedAcceleratorGitRepositoryGetArgs>? GitRepository { get; set; }

        /// <summary>
        /// Specifies the icon URL of the Spring Cloud Customized Accelerator..
        /// </summary>
        [Input("iconUrl")]
        public Input<string>? IconUrl { get; set; }

        /// <summary>
        /// The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        /// </summary>
        [Input("springCloudAcceleratorId")]
        public Input<string>? SpringCloudAcceleratorId { get; set; }

        public SpringCloudCustomizedAcceleratorState()
        {
        }
        public static new SpringCloudCustomizedAcceleratorState Empty => new SpringCloudCustomizedAcceleratorState();
    }
}