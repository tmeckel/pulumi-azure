# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DatastoreBlobstorageArgs', 'DatastoreBlobstorage']

@pulumi.input_type
class DatastoreBlobstorageArgs:
    def __init__(__self__, *,
                 storage_container_id: pulumi.Input[str],
                 workspace_id: pulumi.Input[str],
                 account_key: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service_data_auth_identity: Optional[pulumi.Input[str]] = None,
                 shared_access_signature: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a DatastoreBlobstorage resource.
        :param pulumi.Input[str] storage_container_id: The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[str] workspace_id: The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[str] account_key: The access key of the Storage Account. Conflicts with `shared_access_signature`.
        :param pulumi.Input[str] description: Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[bool] is_default: Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[str] service_data_auth_identity: Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
        :param pulumi.Input[str] shared_access_signature: The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        """
        pulumi.set(__self__, "storage_container_id", storage_container_id)
        pulumi.set(__self__, "workspace_id", workspace_id)
        if account_key is not None:
            pulumi.set(__self__, "account_key", account_key)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if service_data_auth_identity is not None:
            pulumi.set(__self__, "service_data_auth_identity", service_data_auth_identity)
        if shared_access_signature is not None:
            pulumi.set(__self__, "shared_access_signature", shared_access_signature)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="storageContainerId")
    def storage_container_id(self) -> pulumi.Input[str]:
        """
        The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "storage_container_id")

    @storage_container_id.setter
    def storage_container_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "storage_container_id", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Input[str]:
        """
        The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "workspace_id", value)

    @property
    @pulumi.getter(name="accountKey")
    def account_key(self) -> Optional[pulumi.Input[str]]:
        """
        The access key of the Storage Account. Conflicts with `shared_access_signature`.
        """
        return pulumi.get(self, "account_key")

    @account_key.setter
    def account_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_key", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
        """
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_default", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="serviceDataAuthIdentity")
    def service_data_auth_identity(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
        """
        return pulumi.get(self, "service_data_auth_identity")

    @service_data_auth_identity.setter
    def service_data_auth_identity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_data_auth_identity", value)

    @property
    @pulumi.getter(name="sharedAccessSignature")
    def shared_access_signature(self) -> Optional[pulumi.Input[str]]:
        """
        The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
        """
        return pulumi.get(self, "shared_access_signature")

    @shared_access_signature.setter
    def shared_access_signature(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "shared_access_signature", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DatastoreBlobstorageState:
    def __init__(__self__, *,
                 account_key: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service_data_auth_identity: Optional[pulumi.Input[str]] = None,
                 shared_access_signature: Optional[pulumi.Input[str]] = None,
                 storage_container_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DatastoreBlobstorage resources.
        :param pulumi.Input[str] account_key: The access key of the Storage Account. Conflicts with `shared_access_signature`.
        :param pulumi.Input[str] description: Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[bool] is_default: Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[str] service_data_auth_identity: Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
        :param pulumi.Input[str] shared_access_signature: The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
        :param pulumi.Input[str] storage_container_id: The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[str] workspace_id: The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
        """
        if account_key is not None:
            pulumi.set(__self__, "account_key", account_key)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if service_data_auth_identity is not None:
            pulumi.set(__self__, "service_data_auth_identity", service_data_auth_identity)
        if shared_access_signature is not None:
            pulumi.set(__self__, "shared_access_signature", shared_access_signature)
        if storage_container_id is not None:
            pulumi.set(__self__, "storage_container_id", storage_container_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if workspace_id is not None:
            pulumi.set(__self__, "workspace_id", workspace_id)

    @property
    @pulumi.getter(name="accountKey")
    def account_key(self) -> Optional[pulumi.Input[str]]:
        """
        The access key of the Storage Account. Conflicts with `shared_access_signature`.
        """
        return pulumi.get(self, "account_key")

    @account_key.setter
    def account_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_key", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
        """
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_default", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="serviceDataAuthIdentity")
    def service_data_auth_identity(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
        """
        return pulumi.get(self, "service_data_auth_identity")

    @service_data_auth_identity.setter
    def service_data_auth_identity(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_data_auth_identity", value)

    @property
    @pulumi.getter(name="sharedAccessSignature")
    def shared_access_signature(self) -> Optional[pulumi.Input[str]]:
        """
        The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
        """
        return pulumi.get(self, "shared_access_signature")

    @shared_access_signature.setter
    def shared_access_signature(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "shared_access_signature", value)

    @property
    @pulumi.getter(name="storageContainerId")
    def storage_container_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "storage_container_id")

    @storage_container_id.setter
    def storage_container_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_container_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "workspace_id")

    @workspace_id.setter
    def workspace_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "workspace_id", value)


