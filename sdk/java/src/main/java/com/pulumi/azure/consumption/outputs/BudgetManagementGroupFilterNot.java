// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.outputs;

import com.pulumi.azure.consumption.outputs.BudgetManagementGroupFilterNotDimension;
import com.pulumi.azure.consumption.outputs.BudgetManagementGroupFilterNotTag;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetManagementGroupFilterNot {
    /**
     * @return One `dimension` block as defined below to filter the budget on. Conflicts with `tag`.
     * 
     */
    private @Nullable BudgetManagementGroupFilterNotDimension dimension;
    /**
     * @return One `tag` block as defined below to filter the budget on. Conflicts with `dimension`.
     * 
     */
    private @Nullable BudgetManagementGroupFilterNotTag tag;

    private BudgetManagementGroupFilterNot() {}
    /**
     * @return One `dimension` block as defined below to filter the budget on. Conflicts with `tag`.
     * 
     */
    public Optional<BudgetManagementGroupFilterNotDimension> dimension() {
        return Optional.ofNullable(this.dimension);
    }
    /**
     * @return One `tag` block as defined below to filter the budget on. Conflicts with `dimension`.
     * 
     */
    public Optional<BudgetManagementGroupFilterNotTag> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetManagementGroupFilterNot defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BudgetManagementGroupFilterNotDimension dimension;
        private @Nullable BudgetManagementGroupFilterNotTag tag;
        public Builder() {}
        public Builder(BudgetManagementGroupFilterNot defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimension = defaults.dimension;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder dimension(@Nullable BudgetManagementGroupFilterNotDimension dimension) {
            this.dimension = dimension;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable BudgetManagementGroupFilterNotTag tag) {
            this.tag = tag;
            return this;
        }
        public BudgetManagementGroupFilterNot build() {
            final var o = new BudgetManagementGroupFilterNot();
            o.dimension = dimension;
            o.tag = tag;
            return o;
        }
    }
}