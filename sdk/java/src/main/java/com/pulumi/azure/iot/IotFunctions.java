// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.iot.inputs.GetDpsArgs;
import com.pulumi.azure.iot.inputs.GetDpsPlainArgs;
import com.pulumi.azure.iot.inputs.GetDpsSharedAccessPolicyArgs;
import com.pulumi.azure.iot.inputs.GetDpsSharedAccessPolicyPlainArgs;
import com.pulumi.azure.iot.inputs.GetIotHubArgs;
import com.pulumi.azure.iot.inputs.GetIotHubPlainArgs;
import com.pulumi.azure.iot.inputs.GetSharedAccessPolicyArgs;
import com.pulumi.azure.iot.inputs.GetSharedAccessPolicyPlainArgs;
import com.pulumi.azure.iot.outputs.GetDpsResult;
import com.pulumi.azure.iot.outputs.GetDpsSharedAccessPolicyResult;
import com.pulumi.azure.iot.outputs.GetIotHubResult;
import com.pulumi.azure.iot.outputs.GetSharedAccessPolicyResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class IotFunctions {
    /**
     * Use this data source to access information about an existing IotHub Device Provisioning Service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetDpsArgs;
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
     *         final var example = IotFunctions.getDps(GetDpsArgs.builder()
     *             .name(&#34;iot_hub_dps_test&#34;)
     *             .resourceGroupName(&#34;iothub_dps_rg&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDpsResult> getDps(GetDpsArgs args) {
        return getDps(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing IotHub Device Provisioning Service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetDpsArgs;
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
     *         final var example = IotFunctions.getDps(GetDpsArgs.builder()
     *             .name(&#34;iot_hub_dps_test&#34;)
     *             .resourceGroupName(&#34;iothub_dps_rg&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDpsResult> getDpsPlain(GetDpsPlainArgs args) {
        return getDpsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing IotHub Device Provisioning Service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetDpsArgs;
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
     *         final var example = IotFunctions.getDps(GetDpsArgs.builder()
     *             .name(&#34;iot_hub_dps_test&#34;)
     *             .resourceGroupName(&#34;iothub_dps_rg&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDpsResult> getDps(GetDpsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:iot/getDps:getDps", TypeShape.of(GetDpsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing IotHub Device Provisioning Service.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetDpsArgs;
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
     *         final var example = IotFunctions.getDps(GetDpsArgs.builder()
     *             .name(&#34;iot_hub_dps_test&#34;)
     *             .resourceGroupName(&#34;iothub_dps_rg&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDpsResult> getDpsPlain(GetDpsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:iot/getDps:getDps", TypeShape.of(GetDpsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing IotHub Device Provisioning Service Shared Access Policy
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetDpsSharedAccessPolicyArgs;
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
     *         final var example = IotFunctions.getDpsSharedAccessPolicy(GetDpsSharedAccessPolicyArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.example().name())
     *             .iothubDpsName(azurerm_iothub_dps.example().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDpsSharedAccessPolicyResult> getDpsSharedAccessPolicy(GetDpsSharedAccessPolicyArgs args) {
        return getDpsSharedAccessPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing IotHub Device Provisioning Service Shared Access Policy
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetDpsSharedAccessPolicyArgs;
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
     *         final var example = IotFunctions.getDpsSharedAccessPolicy(GetDpsSharedAccessPolicyArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.example().name())
     *             .iothubDpsName(azurerm_iothub_dps.example().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDpsSharedAccessPolicyResult> getDpsSharedAccessPolicyPlain(GetDpsSharedAccessPolicyPlainArgs args) {
        return getDpsSharedAccessPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing IotHub Device Provisioning Service Shared Access Policy
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetDpsSharedAccessPolicyArgs;
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
     *         final var example = IotFunctions.getDpsSharedAccessPolicy(GetDpsSharedAccessPolicyArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.example().name())
     *             .iothubDpsName(azurerm_iothub_dps.example().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDpsSharedAccessPolicyResult> getDpsSharedAccessPolicy(GetDpsSharedAccessPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:iot/getDpsSharedAccessPolicy:getDpsSharedAccessPolicy", TypeShape.of(GetDpsSharedAccessPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing IotHub Device Provisioning Service Shared Access Policy
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetDpsSharedAccessPolicyArgs;
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
     *         final var example = IotFunctions.getDpsSharedAccessPolicy(GetDpsSharedAccessPolicyArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.example().name())
     *             .iothubDpsName(azurerm_iothub_dps.example().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDpsSharedAccessPolicyResult> getDpsSharedAccessPolicyPlain(GetDpsSharedAccessPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:iot/getDpsSharedAccessPolicy:getDpsSharedAccessPolicy", TypeShape.of(GetDpsSharedAccessPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing IoTHub.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetIotHubArgs;
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
     *         final var example = IotFunctions.getIotHub(GetIotHubArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getIotHubResult -&gt; getIotHubResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetIotHubResult> getIotHub(GetIotHubArgs args) {
        return getIotHub(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing IoTHub.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetIotHubArgs;
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
     *         final var example = IotFunctions.getIotHub(GetIotHubArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getIotHubResult -&gt; getIotHubResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetIotHubResult> getIotHubPlain(GetIotHubPlainArgs args) {
        return getIotHubPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing IoTHub.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetIotHubArgs;
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
     *         final var example = IotFunctions.getIotHub(GetIotHubArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getIotHubResult -&gt; getIotHubResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetIotHubResult> getIotHub(GetIotHubArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:iot/getIotHub:getIotHub", TypeShape.of(GetIotHubResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing IoTHub.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetIotHubArgs;
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
     *         final var example = IotFunctions.getIotHub(GetIotHubArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .resourceGroupName(&#34;existing&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getIotHubResult -&gt; getIotHubResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetIotHubResult> getIotHubPlain(GetIotHubPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:iot/getIotHub:getIotHub", TypeShape.of(GetIotHubResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing IotHub Shared Access Policy
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetSharedAccessPolicyArgs;
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
     *         final var example = IotFunctions.getSharedAccessPolicy(GetSharedAccessPolicyArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.example().name())
     *             .iothubName(azurerm_iothub.example().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSharedAccessPolicyResult> getSharedAccessPolicy(GetSharedAccessPolicyArgs args) {
        return getSharedAccessPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing IotHub Shared Access Policy
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetSharedAccessPolicyArgs;
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
     *         final var example = IotFunctions.getSharedAccessPolicy(GetSharedAccessPolicyArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.example().name())
     *             .iothubName(azurerm_iothub.example().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSharedAccessPolicyResult> getSharedAccessPolicyPlain(GetSharedAccessPolicyPlainArgs args) {
        return getSharedAccessPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing IotHub Shared Access Policy
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetSharedAccessPolicyArgs;
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
     *         final var example = IotFunctions.getSharedAccessPolicy(GetSharedAccessPolicyArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.example().name())
     *             .iothubName(azurerm_iothub.example().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSharedAccessPolicyResult> getSharedAccessPolicy(GetSharedAccessPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:iot/getSharedAccessPolicy:getSharedAccessPolicy", TypeShape.of(GetSharedAccessPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing IotHub Shared Access Policy
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.iot.IotFunctions;
     * import com.pulumi.azure.iot.inputs.GetSharedAccessPolicyArgs;
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
     *         final var example = IotFunctions.getSharedAccessPolicy(GetSharedAccessPolicyArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(azurerm_resource_group.example().name())
     *             .iothubName(azurerm_iothub.example().name())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSharedAccessPolicyResult> getSharedAccessPolicyPlain(GetSharedAccessPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:iot/getSharedAccessPolicy:getSharedAccessPolicy", TypeShape.of(GetSharedAccessPolicyResult.class), args, Utilities.withVersion(options));
    }
}