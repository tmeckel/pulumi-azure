# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = [
    'CaaRecordRecord',
    'MxRecordRecord',
    'SrvRecordRecord',
    'TxtRecordRecord',
]

@pulumi.output_type
class CaaRecordRecord(dict):
    def __init__(__self__, *,
                 flags: float,
                 tag: str,
                 value: str):
        """
        :param float flags: Extensible CAA flags, currently only 1 is implemented to set the issuer critical flag.
        :param str tag: A property tag, options are issue, issuewild and iodef.
        :param str value: A property value such as a registrar domain.
        """
        pulumi.set(__self__, "flags", flags)
        pulumi.set(__self__, "tag", tag)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def flags(self) -> float:
        """
        Extensible CAA flags, currently only 1 is implemented to set the issuer critical flag.
        """
        return pulumi.get(self, "flags")

    @property
    @pulumi.getter
    def tag(self) -> str:
        """
        A property tag, options are issue, issuewild and iodef.
        """
        return pulumi.get(self, "tag")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        A property value such as a registrar domain.
        """
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class MxRecordRecord(dict):
    def __init__(__self__, *,
                 exchange: str,
                 preference: str):
        """
        :param str exchange: The mail server responsible for the domain covered by the MX record.
        :param str preference: String representing the "preference” value of the MX records. Records with lower preference value take priority.
        """
        pulumi.set(__self__, "exchange", exchange)
        pulumi.set(__self__, "preference", preference)

    @property
    @pulumi.getter
    def exchange(self) -> str:
        """
        The mail server responsible for the domain covered by the MX record.
        """
        return pulumi.get(self, "exchange")

    @property
    @pulumi.getter
    def preference(self) -> str:
        """
        String representing the "preference” value of the MX records. Records with lower preference value take priority.
        """
        return pulumi.get(self, "preference")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class SrvRecordRecord(dict):
    def __init__(__self__, *,
                 port: float,
                 priority: float,
                 target: str,
                 weight: float):
        """
        :param float port: Port the service is listening on.
        :param float priority: Priority of the SRV record.
        :param str target: FQDN of the service.
        :param float weight: Weight of the SRV record.
        """
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "target", target)
        pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def port(self) -> float:
        """
        Port the service is listening on.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> float:
        """
        Priority of the SRV record.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def target(self) -> str:
        """
        FQDN of the service.
        """
        return pulumi.get(self, "target")

    @property
    @pulumi.getter
    def weight(self) -> float:
        """
        Weight of the SRV record.
        """
        return pulumi.get(self, "weight")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class TxtRecordRecord(dict):
    def __init__(__self__, *,
                 value: str):
        """
        :param str value: The value of the record. Max length: 1024 characters
        """
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The value of the record. Max length: 1024 characters
        """
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

