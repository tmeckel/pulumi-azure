// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    /**
     * Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
     * 
     */
    @Import(name="ignoreMissingVnetServiceEndpoint")
    private @Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint;

    /**
     * @return Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> ignoreMissingVnetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }

    /**
     * The name of the SQL virtual network rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the SQL virtual network rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serverId", required=true)
    private Output<String> serverId;

    /**
     * @return The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }

    /**
     * The ID of the subnet from which the SQL server will accept communications.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet from which the SQL server will accept communications.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private VirtualNetworkRuleArgs() {}

    private VirtualNetworkRuleArgs(VirtualNetworkRuleArgs $) {
        this.ignoreMissingVnetServiceEndpoint = $.ignoreMissingVnetServiceEndpoint;
        this.name = $.name;
        this.serverId = $.serverId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkRuleArgs $;

        public Builder() {
            $ = new VirtualNetworkRuleArgs();
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
            $ = new VirtualNetworkRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ignoreMissingVnetServiceEndpoint Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint) {
            $.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        /**
         * @param ignoreMissingVnetServiceEndpoint Create the virtual network rule before the subnet has the virtual network service endpoint enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
            return ignoreMissingVnetServiceEndpoint(Output.of(ignoreMissingVnetServiceEndpoint));
        }

        /**
         * @param name The name of the SQL virtual network rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SQL virtual network rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serverId The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverId(Output<String> serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverId The resource ID of the SQL Server to which this SQL virtual network rule will be applied. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serverId(String serverId) {
            return serverId(Output.of(serverId));
        }

        /**
         * @param subnetId The ID of the subnet from which the SQL server will accept communications.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the subnet from which the SQL server will accept communications.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public VirtualNetworkRuleArgs build() {
            $.serverId = Objects.requireNonNull($.serverId, "expected parameter 'serverId' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}