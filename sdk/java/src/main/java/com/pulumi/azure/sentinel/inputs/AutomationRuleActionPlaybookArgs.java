// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomationRuleActionPlaybookArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationRuleActionPlaybookArgs Empty = new AutomationRuleActionPlaybookArgs();

    /**
     * The ID of the Logic App that defines the playbook&#39;s logic.
     * 
     */
    @Import(name="logicAppId", required=true)
    private Output<String> logicAppId;

    /**
     * @return The ID of the Logic App that defines the playbook&#39;s logic.
     * 
     */
    public Output<String> logicAppId() {
        return this.logicAppId;
    }

    /**
     * The execution order of this action.
     * 
     */
    @Import(name="order", required=true)
    private Output<Integer> order;

    /**
     * @return The execution order of this action.
     * 
     */
    public Output<Integer> order() {
        return this.order;
    }

    /**
     * The ID of the Tenant that owns the playbook.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The ID of the Tenant that owns the playbook.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private AutomationRuleActionPlaybookArgs() {}

    private AutomationRuleActionPlaybookArgs(AutomationRuleActionPlaybookArgs $) {
        this.logicAppId = $.logicAppId;
        this.order = $.order;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRuleActionPlaybookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRuleActionPlaybookArgs $;

        public Builder() {
            $ = new AutomationRuleActionPlaybookArgs();
        }

        public Builder(AutomationRuleActionPlaybookArgs defaults) {
            $ = new AutomationRuleActionPlaybookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logicAppId The ID of the Logic App that defines the playbook&#39;s logic.
         * 
         * @return builder
         * 
         */
        public Builder logicAppId(Output<String> logicAppId) {
            $.logicAppId = logicAppId;
            return this;
        }

        /**
         * @param logicAppId The ID of the Logic App that defines the playbook&#39;s logic.
         * 
         * @return builder
         * 
         */
        public Builder logicAppId(String logicAppId) {
            return logicAppId(Output.of(logicAppId));
        }

        /**
         * @param order The execution order of this action.
         * 
         * @return builder
         * 
         */
        public Builder order(Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order The execution order of this action.
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        /**
         * @param tenantId The ID of the Tenant that owns the playbook.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The ID of the Tenant that owns the playbook.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public AutomationRuleActionPlaybookArgs build() {
            $.logicAppId = Objects.requireNonNull($.logicAppId, "expected parameter 'logicAppId' to be non-null");
            $.order = Objects.requireNonNull($.order, "expected parameter 'order' to be non-null");
            return $;
        }
    }

}