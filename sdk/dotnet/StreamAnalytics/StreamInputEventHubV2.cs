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
    /// &gt; **Note:** This resource creates a Stream Input of type `Microsoft.EventHub/EventHub`, to create a Stream Input of type `Microsoft.ServiceBus/EventHub` please use the resource azurerm_stream_analytics_stream_input_eventhub.
    /// 
    /// Manages a Stream Analytics Stream Input EventHub V2.
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
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleJob = Azure.StreamAnalytics.GetJob.Invoke(new()
    ///     {
    ///         Name = "example-job",
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///     });
    /// 
    ///     var exampleEventHubNamespace = new Azure.EventHub.EventHubNamespace("exampleEventHubNamespace", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         Sku = "Standard",
    ///         Capacity = 1,
    ///     });
    /// 
    ///     var exampleEventHub = new Azure.EventHub.EventHub("exampleEventHub", new()
    ///     {
    ///         NamespaceName = exampleEventHubNamespace.Name,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         PartitionCount = 2,
    ///         MessageRetention = 1,
    ///     });
    /// 
    ///     var exampleConsumerGroup = new Azure.EventHub.ConsumerGroup("exampleConsumerGroup", new()
    ///     {
    ///         NamespaceName = exampleEventHubNamespace.Name,
    ///         EventhubName = exampleEventHub.Name,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///     });
    /// 
    ///     var exampleStreamInputEventHubV2 = new Azure.StreamAnalytics.StreamInputEventHubV2("exampleStreamInputEventHubV2", new()
    ///     {
    ///         StreamAnalyticsJobId = exampleJob.Apply(getJobResult =&gt; getJobResult.Id),
    ///         EventhubConsumerGroupName = exampleConsumerGroup.Name,
    ///         EventhubName = exampleEventHub.Name,
    ///         ServicebusNamespace = exampleEventHubNamespace.Name,
    ///         SharedAccessPolicyKey = exampleEventHubNamespace.DefaultPrimaryKey,
    ///         SharedAccessPolicyName = "RootManageSharedAccessKey",
    ///         Serialization = new Azure.StreamAnalytics.Inputs.StreamInputEventHubV2SerializationArgs
    ///         {
    ///             Type = "Json",
    ///             Encoding = "UTF8",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Stream Analytics Stream Input EventHub's can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:streamanalytics/streamInputEventHubV2:StreamInputEventHubV2 example /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.StreamAnalytics/streamingjobs/job1/inputs/input1
    /// ```
    /// </summary>
    [AzureResourceType("azure:streamanalytics/streamInputEventHubV2:StreamInputEventHubV2")]
    public partial class StreamInputEventHubV2 : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The authentication mode for the Stream Output. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
        /// </summary>
        [Output("authenticationMode")]
        public Output<string?> AuthenticationMode { get; private set; } = null!;

        /// <summary>
        /// The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not set the input will use the Event Hub's default consumer group.
        /// </summary>
        [Output("eventhubConsumerGroupName")]
        public Output<string?> EventhubConsumerGroupName { get; private set; } = null!;

        /// <summary>
        /// The name of the Event Hub.
        /// </summary>
        [Output("eventhubName")]
        public Output<string> EventhubName { get; private set; } = null!;

        /// <summary>
        /// The name of the Stream Input EventHub V2. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The property the input Event Hub has been partitioned by.
        /// </summary>
        [Output("partitionKey")]
        public Output<string?> PartitionKey { get; private set; } = null!;

        /// <summary>
        /// A `serialization` block as defined below.
        /// </summary>
        [Output("serialization")]
        public Output<Outputs.StreamInputEventHubV2Serialization> Serialization { get; private set; } = null!;

        /// <summary>
        /// The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
        /// </summary>
        [Output("servicebusNamespace")]
        public Output<string> ServicebusNamespace { get; private set; } = null!;

        /// <summary>
        /// The shared access policy key for the specified shared access policy.
        /// </summary>
        [Output("sharedAccessPolicyKey")]
        public Output<string?> SharedAccessPolicyKey { get; private set; } = null!;

        /// <summary>
        /// The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
        /// </summary>
        [Output("sharedAccessPolicyName")]
        public Output<string?> SharedAccessPolicyName { get; private set; } = null!;

        /// <summary>
        /// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
        /// </summary>
        [Output("streamAnalyticsJobId")]
        public Output<string> StreamAnalyticsJobId { get; private set; } = null!;


        /// <summary>
        /// Create a StreamInputEventHubV2 resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StreamInputEventHubV2(string name, StreamInputEventHubV2Args args, CustomResourceOptions? options = null)
            : base("azure:streamanalytics/streamInputEventHubV2:StreamInputEventHubV2", name, args ?? new StreamInputEventHubV2Args(), MakeResourceOptions(options, ""))
        {
        }

        private StreamInputEventHubV2(string name, Input<string> id, StreamInputEventHubV2State? state = null, CustomResourceOptions? options = null)
            : base("azure:streamanalytics/streamInputEventHubV2:StreamInputEventHubV2", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StreamInputEventHubV2 resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StreamInputEventHubV2 Get(string name, Input<string> id, StreamInputEventHubV2State? state = null, CustomResourceOptions? options = null)
        {
            return new StreamInputEventHubV2(name, id, state, options);
        }
    }

    public sealed class StreamInputEventHubV2Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The authentication mode for the Stream Output. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
        /// </summary>
        [Input("authenticationMode")]
        public Input<string>? AuthenticationMode { get; set; }

        /// <summary>
        /// The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not set the input will use the Event Hub's default consumer group.
        /// </summary>
        [Input("eventhubConsumerGroupName")]
        public Input<string>? EventhubConsumerGroupName { get; set; }

        /// <summary>
        /// The name of the Event Hub.
        /// </summary>
        [Input("eventhubName", required: true)]
        public Input<string> EventhubName { get; set; } = null!;

        /// <summary>
        /// The name of the Stream Input EventHub V2. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The property the input Event Hub has been partitioned by.
        /// </summary>
        [Input("partitionKey")]
        public Input<string>? PartitionKey { get; set; }

        /// <summary>
        /// A `serialization` block as defined below.
        /// </summary>
        [Input("serialization", required: true)]
        public Input<Inputs.StreamInputEventHubV2SerializationArgs> Serialization { get; set; } = null!;

        /// <summary>
        /// The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
        /// </summary>
        [Input("servicebusNamespace", required: true)]
        public Input<string> ServicebusNamespace { get; set; } = null!;

        /// <summary>
        /// The shared access policy key for the specified shared access policy.
        /// </summary>
        [Input("sharedAccessPolicyKey")]
        public Input<string>? SharedAccessPolicyKey { get; set; }

        /// <summary>
        /// The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
        /// </summary>
        [Input("sharedAccessPolicyName")]
        public Input<string>? SharedAccessPolicyName { get; set; }

        /// <summary>
        /// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
        /// </summary>
        [Input("streamAnalyticsJobId", required: true)]
        public Input<string> StreamAnalyticsJobId { get; set; } = null!;

        public StreamInputEventHubV2Args()
        {
        }
        public static new StreamInputEventHubV2Args Empty => new StreamInputEventHubV2Args();
    }

    public sealed class StreamInputEventHubV2State : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The authentication mode for the Stream Output. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
        /// </summary>
        [Input("authenticationMode")]
        public Input<string>? AuthenticationMode { get; set; }

        /// <summary>
        /// The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not set the input will use the Event Hub's default consumer group.
        /// </summary>
        [Input("eventhubConsumerGroupName")]
        public Input<string>? EventhubConsumerGroupName { get; set; }

        /// <summary>
        /// The name of the Event Hub.
        /// </summary>
        [Input("eventhubName")]
        public Input<string>? EventhubName { get; set; }

        /// <summary>
        /// The name of the Stream Input EventHub V2. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The property the input Event Hub has been partitioned by.
        /// </summary>
        [Input("partitionKey")]
        public Input<string>? PartitionKey { get; set; }

        /// <summary>
        /// A `serialization` block as defined below.
        /// </summary>
        [Input("serialization")]
        public Input<Inputs.StreamInputEventHubV2SerializationGetArgs>? Serialization { get; set; }

        /// <summary>
        /// The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc.
        /// </summary>
        [Input("servicebusNamespace")]
        public Input<string>? ServicebusNamespace { get; set; }

        /// <summary>
        /// The shared access policy key for the specified shared access policy.
        /// </summary>
        [Input("sharedAccessPolicyKey")]
        public Input<string>? SharedAccessPolicyKey { get; set; }

        /// <summary>
        /// The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
        /// </summary>
        [Input("sharedAccessPolicyName")]
        public Input<string>? SharedAccessPolicyName { get; set; }

        /// <summary>
        /// The name of the Stream Analytics Job. Changing this forces a new resource to be created.
        /// </summary>
        [Input("streamAnalyticsJobId")]
        public Input<string>? StreamAnalyticsJobId { get; set; }

        public StreamInputEventHubV2State()
        {
        }
        public static new StreamInputEventHubV2State Empty => new StreamInputEventHubV2State();
    }
}