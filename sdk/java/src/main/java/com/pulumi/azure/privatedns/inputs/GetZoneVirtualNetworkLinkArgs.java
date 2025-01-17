// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetZoneVirtualNetworkLinkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZoneVirtualNetworkLinkArgs Empty = new GetZoneVirtualNetworkLinkArgs();

    /**
     * The name of the Private DNS Zone Virtual Network Link.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Private DNS Zone Virtual Network Link.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Private DNS zone (without a terminating dot).
     * 
     */
    @Import(name="privateDnsZoneName", required=true)
    private Output<String> privateDnsZoneName;

    /**
     * @return The name of the Private DNS zone (without a terminating dot).
     * 
     */
    public Output<String> privateDnsZoneName() {
        return this.privateDnsZoneName;
    }

    /**
     * Specifies the resource group where the Private DNS Zone exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the resource group where the Private DNS Zone exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetZoneVirtualNetworkLinkArgs() {}

    private GetZoneVirtualNetworkLinkArgs(GetZoneVirtualNetworkLinkArgs $) {
        this.name = $.name;
        this.privateDnsZoneName = $.privateDnsZoneName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZoneVirtualNetworkLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZoneVirtualNetworkLinkArgs $;

        public Builder() {
            $ = new GetZoneVirtualNetworkLinkArgs();
        }

        public Builder(GetZoneVirtualNetworkLinkArgs defaults) {
            $ = new GetZoneVirtualNetworkLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Private DNS Zone Virtual Network Link.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Private DNS Zone Virtual Network Link.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateDnsZoneName The name of the Private DNS zone (without a terminating dot).
         * 
         * @return builder
         * 
         */
        public Builder privateDnsZoneName(Output<String> privateDnsZoneName) {
            $.privateDnsZoneName = privateDnsZoneName;
            return this;
        }

        /**
         * @param privateDnsZoneName The name of the Private DNS zone (without a terminating dot).
         * 
         * @return builder
         * 
         */
        public Builder privateDnsZoneName(String privateDnsZoneName) {
            return privateDnsZoneName(Output.of(privateDnsZoneName));
        }

        /**
         * @param resourceGroupName Specifies the resource group where the Private DNS Zone exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the resource group where the Private DNS Zone exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetZoneVirtualNetworkLinkArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.privateDnsZoneName = Objects.requireNonNull($.privateDnsZoneName, "expected parameter 'privateDnsZoneName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
