// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sentinel.DataConnectorIotArgs;
import com.pulumi.azure.sentinel.inputs.DataConnectorIotState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an Iot Data Connector.
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
 * import com.pulumi.azure.operationalinsights.AnalyticsWorkspace;
 * import com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs;
 * import com.pulumi.azure.operationalinsights.AnalyticsSolution;
 * import com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs;
 * import com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs;
 * import com.pulumi.azure.sentinel.DataConnectorIot;
 * import com.pulumi.azure.sentinel.DataConnectorIotArgs;
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
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleAnalyticsWorkspace = new AnalyticsWorkspace(&#34;exampleAnalyticsWorkspace&#34;, AnalyticsWorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(&#34;PerGB2018&#34;)
 *             .build());
 * 
 *         var exampleAnalyticsSolution = new AnalyticsSolution(&#34;exampleAnalyticsSolution&#34;, AnalyticsSolutionArgs.builder()        
 *             .solutionName(&#34;SecurityInsights&#34;)
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .workspaceResourceId(exampleAnalyticsWorkspace.id())
 *             .workspaceName(exampleAnalyticsWorkspace.name())
 *             .plan(AnalyticsSolutionPlanArgs.builder()
 *                 .publisher(&#34;Microsoft&#34;)
 *                 .product(&#34;OMSGallery/SecurityInsights&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleDataConnectorIot = new DataConnectorIot(&#34;exampleDataConnectorIot&#34;, DataConnectorIotArgs.builder()        
 *             .logAnalyticsWorkspaceId(exampleAnalyticsSolution.workspaceResourceId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Iot Data Connectors can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:sentinel/dataConnectorIot:DataConnectorIot example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.OperationalInsights/workspaces/workspace1/providers/Microsoft.SecurityInsights/dataConnectors/dc1
 * ```
 * 
 */
@ResourceType(type="azure:sentinel/dataConnectorIot:DataConnectorIot")
public class DataConnectorIot extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Log Analytics Workspace that this Iot Data Connector resides in. Changing this forces a new Iot Data Connector to be created.
     * 
     */
    @Export(name="logAnalyticsWorkspaceId", type=String.class, parameters={})
    private Output<String> logAnalyticsWorkspaceId;

    /**
     * @return The ID of the Log Analytics Workspace that this Iot Data Connector resides in. Changing this forces a new Iot Data Connector to be created.
     * 
     */
    public Output<String> logAnalyticsWorkspaceId() {
        return this.logAnalyticsWorkspaceId;
    }
    /**
     * The name which should be used for this Iot Data Connector. Changing this forces a new Iot Data Connector to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Iot Data Connector. Changing this forces a new Iot Data Connector to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the subscription that this Iot Data Connector connects to. Changing this forces a new Iot Data Connector to be created.
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return The ID of the subscription that this Iot Data Connector connects to. Changing this forces a new Iot Data Connector to be created.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataConnectorIot(String name) {
        this(name, DataConnectorIotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataConnectorIot(String name, DataConnectorIotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataConnectorIot(String name, DataConnectorIotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorIot:DataConnectorIot", name, args == null ? DataConnectorIotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataConnectorIot(String name, Output<String> id, @Nullable DataConnectorIotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:sentinel/dataConnectorIot:DataConnectorIot", name, state, makeResourceOptions(options, id));
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
    public static DataConnectorIot get(String name, Output<String> id, @Nullable DataConnectorIotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataConnectorIot(name, id, state, options);
    }
}