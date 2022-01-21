// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppService
{
    /// <summary>
    /// Manages a Hostname Binding within an App Service Slot.
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
    ///         var examplePlan = new Azure.AppService.Plan("examplePlan", new Azure.AppService.PlanArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Sku = new Azure.AppService.Inputs.PlanSkuArgs
    ///             {
    ///                 Tier = "Standard",
    ///                 Size = "S1",
    ///             },
    ///         });
    ///         var exampleAppService = new Azure.AppService.AppService("exampleAppService", new Azure.AppService.AppServiceArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             AppServicePlanId = examplePlan.Id,
    ///         });
    ///         var exampleSlot = new Azure.AppService.Slot("exampleSlot", new Azure.AppService.SlotArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             AppServiceName = exampleAppService.Name,
    ///             AppServicePlanId = examplePlan.Id,
    ///         });
    ///         var exampleSlotCustomHostnameBinding = new Azure.AppService.SlotCustomHostnameBinding("exampleSlotCustomHostnameBinding", new Azure.AppService.SlotCustomHostnameBindingArgs
    ///         {
    ///             AppServiceSlotId = exampleSlot.Id,
    ///             Hostname = "www.mywebsite.com",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// App Service Custom Hostname Bindings can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:appservice/slotCustomHostnameBinding:SlotCustomHostnameBinding mywebsite /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Web/sites/instance1/slots/staging/hostNameBindings/mywebsite.com
    /// ```
    /// </summary>
    [AzureResourceType("azure:appservice/slotCustomHostnameBinding:SlotCustomHostnameBinding")]
    public partial class SlotCustomHostnameBinding : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the App Service Slot. Changing this forces a new resource to be created.
        /// </summary>
        [Output("appServiceSlotId")]
        public Output<string> AppServiceSlotId { get; private set; } = null!;

        /// <summary>
        /// Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        /// <summary>
        /// The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
        /// </summary>
        [Output("sslState")]
        public Output<string> SslState { get; private set; } = null!;

        /// <summary>
        /// The SSL certificate thumbprint. Changing this forces a new resource to be created.
        /// </summary>
        [Output("thumbprint")]
        public Output<string> Thumbprint { get; private set; } = null!;

        /// <summary>
        /// The virtual IP address assigned to the hostname if IP based SSL is enabled.
        /// </summary>
        [Output("virtualIp")]
        public Output<string> VirtualIp { get; private set; } = null!;


        /// <summary>
        /// Create a SlotCustomHostnameBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SlotCustomHostnameBinding(string name, SlotCustomHostnameBindingArgs args, CustomResourceOptions? options = null)
            : base("azure:appservice/slotCustomHostnameBinding:SlotCustomHostnameBinding", name, args ?? new SlotCustomHostnameBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SlotCustomHostnameBinding(string name, Input<string> id, SlotCustomHostnameBindingState? state = null, CustomResourceOptions? options = null)
            : base("azure:appservice/slotCustomHostnameBinding:SlotCustomHostnameBinding", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SlotCustomHostnameBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SlotCustomHostnameBinding Get(string name, Input<string> id, SlotCustomHostnameBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new SlotCustomHostnameBinding(name, id, state, options);
        }
    }

    public sealed class SlotCustomHostnameBindingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the App Service Slot. Changing this forces a new resource to be created.
        /// </summary>
        [Input("appServiceSlotId", required: true)]
        public Input<string> AppServiceSlotId { get; set; } = null!;

        /// <summary>
        /// Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("hostname", required: true)]
        public Input<string> Hostname { get; set; } = null!;

        /// <summary>
        /// The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sslState")]
        public Input<string>? SslState { get; set; }

        /// <summary>
        /// The SSL certificate thumbprint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("thumbprint")]
        public Input<string>? Thumbprint { get; set; }

        public SlotCustomHostnameBindingArgs()
        {
        }
    }

    public sealed class SlotCustomHostnameBindingState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the App Service Slot. Changing this forces a new resource to be created.
        /// </summary>
        [Input("appServiceSlotId")]
        public Input<string>? AppServiceSlotId { get; set; }

        /// <summary>
        /// Specifies the Custom Hostname to use for the App Service, example `www.example.com`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// The SSL type. Possible values are `IpBasedEnabled` and `SniEnabled`. Changing this forces a new resource to be created.
        /// </summary>
        [Input("sslState")]
        public Input<string>? SslState { get; set; }

        /// <summary>
        /// The SSL certificate thumbprint. Changing this forces a new resource to be created.
        /// </summary>
        [Input("thumbprint")]
        public Input<string>? Thumbprint { get; set; }

        /// <summary>
        /// The virtual IP address assigned to the hostname if IP based SSL is enabled.
        /// </summary>
        [Input("virtualIp")]
        public Input<string>? VirtualIp { get; set; }

        public SlotCustomHostnameBindingState()
        {
        }
    }
}