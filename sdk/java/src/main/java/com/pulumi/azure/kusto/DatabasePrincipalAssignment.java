// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.kusto;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.kusto.DatabasePrincipalAssignmentArgs;
import com.pulumi.azure.kusto.inputs.DatabasePrincipalAssignmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Kusto (also known as Azure Data Explorer) Database Principal Assignment.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azure.core.CoreFunctions;
 * import com.pulumi.azure.core.ResourceGroup;
 * import com.pulumi.azure.core.ResourceGroupArgs;
 * import com.pulumi.azure.kusto.Cluster;
 * import com.pulumi.azure.kusto.ClusterArgs;
 * import com.pulumi.azure.kusto.inputs.ClusterSkuArgs;
 * import com.pulumi.azure.kusto.Database;
 * import com.pulumi.azure.kusto.DatabaseArgs;
 * import com.pulumi.azure.kusto.DatabasePrincipalAssignment;
 * import com.pulumi.azure.kusto.DatabasePrincipalAssignmentArgs;
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
 *         final var current = CoreFunctions.getClientConfig();
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleCluster = new Cluster(&#34;exampleCluster&#34;, ClusterArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .sku(ClusterSkuArgs.builder()
 *                 .name(&#34;Standard_D13_v2&#34;)
 *                 .capacity(2)
 *                 .build())
 *             .build());
 * 
 *         var exampleDatabase = new Database(&#34;exampleDatabase&#34;, DatabaseArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .clusterName(exampleCluster.name())
 *             .hotCachePeriod(&#34;P7D&#34;)
 *             .softDeletePeriod(&#34;P31D&#34;)
 *             .build());
 * 
 *         var exampleDatabasePrincipalAssignment = new DatabasePrincipalAssignment(&#34;exampleDatabasePrincipalAssignment&#34;, DatabasePrincipalAssignmentArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .clusterName(exampleCluster.name())
 *             .databaseName(exampleDatabase.name())
 *             .tenantId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.tenantId()))
 *             .principalId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.clientId()))
 *             .principalType(&#34;App&#34;)
 *             .role(&#34;Viewer&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Kusto Database Principal Assignment can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:kusto/databasePrincipalAssignment:DatabasePrincipalAssignment example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Kusto/Clusters/cluster1/Databases/database1/PrincipalAssignments/assignment1
 * ```
 * 
 */
@ResourceType(type="azure:kusto/databasePrincipalAssignment:DatabasePrincipalAssignment")
public class DatabasePrincipalAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return The name of the cluster in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * The name of the database in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the database in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * The object id of the principal. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="principalId", type=String.class, parameters={})
    private Output<String> principalId;

    /**
     * @return The object id of the principal. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }
    /**
     * The name of the principal.
     * 
     */
    @Export(name="principalName", type=String.class, parameters={})
    private Output<String> principalName;

    /**
     * @return The name of the principal.
     * 
     */
    public Output<String> principalName() {
        return this.principalName;
    }
    /**
     * The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="principalType", type=String.class, parameters={})
    private Output<String> principalType;

    /**
     * @return The type of the principal. Valid values include `App`, `Group`, `User`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> principalType() {
        return this.principalType;
    }
    /**
     * The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The database role assigned to the principal. Valid values include `Admin`, `Ingestor`, `Monitor`, `UnrestrictedViewer`, `User` and `Viewer`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The database role assigned to the principal. Valid values include `Admin`, `Ingestor`, `Monitor`, `UnrestrictedViewer`, `User` and `Viewer`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The tenant id in which the principal resides. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The tenant id in which the principal resides. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }
    /**
     * The name of the tenant.
     * 
     */
    @Export(name="tenantName", type=String.class, parameters={})
    private Output<String> tenantName;

    /**
     * @return The name of the tenant.
     * 
     */
    public Output<String> tenantName() {
        return this.tenantName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabasePrincipalAssignment(String name) {
        this(name, DatabasePrincipalAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabasePrincipalAssignment(String name, DatabasePrincipalAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabasePrincipalAssignment(String name, DatabasePrincipalAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:kusto/databasePrincipalAssignment:DatabasePrincipalAssignment", name, args == null ? DatabasePrincipalAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabasePrincipalAssignment(String name, Output<String> id, @Nullable DatabasePrincipalAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:kusto/databasePrincipalAssignment:DatabasePrincipalAssignment", name, state, makeResourceOptions(options, id));
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
    public static DatabasePrincipalAssignment get(String name, Output<String> id, @Nullable DatabasePrincipalAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabasePrincipalAssignment(name, id, state, options);
    }
}