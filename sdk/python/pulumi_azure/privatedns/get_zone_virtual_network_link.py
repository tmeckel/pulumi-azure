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
    'GetZoneVirtualNetworkLinkResult',
    'AwaitableGetZoneVirtualNetworkLinkResult',
    'get_zone_virtual_network_link',
    'get_zone_virtual_network_link_output',
]

@pulumi.output_type
class GetZoneVirtualNetworkLinkResult:
    """
    A collection of values returned by getZoneVirtualNetworkLink.
    """
    def __init__(__self__, id=None, name=None, private_dns_zone_name=None, registration_enabled=None, resource_group_name=None, tags=None, virtual_network_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if private_dns_zone_name and not isinstance(private_dns_zone_name, str):
            raise TypeError("Expected argument 'private_dns_zone_name' to be a str")
        pulumi.set(__self__, "private_dns_zone_name", private_dns_zone_name)
        if registration_enabled and not isinstance(registration_enabled, bool):
            raise TypeError("Expected argument 'registration_enabled' to be a bool")
        pulumi.set(__self__, "registration_enabled", registration_enabled)
        if resource_group_name and not isinstance(resource_group_name, str):
            raise TypeError("Expected argument 'resource_group_name' to be a str")
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if virtual_network_id and not isinstance(virtual_network_id, str):
            raise TypeError("Expected argument 'virtual_network_id' to be a str")
        pulumi.set(__self__, "virtual_network_id", virtual_network_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="privateDnsZoneName")
    def private_dns_zone_name(self) -> str:
        return pulumi.get(self, "private_dns_zone_name")

    @property
    @pulumi.getter(name="registrationEnabled")
    def registration_enabled(self) -> bool:
        """
        Whether the auto-registration of virtual machine records in the virtual network in the Private DNS zone is enabled or not.
        """
        return pulumi.get(self, "registration_enabled")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> str:
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="virtualNetworkId")
    def virtual_network_id(self) -> str:
        """
        The ID of the Virtual Network that is linked to the DNS Zone.
        """
        return pulumi.get(self, "virtual_network_id")


class AwaitableGetZoneVirtualNetworkLinkResult(GetZoneVirtualNetworkLinkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZoneVirtualNetworkLinkResult(
            id=self.id,
            name=self.name,
            private_dns_zone_name=self.private_dns_zone_name,
            registration_enabled=self.registration_enabled,
            resource_group_name=self.resource_group_name,
            tags=self.tags,
            virtual_network_id=self.virtual_network_id)


def get_zone_virtual_network_link(name: Optional[str] = None,
                                  private_dns_zone_name: Optional[str] = None,
                                  resource_group_name: Optional[str] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZoneVirtualNetworkLinkResult:
    """
    Use this data source to access information about an existing Private DNS zone Virtual Network Link. These Links enable DNS resolution and registration inside Azure Virtual Networks using Azure Private DNS.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.privatedns.get_zone_virtual_network_link(name="test",
        resource_group_name="test-rg",
        private_dns_zone_name="test-zone")
    pulumi.export("privateDnsARecordId", example.id)
    ```


    :param str name: The name of the Private DNS Zone Virtual Network Link.
    :param str private_dns_zone_name: The name of the Private DNS zone (without a terminating dot).
    :param str resource_group_name: Specifies the resource group where the Private DNS Zone exists.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['privateDnsZoneName'] = private_dns_zone_name
    __args__['resourceGroupName'] = resource_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('azure:privatedns/getZoneVirtualNetworkLink:getZoneVirtualNetworkLink', __args__, opts=opts, typ=GetZoneVirtualNetworkLinkResult).value

    return AwaitableGetZoneVirtualNetworkLinkResult(
        id=__ret__.id,
        name=__ret__.name,
        private_dns_zone_name=__ret__.private_dns_zone_name,
        registration_enabled=__ret__.registration_enabled,
        resource_group_name=__ret__.resource_group_name,
        tags=__ret__.tags,
        virtual_network_id=__ret__.virtual_network_id)


@_utilities.lift_output_func(get_zone_virtual_network_link)
def get_zone_virtual_network_link_output(name: Optional[pulumi.Input[str]] = None,
                                         private_dns_zone_name: Optional[pulumi.Input[str]] = None,
                                         resource_group_name: Optional[pulumi.Input[str]] = None,
                                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetZoneVirtualNetworkLinkResult]:
    """
    Use this data source to access information about an existing Private DNS zone Virtual Network Link. These Links enable DNS resolution and registration inside Azure Virtual Networks using Azure Private DNS.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_azure as azure

    example = azure.privatedns.get_zone_virtual_network_link(name="test",
        resource_group_name="test-rg",
        private_dns_zone_name="test-zone")
    pulumi.export("privateDnsARecordId", example.id)
    ```


    :param str name: The name of the Private DNS Zone Virtual Network Link.
    :param str private_dns_zone_name: The name of the Private DNS zone (without a terminating dot).
    :param str resource_group_name: Specifies the resource group where the Private DNS Zone exists.
    """
    ...