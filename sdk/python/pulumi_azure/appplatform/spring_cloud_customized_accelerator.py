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

__all__ = ['SpringCloudCustomizedAcceleratorArgs', 'SpringCloudCustomizedAccelerator']

@pulumi.input_type
class SpringCloudCustomizedAcceleratorArgs:
    def __init__(__self__, *,
                 git_repository: pulumi.Input['SpringCloudCustomizedAcceleratorGitRepositoryArgs'],
                 spring_cloud_accelerator_id: pulumi.Input[str],
                 accelerator_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 icon_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SpringCloudCustomizedAccelerator resource.
        :param pulumi.Input['SpringCloudCustomizedAcceleratorGitRepositoryArgs'] git_repository: A `git_repository` block as defined below.
        :param pulumi.Input[str] spring_cloud_accelerator_id: The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] accelerator_tags: Specifies a list of accelerator tags.
        :param pulumi.Input[str] description: Specifies the description of the Spring Cloud Customized Accelerator.
        :param pulumi.Input[str] display_name: Specifies the display name of the Spring Cloud Customized Accelerator..
        :param pulumi.Input[str] icon_url: Specifies the icon URL of the Spring Cloud Customized Accelerator..
        :param pulumi.Input[str] name: The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        """
        pulumi.set(__self__, "git_repository", git_repository)
        pulumi.set(__self__, "spring_cloud_accelerator_id", spring_cloud_accelerator_id)
        if accelerator_tags is not None:
            pulumi.set(__self__, "accelerator_tags", accelerator_tags)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if icon_url is not None:
            pulumi.set(__self__, "icon_url", icon_url)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="gitRepository")
    def git_repository(self) -> pulumi.Input['SpringCloudCustomizedAcceleratorGitRepositoryArgs']:
        """
        A `git_repository` block as defined below.
        """
        return pulumi.get(self, "git_repository")

    @git_repository.setter
    def git_repository(self, value: pulumi.Input['SpringCloudCustomizedAcceleratorGitRepositoryArgs']):
        pulumi.set(self, "git_repository", value)

    @property
    @pulumi.getter(name="springCloudAcceleratorId")
    def spring_cloud_accelerator_id(self) -> pulumi.Input[str]:
        """
        The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        """
        return pulumi.get(self, "spring_cloud_accelerator_id")

    @spring_cloud_accelerator_id.setter
    def spring_cloud_accelerator_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "spring_cloud_accelerator_id", value)

    @property
    @pulumi.getter(name="acceleratorTags")
    def accelerator_tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies a list of accelerator tags.
        """
        return pulumi.get(self, "accelerator_tags")

    @accelerator_tags.setter
    def accelerator_tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "accelerator_tags", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the description of the Spring Cloud Customized Accelerator.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the display name of the Spring Cloud Customized Accelerator..
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="iconUrl")
    def icon_url(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the icon URL of the Spring Cloud Customized Accelerator..
        """
        return pulumi.get(self, "icon_url")

    @icon_url.setter
    def icon_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "icon_url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SpringCloudCustomizedAcceleratorState:
    def __init__(__self__, *,
                 accelerator_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 git_repository: Optional[pulumi.Input['SpringCloudCustomizedAcceleratorGitRepositoryArgs']] = None,
                 icon_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 spring_cloud_accelerator_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SpringCloudCustomizedAccelerator resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] accelerator_tags: Specifies a list of accelerator tags.
        :param pulumi.Input[str] description: Specifies the description of the Spring Cloud Customized Accelerator.
        :param pulumi.Input[str] display_name: Specifies the display name of the Spring Cloud Customized Accelerator..
        :param pulumi.Input['SpringCloudCustomizedAcceleratorGitRepositoryArgs'] git_repository: A `git_repository` block as defined below.
        :param pulumi.Input[str] icon_url: Specifies the icon URL of the Spring Cloud Customized Accelerator..
        :param pulumi.Input[str] name: The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        :param pulumi.Input[str] spring_cloud_accelerator_id: The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        """
        if accelerator_tags is not None:
            pulumi.set(__self__, "accelerator_tags", accelerator_tags)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if git_repository is not None:
            pulumi.set(__self__, "git_repository", git_repository)
        if icon_url is not None:
            pulumi.set(__self__, "icon_url", icon_url)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if spring_cloud_accelerator_id is not None:
            pulumi.set(__self__, "spring_cloud_accelerator_id", spring_cloud_accelerator_id)

    @property
    @pulumi.getter(name="acceleratorTags")
    def accelerator_tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies a list of accelerator tags.
        """
        return pulumi.get(self, "accelerator_tags")

    @accelerator_tags.setter
    def accelerator_tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "accelerator_tags", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the description of the Spring Cloud Customized Accelerator.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the display name of the Spring Cloud Customized Accelerator..
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="gitRepository")
    def git_repository(self) -> Optional[pulumi.Input['SpringCloudCustomizedAcceleratorGitRepositoryArgs']]:
        """
        A `git_repository` block as defined below.
        """
        return pulumi.get(self, "git_repository")

    @git_repository.setter
    def git_repository(self, value: Optional[pulumi.Input['SpringCloudCustomizedAcceleratorGitRepositoryArgs']]):
        pulumi.set(self, "git_repository", value)

    @property
    @pulumi.getter(name="iconUrl")
    def icon_url(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the icon URL of the Spring Cloud Customized Accelerator..
        """
        return pulumi.get(self, "icon_url")

    @icon_url.setter
    def icon_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "icon_url", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="springCloudAcceleratorId")
    def spring_cloud_accelerator_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        """
        return pulumi.get(self, "spring_cloud_accelerator_id")

    @spring_cloud_accelerator_id.setter
    def spring_cloud_accelerator_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "spring_cloud_accelerator_id", value)


class SpringCloudCustomizedAccelerator(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accelerator_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 git_repository: Optional[pulumi.Input[pulumi.InputType['SpringCloudCustomizedAcceleratorGitRepositoryArgs']]] = None,
                 icon_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 spring_cloud_accelerator_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Spring Cloud Customized Accelerator.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="west europe")
        example_spring_cloud_service = azure.appplatform.SpringCloudService("exampleSpringCloudService",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku_name="E0")
        example_spring_cloud_accelerator = azure.appplatform.SpringCloudAccelerator("exampleSpringCloudAccelerator", spring_cloud_service_id=example_spring_cloud_service.id)
        example_spring_cloud_customized_accelerator = azure.appplatform.SpringCloudCustomizedAccelerator("exampleSpringCloudCustomizedAccelerator",
            spring_cloud_accelerator_id=example_spring_cloud_accelerator.id,
            git_repository=azure.appplatform.SpringCloudCustomizedAcceleratorGitRepositoryArgs(
                url="https://github.com/Azure-Samples/piggymetrics",
                git_tag="spring.version.2.0.3",
                interval_in_seconds=100,
            ),
            accelerator_tags=[
                "tag-a",
                "tag-b",
            ],
            description="example description",
            display_name="example name",
            icon_url="https://images.freecreatives.com/wp-content/uploads/2015/05/smiley-559124_640.jpg")
        ```

        ## Import

        Spring Cloud Customized Accelerators can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:appplatform/springCloudCustomizedAccelerator:SpringCloudCustomizedAccelerator example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.AppPlatform/Spring/spring1/applicationAccelerators/default/customizedAccelerators/customizedAccelerator1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] accelerator_tags: Specifies a list of accelerator tags.
        :param pulumi.Input[str] description: Specifies the description of the Spring Cloud Customized Accelerator.
        :param pulumi.Input[str] display_name: Specifies the display name of the Spring Cloud Customized Accelerator..
        :param pulumi.Input[pulumi.InputType['SpringCloudCustomizedAcceleratorGitRepositoryArgs']] git_repository: A `git_repository` block as defined below.
        :param pulumi.Input[str] icon_url: Specifies the icon URL of the Spring Cloud Customized Accelerator..
        :param pulumi.Input[str] name: The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        :param pulumi.Input[str] spring_cloud_accelerator_id: The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SpringCloudCustomizedAcceleratorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Spring Cloud Customized Accelerator.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_azure as azure

        example_resource_group = azure.core.ResourceGroup("exampleResourceGroup", location="west europe")
        example_spring_cloud_service = azure.appplatform.SpringCloudService("exampleSpringCloudService",
            location=example_resource_group.location,
            resource_group_name=example_resource_group.name,
            sku_name="E0")
        example_spring_cloud_accelerator = azure.appplatform.SpringCloudAccelerator("exampleSpringCloudAccelerator", spring_cloud_service_id=example_spring_cloud_service.id)
        example_spring_cloud_customized_accelerator = azure.appplatform.SpringCloudCustomizedAccelerator("exampleSpringCloudCustomizedAccelerator",
            spring_cloud_accelerator_id=example_spring_cloud_accelerator.id,
            git_repository=azure.appplatform.SpringCloudCustomizedAcceleratorGitRepositoryArgs(
                url="https://github.com/Azure-Samples/piggymetrics",
                git_tag="spring.version.2.0.3",
                interval_in_seconds=100,
            ),
            accelerator_tags=[
                "tag-a",
                "tag-b",
            ],
            description="example description",
            display_name="example name",
            icon_url="https://images.freecreatives.com/wp-content/uploads/2015/05/smiley-559124_640.jpg")
        ```

        ## Import

        Spring Cloud Customized Accelerators can be imported using the `resource id`, e.g.

        ```sh
         $ pulumi import azure:appplatform/springCloudCustomizedAccelerator:SpringCloudCustomizedAccelerator example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.AppPlatform/Spring/spring1/applicationAccelerators/default/customizedAccelerators/customizedAccelerator1
        ```

        :param str resource_name: The name of the resource.
        :param SpringCloudCustomizedAcceleratorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SpringCloudCustomizedAcceleratorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accelerator_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 git_repository: Optional[pulumi.Input[pulumi.InputType['SpringCloudCustomizedAcceleratorGitRepositoryArgs']]] = None,
                 icon_url: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 spring_cloud_accelerator_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SpringCloudCustomizedAcceleratorArgs.__new__(SpringCloudCustomizedAcceleratorArgs)

            __props__.__dict__["accelerator_tags"] = accelerator_tags
            __props__.__dict__["description"] = description
            __props__.__dict__["display_name"] = display_name
            if git_repository is None and not opts.urn:
                raise TypeError("Missing required property 'git_repository'")
            __props__.__dict__["git_repository"] = git_repository
            __props__.__dict__["icon_url"] = icon_url
            __props__.__dict__["name"] = name
            if spring_cloud_accelerator_id is None and not opts.urn:
                raise TypeError("Missing required property 'spring_cloud_accelerator_id'")
            __props__.__dict__["spring_cloud_accelerator_id"] = spring_cloud_accelerator_id
        super(SpringCloudCustomizedAccelerator, __self__).__init__(
            'azure:appplatform/springCloudCustomizedAccelerator:SpringCloudCustomizedAccelerator',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accelerator_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            git_repository: Optional[pulumi.Input[pulumi.InputType['SpringCloudCustomizedAcceleratorGitRepositoryArgs']]] = None,
            icon_url: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            spring_cloud_accelerator_id: Optional[pulumi.Input[str]] = None) -> 'SpringCloudCustomizedAccelerator':
        """
        Get an existing SpringCloudCustomizedAccelerator resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] accelerator_tags: Specifies a list of accelerator tags.
        :param pulumi.Input[str] description: Specifies the description of the Spring Cloud Customized Accelerator.
        :param pulumi.Input[str] display_name: Specifies the display name of the Spring Cloud Customized Accelerator..
        :param pulumi.Input[pulumi.InputType['SpringCloudCustomizedAcceleratorGitRepositoryArgs']] git_repository: A `git_repository` block as defined below.
        :param pulumi.Input[str] icon_url: Specifies the icon URL of the Spring Cloud Customized Accelerator..
        :param pulumi.Input[str] name: The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        :param pulumi.Input[str] spring_cloud_accelerator_id: The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SpringCloudCustomizedAcceleratorState.__new__(_SpringCloudCustomizedAcceleratorState)

        __props__.__dict__["accelerator_tags"] = accelerator_tags
        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["git_repository"] = git_repository
        __props__.__dict__["icon_url"] = icon_url
        __props__.__dict__["name"] = name
        __props__.__dict__["spring_cloud_accelerator_id"] = spring_cloud_accelerator_id
        return SpringCloudCustomizedAccelerator(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="acceleratorTags")
    def accelerator_tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Specifies a list of accelerator tags.
        """
        return pulumi.get(self, "accelerator_tags")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the description of the Spring Cloud Customized Accelerator.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the display name of the Spring Cloud Customized Accelerator..
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="gitRepository")
    def git_repository(self) -> pulumi.Output['outputs.SpringCloudCustomizedAcceleratorGitRepository']:
        """
        A `git_repository` block as defined below.
        """
        return pulumi.get(self, "git_repository")

    @property
    @pulumi.getter(name="iconUrl")
    def icon_url(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the icon URL of the Spring Cloud Customized Accelerator..
        """
        return pulumi.get(self, "icon_url")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name which should be used for this Spring Cloud Customized Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="springCloudAcceleratorId")
    def spring_cloud_accelerator_id(self) -> pulumi.Output[str]:
        """
        The ID of the Spring Cloud Accelerator. Changing this forces a new Spring Cloud Customized Accelerator to be created.
        """
        return pulumi.get(self, "spring_cloud_accelerator_id")
