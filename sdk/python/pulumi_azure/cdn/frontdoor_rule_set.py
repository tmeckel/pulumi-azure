# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FrontdoorRuleSetArgs', 'FrontdoorRuleSet']

@pulumi.input_type
class FrontdoorRuleSetArgs:
    def __init__(__self__, *,
                 cdn_frontdoor_profile_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FrontdoorRuleSet resource.
        :param pulumi.Input[str] cdn_frontdoor_profile_id: The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
        :param pulumi.Input[str] name: The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
        """
        pulumi.set(__self__, "cdn_frontdoor_profile_id", cdn_frontdoor_profile_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="cdnFrontdoorProfileId")
    def cdn_frontdoor_profile_id(self) -> pulumi.Input[str]:
        """
        The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
        """
        return pulumi.get(self, "cdn_frontdoor_profile_id")

    @cdn_frontdoor_profile_id.setter
    def cdn_frontdoor_profile_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cdn_frontdoor_profile_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FrontdoorRuleSetState:
    def __init__(__self__, *,
                 cdn_frontdoor_profile_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FrontdoorRuleSet resources.
        :param pulumi.Input[str] cdn_frontdoor_profile_id: The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
        :param pulumi.Input[str] name: The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
        """
        if cdn_frontdoor_profile_id is not None:
            pulumi.set(__self__, "cdn_frontdoor_profile_id", cdn_frontdoor_profile_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="cdnFrontdoorProfileId")
    def cdn_frontdoor_profile_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
        """
        return pulumi.get(self, "cdn_frontdoor_profile_id")

    @cdn_frontdoor_profile_id.setter
    def cdn_frontdoor_profile_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cdn_frontdoor_profile_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class FrontdoorRuleSet(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cdn_frontdoor_profile_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a CDN FrontDoor Rule Set.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_frontdoor_profile = azure.cdn.FrontdoorProfile("exampleFrontdoorProfile",
            resource_group_name=example_resource_group.name,
            sku_name="Standard_AzureFrontDoor")
        example_frontdoor_rule_set = azure.cdn.FrontdoorRuleSet("exampleFrontdoorRuleSet", cdn_frontdoor_profile_id=example_frontdoor_profile.id)
        ```

        ## Import

        CDN FrontDoor Rule Sets can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:cdn/frontdoorRuleSet:FrontdoorRuleSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/ruleSets/ruleSet1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cdn_frontdoor_profile_id: The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
        :param pulumi.Input[str] name: The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FrontdoorRuleSetArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a CDN FrontDoor Rule Set.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_frontdoor_profile = azure.cdn.FrontdoorProfile("exampleFrontdoorProfile",
            resource_group_name=example_resource_group.name,
            sku_name="Standard_AzureFrontDoor")
        example_frontdoor_rule_set = azure.cdn.FrontdoorRuleSet("exampleFrontdoorRuleSet", cdn_frontdoor_profile_id=example_frontdoor_profile.id)
        ```

        ## Import

        CDN FrontDoor Rule Sets can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:cdn/frontdoorRuleSet:FrontdoorRuleSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup1/providers/Microsoft.Cdn/profiles/profile1/ruleSets/ruleSet1
        ```

        :param str resource_name: The name of the resource.
        :param FrontdoorRuleSetArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FrontdoorRuleSetArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cdn_frontdoor_profile_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FrontdoorRuleSetArgs.__new__(FrontdoorRuleSetArgs)

            if cdn_frontdoor_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'cdn_frontdoor_profile_id'")
            __props__.__dict__["cdn_frontdoor_profile_id"] = cdn_frontdoor_profile_id
            __props__.__dict__["name"] = name
        super(FrontdoorRuleSet, __self__).__init__(
            'azure:cdn/frontdoorRuleSet:FrontdoorRuleSet',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cdn_frontdoor_profile_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'FrontdoorRuleSet':
        """
        Get an existing FrontdoorRuleSet resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cdn_frontdoor_profile_id: The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
        :param pulumi.Input[str] name: The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FrontdoorRuleSetState.__new__(_FrontdoorRuleSetState)

        __props__.__dict__["cdn_frontdoor_profile_id"] = cdn_frontdoor_profile_id
        __props__.__dict__["name"] = name
        return FrontdoorRuleSet(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cdnFrontdoorProfileId")
    def cdn_frontdoor_profile_id(self) -> pulumi.Output[str]:
        """
        The ID of the CDN FrontDoor Profile. Changing this forces a new CDN FrontDoor Rule Set to be created.
        """
        return pulumi.get(self, "cdn_frontdoor_profile_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this CDN FrontDoor Rule Set. Changing this forces a new CDN FrontDoor Rule Set to be created.
        """
        return pulumi.get(self, "name")
