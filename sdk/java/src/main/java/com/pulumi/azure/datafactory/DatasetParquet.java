// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.DatasetParquetArgs;
import com.pulumi.azure.datafactory.inputs.DatasetParquetState;
import com.pulumi.azure.datafactory.outputs.DatasetParquetAzureBlobStorageLocation;
import com.pulumi.azure.datafactory.outputs.DatasetParquetHttpServerLocation;
import com.pulumi.azure.datafactory.outputs.DatasetParquetSchemaColumn;
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
 * Manages an Azure Parquet Dataset inside an Azure Data Factory.
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
 * import com.pulumi.azure.datafactory.Factory;
 * import com.pulumi.azure.datafactory.FactoryArgs;
 * import com.pulumi.azure.datafactory.LinkedServiceWeb;
 * import com.pulumi.azure.datafactory.LinkedServiceWebArgs;
 * import com.pulumi.azure.datafactory.DatasetParquet;
 * import com.pulumi.azure.datafactory.DatasetParquetArgs;
 * import com.pulumi.azure.datafactory.inputs.DatasetParquetHttpServerLocationArgs;
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
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .build());
 * 
 *         var exampleLinkedServiceWeb = new LinkedServiceWeb(&#34;exampleLinkedServiceWeb&#34;, LinkedServiceWebArgs.builder()        
 *             .dataFactoryId(exampleFactory.id())
 *             .authenticationType(&#34;Anonymous&#34;)
 *             .url(&#34;https://www.bing.com&#34;)
 *             .build());
 * 
 *         var exampleDatasetParquet = new DatasetParquet(&#34;exampleDatasetParquet&#34;, DatasetParquetArgs.builder()        
 *             .dataFactoryId(exampleFactory.id())
 *             .linkedServiceName(exampleLinkedServiceWeb.name())
 *             .httpServerLocation(DatasetParquetHttpServerLocationArgs.builder()
 *                 .relativeUrl(&#34;http://www.bing.com&#34;)
 *                 .path(&#34;foo/bar/&#34;)
 *                 .filename(&#34;fizz.txt&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Factory Datasets can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/datasetParquet:DatasetParquet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/datasets/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/datasetParquet:DatasetParquet")
public class DatasetParquet extends com.pulumi.resources.CustomResource {
    /**
     * A map of additional properties to associate with the Data Factory Dataset.
     * 
     */
    @Export(name="additionalProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Dataset.
     * 
     */
    public Output<Optional<Map<String,String>>> additionalProperties() {
        return Codegen.optional(this.additionalProperties);
    }
    /**
     * List of tags that can be used for describing the Data Factory Dataset.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Dataset.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * A `azure_blob_storage_location` block as defined below.
     * 
     */
    @Export(name="azureBlobStorageLocation", type=DatasetParquetAzureBlobStorageLocation.class, parameters={})
    private Output</* @Nullable */ DatasetParquetAzureBlobStorageLocation> azureBlobStorageLocation;

    /**
     * @return A `azure_blob_storage_location` block as defined below.
     * 
     */
    public Output<Optional<DatasetParquetAzureBlobStorageLocation>> azureBlobStorageLocation() {
        return Codegen.optional(this.azureBlobStorageLocation);
    }
    /**
     * The compression codec used to read/write text files. Valid values are `bzip2`, `gzip`, `deflate`, `ZipDeflate`, `TarGzip`, `Tar`, `snappy`, or `lz4`. Please note these values are case sensitive.
     * 
     */
    @Export(name="compressionCodec", type=String.class, parameters={})
    private Output</* @Nullable */ String> compressionCodec;

    /**
     * @return The compression codec used to read/write text files. Valid values are `bzip2`, `gzip`, `deflate`, `ZipDeflate`, `TarGzip`, `Tar`, `snappy`, or `lz4`. Please note these values are case sensitive.
     * 
     */
    public Output<Optional<String>> compressionCodec() {
        return Codegen.optional(this.compressionCodec);
    }
    @Export(name="compressionLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> compressionLevel;

    public Output<Optional<String>> compressionLevel() {
        return Codegen.optional(this.compressionLevel);
    }
    /**
     * The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Dataset with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Dataset.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Dataset.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
     * 
     */
    @Export(name="folder", type=String.class, parameters={})
    private Output</* @Nullable */ String> folder;

    /**
     * @return The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
     * 
     */
    public Output<Optional<String>> folder() {
        return Codegen.optional(this.folder);
    }
    /**
     * A `http_server_location` block as defined below.
     * 
     */
    @Export(name="httpServerLocation", type=DatasetParquetHttpServerLocation.class, parameters={})
    private Output</* @Nullable */ DatasetParquetHttpServerLocation> httpServerLocation;

    /**
     * @return A `http_server_location` block as defined below.
     * 
     */
    public Output<Optional<DatasetParquetHttpServerLocation>> httpServerLocation() {
        return Codegen.optional(this.httpServerLocation);
    }
    /**
     * The Data Factory Linked Service name in which to associate the Dataset with.
     * 
     */
    @Export(name="linkedServiceName", type=String.class, parameters={})
    private Output<String> linkedServiceName;

    /**
     * @return The Data Factory Linked Service name in which to associate the Dataset with.
     * 
     */
    public Output<String> linkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of parameters to associate with the Data Factory Dataset.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Dataset.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * A `schema_column` block as defined below.
     * 
     */
    @Export(name="schemaColumns", type=List.class, parameters={DatasetParquetSchemaColumn.class})
    private Output</* @Nullable */ List<DatasetParquetSchemaColumn>> schemaColumns;

    /**
     * @return A `schema_column` block as defined below.
     * 
     */
    public Output<Optional<List<DatasetParquetSchemaColumn>>> schemaColumns() {
        return Codegen.optional(this.schemaColumns);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatasetParquet(String name) {
        this(name, DatasetParquetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatasetParquet(String name, DatasetParquetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatasetParquet(String name, DatasetParquetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/datasetParquet:DatasetParquet", name, args == null ? DatasetParquetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatasetParquet(String name, Output<String> id, @Nullable DatasetParquetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/datasetParquet:DatasetParquet", name, state, makeResourceOptions(options, id));
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
    public static DatasetParquet get(String name, Output<String> id, @Nullable DatasetParquetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatasetParquet(name, id, state, options);
    }
}