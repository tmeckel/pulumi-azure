// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package monitoring

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Data Collection Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//	"fmt"
//
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/core"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/monitoring"
//	"github.com/pulumi/pulumi-azure/sdk/v5/go/azure/operationalinsights"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleResourceGroup, err := core.NewResourceGroup(ctx, "exampleResourceGroup", &core.ResourceGroupArgs{
//				Location: pulumi.String("West Europe"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleAnalyticsWorkspace, err := operationalinsights.NewAnalyticsWorkspace(ctx, "exampleAnalyticsWorkspace", &operationalinsights.AnalyticsWorkspaceArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//			})
//			if err != nil {
//				return err
//			}
//			exampleAnalyticsSolution, err := operationalinsights.NewAnalyticsSolution(ctx, "exampleAnalyticsSolution", &operationalinsights.AnalyticsSolutionArgs{
//				SolutionName:        pulumi.String("WindowsEventForwarding"),
//				Location:            exampleResourceGroup.Location,
//				ResourceGroupName:   exampleResourceGroup.Name,
//				WorkspaceResourceId: exampleAnalyticsWorkspace.ID(),
//				WorkspaceName:       exampleAnalyticsWorkspace.Name,
//				Plan: &operationalinsights.AnalyticsSolutionPlanArgs{
//					Publisher: pulumi.String("Microsoft"),
//					Product:   pulumi.String("OMSGallery/WindowsEventForwarding"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"a": 1,
//				"b": "hello",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = monitoring.NewDataCollectionRule(ctx, "exampleDataCollectionRule", &monitoring.DataCollectionRuleArgs{
//				ResourceGroupName: exampleResourceGroup.Name,
//				Location:          exampleResourceGroup.Location,
//				Destinations: &monitoring.DataCollectionRuleDestinationsArgs{
//					LogAnalytics: monitoring.DataCollectionRuleDestinationsLogAnalyticArray{
//						&monitoring.DataCollectionRuleDestinationsLogAnalyticArgs{
//							WorkspaceResourceId: exampleAnalyticsWorkspace.ID(),
//							Name:                pulumi.String("test-destination-log"),
//						},
//					},
//					AzureMonitorMetrics: &monitoring.DataCollectionRuleDestinationsAzureMonitorMetricsArgs{
//						Name: pulumi.String("test-destination-metrics"),
//					},
//				},
//				DataFlows: monitoring.DataCollectionRuleDataFlowArray{
//					&monitoring.DataCollectionRuleDataFlowArgs{
//						Streams: pulumi.StringArray{
//							pulumi.String("Microsoft-InsightsMetrics"),
//						},
//						Destinations: pulumi.StringArray{
//							pulumi.String("test-destination-metrics"),
//						},
//					},
//					&monitoring.DataCollectionRuleDataFlowArgs{
//						Streams: pulumi.StringArray{
//							pulumi.String("Microsoft-InsightsMetrics"),
//							pulumi.String("Microsoft-Syslog"),
//							pulumi.String("Microsoft-Perf"),
//						},
//						Destinations: pulumi.StringArray{
//							pulumi.String("test-destination-log"),
//						},
//					},
//				},
//				DataSources: &monitoring.DataCollectionRuleDataSourcesArgs{
//					Syslogs: monitoring.DataCollectionRuleDataSourcesSyslogArray{
//						&monitoring.DataCollectionRuleDataSourcesSyslogArgs{
//							FacilityNames: pulumi.StringArray{
//								pulumi.String("*"),
//							},
//							LogLevels: pulumi.StringArray{
//								pulumi.String("*"),
//							},
//							Name: pulumi.String("test-datasource-syslog"),
//						},
//					},
//					PerformanceCounters: monitoring.DataCollectionRuleDataSourcesPerformanceCounterArray{
//						&monitoring.DataCollectionRuleDataSourcesPerformanceCounterArgs{
//							Streams: pulumi.StringArray{
//								pulumi.String("Microsoft-Perf"),
//								pulumi.String("Microsoft-InsightsMetrics"),
//							},
//							SamplingFrequencyInSeconds: pulumi.Int(10),
//							CounterSpecifiers: pulumi.StringArray{
//								pulumi.String(fmt.Sprintf("Processor(*)\\%v Processor Time", "%")),
//							},
//							Name: pulumi.String("test-datasource-perfcounter"),
//						},
//					},
//					WindowsEventLogs: monitoring.DataCollectionRuleDataSourcesWindowsEventLogArray{
//						&monitoring.DataCollectionRuleDataSourcesWindowsEventLogArgs{
//							Streams: pulumi.StringArray{
//								pulumi.String("Microsoft-WindowsEvent"),
//							},
//							XPathQueries: pulumi.StringArray{
//								pulumi.String("*[System/Level=1]"),
//							},
//							Name: pulumi.String("test-datasource-wineventlog"),
//						},
//					},
//					Extensions: monitoring.DataCollectionRuleDataSourcesExtensionArray{
//						&monitoring.DataCollectionRuleDataSourcesExtensionArgs{
//							Streams: pulumi.StringArray{
//								pulumi.String("Microsoft-WindowsEvent"),
//							},
//							InputDataSources: pulumi.StringArray{
//								pulumi.String("test-datasource-wineventlog"),
//							},
//							ExtensionName: pulumi.String("test-extension-name"),
//							ExtensionJson: pulumi.String(json0),
//							Name:          pulumi.String("test-datasource-extension"),
//						},
//					},
//				},
//				Description: pulumi.String("data collection rule example"),
//				Tags: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				exampleAnalyticsSolution,
//			}))
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
// Data Collection Rules can be imported using the `resource id`, e.g.
//
// ```sh
//
//	$ pulumi import azure:monitoring/dataCollectionRule:DataCollectionRule example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/group1/providers/Microsoft.Insights/dataCollectionRules/rule1
//
// ```
type DataCollectionRule struct {
	pulumi.CustomResourceState

	// One or more `dataFlow` blocks as defined below.
	DataFlows DataCollectionRuleDataFlowArrayOutput `pulumi:"dataFlows"`
	// A `dataSources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
	DataSources DataCollectionRuleDataSourcesPtrOutput `pulumi:"dataSources"`
	// The description of the Data Collection Rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A `destinations` block as defined below.
	Destinations DataCollectionRuleDestinationsOutput `pulumi:"destinations"`
	// The kind of the Data Collection Rule. Possible values are `Linux` and `Windows`. A rule of kind `Linux` does not allow for `windowsEventLog` data sources. And a rule of kind `Windows` does not allow for `syslog` data sources. If kind is not specified, all kinds of data sources are allowed.
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// The Azure Region where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
	Location pulumi.StringOutput `pulumi:"location"`
	// The name which should be used for this Data Collection Rule. Changing this forces a new Data Collection Rule to be created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Resource Group where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
	ResourceGroupName pulumi.StringOutput `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Data Collection Rule.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewDataCollectionRule registers a new resource with the given unique name, arguments, and options.
func NewDataCollectionRule(ctx *pulumi.Context,
	name string, args *DataCollectionRuleArgs, opts ...pulumi.ResourceOption) (*DataCollectionRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataFlows == nil {
		return nil, errors.New("invalid value for required argument 'DataFlows'")
	}
	if args.Destinations == nil {
		return nil, errors.New("invalid value for required argument 'Destinations'")
	}
	if args.ResourceGroupName == nil {
		return nil, errors.New("invalid value for required argument 'ResourceGroupName'")
	}
	var resource DataCollectionRule
	err := ctx.RegisterResource("azure:monitoring/dataCollectionRule:DataCollectionRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataCollectionRule gets an existing DataCollectionRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataCollectionRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataCollectionRuleState, opts ...pulumi.ResourceOption) (*DataCollectionRule, error) {
	var resource DataCollectionRule
	err := ctx.ReadResource("azure:monitoring/dataCollectionRule:DataCollectionRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataCollectionRule resources.
type dataCollectionRuleState struct {
	// One or more `dataFlow` blocks as defined below.
	DataFlows []DataCollectionRuleDataFlow `pulumi:"dataFlows"`
	// A `dataSources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
	DataSources *DataCollectionRuleDataSources `pulumi:"dataSources"`
	// The description of the Data Collection Rule.
	Description *string `pulumi:"description"`
	// A `destinations` block as defined below.
	Destinations *DataCollectionRuleDestinations `pulumi:"destinations"`
	// The kind of the Data Collection Rule. Possible values are `Linux` and `Windows`. A rule of kind `Linux` does not allow for `windowsEventLog` data sources. And a rule of kind `Windows` does not allow for `syslog` data sources. If kind is not specified, all kinds of data sources are allowed.
	Kind *string `pulumi:"kind"`
	// The Azure Region where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Data Collection Rule. Changing this forces a new Data Collection Rule to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
	ResourceGroupName *string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Data Collection Rule.
	Tags map[string]string `pulumi:"tags"`
}

