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

__all__ = ['LogzSubAccountArgs', 'LogzSubAccount']

@pulumi.input_type
class LogzSubAccountArgs:
    def __init__(__self__, *,
                 logz_monitor_id: pulumi.Input[str],
                 user: pulumi.Input['LogzSubAccountUserArgs'],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a LogzSubAccount resource.
        :param pulumi.Input[str] logz_monitor_id: The ID of the Logz Monitor. Changing this forces a new logz Sub Account to be created.
        :param pulumi.Input['LogzSubAccountUserArgs'] user: A `user` block as defined below.
        :param pulumi.Input[bool] enabled: Whether the resource monitoring is enabled? Defaults to `true`.
        :param pulumi.Input[str] name: The name which should be used for this logz Sub Account. Possible values must be between 1 and 32 characters in length and may contain only letters, numbers, hyphens and underscores. Changing this forces a new logz Sub Account to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the logz Sub Account.
        """
        pulumi.set(__self__, "logz_monitor_id", logz_monitor_id)
        pulumi.set(__self__, "user", user)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="logzMonitorId")
    def logz_monitor_id(self) -> pulumi.Input[str]:
        """
        The ID of the Logz Monitor. Changing this forces a new logz Sub Account to be created.
        """
        return pulumi.get(self, "logz_monitor_id")

    @logz_monitor_id.setter
    def logz_monitor_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "logz_monitor_id", value)

    @property
    @pulumi.getter
    def user(self) -> pulumi.Input['LogzSubAccountUserArgs']:
        """
        A `user` block as defined below.
        """
        return pulumi.get(self, "user")

    @user.setter
    def user(self, value: pulumi.Input['LogzSubAccountUserArgs']):
        pulumi.set(self, "user", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the resource monitoring is enabled? Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this logz Sub Account. Possible values must be between 1 and 32 characters in length and may contain only letters, numbers, hyphens and underscores. Changing this forces a new logz Sub Account to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags which should be assigned to the logz Sub Account.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _LogzSubAccountState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 logz_monitor_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user: Optional[pulumi.Input['LogzSubAccountUserArgs']] = None):
        """
        Input properties used for looking up and filtering LogzSubAccount resources.
        :param pulumi.Input[bool] enabled: Whether the resource monitoring is enabled? Defaults to `true`.
        :param pulumi.Input[str] logz_monitor_id: The ID of the Logz Monitor. Changing this forces a new logz Sub Account to be created.
        :param pulumi.Input[str] name: The name which should be used for this logz Sub Account. Possible values must be between 1 and 32 characters in length and may contain only letters, numbers, hyphens and underscores. Changing this forces a new logz Sub Account to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the logz Sub Account.
        :param pulumi.Input['LogzSubAccountUserArgs'] user: A `user` block as defined below.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if logz_monitor_id is not None:
            pulumi.set(__self__, "logz_monitor_id", logz_monitor_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if user is not None:
            pulumi.set(__self__, "user", user)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the resource monitoring is enabled? Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="logzMonitorId")
    def logz_monitor_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Logz Monitor. Changing this forces a new logz Sub Account to be created.
        """
        return pulumi.get(self, "logz_monitor_id")

    @logz_monitor_id.setter
    def logz_monitor_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "logz_monitor_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this logz Sub Account. Possible values must be between 1 and 32 characters in length and may contain only letters, numbers, hyphens and underscores. Changing this forces a new logz Sub Account to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A mapping of tags which should be assigned to the logz Sub Account.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def user(self) -> Optional[pulumi.Input['LogzSubAccountUserArgs']]:
        """
        A `user` block as defined below.
        """
        return pulumi.get(self, "user")

    @user.setter
    def user(self, value: Optional[pulumi.Input['LogzSubAccountUserArgs']]):
        pulumi.set(self, "user", value)


class LogzSubAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 logz_monitor_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user: Optional[pulumi.Input[pulumi.InputType['LogzSubAccountUserArgs']]] = None,
                 __props__=None):
        """
        Manages a logz Sub Account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_logz_monitor = azure.monitoring.LogzMonitor("exampleLogzMonitor",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            plan=azure.monitoring.LogzMonitorPlanArgs(
                billing_cycle="MONTHLY",
                effective_date="2022-06-06T00:00:00Z",
                plan_id="100gb14days",
                usage_type="COMMITTED",
            ),
            user=azure.monitoring.LogzMonitorUserArgs(
                email="user@example.com",
                first_name="Example",
                last_name="User",
                phone_number="+12313803556",
            ))
        example_logz_sub_account = azure.monitoring.LogzSubAccount("exampleLogzSubAccount",
            logz_monitor_id=example_logz_monitor.id,
            user=azure.monitoring.LogzSubAccountUserArgs(
                email=example_logz_monitor.user.email,
                first_name=example_logz_monitor.user.first_name,
                last_name=example_logz_monitor.user.last_name,
                phone_number=example_logz_monitor.user.phone_number,
            ))
        ```

        ## Import

        logz SubAccounts can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:monitoring/logzSubAccount:LogzSubAccount example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logz/monitors/monitor1/accounts/subAccount1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether the resource monitoring is enabled? Defaults to `true`.
        :param pulumi.Input[str] logz_monitor_id: The ID of the Logz Monitor. Changing this forces a new logz Sub Account to be created.
        :param pulumi.Input[str] name: The name which should be used for this logz Sub Account. Possible values must be between 1 and 32 characters in length and may contain only letters, numbers, hyphens and underscores. Changing this forces a new logz Sub Account to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the logz Sub Account.
        :param pulumi.Input[pulumi.InputType['LogzSubAccountUserArgs']] user: A `user` block as defined below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogzSubAccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a logz Sub Account.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_logz_monitor = azure.monitoring.LogzMonitor("exampleLogzMonitor",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            plan=azure.monitoring.LogzMonitorPlanArgs(
                billing_cycle="MONTHLY",
                effective_date="2022-06-06T00:00:00Z",
                plan_id="100gb14days",
                usage_type="COMMITTED",
            ),
            user=azure.monitoring.LogzMonitorUserArgs(
                email="user@example.com",
                first_name="Example",
                last_name="User",
                phone_number="+12313803556",
            ))
        example_logz_sub_account = azure.monitoring.LogzSubAccount("exampleLogzSubAccount",
            logz_monitor_id=example_logz_monitor.id,
            user=azure.monitoring.LogzSubAccountUserArgs(
                email=example_logz_monitor.user.email,
                first_name=example_logz_monitor.user.first_name,
                last_name=example_logz_monitor.user.last_name,
                phone_number=example_logz_monitor.user.phone_number,
            ))
        ```

        ## Import

        logz SubAccounts can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:monitoring/logzSubAccount:LogzSubAccount example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logz/monitors/monitor1/accounts/subAccount1
        ```

        :param str resource_name: The name of the resource.
        :param LogzSubAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogzSubAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 logz_monitor_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user: Optional[pulumi.Input[pulumi.InputType['LogzSubAccountUserArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogzSubAccountArgs.__new__(LogzSubAccountArgs)

            __props__.__dict__["enabled"] = enabled
            if logz_monitor_id is None and not opts.urn:
                raise TypeError("Missing required property 'logz_monitor_id'")
            __props__.__dict__["logz_monitor_id"] = logz_monitor_id
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
            if user is None and not opts.urn:
                raise TypeError("Missing required property 'user'")
            __props__.__dict__["user"] = user
        super(LogzSubAccount, __self__).__init__(
            'azure:monitoring/logzSubAccount:LogzSubAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            logz_monitor_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            user: Optional[pulumi.Input[pulumi.InputType['LogzSubAccountUserArgs']]] = None) -> 'LogzSubAccount':
        """
        Get an existing LogzSubAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Whether the resource monitoring is enabled? Defaults to `true`.
        :param pulumi.Input[str] logz_monitor_id: The ID of the Logz Monitor. Changing this forces a new logz Sub Account to be created.
        :param pulumi.Input[str] name: The name which should be used for this logz Sub Account. Possible values must be between 1 and 32 characters in length and may contain only letters, numbers, hyphens and underscores. Changing this forces a new logz Sub Account to be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A mapping of tags which should be assigned to the logz Sub Account.
        :param pulumi.Input[pulumi.InputType['LogzSubAccountUserArgs']] user: A `user` block as defined below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogzSubAccountState.__new__(_LogzSubAccountState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["logz_monitor_id"] = logz_monitor_id
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["user"] = user
        return LogzSubAccount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the resource monitoring is enabled? Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="logzMonitorId")
    def logz_monitor_id(self) -> pulumi.Output[str]:
        """
        The ID of the Logz Monitor. Changing this forces a new logz Sub Account to be created.
        """
        return pulumi.get(self, "logz_monitor_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this logz Sub Account. Possible values must be between 1 and 32 characters in length and may contain only letters, numbers, hyphens and underscores. Changing this forces a new logz Sub Account to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A mapping of tags which should be assigned to the logz Sub Account.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def user(self) -> pulumi.Output['outputs.LogzSubAccountUser']:
        """
        A `user` block as defined below.
        """
        return pulumi.get(self, "user")
