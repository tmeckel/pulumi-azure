// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datashare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatasetKustoDatabaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatasetKustoDatabaseArgs Empty = new GetDatasetKustoDatabaseArgs();

    /**
     * The name of this Data Share Kusto Database Dataset.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of this Data Share Kusto Database Dataset.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The resource ID of the Data Share where this Data Share Kusto Database Dataset should be created.
     * 
     */
    @Import(name="shareId", required=true)
    private Output<String> shareId;

    /**
     * @return The resource ID of the Data Share where this Data Share Kusto Database Dataset should be created.
     * 
     */
    public Output<String> shareId() {
        return this.shareId;
    }

    private GetDatasetKustoDatabaseArgs() {}

    private GetDatasetKustoDatabaseArgs(GetDatasetKustoDatabaseArgs $) {
        this.name = $.name;
        this.shareId = $.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatasetKustoDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatasetKustoDatabaseArgs $;

        public Builder() {
            $ = new GetDatasetKustoDatabaseArgs();
        }

        public Builder(GetDatasetKustoDatabaseArgs defaults) {
            $ = new GetDatasetKustoDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this Data Share Kusto Database Dataset.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Data Share Kusto Database Dataset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param shareId The resource ID of the Data Share where this Data Share Kusto Database Dataset should be created.
         * 
         * @return builder
         * 
         */
        public Builder shareId(Output<String> shareId) {
            $.shareId = shareId;
            return this;
        }

        /**
         * @param shareId The resource ID of the Data Share where this Data Share Kusto Database Dataset should be created.
         * 
         * @return builder
         * 
         */
        public Builder shareId(String shareId) {
            return shareId(Output.of(shareId));
        }

        public GetDatasetKustoDatabaseArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.shareId = Objects.requireNonNull($.shareId, "expected parameter 'shareId' to be non-null");
            return $;
        }
    }

}