type DataCollectionRuleState struct {
	// One or more `dataFlow` blocks as defined below.
	DataFlows DataCollectionRuleDataFlowArrayInput
	// A `dataSources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
	DataSources DataCollectionRuleDataSourcesPtrInput
	// The description of the Data Collection Rule.
	Description pulumi.StringPtrInput
	// A `destinations` block as defined below.
	Destinations DataCollectionRuleDestinationsPtrInput
	// The kind of the Data Collection Rule. Possible values are `Linux` and `Windows`. A rule of kind `Linux` does not allow for `windowsEventLog` data sources. And a rule of kind `Windows` does not allow for `syslog` data sources. If kind is not specified, all kinds of data sources are allowed.
	Kind pulumi.StringPtrInput
	// The Azure Region where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Data Collection Rule. Changing this forces a new Data Collection Rule to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
	ResourceGroupName pulumi.StringPtrInput
	// A mapping of tags which should be assigned to the Data Collection Rule.
	Tags pulumi.StringMapInput
}

func (DataCollectionRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataCollectionRuleState)(nil)).Elem()
}

type dataCollectionRuleArgs struct {
	// One or more `dataFlow` blocks as defined below.
	DataFlows []DataCollectionRuleDataFlow `pulumi:"dataFlows"`
	// A `dataSources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
	DataSources *DataCollectionRuleDataSources `pulumi:"dataSources"`
	// The description of the Data Collection Rule.
	Description *string `pulumi:"description"`
	// A `destinations` block as defined below.
	Destinations DataCollectionRuleDestinations `pulumi:"destinations"`
	// The kind of the Data Collection Rule. Possible values are `Linux` and `Windows`. A rule of kind `Linux` does not allow for `windowsEventLog` data sources. And a rule of kind `Windows` does not allow for `syslog` data sources. If kind is not specified, all kinds of data sources are allowed.
	Kind *string `pulumi:"kind"`
	// The Azure Region where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
	Location *string `pulumi:"location"`
	// The name which should be used for this Data Collection Rule. Changing this forces a new Data Collection Rule to be created.
	Name *string `pulumi:"name"`
	// The name of the Resource Group where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
	ResourceGroupName string `pulumi:"resourceGroupName"`
	// A mapping of tags which should be assigned to the Data Collection Rule.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a DataCollectionRule resource.
type DataCollectionRuleArgs struct {
	// One or more `dataFlow` blocks as defined below.
	DataFlows DataCollectionRuleDataFlowArrayInput
	// A `dataSources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
	DataSources DataCollectionRuleDataSourcesPtrInput
	// The description of the Data Collection Rule.
	Description pulumi.StringPtrInput
	// A `destinations` block as defined below.
	Destinations DataCollectionRuleDestinationsInput
	// The kind of the Data Collection Rule. Possible values are `Linux` and `Windows`. A rule of kind `Linux` does not allow for `windowsEventLog` data sources. And a rule of kind `Windows` does not allow for `syslog` data sources. If kind is not specified, all kinds of data sources are allowed.
	Kind pulumi.StringPtrInput
	// The Azure Region where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
	Location pulumi.StringPtrInput
	// The name which should be used for this Data Collection Rule. Changing this forces a new Data Collection Rule to be created.
	Name pulumi.StringPtrInput
	// The name of the Resource Group where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
	ResourceGroupName pulumi.StringInput
	// A mapping of tags which should be assigned to the Data Collection Rule.
	Tags pulumi.StringMapInput
}

func (DataCollectionRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataCollectionRuleArgs)(nil)).Elem()
}

