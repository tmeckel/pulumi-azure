// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionGroupWebhookReceiverAadAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionGroupWebhookReceiverAadAuthArgs Empty = new ActionGroupWebhookReceiverAadAuthArgs();

    /**
     * The identifier URI for AAD auth.
     * 
     */
    @Import(name="identifierUri")
    private @Nullable Output<String> identifierUri;

    /**
     * @return The identifier URI for AAD auth.
     * 
     */
    public Optional<Output<String>> identifierUri() {
        return Optional.ofNullable(this.identifierUri);
    }

    /**
     * The webhook application object Id for AAD auth.
     * 
     */
    @Import(name="objectId", required=true)
    private Output<String> objectId;

    /**
     * @return The webhook application object Id for AAD auth.
     * 
     */
    public Output<String> objectId() {
        return this.objectId;
    }

    /**
     * The tenant id for AAD auth.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenant id for AAD auth.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private ActionGroupWebhookReceiverAadAuthArgs() {}

    private ActionGroupWebhookReceiverAadAuthArgs(ActionGroupWebhookReceiverAadAuthArgs $) {
        this.identifierUri = $.identifierUri;
        this.objectId = $.objectId;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionGroupWebhookReceiverAadAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionGroupWebhookReceiverAadAuthArgs $;

        public Builder() {
            $ = new ActionGroupWebhookReceiverAadAuthArgs();
        }

        public Builder(ActionGroupWebhookReceiverAadAuthArgs defaults) {
            $ = new ActionGroupWebhookReceiverAadAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifierUri The identifier URI for AAD auth.
         * 
         * @return builder
         * 
         */
        public Builder identifierUri(@Nullable Output<String> identifierUri) {
            $.identifierUri = identifierUri;
            return this;
        }

        /**
         * @param identifierUri The identifier URI for AAD auth.
         * 
         * @return builder
         * 
         */
        public Builder identifierUri(String identifierUri) {
            return identifierUri(Output.of(identifierUri));
        }

        /**
         * @param objectId The webhook application object Id for AAD auth.
         * 
         * @return builder
         * 
         */
        public Builder objectId(Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        /**
         * @param objectId The webhook application object Id for AAD auth.
         * 
         * @return builder
         * 
         */
        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        /**
         * @param tenantId The tenant id for AAD auth.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant id for AAD auth.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public ActionGroupWebhookReceiverAadAuthArgs build() {
            $.objectId = Objects.requireNonNull($.objectId, "expected parameter 'objectId' to be non-null");
            return $;
        }
    }

}