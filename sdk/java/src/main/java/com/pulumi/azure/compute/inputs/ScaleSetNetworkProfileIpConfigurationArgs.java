// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.ScaleSetNetworkProfileIpConfigurationPublicIpAddressConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScaleSetNetworkProfileIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScaleSetNetworkProfileIpConfigurationArgs Empty = new ScaleSetNetworkProfileIpConfigurationArgs();

    /**
     * Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets can use the same application gateway.
     * 
     */
    @Import(name="applicationGatewayBackendAddressPoolIds")
    private @Nullable Output<List<String>> applicationGatewayBackendAddressPoolIds;

    /**
     * @return Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets can use the same application gateway.
     * 
     */
    public Optional<Output<List<String>>> applicationGatewayBackendAddressPoolIds() {
        return Optional.ofNullable(this.applicationGatewayBackendAddressPoolIds);
    }

    /**
     * Specifies up to `20` application security group IDs.
     * 
     */
    @Import(name="applicationSecurityGroupIds")
    private @Nullable Output<List<String>> applicationSecurityGroupIds;

    /**
     * @return Specifies up to `20` application security group IDs.
     * 
     */
    public Optional<Output<List<String>>> applicationSecurityGroupIds() {
        return Optional.ofNullable(this.applicationSecurityGroupIds);
    }

    /**
     * Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same load balancer.
     * 
     */
    @Import(name="loadBalancerBackendAddressPoolIds")
    private @Nullable Output<List<String>> loadBalancerBackendAddressPoolIds;

    /**
     * @return Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same load balancer.
     * 
     */
    public Optional<Output<List<String>>> loadBalancerBackendAddressPoolIds() {
        return Optional.ofNullable(this.loadBalancerBackendAddressPoolIds);
    }

    /**
     * Specifies an array of references to inbound NAT pools for load balancers. A scale set can reference inbound NAT pools of one public and one internal load balancer. Multiple scale sets cannot use the same load balancer.
     * 
     */
    @Import(name="loadBalancerInboundNatRulesIds")
    private @Nullable Output<List<String>> loadBalancerInboundNatRulesIds;

    /**
     * @return Specifies an array of references to inbound NAT pools for load balancers. A scale set can reference inbound NAT pools of one public and one internal load balancer. Multiple scale sets cannot use the same load balancer.
     * 
     */
    public Optional<Output<List<String>>> loadBalancerInboundNatRulesIds() {
        return Optional.ofNullable(this.loadBalancerInboundNatRulesIds);
    }

    /**
     * Specifies name of the IP configuration.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies name of the IP configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies if this ip_configuration is the primary one.
     * 
     */
    @Import(name="primary", required=true)
    private Output<Boolean> primary;

    /**
     * @return Specifies if this ip_configuration is the primary one.
     * 
     */
    public Output<Boolean> primary() {
        return this.primary;
    }

    /**
     * Describes a virtual machines scale set IP Configuration&#39;s PublicIPAddress configuration. The public_ip_address_configuration is documented below.
     * 
     */
    @Import(name="publicIpAddressConfiguration")
    private @Nullable Output<ScaleSetNetworkProfileIpConfigurationPublicIpAddressConfigurationArgs> publicIpAddressConfiguration;

    /**
     * @return Describes a virtual machines scale set IP Configuration&#39;s PublicIPAddress configuration. The public_ip_address_configuration is documented below.
     * 
     */
    public Optional<Output<ScaleSetNetworkProfileIpConfigurationPublicIpAddressConfigurationArgs>> publicIpAddressConfiguration() {
        return Optional.ofNullable(this.publicIpAddressConfiguration);
    }

    /**
     * Specifies the identifier of the subnet.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return Specifies the identifier of the subnet.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private ScaleSetNetworkProfileIpConfigurationArgs() {}

    private ScaleSetNetworkProfileIpConfigurationArgs(ScaleSetNetworkProfileIpConfigurationArgs $) {
        this.applicationGatewayBackendAddressPoolIds = $.applicationGatewayBackendAddressPoolIds;
        this.applicationSecurityGroupIds = $.applicationSecurityGroupIds;
        this.loadBalancerBackendAddressPoolIds = $.loadBalancerBackendAddressPoolIds;
        this.loadBalancerInboundNatRulesIds = $.loadBalancerInboundNatRulesIds;
        this.name = $.name;
        this.primary = $.primary;
        this.publicIpAddressConfiguration = $.publicIpAddressConfiguration;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScaleSetNetworkProfileIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScaleSetNetworkProfileIpConfigurationArgs $;

        public Builder() {
            $ = new ScaleSetNetworkProfileIpConfigurationArgs();
        }

        public Builder(ScaleSetNetworkProfileIpConfigurationArgs defaults) {
            $ = new ScaleSetNetworkProfileIpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationGatewayBackendAddressPoolIds Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets can use the same application gateway.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayBackendAddressPoolIds(@Nullable Output<List<String>> applicationGatewayBackendAddressPoolIds) {
            $.applicationGatewayBackendAddressPoolIds = applicationGatewayBackendAddressPoolIds;
            return this;
        }

        /**
         * @param applicationGatewayBackendAddressPoolIds Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets can use the same application gateway.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayBackendAddressPoolIds(List<String> applicationGatewayBackendAddressPoolIds) {
            return applicationGatewayBackendAddressPoolIds(Output.of(applicationGatewayBackendAddressPoolIds));
        }

        /**
         * @param applicationGatewayBackendAddressPoolIds Specifies an array of references to backend address pools of application gateways. A scale set can reference backend address pools of multiple application gateways. Multiple scale sets can use the same application gateway.
         * 
         * @return builder
         * 
         */
        public Builder applicationGatewayBackendAddressPoolIds(String... applicationGatewayBackendAddressPoolIds) {
            return applicationGatewayBackendAddressPoolIds(List.of(applicationGatewayBackendAddressPoolIds));
        }

        /**
         * @param applicationSecurityGroupIds Specifies up to `20` application security group IDs.
         * 
         * @return builder
         * 
         */
        public Builder applicationSecurityGroupIds(@Nullable Output<List<String>> applicationSecurityGroupIds) {
            $.applicationSecurityGroupIds = applicationSecurityGroupIds;
            return this;
        }

        /**
         * @param applicationSecurityGroupIds Specifies up to `20` application security group IDs.
         * 
         * @return builder
         * 
         */
        public Builder applicationSecurityGroupIds(List<String> applicationSecurityGroupIds) {
            return applicationSecurityGroupIds(Output.of(applicationSecurityGroupIds));
        }

        /**
         * @param applicationSecurityGroupIds Specifies up to `20` application security group IDs.
         * 
         * @return builder
         * 
         */
        public Builder applicationSecurityGroupIds(String... applicationSecurityGroupIds) {
            return applicationSecurityGroupIds(List.of(applicationSecurityGroupIds));
        }

        /**
         * @param loadBalancerBackendAddressPoolIds Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPoolIds(@Nullable Output<List<String>> loadBalancerBackendAddressPoolIds) {
            $.loadBalancerBackendAddressPoolIds = loadBalancerBackendAddressPoolIds;
            return this;
        }

        /**
         * @param loadBalancerBackendAddressPoolIds Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPoolIds(List<String> loadBalancerBackendAddressPoolIds) {
            return loadBalancerBackendAddressPoolIds(Output.of(loadBalancerBackendAddressPoolIds));
        }

        /**
         * @param loadBalancerBackendAddressPoolIds Specifies an array of references to backend address pools of load balancers. A scale set can reference backend address pools of one public and one internal load balancer. Multiple scale sets cannot use the same load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerBackendAddressPoolIds(String... loadBalancerBackendAddressPoolIds) {
            return loadBalancerBackendAddressPoolIds(List.of(loadBalancerBackendAddressPoolIds));
        }

        /**
         * @param loadBalancerInboundNatRulesIds Specifies an array of references to inbound NAT pools for load balancers. A scale set can reference inbound NAT pools of one public and one internal load balancer. Multiple scale sets cannot use the same load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerInboundNatRulesIds(@Nullable Output<List<String>> loadBalancerInboundNatRulesIds) {
            $.loadBalancerInboundNatRulesIds = loadBalancerInboundNatRulesIds;
            return this;
        }

        /**
         * @param loadBalancerInboundNatRulesIds Specifies an array of references to inbound NAT pools for load balancers. A scale set can reference inbound NAT pools of one public and one internal load balancer. Multiple scale sets cannot use the same load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerInboundNatRulesIds(List<String> loadBalancerInboundNatRulesIds) {
            return loadBalancerInboundNatRulesIds(Output.of(loadBalancerInboundNatRulesIds));
        }

        /**
         * @param loadBalancerInboundNatRulesIds Specifies an array of references to inbound NAT pools for load balancers. A scale set can reference inbound NAT pools of one public and one internal load balancer. Multiple scale sets cannot use the same load balancer.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerInboundNatRulesIds(String... loadBalancerInboundNatRulesIds) {
            return loadBalancerInboundNatRulesIds(List.of(loadBalancerInboundNatRulesIds));
        }

        /**
         * @param name Specifies name of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies name of the IP configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primary Specifies if this ip_configuration is the primary one.
         * 
         * @return builder
         * 
         */
        public Builder primary(Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Specifies if this ip_configuration is the primary one.
         * 
         * @return builder
         * 
         */
        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param publicIpAddressConfiguration Describes a virtual machines scale set IP Configuration&#39;s PublicIPAddress configuration. The public_ip_address_configuration is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressConfiguration(@Nullable Output<ScaleSetNetworkProfileIpConfigurationPublicIpAddressConfigurationArgs> publicIpAddressConfiguration) {
            $.publicIpAddressConfiguration = publicIpAddressConfiguration;
            return this;
        }

        /**
         * @param publicIpAddressConfiguration Describes a virtual machines scale set IP Configuration&#39;s PublicIPAddress configuration. The public_ip_address_configuration is documented below.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressConfiguration(ScaleSetNetworkProfileIpConfigurationPublicIpAddressConfigurationArgs publicIpAddressConfiguration) {
            return publicIpAddressConfiguration(Output.of(publicIpAddressConfiguration));
        }

        /**
         * @param subnetId Specifies the identifier of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId Specifies the identifier of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public ScaleSetNetworkProfileIpConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.primary = Objects.requireNonNull($.primary, "expected parameter 'primary' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}