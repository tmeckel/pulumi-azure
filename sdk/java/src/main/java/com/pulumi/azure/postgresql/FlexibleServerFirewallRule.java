// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.postgresql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.postgresql.FlexibleServerFirewallRuleArgs;
import com.pulumi.azure.postgresql.inputs.FlexibleServerFirewallRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a PostgreSQL Flexible Server Firewall Rule.
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
 * import com.pulumi.azure.postgresql.FlexibleServer;
 * import com.pulumi.azure.postgresql.FlexibleServerArgs;
 * import com.pulumi.azure.postgresql.FlexibleServerFirewallRule;
 * import com.pulumi.azure.postgresql.FlexibleServerFirewallRuleArgs;
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
 *         var exampleFlexibleServer = new FlexibleServer(&#34;exampleFlexibleServer&#34;, FlexibleServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .version(&#34;12&#34;)
 *             .administratorLogin(&#34;psqladmin&#34;)
 *             .administratorPassword(&#34;H@Sh1CoR3!&#34;)
 *             .storageMb(32768)
 *             .skuName(&#34;GP_Standard_D4s_v3&#34;)
 *             .build());
 * 
 *         var exampleFlexibleServerFirewallRule = new FlexibleServerFirewallRule(&#34;exampleFlexibleServerFirewallRule&#34;, FlexibleServerFirewallRuleArgs.builder()        
 *             .serverId(exampleFlexibleServer.id())
 *             .startIpAddress(&#34;122.122.0.0&#34;)
 *             .endIpAddress(&#34;122.122.0.0&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * PostgreSQL Flexible Server Firewall Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:postgresql/flexibleServerFirewallRule:FlexibleServerFirewallRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DBforPostgreSQL/flexibleServers/flexibleServer1/firewallRules/firewallRule1
 * ```
 * 
 */
@ResourceType(type="azure:postgresql/flexibleServerFirewallRule:FlexibleServerFirewallRule")
public class FlexibleServerFirewallRule extends com.pulumi.resources.CustomResource {
    /**
     * The End IP Address associated with this PostgreSQL Flexible Server Firewall Rule.
     * 
     */
    @Export(name="endIpAddress", type=String.class, parameters={})
    private Output<String> endIpAddress;

    /**
     * @return The End IP Address associated with this PostgreSQL Flexible Server Firewall Rule.
     * 
     */
    public Output<String> endIpAddress() {
        return this.endIpAddress;
    }
    /**
     * The name which should be used for this PostgreSQL Flexible Server Firewall Rule. Changing this forces a new PostgreSQL Flexible Server Firewall Rule to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this PostgreSQL Flexible Server Firewall Rule. Changing this forces a new PostgreSQL Flexible Server Firewall Rule to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the PostgreSQL Flexible Server from which to create this PostgreSQL Flexible Server Firewall Rule. Changing this forces a new PostgreSQL Flexible Server Firewall Rule to be created.
     * 
     */
    @Export(name="serverId", type=String.class, parameters={})
    private Output<String> serverId;

    /**
     * @return The ID of the PostgreSQL Flexible Server from which to create this PostgreSQL Flexible Server Firewall Rule. Changing this forces a new PostgreSQL Flexible Server Firewall Rule to be created.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }
    /**
     * The Start IP Address associated with this PostgreSQL Flexible Server Firewall Rule.
     * 
     */
    @Export(name="startIpAddress", type=String.class, parameters={})
    private Output<String> startIpAddress;

    /**
     * @return The Start IP Address associated with this PostgreSQL Flexible Server Firewall Rule.
     * 
     */
    public Output<String> startIpAddress() {
        return this.startIpAddress;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlexibleServerFirewallRule(String name) {
        this(name, FlexibleServerFirewallRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlexibleServerFirewallRule(String name, FlexibleServerFirewallRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlexibleServerFirewallRule(String name, FlexibleServerFirewallRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:postgresql/flexibleServerFirewallRule:FlexibleServerFirewallRule", name, args == null ? FlexibleServerFirewallRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlexibleServerFirewallRule(String name, Output<String> id, @Nullable FlexibleServerFirewallRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:postgresql/flexibleServerFirewallRule:FlexibleServerFirewallRule", name, state, makeResourceOptions(options, id));
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
    public static FlexibleServerFirewallRule get(String name, Output<String> id, @Nullable FlexibleServerFirewallRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FlexibleServerFirewallRule(name, id, state, options);
    }
}