// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mysql.inputs.GetFlexibleServerArgs;
import com.pulumi.azure.mysql.inputs.GetFlexibleServerPlainArgs;
import com.pulumi.azure.mysql.inputs.GetServerArgs;
import com.pulumi.azure.mysql.inputs.GetServerPlainArgs;
import com.pulumi.azure.mysql.outputs.GetFlexibleServerResult;
import com.pulumi.azure.mysql.outputs.GetServerResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MysqlFunctions {
    /**
     * Use this data source to access information about an existing MySQL Flexible Server.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.mysql.MysqlFunctions;
     * import com.pulumi.azure.mysql.inputs.GetFlexibleServerArgs;
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
     *         final var example = MysqlFunctions.getFlexibleServer(GetFlexibleServerArgs.builder()
     *             .name(&#34;existingMySqlFlexibleServer&#34;)
     *             .resourceGroupName(&#34;existingResGroup&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getFlexibleServerResult -&gt; getFlexibleServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetFlexibleServerResult> getFlexibleServer(GetFlexibleServerArgs args) {
        return getFlexibleServer(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing MySQL Flexible Server.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.mysql.MysqlFunctions;
     * import com.pulumi.azure.mysql.inputs.GetFlexibleServerArgs;
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
     *         final var example = MysqlFunctions.getFlexibleServer(GetFlexibleServerArgs.builder()
     *             .name(&#34;existingMySqlFlexibleServer&#34;)
     *             .resourceGroupName(&#34;existingResGroup&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getFlexibleServerResult -&gt; getFlexibleServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFlexibleServerResult> getFlexibleServerPlain(GetFlexibleServerPlainArgs args) {
        return getFlexibleServerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing MySQL Flexible Server.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.mysql.MysqlFunctions;
     * import com.pulumi.azure.mysql.inputs.GetFlexibleServerArgs;
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
     *         final var example = MysqlFunctions.getFlexibleServer(GetFlexibleServerArgs.builder()
     *             .name(&#34;existingMySqlFlexibleServer&#34;)
     *             .resourceGroupName(&#34;existingResGroup&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getFlexibleServerResult -&gt; getFlexibleServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetFlexibleServerResult> getFlexibleServer(GetFlexibleServerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:mysql/getFlexibleServer:getFlexibleServer", TypeShape.of(GetFlexibleServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing MySQL Flexible Server.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.mysql.MysqlFunctions;
     * import com.pulumi.azure.mysql.inputs.GetFlexibleServerArgs;
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
     *         final var example = MysqlFunctions.getFlexibleServer(GetFlexibleServerArgs.builder()
     *             .name(&#34;existingMySqlFlexibleServer&#34;)
     *             .resourceGroupName(&#34;existingResGroup&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getFlexibleServerResult -&gt; getFlexibleServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFlexibleServerResult> getFlexibleServerPlain(GetFlexibleServerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:mysql/getFlexibleServer:getFlexibleServer", TypeShape.of(GetFlexibleServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing MySQL Server.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.mysql.MysqlFunctions;
     * import com.pulumi.azure.mssql.inputs.GetServerArgs;
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
     *         final var example = MysqlFunctions.getServer(GetServerArgs.builder()
     *             .name(&#34;existingMySqlServer&#34;)
     *             .resourceGroupName(&#34;existingResGroup&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getServerResult -&gt; getServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args) {
        return getServer(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing MySQL Server.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.mysql.MysqlFunctions;
     * import com.pulumi.azure.mssql.inputs.GetServerArgs;
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
     *         final var example = MysqlFunctions.getServer(GetServerArgs.builder()
     *             .name(&#34;existingMySqlServer&#34;)
     *             .resourceGroupName(&#34;existingResGroup&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getServerResult -&gt; getServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args) {
        return getServerPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing MySQL Server.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.mysql.MysqlFunctions;
     * import com.pulumi.azure.mssql.inputs.GetServerArgs;
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
     *         final var example = MysqlFunctions.getServer(GetServerArgs.builder()
     *             .name(&#34;existingMySqlServer&#34;)
     *             .resourceGroupName(&#34;existingResGroup&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getServerResult -&gt; getServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:mysql/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing MySQL Server.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.mysql.MysqlFunctions;
     * import com.pulumi.azure.mssql.inputs.GetServerArgs;
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
     *         final var example = MysqlFunctions.getServer(GetServerArgs.builder()
     *             .name(&#34;existingMySqlServer&#34;)
     *             .resourceGroupName(&#34;existingResGroup&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;id&#34;, example.applyValue(getServerResult -&gt; getServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:mysql/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
}