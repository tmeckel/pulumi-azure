// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class PolicyVMWorkloadProtectionPolicySimpleRetentionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyVMWorkloadProtectionPolicySimpleRetentionArgs Empty = new PolicyVMWorkloadProtectionPolicySimpleRetentionArgs();

    /**
     * The count that is used to count retention duration with duration type `Days`. Possible values are between `7` and `35`.
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    /**
     * @return The count that is used to count retention duration with duration type `Days`. Possible values are between `7` and `35`.
     * 
     */
    public Output<Integer> count() {
        return this.count;
    }

    private PolicyVMWorkloadProtectionPolicySimpleRetentionArgs() {}

    private PolicyVMWorkloadProtectionPolicySimpleRetentionArgs(PolicyVMWorkloadProtectionPolicySimpleRetentionArgs $) {
        this.count = $.count;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyVMWorkloadProtectionPolicySimpleRetentionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyVMWorkloadProtectionPolicySimpleRetentionArgs $;

        public Builder() {
            $ = new PolicyVMWorkloadProtectionPolicySimpleRetentionArgs();
        }

        public Builder(PolicyVMWorkloadProtectionPolicySimpleRetentionArgs defaults) {
            $ = new PolicyVMWorkloadProtectionPolicySimpleRetentionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count The count that is used to count retention duration with duration type `Days`. Possible values are between `7` and `35`.
         * 
         * @return builder
         * 
         */
        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The count that is used to count retention duration with duration type `Days`. Possible values are between `7` and `35`.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public PolicyVMWorkloadProtectionPolicySimpleRetentionArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            return $;
        }
    }

}