type DataCollectionRuleInput interface {
	pulumi.Input

	ToDataCollectionRuleOutput() DataCollectionRuleOutput
	ToDataCollectionRuleOutputWithContext(ctx context.Context) DataCollectionRuleOutput
}

func (*DataCollectionRule) ElementType() reflect.Type {
	return reflect.TypeOf((**DataCollectionRule)(nil)).Elem()
}

func (i *DataCollectionRule) ToDataCollectionRuleOutput() DataCollectionRuleOutput {
	return i.ToDataCollectionRuleOutputWithContext(context.Background())
}

func (i *DataCollectionRule) ToDataCollectionRuleOutputWithContext(ctx context.Context) DataCollectionRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataCollectionRuleOutput)
}

// DataCollectionRuleArrayInput is an input type that accepts DataCollectionRuleArray and DataCollectionRuleArrayOutput values.
// You can construct a concrete instance of `DataCollectionRuleArrayInput` via:
//
//	DataCollectionRuleArray{ DataCollectionRuleArgs{...} }
type DataCollectionRuleArrayInput interface {
	pulumi.Input

	ToDataCollectionRuleArrayOutput() DataCollectionRuleArrayOutput
	ToDataCollectionRuleArrayOutputWithContext(context.Context) DataCollectionRuleArrayOutput
}

