// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.inputs;

import com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAdvancedFilterArgs;
import com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionAzureFunctionEndpointArgs;
import com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeadLetterIdentityArgs;
import com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeliveryIdentityArgs;
import com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionDeliveryPropertyArgs;
import com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionRetryPolicyArgs;
import com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionStorageBlobDeadLetterDestinationArgs;
import com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionStorageQueueEndpointArgs;
import com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionSubjectFilterArgs;
import com.pulumi.azure.eventgrid.inputs.SystemTopicEventSubscriptionWebhookEndpointArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SystemTopicEventSubscriptionState extends com.pulumi.resources.ResourceArgs {

    public static final SystemTopicEventSubscriptionState Empty = new SystemTopicEventSubscriptionState();

    /**
     * A `advanced_filter` block as defined below.
     * 
     */
    @Import(name="advancedFilter")
    private @Nullable Output<SystemTopicEventSubscriptionAdvancedFilterArgs> advancedFilter;

    /**
     * @return A `advanced_filter` block as defined below.
     * 
     */
    public Optional<Output<SystemTopicEventSubscriptionAdvancedFilterArgs>> advancedFilter() {
        return Optional.ofNullable(this.advancedFilter);
    }

    /**
     * Specifies whether advanced filters should be evaluated against an array of values instead of expecting a singular value. Defaults to `false`.
     * 
     */
    @Import(name="advancedFilteringOnArraysEnabled")
    private @Nullable Output<Boolean> advancedFilteringOnArraysEnabled;

    /**
     * @return Specifies whether advanced filters should be evaluated against an array of values instead of expecting a singular value. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> advancedFilteringOnArraysEnabled() {
        return Optional.ofNullable(this.advancedFilteringOnArraysEnabled);
    }

    /**
     * An `azure_function_endpoint` block as defined below.
     * 
     */
    @Import(name="azureFunctionEndpoint")
    private @Nullable Output<SystemTopicEventSubscriptionAzureFunctionEndpointArgs> azureFunctionEndpoint;

    /**
     * @return An `azure_function_endpoint` block as defined below.
     * 
     */
    public Optional<Output<SystemTopicEventSubscriptionAzureFunctionEndpointArgs>> azureFunctionEndpoint() {
        return Optional.ofNullable(this.azureFunctionEndpoint);
    }

    /**
     * A `dead_letter_identity` block as defined below.
     * 
     */
    @Import(name="deadLetterIdentity")
    private @Nullable Output<SystemTopicEventSubscriptionDeadLetterIdentityArgs> deadLetterIdentity;

    /**
     * @return A `dead_letter_identity` block as defined below.
     * 
     */
    public Optional<Output<SystemTopicEventSubscriptionDeadLetterIdentityArgs>> deadLetterIdentity() {
        return Optional.ofNullable(this.deadLetterIdentity);
    }

    /**
     * A `delivery_identity` block as defined below.
     * 
     */
    @Import(name="deliveryIdentity")
    private @Nullable Output<SystemTopicEventSubscriptionDeliveryIdentityArgs> deliveryIdentity;

    /**
     * @return A `delivery_identity` block as defined below.
     * 
     */
    public Optional<Output<SystemTopicEventSubscriptionDeliveryIdentityArgs>> deliveryIdentity() {
        return Optional.ofNullable(this.deliveryIdentity);
    }

    /**
     * One or more `delivery_property` blocks as defined below.
     * 
     */
    @Import(name="deliveryProperties")
    private @Nullable Output<List<SystemTopicEventSubscriptionDeliveryPropertyArgs>> deliveryProperties;

    /**
     * @return One or more `delivery_property` blocks as defined below.
     * 
     */
    public Optional<Output<List<SystemTopicEventSubscriptionDeliveryPropertyArgs>>> deliveryProperties() {
        return Optional.ofNullable(this.deliveryProperties);
    }

    /**
     * Specifies the event delivery schema for the event subscription. Possible values include: `EventGridSchema`, `CloudEventSchemaV1_0`, `CustomInputSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="eventDeliverySchema")
    private @Nullable Output<String> eventDeliverySchema;

    /**
     * @return Specifies the event delivery schema for the event subscription. Possible values include: `EventGridSchema`, `CloudEventSchemaV1_0`, `CustomInputSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> eventDeliverySchema() {
        return Optional.ofNullable(this.eventDeliverySchema);
    }

    /**
     * Specifies the id where the Event Hub is located.
     * 
     */
    @Import(name="eventhubEndpointId")
    private @Nullable Output<String> eventhubEndpointId;

    /**
     * @return Specifies the id where the Event Hub is located.
     * 
     */
    public Optional<Output<String>> eventhubEndpointId() {
        return Optional.ofNullable(this.eventhubEndpointId);
    }

    /**
     * Specifies the expiration time of the event subscription (Datetime Format `RFC 3339`).
     * 
     */
    @Import(name="expirationTimeUtc")
    private @Nullable Output<String> expirationTimeUtc;

    /**
     * @return Specifies the expiration time of the event subscription (Datetime Format `RFC 3339`).
     * 
     */
    public Optional<Output<String>> expirationTimeUtc() {
        return Optional.ofNullable(this.expirationTimeUtc);
    }

    /**
     * Specifies the id where the Hybrid Connection is located.
     * 
     */
    @Import(name="hybridConnectionEndpointId")
    private @Nullable Output<String> hybridConnectionEndpointId;

    /**
     * @return Specifies the id where the Hybrid Connection is located.
     * 
     */
    public Optional<Output<String>> hybridConnectionEndpointId() {
        return Optional.ofNullable(this.hybridConnectionEndpointId);
    }

    /**
     * A list of applicable event types that need to be part of the event subscription.
     * 
     */
    @Import(name="includedEventTypes")
    private @Nullable Output<List<String>> includedEventTypes;

    /**
     * @return A list of applicable event types that need to be part of the event subscription.
     * 
     */
    public Optional<Output<List<String>>> includedEventTypes() {
        return Optional.ofNullable(this.includedEventTypes);
    }

    /**
     * A list of labels to assign to the event subscription.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return A list of labels to assign to the event subscription.
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name which should be used for this Event Subscription. Changing this forces a new Event Subscription to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Event Subscription. Changing this forces a new Event Subscription to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the System Topic exists. Changing this forces a new Event Subscription to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the System Topic exists. Changing this forces a new Event Subscription to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A `retry_policy` block as defined below.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<SystemTopicEventSubscriptionRetryPolicyArgs> retryPolicy;

    /**
     * @return A `retry_policy` block as defined below.
     * 
     */
    public Optional<Output<SystemTopicEventSubscriptionRetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * Specifies the id where the Service Bus Queue is located.
     * 
     */
    @Import(name="serviceBusQueueEndpointId")
    private @Nullable Output<String> serviceBusQueueEndpointId;

    /**
     * @return Specifies the id where the Service Bus Queue is located.
     * 
     */
    public Optional<Output<String>> serviceBusQueueEndpointId() {
        return Optional.ofNullable(this.serviceBusQueueEndpointId);
    }

    /**
     * Specifies the id where the Service Bus Topic is located.
     * 
     */
    @Import(name="serviceBusTopicEndpointId")
    private @Nullable Output<String> serviceBusTopicEndpointId;

    /**
     * @return Specifies the id where the Service Bus Topic is located.
     * 
     */
    public Optional<Output<String>> serviceBusTopicEndpointId() {
        return Optional.ofNullable(this.serviceBusTopicEndpointId);
    }

    /**
     * A `storage_blob_dead_letter_destination` block as defined below.
     * 
     */
    @Import(name="storageBlobDeadLetterDestination")
    private @Nullable Output<SystemTopicEventSubscriptionStorageBlobDeadLetterDestinationArgs> storageBlobDeadLetterDestination;

    /**
     * @return A `storage_blob_dead_letter_destination` block as defined below.
     * 
     */
    public Optional<Output<SystemTopicEventSubscriptionStorageBlobDeadLetterDestinationArgs>> storageBlobDeadLetterDestination() {
        return Optional.ofNullable(this.storageBlobDeadLetterDestination);
    }

    /**
     * A `storage_queue_endpoint` block as defined below.
     * 
     */
    @Import(name="storageQueueEndpoint")
    private @Nullable Output<SystemTopicEventSubscriptionStorageQueueEndpointArgs> storageQueueEndpoint;

    /**
     * @return A `storage_queue_endpoint` block as defined below.
     * 
     */
    public Optional<Output<SystemTopicEventSubscriptionStorageQueueEndpointArgs>> storageQueueEndpoint() {
        return Optional.ofNullable(this.storageQueueEndpoint);
    }

    /**
     * A `subject_filter` block as defined below.
     * 
     */
    @Import(name="subjectFilter")
    private @Nullable Output<SystemTopicEventSubscriptionSubjectFilterArgs> subjectFilter;

    /**
     * @return A `subject_filter` block as defined below.
     * 
     */
    public Optional<Output<SystemTopicEventSubscriptionSubjectFilterArgs>> subjectFilter() {
        return Optional.ofNullable(this.subjectFilter);
    }

    /**
     * The System Topic where the Event Subscription should be created in. Changing this forces a new Event Subscription to be created.
     * 
     */
    @Import(name="systemTopic")
    private @Nullable Output<String> systemTopic;

    /**
     * @return The System Topic where the Event Subscription should be created in. Changing this forces a new Event Subscription to be created.
     * 
     */
    public Optional<Output<String>> systemTopic() {
        return Optional.ofNullable(this.systemTopic);
    }

    /**
     * A `webhook_endpoint` block as defined below.
     * 
     */
    @Import(name="webhookEndpoint")
    private @Nullable Output<SystemTopicEventSubscriptionWebhookEndpointArgs> webhookEndpoint;

    /**
     * @return A `webhook_endpoint` block as defined below.
     * 
     */
    public Optional<Output<SystemTopicEventSubscriptionWebhookEndpointArgs>> webhookEndpoint() {
        return Optional.ofNullable(this.webhookEndpoint);
    }

    private SystemTopicEventSubscriptionState() {}

    private SystemTopicEventSubscriptionState(SystemTopicEventSubscriptionState $) {
        this.advancedFilter = $.advancedFilter;
        this.advancedFilteringOnArraysEnabled = $.advancedFilteringOnArraysEnabled;
        this.azureFunctionEndpoint = $.azureFunctionEndpoint;
        this.deadLetterIdentity = $.deadLetterIdentity;
        this.deliveryIdentity = $.deliveryIdentity;
        this.deliveryProperties = $.deliveryProperties;
        this.eventDeliverySchema = $.eventDeliverySchema;
        this.eventhubEndpointId = $.eventhubEndpointId;
        this.expirationTimeUtc = $.expirationTimeUtc;
        this.hybridConnectionEndpointId = $.hybridConnectionEndpointId;
        this.includedEventTypes = $.includedEventTypes;
        this.labels = $.labels;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.retryPolicy = $.retryPolicy;
        this.serviceBusQueueEndpointId = $.serviceBusQueueEndpointId;
        this.serviceBusTopicEndpointId = $.serviceBusTopicEndpointId;
        this.storageBlobDeadLetterDestination = $.storageBlobDeadLetterDestination;
        this.storageQueueEndpoint = $.storageQueueEndpoint;
        this.subjectFilter = $.subjectFilter;
        this.systemTopic = $.systemTopic;
        this.webhookEndpoint = $.webhookEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SystemTopicEventSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SystemTopicEventSubscriptionState $;

        public Builder() {
            $ = new SystemTopicEventSubscriptionState();
        }

        public Builder(SystemTopicEventSubscriptionState defaults) {
            $ = new SystemTopicEventSubscriptionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param advancedFilter A `advanced_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder advancedFilter(@Nullable Output<SystemTopicEventSubscriptionAdvancedFilterArgs> advancedFilter) {
            $.advancedFilter = advancedFilter;
            return this;
        }

        /**
         * @param advancedFilter A `advanced_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder advancedFilter(SystemTopicEventSubscriptionAdvancedFilterArgs advancedFilter) {
            return advancedFilter(Output.of(advancedFilter));
        }

        /**
         * @param advancedFilteringOnArraysEnabled Specifies whether advanced filters should be evaluated against an array of values instead of expecting a singular value. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder advancedFilteringOnArraysEnabled(@Nullable Output<Boolean> advancedFilteringOnArraysEnabled) {
            $.advancedFilteringOnArraysEnabled = advancedFilteringOnArraysEnabled;
            return this;
        }

        /**
         * @param advancedFilteringOnArraysEnabled Specifies whether advanced filters should be evaluated against an array of values instead of expecting a singular value. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder advancedFilteringOnArraysEnabled(Boolean advancedFilteringOnArraysEnabled) {
            return advancedFilteringOnArraysEnabled(Output.of(advancedFilteringOnArraysEnabled));
        }

        /**
         * @param azureFunctionEndpoint An `azure_function_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureFunctionEndpoint(@Nullable Output<SystemTopicEventSubscriptionAzureFunctionEndpointArgs> azureFunctionEndpoint) {
            $.azureFunctionEndpoint = azureFunctionEndpoint;
            return this;
        }

        /**
         * @param azureFunctionEndpoint An `azure_function_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureFunctionEndpoint(SystemTopicEventSubscriptionAzureFunctionEndpointArgs azureFunctionEndpoint) {
            return azureFunctionEndpoint(Output.of(azureFunctionEndpoint));
        }

        /**
         * @param deadLetterIdentity A `dead_letter_identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterIdentity(@Nullable Output<SystemTopicEventSubscriptionDeadLetterIdentityArgs> deadLetterIdentity) {
            $.deadLetterIdentity = deadLetterIdentity;
            return this;
        }

        /**
         * @param deadLetterIdentity A `dead_letter_identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterIdentity(SystemTopicEventSubscriptionDeadLetterIdentityArgs deadLetterIdentity) {
            return deadLetterIdentity(Output.of(deadLetterIdentity));
        }

        /**
         * @param deliveryIdentity A `delivery_identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deliveryIdentity(@Nullable Output<SystemTopicEventSubscriptionDeliveryIdentityArgs> deliveryIdentity) {
            $.deliveryIdentity = deliveryIdentity;
            return this;
        }

        /**
         * @param deliveryIdentity A `delivery_identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deliveryIdentity(SystemTopicEventSubscriptionDeliveryIdentityArgs deliveryIdentity) {
            return deliveryIdentity(Output.of(deliveryIdentity));
        }

        /**
         * @param deliveryProperties One or more `delivery_property` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deliveryProperties(@Nullable Output<List<SystemTopicEventSubscriptionDeliveryPropertyArgs>> deliveryProperties) {
            $.deliveryProperties = deliveryProperties;
            return this;
        }

        /**
         * @param deliveryProperties One or more `delivery_property` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deliveryProperties(List<SystemTopicEventSubscriptionDeliveryPropertyArgs> deliveryProperties) {
            return deliveryProperties(Output.of(deliveryProperties));
        }

        /**
         * @param deliveryProperties One or more `delivery_property` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deliveryProperties(SystemTopicEventSubscriptionDeliveryPropertyArgs... deliveryProperties) {
            return deliveryProperties(List.of(deliveryProperties));
        }

        /**
         * @param eventDeliverySchema Specifies the event delivery schema for the event subscription. Possible values include: `EventGridSchema`, `CloudEventSchemaV1_0`, `CustomInputSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventDeliverySchema(@Nullable Output<String> eventDeliverySchema) {
            $.eventDeliverySchema = eventDeliverySchema;
            return this;
        }

        /**
         * @param eventDeliverySchema Specifies the event delivery schema for the event subscription. Possible values include: `EventGridSchema`, `CloudEventSchemaV1_0`, `CustomInputSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventDeliverySchema(String eventDeliverySchema) {
            return eventDeliverySchema(Output.of(eventDeliverySchema));
        }

        /**
         * @param eventhubEndpointId Specifies the id where the Event Hub is located.
         * 
         * @return builder
         * 
         */
        public Builder eventhubEndpointId(@Nullable Output<String> eventhubEndpointId) {
            $.eventhubEndpointId = eventhubEndpointId;
            return this;
        }

        /**
         * @param eventhubEndpointId Specifies the id where the Event Hub is located.
         * 
         * @return builder
         * 
         */
        public Builder eventhubEndpointId(String eventhubEndpointId) {
            return eventhubEndpointId(Output.of(eventhubEndpointId));
        }

        /**
         * @param expirationTimeUtc Specifies the expiration time of the event subscription (Datetime Format `RFC 3339`).
         * 
         * @return builder
         * 
         */
        public Builder expirationTimeUtc(@Nullable Output<String> expirationTimeUtc) {
            $.expirationTimeUtc = expirationTimeUtc;
            return this;
        }

        /**
         * @param expirationTimeUtc Specifies the expiration time of the event subscription (Datetime Format `RFC 3339`).
         * 
         * @return builder
         * 
         */
        public Builder expirationTimeUtc(String expirationTimeUtc) {
            return expirationTimeUtc(Output.of(expirationTimeUtc));
        }

        /**
         * @param hybridConnectionEndpointId Specifies the id where the Hybrid Connection is located.
         * 
         * @return builder
         * 
         */
        public Builder hybridConnectionEndpointId(@Nullable Output<String> hybridConnectionEndpointId) {
            $.hybridConnectionEndpointId = hybridConnectionEndpointId;
            return this;
        }

        /**
         * @param hybridConnectionEndpointId Specifies the id where the Hybrid Connection is located.
         * 
         * @return builder
         * 
         */
        public Builder hybridConnectionEndpointId(String hybridConnectionEndpointId) {
            return hybridConnectionEndpointId(Output.of(hybridConnectionEndpointId));
        }

        /**
         * @param includedEventTypes A list of applicable event types that need to be part of the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder includedEventTypes(@Nullable Output<List<String>> includedEventTypes) {
            $.includedEventTypes = includedEventTypes;
            return this;
        }

        /**
         * @param includedEventTypes A list of applicable event types that need to be part of the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder includedEventTypes(List<String> includedEventTypes) {
            return includedEventTypes(Output.of(includedEventTypes));
        }

        /**
         * @param includedEventTypes A list of applicable event types that need to be part of the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder includedEventTypes(String... includedEventTypes) {
            return includedEventTypes(List.of(includedEventTypes));
        }

        /**
         * @param labels A list of labels to assign to the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A list of labels to assign to the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels A list of labels to assign to the event subscription.
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param name The name which should be used for this Event Subscription. Changing this forces a new Event Subscription to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Event Subscription. Changing this forces a new Event Subscription to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the System Topic exists. Changing this forces a new Event Subscription to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the System Topic exists. Changing this forces a new Event Subscription to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param retryPolicy A `retry_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<SystemTopicEventSubscriptionRetryPolicyArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param retryPolicy A `retry_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(SystemTopicEventSubscriptionRetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        /**
         * @param serviceBusQueueEndpointId Specifies the id where the Service Bus Queue is located.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusQueueEndpointId(@Nullable Output<String> serviceBusQueueEndpointId) {
            $.serviceBusQueueEndpointId = serviceBusQueueEndpointId;
            return this;
        }

        /**
         * @param serviceBusQueueEndpointId Specifies the id where the Service Bus Queue is located.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusQueueEndpointId(String serviceBusQueueEndpointId) {
            return serviceBusQueueEndpointId(Output.of(serviceBusQueueEndpointId));
        }

        /**
         * @param serviceBusTopicEndpointId Specifies the id where the Service Bus Topic is located.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusTopicEndpointId(@Nullable Output<String> serviceBusTopicEndpointId) {
            $.serviceBusTopicEndpointId = serviceBusTopicEndpointId;
            return this;
        }

        /**
         * @param serviceBusTopicEndpointId Specifies the id where the Service Bus Topic is located.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusTopicEndpointId(String serviceBusTopicEndpointId) {
            return serviceBusTopicEndpointId(Output.of(serviceBusTopicEndpointId));
        }

        /**
         * @param storageBlobDeadLetterDestination A `storage_blob_dead_letter_destination` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageBlobDeadLetterDestination(@Nullable Output<SystemTopicEventSubscriptionStorageBlobDeadLetterDestinationArgs> storageBlobDeadLetterDestination) {
            $.storageBlobDeadLetterDestination = storageBlobDeadLetterDestination;
            return this;
        }

        /**
         * @param storageBlobDeadLetterDestination A `storage_blob_dead_letter_destination` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageBlobDeadLetterDestination(SystemTopicEventSubscriptionStorageBlobDeadLetterDestinationArgs storageBlobDeadLetterDestination) {
            return storageBlobDeadLetterDestination(Output.of(storageBlobDeadLetterDestination));
        }

        /**
         * @param storageQueueEndpoint A `storage_queue_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageQueueEndpoint(@Nullable Output<SystemTopicEventSubscriptionStorageQueueEndpointArgs> storageQueueEndpoint) {
            $.storageQueueEndpoint = storageQueueEndpoint;
            return this;
        }

        /**
         * @param storageQueueEndpoint A `storage_queue_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageQueueEndpoint(SystemTopicEventSubscriptionStorageQueueEndpointArgs storageQueueEndpoint) {
            return storageQueueEndpoint(Output.of(storageQueueEndpoint));
        }

        /**
         * @param subjectFilter A `subject_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder subjectFilter(@Nullable Output<SystemTopicEventSubscriptionSubjectFilterArgs> subjectFilter) {
            $.subjectFilter = subjectFilter;
            return this;
        }

        /**
         * @param subjectFilter A `subject_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder subjectFilter(SystemTopicEventSubscriptionSubjectFilterArgs subjectFilter) {
            return subjectFilter(Output.of(subjectFilter));
        }

        /**
         * @param systemTopic The System Topic where the Event Subscription should be created in. Changing this forces a new Event Subscription to be created.
         * 
         * @return builder
         * 
         */
        public Builder systemTopic(@Nullable Output<String> systemTopic) {
            $.systemTopic = systemTopic;
            return this;
        }

        /**
         * @param systemTopic The System Topic where the Event Subscription should be created in. Changing this forces a new Event Subscription to be created.
         * 
         * @return builder
         * 
         */
        public Builder systemTopic(String systemTopic) {
            return systemTopic(Output.of(systemTopic));
        }

        /**
         * @param webhookEndpoint A `webhook_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder webhookEndpoint(@Nullable Output<SystemTopicEventSubscriptionWebhookEndpointArgs> webhookEndpoint) {
            $.webhookEndpoint = webhookEndpoint;
            return this;
        }

        /**
         * @param webhookEndpoint A `webhook_endpoint` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder webhookEndpoint(SystemTopicEventSubscriptionWebhookEndpointArgs webhookEndpoint) {
            return webhookEndpoint(Output.of(webhookEndpoint));
        }

        public SystemTopicEventSubscriptionState build() {
            return $;
        }
    }

}