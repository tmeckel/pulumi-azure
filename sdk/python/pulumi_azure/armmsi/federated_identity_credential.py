# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FederatedIdentityCredentialArgs', 'FederatedIdentityCredential']

@pulumi.input_type
class FederatedIdentityCredentialArgs:
    def __init__(__self__, *,
                 audience: pulumi.Input[str],
                 issuer: pulumi.Input[str],
                 parent_id: pulumi.Input[str],
                 resource_group_name: pulumi.Input[str],
                 subject: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FederatedIdentityCredential resource.
        :param pulumi.Input[str] audience: Specifies the audience for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] issuer: Specifies the issuer of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] parent_id: Specifies parent ID of User Assigned Identity for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group within which this Federated Identity Credential should exist. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] subject: Specifies the subject for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] name: Specifies the name of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        pulumi.set(__self__, "audience", audience)
        pulumi.set(__self__, "issuer", issuer)
        pulumi.set(__self__, "parent_id", parent_id)
        pulumi.set(__self__, "resource_group_name", resource_group_name)
        pulumi.set(__self__, "subject", subject)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def audience(self) -> pulumi.Input[str]:
        """
        Specifies the audience for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "audience")

    @audience.setter
    def audience(self, value: pulumi.Input[str]):
        pulumi.set(self, "audience", value)

    @property
    @pulumi.getter
    def issuer(self) -> pulumi.Input[str]:
        """
        Specifies the issuer of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "issuer")

    @issuer.setter
    def issuer(self, value: pulumi.Input[str]):
        pulumi.set(self, "issuer", value)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> pulumi.Input[str]:
        """
        Specifies parent ID of User Assigned Identity for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "parent_id")

    @parent_id.setter
    def parent_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "parent_id", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Input[str]:
        """
        Specifies the name of the Resource Group within which this Federated Identity Credential should exist. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter
    def subject(self) -> pulumi.Input[str]:
        """
        Specifies the subject for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "subject")

    @subject.setter
    def subject(self, value: pulumi.Input[str]):
        pulumi.set(self, "subject", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _FederatedIdentityCredentialState:
    def __init__(__self__, *,
                 audience: Optional[pulumi.Input[str]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 subject: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering FederatedIdentityCredential resources.
        :param pulumi.Input[str] audience: Specifies the audience for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] issuer: Specifies the issuer of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] name: Specifies the name of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] parent_id: Specifies parent ID of User Assigned Identity for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group within which this Federated Identity Credential should exist. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] subject: Specifies the subject for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        if audience is not None:
            pulumi.set(__self__, "audience", audience)
        if issuer is not None:
            pulumi.set(__self__, "issuer", issuer)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent_id is not None:
            pulumi.set(__self__, "parent_id", parent_id)
        if resource_group_name is not None:
            pulumi.set(__self__, "resource_group_name", resource_group_name)
        if subject is not None:
            pulumi.set(__self__, "subject", subject)

    @property
    @pulumi.getter
    def audience(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the audience for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "audience")

    @audience.setter
    def audience(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "audience", value)

    @property
    @pulumi.getter
    def issuer(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the issuer of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "issuer")

    @issuer.setter
    def issuer(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "issuer", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies parent ID of User Assigned Identity for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "parent_id")

    @parent_id.setter
    def parent_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_id", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the Resource Group within which this Federated Identity Credential should exist. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter
    def subject(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the subject for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "subject")

    @subject.setter
    def subject(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subject", value)


class FederatedIdentityCredential(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audience: Optional[pulumi.Input[str]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 subject: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Federated Identity Credential.

        ## Import

        An existing Federated Identity Credential can be imported into Terraform using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:armmsi/federatedIdentityCredential:FederatedIdentityCredential example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{parentIdentityName}/federatedIdentityCredentials/{resourceName}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] audience: Specifies the audience for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] issuer: Specifies the issuer of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] name: Specifies the name of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] parent_id: Specifies parent ID of User Assigned Identity for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group within which this Federated Identity Credential should exist. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] subject: Specifies the subject for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FederatedIdentityCredentialArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Federated Identity Credential.

        ## Import

        An existing Federated Identity Credential can be imported into Terraform using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:armmsi/federatedIdentityCredential:FederatedIdentityCredential example /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{parentIdentityName}/federatedIdentityCredentials/{resourceName}
        ```

        :param str resource_name: The name of the resource.
        :param FederatedIdentityCredentialArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FederatedIdentityCredentialArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 audience: Optional[pulumi.Input[str]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 subject: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FederatedIdentityCredentialArgs.__new__(FederatedIdentityCredentialArgs)

            if audience is None and not opts.urn:
                raise TypeError("Missing required property 'audience'")
            __props__.__dict__["audience"] = audience
            if issuer is None and not opts.urn:
                raise TypeError("Missing required property 'issuer'")
            __props__.__dict__["issuer"] = issuer
            __props__.__dict__["name"] = name
            if parent_id is None and not opts.urn:
                raise TypeError("Missing required property 'parent_id'")
            __props__.__dict__["parent_id"] = parent_id
            if resource_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'resource_group_name'")
            __props__.__dict__["resource_group_name"] = resource_group_name
            if subject is None and not opts.urn:
                raise TypeError("Missing required property 'subject'")
            __props__.__dict__["subject"] = subject
        super(FederatedIdentityCredential, __self__).__init__(
            'azure:armmsi/federatedIdentityCredential:FederatedIdentityCredential',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            audience: Optional[pulumi.Input[str]] = None,
            issuer: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parent_id: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            subject: Optional[pulumi.Input[str]] = None) -> 'FederatedIdentityCredential':
        """
        Get an existing FederatedIdentityCredential resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] audience: Specifies the audience for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] issuer: Specifies the issuer of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] name: Specifies the name of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] parent_id: Specifies parent ID of User Assigned Identity for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] resource_group_name: Specifies the name of the Resource Group within which this Federated Identity Credential should exist. Changing this forces a new Federated Identity Credential to be created.
        :param pulumi.Input[str] subject: Specifies the subject for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FederatedIdentityCredentialState.__new__(_FederatedIdentityCredentialState)

        __props__.__dict__["audience"] = audience
        __props__.__dict__["issuer"] = issuer
        __props__.__dict__["name"] = name
        __props__.__dict__["parent_id"] = parent_id
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["subject"] = subject
        return FederatedIdentityCredential(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def audience(self) -> pulumi.Output[str]:
        """
        Specifies the audience for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "audience")

    @property
    @pulumi.getter
    def issuer(self) -> pulumi.Output[str]:
        """
        Specifies the issuer of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "issuer")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> pulumi.Output[str]:
        """
        Specifies parent ID of User Assigned Identity for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "parent_id")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the Resource Group within which this Federated Identity Credential should exist. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter
    def subject(self) -> pulumi.Output[str]:
        """
        Specifies the subject for this Federated Identity Credential. Changing this forces a new Federated Identity Credential to be created.
        """
        return pulumi.get(self, "subject")
