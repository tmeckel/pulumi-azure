# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['NotificationRecipientUserArgs', 'NotificationRecipientUser']

@pulumi.input_type
class NotificationRecipientUserArgs:
    def __init__(__self__, *,
                 api_management_id: pulumi.Input[str],
                 notification_type: pulumi.Input[str],
                 user_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a NotificationRecipientUser resource.
        :param pulumi.Input[str] api_management_id: The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        :param pulumi.Input[str] notification_type: The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        :param pulumi.Input[str] user_id: The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        pulumi.set(__self__, "api_management_id", api_management_id)
        pulumi.set(__self__, "notification_type", notification_type)
        pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="apiManagementId")
    def api_management_id(self) -> pulumi.Input[str]:
        """
        The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "api_management_id")

    @api_management_id.setter
    def api_management_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "api_management_id", value)

    @property
    @pulumi.getter(name="notificationType")
    def notification_type(self) -> pulumi.Input[str]:
        """
        The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        """
        return pulumi.get(self, "notification_type")

    @notification_type.setter
    def notification_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "notification_type", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Input[str]:
        """
        The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _NotificationRecipientUserState:
    def __init__(__self__, *,
                 api_management_id: Optional[pulumi.Input[str]] = None,
                 notification_type: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NotificationRecipientUser resources.
        :param pulumi.Input[str] api_management_id: The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        :param pulumi.Input[str] notification_type: The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        :param pulumi.Input[str] user_id: The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        if api_management_id is not None:
            pulumi.set(__self__, "api_management_id", api_management_id)
        if notification_type is not None:
            pulumi.set(__self__, "notification_type", notification_type)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="apiManagementId")
    def api_management_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "api_management_id")

    @api_management_id.setter
    def api_management_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_management_id", value)

    @property
    @pulumi.getter(name="notificationType")
    def notification_type(self) -> Optional[pulumi.Input[str]]:
        """
        The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        """
        return pulumi.get(self, "notification_type")

    @notification_type.setter
    def notification_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notification_type", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class NotificationRecipientUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_management_id: Optional[pulumi.Input[str]] = None,
                 notification_type: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a API Management Notification Recipient User.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_service = azure.apimanagement.Service("exampleService",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            publisher_name="My Company",
            publisher_email="company@terraform.io",
            sku_name="Developer_1")
        example_user = azure.apimanagement.User("exampleUser",
            user_id="123",
            api_management_name=example_service.name,
            resource_group_name=example_resource_group.name,
            first_name="Example",
            last_name="User",
            email="foo@bar.com",
            state="active")
        example_notification_recipient_user = azure.apimanagement.NotificationRecipientUser("exampleNotificationRecipientUser",
            api_management_id=example_service.id,
            notification_type="AccountClosedPublisher",
            user_id=example_user.user_id)
        ```

        ## Import

        API Management Notification Recipient Users can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:apimanagement/notificationRecipientUser:NotificationRecipientUser example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/notifications/notificationName1/recipientUsers/userid1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_management_id: The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        :param pulumi.Input[str] notification_type: The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        :param pulumi.Input[str] user_id: The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NotificationRecipientUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a API Management Notification Recipient User.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="West Europe")
        example_service = azure.apimanagement.Service("exampleService",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            publisher_name="My Company",
            publisher_email="company@terraform.io",
            sku_name="Developer_1")
        example_user = azure.apimanagement.User("exampleUser",
            user_id="123",
            api_management_name=example_service.name,
            resource_group_name=example_resource_group.name,
            first_name="Example",
            last_name="User",
            email="foo@bar.com",
            state="active")
        example_notification_recipient_user = azure.apimanagement.NotificationRecipientUser("exampleNotificationRecipientUser",
            api_management_id=example_service.id,
            notification_type="AccountClosedPublisher",
            user_id=example_user.user_id)
        ```

        ## Import

        API Management Notification Recipient Users can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:apimanagement/notificationRecipientUser:NotificationRecipientUser example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.ApiManagement/service/service1/notifications/notificationName1/recipientUsers/userid1
        ```

        :param str resource_name: The name of the resource.
        :param NotificationRecipientUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NotificationRecipientUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_management_id: Optional[pulumi.Input[str]] = None,
                 notification_type: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NotificationRecipientUserArgs.__new__(NotificationRecipientUserArgs)

            if api_management_id is None and not opts.urn:
                raise TypeError("Missing required property 'api_management_id'")
            __props__.__dict__["api_management_id"] = api_management_id
            if notification_type is None and not opts.urn:
                raise TypeError("Missing required property 'notification_type'")
            __props__.__dict__["notification_type"] = notification_type
            if user_id is None and not opts.urn:
                raise TypeError("Missing required property 'user_id'")
            __props__.__dict__["user_id"] = user_id
        super(NotificationRecipientUser, __self__).__init__(
            'azure:apimanagement/notificationRecipientUser:NotificationRecipientUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_management_id: Optional[pulumi.Input[str]] = None,
            notification_type: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'NotificationRecipientUser':
        """
        Get an existing NotificationRecipientUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_management_id: The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        :param pulumi.Input[str] notification_type: The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        :param pulumi.Input[str] user_id: The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NotificationRecipientUserState.__new__(_NotificationRecipientUserState)

        __props__.__dict__["api_management_id"] = api_management_id
        __props__.__dict__["notification_type"] = notification_type
        __props__.__dict__["user_id"] = user_id
        return NotificationRecipientUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiManagementId")
    def api_management_id(self) -> pulumi.Output[str]:
        """
        The ID of the API Management Service from which to create this Notification Recipient User. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "api_management_id")

    @property
    @pulumi.getter(name="notificationType")
    def notification_type(self) -> pulumi.Output[str]:
        """
        The Notification Name to be received. Changing this forces a new API Management Notification Recipient User to be created. Possible values are `AccountClosedPublisher`, `BCC`, `NewApplicationNotificationMessage`, `NewIssuePublisherNotificationMessage`, `PurchasePublisherNotificationMessage`, `QuotaLimitApproachingPublisherNotificationMessage`, and `RequestPublisherNotificationMessage`.
        """
        return pulumi.get(self, "notification_type")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The recipient user ID. Changing this forces a new API Management Notification Recipient User to be created.
        """
        return pulumi.get(self, "user_id")
