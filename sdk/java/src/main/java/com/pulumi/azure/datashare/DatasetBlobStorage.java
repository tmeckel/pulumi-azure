// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datashare;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datashare.DatasetBlobStorageArgs;
import com.pulumi.azure.datashare.inputs.DatasetBlobStorageState;
import com.pulumi.azure.datashare.outputs.DatasetBlobStorageStorageAccount;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Data Share Blob Storage Dataset.
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
 * import com.pulumi.azure.datashare.Account;
 * import com.pulumi.azure.datashare.AccountArgs;
 * import com.pulumi.azure.datashare.inputs.AccountIdentityArgs;
 * import com.pulumi.azure.datashare.Share;
 * import com.pulumi.azure.datashare.ShareArgs;
 * import com.pulumi.azure.storage.Account;
 * import com.pulumi.azure.storage.AccountArgs;
 * import com.pulumi.azure.storage.Container;
 * import com.pulumi.azure.storage.ContainerArgs;
 * import com.pulumi.azuread.AzureadFunctions;
 * import com.pulumi.azuread.inputs.GetServicePrincipalArgs;
 * import com.pulumi.azure.authorization.Assignment;
 * import com.pulumi.azure.authorization.AssignmentArgs;
 * import com.pulumi.azure.datashare.DatasetBlobStorage;
 * import com.pulumi.azure.datashare.DatasetBlobStorageArgs;
 * import com.pulumi.azure.datashare.inputs.DatasetBlobStorageStorageAccountArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.location())
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .identity(AccountIdentityArgs.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleShare = new Share(&#34;exampleShare&#34;, ShareArgs.builder()        
 *             .accountId(exampleAccount.id())
 *             .kind(&#34;CopyBased&#34;)
 *             .build());
 * 
 *         var exampleStorage_accountAccount = new Account(&#34;exampleStorage/accountAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.name())
 *             .location(exampleResourceGroup.location())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;RAGRS&#34;)
 *             .build());
 * 
 *         var exampleContainer = new Container(&#34;exampleContainer&#34;, ContainerArgs.builder()        
 *             .storageAccountName(exampleStorage / accountAccount.name())
 *             .containerAccessType(&#34;container&#34;)
 *             .build());
 * 
 *         final var exampleServicePrincipal = AzureadFunctions.getServicePrincipal(GetServicePrincipalArgs.builder()
 *             .displayName(exampleAccount.name())
 *             .build());
 * 
 *         var exampleAssignment = new Assignment(&#34;exampleAssignment&#34;, AssignmentArgs.builder()        
 *             .scope(exampleStorage / accountAccount.id())
 *             .roleDefinitionName(&#34;Storage Blob Data Reader&#34;)
 *             .principalId(exampleServicePrincipal.applyValue(getServicePrincipalResult -&gt; getServicePrincipalResult).applyValue(exampleServicePrincipal -&gt; exampleServicePrincipal.applyValue(getServicePrincipalResult -&gt; getServicePrincipalResult.objectId())))
 *             .build());
 * 
 *         var exampleDatasetBlobStorage = new DatasetBlobStorage(&#34;exampleDatasetBlobStorage&#34;, DatasetBlobStorageArgs.builder()        
 *             .dataShareId(exampleShare.id())
 *             .containerName(exampleContainer.name())
 *             .storageAccount(DatasetBlobStorageStorageAccountArgs.builder()
 *                 .name(exampleStorage / accountAccount.name())
 *                 .resourceGroupName(exampleStorage / accountAccount.resourceGroupName())
 *                 .subscriptionId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *                 .build())
 *             .filePath(&#34;myfile.txt&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(exampleAssignment)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Share Blob Storage Datasets can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datashare/datasetBlobStorage:DatasetBlobStorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DataShare/accounts/account1/shares/share1/dataSets/dataSet1
 * ```
 * 
 */
@ResourceType(type="azure:datashare/datasetBlobStorage:DatasetBlobStorage")
public class DatasetBlobStorage extends com.pulumi.resources.CustomResource {
    /**
     * The name of the storage account container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
     * 
     */
    @Export(name="containerName", type=String.class, parameters={})
    private Output<String> containerName;

    /**
     * @return The name of the storage account container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }
    /**
     * The ID of the Data Share in which this Data Share Blob Storage Dataset should be created. Changing this forces a new Data Share Blob Storage Dataset to be created.
     * 
     */
    @Export(name="dataShareId", type=String.class, parameters={})
    private Output<String> dataShareId;

    /**
     * @return The ID of the Data Share in which this Data Share Blob Storage Dataset should be created. Changing this forces a new Data Share Blob Storage Dataset to be created.
     * 
     */
    public Output<String> dataShareId() {
        return this.dataShareId;
    }
    /**
     * The name of the Data Share Dataset.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The name of the Data Share Dataset.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The path of the file in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
     * 
     */
    @Export(name="filePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> filePath;

    /**
     * @return The path of the file in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
     * 
     */
    public Output<Optional<String>> filePath() {
        return Codegen.optional(this.filePath);
    }
    /**
     * The path of the folder in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
     * 
     */
    @Export(name="folderPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> folderPath;

    /**
     * @return The path of the folder in the storage container to be shared with the receiver. Changing this forces a new Data Share Blob Storage Dataset to be created.
     * 
     */
    public Output<Optional<String>> folderPath() {
        return Codegen.optional(this.folderPath);
    }
    /**
     * The name which should be used for this Data Share Blob Storage Dataset. Changing this forces a new Data Share Blob Storage Dataset to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Data Share Blob Storage Dataset. Changing this forces a new Data Share Blob Storage Dataset to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A `storage_account` block as defined below.
     * 
     */
    @Export(name="storageAccount", type=DatasetBlobStorageStorageAccount.class, parameters={})
    private Output<DatasetBlobStorageStorageAccount> storageAccount;

    /**
     * @return A `storage_account` block as defined below.
     * 
     */
    public Output<DatasetBlobStorageStorageAccount> storageAccount() {
        return this.storageAccount;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatasetBlobStorage(String name) {
        this(name, DatasetBlobStorageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatasetBlobStorage(String name, DatasetBlobStorageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatasetBlobStorage(String name, DatasetBlobStorageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datashare/datasetBlobStorage:DatasetBlobStorage", name, args == null ? DatasetBlobStorageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatasetBlobStorage(String name, Output<String> id, @Nullable DatasetBlobStorageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datashare/datasetBlobStorage:DatasetBlobStorage", name, state, makeResourceOptions(options, id));
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
    public static DatasetBlobStorage get(String name, Output<String> id, @Nullable DatasetBlobStorageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatasetBlobStorage(name, id, state, options);
    }
}