// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.paloalto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs Empty = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs();

    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    @Import(name="publicIpAddressId", required=true)
    private Output<String> publicIpAddressId;

    public Output<String> publicIpAddressId() {
        return this.publicIpAddressId;
    }

    private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs() {}

    private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs $) {
        this.port = $.port;
        this.publicIpAddressId = $.publicIpAddressId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs $;

        public Builder() {
            $ = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs();
        }

        public Builder(NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs defaults) {
            $ = new NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder publicIpAddressId(Output<String> publicIpAddressId) {
            $.publicIpAddressId = publicIpAddressId;
            return this;
        }

        public Builder publicIpAddressId(String publicIpAddressId) {
            return publicIpAddressId(Output.of(publicIpAddressId));
        }

        public NextGenerationFirewallVirtualHubLocalRulestackDestinationNatFrontendConfigArgs build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            $.publicIpAddressId = Objects.requireNonNull($.publicIpAddressId, "expected parameter 'publicIpAddressId' to be non-null");
            return $;
        }
    }

}