# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetCertificatesResult',
    'AwaitableGetCertificatesResult',
    'get_certificates',
    'get_certificates_output',
]

@pulumi.output_type
class GetCertificatesResult:
    """
    A collection of values returned by getCertificates.
    """
    def __init__(__self__, id=None, include_pending=None, key_vault_id=None, names=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if include_pending and not isinstance(include_pending, bool):
            raise TypeError("Expected argument 'include_pending' to be a bool")
        pulumi.set(__self__, "include_pending", include_pending)
        if key_vault_id and not isinstance(key_vault_id, str):
            raise TypeError("Expected argument 'key_vault_id' to be a str")
        pulumi.set(__self__, "key_vault_id", key_vault_id)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="includePending")
    def include_pending(self) -> Optional[bool]:
        return pulumi.get(self, "include_pending")

    @property
    @pulumi.getter(name="keyVaultId")
    def key_vault_id(self) -> str:
        """
        The Key Vault ID.
        """
        return pulumi.get(self, "key_vault_id")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        List containing names of certificates that exist in this Key Vault.
        """
        return pulumi.get(self, "names")


class AwaitableGetCertificatesResult(GetCertificatesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCertificatesResult(
            id=self.id,
            include_pending=self.include_pending,
            key_vault_id=self.key_vault_id,
            names=self.names)


def get_certificates(include_pending: Optional[bool] = None,
                     key_vault_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCertificatesResult:
    """
    Use this data source to retrieve a list of certificate names from an existing Key Vault.


    :param bool include_pending: Specifies whether to include certificates which are not completely provisioned. Defaults to true.
    :param str key_vault_id: Specifies the ID of the Key Vault instance to fetch certificate names from, available on the `keyvault.KeyVault` Data Source / Resource.
    """
    __args__ = dict()
    __args__['includePending'] = include_pending
    __args__['keyVaultId'] = key_vault_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:keyvault/getCertificates:getCertificates', __args__, opts=opts, typ=GetCertificatesResult).value

    return AwaitableGetCertificatesResult(
        id=__ret__.id,
        include_pending=__ret__.include_pending,
        key_vault_id=__ret__.key_vault_id,
        names=__ret__.names)


@_utilities.lift_output_func(get_certificates)
def get_certificates_output(include_pending: Optional[pulumi.Input[Optional[bool]]] = None,
                            key_vault_id: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCertificatesResult]:
    """
    Use this data source to retrieve a list of certificate names from an existing Key Vault.


    :param bool include_pending: Specifies whether to include certificates which are not completely provisioned. Defaults to true.
    :param str key_vault_id: Specifies the ID of the Key Vault instance to fetch certificate names from, available on the `keyvault.KeyVault` Data Source / Resource.
    """
    ...