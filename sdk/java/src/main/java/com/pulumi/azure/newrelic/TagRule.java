// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.newrelic;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.newrelic.TagRuleArgs;
import com.pulumi.azure.newrelic.inputs.TagRuleState;
import com.pulumi.azure.newrelic.outputs.TagRuleLogTagFilter;
import com.pulumi.azure.newrelic.outputs.TagRuleMetricTagFilter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Native New Relic Tag Rule.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.newrelic.Monitor;
 * import com.pulumi.azure.newrelic.MonitorArgs;
 * import com.pulumi.azure.newrelic.inputs.MonitorPlanArgs;
 * import com.pulumi.azure.newrelic.inputs.MonitorUserArgs;
 * import com.pulumi.azure.newrelic.TagRule;
 * import com.pulumi.azure.newrelic.TagRuleArgs;
 * import com.pulumi.azure.newrelic.inputs.TagRuleLogTagFilterArgs;
 * import com.pulumi.azure.newrelic.inputs.TagRuleMetricTagFilterArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;East US&#34;)
 *             .build());
 * 
 *         var exampleMonitor = new Monitor(&#34;exampleMonitor&#34;, MonitorArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .plan(MonitorPlanArgs.builder()
 *                 .effectiveDate(&#34;2023-06-06T00:00:00Z&#34;)
 *                 .build())
 *             .user(MonitorUserArgs.builder()
 *                 .email(&#34;user@example.com&#34;)
 *                 .firstName(&#34;Example&#34;)
 *                 .lastName(&#34;User&#34;)
 *                 .phoneNumber(&#34;+12313803556&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleTagRule = new TagRule(&#34;exampleTagRule&#34;, TagRuleArgs.builder()        
 *             .monitorId(exampleMonitor.id())
 *             .azureActiveDirectoryLogEnabled(true)
 *             .activityLogEnabled(true)
 *             .metricEnabled(true)
 *             .subscriptionLogEnabled(true)
 *             .logTagFilters(TagRuleLogTagFilterArgs.builder()
 *                 .name(&#34;key&#34;)
 *                 .action(&#34;Include&#34;)
 *                 .value(&#34;value&#34;)
 *                 .build())
 *             .metricTagFilters(TagRuleMetricTagFilterArgs.builder()
 *                 .name(&#34;key&#34;)
 *                 .action(&#34;Exclude&#34;)
 *                 .value(&#34;value&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Azure Native New Relic Tag Rule can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:newrelic/tagRule:TagRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/NewRelic.Observability/monitors/monitor1/tagRules/ruleSet1
 * ```
 * 
 */
@ResourceType(type="azure:newrelic/tagRule:TagRule")
public class TagRule extends com.pulumi.resources.CustomResource {
    /**
     * Whether activity logs from Azure resources should be sent for the Monitor resource. Defaults to `false`.
     * 
     */
    @Export(name="activityLogEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> activityLogEnabled;

    /**
     * @return Whether activity logs from Azure resources should be sent for the Monitor resource. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> activityLogEnabled() {
        return Codegen.optional(this.activityLogEnabled);
    }
    /**
     * Whether Azure Active Directory logs should be sent for the Monitor resource. Defaults to `false`.
     * 
     */
    @Export(name="azureActiveDirectoryLogEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> azureActiveDirectoryLogEnabled;

    /**
     * @return Whether Azure Active Directory logs should be sent for the Monitor resource. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> azureActiveDirectoryLogEnabled() {
        return Codegen.optional(this.azureActiveDirectoryLogEnabled);
    }
    /**
     * A `log_tag_filter` block as defined below.
     * 
     */
    @Export(name="logTagFilters", refs={List.class,TagRuleLogTagFilter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TagRuleLogTagFilter>> logTagFilters;

    /**
     * @return A `log_tag_filter` block as defined below.
     * 
     */
    public Output<Optional<List<TagRuleLogTagFilter>>> logTagFilters() {
        return Codegen.optional(this.logTagFilters);
    }
    /**
     * Whether metrics should be sent for the Monitor resource. Defaults to `false`.
     * 
     */
    @Export(name="metricEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> metricEnabled;

    /**
     * @return Whether metrics should be sent for the Monitor resource. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> metricEnabled() {
        return Codegen.optional(this.metricEnabled);
    }
    /**
     * A `metric_tag_filter` block as defined below.
     * 
     */
    @Export(name="metricTagFilters", refs={List.class,TagRuleMetricTagFilter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TagRuleMetricTagFilter>> metricTagFilters;

    /**
     * @return A `metric_tag_filter` block as defined below.
     * 
     */
    public Output<Optional<List<TagRuleMetricTagFilter>>> metricTagFilters() {
        return Codegen.optional(this.metricTagFilters);
    }
    /**
     * Specifies the ID of the New Relic Monitor this Tag Rule should be created within. Changing this forces a new Azure Native New Relic Tag Rule to be created.
     * 
     */
    @Export(name="monitorId", refs={String.class}, tree="[0]")
    private Output<String> monitorId;

    /**
     * @return Specifies the ID of the New Relic Monitor this Tag Rule should be created within. Changing this forces a new Azure Native New Relic Tag Rule to be created.
     * 
     */
    public Output<String> monitorId() {
        return this.monitorId;
    }
    /**
     * Whether subscription logs should be sent for the Monitor resource. Defaults to `false`.
     * 
     */
    @Export(name="subscriptionLogEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> subscriptionLogEnabled;

    /**
     * @return Whether subscription logs should be sent for the Monitor resource. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> subscriptionLogEnabled() {
        return Codegen.optional(this.subscriptionLogEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagRule(String name) {
        this(name, TagRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagRule(String name, TagRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagRule(String name, TagRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:newrelic/tagRule:TagRule", name, args == null ? TagRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagRule(String name, Output<String> id, @Nullable TagRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:newrelic/tagRule:TagRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TagRule get(String name, Output<String> id, @Nullable TagRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TagRule(name, id, state, options);
    }
}