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
    'FileSystemEncryptionKey',
    'FileSystemHsmSetting',
    'FileSystemIdentity',
    'FileSystemMaintenanceWindow',
]

@pulumi.output_type
class FileSystemEncryptionKey(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "keyUrl":
            suggest = "key_url"
        elif key == "sourceVaultId":
            suggest = "source_vault_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FileSystemEncryptionKey. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FileSystemEncryptionKey.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FileSystemEncryptionKey.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 key_url: str,
                 source_vault_id: str):
        """
        :param str key_url: The URL to the Key Vault Key used as the Encryption Key. This can be found as `id` on the `keyvault.Key` resource.
        :param str source_vault_id: The ID of the source Key Vault. This can be found as `id` on the `keyvault.KeyVault` resource.
        """
        pulumi.set(__self__, "key_url", key_url)
        pulumi.set(__self__, "source_vault_id", source_vault_id)

    @property
    @pulumi.getter(name="keyUrl")
    def key_url(self) -> str:
        """
        The URL to the Key Vault Key used as the Encryption Key. This can be found as `id` on the `keyvault.Key` resource.
        """
        return pulumi.get(self, "key_url")

    @property
    @pulumi.getter(name="sourceVaultId")
    def source_vault_id(self) -> str:
        """
        The ID of the source Key Vault. This can be found as `id` on the `keyvault.KeyVault` resource.
        """
        return pulumi.get(self, "source_vault_id")


@pulumi.output_type
class FileSystemHsmSetting(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "containerId":
            suggest = "container_id"
        elif key == "loggingContainerId":
            suggest = "logging_container_id"
        elif key == "importPrefix":
            suggest = "import_prefix"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FileSystemHsmSetting. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FileSystemHsmSetting.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FileSystemHsmSetting.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 container_id: str,
                 logging_container_id: str,
                 import_prefix: Optional[str] = None):
        """
        :param str container_id: The resource ID of the storage container that is used for hydrating the namespace and archiving from the namespace. Changing this forces a new resource to be created.
        :param str logging_container_id: The resource ID of the storage container that is used for logging events and errors. Changing this forces a new resource to be created.
        :param str import_prefix: The import prefix for the Azure Managed Lustre File System. Only blobs in the non-logging container that start with this path/prefix get hydrated into the cluster namespace. Changing this forces a new resource to be created.
               
               > **NOTE:** The roles `Contributor` and `Storage Blob Data Contributor` must be added to the Service Principal `HPC Cache Resource Provider` for the Storage Account. See official docs for more information.
        """
        pulumi.set(__self__, "container_id", container_id)
        pulumi.set(__self__, "logging_container_id", logging_container_id)
        if import_prefix is not None:
            pulumi.set(__self__, "import_prefix", import_prefix)

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> str:
        """
        The resource ID of the storage container that is used for hydrating the namespace and archiving from the namespace. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "container_id")

    @property
    @pulumi.getter(name="loggingContainerId")
    def logging_container_id(self) -> str:
        """
        The resource ID of the storage container that is used for logging events and errors. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "logging_container_id")

    @property
    @pulumi.getter(name="importPrefix")
    def import_prefix(self) -> Optional[str]:
        """
        The import prefix for the Azure Managed Lustre File System. Only blobs in the non-logging container that start with this path/prefix get hydrated into the cluster namespace. Changing this forces a new resource to be created.

        > **NOTE:** The roles `Contributor` and `Storage Blob Data Contributor` must be added to the Service Principal `HPC Cache Resource Provider` for the Storage Account. See official docs for more information.
        """
        return pulumi.get(self, "import_prefix")


@pulumi.output_type
class FileSystemIdentity(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "identityIds":
            suggest = "identity_ids"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FileSystemIdentity. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FileSystemIdentity.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FileSystemIdentity.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 identity_ids: Sequence[str],
                 type: str):
        """
        :param Sequence[str] identity_ids: A list of User Assigned Managed Identity IDs to be assigned to this Azure Managed Lustre File System. Changing this forces a new resource to be created.
        :param str type: The type of Managed Service Identity that should be configured on this Azure Managed Lustre File System. Only possible value is `UserAssigned`. Changing this forces a new resource to be created.
        """
        pulumi.set(__self__, "identity_ids", identity_ids)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="identityIds")
    def identity_ids(self) -> Sequence[str]:
        """
        A list of User Assigned Managed Identity IDs to be assigned to this Azure Managed Lustre File System. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "identity_ids")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of Managed Service Identity that should be configured on this Azure Managed Lustre File System. Only possible value is `UserAssigned`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class FileSystemMaintenanceWindow(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "dayOfWeek":
            suggest = "day_of_week"
        elif key == "timeOfDayInUtc":
            suggest = "time_of_day_in_utc"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in FileSystemMaintenanceWindow. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        FileSystemMaintenanceWindow.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        FileSystemMaintenanceWindow.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 day_of_week: str,
                 time_of_day_in_utc: str):
        """
        :param str day_of_week: The day of the week on which the maintenance window will occur. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
        """
        pulumi.set(__self__, "day_of_week", day_of_week)
        pulumi.set(__self__, "time_of_day_in_utc", time_of_day_in_utc)

    @property
    @pulumi.getter(name="dayOfWeek")
    def day_of_week(self) -> str:
        """
        The day of the week on which the maintenance window will occur. Possible values are `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` and `Saturday`.
        """
        return pulumi.get(self, "day_of_week")

    @property
    @pulumi.getter(name="timeOfDayInUtc")
    def time_of_day_in_utc(self) -> str:
        return pulumi.get(self, "time_of_day_in_utc")

