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

__all__ = ['VpnServerConfigurationPolicyGroupArgs', 'VpnServerConfigurationPolicyGroup']

@pulumi.input_type
class VpnServerConfigurationPolicyGroupArgs:
    def __init__(__self__, *,
                 policies: pulumi.Input[Sequence[pulumi.Input['VpnServerConfigurationPolicyGroupPolicyArgs']]],
                 vpn_server_configuration_id: pulumi.Input[str],
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a VpnServerConfigurationPolicyGroup resource.
        :param pulumi.Input[Sequence[pulumi.Input['VpnServerConfigurationPolicyGroupPolicyArgs']]] policies: One or more `policy` blocks as documented below.
        :param pulumi.Input[str] vpn_server_configuration_id: The ID of the VPN Server Configuration that the VPN Server Configuration Policy Group belongs to. Changing this forces a new resource to be created.
        :param pulumi.Input[bool] is_default: Is this a default VPN Server Configuration Policy Group? Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The Name which should be used for this VPN Server Configuration Policy Group. Changing this forces a new resource to be created.
        :param pulumi.Input[int] priority: The priority of this VPN Server Configuration Policy Group. Defaults to `0`.
        """
        pulumi.set(__self__, "policies", policies)
        pulumi.set(__self__, "vpn_server_configuration_id", vpn_server_configuration_id)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Input[Sequence[pulumi.Input['VpnServerConfigurationPolicyGroupPolicyArgs']]]:
        """
        One or more `policy` blocks as documented below.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: pulumi.Input[Sequence[pulumi.Input['VpnServerConfigurationPolicyGroupPolicyArgs']]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter(name="vpnServerConfigurationId")
    def vpn_server_configuration_id(self) -> pulumi.Input[str]:
        """
        The ID of the VPN Server Configuration that the VPN Server Configuration Policy Group belongs to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "vpn_server_configuration_id")

    @vpn_server_configuration_id.setter
    def vpn_server_configuration_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpn_server_configuration_id", value)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Is this a default VPN Server Configuration Policy Group? Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_default", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The Name which should be used for this VPN Server Configuration Policy Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of this VPN Server Configuration Policy Group. Defaults to `0`.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)


@pulumi.input_type
class _VpnServerConfigurationPolicyGroupState:
    def __init__(__self__, *,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input['VpnServerConfigurationPolicyGroupPolicyArgs']]]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 vpn_server_configuration_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VpnServerConfigurationPolicyGroup resources.
        :param pulumi.Input[bool] is_default: Is this a default VPN Server Configuration Policy Group? Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The Name which should be used for this VPN Server Configuration Policy Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input['VpnServerConfigurationPolicyGroupPolicyArgs']]] policies: One or more `policy` blocks as documented below.
        :param pulumi.Input[int] priority: The priority of this VPN Server Configuration Policy Group. Defaults to `0`.
        :param pulumi.Input[str] vpn_server_configuration_id: The ID of the VPN Server Configuration that the VPN Server Configuration Policy Group belongs to. Changing this forces a new resource to be created.
        """
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policies is not None:
            pulumi.set(__self__, "policies", policies)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if vpn_server_configuration_id is not None:
            pulumi.set(__self__, "vpn_server_configuration_id", vpn_server_configuration_id)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[bool]]:
        """
        Is this a default VPN Server Configuration Policy Group? Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_default", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The Name which should be used for this VPN Server Configuration Policy Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VpnServerConfigurationPolicyGroupPolicyArgs']]]]:
        """
        One or more `policy` blocks as documented below.
        """
        return pulumi.get(self, "policies")

    @policies.setter
    def policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VpnServerConfigurationPolicyGroupPolicyArgs']]]]):
        pulumi.set(self, "policies", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of this VPN Server Configuration Policy Group. Defaults to `0`.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="vpnServerConfigurationId")
    def vpn_server_configuration_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPN Server Configuration that the VPN Server Configuration Policy Group belongs to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "vpn_server_configuration_id")

    @vpn_server_configuration_id.setter
    def vpn_server_configuration_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_server_configuration_id", value)


class VpnServerConfigurationPolicyGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpnServerConfigurationPolicyGroupPolicyArgs']]]]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 vpn_server_configuration_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a VPN Server Configuration Policy Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_vpn_server_configuration = azure.network.VpnServerConfiguration("exampleVpnServerConfiguration",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            vpn_authentication_types=["Radius"],
            radius=azure.network.VpnServerConfigurationRadiusArgs(
                servers=[azure.network.VpnServerConfigurationRadiusServerArgs(
                    address="10.105.1.1",
                    secret="vindicators-the-return-of-worldender",
                    score=15,
                )],
            ))
        example_vpn_server_configuration_policy_group = azure.network.VpnServerConfigurationPolicyGroup("exampleVpnServerConfigurationPolicyGroup",
            vpn_server_configuration_id=example_vpn_server_configuration.id,
            policies=[azure.network.VpnServerConfigurationPolicyGroupPolicyArgs(
                name="policy1",
                type="RadiusAzureGroupId",
                value="6ad1bd08",
            )])
        ```

        ## Import

        VPN Server Configuration Policy Groups can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:network/vpnServerConfigurationPolicyGroup:VpnServerConfigurationPolicyGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Network/vpnServerConfigurations/serverConfiguration1/configurationPolicyGroups/configurationPolicyGroup1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] is_default: Is this a default VPN Server Configuration Policy Group? Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The Name which should be used for this VPN Server Configuration Policy Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpnServerConfigurationPolicyGroupPolicyArgs']]]] policies: One or more `policy` blocks as documented below.
        :param pulumi.Input[int] priority: The priority of this VPN Server Configuration Policy Group. Defaults to `0`.
        :param pulumi.Input[str] vpn_server_configuration_id: The ID of the VPN Server Configuration that the VPN Server Configuration Policy Group belongs to. Changing this forces a new resource to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpnServerConfigurationPolicyGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a VPN Server Configuration Policy Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_vpn_server_configuration = azure.network.VpnServerConfiguration("exampleVpnServerConfiguration",
            resource_group_name=example_resource_group.name,
            location=example_resource_group.location,
            vpn_authentication_types=["Radius"],
            radius=azure.network.VpnServerConfigurationRadiusArgs(
                servers=[azure.network.VpnServerConfigurationRadiusServerArgs(
                    address="10.105.1.1",
                    secret="vindicators-the-return-of-worldender",
                    score=15,
                )],
            ))
        example_vpn_server_configuration_policy_group = azure.network.VpnServerConfigurationPolicyGroup("exampleVpnServerConfigurationPolicyGroup",
            vpn_server_configuration_id=example_vpn_server_configuration.id,
            policies=[azure.network.VpnServerConfigurationPolicyGroupPolicyArgs(
                name="policy1",
                type="RadiusAzureGroupId",
                value="6ad1bd08",
            )])
        ```

        ## Import

        VPN Server Configuration Policy Groups can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:network/vpnServerConfigurationPolicyGroup:VpnServerConfigurationPolicyGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Network/vpnServerConfigurations/serverConfiguration1/configurationPolicyGroups/configurationPolicyGroup1
        ```

        :param str resource_name: The name of the resource.
        :param VpnServerConfigurationPolicyGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpnServerConfigurationPolicyGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpnServerConfigurationPolicyGroupPolicyArgs']]]]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 vpn_server_configuration_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpnServerConfigurationPolicyGroupArgs.__new__(VpnServerConfigurationPolicyGroupArgs)

            __props__.__dict__["is_default"] = is_default
            __props__.__dict__["name"] = name
            if policies is None and not opts.urn:
                raise TypeError("Missing required property 'policies'")
            __props__.__dict__["policies"] = policies
            __props__.__dict__["priority"] = priority
            if vpn_server_configuration_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpn_server_configuration_id'")
            __props__.__dict__["vpn_server_configuration_id"] = vpn_server_configuration_id
        super(VpnServerConfigurationPolicyGroup, __self__).__init__(
            'azure:network/vpnServerConfigurationPolicyGroup:VpnServerConfigurationPolicyGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            is_default: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policies: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpnServerConfigurationPolicyGroupPolicyArgs']]]]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            vpn_server_configuration_id: Optional[pulumi.Input[str]] = None) -> 'VpnServerConfigurationPolicyGroup':
        """
        Get an existing VpnServerConfigurationPolicyGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] is_default: Is this a default VPN Server Configuration Policy Group? Defaults to `false`. Changing this forces a new resource to be created.
        :param pulumi.Input[str] name: The Name which should be used for this VPN Server Configuration Policy Group. Changing this forces a new resource to be created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpnServerConfigurationPolicyGroupPolicyArgs']]]] policies: One or more `policy` blocks as documented below.
        :param pulumi.Input[int] priority: The priority of this VPN Server Configuration Policy Group. Defaults to `0`.
        :param pulumi.Input[str] vpn_server_configuration_id: The ID of the VPN Server Configuration that the VPN Server Configuration Policy Group belongs to. Changing this forces a new resource to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpnServerConfigurationPolicyGroupState.__new__(_VpnServerConfigurationPolicyGroupState)

        __props__.__dict__["is_default"] = is_default
        __props__.__dict__["name"] = name
        __props__.__dict__["policies"] = policies
        __props__.__dict__["priority"] = priority
        __props__.__dict__["vpn_server_configuration_id"] = vpn_server_configuration_id
        return VpnServerConfigurationPolicyGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> pulumi.Output[Optional[bool]]:
        """
        Is this a default VPN Server Configuration Policy Group? Defaults to `false`. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "is_default")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The Name which should be used for this VPN Server Configuration Policy Group. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policies(self) -> pulumi.Output[Sequence['outputs.VpnServerConfigurationPolicyGroupPolicy']]:
        """
        One or more `policy` blocks as documented below.
        """
        return pulumi.get(self, "policies")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[Optional[int]]:
        """
        The priority of this VPN Server Configuration Policy Group. Defaults to `0`.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="vpnServerConfigurationId")
    def vpn_server_configuration_id(self) -> pulumi.Output[str]:
        """
        The ID of the VPN Server Configuration that the VPN Server Configuration Policy Group belongs to. Changing this forces a new resource to be created.
        """
        return pulumi.get(self, "vpn_server_configuration_id")
