// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package appservice

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an App Service Web App or Function App Source Control Configuration.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/appservice"
// 	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
// 			Location: pulumi.String("West Europe"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleServicePlan, err := appservice.NewServicePlan(ctx, "exampleServicePlan", &appservice.ServicePlanArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Location:          pulumi.String("West Europe"),
// 			OsType:            pulumi.String("Linux"),
// 			SkuName:           pulumi.String("P1V2"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleLinuxWebApp, err := appservice.NewLinuxWebApp(ctx, "exampleLinuxWebApp", &appservice.LinuxWebAppArgs{
// 			ResourceGroupName: exampleResourceGroup.Name,
// 			Location:          exampleServicePlan.Location,
// 			ServicePlanId:     exampleServicePlan.ID(),
// 			SiteConfig:        nil,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = appservice.NewSourceControl(ctx, "exampleSourceControl", &appservice.SourceControlArgs{
// 			AppId:   exampleLinuxWebApp.ID(),
// 			RepoUrl: pulumi.String("https://github.com/Azure-Samples/python-docs-hello-world"),
// 			Branch:  pulumi.String("master"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// App Service Source Controls can be imported using the `resource id`, e.g.
//
// ```sh
//  $ pulumi import azure:appservice/sourceControl:SourceControl example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1
// ```
type SourceControl struct {
	pulumi.CustomResourceState

	// The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
	AppId pulumi.StringOutput `pulumi:"appId"`
	// The branch name to use for deployments. Changing this forces a new resource to be created.
	Branch pulumi.StringOutput `pulumi:"branch"`
	// A `githubActionConfiguration` block as defined below.
	GithubActionConfiguration SourceControlGithubActionConfigurationPtrOutput `pulumi:"githubActionConfiguration"`
	// The URL for the repository. Changing this forces a new resource to be created.
	RepoUrl pulumi.StringOutput `pulumi:"repoUrl"`
	// Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
	RollbackEnabled pulumi.BoolPtrOutput `pulumi:"rollbackEnabled"`
	// The SCM Type in use. This value is decoded by the service from the repository information supplied.
	ScmType pulumi.StringOutput `pulumi:"scmType"`
	// Should the App use local Git configuration. Changing this forces a new resource to be created.
	UseLocalGit pulumi.BoolPtrOutput `pulumi:"useLocalGit"`
	// Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
	UseManualIntegration pulumi.BoolPtrOutput `pulumi:"useManualIntegration"`
	// The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
	UseMercurial pulumi.BoolPtrOutput `pulumi:"useMercurial"`
	// Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
	UsesGithubAction pulumi.BoolOutput `pulumi:"usesGithubAction"`
}

