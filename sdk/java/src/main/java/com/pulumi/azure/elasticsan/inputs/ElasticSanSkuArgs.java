// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.elasticsan.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ElasticSanSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final ElasticSanSkuArgs Empty = new ElasticSanSkuArgs();

    /**
     * The SKU name. Possible values are `Premium_LRS` and `Premium_ZRS`.
     * 
     * &gt; **NOTE** `Premium_ZRS` SKU is only available in limited Azure regions including `France Central`, `North Europe`, `West Europe`, and `West US 2`. Please refer to this [document](https://azure.microsoft.com/updates/regional-expansion-azure-elastic-san-public-preview-is-now-available-in-more-regions) for more details.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The SKU name. Possible values are `Premium_LRS` and `Premium_ZRS`.
     * 
     * &gt; **NOTE** `Premium_ZRS` SKU is only available in limited Azure regions including `France Central`, `North Europe`, `West Europe`, and `West US 2`. Please refer to this [document](https://azure.microsoft.com/updates/regional-expansion-azure-elastic-san-public-preview-is-now-available-in-more-regions) for more details.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The SKU tier. The only possible value is `Premium`.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return The SKU tier. The only possible value is `Premium`.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private ElasticSanSkuArgs() {}

    private ElasticSanSkuArgs(ElasticSanSkuArgs $) {
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElasticSanSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElasticSanSkuArgs $;

        public Builder() {
            $ = new ElasticSanSkuArgs();
        }

        public Builder(ElasticSanSkuArgs defaults) {
            $ = new ElasticSanSkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The SKU name. Possible values are `Premium_LRS` and `Premium_ZRS`.
         * 
         * &gt; **NOTE** `Premium_ZRS` SKU is only available in limited Azure regions including `France Central`, `North Europe`, `West Europe`, and `West US 2`. Please refer to this [document](https://azure.microsoft.com/updates/regional-expansion-azure-elastic-san-public-preview-is-now-available-in-more-regions) for more details.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The SKU name. Possible values are `Premium_LRS` and `Premium_ZRS`.
         * 
         * &gt; **NOTE** `Premium_ZRS` SKU is only available in limited Azure regions including `France Central`, `North Europe`, `West Europe`, and `West US 2`. Please refer to this [document](https://azure.microsoft.com/updates/regional-expansion-azure-elastic-san-public-preview-is-now-available-in-more-regions) for more details.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tier The SKU tier. The only possible value is `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The SKU tier. The only possible value is `Premium`.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public ElasticSanSkuArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}