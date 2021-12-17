// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package synapse

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type WorkspaceKey struct {
	pulumi.CustomResourceState

	Active pulumi.BoolOutput `pulumi:"active"`
	// Deprecated: As this property name contained a typo originally, please switch to using 'customer_managed_key_name' instead.
	CusomterManagedKeyName          pulumi.StringOutput    `pulumi:"cusomterManagedKeyName"`
	CustomerManagedKeyName          pulumi.StringOutput    `pulumi:"customerManagedKeyName"`
	CustomerManagedKeyVersionlessId pulumi.StringPtrOutput `pulumi:"customerManagedKeyVersionlessId"`
	SynapseWorkspaceId              pulumi.StringOutput    `pulumi:"synapseWorkspaceId"`
}

// NewWorkspaceKey registers a new resource with the given unique name, arguments, and options.
func NewWorkspaceKey(ctx *pulumi.Context,
	name string, args *WorkspaceKeyArgs, opts ...pulumi.ResourceOption) (*WorkspaceKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Active == nil {
		return nil, errors.New("invalid value for required argument 'Active'")
	}
	if args.SynapseWorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'SynapseWorkspaceId'")
	}
	var resource WorkspaceKey
	err := ctx.RegisterResource("azure:synapse/workspaceKey:WorkspaceKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkspaceKey gets an existing WorkspaceKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkspaceKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkspaceKeyState, opts ...pulumi.ResourceOption) (*WorkspaceKey, error) {
	var resource WorkspaceKey
	err := ctx.ReadResource("azure:synapse/workspaceKey:WorkspaceKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkspaceKey resources.
type workspaceKeyState struct {
	Active *bool `pulumi:"active"`
	// Deprecated: As this property name contained a typo originally, please switch to using 'customer_managed_key_name' instead.
	CusomterManagedKeyName          *string `pulumi:"cusomterManagedKeyName"`
	CustomerManagedKeyName          *string `pulumi:"customerManagedKeyName"`
	CustomerManagedKeyVersionlessId *string `pulumi:"customerManagedKeyVersionlessId"`
	SynapseWorkspaceId              *string `pulumi:"synapseWorkspaceId"`
}

type WorkspaceKeyState struct {
	Active pulumi.BoolPtrInput
	// Deprecated: As this property name contained a typo originally, please switch to using 'customer_managed_key_name' instead.
	CusomterManagedKeyName          pulumi.StringPtrInput
	CustomerManagedKeyName          pulumi.StringPtrInput
	CustomerManagedKeyVersionlessId pulumi.StringPtrInput
	SynapseWorkspaceId              pulumi.StringPtrInput
}

func (WorkspaceKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceKeyState)(nil)).Elem()
}

type workspaceKeyArgs struct {
	Active bool `pulumi:"active"`
	// Deprecated: As this property name contained a typo originally, please switch to using 'customer_managed_key_name' instead.
	CusomterManagedKeyName          *string `pulumi:"cusomterManagedKeyName"`
	CustomerManagedKeyName          *string `pulumi:"customerManagedKeyName"`
	CustomerManagedKeyVersionlessId *string `pulumi:"customerManagedKeyVersionlessId"`
	SynapseWorkspaceId              string  `pulumi:"synapseWorkspaceId"`
}

// The set of arguments for constructing a WorkspaceKey resource.
type WorkspaceKeyArgs struct {
	Active pulumi.BoolInput
	// Deprecated: As this property name contained a typo originally, please switch to using 'customer_managed_key_name' instead.
	CusomterManagedKeyName          pulumi.StringPtrInput
	CustomerManagedKeyName          pulumi.StringPtrInput
	CustomerManagedKeyVersionlessId pulumi.StringPtrInput
	SynapseWorkspaceId              pulumi.StringInput
}

func (WorkspaceKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceKeyArgs)(nil)).Elem()
}

type WorkspaceKeyInput interface {
	pulumi.Input

	ToWorkspaceKeyOutput() WorkspaceKeyOutput
	ToWorkspaceKeyOutputWithContext(ctx context.Context) WorkspaceKeyOutput
}

func (*WorkspaceKey) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkspaceKey)(nil))
}

func (i *WorkspaceKey) ToWorkspaceKeyOutput() WorkspaceKeyOutput {
	return i.ToWorkspaceKeyOutputWithContext(context.Background())
}

func (i *WorkspaceKey) ToWorkspaceKeyOutputWithContext(ctx context.Context) WorkspaceKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceKeyOutput)
}

func (i *WorkspaceKey) ToWorkspaceKeyPtrOutput() WorkspaceKeyPtrOutput {
	return i.ToWorkspaceKeyPtrOutputWithContext(context.Background())
}

func (i *WorkspaceKey) ToWorkspaceKeyPtrOutputWithContext(ctx context.Context) WorkspaceKeyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceKeyPtrOutput)
}

type WorkspaceKeyPtrInput interface {
	pulumi.Input

	ToWorkspaceKeyPtrOutput() WorkspaceKeyPtrOutput
	ToWorkspaceKeyPtrOutputWithContext(ctx context.Context) WorkspaceKeyPtrOutput
}

type workspaceKeyPtrType WorkspaceKeyArgs

func (*workspaceKeyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceKey)(nil))
}

func (i *workspaceKeyPtrType) ToWorkspaceKeyPtrOutput() WorkspaceKeyPtrOutput {
	return i.ToWorkspaceKeyPtrOutputWithContext(context.Background())
}

func (i *workspaceKeyPtrType) ToWorkspaceKeyPtrOutputWithContext(ctx context.Context) WorkspaceKeyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceKeyPtrOutput)
}