type DataCollectionRuleArray []DataCollectionRuleInput

func (DataCollectionRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataCollectionRule)(nil)).Elem()
}

func (i DataCollectionRuleArray) ToDataCollectionRuleArrayOutput() DataCollectionRuleArrayOutput {
	return i.ToDataCollectionRuleArrayOutputWithContext(context.Background())
}

func (i DataCollectionRuleArray) ToDataCollectionRuleArrayOutputWithContext(ctx context.Context) DataCollectionRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataCollectionRuleArrayOutput)
}

// DataCollectionRuleMapInput is an input type that accepts DataCollectionRuleMap and DataCollectionRuleMapOutput values.
// You can construct a concrete instance of `DataCollectionRuleMapInput` via:
//
//	DataCollectionRuleMap{ "key": DataCollectionRuleArgs{...} }
type DataCollectionRuleMapInput interface {
	pulumi.Input

	ToDataCollectionRuleMapOutput() DataCollectionRuleMapOutput
	ToDataCollectionRuleMapOutputWithContext(context.Context) DataCollectionRuleMapOutput
}

type DataCollectionRuleMap map[string]DataCollectionRuleInput

func (DataCollectionRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataCollectionRule)(nil)).Elem()
}

func (i DataCollectionRuleMap) ToDataCollectionRuleMapOutput() DataCollectionRuleMapOutput {
	return i.ToDataCollectionRuleMapOutputWithContext(context.Background())
}

func (i DataCollectionRuleMap) ToDataCollectionRuleMapOutputWithContext(ctx context.Context) DataCollectionRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataCollectionRuleMapOutput)
}

type DataCollectionRuleOutput struct{ *pulumi.OutputState }

func (DataCollectionRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataCollectionRule)(nil)).Elem()
}

func (o DataCollectionRuleOutput) ToDataCollectionRuleOutput() DataCollectionRuleOutput {
	return o
}

func (o DataCollectionRuleOutput) ToDataCollectionRuleOutputWithContext(ctx context.Context) DataCollectionRuleOutput {
	return o
}

