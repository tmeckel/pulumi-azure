// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package automation

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Automation Hybrid Runbook Worker.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/automation"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := automation.NewHybridRunbookWorker(ctx, "example", &automation.HybridRunbookWorkerArgs{
//				ResourceGroupName:     pulumi.Any(azurerm_resource_group.Test.Name),
//				AutomationAccountName: pulumi.Any(azurerm_automation_account.Test.Name),
//				WorkerGroupName:       pulumi.Any(azurerm_automation_hybrid_runbook_worker_group.Test.Name),
//				VmResourceId:          pulumi.Any(azurerm_linux_virtual_machine.Test.Id),
//				WorkerId:              pulumi.String("00000000-0000-0000-0000-000000000000"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Automations can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:automation/hybridRunbookWorker:HybridRunbookWorker example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/hybridRunbookWorkerGroups/group1/hybridRunbookWorkers/00000000-0000-0000-0000-000000000000
//
// ```
type HybridRunbookWorker struct {
	pulumi.CustomResourceState

	// The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringOutput `pulumi:"automationAccountName"`
	// The IP address of assigned machine.
	Ip pulumi.StringOutput `pulumi:"ip"`
	// Last Heartbeat from the Worker.
	LastSeenDateTime pulumi.StringOutput `pulumi:"lastSeenDateTime"`
	// The registration time of the worker machine.
	RegistrationDateTime pulumi.StringOutput `pulumi:"registrationDateTime"`
	// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
	VmResourceId pulumi.StringOutput `pulumi:"vmResourceId"`
	// The name of the HybridWorker Group. Changing this forces a new Automation to be created.
	WorkerGroupName pulumi.StringOutput `pulumi:"workerGroupName"`
	// The ID of the HybridWorker. Changing this forces a new Automation to be created.
	WorkerId pulumi.StringOutput `pulumi:"workerId"`
	// The name of HybridWorker.
	WorkerName pulumi.StringOutput `pulumi:"workerName"`
	// The type of the HybridWorker, the possible values are `HybridV1` and `HybridV2`.
	WorkerType pulumi.StringOutput `pulumi:"workerType"`
}

