# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ManagedStorageAccountSasTokenDefinitionArgs', 'ManagedStorageAccountSasTokenDefinition']

@pulumi.input_type
class ManagedStorageAccountSasTokenDefinitionArgs:
    def __init__(__self__, *,
                 managed_storage_account_id: pulumi.Input[str],
                 sas_template_uri: pulumi.Input[str],
                 sas_type: pulumi.Input[str],
                 validity_period: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ManagedStorageAccountSasTokenDefinition resource.
        :param pulumi.Input[str] managed_storage_account_id: The ID of the Managed Storage Account.
        :param pulumi.Input[str] sas_template_uri: The SAS definition token template signed with an arbitrary key. Tokens created according to the SAS definition will have the same properties as the template, but regenerated with a new validity period.
        :param pulumi.Input[str] sas_type: The type of SAS token the SAS definition will create. Possible values are `account` and `service`.
        :param pulumi.Input[str] validity_period: Validity period of SAS token. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
        :param pulumi.Input[str] name: The name which should be used for this SAS Definition.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the SAS Definition.
        """
        pulumi.set(__self__, "managed_storage_account_id", managed_storage_account_id)
        pulumi.set(__self__, "sas_template_uri", sas_template_uri)
        pulumi.set(__self__, "sas_type", sas_type)
        pulumi.set(__self__, "validity_period", validity_period)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="managedStorageAccountId")
    def managed_storage_account_id(self) -> pulumi.Input[str]:
        """
        The ID of the Managed Storage Account.
        """
        return pulumi.get(self, "managed_storage_account_id")

    @managed_storage_account_id.setter
    def managed_storage_account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "managed_storage_account_id", value)

    @property
    @pulumi.getter(name="sasTemplateUri")
    def sas_template_uri(self) -> pulumi.Input[str]:
        """
        The SAS definition token template signed with an arbitrary key. Tokens created according to the SAS definition will have the same properties as the template, but regenerated with a new validity period.
        """
        return pulumi.get(self, "sas_template_uri")

    @sas_template_uri.setter
    def sas_template_uri(self, value: pulumi.Input[str]):
        pulumi.set(self, "sas_template_uri", value)

    @property
    @pulumi.getter(name="sasType")
    def sas_type(self) -> pulumi.Input[str]:
        """
        The type of SAS token the SAS definition will create. Possible values are `account` and `service`.
        """
        return pulumi.get(self, "sas_type")

    @sas_type.setter
    def sas_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "sas_type", value)

    @property
    @pulumi.getter(name="validityPeriod")
    def validity_period(self) -> pulumi.Input[str]:
        """
        Validity period of SAS token. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
        """
        return pulumi.get(self, "validity_period")

    @validity_period.setter
    def validity_period(self, value: pulumi.Input[str]):
        pulumi.set(self, "validity_period", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this SAS Definition.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags which should be assigned to the SAS Definition.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ManagedStorageAccountSasTokenDefinitionState:
    def __init__(__self__, *,
                 managed_storage_account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sas_template_uri: Optional[pulumi.Input[str]] = None,
                 sas_type: Optional[pulumi.Input[str]] = None,
                 secret_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 validity_period: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ManagedStorageAccountSasTokenDefinition resources.
        :param pulumi.Input[str] managed_storage_account_id: The ID of the Managed Storage Account.
        :param pulumi.Input[str] name: The name which should be used for this SAS Definition.
        :param pulumi.Input[str] sas_template_uri: The SAS definition token template signed with an arbitrary key. Tokens created according to the SAS definition will have the same properties as the template, but regenerated with a new validity period.
        :param pulumi.Input[str] sas_type: The type of SAS token the SAS definition will create. Possible values are `account` and `service`.
        :param pulumi.Input[str] secret_id: The ID of the Secret that is created by Managed Storage Account SAS Definition.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the SAS Definition.
        :param pulumi.Input[str] validity_period: Validity period of SAS token. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
        """
        if managed_storage_account_id is not None:
            pulumi.set(__self__, "managed_storage_account_id", managed_storage_account_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if sas_template_uri is not None:
            pulumi.set(__self__, "sas_template_uri", sas_template_uri)
        if sas_type is not None:
            pulumi.set(__self__, "sas_type", sas_type)
        if secret_id is not None:
            pulumi.set(__self__, "secret_id", secret_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if validity_period is not None:
            pulumi.set(__self__, "validity_period", validity_period)

    @property
    @pulumi.getter(name="managedStorageAccountId")
    def managed_storage_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Managed Storage Account.
        """
        return pulumi.get(self, "managed_storage_account_id")

    @managed_storage_account_id.setter
    def managed_storage_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "managed_storage_account_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this SAS Definition.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="sasTemplateUri")
    def sas_template_uri(self) -> Optional[pulumi.Input[str]]:
        """
        The SAS definition token template signed with an arbitrary key. Tokens created according to the SAS definition will have the same properties as the template, but regenerated with a new validity period.
        """
        return pulumi.get(self, "sas_template_uri")

    @sas_template_uri.setter
    def sas_template_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sas_template_uri", value)

    @property
    @pulumi.getter(name="sasType")
    def sas_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of SAS token the SAS definition will create. Possible values are `account` and `service`.
        """
        return pulumi.get(self, "sas_type")

    @sas_type.setter
    def sas_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sas_type", value)

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Secret that is created by Managed Storage Account SAS Definition.
        """
        return pulumi.get(self, "secret_id")

    @secret_id.setter
    def secret_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags which should be assigned to the SAS Definition.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="validityPeriod")
    def validity_period(self) -> Optional[pulumi.Input[str]]:
        """
        Validity period of SAS token. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
        """
        return pulumi.get(self, "validity_period")

    @validity_period.setter
    def validity_period(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "validity_period", value)


class ManagedStorageAccountSasTokenDefinition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 managed_storage_account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sas_template_uri: Optional[pulumi.Input[str]] = None,
                 sas_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 validity_period: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Key Vault Managed Storage Account SAS Definition.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_client_config = azure.core.get_client_config()
        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_account_sas = example_account.primary_connection_string.apply(lambda primary_connection_string: azure.storage.get_account_sas(connection_string=primary_connection_string,
            https_only=True,
            resource_types=azure.storage.GetAccountSASResourceTypesArgs(
                service=True,
                container=False,
                object=False,
            ),
            services=azure.storage.GetAccountSASServicesArgs(
                blob=True,
                queue=False,
                table=False,
                file=False,
            ),
            start="2021-04-30T00:00:00Z",
            expiry="2023-04-30T00:00:00Z",
            permissions=azure.storage.GetAccountSASPermissionsArgs(
                read=True,
                write=True,
                delete=False,
                list=False,
                add=True,
                create=True,
                update=False,
                process=False,
            )))
        example_key_vault = azure.keyvault.KeyVault("exampleKeyVault",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            tenant_id=data["azurerm_client_config"]["current"]["tenant_id"],
            sku_name="standard",
            access_policies=[azure.keyvault.KeyVaultAccessPolicyArgs(
                tenant_id=data["azurerm_client_config"]["current"]["tenant_id"],
                object_id=data["azurerm_client_config"]["current"]["object_id"],
                secret_permissions=[
                    "Get",
                    "Delete",
                ],
                storage_permissions=[
                    "Get",
                    "List",
                    "Set",
                    "SetSAS",
                    "GetSAS",
                    "DeleteSAS",
                    "Update",
                    "RegenerateKey",
                ],
            )])
        test = azure.keyvault.ManagedStorageAccount("test",
            key_vault_id=example_key_vault.id,
            storage_account_id=example_account.id,
            storage_account_key="key1",
            regenerate_key_automatically=False,
            regeneration_period="P1D")
        example_managed_storage_account_sas_token_definition = azure.keyvault.ManagedStorageAccountSasTokenDefinition("exampleManagedStorageAccountSasTokenDefinition",
            validity_period="P1D",
            managed_storage_account_id=azurerm_key_vault_managed_storage_account["example"]["id"],
            sas_template_uri=example_account_sas.sas,
            sas_type="account")
        ```

        ## Import

        Key Vaults can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:keyvault/managedStorageAccountSasTokenDefinition:ManagedStorageAccountSasTokenDefinition example https://example-keyvault.vault.azure.net/storage/exampleStorageAcc01/sas/exampleSasDefinition01
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] managed_storage_account_id: The ID of the Managed Storage Account.
        :param pulumi.Input[str] name: The name which should be used for this SAS Definition.
        :param pulumi.Input[str] sas_template_uri: The SAS definition token template signed with an arbitrary key. Tokens created according to the SAS definition will have the same properties as the template, but regenerated with a new validity period.
        :param pulumi.Input[str] sas_type: The type of SAS token the SAS definition will create. Possible values are `account` and `service`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the SAS Definition.
        :param pulumi.Input[str] validity_period: Validity period of SAS token. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ManagedStorageAccountSasTokenDefinitionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Key Vault Managed Storage Account SAS Definition.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_client_config = azure.core.get_client_config()
        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_account = azure.storage.Account("exampleAccount",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            account_tier="Standard",
            account_replication_type="LRS")
        example_account_sas = example_account.primary_connection_string.apply(lambda primary_connection_string: azure.storage.get_account_sas(connection_string=primary_connection_string,
            https_only=True,
            resource_types=azure.storage.GetAccountSASResourceTypesArgs(
                service=True,
                container=False,
                object=False,
            ),
            services=azure.storage.GetAccountSASServicesArgs(
                blob=True,
                queue=False,
                table=False,
                file=False,
            ),
            start="2021-04-30T00:00:00Z",
            expiry="2023-04-30T00:00:00Z",
            permissions=azure.storage.GetAccountSASPermissionsArgs(
                read=True,
                write=True,
                delete=False,
                list=False,
                add=True,
                create=True,
                update=False,
                process=False,
            )))
        example_key_vault = azure.keyvault.KeyVault("exampleKeyVault",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            tenant_id=data["azurerm_client_config"]["current"]["tenant_id"],
            sku_name="standard",
            access_policies=[azure.keyvault.KeyVaultAccessPolicyArgs(
                tenant_id=data["azurerm_client_config"]["current"]["tenant_id"],
                object_id=data["azurerm_client_config"]["current"]["object_id"],
                secret_permissions=[
                    "Get",
                    "Delete",
                ],
                storage_permissions=[
                    "Get",
                    "List",
                    "Set",
                    "SetSAS",
                    "GetSAS",
                    "DeleteSAS",
                    "Update",
                    "RegenerateKey",
                ],
            )])
        test = azure.keyvault.ManagedStorageAccount("test",
            key_vault_id=example_key_vault.id,
            storage_account_id=example_account.id,
            storage_account_key="key1",
            regenerate_key_automatically=False,
            regeneration_period="P1D")
        example_managed_storage_account_sas_token_definition = azure.keyvault.ManagedStorageAccountSasTokenDefinition("exampleManagedStorageAccountSasTokenDefinition",
            validity_period="P1D",
            managed_storage_account_id=azurerm_key_vault_managed_storage_account["example"]["id"],
            sas_template_uri=example_account_sas.sas,
            sas_type="account")
        ```

        ## Import

        Key Vaults can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:keyvault/managedStorageAccountSasTokenDefinition:ManagedStorageAccountSasTokenDefinition example https://example-keyvault.vault.azure.net/storage/exampleStorageAcc01/sas/exampleSasDefinition01
        ```

        :param str resource_name: The name of the resource.
        :param ManagedStorageAccountSasTokenDefinitionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ManagedStorageAccountSasTokenDefinitionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 managed_storage_account_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 sas_template_uri: Optional[pulumi.Input[str]] = None,
                 sas_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 validity_period: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ManagedStorageAccountSasTokenDefinitionArgs.__new__(ManagedStorageAccountSasTokenDefinitionArgs)

            if managed_storage_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'managed_storage_account_id'")
            __props__.__dict__["managed_storage_account_id"] = managed_storage_account_id
            __props__.__dict__["name"] = name
            if sas_template_uri is None and not opts.urn:
                raise TypeError("Missing required property 'sas_template_uri'")
            __props__.__dict__["sas_template_uri"] = sas_template_uri
            if sas_type is None and not opts.urn:
                raise TypeError("Missing required property 'sas_type'")
            __props__.__dict__["sas_type"] = sas_type
            __props__.__dict__["tags"] = tags
            if validity_period is None and not opts.urn:
                raise TypeError("Missing required property 'validity_period'")
            __props__.__dict__["validity_period"] = validity_period
            __props__.__dict__["secret_id"] = None
        super(ManagedStorageAccountSasTokenDefinition, __self__).__init__(
            'azure:keyvault/managedStorageAccountSasTokenDefinition:ManagedStorageAccountSasTokenDefinition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            managed_storage_account_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            sas_template_uri: Optional[pulumi.Input[str]] = None,
            sas_type: Optional[pulumi.Input[str]] = None,
            secret_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            validity_period: Optional[pulumi.Input[str]] = None) -> 'ManagedStorageAccountSasTokenDefinition':
        """
        Get an existing ManagedStorageAccountSasTokenDefinition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] managed_storage_account_id: The ID of the Managed Storage Account.
        :param pulumi.Input[str] name: The name which should be used for this SAS Definition.
        :param pulumi.Input[str] sas_template_uri: The SAS definition token template signed with an arbitrary key. Tokens created according to the SAS definition will have the same properties as the template, but regenerated with a new validity period.
        :param pulumi.Input[str] sas_type: The type of SAS token the SAS definition will create. Possible values are `account` and `service`.
        :param pulumi.Input[str] secret_id: The ID of the Secret that is created by Managed Storage Account SAS Definition.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the SAS Definition.
        :param pulumi.Input[str] validity_period: Validity period of SAS token. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ManagedStorageAccountSasTokenDefinitionState.__new__(_ManagedStorageAccountSasTokenDefinitionState)

        __props__.__dict__["managed_storage_account_id"] = managed_storage_account_id
        __props__.__dict__["name"] = name
        __props__.__dict__["sas_template_uri"] = sas_template_uri
        __props__.__dict__["sas_type"] = sas_type
        __props__.__dict__["secret_id"] = secret_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["validity_period"] = validity_period
        return ManagedStorageAccountSasTokenDefinition(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="managedStorageAccountId")
    def managed_storage_account_id(self) -> pulumi.Output[str]:
        """
        The ID of the Managed Storage Account.
        """
        return pulumi.get(self, "managed_storage_account_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this SAS Definition.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="sasTemplateUri")
    def sas_template_uri(self) -> pulumi.Output[str]:
        """
        The SAS definition token template signed with an arbitrary key. Tokens created according to the SAS definition will have the same properties as the template, but regenerated with a new validity period.
        """
        return pulumi.get(self, "sas_template_uri")

    @property
    @pulumi.getter(name="sasType")
    def sas_type(self) -> pulumi.Output[str]:
        """
        The type of SAS token the SAS definition will create. Possible values are `account` and `service`.
        """
        return pulumi.get(self, "sas_type")

    @property
    @pulumi.getter(name="secretId")
    def secret_id(self) -> pulumi.Output[str]:
        """
        The ID of the Secret that is created by Managed Storage Account SAS Definition.
        """
        return pulumi.get(self, "secret_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of tags which should be assigned to the SAS Definition.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="validityPeriod")
    def validity_period(self) -> pulumi.Output[str]:
        """
        Validity period of SAS token. Value needs to be in [ISO 8601 duration format](https://en.wikipedia.org/wiki/ISO_8601#Durations).
        """
        return pulumi.get(self, "validity_period")