// WorkspaceKeyArrayInput is an input type that accepts WorkspaceKeyArray and WorkspaceKeyArrayOutput values.
// You can construct a concrete instance of `WorkspaceKeyArrayInput` via:
//
//          WorkspaceKeyArray{ WorkspaceKeyArgs{...} }
type WorkspaceKeyArrayInput interface {
	pulumi.Input

	ToWorkspaceKeyArrayOutput() WorkspaceKeyArrayOutput
	ToWorkspaceKeyArrayOutputWithContext(context.Context) WorkspaceKeyArrayOutput
}

type WorkspaceKeyArray []WorkspaceKeyInput

func (WorkspaceKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceKey)(nil)).Elem()
}

func (i WorkspaceKeyArray) ToWorkspaceKeyArrayOutput() WorkspaceKeyArrayOutput {
	return i.ToWorkspaceKeyArrayOutputWithContext(context.Background())
}

func (i WorkspaceKeyArray) ToWorkspaceKeyArrayOutputWithContext(ctx context.Context) WorkspaceKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceKeyArrayOutput)
}

// WorkspaceKeyMapInput is an input type that accepts WorkspaceKeyMap and WorkspaceKeyMapOutput values.
// You can construct a concrete instance of `WorkspaceKeyMapInput` via:
//
//          WorkspaceKeyMap{ "key": WorkspaceKeyArgs{...} }
type WorkspaceKeyMapInput interface {
	pulumi.Input

	ToWorkspaceKeyMapOutput() WorkspaceKeyMapOutput
	ToWorkspaceKeyMapOutputWithContext(context.Context) WorkspaceKeyMapOutput
}

type WorkspaceKeyMap map[string]WorkspaceKeyInput

func (WorkspaceKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceKey)(nil)).Elem()
}

func (i WorkspaceKeyMap) ToWorkspaceKeyMapOutput() WorkspaceKeyMapOutput {
	return i.ToWorkspaceKeyMapOutputWithContext(context.Background())
}

func (i WorkspaceKeyMap) ToWorkspaceKeyMapOutputWithContext(ctx context.Context) WorkspaceKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceKeyMapOutput)
}

type WorkspaceKeyOutput struct{ *pulumi.OutputState }

func (WorkspaceKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkspaceKey)(nil))
}

func (o WorkspaceKeyOutput) ToWorkspaceKeyOutput() WorkspaceKeyOutput {
	return o
}

func (o WorkspaceKeyOutput) ToWorkspaceKeyOutputWithContext(ctx context.Context) WorkspaceKeyOutput {
	return o
}

func (o WorkspaceKeyOutput) ToWorkspaceKeyPtrOutput() WorkspaceKeyPtrOutput {
	return o.ToWorkspaceKeyPtrOutputWithContext(context.Background())
}

func (o WorkspaceKeyOutput) ToWorkspaceKeyPtrOutputWithContext(ctx context.Context) WorkspaceKeyPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v WorkspaceKey) *WorkspaceKey {
		return &v
	}).(WorkspaceKeyPtrOutput)
}

type WorkspaceKeyPtrOutput struct{ *pulumi.OutputState }

func (WorkspaceKeyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceKey)(nil))
}

func (o WorkspaceKeyPtrOutput) ToWorkspaceKeyPtrOutput() WorkspaceKeyPtrOutput {
	return o
}

func (o WorkspaceKeyPtrOutput) ToWorkspaceKeyPtrOutputWithContext(ctx context.Context) WorkspaceKeyPtrOutput {
	return o
}

func (o WorkspaceKeyPtrOutput) Elem() WorkspaceKeyOutput {
	return o.ApplyT(func(v *WorkspaceKey) WorkspaceKey {
		if v != nil {
			return *v
		}
		var ret WorkspaceKey
		return ret
	}).(WorkspaceKeyOutput)
}

type WorkspaceKeyArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]WorkspaceKey)(nil))
}

func (o WorkspaceKeyArrayOutput) ToWorkspaceKeyArrayOutput() WorkspaceKeyArrayOutput {
	return o
}

func (o WorkspaceKeyArrayOutput) ToWorkspaceKeyArrayOutputWithContext(ctx context.Context) WorkspaceKeyArrayOutput {
	return o
}

func (o WorkspaceKeyArrayOutput) Index(i pulumi.IntInput) WorkspaceKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) WorkspaceKey {
		return vs[0].([]WorkspaceKey)[vs[1].(int)]
	}).(WorkspaceKeyOutput)
}

type WorkspaceKeyMapOutput struct{ *pulumi.OutputState }

func (WorkspaceKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]WorkspaceKey)(nil))
}

func (o WorkspaceKeyMapOutput) ToWorkspaceKeyMapOutput() WorkspaceKeyMapOutput {
	return o
}

func (o WorkspaceKeyMapOutput) ToWorkspaceKeyMapOutputWithContext(ctx context.Context) WorkspaceKeyMapOutput {
	return o
}

func (o WorkspaceKeyMapOutput) MapIndex(k pulumi.StringInput) WorkspaceKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) WorkspaceKey {
		return vs[0].(map[string]WorkspaceKey)[vs[1].(string)]
	}).(WorkspaceKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceKeyInput)(nil)).Elem(), &WorkspaceKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceKeyPtrInput)(nil)).Elem(), &WorkspaceKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceKeyArrayInput)(nil)).Elem(), WorkspaceKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceKeyMapInput)(nil)).Elem(), WorkspaceKeyMap{})
	pulumi.RegisterOutputType(WorkspaceKeyOutput{})
	pulumi.RegisterOutputType(WorkspaceKeyPtrOutput{})
	pulumi.RegisterOutputType(WorkspaceKeyArrayOutput{})
	pulumi.RegisterOutputType(WorkspaceKeyMapOutput{})
}