class DatastoreBlobstorage(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_key: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service_data_auth_identity: Optional[pulumi.Input[str]] = None,
                 shared_access_signature: Optional[pulumi.Input[str]] = None,
                 storage_container_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Machine Learning Blob Storage DataStore.

        ## Example Usage

        ## Import

        Machine Learning DataStores can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:machinelearning/datastoreBlobstorage:DatastoreBlobstorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.MachineLearningServices/workspaces/mlw1/datastores/datastore1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_key: The access key of the Storage Account. Conflicts with `shared_access_signature`.
        :param pulumi.Input[str] description: Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[bool] is_default: Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[str] service_data_auth_identity: Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
        :param pulumi.Input[str] shared_access_signature: The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
        :param pulumi.Input[str] storage_container_id: The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[str] workspace_id: The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatastoreBlobstorageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Machine Learning Blob Storage DataStore.

        ## Example Usage

        ## Import

        Machine Learning DataStores can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:machinelearning/datastoreBlobstorage:DatastoreBlobstorage example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.MachineLearningServices/workspaces/mlw1/datastores/datastore1
        ```

        :param str resource_name: The name of the resource.
        :param DatastoreBlobstorageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatastoreBlobstorageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_key: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 service_data_auth_identity: Optional[pulumi.Input[str]] = None,
                 shared_access_signature: Optional[pulumi.Input[str]] = None,
                 storage_container_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 workspace_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatastoreBlobstorageArgs.__new__(DatastoreBlobstorageArgs)

            __props__.__dict__["account_key"] = None if account_key is None else pulumi.Output.secret(account_key)
            __props__.__dict__["description"] = description
            __props__.__dict__["is_default"] = is_default
            __props__.__dict__["name"] = name
            __props__.__dict__["service_data_auth_identity"] = service_data_auth_identity
            __props__.__dict__["shared_access_signature"] = None if shared_access_signature is None else pulumi.Output.secret(shared_access_signature)
            if storage_container_id is None and not opts.urn:
                raise TypeError("Missing required property 'storage_container_id'")
            __props__.__dict__["storage_container_id"] = storage_container_id
            __props__.__dict__["tags"] = tags
            if workspace_id is None and not opts.urn:
                raise TypeError("Missing required property 'workspace_id'")
            __props__.__dict__["workspace_id"] = workspace_id
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["accountKey", "sharedAccessSignature"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(DatastoreBlobstorage, __self__).__init__(
            'azure:machinelearning/datastoreBlobstorage:DatastoreBlobstorage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_key: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            is_default: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            service_data_auth_identity: Optional[pulumi.Input[str]] = None,
            shared_access_signature: Optional[pulumi.Input[str]] = None,
            storage_container_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            workspace_id: Optional[pulumi.Input[str]] = None) -> 'DatastoreBlobstorage':
        """
        Get an existing DatastoreBlobstorage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_key: The access key of the Storage Account. Conflicts with `shared_access_signature`.
        :param pulumi.Input[str] description: Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[bool] is_default: Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
        :param pulumi.Input[str] name: The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[str] service_data_auth_identity: Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
        :param pulumi.Input[str] shared_access_signature: The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
        :param pulumi.Input[str] storage_container_id: The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        :param pulumi.Input[str] workspace_id: The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatastoreBlobstorageState.__new__(_DatastoreBlobstorageState)

        __props__.__dict__["account_key"] = account_key
        __props__.__dict__["description"] = description
        __props__.__dict__["is_default"] = is_default
        __props__.__dict__["name"] = name
        __props__.__dict__["service_data_auth_identity"] = service_data_auth_identity
        __props__.__dict__["shared_access_signature"] = shared_access_signature
        __props__.__dict__["storage_container_id"] = storage_container_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["workspace_id"] = workspace_id
        return DatastoreBlobstorage(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountKey")
    def account_key(self) -> pulumi.Output[Optional[str]]:
        """
        The access key of the Storage Account. Conflicts with `shared_access_signature`.
        """
        return pulumi.get(self, "account_key")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Text used to describe the asset. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether this Machines Learning DataStore is the default for the Workspace. Defaults to `false`.
        """
        return pulumi.get(self, "is_default")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="serviceDataAuthIdentity")
    def service_data_auth_identity(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies which identity to use when retrieving data from the specified source. Defaults to `None`. Possible values are `None`, `WorkspaceSystemAssignedIdentity` and `WorkspaceUserAssignedIdentity`.
        """
        return pulumi.get(self, "service_data_auth_identity")

    @property
    @pulumi.getter(name="sharedAccessSignature")
    def shared_access_signature(self) -> pulumi.Output[Optional[str]]:
        """
        The Shared Access Signature of the Storage Account. Conflicts with `account_key`.
        """
        return pulumi.get(self, "shared_access_signature")

    @property
    @pulumi.getter(name="storageContainerId")
    def storage_container_id(self) -> pulumi.Output[str]:
        """
        The ID of the Storage Account Container. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "storage_container_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of tags which should be assigned to the Machine Learning DataStore. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="workspaceId")
    def workspace_id(self) -> pulumi.Output[str]:
        """
        The ID of the Machine Learning Workspace. Changing this forces a new Machine Learning DataStore to be created.
        """
        return pulumi.get(self, "workspace_id")
