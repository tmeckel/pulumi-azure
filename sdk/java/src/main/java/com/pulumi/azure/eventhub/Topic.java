// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventhub.TopicArgs;
import com.pulumi.azure.eventhub.inputs.TopicState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a ServiceBus Topic.
 * 
 * **Note** Topics can only be created in Namespaces with an SKU of `standard` or higher.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.servicebus.Namespace;
 * import com.pulumi.azure.servicebus.NamespaceArgs;
 * import com.pulumi.azure.servicebus.Topic;
 * import com.pulumi.azure.servicebus.TopicArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;Standard&#34;)
 *             .tags(Map.of(&#34;source&#34;, &#34;example&#34;))
 *             .build());
 * 
 *         var exampleTopic = new Topic(&#34;exampleTopic&#34;, TopicArgs.builder()        
 *             .namespaceId(exampleNamespace.id())
 *             .enablePartitioning(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service Bus Topics can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:eventhub/topic:Topic example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ServiceBus/namespaces/sbns1/topics/sntopic1
 * ```
 * 
 * @deprecated
 * azure.eventhub.Topic has been deprecated in favor of azure.servicebus.Topic
 * 
 */
@Deprecated /* azure.eventhub.Topic has been deprecated in favor of azure.servicebus.Topic */
@ResourceType(type="azure:eventhub/topic:Topic")
public class Topic extends com.pulumi.resources.CustomResource {
    /**
     * The ISO 8601 timespan duration of the idle interval after which the
     * Topic is automatically deleted, minimum of 5 minutes.
     * 
     */
    @Export(name="autoDeleteOnIdle", type=String.class, parameters={})
    private Output<String> autoDeleteOnIdle;

    /**
     * @return The ISO 8601 timespan duration of the idle interval after which the
     * Topic is automatically deleted, minimum of 5 minutes.
     * 
     */
    public Output<String> autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }
    /**
     * The ISO 8601 timespan duration of TTL of messages sent to this topic if no
     * TTL value is set on the message itself.
     * 
     */
    @Export(name="defaultMessageTtl", type=String.class, parameters={})
    private Output<String> defaultMessageTtl;

    /**
     * @return The ISO 8601 timespan duration of TTL of messages sent to this topic if no
     * TTL value is set on the message itself.
     * 
     */
    public Output<String> defaultMessageTtl() {
        return this.defaultMessageTtl;
    }
    /**
     * The ISO 8601 timespan duration during which
     * duplicates can be detected. Defaults to 10 minutes. (`PT10M`)
     * 
     */
    @Export(name="duplicateDetectionHistoryTimeWindow", type=String.class, parameters={})
    private Output<String> duplicateDetectionHistoryTimeWindow;

    /**
     * @return The ISO 8601 timespan duration during which
     * duplicates can be detected. Defaults to 10 minutes. (`PT10M`)
     * 
     */
    public Output<String> duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }
    /**
     * Boolean flag which controls if server-side
     * batched operations are enabled. Defaults to false.
     * 
     */
    @Export(name="enableBatchedOperations", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBatchedOperations;

    /**
     * @return Boolean flag which controls if server-side
     * batched operations are enabled. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> enableBatchedOperations() {
        return Codegen.optional(this.enableBatchedOperations);
    }
    /**
     * Boolean flag which controls whether Express Entities
     * are enabled. An express topic holds a message in memory temporarily before writing
     * it to persistent storage. Defaults to false.
     * 
     */
    @Export(name="enableExpress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableExpress;

    /**
     * @return Boolean flag which controls whether Express Entities
     * are enabled. An express topic holds a message in memory temporarily before writing
     * it to persistent storage. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> enableExpress() {
        return Codegen.optional(this.enableExpress);
    }
    /**
     * Boolean flag which controls whether to enable
     * the topic to be partitioned across multiple message brokers. Defaults to false.
     * Changing this forces a new resource to be created.
     * 
     */
    @Export(name="enablePartitioning", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePartitioning;

    /**
     * @return Boolean flag which controls whether to enable
     * the topic to be partitioned across multiple message brokers. Defaults to false.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> enablePartitioning() {
        return Codegen.optional(this.enablePartitioning);
    }
    /**
     * Integer value which controls the maximum size of
     * a message allowed on the topic for Premium SKU. For supported values see the &#34;Large messages support&#34;
     * section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
     * 
     */
    @Export(name="maxMessageSizeInKilobytes", type=Integer.class, parameters={})
    private Output<Integer> maxMessageSizeInKilobytes;

    /**
     * @return Integer value which controls the maximum size of
     * a message allowed on the topic for Premium SKU. For supported values see the &#34;Large messages support&#34;
     * section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
     * 
     */
    public Output<Integer> maxMessageSizeInKilobytes() {
        return this.maxMessageSizeInKilobytes;
    }
    /**
     * Integer value which controls the size of
     * memory allocated for the topic. For supported values see the &#34;Queue/topic size&#34;
     * section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas).
     * 
     */
    @Export(name="maxSizeInMegabytes", type=Integer.class, parameters={})
    private Output<Integer> maxSizeInMegabytes;

    /**
     * @return Integer value which controls the size of
     * memory allocated for the topic. For supported values see the &#34;Queue/topic size&#34;
     * section of [this document](https://docs.microsoft.com/azure/service-bus-messaging/service-bus-quotas).
     * 
     */
    public Output<Integer> maxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }
    /**
     * Specifies the name of the ServiceBus Topic resource. Changing this forces a
     * new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the ServiceBus Topic resource. Changing this forces a
     * new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the ServiceBus Namespace to create
     * this topic in. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return The ID of the ServiceBus Namespace to create
     * this topic in. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    @Export(name="namespaceName", type=String.class, parameters={})
    private Output<String> namespaceName;

    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * Boolean flag which controls whether
     * the Topic requires duplicate detection. Defaults to false. Changing this forces
     * a new resource to be created.
     * 
     */
    @Export(name="requiresDuplicateDetection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requiresDuplicateDetection;

    /**
     * @return Boolean flag which controls whether
     * the Topic requires duplicate detection. Defaults to false. Changing this forces
     * a new resource to be created.
     * 
     */
    public Output<Optional<Boolean>> requiresDuplicateDetection() {
        return Codegen.optional(this.requiresDuplicateDetection);
    }
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The Status of the Service Bus Topic. Acceptable values are `Active` or `Disabled`. Defaults to `Active`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The Status of the Service Bus Topic. Acceptable values are `Active` or `Disabled`. Defaults to `Active`.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * Boolean flag which controls whether the Topic
     * supports ordering. Defaults to false.
     * 
     */
    @Export(name="supportOrdering", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> supportOrdering;

    /**
     * @return Boolean flag which controls whether the Topic
     * supports ordering. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> supportOrdering() {
        return Codegen.optional(this.supportOrdering);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Topic(String name) {
        this(name, TopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Topic(String name, TopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Topic(String name, TopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/topic:Topic", name, args == null ? TopicArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Topic(String name, Output<String> id, @Nullable TopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/topic:Topic", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Topic get(String name, Output<String> id, @Nullable TopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Topic(name, id, state, options);
    }
}