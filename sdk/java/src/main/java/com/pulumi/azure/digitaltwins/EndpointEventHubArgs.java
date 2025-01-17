// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.digitaltwins;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointEventHubArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointEventHubArgs Empty = new EndpointEventHubArgs();

    /**
     * The storage secret of the dead-lettering, whose format is `https://&lt;storageAccountname&gt;.blob.core.windows.net/&lt;containerName&gt;?&lt;SASToken&gt;`. When an endpoint can&#39;t deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
     * 
     */
    @Import(name="deadLetterStorageSecret")
    private @Nullable Output<String> deadLetterStorageSecret;

    /**
     * @return The storage secret of the dead-lettering, whose format is `https://&lt;storageAccountname&gt;.blob.core.windows.net/&lt;containerName&gt;?&lt;SASToken&gt;`. When an endpoint can&#39;t deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
     * 
     */
    public Optional<Output<String>> deadLetterStorageSecret() {
        return Optional.ofNullable(this.deadLetterStorageSecret);
    }

    /**
     * The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
     * 
     */
    @Import(name="digitalTwinsId", required=true)
    private Output<String> digitalTwinsId;

    /**
     * @return The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
     * 
     */
    public Output<String> digitalTwinsId() {
        return this.digitalTwinsId;
    }

    /**
     * The primary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
     * 
     */
    @Import(name="eventhubPrimaryConnectionString", required=true)
    private Output<String> eventhubPrimaryConnectionString;

    /**
     * @return The primary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
     * 
     */
    public Output<String> eventhubPrimaryConnectionString() {
        return this.eventhubPrimaryConnectionString;
    }

    /**
     * The secondary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
     * 
     */
    @Import(name="eventhubSecondaryConnectionString", required=true)
    private Output<String> eventhubSecondaryConnectionString;

    /**
     * @return The secondary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
     * 
     */
    public Output<String> eventhubSecondaryConnectionString() {
        return this.eventhubSecondaryConnectionString;
    }

    /**
     * The name which should be used for this Digital Twins Event Hub Endpoint. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Digital Twins Event Hub Endpoint. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private EndpointEventHubArgs() {}

    private EndpointEventHubArgs(EndpointEventHubArgs $) {
        this.deadLetterStorageSecret = $.deadLetterStorageSecret;
        this.digitalTwinsId = $.digitalTwinsId;
        this.eventhubPrimaryConnectionString = $.eventhubPrimaryConnectionString;
        this.eventhubSecondaryConnectionString = $.eventhubSecondaryConnectionString;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointEventHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointEventHubArgs $;

        public Builder() {
            $ = new EndpointEventHubArgs();
        }

        public Builder(EndpointEventHubArgs defaults) {
            $ = new EndpointEventHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deadLetterStorageSecret The storage secret of the dead-lettering, whose format is `https://&lt;storageAccountname&gt;.blob.core.windows.net/&lt;containerName&gt;?&lt;SASToken&gt;`. When an endpoint can&#39;t deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterStorageSecret(@Nullable Output<String> deadLetterStorageSecret) {
            $.deadLetterStorageSecret = deadLetterStorageSecret;
            return this;
        }

        /**
         * @param deadLetterStorageSecret The storage secret of the dead-lettering, whose format is `https://&lt;storageAccountname&gt;.blob.core.windows.net/&lt;containerName&gt;?&lt;SASToken&gt;`. When an endpoint can&#39;t deliver an event within a certain time period or after trying to deliver the event a certain number of times, it can send the undelivered event to a storage account.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterStorageSecret(String deadLetterStorageSecret) {
            return deadLetterStorageSecret(Output.of(deadLetterStorageSecret));
        }

        /**
         * @param digitalTwinsId The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder digitalTwinsId(Output<String> digitalTwinsId) {
            $.digitalTwinsId = digitalTwinsId;
            return this;
        }

        /**
         * @param digitalTwinsId The resource ID of the Digital Twins Instance. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder digitalTwinsId(String digitalTwinsId) {
            return digitalTwinsId(Output.of(digitalTwinsId));
        }

        /**
         * @param eventhubPrimaryConnectionString The primary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
         * 
         * @return builder
         * 
         */
        public Builder eventhubPrimaryConnectionString(Output<String> eventhubPrimaryConnectionString) {
            $.eventhubPrimaryConnectionString = eventhubPrimaryConnectionString;
            return this;
        }

        /**
         * @param eventhubPrimaryConnectionString The primary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
         * 
         * @return builder
         * 
         */
        public Builder eventhubPrimaryConnectionString(String eventhubPrimaryConnectionString) {
            return eventhubPrimaryConnectionString(Output.of(eventhubPrimaryConnectionString));
        }

        /**
         * @param eventhubSecondaryConnectionString The secondary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
         * 
         * @return builder
         * 
         */
        public Builder eventhubSecondaryConnectionString(Output<String> eventhubSecondaryConnectionString) {
            $.eventhubSecondaryConnectionString = eventhubSecondaryConnectionString;
            return this;
        }

        /**
         * @param eventhubSecondaryConnectionString The secondary connection string of the Event Hub Authorization Rule with a minimum of `send` permission.
         * 
         * @return builder
         * 
         */
        public Builder eventhubSecondaryConnectionString(String eventhubSecondaryConnectionString) {
            return eventhubSecondaryConnectionString(Output.of(eventhubSecondaryConnectionString));
        }

        /**
         * @param name The name which should be used for this Digital Twins Event Hub Endpoint. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Digital Twins Event Hub Endpoint. Changing this forces a new Digital Twins Event Hub Endpoint to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public EndpointEventHubArgs build() {
            $.digitalTwinsId = Objects.requireNonNull($.digitalTwinsId, "expected parameter 'digitalTwinsId' to be non-null");
            $.eventhubPrimaryConnectionString = Objects.requireNonNull($.eventhubPrimaryConnectionString, "expected parameter 'eventhubPrimaryConnectionString' to be non-null");
            $.eventhubSecondaryConnectionString = Objects.requireNonNull($.eventhubSecondaryConnectionString, "expected parameter 'eventhubSecondaryConnectionString' to be non-null");
            return $;
        }
    }

}