// NewHybridRunbookWorker registers a new resource with the given unique name, arguments, and options.
func NewHybridRunbookWorker(ctx *pulumi.Context,
	name string, args *HybridRunbookWorkerArgs, opts ...pulumi.ResourceOption) (*HybridRunbookWorker, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutomationAccountName == nil {
		return nil, errors.New("invalid value for required argument 'AutomationAccountName'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	if args.VmResourceId == nil {
		return nil, errors.New("invalid value for required argument 'VmResourceId'")
	}
	if args.WorkerGroupName == nil {
		return nil, errors.New("invalid value for required argument 'WorkerGroupName'")
	}
	if args.WorkerId == nil {
		return nil, errors.New("invalid value for required argument 'WorkerId'")
	}
	var resource HybridRunbookWorker
	err := ctx.RegisterResource("azure:automation/hybridRunbookWorker:HybridRunbookWorker", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHybridRunbookWorker gets an existing HybridRunbookWorker resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHybridRunbookWorker(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HybridRunbookWorkerState, opts ...pulumi.ResourceOption) (*HybridRunbookWorker, error) {
	var resource HybridRunbookWorker
	err := ctx.ReadResource("azure:automation/hybridRunbookWorker:HybridRunbookWorker", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HybridRunbookWorker resources.
type hybridRunbookWorkerState struct {
	// The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
	AutomationAccountName *string `pulumi:"automationAccountName"`
	// The IP address of assigned machine.
	Ip *string `pulumi:"ip"`
	// Last Heartbeat from the Worker.
	LastSeenDateTime *string `pulumi:"lastSeenDateTime"`
	// The registration time of the worker machine.
	RegistrationDateTime *string `pulumi:"registrationDateTime"`
	// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
	VmResourceId *string `pulumi:"vmResourceId"`
	// The name of the HybridWorker Group. Changing this forces a new Automation to be created.
	WorkerGroupName *string `pulumi:"workerGroupName"`
	// The ID of the HybridWorker. Changing this forces a new Automation to be created.
	WorkerId *string `pulumi:"workerId"`
	// The name of HybridWorker.
	WorkerName *string `pulumi:"workerName"`
	// The type of the HybridWorker, the possible values are `HybridV1` and `HybridV2`.
	WorkerType *string `pulumi:"workerType"`
}

type HybridRunbookWorkerState struct {
	// The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringPtrInput
	// The IP address of assigned machine.
	Ip pulumi.StringPtrInput
	// Last Heartbeat from the Worker.
	LastSeenDateTime pulumi.StringPtrInput
	// The registration time of the worker machine.
	RegistrationDateTime pulumi.StringPtrInput
	// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
	ResourceGroupName pulumi.StringPtrInput
	// The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
	VmResourceId pulumi.StringPtrInput
	// The name of the HybridWorker Group. Changing this forces a new Automation to be created.
	WorkerGroupName pulumi.StringPtrInput
	// The ID of the HybridWorker. Changing this forces a new Automation to be created.
	WorkerId pulumi.StringPtrInput
	// The name of HybridWorker.
	WorkerName pulumi.StringPtrInput
	// The type of the HybridWorker, the possible values are `HybridV1` and `HybridV2`.
	WorkerType pulumi.StringPtrInput
}

func (HybridRunbookWorkerState) ElementType() reflect.Type {
	return reflect.TypeOf((*hybridRunbookWorkerState)(nil)).Elem()
}

type hybridRunbookWorkerArgs struct {
	// The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
	AutomationAccountName string `pulumi:"automationAccountName"`
	// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
	VmResourceId string `pulumi:"vmResourceId"`
	// The name of the HybridWorker Group. Changing this forces a new Automation to be created.
	WorkerGroupName string `pulumi:"workerGroupName"`
	// The ID of the HybridWorker. Changing this forces a new Automation to be created.
	WorkerId string `pulumi:"workerId"`
}

// The set of arguments for constructing a HybridRunbookWorker resource.
type HybridRunbookWorkerArgs struct {
	// The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
	AutomationAccountName pulumi.StringInput
	// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
	ResourceGroupName pulumi.StringInput
	// The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
	VmResourceId pulumi.StringInput
	// The name of the HybridWorker Group. Changing this forces a new Automation to be created.
	WorkerGroupName pulumi.StringInput
	// The ID of the HybridWorker. Changing this forces a new Automation to be created.
	WorkerId pulumi.StringInput
}

func (HybridRunbookWorkerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hybridRunbookWorkerArgs)(nil)).Elem()
}

type HybridRunbookWorkerInput interface {
	pulumi.Input

	ToHybridRunbookWorkerOutput() HybridRunbookWorkerOutput
	ToHybridRunbookWorkerOutputWithContext(ctx context.Context) HybridRunbookWorkerOutput
}

func (*HybridRunbookWorker) ElementType() reflect.Type {
	return reflect.TypeOf((**HybridRunbookWorker)(nil)).Elem()
}

func (i *HybridRunbookWorker) ToHybridRunbookWorkerOutput() HybridRunbookWorkerOutput {
	return i.ToHybridRunbookWorkerOutputWithContext(context.Background())
}

func (i *HybridRunbookWorker) ToHybridRunbookWorkerOutputWithContext(ctx context.Context) HybridRunbookWorkerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HybridRunbookWorkerOutput)
}

// HybridRunbookWorkerArrayInput is an input type that accepts HybridRunbookWorkerArray and HybridRunbookWorkerArrayOutput values.
// You can construct a concrete instance of `HybridRunbookWorkerArrayInput` via:
//
//	HybridRunbookWorkerArray{ HybridRunbookWorkerArgs{...} }
type HybridRunbookWorkerArrayInput interface {
	pulumi.Input

	ToHybridRunbookWorkerArrayOutput() HybridRunbookWorkerArrayOutput
	ToHybridRunbookWorkerArrayOutputWithContext(context.Context) HybridRunbookWorkerArrayOutput
}

type HybridRunbookWorkerArray []HybridRunbookWorkerInput

func (HybridRunbookWorkerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HybridRunbookWorker)(nil)).Elem()
}

func (i HybridRunbookWorkerArray) ToHybridRunbookWorkerArrayOutput() HybridRunbookWorkerArrayOutput {
	return i.ToHybridRunbookWorkerArrayOutputWithContext(context.Background())
}

func (i HybridRunbookWorkerArray) ToHybridRunbookWorkerArrayOutputWithContext(ctx context.Context) HybridRunbookWorkerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HybridRunbookWorkerArrayOutput)
}

// HybridRunbookWorkerMapInput is an input type that accepts HybridRunbookWorkerMap and HybridRunbookWorkerMapOutput values.
// You can construct a concrete instance of `HybridRunbookWorkerMapInput` via:
//
//	HybridRunbookWorkerMap{ "key": HybridRunbookWorkerArgs{...} }
type HybridRunbookWorkerMapInput interface {
	pulumi.Input

	ToHybridRunbookWorkerMapOutput() HybridRunbookWorkerMapOutput
	ToHybridRunbookWorkerMapOutputWithContext(context.Context) HybridRunbookWorkerMapOutput
}

type HybridRunbookWorkerMap map[string]HybridRunbookWorkerInput

func (HybridRunbookWorkerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HybridRunbookWorker)(nil)).Elem()
}

func (i HybridRunbookWorkerMap) ToHybridRunbookWorkerMapOutput() HybridRunbookWorkerMapOutput {
	return i.ToHybridRunbookWorkerMapOutputWithContext(context.Background())
}

func (i HybridRunbookWorkerMap) ToHybridRunbookWorkerMapOutputWithContext(ctx context.Context) HybridRunbookWorkerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HybridRunbookWorkerMapOutput)
}

type HybridRunbookWorkerOutput struct{ *pulumi.OutputState }

