// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Cognitive
{
    /// <summary>
    /// Manages a Customer Managed Key for a Cognitive Services Account.
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
    ///         var current = Output.Create(Azure.Core.GetClientConfig.InvokeAsync());
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West US",
    ///         });
    ///         var exampleUserAssignedIdentity = new Azure.Authorization.UserAssignedIdentity("exampleUserAssignedIdentity", new Azure.Authorization.UserAssignedIdentityArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///         });
    ///         var exampleAccount = new Azure.Cognitive.Account("exampleAccount", new Azure.Cognitive.AccountArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Kind = "Face",
    ///             SkuName = "E0",
    ///             CustomSubdomainName = "example-account",
    ///             Identity = new Azure.Cognitive.Inputs.AccountIdentityArgs
    ///             {
    ///                 Type = "SystemAssigned, UserAssigned",
    ///                 IdentityIds = 
    ///                 {
    ///                     exampleUserAssignedIdentity.Id,
    ///                 },
    ///             },
    ///         });
    ///         var exampleKeyVault = new Azure.KeyVault.KeyVault("exampleKeyVault", new Azure.KeyVault.KeyVaultArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             TenantId = current.Apply(current =&gt; current.TenantId),
    ///             SkuName = "standard",
    ///             SoftDeleteEnabled = true,
    ///             PurgeProtectionEnabled = true,
    ///             AccessPolicies = 
    ///             {
    ///                 new Azure.KeyVault.Inputs.KeyVaultAccessPolicyArgs
    ///                 {
    ///                     TenantId = azurerm_cognitive_account.Test.Identity[0].Tenant_id,
    ///                     ObjectId = azurerm_cognitive_account.Test.Identity[0].Principal_id,
    ///                     KeyPermissions = 
    ///                     {
    ///                         "Get",
    ///                         "Create",
    ///                         "List",
    ///                         "Restore",
    ///                         "Recover",
    ///                         "UnwrapKey",
    ///                         "WrapKey",
    ///                         "Purge",
    ///                         "Encrypt",
    ///                         "Decrypt",
    ///                         "Sign",
    ///                         "Verify",
    ///                     },
    ///                     SecretPermissions = 
    ///                     {
    ///                         "Get",
    ///                     },
    ///                 },
    ///                 new Azure.KeyVault.Inputs.KeyVaultAccessPolicyArgs
    ///                 {
    ///                     TenantId = current.Apply(current =&gt; current.TenantId),
    ///                     ObjectId = current.Apply(current =&gt; current.ObjectId),
    ///                     KeyPermissions = 
    ///                     {
    ///                         "Get",
    ///                         "Create",
    ///                         "Delete",
    ///                         "List",
    ///                         "Restore",
    ///                         "Recover",
    ///                         "UnwrapKey",
    ///                         "WrapKey",
    ///                         "Purge",
    ///                         "Encrypt",
    ///                         "Decrypt",
    ///                         "Sign",
    ///                         "Verify",
    ///                     },
    ///                     SecretPermissions = 
    ///                     {
    ///                         "Get",
    ///                     },
    ///                 },
    ///                 new Azure.KeyVault.Inputs.KeyVaultAccessPolicyArgs
    ///                 {
    ///                     TenantId = azurerm_user_assigned_identity.Test.Tenant_id,
    ///                     ObjectId = azurerm_user_assigned_identity.Test.Principal_id,
    ///                     KeyPermissions = 
    ///                     {
    ///                         "Get",
    ///                         "Create",
    ///                         "Delete",
    ///                         "List",
    ///                         "Restore",
    ///                         "Recover",
    ///                         "UnwrapKey",
    ///                         "WrapKey",
    ///                         "Purge",
    ///                         "Encrypt",
    ///                         "Decrypt",
    ///                         "Sign",
    ///                         "Verify",
    ///                     },
    ///                     SecretPermissions = 
    ///                     {
    ///                         "Get",
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///         var exampleKey = new Azure.KeyVault.Key("exampleKey", new Azure.KeyVault.KeyArgs
    ///         {
    ///             KeyVaultId = exampleKeyVault.Id,
    ///             KeyType = "RSA",
    ///             KeySize = 2048,
    ///             KeyOpts = 
    ///             {
    ///                 "decrypt",
    ///                 "encrypt",
    ///                 "sign",
    ///                 "unwrapKey",
    ///                 "verify",
    ///                 "wrapKey",
    ///             },
    ///         });
    ///         var exampleAccountCustomerManagedKey = new Azure.Cognitive.AccountCustomerManagedKey("exampleAccountCustomerManagedKey", new Azure.Cognitive.AccountCustomerManagedKeyArgs
    ///         {
    ///             CognitiveAccountId = exampleAccount.Id,
    ///             KeyVaultKeyId = exampleKey.Id,
    ///             IdentityClientId = exampleUserAssignedIdentity.ClientId,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Customer Managed Keys for a Cognitive Account can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:cognitive/accountCustomerManagedKey:AccountCustomerManagedKey example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.CognitiveServices/accounts/account1
    /// ```
    /// </summary>
    [AzureResourceType("azure:cognitive/accountCustomerManagedKey:AccountCustomerManagedKey")]
    public partial class AccountCustomerManagedKey : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Cognitive Account. Changing this forces a new resource to be created.
        /// </summary>
        [Output("cognitiveAccountId")]
        public Output<string> CognitiveAccountId { get; private set; } = null!;

        /// <summary>
        /// The Client ID of the User Assigned Identity that has access to the key. This property only needs to be specified when there're multiple identities attached to the Cognitive Account.
        /// </summary>
        [Output("identityClientId")]
        public Output<string?> IdentityClientId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Key Vault Key which should be used to Encrypt the data in this Cognitive Account.
        /// </summary>
        [Output("keyVaultKeyId")]
        public Output<string> KeyVaultKeyId { get; private set; } = null!;


        /// <summary>
        /// Create a AccountCustomerManagedKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountCustomerManagedKey(string name, AccountCustomerManagedKeyArgs args, CustomResourceOptions? options = null)
            : base("azure:cognitive/accountCustomerManagedKey:AccountCustomerManagedKey", name, args ?? new AccountCustomerManagedKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountCustomerManagedKey(string name, Input<string> id, AccountCustomerManagedKeyState? state = null, CustomResourceOptions? options = null)
            : base("azure:cognitive/accountCustomerManagedKey:AccountCustomerManagedKey", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccountCustomerManagedKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountCustomerManagedKey Get(string name, Input<string> id, AccountCustomerManagedKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountCustomerManagedKey(name, id, state, options);
        }
    }

    public sealed class AccountCustomerManagedKeyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Cognitive Account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("cognitiveAccountId", required: true)]
        public Input<string> CognitiveAccountId { get; set; } = null!;

        /// <summary>
        /// The Client ID of the User Assigned Identity that has access to the key. This property only needs to be specified when there're multiple identities attached to the Cognitive Account.
        /// </summary>
        [Input("identityClientId")]
        public Input<string>? IdentityClientId { get; set; }

        /// <summary>
        /// The ID of the Key Vault Key which should be used to Encrypt the data in this Cognitive Account.
        /// </summary>
        [Input("keyVaultKeyId", required: true)]
        public Input<string> KeyVaultKeyId { get; set; } = null!;

        public AccountCustomerManagedKeyArgs()
        {
        }
    }

    public sealed class AccountCustomerManagedKeyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Cognitive Account. Changing this forces a new resource to be created.
        /// </summary>
        [Input("cognitiveAccountId")]
        public Input<string>? CognitiveAccountId { get; set; }

        /// <summary>
        /// The Client ID of the User Assigned Identity that has access to the key. This property only needs to be specified when there're multiple identities attached to the Cognitive Account.
        /// </summary>
        [Input("identityClientId")]
        public Input<string>? IdentityClientId { get; set; }

        /// <summary>
        /// The ID of the Key Vault Key which should be used to Encrypt the data in this Cognitive Account.
        /// </summary>
        [Input("keyVaultKeyId")]
        public Input<string>? KeyVaultKeyId { get; set; }

        public AccountCustomerManagedKeyState()
        {
        }
    }
}