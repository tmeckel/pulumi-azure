// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databoxedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrderStatus {
    /**
     * @return Dictionary to hold generic information which is not stored by the already existing properties.
     * 
     */
    private @Nullable Map<String,String> additionalDetails;
    /**
     * @return Comments related to this status change.
     * 
     */
    private @Nullable String comments;
    /**
     * @return The current status of the order. Possible values include `Untracked`, `AwaitingFulfilment`, `AwaitingPreparation`, `AwaitingShipment`, `Shipped`, `Arriving`, `Delivered`, `ReplacementRequested`, `LostDevice`, `Declined`, `ReturnInitiated`, `AwaitingReturnShipment`, `ShippedBack` or `CollectedAtMicrosoft`.
     * 
     */
    private @Nullable String info;
    /**
     * @return Time of status update.
     * 
     */
    private @Nullable String lastUpdate;

    private OrderStatus() {}
    /**
     * @return Dictionary to hold generic information which is not stored by the already existing properties.
     * 
     */
    public Map<String,String> additionalDetails() {
        return this.additionalDetails == null ? Map.of() : this.additionalDetails;
    }
    /**
     * @return Comments related to this status change.
     * 
     */
    public Optional<String> comments() {
        return Optional.ofNullable(this.comments);
    }
    /**
     * @return The current status of the order. Possible values include `Untracked`, `AwaitingFulfilment`, `AwaitingPreparation`, `AwaitingShipment`, `Shipped`, `Arriving`, `Delivered`, `ReplacementRequested`, `LostDevice`, `Declined`, `ReturnInitiated`, `AwaitingReturnShipment`, `ShippedBack` or `CollectedAtMicrosoft`.
     * 
     */
    public Optional<String> info() {
        return Optional.ofNullable(this.info);
    }
    /**
     * @return Time of status update.
     * 
     */
    public Optional<String> lastUpdate() {
        return Optional.ofNullable(this.lastUpdate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> additionalDetails;
        private @Nullable String comments;
        private @Nullable String info;
        private @Nullable String lastUpdate;
        public Builder() {}
        public Builder(OrderStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalDetails = defaults.additionalDetails;
    	      this.comments = defaults.comments;
    	      this.info = defaults.info;
    	      this.lastUpdate = defaults.lastUpdate;
        }

        @CustomType.Setter
        public Builder additionalDetails(@Nullable Map<String,String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            return this;
        }
        @CustomType.Setter
        public Builder comments(@Nullable String comments) {
            this.comments = comments;
            return this;
        }
        @CustomType.Setter
        public Builder info(@Nullable String info) {
            this.info = info;
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdate(@Nullable String lastUpdate) {
            this.lastUpdate = lastUpdate;
            return this;
        }
        public OrderStatus build() {
            final var o = new OrderStatus();
            o.additionalDetails = additionalDetails;
            o.comments = comments;
            o.info = info;
            o.lastUpdate = lastUpdate;
            return o;
        }
    }
}