// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingActionArgs;
import com.pulumi.azure.appservice.inputs.WindowsWebAppSiteConfigAutoHealSettingTriggerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class WindowsWebAppSiteConfigAutoHealSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsWebAppSiteConfigAutoHealSettingArgs Empty = new WindowsWebAppSiteConfigAutoHealSettingArgs();

    /**
     * An `action` block as defined above.
     * 
     */
    @Import(name="action", required=true)
    private Output<WindowsWebAppSiteConfigAutoHealSettingActionArgs> action;

    /**
     * @return An `action` block as defined above.
     * 
     */
    public Output<WindowsWebAppSiteConfigAutoHealSettingActionArgs> action() {
        return this.action;
    }

    /**
     * A `trigger` block as defined below.
     * 
     */
    @Import(name="trigger", required=true)
    private Output<WindowsWebAppSiteConfigAutoHealSettingTriggerArgs> trigger;

    /**
     * @return A `trigger` block as defined below.
     * 
     */
    public Output<WindowsWebAppSiteConfigAutoHealSettingTriggerArgs> trigger() {
        return this.trigger;
    }

    private WindowsWebAppSiteConfigAutoHealSettingArgs() {}

    private WindowsWebAppSiteConfigAutoHealSettingArgs(WindowsWebAppSiteConfigAutoHealSettingArgs $) {
        this.action = $.action;
        this.trigger = $.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsWebAppSiteConfigAutoHealSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsWebAppSiteConfigAutoHealSettingArgs $;

        public Builder() {
            $ = new WindowsWebAppSiteConfigAutoHealSettingArgs();
        }

        public Builder(WindowsWebAppSiteConfigAutoHealSettingArgs defaults) {
            $ = new WindowsWebAppSiteConfigAutoHealSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action An `action` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<WindowsWebAppSiteConfigAutoHealSettingActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action An `action` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder action(WindowsWebAppSiteConfigAutoHealSettingActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param trigger A `trigger` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder trigger(Output<WindowsWebAppSiteConfigAutoHealSettingTriggerArgs> trigger) {
            $.trigger = trigger;
            return this;
        }

        /**
         * @param trigger A `trigger` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder trigger(WindowsWebAppSiteConfigAutoHealSettingTriggerArgs trigger) {
            return trigger(Output.of(trigger));
        }

        public WindowsWebAppSiteConfigAutoHealSettingArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.trigger = Objects.requireNonNull($.trigger, "expected parameter 'trigger' to be non-null");
            return $;
        }
    }

}