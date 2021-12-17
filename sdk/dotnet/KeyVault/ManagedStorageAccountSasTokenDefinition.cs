// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.KeyVault
{
    /// <summary>
    /// Manages a Key Vault Managed Storage Account SAS Definition.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleClientConfig = Output.Create(Azure.Core.GetClientConfig.InvokeAsync());
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleAccount = new Azure.Storage.Account("exampleAccount", new Azure.Storage.AccountArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///             AccountTier = "Standard",
    ///             AccountReplicationType = "LRS",
    ///         });
    ///         var exampleAccountSAS = exampleAccount.PrimaryConnectionString.Apply(primaryConnectionString =&gt; Azure.Storage.GetAccountSAS.InvokeAsync(new Azure.Storage.GetAccountSASArgs
    ///         {
    ///             ConnectionString = primaryConnectionString,
    ///             HttpsOnly = true,
    ///             ResourceTypes = new Azure.Storage.Inputs.GetAccountSASResourceTypesArgs
    ///             {
    ///                 Service = true,
    ///                 Container = false,
    ///                 Object = false,
    ///             },
    ///             Services = new Azure.Storage.Inputs.GetAccountSASServicesArgs
    ///             {
    ///                 Blob = true,
    ///                 Queue = false,
    ///                 Table = false,
    ///                 File = false,
    ///             },
    ///             Start = "2021-04-30T00:00:00Z",
    ///             Expiry = "2023-04-30T00:00:00Z",
    ///             Permissions = new Azure.Storage.Inputs.GetAccountSASPermissionsArgs
    ///             {
    ///                 Read = true,
    ///                 Write = true,
    ///                 Delete = false,
    ///                 List = false,
    ///                 Add = true,
    ///                 Create = true,
    ///                 Update = false,
    ///                 Process = false,
    ///             },
    ///         }));
    ///         var exampleKeyVault = new Azure.KeyVault.KeyVault("exampleKeyVault", new Azure.KeyVault.KeyVaultArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             TenantId = data.Azurerm_client_config.Current.Tenant_id,
    ///             SkuName = "standard",
    ///             AccessPolicies = 
    ///             {
    ///                 new Azure.KeyVault.Inputs.KeyVaultAccessPolicyArgs
    ///                 {
    ///                     TenantId = data.Azurerm_client_config.Current.Tenant_id,
    ///                     ObjectId = data.Azurerm_client_config.Current.Object_id,
    ///                     SecretPermissions = 
    ///                     {
    ///                         "Get",
    ///                         "Delete",
    ///                     },
    ///                     StoragePermissions = 
    ///                     {
    ///                         "Get",
    ///                         "List",
    ///                         "Set",
    ///                         "SetSAS",
    ///                         "GetSAS",
    ///                         "DeleteSAS",
    ///                         "Update",
    ///                         "RegenerateKey",
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///         var test = new Azure.KeyVault.ManagedStorageAccount("test", new Azure.KeyVault.ManagedStorageAccountArgs
    ///         {
    ///             KeyVaultId = exampleKeyVault.Id,
    ///             StorageAccountId = exampleAccount.Id,
    ///             StorageAccountKey = "key1",
    ///             RegenerateKeyAutomatically = false,
    ///             RegenerationPeriod = "P1D",
    ///         });
    ///         var exampleManagedStorageAccountSasTokenDefinition = new Azure.KeyVault.ManagedStorageAccountSasTokenDefinition("exampleManagedStorageAccountSasTokenDefinition", new Azure.KeyVault.ManagedStorageAccountSasTokenDefinitionArgs
    ///         {
    ///             ValidityPeriod = "P1D",
    ///             ManagedStorageAccountId = azurerm_key_vault_managed_storage_account.Example.Id,
    ///             SasTemplateUri = exampleAccountSAS.Apply(exampleAccountSAS =&gt; exampleAccountSAS.Sas),
    ///             SasType = "account",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Key Vaults can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:keyvault/managedStorageAccountSasTokenDefinition:ManagedStorageAccountSasTokenDefinition example https://example-keyvault.vault.azure.net/storage/exampleStorageAcc01/sas/exampleSasDefinition01
    /// ```
    /// </summary>
    [AzureResourceType("azure:keyvault/managedStorageAccountSasTokenDefinition:ManagedStorageAccountSasTokenDefinition")]
    public partial class ManagedStorageAccountSasTokenDefinition : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Managed Storage Account.
        /// </summary>
        [Output("managedStorageAccountId")]
        public Output<string> ManagedStorageAccountId { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this SAS Definition.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The SAS definition token template signed with an arbitrary key. Tokens created according to the SAS definition will have the same properties as the template, but regenerated with a new validity period.
        /// </summary>
        [Output("sasTemplateUri")]
        public Output<string> SasTemplateUri { get; private set; } = null!;

        /// <summary>
        /// The type of SAS token the SAS definition will create. Possible values are `account` and `service`.
        /// </summary>
        [Output("sasType")]
        public Output<string> SasType { get; private set; } = null!;

        /// <summary>
        /// The ID of the Secret that is created by Managed Storage Account SAS Definition.
        /// </summary>
        [Output("secretId")]
        public Output<string> SecretId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags which should be assigned to the SAS Definition.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Validity period of SAS token. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
        /// </summary>
        [Output("validityPeriod")]
        public Output<string> ValidityPeriod { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedStorageAccountSasTokenDefinition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedStorageAccountSasTokenDefinition(string name, ManagedStorageAccountSasTokenDefinitionArgs args, CustomResourceOptions? options = null)
            : base("azure:keyvault/managedStorageAccountSasTokenDefinition:ManagedStorageAccountSasTokenDefinition", name, args ?? new ManagedStorageAccountSasTokenDefinitionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedStorageAccountSasTokenDefinition(string name, Input<string> id, ManagedStorageAccountSasTokenDefinitionState? state = null, CustomResourceOptions? options = null)
            : base("azure:keyvault/managedStorageAccountSasTokenDefinition:ManagedStorageAccountSasTokenDefinition", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ManagedStorageAccountSasTokenDefinition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedStorageAccountSasTokenDefinition Get(string name, Input<string> id, ManagedStorageAccountSasTokenDefinitionState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedStorageAccountSasTokenDefinition(name, id, state, options);
        }
    }

    public sealed class ManagedStorageAccountSasTokenDefinitionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Managed Storage Account.
        /// </summary>
        [Input("managedStorageAccountId", required: true)]
        public Input<string> ManagedStorageAccountId { get; set; } = null!;

        /// <summary>
        /// The name which should be used for this SAS Definition.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The SAS definition token template signed with an arbitrary key. Tokens created according to the SAS definition will have the same properties as the template, but regenerated with a new validity period.
        /// </summary>
        [Input("sasTemplateUri", required: true)]
        public Input<string> SasTemplateUri { get; set; } = null!;

        /// <summary>
        /// The type of SAS token the SAS definition will create. Possible values are `account` and `service`.
        /// </summary>
        [Input("sasType", required: true)]
        public Input<string> SasType { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the SAS Definition.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Validity period of SAS token. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
        /// </summary>
        [Input("validityPeriod", required: true)]
        public Input<string> ValidityPeriod { get; set; } = null!;

        public ManagedStorageAccountSasTokenDefinitionArgs()
        {
        }
    }

    public sealed class ManagedStorageAccountSasTokenDefinitionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Managed Storage Account.
        /// </summary>
        [Input("managedStorageAccountId")]
        public Input<string>? ManagedStorageAccountId { get; set; }

        /// <summary>
        /// The name which should be used for this SAS Definition.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The SAS definition token template signed with an arbitrary key. Tokens created according to the SAS definition will have the same properties as the template, but regenerated with a new validity period.
        /// </summary>
        [Input("sasTemplateUri")]
        public Input<string>? SasTemplateUri { get; set; }

        /// <summary>
        /// The type of SAS token the SAS definition will create. Possible values are `account` and `service`.
        /// </summary>
        [Input("sasType")]
        public Input<string>? SasType { get; set; }

        /// <summary>
        /// The ID of the Secret that is created by Managed Storage Account SAS Definition.
        /// </summary>
        [Input("secretId")]
        public Input<string>? SecretId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags which should be assigned to the SAS Definition.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Validity period of SAS token. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
        /// </summary>
        [Input("validityPeriod")]
        public Input<string>? ValidityPeriod { get; set; }

        public ManagedStorageAccountSasTokenDefinitionState()
        {
        }
    }
}