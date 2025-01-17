// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.SignalR
{
    /// <summary>
    /// Manages an Azure SignalR Custom Domain.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System;
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// 
    /// 	
    /// string ReadFileBase64(string path) 
    /// {
    ///     return Convert.ToBase64String(Encoding.UTF8.GetBytes(File.ReadAllText(path)));
    /// }
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Azure.Core.GetClientConfig.Invoke();
    /// 
    ///     var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new()
    ///     {
    ///         Location = "West Europe",
    ///     });
    /// 
    ///     var exampleService = new Azure.SignalR.Service("exampleService", new()
    ///     {
    ///         Location = azurerm_resource_group.Test.Location,
    ///         ResourceGroupName = azurerm_resource_group.Test.Name,
    ///         Sku = new Azure.SignalR.Inputs.ServiceSkuArgs
    ///         {
    ///             Name = "Premium_P1",
    ///             Capacity = 1,
    ///         },
    ///         Identity = new Azure.SignalR.Inputs.ServiceIdentityArgs
    ///         {
    ///             Type = "SystemAssigned",
    ///         },
    ///     });
    /// 
    ///     var exampleKeyVault = new Azure.KeyVault.KeyVault("exampleKeyVault", new()
    ///     {
    ///         Location = exampleResourceGroup.Location,
    ///         ResourceGroupName = exampleResourceGroup.Name,
    ///         TenantId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.TenantId),
    ///         SkuName = "premium",
    ///         AccessPolicies = new[]
    ///         {
    ///             new Azure.KeyVault.Inputs.KeyVaultAccessPolicyArgs
    ///             {
    ///                 TenantId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.TenantId),
    ///                 ObjectId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.ObjectId),
    ///                 CertificatePermissions = new[]
    ///                 {
    ///                     "Create",
    ///                     "Get",
    ///                     "List",
    ///                 },
    ///                 SecretPermissions = new[]
    ///                 {
    ///                     "Get",
    ///                     "List",
    ///                 },
    ///             },
    ///             new Azure.KeyVault.Inputs.KeyVaultAccessPolicyArgs
    ///             {
    ///                 TenantId = current.Apply(getClientConfigResult =&gt; getClientConfigResult.TenantId),
    ///                 ObjectId = azurerm_signalr_service.Test.Identity[0].Principal_id,
    ///                 CertificatePermissions = new[]
    ///                 {
    ///                     "Create",
    ///                     "Get",
    ///                     "List",
    ///                 },
    ///                 SecretPermissions = new[]
    ///                 {
    ///                     "Get",
    ///                     "List",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleCertificate = new Azure.KeyVault.Certificate("exampleCertificate", new()
    ///     {
    ///         KeyVaultId = exampleKeyVault.Id,
    ///         KeyVaultCertificate = new Azure.KeyVault.Inputs.CertificateCertificateArgs
    ///         {
    ///             Contents = ReadFileBase64("certificate-to-import.pfx"),
    ///             Password = "",
    ///         },
    ///     });
    /// 
    ///     var testServiceCustomCertificate = new Azure.SignalR.ServiceCustomCertificate("testServiceCustomCertificate", new()
    ///     {
    ///         SignalrServiceId = exampleService.Id,
    ///         CustomCertificateId = exampleCertificate.Id,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             azurerm_key_vault_access_policy.Example,
    ///         },
    ///     });
    /// 
    ///     var testServiceCustomDomain = new Azure.SignalR.ServiceCustomDomain("testServiceCustomDomain", new()
    ///     {
    ///         SignalrServiceId = azurerm_signalr_service.Test.Id,
    ///         DomainName = "tftest.com",
    ///         SignalrCustomCertificateId = testServiceCustomCertificate.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Custom Domain for a SignalR service can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:signalr/serviceCustomDomain:ServiceCustomDomain example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.SignalRService/signalR/signalr1/customDomains/customDomain1
    /// ```
    /// </summary>
    [AzureResourceType("azure:signalr/serviceCustomDomain:ServiceCustomDomain")]
    public partial class ServiceCustomDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the custom domain name of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// 
        /// &gt; **NOTE:** Please ensure the custom domain name is included in the Subject Alternative Names of the selected SignalR Custom Certificate.
        /// </summary>
        [Output("domainName")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the SignalR Custom Certificate ID of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Output("signalrCustomCertificateId")]
        public Output<string> SignalrCustomCertificateId { get; private set; } = null!;

        /// <summary>
        /// Specifies the SignalR ID of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Output("signalrServiceId")]
        public Output<string> SignalrServiceId { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceCustomDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceCustomDomain(string name, ServiceCustomDomainArgs args, CustomResourceOptions? options = null)
            : base("azure:signalr/serviceCustomDomain:ServiceCustomDomain", name, args ?? new ServiceCustomDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceCustomDomain(string name, Input<string> id, ServiceCustomDomainState? state = null, CustomResourceOptions? options = null)
            : base("azure:signalr/serviceCustomDomain:ServiceCustomDomain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceCustomDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceCustomDomain Get(string name, Input<string> id, ServiceCustomDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceCustomDomain(name, id, state, options);
        }
    }

    public sealed class ServiceCustomDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the custom domain name of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// 
        /// &gt; **NOTE:** Please ensure the custom domain name is included in the Subject Alternative Names of the selected SignalR Custom Certificate.
        /// </summary>
        [Input("domainName", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the SignalR Custom Certificate ID of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("signalrCustomCertificateId", required: true)]
        public Input<string> SignalrCustomCertificateId { get; set; } = null!;

        /// <summary>
        /// Specifies the SignalR ID of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("signalrServiceId", required: true)]
        public Input<string> SignalrServiceId { get; set; } = null!;

        public ServiceCustomDomainArgs()
        {
        }
        public static new ServiceCustomDomainArgs Empty => new ServiceCustomDomainArgs();
    }

    public sealed class ServiceCustomDomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the custom domain name of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// 
        /// &gt; **NOTE:** Please ensure the custom domain name is included in the Subject Alternative Names of the selected SignalR Custom Certificate.
        /// </summary>
        [Input("domainName")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// Specifies the name of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the SignalR Custom Certificate ID of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("signalrCustomCertificateId")]
        public Input<string>? SignalrCustomCertificateId { get; set; }

        /// <summary>
        /// Specifies the SignalR ID of the SignalR Custom Domain. Changing this forces a new resource to be created.
        /// </summary>
        [Input("signalrServiceId")]
        public Input<string>? SignalrServiceId { get; set; }

        public ServiceCustomDomainState()
        {
        }
        public static new ServiceCustomDomainState Empty => new ServiceCustomDomainState();
    }
}
