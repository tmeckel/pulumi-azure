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
    'ActiveRoleAssignmentScheduleArgs',
    'ActiveRoleAssignmentScheduleExpirationArgs',
    'ActiveRoleAssignmentTicketArgs',
    'EligibleRoleAssignmentScheduleArgs',
    'EligibleRoleAssignmentScheduleExpirationArgs',
    'EligibleRoleAssignmentTicketArgs',
]

@pulumi.input_type
class ActiveRoleAssignmentScheduleArgs:
    def __init__(__self__, *,
                 expiration: Optional[pulumi.Input['ActiveRoleAssignmentScheduleExpirationArgs']] = None,
                 start_date_time: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input['ActiveRoleAssignmentScheduleExpirationArgs'] expiration: A `expiration` block as defined above.
        :param pulumi.Input[str] start_date_time: The start date time of the role assignment. Changing this forces a new Pim Active Role Assignment to be created.
        """
        if expiration is not None:
            pulumi.set(__self__, "expiration", expiration)
        if start_date_time is not None:
            pulumi.set(__self__, "start_date_time", start_date_time)

    @property
    @pulumi.getter
    def expiration(self) -> Optional[pulumi.Input['ActiveRoleAssignmentScheduleExpirationArgs']]:
        """
        A `expiration` block as defined above.
        """
        return pulumi.get(self, "expiration")

    @expiration.setter
    def expiration(self, value: Optional[pulumi.Input['ActiveRoleAssignmentScheduleExpirationArgs']]):
        pulumi.set(self, "expiration", value)

    @property
    @pulumi.getter(name="startDateTime")
    def start_date_time(self) -> Optional[pulumi.Input[str]]:
        """
        The start date time of the role assignment. Changing this forces a new Pim Active Role Assignment to be created.
        """
        return pulumi.get(self, "start_date_time")

    @start_date_time.setter
    def start_date_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_date_time", value)


@pulumi.input_type
class ActiveRoleAssignmentScheduleExpirationArgs:
    def __init__(__self__, *,
                 duration_days: Optional[pulumi.Input[int]] = None,
                 duration_hours: Optional[pulumi.Input[int]] = None,
                 end_date_time: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[int] duration_days: The duration of the role assignment in days. Conflicts with `schedule.0.expiration.0.duration_hours`,`schedule.0.expiration.0.end_date_time` Changing this forces a new Pim Active Role Assignment to be created.
        :param pulumi.Input[int] duration_hours: The duration of the role assignment in hours. Conflicts with `schedule.0.expiration.0.duration_days`,`schedule.0.expiration.0.end_date_time` Changing this forces a new Pim Active Role Assignment to be created.
        :param pulumi.Input[str] end_date_time: The end date time of the role assignment. Conflicts with `schedule.0.expiration.0.duration_days`,`schedule.0.expiration.0.duration_hours` Changing this forces a new Pim Active Role Assignment to be created.
        """
        if duration_days is not None:
            pulumi.set(__self__, "duration_days", duration_days)
        if duration_hours is not None:
            pulumi.set(__self__, "duration_hours", duration_hours)
        if end_date_time is not None:
            pulumi.set(__self__, "end_date_time", end_date_time)

    @property
    @pulumi.getter(name="durationDays")
    def duration_days(self) -> Optional[pulumi.Input[int]]:
        """
        The duration of the role assignment in days. Conflicts with `schedule.0.expiration.0.duration_hours`,`schedule.0.expiration.0.end_date_time` Changing this forces a new Pim Active Role Assignment to be created.
        """
        return pulumi.get(self, "duration_days")

    @duration_days.setter
    def duration_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration_days", value)

    @property
    @pulumi.getter(name="durationHours")
    def duration_hours(self) -> Optional[pulumi.Input[int]]:
        """
        The duration of the role assignment in hours. Conflicts with `schedule.0.expiration.0.duration_days`,`schedule.0.expiration.0.end_date_time` Changing this forces a new Pim Active Role Assignment to be created.
        """
        return pulumi.get(self, "duration_hours")

    @duration_hours.setter
    def duration_hours(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration_hours", value)

    @property
    @pulumi.getter(name="endDateTime")
    def end_date_time(self) -> Optional[pulumi.Input[str]]:
        """
        The end date time of the role assignment. Conflicts with `schedule.0.expiration.0.duration_days`,`schedule.0.expiration.0.duration_hours` Changing this forces a new Pim Active Role Assignment to be created.
        """
        return pulumi.get(self, "end_date_time")

    @end_date_time.setter
    def end_date_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date_time", value)


@pulumi.input_type
class ActiveRoleAssignmentTicketArgs:
    def __init__(__self__, *,
                 number: Optional[pulumi.Input[str]] = None,
                 system: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] number: The ticket number.
        :param pulumi.Input[str] system: The ticket system.
        """
        if number is not None:
            pulumi.set(__self__, "number", number)
        if system is not None:
            pulumi.set(__self__, "system", system)

    @property
    @pulumi.getter
    def number(self) -> Optional[pulumi.Input[str]]:
        """
        The ticket number.
        """
        return pulumi.get(self, "number")

    @number.setter
    def number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "number", value)

    @property
    @pulumi.getter
    def system(self) -> Optional[pulumi.Input[str]]:
        """
        The ticket system.
        """
        return pulumi.get(self, "system")

    @system.setter
    def system(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "system", value)


@pulumi.input_type
class EligibleRoleAssignmentScheduleArgs:
    def __init__(__self__, *,
                 expiration: Optional[pulumi.Input['EligibleRoleAssignmentScheduleExpirationArgs']] = None,
                 start_date_time: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input['EligibleRoleAssignmentScheduleExpirationArgs'] expiration: A `expiration` block as defined above.
        :param pulumi.Input[str] start_date_time: The start date time of the role assignment. Changing this forces a new Pim Eligible Role Assignment to be created.
        """
        if expiration is not None:
            pulumi.set(__self__, "expiration", expiration)
        if start_date_time is not None:
            pulumi.set(__self__, "start_date_time", start_date_time)

    @property
    @pulumi.getter
    def expiration(self) -> Optional[pulumi.Input['EligibleRoleAssignmentScheduleExpirationArgs']]:
        """
        A `expiration` block as defined above.
        """
        return pulumi.get(self, "expiration")

    @expiration.setter
    def expiration(self, value: Optional[pulumi.Input['EligibleRoleAssignmentScheduleExpirationArgs']]):
        pulumi.set(self, "expiration", value)

    @property
    @pulumi.getter(name="startDateTime")
    def start_date_time(self) -> Optional[pulumi.Input[str]]:
        """
        The start date time of the role assignment. Changing this forces a new Pim Eligible Role Assignment to be created.
        """
        return pulumi.get(self, "start_date_time")

    @start_date_time.setter
    def start_date_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_date_time", value)


@pulumi.input_type
class EligibleRoleAssignmentScheduleExpirationArgs:
    def __init__(__self__, *,
                 duration_days: Optional[pulumi.Input[int]] = None,
                 duration_hours: Optional[pulumi.Input[int]] = None,
                 end_date_time: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[int] duration_days: The duration of the role assignment in days. Conflicts with `schedule.0.expiration.0.duration_hours`,`schedule.0.expiration.0.end_date_time` Changing this forces a new Pim Eligible Role Assignment to be created.
        :param pulumi.Input[int] duration_hours: The duration of the role assignment in hours. Conflicts with `schedule.0.expiration.0.duration_days`,`schedule.0.expiration.0.end_date_time` Changing this forces a new Pim Eligible Role Assignment to be created.
        :param pulumi.Input[str] end_date_time: The end date time of the role assignment. Conflicts with `schedule.0.expiration.0.duration_days`,`schedule.0.expiration.0.duration_hours` Changing this forces a new Pim Eligible Role Assignment to be created.
        """
        if duration_days is not None:
            pulumi.set(__self__, "duration_days", duration_days)
        if duration_hours is not None:
            pulumi.set(__self__, "duration_hours", duration_hours)
        if end_date_time is not None:
            pulumi.set(__self__, "end_date_time", end_date_time)

    @property
    @pulumi.getter(name="durationDays")
    def duration_days(self) -> Optional[pulumi.Input[int]]:
        """
        The duration of the role assignment in days. Conflicts with `schedule.0.expiration.0.duration_hours`,`schedule.0.expiration.0.end_date_time` Changing this forces a new Pim Eligible Role Assignment to be created.
        """
        return pulumi.get(self, "duration_days")

    @duration_days.setter
    def duration_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration_days", value)

    @property
    @pulumi.getter(name="durationHours")
    def duration_hours(self) -> Optional[pulumi.Input[int]]:
        """
        The duration of the role assignment in hours. Conflicts with `schedule.0.expiration.0.duration_days`,`schedule.0.expiration.0.end_date_time` Changing this forces a new Pim Eligible Role Assignment to be created.
        """
        return pulumi.get(self, "duration_hours")

    @duration_hours.setter
    def duration_hours(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration_hours", value)

    @property
    @pulumi.getter(name="endDateTime")
    def end_date_time(self) -> Optional[pulumi.Input[str]]:
        """
        The end date time of the role assignment. Conflicts with `schedule.0.expiration.0.duration_days`,`schedule.0.expiration.0.duration_hours` Changing this forces a new Pim Eligible Role Assignment to be created.
        """
        return pulumi.get(self, "end_date_time")

    @end_date_time.setter
    def end_date_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date_time", value)


@pulumi.input_type
class EligibleRoleAssignmentTicketArgs:
    def __init__(__self__, *,
                 number: Optional[pulumi.Input[str]] = None,
                 system: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] number: The ticket number.
        :param pulumi.Input[str] system: The ticket system.
        """
        if number is not None:
            pulumi.set(__self__, "number", number)
        if system is not None:
            pulumi.set(__self__, "system", system)

    @property
    @pulumi.getter
    def number(self) -> Optional[pulumi.Input[str]]:
        """
        The ticket number.
        """
        return pulumi.get(self, "number")

    @number.setter
    def number(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "number", value)

    @property
    @pulumi.getter
    def system(self) -> Optional[pulumi.Input[str]]:
        """
        The ticket system.
        """
        return pulumi.get(self, "system")

    @system.setter
    def system(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "system", value)