// NewSourceControl registers a new resource with the given unique name, arguments, and options.
func NewSourceControl(ctx *pulumi.Context,
	name string, args *SourceControlArgs, opts ...pulumi.ResourceOption) (*SourceControl, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	var resource SourceControl
	err := ctx.RegisterResource("azure:appservice/sourceControl:SourceControl", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSourceControl gets an existing SourceControl resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSourceControl(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SourceControlState, opts ...pulumi.ResourceOption) (*SourceControl, error) {
	var resource SourceControl
	err := ctx.ReadResource("azure:appservice/sourceControl:SourceControl", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SourceControl resources.
type sourceControlState struct {
	// The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
	AppId *string `pulumi:"appId"`
	// The branch name to use for deployments. Changing this forces a new resource to be created.
	Branch *string `pulumi:"branch"`
	// A `githubActionConfiguration` block as defined below.
	GithubActionConfiguration *SourceControlGithubActionConfiguration `pulumi:"githubActionConfiguration"`
	// The URL for the repository. Changing this forces a new resource to be created.
	RepoUrl *string `pulumi:"repoUrl"`
	// Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
	RollbackEnabled *bool `pulumi:"rollbackEnabled"`
	// The SCM Type in use. This value is decoded by the service from the repository information supplied.
	ScmType *string `pulumi:"scmType"`
	// Should the App use local Git configuration. Changing this forces a new resource to be created.
	UseLocalGit *bool `pulumi:"useLocalGit"`
	// Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
	UseManualIntegration *bool `pulumi:"useManualIntegration"`
	// The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
	UseMercurial *bool `pulumi:"useMercurial"`
	// Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
	UsesGithubAction *bool `pulumi:"usesGithubAction"`
}

type SourceControlState struct {
	// The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
	AppId pulumi.StringPtrInput
	// The branch name to use for deployments. Changing this forces a new resource to be created.
	Branch pulumi.StringPtrInput
	// A `githubActionConfiguration` block as defined below.
	GithubActionConfiguration SourceControlGithubActionConfigurationPtrInput
	// The URL for the repository. Changing this forces a new resource to be created.
	RepoUrl pulumi.StringPtrInput
	// Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
	RollbackEnabled pulumi.BoolPtrInput
	// The SCM Type in use. This value is decoded by the service from the repository information supplied.
	ScmType pulumi.StringPtrInput
	// Should the App use local Git configuration. Changing this forces a new resource to be created.
	UseLocalGit pulumi.BoolPtrInput
	// Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
	UseManualIntegration pulumi.BoolPtrInput
	// The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
	UseMercurial pulumi.BoolPtrInput
	// Indicates if the Slot uses a GitHub action for deployment. This value is decoded by the service from the repository information supplied.
	UsesGithubAction pulumi.BoolPtrInput
}

func (SourceControlState) ElementType() reflect.Type {
	return reflect.TypeOf((*sourceControlState)(nil)).Elem()
}

type sourceControlArgs struct {
	// The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
	AppId string `pulumi:"appId"`
	// The branch name to use for deployments. Changing this forces a new resource to be created.
	Branch *string `pulumi:"branch"`
	// A `githubActionConfiguration` block as defined below.
	GithubActionConfiguration *SourceControlGithubActionConfiguration `pulumi:"githubActionConfiguration"`
	// The URL for the repository. Changing this forces a new resource to be created.
	RepoUrl *string `pulumi:"repoUrl"`
	// Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
	RollbackEnabled *bool `pulumi:"rollbackEnabled"`
	// Should the App use local Git configuration. Changing this forces a new resource to be created.
	UseLocalGit *bool `pulumi:"useLocalGit"`
	// Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
	UseManualIntegration *bool `pulumi:"useManualIntegration"`
	// The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
	UseMercurial *bool `pulumi:"useMercurial"`
}

// The set of arguments for constructing a SourceControl resource.
type SourceControlArgs struct {
	// The ID of the Windows or Linux Web App. Changing this forces a new resource to be created.
	AppId pulumi.StringInput
	// The branch name to use for deployments. Changing this forces a new resource to be created.
	Branch pulumi.StringPtrInput
	// A `githubActionConfiguration` block as defined below.
	GithubActionConfiguration SourceControlGithubActionConfigurationPtrInput
	// The URL for the repository. Changing this forces a new resource to be created.
	RepoUrl pulumi.StringPtrInput
	// Should the Deployment Rollback be enabled? Defaults to `false`. Changing this forces a new resource to be created.
	RollbackEnabled pulumi.BoolPtrInput
	// Should the App use local Git configuration. Changing this forces a new resource to be created.
	UseLocalGit pulumi.BoolPtrInput
	// Should code be deployed manually. Set to `false` to enable continuous integration, such as webhooks into online repos such as GitHub. Defaults to `false`. Changing this forces a new resource to be created.
	UseManualIntegration pulumi.BoolPtrInput
	// The repository specified is Mercurial. Defaults to `false`. Changing this forces a new resource to be created.
	UseMercurial pulumi.BoolPtrInput
}

func (SourceControlArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sourceControlArgs)(nil)).Elem()
}

type SourceControlInput interface {
	pulumi.Input

	ToSourceControlOutput() SourceControlOutput
	ToSourceControlOutputWithContext(ctx context.Context) SourceControlOutput
}

func (*SourceControl) ElementType() reflect.Type {
	return reflect.TypeOf((**SourceControl)(nil)).Elem()
}

func (i *SourceControl) ToSourceControlOutput() SourceControlOutput {
	return i.ToSourceControlOutputWithContext(context.Background())
}

func (i *SourceControl) ToSourceControlOutputWithContext(ctx context.Context) SourceControlOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SourceControlOutput)
}

