// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCnameRecordArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCnameRecordArgs Empty = new GetCnameRecordArgs();

    /**
     * The name of the Private DNS CNAME Record.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Private DNS CNAME Record.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the resource group where the Private DNS Zone (parent resource) exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the resource group where the Private DNS Zone (parent resource) exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the Private DNS Zone where the resource exists.
     * 
     */
    @Import(name="zoneName", required=true)
    private Output<String> zoneName;

    /**
     * @return Specifies the Private DNS Zone where the resource exists.
     * 
     */
    public Output<String> zoneName() {
        return this.zoneName;
    }

    private GetCnameRecordArgs() {}

    private GetCnameRecordArgs(GetCnameRecordArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.zoneName = $.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCnameRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCnameRecordArgs $;

        public Builder() {
            $ = new GetCnameRecordArgs();
        }

        public Builder(GetCnameRecordArgs defaults) {
            $ = new GetCnameRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Private DNS CNAME Record.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Private DNS CNAME Record.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Specifies the resource group where the Private DNS Zone (parent resource) exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the resource group where the Private DNS Zone (parent resource) exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param zoneName Specifies the Private DNS Zone where the resource exists.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(Output<String> zoneName) {
            $.zoneName = zoneName;
            return this;
        }

        /**
         * @param zoneName Specifies the Private DNS Zone where the resource exists.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(String zoneName) {
            return zoneName(Output.of(zoneName));
        }

        public GetCnameRecordArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.zoneName = Objects.requireNonNull($.zoneName, "expected parameter 'zoneName' to be non-null");
            return $;
        }
    }

}