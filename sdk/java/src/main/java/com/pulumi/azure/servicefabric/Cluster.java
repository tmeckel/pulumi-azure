// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.servicefabric.ClusterArgs;
import com.pulumi.azure.servicefabric.inputs.ClusterState;
import com.pulumi.azure.servicefabric.outputs.ClusterAzureActiveDirectory;
import com.pulumi.azure.servicefabric.outputs.ClusterCertificate;
import com.pulumi.azure.servicefabric.outputs.ClusterCertificateCommonNames;
import com.pulumi.azure.servicefabric.outputs.ClusterClientCertificateCommonName;
import com.pulumi.azure.servicefabric.outputs.ClusterClientCertificateThumbprint;
import com.pulumi.azure.servicefabric.outputs.ClusterDiagnosticsConfig;
import com.pulumi.azure.servicefabric.outputs.ClusterFabricSetting;
import com.pulumi.azure.servicefabric.outputs.ClusterNodeType;
import com.pulumi.azure.servicefabric.outputs.ClusterReverseProxyCertificate;
import com.pulumi.azure.servicefabric.outputs.ClusterReverseProxyCertificateCommonNames;
import com.pulumi.azure.servicefabric.outputs.ClusterUpgradePolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Service Fabric Cluster.
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
 * import com.pulumi.azure.servicefabric.Cluster;
 * import com.pulumi.azure.servicefabric.ClusterArgs;
 * import com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeArgs;
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
 *         var exampleCluster = new Cluster(&#34;exampleCluster&#34;, ClusterArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .reliabilityLevel(&#34;Bronze&#34;)
 *             .upgradeMode(&#34;Manual&#34;)
 *             .clusterCodeVersion(&#34;7.1.456.959&#34;)
 *             .vmImage(&#34;Windows&#34;)
 *             .managementEndpoint(&#34;https://example:80&#34;)
 *             .nodeTypes(ClusterNodeTypeArgs.builder()
 *                 .name(&#34;first&#34;)
 *                 .instanceCount(3)
 *                 .isPrimary(true)
 *                 .clientEndpointPort(2020)
 *                 .httpEndpointPort(80)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service Fabric Clusters can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:servicefabric/cluster:Cluster cluster1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.ServiceFabric/clusters/cluster1
 * ```
 * 
 */
@ResourceType(type="azure:servicefabric/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * A List of one or more features which should be enabled, such as `DnsService`.
     * 
     */
    @Export(name="addOnFeatures", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> addOnFeatures;

    /**
     * @return A List of one or more features which should be enabled, such as `DnsService`.
     * 
     */
    public Output<Optional<List<String>>> addOnFeatures() {
        return Codegen.optional(this.addOnFeatures);
    }
    /**
     * An `azure_active_directory` block as defined below.
     * 
     */
    @Export(name="azureActiveDirectory", type=ClusterAzureActiveDirectory.class, parameters={})
    private Output</* @Nullable */ ClusterAzureActiveDirectory> azureActiveDirectory;

    /**
     * @return An `azure_active_directory` block as defined below.
     * 
     */
    public Output<Optional<ClusterAzureActiveDirectory>> azureActiveDirectory() {
        return Codegen.optional(this.azureActiveDirectory);
    }
    /**
     * A `certificate` block as defined below. Conflicts with `certificate_common_names`.
     * 
     */
    @Export(name="certificate", type=ClusterCertificate.class, parameters={})
    private Output</* @Nullable */ ClusterCertificate> certificate;

    /**
     * @return A `certificate` block as defined below. Conflicts with `certificate_common_names`.
     * 
     */
    public Output<Optional<ClusterCertificate>> certificate() {
        return Codegen.optional(this.certificate);
    }
    /**
     * A `certificate_common_names` block as defined below. Conflicts with `certificate`.
     * 
     */
    @Export(name="certificateCommonNames", type=ClusterCertificateCommonNames.class, parameters={})
    private Output</* @Nullable */ ClusterCertificateCommonNames> certificateCommonNames;

    /**
     * @return A `certificate_common_names` block as defined below. Conflicts with `certificate`.
     * 
     */
    public Output<Optional<ClusterCertificateCommonNames>> certificateCommonNames() {
        return Codegen.optional(this.certificateCommonNames);
    }
    /**
     * A `client_certificate_common_name` block as defined below.
     * 
     */
    @Export(name="clientCertificateCommonNames", type=List.class, parameters={ClusterClientCertificateCommonName.class})
    private Output</* @Nullable */ List<ClusterClientCertificateCommonName>> clientCertificateCommonNames;

    /**
     * @return A `client_certificate_common_name` block as defined below.
     * 
     */
    public Output<Optional<List<ClusterClientCertificateCommonName>>> clientCertificateCommonNames() {
        return Codegen.optional(this.clientCertificateCommonNames);
    }
    /**
     * One or more `client_certificate_thumbprint` blocks as defined below.
     * 
     */
    @Export(name="clientCertificateThumbprints", type=List.class, parameters={ClusterClientCertificateThumbprint.class})
    private Output</* @Nullable */ List<ClusterClientCertificateThumbprint>> clientCertificateThumbprints;

    /**
     * @return One or more `client_certificate_thumbprint` blocks as defined below.
     * 
     */
    public Output<Optional<List<ClusterClientCertificateThumbprint>>> clientCertificateThumbprints() {
        return Codegen.optional(this.clientCertificateThumbprints);
    }
    /**
     * Required if Upgrade Mode set to `Manual`, Specifies the Version of the Cluster Code of the cluster.
     * 
     */
    @Export(name="clusterCodeVersion", type=String.class, parameters={})
    private Output<String> clusterCodeVersion;

    /**
     * @return Required if Upgrade Mode set to `Manual`, Specifies the Version of the Cluster Code of the cluster.
     * 
     */
    public Output<String> clusterCodeVersion() {
        return this.clusterCodeVersion;
    }
    /**
     * The Cluster Endpoint for this Service Fabric Cluster.
     * 
     */
    @Export(name="clusterEndpoint", type=String.class, parameters={})
    private Output<String> clusterEndpoint;

    /**
     * @return The Cluster Endpoint for this Service Fabric Cluster.
     * 
     */
    public Output<String> clusterEndpoint() {
        return this.clusterEndpoint;
    }
    /**
     * A `diagnostics_config` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="diagnosticsConfig", type=ClusterDiagnosticsConfig.class, parameters={})
    private Output</* @Nullable */ ClusterDiagnosticsConfig> diagnosticsConfig;

    /**
     * @return A `diagnostics_config` block as defined below. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<ClusterDiagnosticsConfig>> diagnosticsConfig() {
        return Codegen.optional(this.diagnosticsConfig);
    }
    /**
     * One or more `fabric_settings` blocks as defined below.
     * 
     */
    @Export(name="fabricSettings", type=List.class, parameters={ClusterFabricSetting.class})
    private Output</* @Nullable */ List<ClusterFabricSetting>> fabricSettings;

    /**
     * @return One or more `fabric_settings` blocks as defined below.
     * 
     */
    public Output<Optional<List<ClusterFabricSetting>>> fabricSettings() {
        return Codegen.optional(this.fabricSettings);
    }
    /**
     * Specifies the Azure Region where the Service Fabric Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Service Fabric Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the Management Endpoint of the cluster such as `http://example.com`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="managementEndpoint", type=String.class, parameters={})
    private Output<String> managementEndpoint;

    /**
     * @return Specifies the Management Endpoint of the cluster such as `http://example.com`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> managementEndpoint() {
        return this.managementEndpoint;
    }
    /**
     * The name of the Service Fabric Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Service Fabric Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `node_type` blocks as defined below.
     * 
     */
    @Export(name="nodeTypes", type=List.class, parameters={ClusterNodeType.class})
    private Output<List<ClusterNodeType>> nodeTypes;

    /**
     * @return One or more `node_type` blocks as defined below.
     * 
     */
    public Output<List<ClusterNodeType>> nodeTypes() {
        return this.nodeTypes;
    }
    /**
     * Specifies the Reliability Level of the Cluster. Possible values include `None`, `Bronze`, `Silver`, `Gold` and `Platinum`.
     * 
     */
    @Export(name="reliabilityLevel", type=String.class, parameters={})
    private Output<String> reliabilityLevel;

    /**
     * @return Specifies the Reliability Level of the Cluster. Possible values include `None`, `Bronze`, `Silver`, `Gold` and `Platinum`.
     * 
     */
    public Output<String> reliabilityLevel() {
        return this.reliabilityLevel;
    }
    /**
     * The name of the Resource Group in which the Service Fabric Cluster exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Service Fabric Cluster exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `reverse_proxy_certificate` block as defined below. Conflicts with `reverse_proxy_certificate_common_names`.
     * 
     */
    @Export(name="reverseProxyCertificate", type=ClusterReverseProxyCertificate.class, parameters={})
    private Output</* @Nullable */ ClusterReverseProxyCertificate> reverseProxyCertificate;

    /**
     * @return A `reverse_proxy_certificate` block as defined below. Conflicts with `reverse_proxy_certificate_common_names`.
     * 
     */
    public Output<Optional<ClusterReverseProxyCertificate>> reverseProxyCertificate() {
        return Codegen.optional(this.reverseProxyCertificate);
    }
    /**
     * A `reverse_proxy_certificate_common_names` block as defined below. Conflicts with `reverse_proxy_certificate`.
     * 
     */
    @Export(name="reverseProxyCertificateCommonNames", type=ClusterReverseProxyCertificateCommonNames.class, parameters={})
    private Output</* @Nullable */ ClusterReverseProxyCertificateCommonNames> reverseProxyCertificateCommonNames;

    /**
     * @return A `reverse_proxy_certificate_common_names` block as defined below. Conflicts with `reverse_proxy_certificate`.
     * 
     */
    public Output<Optional<ClusterReverseProxyCertificateCommonNames>> reverseProxyCertificateCommonNames() {
        return Codegen.optional(this.reverseProxyCertificateCommonNames);
    }
    /**
     * Specifies the logical grouping of VMs in upgrade domains. Possible values are `Hierarchical` or `Parallel`.
     * 
     */
    @Export(name="serviceFabricZonalUpgradeMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceFabricZonalUpgradeMode;

    /**
     * @return Specifies the logical grouping of VMs in upgrade domains. Possible values are `Hierarchical` or `Parallel`.
     * 
     */
    public Output<Optional<String>> serviceFabricZonalUpgradeMode() {
        return Codegen.optional(this.serviceFabricZonalUpgradeMode);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the Upgrade Mode of the cluster. Possible values are `Automatic` or `Manual`.
     * 
     */
    @Export(name="upgradeMode", type=String.class, parameters={})
    private Output<String> upgradeMode;

    /**
     * @return Specifies the Upgrade Mode of the cluster. Possible values are `Automatic` or `Manual`.
     * 
     */
    public Output<String> upgradeMode() {
        return this.upgradeMode;
    }
    /**
     * A `upgrade_policy` block as defined below.
     * 
     */
    @Export(name="upgradePolicy", type=ClusterUpgradePolicy.class, parameters={})
    private Output</* @Nullable */ ClusterUpgradePolicy> upgradePolicy;

    /**
     * @return A `upgrade_policy` block as defined below.
     * 
     */
    public Output<Optional<ClusterUpgradePolicy>> upgradePolicy() {
        return Codegen.optional(this.upgradePolicy);
    }
    /**
     * Specifies the Image expected for the Service Fabric Cluster, such as `Windows`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="vmImage", type=String.class, parameters={})
    private Output<String> vmImage;

    /**
     * @return Specifies the Image expected for the Service Fabric Cluster, such as `Windows`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> vmImage() {
        return this.vmImage;
    }
    /**
     * Specifies the upgrade mode for the virtual machine scale set updates that happen in all availability zones at once. Possible values are `Hierarchical` or `Parallel`.
     * 
     */
    @Export(name="vmssZonalUpgradeMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> vmssZonalUpgradeMode;

    /**
     * @return Specifies the upgrade mode for the virtual machine scale set updates that happen in all availability zones at once. Possible values are `Hierarchical` or `Parallel`.
     * 
     */
    public Output<Optional<String>> vmssZonalUpgradeMode() {
        return Codegen.optional(this.vmssZonalUpgradeMode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:servicefabric/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:servicefabric/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}