// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.search;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.search.inputs.GetServiceArgs;
import com.pulumi.azure.search.inputs.GetServicePlainArgs;
import com.pulumi.azure.search.outputs.GetServiceResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SearchFunctions {
    /**
     * Manages a Search Service.
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
     * import com.pulumi.azure.search.SearchFunctions;
     * import com.pulumi.azure.apimanagement.inputs.GetServiceArgs;
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
     *         final var exampleService = SearchFunctions.getService(GetServiceArgs.builder()
     *             .name(&#34;example-search-service&#34;)
     *             .resourceGroupName(exampleResourceGroup.name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * Manages a Search Service.
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
     * import com.pulumi.azure.search.SearchFunctions;
     * import com.pulumi.azure.apimanagement.inputs.GetServiceArgs;
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
     *         final var exampleService = SearchFunctions.getService(GetServiceArgs.builder()
     *             .name(&#34;example-search-service&#34;)
     *             .resourceGroupName(exampleResourceGroup.name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args) {
        return getServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * Manages a Search Service.
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
     * import com.pulumi.azure.search.SearchFunctions;
     * import com.pulumi.azure.apimanagement.inputs.GetServiceArgs;
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
     *         final var exampleService = SearchFunctions.getService(GetServiceArgs.builder()
     *             .name(&#34;example-search-service&#34;)
     *             .resourceGroupName(exampleResourceGroup.name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:search/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Manages a Search Service.
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
     * import com.pulumi.azure.search.SearchFunctions;
     * import com.pulumi.azure.apimanagement.inputs.GetServiceArgs;
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
     *         final var exampleService = SearchFunctions.getService(GetServiceArgs.builder()
     *             .name(&#34;example-search-service&#34;)
     *             .resourceGroupName(exampleResourceGroup.name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:search/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
}