func (HybridRunbookWorkerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HybridRunbookWorker)(nil)).Elem()
}

func (o HybridRunbookWorkerOutput) ToHybridRunbookWorkerOutput() HybridRunbookWorkerOutput {
	return o
}

func (o HybridRunbookWorkerOutput) ToHybridRunbookWorkerOutputWithContext(ctx context.Context) HybridRunbookWorkerOutput {
	return o
}

// The name of the automation account in which the Hybrid Worker is created. Changing this forces a new resource to be created.
func (o HybridRunbookWorkerOutput) AutomationAccountName() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridRunbookWorker) pulumi.StringOutput { return v.AutomationAccountName }).(pulumi.StringOutput)
}

// The IP address of assigned machine.
func (o HybridRunbookWorkerOutput) Ip() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridRunbookWorker) pulumi.StringOutput { return v.Ip }).(pulumi.StringOutput)
}

// Last Heartbeat from the Worker.
func (o HybridRunbookWorkerOutput) LastSeenDateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridRunbookWorker) pulumi.StringOutput { return v.LastSeenDateTime }).(pulumi.StringOutput)
}

// The registration time of the worker machine.
func (o HybridRunbookWorkerOutput) RegistrationDateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridRunbookWorker) pulumi.StringOutput { return v.RegistrationDateTime }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Automation should exist. Changing this forces a new Automation to be created.
func (o HybridRunbookWorkerOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridRunbookWorker) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// The ID of the virtual machine used for this HybridWorker. Changing this forces a new Automation to be created.
func (o HybridRunbookWorkerOutput) VmResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridRunbookWorker) pulumi.StringOutput { return v.VmResourceId }).(pulumi.StringOutput)
}

// The name of the HybridWorker Group. Changing this forces a new Automation to be created.
func (o HybridRunbookWorkerOutput) WorkerGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridRunbookWorker) pulumi.StringOutput { return v.WorkerGroupName }).(pulumi.StringOutput)
}

// The ID of the HybridWorker. Changing this forces a new Automation to be created.
func (o HybridRunbookWorkerOutput) WorkerId() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridRunbookWorker) pulumi.StringOutput { return v.WorkerId }).(pulumi.StringOutput)
}

// The name of HybridWorker.
func (o HybridRunbookWorkerOutput) WorkerName() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridRunbookWorker) pulumi.StringOutput { return v.WorkerName }).(pulumi.StringOutput)
}

// The type of the HybridWorker, the possible values are `HybridV1` and `HybridV2`.
func (o HybridRunbookWorkerOutput) WorkerType() pulumi.StringOutput {
	return o.ApplyT(func(v *HybridRunbookWorker) pulumi.StringOutput { return v.WorkerType }).(pulumi.StringOutput)
}

type HybridRunbookWorkerArrayOutput struct{ *pulumi.OutputState }

func (HybridRunbookWorkerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HybridRunbookWorker)(nil)).Elem()
}

func (o HybridRunbookWorkerArrayOutput) ToHybridRunbookWorkerArrayOutput() HybridRunbookWorkerArrayOutput {
	return o
}

func (o HybridRunbookWorkerArrayOutput) ToHybridRunbookWorkerArrayOutputWithContext(ctx context.Context) HybridRunbookWorkerArrayOutput {
	return o
}

func (o HybridRunbookWorkerArrayOutput) Index(i pulumi.IntInput) HybridRunbookWorkerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HybridRunbookWorker {
		return vs[0].([]*HybridRunbookWorker)[vs[1].(int)]
	}).(HybridRunbookWorkerOutput)
}

type HybridRunbookWorkerMapOutput struct{ *pulumi.OutputState }

func (HybridRunbookWorkerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HybridRunbookWorker)(nil)).Elem()
}

func (o HybridRunbookWorkerMapOutput) ToHybridRunbookWorkerMapOutput() HybridRunbookWorkerMapOutput {
	return o
}

func (o HybridRunbookWorkerMapOutput) ToHybridRunbookWorkerMapOutputWithContext(ctx context.Context) HybridRunbookWorkerMapOutput {
	return o
}

func (o HybridRunbookWorkerMapOutput) MapIndex(k pulumi.StringInput) HybridRunbookWorkerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HybridRunbookWorker {
		return vs[0].(map[string]*HybridRunbookWorker)[vs[1].(string)]
	}).(HybridRunbookWorkerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HybridRunbookWorkerInput)(nil)).Elem(), &HybridRunbookWorker{})
	pulumi.RegisterInputType(reflect.TypeOf((*HybridRunbookWorkerArrayInput)(nil)).Elem(), HybridRunbookWorkerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HybridRunbookWorkerMapInput)(nil)).Elem(), HybridRunbookWorkerMap{})
	pulumi.RegisterOutputType(HybridRunbookWorkerOutput{})
	pulumi.RegisterOutputType(HybridRunbookWorkerArrayOutput{})
	pulumi.RegisterOutputType(HybridRunbookWorkerMapOutput{})
}