// SourceControlArrayInput is an input type that accepts SourceControlArray and SourceControlArrayOutput values.
// You can construct a concrete instance of `SourceControlArrayInput` via:
//
//          SourceControlArray{ SourceControlArgs{...} }
type SourceControlArrayInput interface {
	pulumi.Input

	ToSourceControlArrayOutput() SourceControlArrayOutput
	ToSourceControlArrayOutputWithContext(context.Context) SourceControlArrayOutput
}

type SourceControlArray []SourceControlInput

func (SourceControlArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SourceControl)(nil)).Elem()
}

func (i SourceControlArray) ToSourceControlArrayOutput() SourceControlArrayOutput {
	return i.ToSourceControlArrayOutputWithContext(context.Background())
}

func (i SourceControlArray) ToSourceControlArrayOutputWithContext(ctx context.Context) SourceControlArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SourceControlArrayOutput)
}

// SourceControlMapInput is an input type that accepts SourceControlMap and SourceControlMapOutput values.
// You can construct a concrete instance of `SourceControlMapInput` via:
//
//          SourceControlMap{ "key": SourceControlArgs{...} }
type SourceControlMapInput interface {
	pulumi.Input

	ToSourceControlMapOutput() SourceControlMapOutput
	ToSourceControlMapOutputWithContext(context.Context) SourceControlMapOutput
}

type SourceControlMap map[string]SourceControlInput

func (SourceControlMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SourceControl)(nil)).Elem()
}

func (i SourceControlMap) ToSourceControlMapOutput() SourceControlMapOutput {
	return i.ToSourceControlMapOutputWithContext(context.Background())
}

func (i SourceControlMap) ToSourceControlMapOutputWithContext(ctx context.Context) SourceControlMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SourceControlMapOutput)
}

type SourceControlOutput struct{ *pulumi.OutputState }

func (SourceControlOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SourceControl)(nil)).Elem()
}

func (o SourceControlOutput) ToSourceControlOutput() SourceControlOutput {
	return o
}

func (o SourceControlOutput) ToSourceControlOutputWithContext(ctx context.Context) SourceControlOutput {
	return o
}

type SourceControlArrayOutput struct{ *pulumi.OutputState }

func (SourceControlArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SourceControl)(nil)).Elem()
}

func (o SourceControlArrayOutput) ToSourceControlArrayOutput() SourceControlArrayOutput {
	return o
}

func (o SourceControlArrayOutput) ToSourceControlArrayOutputWithContext(ctx context.Context) SourceControlArrayOutput {
	return o
}

func (o SourceControlArrayOutput) Index(i pulumi.IntInput) SourceControlOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SourceControl {
		return vs[0].([]*SourceControl)[vs[1].(int)]
	}).(SourceControlOutput)
}

type SourceControlMapOutput struct{ *pulumi.OutputState }

func (SourceControlMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SourceControl)(nil)).Elem()
}

func (o SourceControlMapOutput) ToSourceControlMapOutput() SourceControlMapOutput {
	return o
}

func (o SourceControlMapOutput) ToSourceControlMapOutputWithContext(ctx context.Context) SourceControlMapOutput {
	return o
}

func (o SourceControlMapOutput) MapIndex(k pulumi.StringInput) SourceControlOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SourceControl {
		return vs[0].(map[string]*SourceControl)[vs[1].(string)]
	}).(SourceControlOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SourceControlInput)(nil)).Elem(), &SourceControl{})
	pulumi.RegisterInputType(reflect.TypeOf((*SourceControlArrayInput)(nil)).Elem(), SourceControlArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SourceControlMapInput)(nil)).Elem(), SourceControlMap{})
	pulumi.RegisterOutputType(SourceControlOutput{})
	pulumi.RegisterOutputType(SourceControlArrayOutput{})
	pulumi.RegisterOutputType(SourceControlMapOutput{})
}