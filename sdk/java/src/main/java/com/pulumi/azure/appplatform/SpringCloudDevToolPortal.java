// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appplatform.SpringCloudDevToolPortalArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalState;
import com.pulumi.azure.appplatform.outputs.SpringCloudDevToolPortalSso;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **NOTE:** This resource is applicable only for Spring Cloud Service with enterprise tier.
 * 
 * Manages a Spring Cloud Dev Tool Portal.
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
 * import com.pulumi.azure.appplatform.SpringCloudService;
 * import com.pulumi.azure.appplatform.SpringCloudServiceArgs;
 * import com.pulumi.azure.appplatform.SpringCloudDevToolPortal;
 * import com.pulumi.azure.appplatform.SpringCloudDevToolPortalArgs;
 * import com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalSsoArgs;
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
 *         var exampleSpringCloudService = new SpringCloudService(&#34;exampleSpringCloudService&#34;, SpringCloudServiceArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .skuName(&#34;E0&#34;)
 *             .build());
 * 
 *         var exampleSpringCloudDevToolPortal = new SpringCloudDevToolPortal(&#34;exampleSpringCloudDevToolPortal&#34;, SpringCloudDevToolPortalArgs.builder()        
 *             .springCloudServiceId(exampleSpringCloudService.id())
 *             .publicNetworkAccessEnabled(true)
 *             .sso(SpringCloudDevToolPortalSsoArgs.builder()
 *                 .clientId(&#34;example id&#34;)
 *                 .clientSecret(&#34;example secret&#34;)
 *                 .metadataUrl(&#34;https://www.example.com/metadata&#34;)
 *                 .scopes(                
 *                     &#34;openid&#34;,
 *                     &#34;profile&#34;,
 *                     &#34;email&#34;)
 *                 .build())
 *             .applicationAcceleratorEnabled(true)
 *             .applicationLiveViewEnabled(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Spring Cloud Dev Tool Portals can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appplatform/springCloudDevToolPortal:SpringCloudDevToolPortal example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resourceGroup1/providers/Microsoft.AppPlatform/Spring/service1/DevToolPortals/default
 * ```
 * 
 */
@ResourceType(type="azure:appplatform/springCloudDevToolPortal:SpringCloudDevToolPortal")
public class SpringCloudDevToolPortal extends com.pulumi.resources.CustomResource {
    /**
     * Should the Accelerator plugin be enabled?
     * 
     */
    @Export(name="applicationAcceleratorEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> applicationAcceleratorEnabled;

    /**
     * @return Should the Accelerator plugin be enabled?
     * 
     */
    public Output<Boolean> applicationAcceleratorEnabled() {
        return this.applicationAcceleratorEnabled;
    }
    /**
     * Should the Application Live View be enabled?
     * 
     */
    @Export(name="applicationLiveViewEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> applicationLiveViewEnabled;

    /**
     * @return Should the Application Live View be enabled?
     * 
     */
    public Output<Boolean> applicationLiveViewEnabled() {
        return this.applicationLiveViewEnabled;
    }
    /**
     * The name which should be used for this Spring Cloud Dev Tool Portal. The only possible value is `default`. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud Dev Tool Portal. The only possible value is `default`. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Is public network access enabled?
     * 
     */
    @Export(name="publicNetworkAccessEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicNetworkAccessEnabled;

    /**
     * @return Is public network access enabled?
     * 
     */
    public Output<Optional<Boolean>> publicNetworkAccessEnabled() {
        return Codegen.optional(this.publicNetworkAccessEnabled);
    }
    /**
     * The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
     * 
     */
    @Export(name="springCloudServiceId", type=String.class, parameters={})
    private Output<String> springCloudServiceId;

    /**
     * @return The ID of the Spring Cloud Service. Changing this forces a new Spring Cloud Dev Tool Portal to be created.
     * 
     */
    public Output<String> springCloudServiceId() {
        return this.springCloudServiceId;
    }
    /**
     * A `sso` block as defined below.
     * 
     */
    @Export(name="sso", type=SpringCloudDevToolPortalSso.class, parameters={})
    private Output</* @Nullable */ SpringCloudDevToolPortalSso> sso;

    /**
     * @return A `sso` block as defined below.
     * 
     */
    public Output<Optional<SpringCloudDevToolPortalSso>> sso() {
        return Codegen.optional(this.sso);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpringCloudDevToolPortal(String name) {
        this(name, SpringCloudDevToolPortalArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpringCloudDevToolPortal(String name, SpringCloudDevToolPortalArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpringCloudDevToolPortal(String name, SpringCloudDevToolPortalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudDevToolPortal:SpringCloudDevToolPortal", name, args == null ? SpringCloudDevToolPortalArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpringCloudDevToolPortal(String name, Output<String> id, @Nullable SpringCloudDevToolPortalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appplatform/springCloudDevToolPortal:SpringCloudDevToolPortal", name, state, makeResourceOptions(options, id));
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
    public static SpringCloudDevToolPortal get(String name, Output<String> id, @Nullable SpringCloudDevToolPortalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpringCloudDevToolPortal(name, id, state, options);
    }
}