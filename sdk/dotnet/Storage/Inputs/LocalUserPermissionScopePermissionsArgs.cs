// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Storage.Inputs
{

    public sealed class LocalUserPermissionScopePermissionsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies if the Local User has the create permission for this scope. Defaults to `false`.
        /// </summary>
        [Input("create")]
        public Input<bool>? Create { get; set; }

        /// <summary>
        /// Specifies if the Local User has the delete permission for this scope. Defaults to `false`.
        /// </summary>
        [Input("delete")]
        public Input<bool>? Delete { get; set; }

        /// <summary>
        /// Specifies if the Local User has the list permission for this scope. Defaults to `false`.
        /// </summary>
        [Input("list")]
        public Input<bool>? List { get; set; }

        /// <summary>
        /// Specifies if the Local User has the read permission for this scope. Defaults to `false`.
        /// </summary>
        [Input("read")]
        public Input<bool>? Read { get; set; }

        /// <summary>
        /// Specifies if the Local User has the write permission for this scope. Defaults to `false`.
        /// </summary>
        [Input("write")]
        public Input<bool>? Write { get; set; }

        public LocalUserPermissionScopePermissionsArgs()
        {
        }
        public static new LocalUserPermissionScopePermissionsArgs Empty => new LocalUserPermissionScopePermissionsArgs();
    }
}