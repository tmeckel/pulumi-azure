// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.inputs;

import com.pulumi.azure.batch.inputs.PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PoolNetworkConfigurationEndpointConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PoolNetworkConfigurationEndpointConfigurationArgs Empty = new PoolNetworkConfigurationEndpointConfigurationArgs();

    /**
     * The port number on the compute node. Acceptable values are between `1` and `65535` except for `29876`, `29877` as these are reserved. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="backendPort", required=true)
    private Output<Integer> backendPort;

    /**
     * @return The port number on the compute node. Acceptable values are between `1` and `65535` except for `29876`, `29877` as these are reserved. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> backendPort() {
        return this.backendPort;
    }

    /**
     * The range of external ports that will be used to provide inbound access to the backendPort on individual compute nodes in the format of `1000-1100`. Acceptable values range between `1` and `65534` except ports from `50000` to `55000` which are reserved by the Batch service. All ranges within a pool must be distinct and cannot overlap. Values must be a range of at least `100` nodes. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="frontendPortRange", required=true)
    private Output<String> frontendPortRange;

    /**
     * @return The range of external ports that will be used to provide inbound access to the backendPort on individual compute nodes in the format of `1000-1100`. Acceptable values range between `1` and `65534` except ports from `50000` to `55000` which are reserved by the Batch service. All ranges within a pool must be distinct and cannot overlap. Values must be a range of at least `100` nodes. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> frontendPortRange() {
        return this.frontendPortRange;
    }

    /**
     * The name of the endpoint. The name must be unique within a Batch pool, can contain letters, numbers, underscores, periods, and hyphens. Names must start with a letter or number, must end with a letter, number, or underscore, and cannot exceed 77 characters. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the endpoint. The name must be unique within a Batch pool, can contain letters, numbers, underscores, periods, and hyphens. Names must start with a letter or number, must end with a letter, number, or underscore, and cannot exceed 77 characters. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * A list of network security group rules that will be applied to the endpoint. The maximum number of rules that can be specified across all the endpoints on a Batch pool is `25`. If no network security group rules are specified, a default rule will be created to allow inbound access to the specified backendPort. Set as documented in the network_security_group_rules block below. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="networkSecurityGroupRules")
    private @Nullable Output<List<PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRuleArgs>> networkSecurityGroupRules;

    /**
     * @return A list of network security group rules that will be applied to the endpoint. The maximum number of rules that can be specified across all the endpoints on a Batch pool is `25`. If no network security group rules are specified, a default rule will be created to allow inbound access to the specified backendPort. Set as documented in the network_security_group_rules block below. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<List<PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRuleArgs>>> networkSecurityGroupRules() {
        return Optional.ofNullable(this.networkSecurityGroupRules);
    }

    /**
     * The protocol of the endpoint. Acceptable values are `TCP` and `UDP`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The protocol of the endpoint. Acceptable values are `TCP` and `UDP`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    private PoolNetworkConfigurationEndpointConfigurationArgs() {}

    private PoolNetworkConfigurationEndpointConfigurationArgs(PoolNetworkConfigurationEndpointConfigurationArgs $) {
        this.backendPort = $.backendPort;
        this.frontendPortRange = $.frontendPortRange;
        this.name = $.name;
        this.networkSecurityGroupRules = $.networkSecurityGroupRules;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PoolNetworkConfigurationEndpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PoolNetworkConfigurationEndpointConfigurationArgs $;

        public Builder() {
            $ = new PoolNetworkConfigurationEndpointConfigurationArgs();
        }

        public Builder(PoolNetworkConfigurationEndpointConfigurationArgs defaults) {
            $ = new PoolNetworkConfigurationEndpointConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendPort The port number on the compute node. Acceptable values are between `1` and `65535` except for `29876`, `29877` as these are reserved. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(Output<Integer> backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        /**
         * @param backendPort The port number on the compute node. Acceptable values are between `1` and `65535` except for `29876`, `29877` as these are reserved. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(Integer backendPort) {
            return backendPort(Output.of(backendPort));
        }

        /**
         * @param frontendPortRange The range of external ports that will be used to provide inbound access to the backendPort on individual compute nodes in the format of `1000-1100`. Acceptable values range between `1` and `65534` except ports from `50000` to `55000` which are reserved by the Batch service. All ranges within a pool must be distinct and cannot overlap. Values must be a range of at least `100` nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortRange(Output<String> frontendPortRange) {
            $.frontendPortRange = frontendPortRange;
            return this;
        }

        /**
         * @param frontendPortRange The range of external ports that will be used to provide inbound access to the backendPort on individual compute nodes in the format of `1000-1100`. Acceptable values range between `1` and `65534` except ports from `50000` to `55000` which are reserved by the Batch service. All ranges within a pool must be distinct and cannot overlap. Values must be a range of at least `100` nodes. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder frontendPortRange(String frontendPortRange) {
            return frontendPortRange(Output.of(frontendPortRange));
        }

        /**
         * @param name The name of the endpoint. The name must be unique within a Batch pool, can contain letters, numbers, underscores, periods, and hyphens. Names must start with a letter or number, must end with a letter, number, or underscore, and cannot exceed 77 characters. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the endpoint. The name must be unique within a Batch pool, can contain letters, numbers, underscores, periods, and hyphens. Names must start with a letter or number, must end with a letter, number, or underscore, and cannot exceed 77 characters. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkSecurityGroupRules A list of network security group rules that will be applied to the endpoint. The maximum number of rules that can be specified across all the endpoints on a Batch pool is `25`. If no network security group rules are specified, a default rule will be created to allow inbound access to the specified backendPort. Set as documented in the network_security_group_rules block below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupRules(@Nullable Output<List<PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRuleArgs>> networkSecurityGroupRules) {
            $.networkSecurityGroupRules = networkSecurityGroupRules;
            return this;
        }

        /**
         * @param networkSecurityGroupRules A list of network security group rules that will be applied to the endpoint. The maximum number of rules that can be specified across all the endpoints on a Batch pool is `25`. If no network security group rules are specified, a default rule will be created to allow inbound access to the specified backendPort. Set as documented in the network_security_group_rules block below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupRules(List<PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRuleArgs> networkSecurityGroupRules) {
            return networkSecurityGroupRules(Output.of(networkSecurityGroupRules));
        }

        /**
         * @param networkSecurityGroupRules A list of network security group rules that will be applied to the endpoint. The maximum number of rules that can be specified across all the endpoints on a Batch pool is `25`. If no network security group rules are specified, a default rule will be created to allow inbound access to the specified backendPort. Set as documented in the network_security_group_rules block below. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder networkSecurityGroupRules(PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRuleArgs... networkSecurityGroupRules) {
            return networkSecurityGroupRules(List.of(networkSecurityGroupRules));
        }

        /**
         * @param protocol The protocol of the endpoint. Acceptable values are `TCP` and `UDP`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol of the endpoint. Acceptable values are `TCP` and `UDP`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public PoolNetworkConfigurationEndpointConfigurationArgs build() {
            $.backendPort = Objects.requireNonNull($.backendPort, "expected parameter 'backendPort' to be non-null");
            $.frontendPortRange = Objects.requireNonNull($.frontendPortRange, "expected parameter 'frontendPortRange' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}