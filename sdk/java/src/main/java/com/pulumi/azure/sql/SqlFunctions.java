// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sql.inputs.GetDatabaseArgs;
import com.pulumi.azure.sql.inputs.GetDatabasePlainArgs;
import com.pulumi.azure.sql.inputs.GetServerArgs;
import com.pulumi.azure.sql.inputs.GetServerPlainArgs;
import com.pulumi.azure.sql.inputs.GetSqlManagedInstanceArgs;
import com.pulumi.azure.sql.inputs.GetSqlManagedInstancePlainArgs;
import com.pulumi.azure.sql.outputs.GetDatabaseResult;
import com.pulumi.azure.sql.outputs.GetServerResult;
import com.pulumi.azure.sql.outputs.GetSqlManagedInstanceResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SqlFunctions {
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
     * import com.pulumi.azure.kusto.inputs.GetDatabaseArgs;
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
     *         final var example = SqlFunctions.getDatabase(GetDatabaseArgs.builder()
     *             .name(&#34;example_db&#34;)
     *             .serverName(&#34;example_db_server&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlDatabaseId&#34;, example.applyValue(getDatabaseResult -&gt; getDatabaseResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabaseResult> getDatabase(GetDatabaseArgs args) {
        return getDatabase(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
     * import com.pulumi.azure.kusto.inputs.GetDatabaseArgs;
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
     *         final var example = SqlFunctions.getDatabase(GetDatabaseArgs.builder()
     *             .name(&#34;example_db&#34;)
     *             .serverName(&#34;example_db_server&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlDatabaseId&#34;, example.applyValue(getDatabaseResult -&gt; getDatabaseResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseResult> getDatabasePlain(GetDatabasePlainArgs args) {
        return getDatabasePlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
     * import com.pulumi.azure.kusto.inputs.GetDatabaseArgs;
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
     *         final var example = SqlFunctions.getDatabase(GetDatabaseArgs.builder()
     *             .name(&#34;example_db&#34;)
     *             .serverName(&#34;example_db_server&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlDatabaseId&#34;, example.applyValue(getDatabaseResult -&gt; getDatabaseResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDatabaseResult> getDatabase(GetDatabaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:sql/getDatabase:getDatabase", TypeShape.of(GetDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
     * import com.pulumi.azure.kusto.inputs.GetDatabaseArgs;
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
     *         final var example = SqlFunctions.getDatabase(GetDatabaseArgs.builder()
     *             .name(&#34;example_db&#34;)
     *             .serverName(&#34;example_db_server&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlDatabaseId&#34;, example.applyValue(getDatabaseResult -&gt; getDatabaseResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDatabaseResult> getDatabasePlain(GetDatabasePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:sql/getDatabase:getDatabase", TypeShape.of(GetDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
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
     *         final var example = SqlFunctions.getServer(GetServerArgs.builder()
     *             .name(&#34;examplesqlservername&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlServerId&#34;, example.applyValue(getServerResult -&gt; getServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args) {
        return getServer(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
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
     *         final var example = SqlFunctions.getServer(GetServerArgs.builder()
     *             .name(&#34;examplesqlservername&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlServerId&#34;, example.applyValue(getServerResult -&gt; getServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args) {
        return getServerPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
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
     *         final var example = SqlFunctions.getServer(GetServerArgs.builder()
     *             .name(&#34;examplesqlservername&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlServerId&#34;, example.applyValue(getServerResult -&gt; getServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServerResult> getServer(GetServerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:sql/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
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
     *         final var example = SqlFunctions.getServer(GetServerArgs.builder()
     *             .name(&#34;examplesqlservername&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlServerId&#34;, example.applyValue(getServerResult -&gt; getServerResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServerResult> getServerPlain(GetServerPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:sql/getServer:getServer", TypeShape.of(GetServerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
     * import com.pulumi.azure.sql.inputs.GetSqlManagedInstanceArgs;
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
     *         final var example = SqlFunctions.getSqlManagedInstance(GetSqlManagedInstanceArgs.builder()
     *             .name(&#34;example_mi&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlInstanceId&#34;, example.applyValue(getSqlManagedInstanceResult -&gt; getSqlManagedInstanceResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSqlManagedInstanceResult> getSqlManagedInstance(GetSqlManagedInstanceArgs args) {
        return getSqlManagedInstance(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
     * import com.pulumi.azure.sql.inputs.GetSqlManagedInstanceArgs;
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
     *         final var example = SqlFunctions.getSqlManagedInstance(GetSqlManagedInstanceArgs.builder()
     *             .name(&#34;example_mi&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlInstanceId&#34;, example.applyValue(getSqlManagedInstanceResult -&gt; getSqlManagedInstanceResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSqlManagedInstanceResult> getSqlManagedInstancePlain(GetSqlManagedInstancePlainArgs args) {
        return getSqlManagedInstancePlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
     * import com.pulumi.azure.sql.inputs.GetSqlManagedInstanceArgs;
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
     *         final var example = SqlFunctions.getSqlManagedInstance(GetSqlManagedInstanceArgs.builder()
     *             .name(&#34;example_mi&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlInstanceId&#34;, example.applyValue(getSqlManagedInstanceResult -&gt; getSqlManagedInstanceResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetSqlManagedInstanceResult> getSqlManagedInstance(GetSqlManagedInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure:sql/getSqlManagedInstance:getSqlManagedInstance", TypeShape.of(GetSqlManagedInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.azure.sql.SqlFunctions;
     * import com.pulumi.azure.sql.inputs.GetSqlManagedInstanceArgs;
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
     *         final var example = SqlFunctions.getSqlManagedInstance(GetSqlManagedInstanceArgs.builder()
     *             .name(&#34;example_mi&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;sqlInstanceId&#34;, example.applyValue(getSqlManagedInstanceResult -&gt; getSqlManagedInstanceResult.id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSqlManagedInstanceResult> getSqlManagedInstancePlain(GetSqlManagedInstancePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:sql/getSqlManagedInstance:getSqlManagedInstance", TypeShape.of(GetSqlManagedInstanceResult.class), args, Utilities.withVersion(options));
    }
}