# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetConfigurationKeysResult',
    'AwaitableGetConfigurationKeysResult',
    'get_configuration_keys',
    'get_configuration_keys_output',
]

@pulumi.output_type
class GetConfigurationKeysResult:
    """
    A collection of values returned by getConfigurationKeys.
    """
    def __init__(__self__, configuration_store_id=None, id=None, items=None, key=None, label=None):
        if configuration_store_id and not isinstance(configuration_store_id, str):
            raise TypeError("Expected argument 'configuration_store_id' to be a str")
        pulumi.set(__self__, "configuration_store_id", configuration_store_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if items and not isinstance(items, list):
            raise TypeError("Expected argument 'items' to be a list")
        pulumi.set(__self__, "items", items)
        if key and not isinstance(key, str):
            raise TypeError("Expected argument 'key' to be a str")
        pulumi.set(__self__, "key", key)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)

    @property
    @pulumi.getter(name="configurationStoreId")
    def configuration_store_id(self) -> str:
        return pulumi.get(self, "configuration_store_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def items(self) -> Sequence['outputs.GetConfigurationKeysItemResult']:
        """
        A list of `items` blocks as defined below.
        """
        return pulumi.get(self, "items")

    @property
    @pulumi.getter
    def key(self) -> Optional[str]:
        """
        The name of the App Configuration Key.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def label(self) -> Optional[str]:
        """
        The label of the App Configuration Key.
        """
        return pulumi.get(self, "label")


class AwaitableGetConfigurationKeysResult(GetConfigurationKeysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConfigurationKeysResult(
            configuration_store_id=self.configuration_store_id,
            id=self.id,
            items=self.items,
            key=self.key,
            label=self.label)


def get_configuration_keys(configuration_store_id: Optional[str] = None,
                           key: Optional[str] = None,
                           label: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConfigurationKeysResult:
    """
    Use this data source to access information about existing Azure App Configuration Keys.

    > **Note:** App Configuration Keys are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    test = azure.appconfiguration.get_configuration_keys(configuration_store_id=azurerm_app_configuration["appconf"]["id"])
    pulumi.export("value", test.items)
    ```


    :param str configuration_store_id: Specifies the id of the App Configuration.
    :param str key: The name of the App Configuration Keys to look up.
    :param str label: The label of the App Configuration Keys tp look up.
    """
    __args__ = dict()
    __args__['configurationStoreId'] = configuration_store_id
    __args__['key'] = key
    __args__['label'] = label
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:appconfiguration/getConfigurationKeys:getConfigurationKeys', __args__, opts=opts, typ=GetConfigurationKeysResult).value

    return AwaitableGetConfigurationKeysResult(
        configuration_store_id=__ret__.configuration_store_id,
        id=__ret__.id,
        items=__ret__.items,
        key=__ret__.key,
        label=__ret__.label)


@_utilities.lift_output_func(get_configuration_keys)
def get_configuration_keys_output(configuration_store_id: Optional[pulumi.Input[str]] = None,
                                  key: Optional[pulumi.Input[Optional[str]]] = None,
                                  label: Optional[pulumi.Input[Optional[str]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConfigurationKeysResult]:
    """
    Use this data source to access information about existing Azure App Configuration Keys.

    > **Note:** App Configuration Keys are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    test = azure.appconfiguration.get_configuration_keys(configuration_store_id=azurerm_app_configuration["appconf"]["id"])
    pulumi.export("value", test.items)
    ```


    :param str configuration_store_id: Specifies the id of the App Configuration.
    :param str key: The name of the App Configuration Keys to look up.
    :param str label: The label of the App Configuration Keys tp look up.
    """
    ...