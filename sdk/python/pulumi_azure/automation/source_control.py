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
from ._inputs import *

__all__ = ['SourceControlArgs', 'SourceControl']

@pulumi.input_type
class SourceControlArgs:
    def __init__(__self__, *,
                 automation_account_id: pulumi.Input[str],
                 folder_path: pulumi.Input[str],
                 repository_url: pulumi.Input[str],
                 security: pulumi.Input['SourceControlSecurityArgs'],
                 source_control_type: pulumi.Input[str],
                 automatic_sync: Optional[pulumi.Input[bool]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 publish_runbook_enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a SourceControl resource.
        :param pulumi.Input[str] automation_account_id: The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
        :param pulumi.Input[str] folder_path: The folder path of the source control. This Path must be relative.
        :param pulumi.Input[str] repository_url: The Repository URL of the source control.
        :param pulumi.Input['SourceControlSecurityArgs'] security: A `security` block as defined below.
        :param pulumi.Input[str] source_control_type: The source type of Source Control, possible vaules are `VsoGit`, `VsoTfvc` and `GitHub`, and the value is case sensitive.
        :param pulumi.Input[bool] automatic_sync: Whether auto async the Source Control.
        :param pulumi.Input[str] branch: Specify the repo branch of the Source Control. Empty value is valid only for `VsoTfvc`.
        :param pulumi.Input[str] description: A short description of the Source Control.
        :param pulumi.Input[str] name: The name which should be used for this Automation Source Control. Changing this forces a new Automation Source Control to be created.
        :param pulumi.Input[bool] publish_runbook_enabled: Whether auto publish the Source Control.
        """
        pulumi.set(__self__, "automation_account_id", automation_account_id)
        pulumi.set(__self__, "folder_path", folder_path)
        pulumi.set(__self__, "repository_url", repository_url)
        pulumi.set(__self__, "security", security)
        pulumi.set(__self__, "source_control_type", source_control_type)
        if automatic_sync is not None:
            pulumi.set(__self__, "automatic_sync", automatic_sync)
        if branch is not None:
            pulumi.set(__self__, "branch", branch)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if publish_runbook_enabled is not None:
            pulumi.set(__self__, "publish_runbook_enabled", publish_runbook_enabled)

    @property
    @pulumi.getter(name="automationAccountId")
    def automation_account_id(self) -> pulumi.Input[str]:
        """
        The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
        """
        return pulumi.get(self, "automation_account_id")

    @automation_account_id.setter
    def automation_account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "automation_account_id", value)

    @property
    @pulumi.getter(name="folderPath")
    def folder_path(self) -> pulumi.Input[str]:
        """
        The folder path of the source control. This Path must be relative.
        """
        return pulumi.get(self, "folder_path")

    @folder_path.setter
    def folder_path(self, value: pulumi.Input[str]):
        pulumi.set(self, "folder_path", value)

    @property
    @pulumi.getter(name="repositoryUrl")
    def repository_url(self) -> pulumi.Input[str]:
        """
        The Repository URL of the source control.
        """
        return pulumi.get(self, "repository_url")

    @repository_url.setter
    def repository_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository_url", value)

    @property
    @pulumi.getter
    def security(self) -> pulumi.Input['SourceControlSecurityArgs']:
        """
        A `security` block as defined below.
        """
        return pulumi.get(self, "security")

    @security.setter
    def security(self, value: pulumi.Input['SourceControlSecurityArgs']):
        pulumi.set(self, "security", value)

    @property
    @pulumi.getter(name="sourceControlType")
    def source_control_type(self) -> pulumi.Input[str]:
        """
        The source type of Source Control, possible vaules are `VsoGit`, `VsoTfvc` and `GitHub`, and the value is case sensitive.
        """
        return pulumi.get(self, "source_control_type")

    @source_control_type.setter
    def source_control_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_control_type", value)

    @property
    @pulumi.getter(name="automaticSync")
    def automatic_sync(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether auto async the Source Control.
        """
        return pulumi.get(self, "automatic_sync")

    @automatic_sync.setter
    def automatic_sync(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "automatic_sync", value)

    @property
    @pulumi.getter
    def branch(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the repo branch of the Source Control. Empty value is valid only for `VsoTfvc`.
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A short description of the Source Control.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Automation Source Control. Changing this forces a new Automation Source Control to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="publishRunbookEnabled")
    def publish_runbook_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether auto publish the Source Control.
        """
        return pulumi.get(self, "publish_runbook_enabled")

    @publish_runbook_enabled.setter
    def publish_runbook_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "publish_runbook_enabled", value)


@pulumi.input_type
class _SourceControlState:
    def __init__(__self__, *,
                 automatic_sync: Optional[pulumi.Input[bool]] = None,
                 automation_account_id: Optional[pulumi.Input[str]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 folder_path: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 publish_runbook_enabled: Optional[pulumi.Input[bool]] = None,
                 repository_url: Optional[pulumi.Input[str]] = None,
                 security: Optional[pulumi.Input['SourceControlSecurityArgs']] = None,
                 source_control_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SourceControl resources.
        :param pulumi.Input[bool] automatic_sync: Whether auto async the Source Control.
        :param pulumi.Input[str] automation_account_id: The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
        :param pulumi.Input[str] branch: Specify the repo branch of the Source Control. Empty value is valid only for `VsoTfvc`.
        :param pulumi.Input[str] description: A short description of the Source Control.
        :param pulumi.Input[str] folder_path: The folder path of the source control. This Path must be relative.
        :param pulumi.Input[str] name: The name which should be used for this Automation Source Control. Changing this forces a new Automation Source Control to be created.
        :param pulumi.Input[bool] publish_runbook_enabled: Whether auto publish the Source Control.
        :param pulumi.Input[str] repository_url: The Repository URL of the source control.
        :param pulumi.Input['SourceControlSecurityArgs'] security: A `security` block as defined below.
        :param pulumi.Input[str] source_control_type: The source type of Source Control, possible vaules are `VsoGit`, `VsoTfvc` and `GitHub`, and the value is case sensitive.
        """
        if automatic_sync is not None:
            pulumi.set(__self__, "automatic_sync", automatic_sync)
        if automation_account_id is not None:
            pulumi.set(__self__, "automation_account_id", automation_account_id)
        if branch is not None:
            pulumi.set(__self__, "branch", branch)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if folder_path is not None:
            pulumi.set(__self__, "folder_path", folder_path)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if publish_runbook_enabled is not None:
            pulumi.set(__self__, "publish_runbook_enabled", publish_runbook_enabled)
        if repository_url is not None:
            pulumi.set(__self__, "repository_url", repository_url)
        if security is not None:
            pulumi.set(__self__, "security", security)
        if source_control_type is not None:
            pulumi.set(__self__, "source_control_type", source_control_type)

    @property
    @pulumi.getter(name="automaticSync")
    def automatic_sync(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether auto async the Source Control.
        """
        return pulumi.get(self, "automatic_sync")

    @automatic_sync.setter
    def automatic_sync(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "automatic_sync", value)

    @property
    @pulumi.getter(name="automationAccountId")
    def automation_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
        """
        return pulumi.get(self, "automation_account_id")

    @automation_account_id.setter
    def automation_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "automation_account_id", value)

    @property
    @pulumi.getter
    def branch(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the repo branch of the Source Control. Empty value is valid only for `VsoTfvc`.
        """
        return pulumi.get(self, "branch")

    @branch.setter
    def branch(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A short description of the Source Control.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="folderPath")
    def folder_path(self) -> Optional[pulumi.Input[str]]:
        """
        The folder path of the source control. This Path must be relative.
        """
        return pulumi.get(self, "folder_path")

    @folder_path.setter
    def folder_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder_path", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Automation Source Control. Changing this forces a new Automation Source Control to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="publishRunbookEnabled")
    def publish_runbook_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether auto publish the Source Control.
        """
        return pulumi.get(self, "publish_runbook_enabled")

    @publish_runbook_enabled.setter
    def publish_runbook_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "publish_runbook_enabled", value)

    @property
    @pulumi.getter(name="repositoryUrl")
    def repository_url(self) -> Optional[pulumi.Input[str]]:
        """
        The Repository URL of the source control.
        """
        return pulumi.get(self, "repository_url")

    @repository_url.setter
    def repository_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository_url", value)

    @property
    @pulumi.getter
    def security(self) -> Optional[pulumi.Input['SourceControlSecurityArgs']]:
        """
        A `security` block as defined below.
        """
        return pulumi.get(self, "security")

    @security.setter
    def security(self, value: Optional[pulumi.Input['SourceControlSecurityArgs']]):
        pulumi.set(self, "security", value)

    @property
    @pulumi.getter(name="sourceControlType")
    def source_control_type(self) -> Optional[pulumi.Input[str]]:
        """
        The source type of Source Control, possible vaules are `VsoGit`, `VsoTfvc` and `GitHub`, and the value is case sensitive.
        """
        return pulumi.get(self, "source_control_type")

    @source_control_type.setter
    def source_control_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_control_type", value)


class SourceControl(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automatic_sync: Optional[pulumi.Input[bool]] = None,
                 automation_account_id: Optional[pulumi.Input[str]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 folder_path: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 publish_runbook_enabled: Optional[pulumi.Input[bool]] = None,
                 repository_url: Optional[pulumi.Input[str]] = None,
                 security: Optional[pulumi.Input[pulumi.InputType['SourceControlSecurityArgs']]] = None,
                 source_control_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Automation Source Control.

        ## Import

        Automations can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:automation/sourceControl:SourceControl example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/sourceControls/sc1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] automatic_sync: Whether auto async the Source Control.
        :param pulumi.Input[str] automation_account_id: The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
        :param pulumi.Input[str] branch: Specify the repo branch of the Source Control. Empty value is valid only for `VsoTfvc`.
        :param pulumi.Input[str] description: A short description of the Source Control.
        :param pulumi.Input[str] folder_path: The folder path of the source control. This Path must be relative.
        :param pulumi.Input[str] name: The name which should be used for this Automation Source Control. Changing this forces a new Automation Source Control to be created.
        :param pulumi.Input[bool] publish_runbook_enabled: Whether auto publish the Source Control.
        :param pulumi.Input[str] repository_url: The Repository URL of the source control.
        :param pulumi.Input[pulumi.InputType['SourceControlSecurityArgs']] security: A `security` block as defined below.
        :param pulumi.Input[str] source_control_type: The source type of Source Control, possible vaules are `VsoGit`, `VsoTfvc` and `GitHub`, and the value is case sensitive.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SourceControlArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Automation Source Control.

        ## Import

        Automations can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:automation/sourceControl:SourceControl example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/sourceControls/sc1
        ```

        :param str resource_name: The name of the resource.
        :param SourceControlArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SourceControlArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 automatic_sync: Optional[pulumi.Input[bool]] = None,
                 automation_account_id: Optional[pulumi.Input[str]] = None,
                 branch: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 folder_path: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 publish_runbook_enabled: Optional[pulumi.Input[bool]] = None,
                 repository_url: Optional[pulumi.Input[str]] = None,
                 security: Optional[pulumi.Input[pulumi.InputType['SourceControlSecurityArgs']]] = None,
                 source_control_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SourceControlArgs.__new__(SourceControlArgs)

            __props__.__dict__["automatic_sync"] = automatic_sync
            if automation_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'automation_account_id'")
            __props__.__dict__["automation_account_id"] = automation_account_id
            __props__.__dict__["branch"] = branch
            __props__.__dict__["description"] = description
            if folder_path is None and not opts.urn:
                raise TypeError("Missing required property 'folder_path'")
            __props__.__dict__["folder_path"] = folder_path
            __props__.__dict__["name"] = name
            __props__.__dict__["publish_runbook_enabled"] = publish_runbook_enabled
            if repository_url is None and not opts.urn:
                raise TypeError("Missing required property 'repository_url'")
            __props__.__dict__["repository_url"] = repository_url
            if security is None and not opts.urn:
                raise TypeError("Missing required property 'security'")
            __props__.__dict__["security"] = security
            if source_control_type is None and not opts.urn:
                raise TypeError("Missing required property 'source_control_type'")
            __props__.__dict__["source_control_type"] = source_control_type
        super(SourceControl, __self__).__init__(
            'azure:automation/sourceControl:SourceControl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            automatic_sync: Optional[pulumi.Input[bool]] = None,
            automation_account_id: Optional[pulumi.Input[str]] = None,
            branch: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            folder_path: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            publish_runbook_enabled: Optional[pulumi.Input[bool]] = None,
            repository_url: Optional[pulumi.Input[str]] = None,
            security: Optional[pulumi.Input[pulumi.InputType['SourceControlSecurityArgs']]] = None,
            source_control_type: Optional[pulumi.Input[str]] = None) -> 'SourceControl':
        """
        Get an existing SourceControl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] automatic_sync: Whether auto async the Source Control.
        :param pulumi.Input[str] automation_account_id: The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
        :param pulumi.Input[str] branch: Specify the repo branch of the Source Control. Empty value is valid only for `VsoTfvc`.
        :param pulumi.Input[str] description: A short description of the Source Control.
        :param pulumi.Input[str] folder_path: The folder path of the source control. This Path must be relative.
        :param pulumi.Input[str] name: The name which should be used for this Automation Source Control. Changing this forces a new Automation Source Control to be created.
        :param pulumi.Input[bool] publish_runbook_enabled: Whether auto publish the Source Control.
        :param pulumi.Input[str] repository_url: The Repository URL of the source control.
        :param pulumi.Input[pulumi.InputType['SourceControlSecurityArgs']] security: A `security` block as defined below.
        :param pulumi.Input[str] source_control_type: The source type of Source Control, possible vaules are `VsoGit`, `VsoTfvc` and `GitHub`, and the value is case sensitive.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SourceControlState.__new__(_SourceControlState)

        __props__.__dict__["automatic_sync"] = automatic_sync
        __props__.__dict__["automation_account_id"] = automation_account_id
        __props__.__dict__["branch"] = branch
        __props__.__dict__["description"] = description
        __props__.__dict__["folder_path"] = folder_path
        __props__.__dict__["name"] = name
        __props__.__dict__["publish_runbook_enabled"] = publish_runbook_enabled
        __props__.__dict__["repository_url"] = repository_url
        __props__.__dict__["security"] = security
        __props__.__dict__["source_control_type"] = source_control_type
        return SourceControl(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="automaticSync")
    def automatic_sync(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether auto async the Source Control.
        """
        return pulumi.get(self, "automatic_sync")

    @property
    @pulumi.getter(name="automationAccountId")
    def automation_account_id(self) -> pulumi.Output[str]:
        """
        The ID of Automation Account to manage this Source Control. Changing this forces a new Automation Source Control to be created.
        """
        return pulumi.get(self, "automation_account_id")

    @property
    @pulumi.getter
    def branch(self) -> pulumi.Output[Optional[str]]:
        """
        Specify the repo branch of the Source Control. Empty value is valid only for `VsoTfvc`.
        """
        return pulumi.get(self, "branch")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A short description of the Source Control.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="folderPath")
    def folder_path(self) -> pulumi.Output[str]:
        """
        The folder path of the source control. This Path must be relative.
        """
        return pulumi.get(self, "folder_path")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this Automation Source Control. Changing this forces a new Automation Source Control to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="publishRunbookEnabled")
    def publish_runbook_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether auto publish the Source Control.
        """
        return pulumi.get(self, "publish_runbook_enabled")

    @property
    @pulumi.getter(name="repositoryUrl")
    def repository_url(self) -> pulumi.Output[str]:
        """
        The Repository URL of the source control.
        """
        return pulumi.get(self, "repository_url")

    @property
    @pulumi.getter
    def security(self) -> pulumi.Output['outputs.SourceControlSecurity']:
        """
        A `security` block as defined below.
        """
        return pulumi.get(self, "security")

    @property
    @pulumi.getter(name="sourceControlType")
    def source_control_type(self) -> pulumi.Output[str]:
        """
        The source type of Source Control, possible vaules are `VsoGit`, `VsoTfvc` and `GitHub`, and the value is case sensitive.
        """
        return pulumi.get(self, "source_control_type")
