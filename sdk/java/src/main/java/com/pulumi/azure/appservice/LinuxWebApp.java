// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.LinuxWebAppArgs;
import com.pulumi.azure.appservice.inputs.LinuxWebAppState;
import com.pulumi.azure.appservice.outputs.LinuxWebAppAuthSettings;
import com.pulumi.azure.appservice.outputs.LinuxWebAppBackup;
import com.pulumi.azure.appservice.outputs.LinuxWebAppConnectionString;
import com.pulumi.azure.appservice.outputs.LinuxWebAppIdentity;
import com.pulumi.azure.appservice.outputs.LinuxWebAppLogs;
import com.pulumi.azure.appservice.outputs.LinuxWebAppSiteConfig;
import com.pulumi.azure.appservice.outputs.LinuxWebAppSiteCredential;
import com.pulumi.azure.appservice.outputs.LinuxWebAppStickySettings;
import com.pulumi.azure.appservice.outputs.LinuxWebAppStorageAccount;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linux Web App.
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
 * import com.pulumi.azure.appservice.ServicePlan;
 * import com.pulumi.azure.appservice.ServicePlanArgs;
 * import com.pulumi.azure.appservice.LinuxWebApp;
 * import com.pulumi.azure.appservice.LinuxWebAppArgs;
 * import com.pulumi.azure.appservice.inputs.LinuxWebAppSiteConfigArgs;
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
 *         var exampleServicePlan = new ServicePlan(&#34;exampleServicePlan&#34;, ServicePlanArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .osType(&#34;Linux&#34;)
 *             .skuName(&#34;P1v2&#34;)
 *             .build());
 * 
 *         var exampleLinuxWebApp = new LinuxWebApp(&#34;exampleLinuxWebApp&#34;, LinuxWebAppArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleServicePlan.location())
 *             .servicePlanId(exampleServicePlan.id())
 *             .siteConfig()
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Linux Web Apps can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/linuxWebApp:LinuxWebApp example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1
 * ```
 * 
 */
@ResourceType(type="azure:appservice/linuxWebApp:LinuxWebApp")
public class LinuxWebApp extends com.pulumi.resources.CustomResource {
    /**
     * A map of key-value pairs of App Settings.
     * 
     */
    @Export(name="appSettings", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> appSettings;

    /**
     * @return A map of key-value pairs of App Settings.
     * 
     */
    public Output<Optional<Map<String,String>>> appSettings() {
        return Codegen.optional(this.appSettings);
    }
    /**
     * A `auth_settings` block as defined below.
     * 
     */
    @Export(name="authSettings", type=LinuxWebAppAuthSettings.class, parameters={})
    private Output<LinuxWebAppAuthSettings> authSettings;

    /**
     * @return A `auth_settings` block as defined below.
     * 
     */
    public Output<LinuxWebAppAuthSettings> authSettings() {
        return this.authSettings;
    }
    /**
     * A `backup` block as defined below.
     * 
     */
    @Export(name="backup", type=LinuxWebAppBackup.class, parameters={})
    private Output</* @Nullable */ LinuxWebAppBackup> backup;

    /**
     * @return A `backup` block as defined below.
     * 
     */
    public Output<Optional<LinuxWebAppBackup>> backup() {
        return Codegen.optional(this.backup);
    }
    /**
     * Should Client Affinity be enabled?
     * 
     */
    @Export(name="clientAffinityEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> clientAffinityEnabled;

    /**
     * @return Should Client Affinity be enabled?
     * 
     */
    public Output<Optional<Boolean>> clientAffinityEnabled() {
        return Codegen.optional(this.clientAffinityEnabled);
    }
    /**
     * Should Client Certificates be enabled?
     * 
     */
    @Export(name="clientCertificateEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> clientCertificateEnabled;

    /**
     * @return Should Client Certificates be enabled?
     * 
     */
    public Output<Optional<Boolean>> clientCertificateEnabled() {
        return Codegen.optional(this.clientCertificateEnabled);
    }
    /**
     * The Client Certificate mode. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`. This property has no effect when `client_certificate_enabled` is `false`
     * 
     */
    @Export(name="clientCertificateMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCertificateMode;

    /**
     * @return The Client Certificate mode. Possible values are `Required`, `Optional`, and `OptionalInteractiveUser`. This property has no effect when `client_certificate_enabled` is `false`
     * 
     */
    public Output<Optional<String>> clientCertificateMode() {
        return Codegen.optional(this.clientCertificateMode);
    }
    /**
     * One or more `connection_string` blocks as defined below.
     * 
     */
    @Export(name="connectionStrings", type=List.class, parameters={LinuxWebAppConnectionString.class})
    private Output</* @Nullable */ List<LinuxWebAppConnectionString>> connectionStrings;

    /**
     * @return One or more `connection_string` blocks as defined below.
     * 
     */
    public Output<Optional<List<LinuxWebAppConnectionString>>> connectionStrings() {
        return Codegen.optional(this.connectionStrings);
    }
    /**
     * The identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    @Export(name="customDomainVerificationId", type=String.class, parameters={})
    private Output<String> customDomainVerificationId;

    /**
     * @return The identifier used by App Service to perform domain ownership verification via DNS TXT record.
     * 
     */
    public Output<String> customDomainVerificationId() {
        return this.customDomainVerificationId;
    }
    /**
     * The default hostname of the Linux Web App.
     * 
     */
    @Export(name="defaultHostname", type=String.class, parameters={})
    private Output<String> defaultHostname;

    /**
     * @return The default hostname of the Linux Web App.
     * 
     */
    public Output<String> defaultHostname() {
        return this.defaultHostname;
    }
    /**
     * Should the Linux Web App be enabled? Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Should the Linux Web App be enabled? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Should the Linux Web App require HTTPS connections.
     * 
     */
    @Export(name="httpsOnly", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> httpsOnly;

    /**
     * @return Should the Linux Web App require HTTPS connections.
     * 
     */
    public Output<Optional<Boolean>> httpsOnly() {
        return Codegen.optional(this.httpsOnly);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=LinuxWebAppIdentity.class, parameters={})
    private Output</* @Nullable */ LinuxWebAppIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<LinuxWebAppIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity).
     * 
     */
    @Export(name="keyVaultReferenceIdentityId", type=String.class, parameters={})
    private Output<String> keyVaultReferenceIdentityId;

    /**
     * @return The User Assigned Identity ID used for accessing KeyVault secrets. The identity must be assigned to the application in the `identity` block. [For more information see - Access vaults with a user-assigned identity](https://docs.microsoft.com/azure/app-service/app-service-key-vault-references#access-vaults-with-a-user-assigned-identity).
     * 
     */
    public Output<String> keyVaultReferenceIdentityId() {
        return this.keyVaultReferenceIdentityId;
    }
    /**
     * The Kind value for this Linux Web App.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The Kind value for this Linux Web App.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The Azure Region where the Linux Web App should exist. Changing this forces a new Linux Web App to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Linux Web App should exist. Changing this forces a new Linux Web App to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A `logs` block as defined below.
     * 
     */
    @Export(name="logs", type=LinuxWebAppLogs.class, parameters={})
    private Output</* @Nullable */ LinuxWebAppLogs> logs;

    /**
     * @return A `logs` block as defined below.
     * 
     */
    public Output<Optional<LinuxWebAppLogs>> logs() {
        return Codegen.optional(this.logs);
    }
    /**
     * The name which should be used for this Linux Web App. Changing this forces a new Linux Web App to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Linux Web App. Changing this forces a new Linux Web App to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
     * 
     */
    @Export(name="outboundIpAddressLists", type=List.class, parameters={String.class})
    private Output<List<String>> outboundIpAddressLists;

    /**
     * @return A list of outbound IP addresses - such as `[&#34;52.23.25.3&#34;, &#34;52.143.43.12&#34;]`
     * 
     */
    public Output<List<String>> outboundIpAddressLists() {
        return this.outboundIpAddressLists;
    }
    /**
     * A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
     * 
     */
    @Export(name="outboundIpAddresses", type=String.class, parameters={})
    private Output<String> outboundIpAddresses;

    /**
     * @return A comma separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12`.
     * 
     */
    public Output<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }
    /**
     * A `possible_outbound_ip_address_list` block as defined below.
     * 
     */
    @Export(name="possibleOutboundIpAddressLists", type=List.class, parameters={String.class})
    private Output<List<String>> possibleOutboundIpAddressLists;

    /**
     * @return A `possible_outbound_ip_address_list` block as defined below.
     * 
     */
    public Output<List<String>> possibleOutboundIpAddressLists() {
        return this.possibleOutboundIpAddressLists;
    }
    /**
     * A comma-separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
     * 
     */
    @Export(name="possibleOutboundIpAddresses", type=String.class, parameters={})
    private Output<String> possibleOutboundIpAddresses;

    /**
     * @return A comma-separated list of outbound IP addresses - such as `52.23.25.3,52.143.43.12,52.143.43.17` - not all of which are necessarily in use. Superset of `outbound_ip_addresses`.
     * 
     */
    public Output<String> possibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }
    /**
     * The name of the Resource Group where the Linux Web App should exist. Changing this forces a new Linux Web App to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Linux Web App should exist. Changing this forces a new Linux Web App to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The ID of the Service Plan that this Linux App Service will be created in.
     * 
     */
    @Export(name="servicePlanId", type=String.class, parameters={})
    private Output<String> servicePlanId;

    /**
     * @return The ID of the Service Plan that this Linux App Service will be created in.
     * 
     */
    public Output<String> servicePlanId() {
        return this.servicePlanId;
    }
    /**
     * A `site_config` block as defined below.
     * 
     */
    @Export(name="siteConfig", type=LinuxWebAppSiteConfig.class, parameters={})
    private Output<LinuxWebAppSiteConfig> siteConfig;

    /**
     * @return A `site_config` block as defined below.
     * 
     */
    public Output<LinuxWebAppSiteConfig> siteConfig() {
        return this.siteConfig;
    }
    /**
     * A `site_credential` block as defined below.
     * 
     */
    @Export(name="siteCredentials", type=List.class, parameters={LinuxWebAppSiteCredential.class})
    private Output<List<LinuxWebAppSiteCredential>> siteCredentials;

    /**
     * @return A `site_credential` block as defined below.
     * 
     */
    public Output<List<LinuxWebAppSiteCredential>> siteCredentials() {
        return this.siteCredentials;
    }
    /**
     * A `sticky_settings` block as defined below.
     * 
     */
    @Export(name="stickySettings", type=LinuxWebAppStickySettings.class, parameters={})
    private Output</* @Nullable */ LinuxWebAppStickySettings> stickySettings;

    /**
     * @return A `sticky_settings` block as defined below.
     * 
     */
    public Output<Optional<LinuxWebAppStickySettings>> stickySettings() {
        return Codegen.optional(this.stickySettings);
    }
    /**
     * One or more `storage_account` blocks as defined below.
     * 
     */
    @Export(name="storageAccounts", type=List.class, parameters={LinuxWebAppStorageAccount.class})
    private Output</* @Nullable */ List<LinuxWebAppStorageAccount>> storageAccounts;

    /**
     * @return One or more `storage_account` blocks as defined below.
     * 
     */
    public Output<Optional<List<LinuxWebAppStorageAccount>>> storageAccounts() {
        return Codegen.optional(this.storageAccounts);
    }
    /**
     * A mapping of tags which should be assigned to the Linux Web App.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Linux Web App.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The subnet id which will be used by this Web App for [regional virtual network integration](https://docs.microsoft.com/en-us/azure/app-service/overview-vnet-integration#regional-virtual-network-integration).
     * 
     */
    @Export(name="virtualNetworkSubnetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualNetworkSubnetId;

    /**
     * @return The subnet id which will be used by this Web App for [regional virtual network integration](https://docs.microsoft.com/en-us/azure/app-service/overview-vnet-integration#regional-virtual-network-integration).
     * 
     */
    public Output<Optional<String>> virtualNetworkSubnetId() {
        return Codegen.optional(this.virtualNetworkSubnetId);
    }
    /**
     * The local path and filename of the Zip packaged application to deploy to this Linux Web App.
     * 
     */
    @Export(name="zipDeployFile", type=String.class, parameters={})
    private Output<String> zipDeployFile;

    /**
     * @return The local path and filename of the Zip packaged application to deploy to this Linux Web App.
     * 
     */
    public Output<String> zipDeployFile() {
        return this.zipDeployFile;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinuxWebApp(String name) {
        this(name, LinuxWebAppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinuxWebApp(String name, LinuxWebAppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinuxWebApp(String name, LinuxWebAppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/linuxWebApp:LinuxWebApp", name, args == null ? LinuxWebAppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinuxWebApp(String name, Output<String> id, @Nullable LinuxWebAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/linuxWebApp:LinuxWebApp", name, state, makeResourceOptions(options, id));
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
    public static LinuxWebApp get(String name, Output<String> id, @Nullable LinuxWebAppState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinuxWebApp(name, id, state, options);
    }
}