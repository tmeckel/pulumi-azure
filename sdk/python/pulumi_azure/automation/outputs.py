# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'ModuleModuleLink',
    'ModuleModuleLinkHash',
    'RunBookJobSchedule',
    'RunBookPublishContentLink',
    'RunBookPublishContentLinkHash',
    'ScheduleMonthlyOccurrence',
]

@pulumi.output_type
class ModuleModuleLink(dict):
    def __init__(__self__, *,
                 uri: str,
                 hash: Optional['outputs.ModuleModuleLinkHash'] = None):
        """
        :param str uri: The uri of the module content (zip or nupkg).
        """
        pulumi.set(__self__, "uri", uri)
        if hash is not None:
            pulumi.set(__self__, "hash", hash)

    @property
    @pulumi.getter
    def uri(self) -> str:
        """
        The uri of the module content (zip or nupkg).
        """
        return pulumi.get(self, "uri")

    @property
    @pulumi.getter
    def hash(self) -> Optional['outputs.ModuleModuleLinkHash']:
        return pulumi.get(self, "hash")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ModuleModuleLinkHash(dict):
    def __init__(__self__, *,
                 algorithm: str,
                 value: str):
        pulumi.set(__self__, "algorithm", algorithm)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def algorithm(self) -> str:
        return pulumi.get(self, "algorithm")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class RunBookJobSchedule(dict):
    def __init__(__self__, *,
                 schedule_name: str,
                 job_schedule_id: Optional[str] = None,
                 parameters: Optional[Mapping[str, str]] = None,
                 run_on: Optional[str] = None):
        pulumi.set(__self__, "schedule_name", schedule_name)
        if job_schedule_id is not None:
            pulumi.set(__self__, "job_schedule_id", job_schedule_id)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if run_on is not None:
            pulumi.set(__self__, "run_on", run_on)

    @property
    @pulumi.getter(name="scheduleName")
    def schedule_name(self) -> str:
        return pulumi.get(self, "schedule_name")

    @property
    @pulumi.getter(name="jobScheduleId")
    def job_schedule_id(self) -> Optional[str]:
        return pulumi.get(self, "job_schedule_id")

    @property
    @pulumi.getter
    def parameters(self) -> Optional[Mapping[str, str]]:
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter(name="runOn")
    def run_on(self) -> Optional[str]:
        return pulumi.get(self, "run_on")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class RunBookPublishContentLink(dict):
    def __init__(__self__, *,
                 uri: str,
                 hash: Optional['outputs.RunBookPublishContentLinkHash'] = None,
                 version: Optional[str] = None):
        """
        :param str uri: The uri of the runbook content.
        """
        pulumi.set(__self__, "uri", uri)
        if hash is not None:
            pulumi.set(__self__, "hash", hash)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def uri(self) -> str:
        """
        The uri of the runbook content.
        """
        return pulumi.get(self, "uri")

    @property
    @pulumi.getter
    def hash(self) -> Optional['outputs.RunBookPublishContentLinkHash']:
        return pulumi.get(self, "hash")

    @property
    @pulumi.getter
    def version(self) -> Optional[str]:
        return pulumi.get(self, "version")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class RunBookPublishContentLinkHash(dict):
    def __init__(__self__, *,
                 algorithm: str,
                 value: str):
        pulumi.set(__self__, "algorithm", algorithm)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def algorithm(self) -> str:
        return pulumi.get(self, "algorithm")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class ScheduleMonthlyOccurrence(dict):
    def __init__(__self__, *,
                 day: str,
                 occurrence: float):
        """
        :param str day: Day of the occurrence. Must be one of `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Sunday`.
        :param float occurrence: Occurrence of the week within the month. Must be between `1` and `5`. `-1` for last week within the month.
        """
        pulumi.set(__self__, "day", day)
        pulumi.set(__self__, "occurrence", occurrence)

    @property
    @pulumi.getter
    def day(self) -> str:
        """
        Day of the occurrence. Must be one of `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`, `Saturday`, `Sunday`.
        """
        return pulumi.get(self, "day")

    @property
    @pulumi.getter
    def occurrence(self) -> float:
        """
        Occurrence of the week within the month. Must be between `1` and `5`. `-1` for last week within the month.
        """
        return pulumi.get(self, "occurrence")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

