// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.KeyVault.Inputs
{

    public sealed class ManagedHardwareSecurityModuleRoleDefinitionPermissionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<string>? _actions;

        /// <summary>
        /// One or more Allowed Actions, such as `*`, `Microsoft.Resources/subscriptions/resourceGroups/read`. See ['Azure Resource Manager resource provider operations'](https://docs.microsoft.com/azure/role-based-access-control/resource-provider-operations) for details.
        /// </summary>
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        [Input("dataActions")]
        private InputList<string>? _dataActions;

        /// <summary>
        /// Specifies a list of data action permission to grant. Possible values are `Microsoft.KeyVault/managedHsm/keys/read/action`, `Microsoft.KeyVault/managedHsm/keys/write/action`, `Microsoft.KeyVault/managedHsm/keys/deletedKeys/read/action`, `Microsoft.KeyVault/managedHsm/keys/deletedKeys/recover/action`, `Microsoft.KeyVault/managedHsm/keys/backup/action`, `Microsoft.KeyVault/managedHsm/keys/restore/action`, `Microsoft.KeyVault/managedHsm/roleAssignments/delete/action`, `Microsoft.KeyVault/managedHsm/roleAssignments/read/action`, `Microsoft.KeyVault/managedHsm/roleAssignments/write/action`, `Microsoft.KeyVault/managedHsm/roleDefinitions/read/action`, `Microsoft.KeyVault/managedHsm/roleDefinitions/write/action`, `Microsoft.KeyVault/managedHsm/roleDefinitions/delete/action`, `Microsoft.KeyVault/managedHsm/keys/encrypt/action`, `Microsoft.KeyVault/managedHsm/keys/decrypt/action`, `Microsoft.KeyVault/managedHsm/keys/wrap/action`, `Microsoft.KeyVault/managedHsm/keys/unwrap/action`, `Microsoft.KeyVault/managedHsm/keys/sign/action`, `Microsoft.KeyVault/managedHsm/keys/verify/action`, `Microsoft.KeyVault/managedHsm/keys/create`, `Microsoft.KeyVault/managedHsm/keys/delete`, `Microsoft.KeyVault/managedHsm/keys/export/action`, `Microsoft.KeyVault/managedHsm/keys/release/action`, `Microsoft.KeyVault/managedHsm/keys/import/action`, `Microsoft.KeyVault/managedHsm/keys/deletedKeys/delete`, `Microsoft.KeyVault/managedHsm/securitydomain/download/action`, `Microsoft.KeyVault/managedHsm/securitydomain/download/read`, `Microsoft.KeyVault/managedHsm/securitydomain/upload/action`, `Microsoft.KeyVault/managedHsm/securitydomain/upload/read`, `Microsoft.KeyVault/managedHsm/securitydomain/transferkey/read`, `Microsoft.KeyVault/managedHsm/backup/start/action`, `Microsoft.KeyVault/managedHsm/restore/start/action`, `Microsoft.KeyVault/managedHsm/backup/status/action`, `Microsoft.KeyVault/managedHsm/restore/status/action` and `Microsoft.KeyVault/managedHsm/rng/action`.
        /// </summary>
        public InputList<string> DataActions
        {
            get => _dataActions ?? (_dataActions = new InputList<string>());
            set => _dataActions = value;
        }

        [Input("notActions")]
        private InputList<string>? _notActions;

        /// <summary>
        /// One or more Disallowed Actions, such as `*`, `Microsoft.Resources/subscriptions/resourceGroups/read`. See ['Azure Resource Manager resource provider operations'](https://docs.microsoft.com/azure/role-based-access-control/resource-provider-operations) for details.
        /// </summary>
        public InputList<string> NotActions
        {
            get => _notActions ?? (_notActions = new InputList<string>());
            set => _notActions = value;
        }

        [Input("notDataActions")]
        private InputList<string>? _notDataActions;

        /// <summary>
        /// Specifies a list of data action permission not to grant. Possible values are `Microsoft.KeyVault/managedHsm/keys/read/action`, `Microsoft.KeyVault/managedHsm/keys/write/action`, `Microsoft.KeyVault/managedHsm/keys/deletedKeys/read/action`, `Microsoft.KeyVault/managedHsm/keys/deletedKeys/recover/action`, `Microsoft.KeyVault/managedHsm/keys/backup/action`, `Microsoft.KeyVault/managedHsm/keys/restore/action`, `Microsoft.KeyVault/managedHsm/roleAssignments/delete/action`, `Microsoft.KeyVault/managedHsm/roleAssignments/read/action`, `Microsoft.KeyVault/managedHsm/roleAssignments/write/action`, `Microsoft.KeyVault/managedHsm/roleDefinitions/read/action`, `Microsoft.KeyVault/managedHsm/roleDefinitions/write/action`, `Microsoft.KeyVault/managedHsm/roleDefinitions/delete/action`, `Microsoft.KeyVault/managedHsm/keys/encrypt/action`, `Microsoft.KeyVault/managedHsm/keys/decrypt/action`, `Microsoft.KeyVault/managedHsm/keys/wrap/action`, `Microsoft.KeyVault/managedHsm/keys/unwrap/action`, `Microsoft.KeyVault/managedHsm/keys/sign/action`, `Microsoft.KeyVault/managedHsm/keys/verify/action`, `Microsoft.KeyVault/managedHsm/keys/create`, `Microsoft.KeyVault/managedHsm/keys/delete`, `Microsoft.KeyVault/managedHsm/keys/export/action`, `Microsoft.KeyVault/managedHsm/keys/release/action`, `Microsoft.KeyVault/managedHsm/keys/import/action`, `Microsoft.KeyVault/managedHsm/keys/deletedKeys/delete`, `Microsoft.KeyVault/managedHsm/securitydomain/download/action`, `Microsoft.KeyVault/managedHsm/securitydomain/download/read`, `Microsoft.KeyVault/managedHsm/securitydomain/upload/action`, `Microsoft.KeyVault/managedHsm/securitydomain/upload/read`, `Microsoft.KeyVault/managedHsm/securitydomain/transferkey/read`, `Microsoft.KeyVault/managedHsm/backup/start/action`, `Microsoft.KeyVault/managedHsm/restore/start/action`, `Microsoft.KeyVault/managedHsm/backup/status/action`, `Microsoft.KeyVault/managedHsm/restore/status/action` and `Microsoft.KeyVault/managedHsm/rng/action`.
        /// </summary>
        public InputList<string> NotDataActions
        {
            get => _notDataActions ?? (_notDataActions = new InputList<string>());
            set => _notDataActions = value;
        }

        public ManagedHardwareSecurityModuleRoleDefinitionPermissionGetArgs()
        {
        }
        public static new ManagedHardwareSecurityModuleRoleDefinitionPermissionGetArgs Empty => new ManagedHardwareSecurityModuleRoleDefinitionPermissionGetArgs();
    }
}