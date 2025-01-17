// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceNetworkRuleSetNetworkRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceNetworkRuleSetNetworkRuleArgs Empty = new NamespaceNetworkRuleSetNetworkRuleArgs();

    /**
     * Should the ServiceBus Namespace Network Rule Set ignore missing Virtual Network Service Endpoint option in the Subnet? Defaults to `false`.
     * 
     */
    @Import(name="ignoreMissingVnetServiceEndpoint")
    private @Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint;

    /**
     * @return Should the ServiceBus Namespace Network Rule Set ignore missing Virtual Network Service Endpoint option in the Subnet? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> ignoreMissingVnetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }

    /**
     * The Subnet ID which should be able to access this ServiceBus Namespace.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The Subnet ID which should be able to access this ServiceBus Namespace.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private NamespaceNetworkRuleSetNetworkRuleArgs() {}

    private NamespaceNetworkRuleSetNetworkRuleArgs(NamespaceNetworkRuleSetNetworkRuleArgs $) {
        this.ignoreMissingVnetServiceEndpoint = $.ignoreMissingVnetServiceEndpoint;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceNetworkRuleSetNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceNetworkRuleSetNetworkRuleArgs $;

        public Builder() {
            $ = new NamespaceNetworkRuleSetNetworkRuleArgs();
        }

        public Builder(NamespaceNetworkRuleSetNetworkRuleArgs defaults) {
            $ = new NamespaceNetworkRuleSetNetworkRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ignoreMissingVnetServiceEndpoint Should the ServiceBus Namespace Network Rule Set ignore missing Virtual Network Service Endpoint option in the Subnet? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint) {
            $.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        /**
         * @param ignoreMissingVnetServiceEndpoint Should the ServiceBus Namespace Network Rule Set ignore missing Virtual Network Service Endpoint option in the Subnet? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
            return ignoreMissingVnetServiceEndpoint(Output.of(ignoreMissingVnetServiceEndpoint));
        }

        /**
         * @param subnetId The Subnet ID which should be able to access this ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The Subnet ID which should be able to access this ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public NamespaceNetworkRuleSetNetworkRuleArgs build() {
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
