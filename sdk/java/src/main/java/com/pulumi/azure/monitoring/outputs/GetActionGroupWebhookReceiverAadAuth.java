// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetActionGroupWebhookReceiverAadAuth {
    private String identifierUri;
    private String objectId;
    /**
     * @return The Tenant ID for the subscription containing this Event Hub.
     * 
     */
    private String tenantId;

    private GetActionGroupWebhookReceiverAadAuth() {}
    public String identifierUri() {
        return this.identifierUri;
    }
    public String objectId() {
        return this.objectId;
    }
    /**
     * @return The Tenant ID for the subscription containing this Event Hub.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionGroupWebhookReceiverAadAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String identifierUri;
        private String objectId;
        private String tenantId;
        public Builder() {}
        public Builder(GetActionGroupWebhookReceiverAadAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifierUri = defaults.identifierUri;
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder identifierUri(String identifierUri) {
            this.identifierUri = Objects.requireNonNull(identifierUri);
            return this;
        }
        @CustomType.Setter
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public GetActionGroupWebhookReceiverAadAuth build() {
            final var o = new GetActionGroupWebhookReceiverAadAuth();
            o.identifierUri = identifierUri;
            o.objectId = objectId;
            o.tenantId = tenantId;
            return o;
        }
    }
}