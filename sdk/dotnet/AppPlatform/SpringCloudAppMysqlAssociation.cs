// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.AppPlatform
{
    /// <summary>
    /// Associates a Spring Cloud Application with a MySQL Database.
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
    ///         var exampleResourceGroup = new Azure.Core.ResourceGroup("exampleResourceGroup", new Azure.Core.ResourceGroupArgs
    ///         {
    ///             Location = "West Europe",
    ///         });
    ///         var exampleSpringCloudService = new Azure.AppPlatform.SpringCloudService("exampleSpringCloudService", new Azure.AppPlatform.SpringCloudServiceArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             Location = exampleResourceGroup.Location,
    ///         });
    ///         var exampleSpringCloudApp = new Azure.AppPlatform.SpringCloudApp("exampleSpringCloudApp", new Azure.AppPlatform.SpringCloudAppArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             ServiceName = exampleSpringCloudService.Name,
    ///         });
    ///         var exampleServer = new Azure.MySql.Server("exampleServer", new Azure.MySql.ServerArgs
    ///         {
    ///             Location = exampleResourceGroup.Location,
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             AdministratorLogin = "mysqladminun",
    ///             AdministratorLoginPassword = "H@Sh1CoR3!",
    ///             SkuName = "B_Gen5_2",
    ///             StorageMb = 5120,
    ///             Version = "5.7",
    ///             SslEnforcementEnabled = true,
    ///             SslMinimalTlsVersionEnforced = "TLS1_2",
    ///         });
    ///         var exampleDatabase = new Azure.MySql.Database("exampleDatabase", new Azure.MySql.DatabaseArgs
    ///         {
    ///             ResourceGroupName = exampleResourceGroup.Name,
    ///             ServerName = exampleServer.Name,
    ///             Charset = "utf8",
    ///             Collation = "utf8_unicode_ci",
    ///         });
    ///         var exampleSpringCloudAppMysqlAssociation = new Azure.AppPlatform.SpringCloudAppMysqlAssociation("exampleSpringCloudAppMysqlAssociation", new Azure.AppPlatform.SpringCloudAppMysqlAssociationArgs
    ///         {
    ///             SpringCloudAppId = exampleSpringCloudApp.Id,
    ///             MysqlServerId = exampleServer.Id,
    ///             DatabaseName = exampleDatabase.Name,
    ///             Username = exampleServer.AdministratorLogin,
    ///             Password = exampleServer.AdministratorLoginPassword,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Spring Cloud Application MySQL Association can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:appplatform/springCloudAppMysqlAssociation:SpringCloudAppMysqlAssociation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.AppPlatform/Spring/service1/apps/app1/bindings/bind1
    /// ```
    /// </summary>
    [AzureResourceType("azure:appplatform/springCloudAppMysqlAssociation:SpringCloudAppMysqlAssociation")]
    public partial class SpringCloudAppMysqlAssociation : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the name of the MySQL Database which the Spring Cloud App should be associated with.
        /// </summary>
        [Output("databaseName")]
        public Output<string> DatabaseName { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the MySQL Server. Changing this forces a new resource to be created.
        /// </summary>
        [Output("mysqlServerId")]
        public Output<string> MysqlServerId { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the password which should be used when connecting to the MySQL Database from the Spring Cloud App.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// Specifies the ID of the Spring Cloud Application where this Association is created. Changing this forces a new resource to be created.
        /// </summary>
        [Output("springCloudAppId")]
        public Output<string> SpringCloudAppId { get; private set; } = null!;

        /// <summary>
        /// Specifies the username which should be used when connecting to the MySQL Database from the Spring Cloud App.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a SpringCloudAppMysqlAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SpringCloudAppMysqlAssociation(string name, SpringCloudAppMysqlAssociationArgs args, CustomResourceOptions? options = null)
            : base("azure:appplatform/springCloudAppMysqlAssociation:SpringCloudAppMysqlAssociation", name, args ?? new SpringCloudAppMysqlAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SpringCloudAppMysqlAssociation(string name, Input<string> id, SpringCloudAppMysqlAssociationState? state = null, CustomResourceOptions? options = null)
            : base("azure:appplatform/springCloudAppMysqlAssociation:SpringCloudAppMysqlAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SpringCloudAppMysqlAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SpringCloudAppMysqlAssociation Get(string name, Input<string> id, SpringCloudAppMysqlAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new SpringCloudAppMysqlAssociation(name, id, state, options);
        }
    }

    public sealed class SpringCloudAppMysqlAssociationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the MySQL Database which the Spring Cloud App should be associated with.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// Specifies the ID of the MySQL Server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("mysqlServerId", required: true)]
        public Input<string> MysqlServerId { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the password which should be used when connecting to the MySQL Database from the Spring Cloud App.
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        /// <summary>
        /// Specifies the ID of the Spring Cloud Application where this Association is created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("springCloudAppId", required: true)]
        public Input<string> SpringCloudAppId { get; set; } = null!;

        /// <summary>
        /// Specifies the username which should be used when connecting to the MySQL Database from the Spring Cloud App.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public SpringCloudAppMysqlAssociationArgs()
        {
        }
    }

    public sealed class SpringCloudAppMysqlAssociationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the MySQL Database which the Spring Cloud App should be associated with.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// Specifies the ID of the MySQL Server. Changing this forces a new resource to be created.
        /// </summary>
        [Input("mysqlServerId")]
        public Input<string>? MysqlServerId { get; set; }

        /// <summary>
        /// Specifies the name of the Spring Cloud Application Association. Changing this forces a new resource to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the password which should be used when connecting to the MySQL Database from the Spring Cloud App.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// Specifies the ID of the Spring Cloud Application where this Association is created. Changing this forces a new resource to be created.
        /// </summary>
        [Input("springCloudAppId")]
        public Input<string>? SpringCloudAppId { get; set; }

        /// <summary>
        /// Specifies the username which should be used when connecting to the MySQL Database from the Spring Cloud App.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public SpringCloudAppMysqlAssociationState()
        {
        }
    }
}