// One or more `dataFlow` blocks as defined below.
func (o DataCollectionRuleOutput) DataFlows() DataCollectionRuleDataFlowArrayOutput {
	return o.ApplyT(func(v *DataCollectionRule) DataCollectionRuleDataFlowArrayOutput { return v.DataFlows }).(DataCollectionRuleDataFlowArrayOutput)
}

// A `dataSources` block as defined below. This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
func (o DataCollectionRuleOutput) DataSources() DataCollectionRuleDataSourcesPtrOutput {
	return o.ApplyT(func(v *DataCollectionRule) DataCollectionRuleDataSourcesPtrOutput { return v.DataSources }).(DataCollectionRuleDataSourcesPtrOutput)
}

// The description of the Data Collection Rule.
func (o DataCollectionRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DataCollectionRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A `destinations` block as defined below.
func (o DataCollectionRuleOutput) Destinations() DataCollectionRuleDestinationsOutput {
	return o.ApplyT(func(v *DataCollectionRule) DataCollectionRuleDestinationsOutput { return v.Destinations }).(DataCollectionRuleDestinationsOutput)
}

// The kind of the Data Collection Rule. Possible values are `Linux` and `Windows`. A rule of kind `Linux` does not allow for `windowsEventLog` data sources. And a rule of kind `Windows` does not allow for `syslog` data sources. If kind is not specified, all kinds of data sources are allowed.
func (o DataCollectionRuleOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DataCollectionRule) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// The Azure Region where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
func (o DataCollectionRuleOutput) Location() pulumi.StringOutput {
	return o.ApplyT(func(v *DataCollectionRule) pulumi.StringOutput { return v.Location }).(pulumi.StringOutput)
}

// The name which should be used for this Data Collection Rule. Changing this forces a new Data Collection Rule to be created.
func (o DataCollectionRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DataCollectionRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Resource Group where the Data Collection Rule should exist. Changing this forces a new Data Collection Rule to be created.
func (o DataCollectionRuleOutput) ResourceGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *DataCollectionRule) pulumi.StringOutput { return v.ResourceGroupName }).(pulumi.StringOutput)
}

// A mapping of tags which should be assigned to the Data Collection Rule.
func (o DataCollectionRuleOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DataCollectionRule) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

type DataCollectionRuleArrayOutput struct{ *pulumi.OutputState }

func (DataCollectionRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataCollectionRule)(nil)).Elem()
}

func (o DataCollectionRuleArrayOutput) ToDataCollectionRuleArrayOutput() DataCollectionRuleArrayOutput {
	return o
}

func (o DataCollectionRuleArrayOutput) ToDataCollectionRuleArrayOutputWithContext(ctx context.Context) DataCollectionRuleArrayOutput {
	return o
}

func (o DataCollectionRuleArrayOutput) Index(i pulumi.IntInput) DataCollectionRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataCollectionRule {
		return vs[0].([]*DataCollectionRule)[vs[1].(int)]
	}).(DataCollectionRuleOutput)
}

type DataCollectionRuleMapOutput struct{ *pulumi.OutputState }

func (DataCollectionRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataCollectionRule)(nil)).Elem()
}

func (o DataCollectionRuleMapOutput) ToDataCollectionRuleMapOutput() DataCollectionRuleMapOutput {
	return o
}

func (o DataCollectionRuleMapOutput) ToDataCollectionRuleMapOutputWithContext(ctx context.Context) DataCollectionRuleMapOutput {
	return o
}

func (o DataCollectionRuleMapOutput) MapIndex(k pulumi.StringInput) DataCollectionRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataCollectionRule {
		return vs[0].(map[string]*DataCollectionRule)[vs[1].(string)]
	}).(DataCollectionRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataCollectionRuleInput)(nil)).Elem(), &DataCollectionRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataCollectionRuleArrayInput)(nil)).Elem(), DataCollectionRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataCollectionRuleMapInput)(nil)).Elem(), DataCollectionRuleMap{})
	pulumi.RegisterOutputType(DataCollectionRuleOutput{})
	pulumi.RegisterOutputType(DataCollectionRuleArrayOutput{})
	pulumi.RegisterOutputType(DataCollectionRuleMapOutput{})
}