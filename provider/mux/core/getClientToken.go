package core

import (
	"fmt"
	"reflect"

	"github.com/hashicorp/go-azure-sdk/sdk/environments"
	"github.com/pulumi/pulumi-azure/provider/v5/mux/config"
	"github.com/pulumi/pulumi-azure/provider/v5/pkg/util"
	p "github.com/pulumi/pulumi-go-provider"
	"github.com/pulumi/pulumi-go-provider/infer"
)

type TokenScope string

var _ = (infer.Enum[TokenScope])((*TokenScope)(nil))

const (
	MicrosoftGraph                                    TokenScope = "MicrosoftGraph"
	ResourceManager                                   TokenScope = "ResourceManager"
	AnalysisServices                                  TokenScope = "AnalysisServices"
	ApiManagement                                     TokenScope = "ApiManagement"
	AppConfiguration                                  TokenScope = "AppConfiguration"
	AppService                                        TokenScope = "AppService"
	ApplicationInsights                               TokenScope = "ApplicationInsights"
	Attestation                                       TokenScope = "Attestation"
	AzureADIdentityGovernanceInsights                 TokenScope = "AzureADIdentityGovernanceInsights"
	AzureADIntegratedApp                              TokenScope = "AzureADIntegratedApp"
	AzureADNotification                               TokenScope = "AzureADNotification"
	AzureDevOps                                       TokenScope = "AzureDevOps"
	AzureServiceManagement                            TokenScope = "AzureServiceManagement"
	AzureVPN                                          TokenScope = "AzureVPN"
	Batch                                             TokenScope = "Batch"
	Bing                                              TokenScope = "Bing"
	BotFrameworkDevPortal                             TokenScope = "BotFrameworkDevPortal"
	BranchConnectWebService                           TokenScope = "BranchConnectWebService"
	CDNFrontDoor                                      TokenScope = "CDNFrontDoor"
	Cognitive                                         TokenScope = "Cognitive"
	ComputeRecommendations                            TokenScope = "ComputeRecommendations"
	Connections                                       TokenScope = "Connections"
	ContainerRegistry                                 TokenScope = "ContainerRegistry"
	CortanaAtWork                                     TokenScope = "CortanaAtWork"
	CortanaAtWorkBing                                 TokenScope = "CortanaAtWorkBing"
	CortanaRuntime                                    TokenScope = "CortanaRuntime"
	CosmosDB                                          TokenScope = "CosmosDB"
	CustomerInsights                                  TokenScope = "CustomerInsights"
	DataBricks                                        TokenScope = "DataBricks"
	DataCatalog                                       TokenScope = "DataCatalog"
	DataLake                                          TokenScope = "DataLake"
	DataMigrations                                    TokenScope = "DataMigrations"
	DigitalTwins                                      TokenScope = "DigitalTwins"
	DomainController                                  TokenScope = "DomainController"
	Dynamic365BusinessCentral                         TokenScope = "Dynamic365BusinessCentral"
	Dynamics365DataExportService                      TokenScope = "Dynamics365DataExportService"
	DynamicsCRM                                       TokenScope = "DynamicsCRM"
	DynamicsERP                                       TokenScope = "DynamicsERP"
	EventHubs                                         TokenScope = "EventHubs"
	Flow                                              TokenScope = "Flow"
	GraphConnector                                    TokenScope = "GraphConnector"
	HDInsight                                         TokenScope = "HDInsight"
	HealthCare                                        TokenScope = "HealthCare"
	IamSupportability                                 TokenScope = "IamSupportability"
	ImportExport                                      TokenScope = "ImportExport"
	InTune                                            TokenScope = "InTune"
	InformationProtectionSyncService                  TokenScope = "InformationProtectionSyncService"
	IoTCentral                                        TokenScope = "IoTCentral"
	IoTHubDeviceProvisioning                          TokenScope = "IoTHubDeviceProvisioning"
	KeyVault                                          TokenScope = "KeyVault"
	KubernetesServiceAADServer                        TokenScope = "KubernetesServiceAADServer"
	Kusto                                             TokenScope = "Kusto"
	KustoMFA                                          TokenScope = "KustoMFA"
	LogAnalytics                                      TokenScope = "LogAnalytics"
	ManagedHSM                                        TokenScope = "ManagedHSM"
	Maps                                              TokenScope = "Maps"
	MariaDB                                           TokenScope = "MariaDB"
	MediaServices                                     TokenScope = "MediaServices"
	Microsoft365DataAtRestEncryption                  TokenScope = "Microsoft365DataAtRestEncryption"
	MicrosoftAzureCli                                 TokenScope = "MicrosoftAzureCli"
	MicrosoftInvoicing                                TokenScope = "MicrosoftInvoicing"
	MicrosoftOffice                                   TokenScope = "MicrosoftOffice"
	MicrosoftStorageSync                              TokenScope = "MicrosoftStorageSync"
	MicrosoftTeams                                    TokenScope = "MicrosoftTeams"
	MicrosoftTeamsWebClient                           TokenScope = "MicrosoftTeamsWebClient"
	MileIqAdminCenter                                 TokenScope = "MileIqAdminCenter"
	MileIqDashboard                                   TokenScope = "MileIqDashboard"
	MileIqRestService                                 TokenScope = "MileIqRestService"
	MixedReality                                      TokenScope = "MixedReality"
	MySql                                             TokenScope = "MySql"
	OSSRDBMSPostgreSQLFlexibleServerAadAuthentication TokenScope = "OSSRDBMSPostgreSQLFlexibleServerAadAuthentication"
	OSSRDMBS                                          TokenScope = "OSSRDMBS"
	Office365Connectors                               TokenScope = "Office365Connectors"
	Office365Demeter                                  TokenScope = "Office365Demeter"
	Office365DwEngineV2                               TokenScope = "Office365DwEngineV2"
	Office365ExchangeOnline                           TokenScope = "Office365ExchangeOnline"
	Office365ExchangeOnlineProtection                 TokenScope = "Office365ExchangeOnlineProtection"
	Office365InformationProtection                    TokenScope = "Office365InformationProtection"
	Office365Management                               TokenScope = "Office365Management"
	Office365Portal                                   TokenScope = "Office365Portal"
	Office365SharePointOnline                         TokenScope = "Office365SharePointOnline"
	Office365SuiteUx                                  TokenScope = "Office365SuiteUx"
	Office365Zoom                                     TokenScope = "Office365Zoom"
	OfficeHome                                        TokenScope = "OfficeHome"
	OfficeUwpPwa                                      TokenScope = "OfficeUwpPwa"
	OneNote                                           TokenScope = "OneNote"
	OneProfile                                        TokenScope = "OneProfile"
	OperationalInsights                               TokenScope = "OperationalInsights"
	PeopleCards                                       TokenScope = "PeopleCards"
	PolicyAdministration                              TokenScope = "PolicyAdministration"
	Portal                                            TokenScope = "Portal"
	Postgresql                                        TokenScope = "Postgresql"
	PowerAppsRuntime                                  TokenScope = "PowerAppsRuntime"
	PowerAppsRuntimeService                           TokenScope = "PowerAppsRuntimeService"
	PowerBiService                                    TokenScope = "PowerBiService"
	Purview                                           TokenScope = "Purview"
	RightsManagement                                  TokenScope = "RightsManagement"
	SecurityInsights                                  TokenScope = "SecurityInsights"
	ServiceBus                                        TokenScope = "ServiceBus"
	ServiceDeploy                                     TokenScope = "ServiceDeploy"
	ServiceTrust                                      TokenScope = "ServiceTrust"
	Signup                                            TokenScope = "Signup"
	SkypeForBusinessOnline                            TokenScope = "SkypeForBusinessOnline"
	SpeechRecognition                                 TokenScope = "SpeechRecognition"
	Sql                                               TokenScope = "Sql"
	StackHCI                                          TokenScope = "StackHCI"
	Storage                                           TokenScope = "Storage"
	StorageSync                                       TokenScope = "StorageSync"
	StreamAnalytics                                   TokenScope = "StreamAnalytics"
	Synapse                                           TokenScope = "Synapse"
	SynapseGateway                                    TokenScope = "SynapseGateway"
	SynapseStudio                                     TokenScope = "SynapseStudio"
	TargetedMessaging                                 TokenScope = "TargetedMessaging"
	Teams                                             TokenScope = "Teams"
	ThreatProtection                                  TokenScope = "ThreatProtection"
	TimeSeriesInsights                                TokenScope = "TimeSeriesInsights"
	TrafficManager                                    TokenScope = "TrafficManager"
	UniversalPrint                                    TokenScope = "UniversalPrint"
	WindowsDefenderATP                                TokenScope = "WindowsDefenderATP"
	WindowsVirtualDesktop                             TokenScope = "WindowsVirtualDesktop"
	Yammer                                            TokenScope = "Yammer"
)

func (*TokenScope) Values() []infer.EnumValue[TokenScope] {
	return []infer.EnumValue[TokenScope]{
		{Value: MicrosoftGraph},
		{Value: ResourceManager},
		{Value: AnalysisServices},
		{Value: ApiManagement},
		{Value: AppConfiguration},
		{Value: AppService},
		{Value: ApplicationInsights},
		{Value: Attestation},
		{Value: AzureADIdentityGovernanceInsights},
		{Value: AzureADIntegratedApp},
		{Value: AzureADNotification},
		{Value: AzureDevOps},
		{Value: AzureServiceManagement},
		{Value: AzureVPN},
		{Value: Batch},
		{Value: Bing},
		{Value: BotFrameworkDevPortal},
		{Value: BranchConnectWebService},
		{Value: CDNFrontDoor},
		{Value: Cognitive},
		{Value: ComputeRecommendations},
		{Value: Connections},
		{Value: ContainerRegistry},
		{Value: CortanaAtWork},
		{Value: CortanaAtWorkBing},
		{Value: CortanaRuntime},
		{Value: CosmosDB},
		{Value: CustomerInsights},
		{Value: DataBricks},
		{Value: DataCatalog},
		{Value: DataLake},
		{Value: DataMigrations},
		{Value: DigitalTwins},
		{Value: DomainController},
		{Value: Dynamic365BusinessCentral},
		{Value: Dynamics365DataExportService},
		{Value: DynamicsCRM},
		{Value: DynamicsERP},
		{Value: EventHubs},
		{Value: Flow},
		{Value: GraphConnector},
		{Value: HDInsight},
		{Value: HealthCare},
		{Value: IamSupportability},
		{Value: ImportExport},
		{Value: InTune},
		{Value: InformationProtectionSyncService},
		{Value: IoTCentral},
		{Value: IoTHubDeviceProvisioning},
		{Value: KeyVault},
		{Value: KubernetesServiceAADServer},
		{Value: Kusto},
		{Value: KustoMFA},
		{Value: LogAnalytics},
		{Value: ManagedHSM},
		{Value: Maps},
		{Value: MariaDB},
		{Value: MediaServices},
		{Value: Microsoft365DataAtRestEncryption},
		{Value: MicrosoftAzureCli},
		{Value: MicrosoftInvoicing},
		{Value: MicrosoftOffice},
		{Value: MicrosoftStorageSync},
		{Value: MicrosoftTeams},
		{Value: MicrosoftTeamsWebClient},
		{Value: MileIqAdminCenter},
		{Value: MileIqDashboard},
		{Value: MileIqRestService},
		{Value: MixedReality},
		{Value: MySql},
		{Value: OSSRDBMSPostgreSQLFlexibleServerAadAuthentication},
		{Value: OSSRDMBS},
		{Value: Office365Connectors},
		{Value: Office365Demeter},
		{Value: Office365DwEngineV2},
		{Value: Office365ExchangeOnline},
		{Value: Office365ExchangeOnlineProtection},
		{Value: Office365InformationProtection},
		{Value: Office365Management},
		{Value: Office365Portal},
		{Value: Office365SharePointOnline},
		{Value: Office365SuiteUx},
		{Value: Office365Zoom},
		{Value: OfficeHome},
		{Value: OfficeUwpPwa},
		{Value: OneNote},
		{Value: OneProfile},
		{Value: OperationalInsights},
		{Value: PeopleCards},
		{Value: PolicyAdministration},
		{Value: Portal},
		{Value: Postgresql},
		{Value: PowerAppsRuntime},
		{Value: PowerAppsRuntimeService},
		{Value: PowerBiService},
		{Value: Purview},
		{Value: RightsManagement},
		{Value: SecurityInsights},
		{Value: ServiceBus},
		{Value: ServiceDeploy},
		{Value: ServiceTrust},
		{Value: Signup},
		{Value: SkypeForBusinessOnline},
		{Value: SpeechRecognition},
		{Value: Sql},
		{Value: StackHCI},
		{Value: Storage},
		{Value: StorageSync},
		{Value: StreamAnalytics},
		{Value: Synapse},
		{Value: SynapseGateway},
		{Value: SynapseStudio},
		{Value: TargetedMessaging},
		{Value: Teams},
		{Value: ThreatProtection},
		{Value: TimeSeriesInsights},
		{Value: TrafficManager},
		{Value: UniversalPrint},
		{Value: WindowsDefenderATP},
		{Value: WindowsVirtualDesktop},
		{Value: Yammer},
	}
}

type GetClientTokenArgs struct {
	Scope    TokenScope `pulumi:"scope,optional"`
	Endpoint *string    `pulumi:"endpoint,optional"`
}

func (args *GetClientTokenArgs) Annotate(a infer.Annotator) {
	a.Describe(&args.Scope, "Optional authentication scope. Defaults to Azure Resource Manager")
	a.SetDefault(&args.Scope, ResourceManager)
	a.Describe(&args.Endpoint, "Optional authentication endpoint. Defaults to the endpoint of Azure Resource Manager.")
}

type GetClientTokenResult struct {
	Token     string  `pulumi:"token" provider:"secret"`
	ExpiresOn *string `pulumi:"expiresOn,optional"`
}

func (res *GetClientTokenResult) Annotate(a infer.Annotator) {
	a.Describe(&res.Token, "OAuth token for based on scope and endpoint")
	a.Describe(&res.ExpiresOn, "Expiration time of OAuth token")
}

type GetClientToken struct{}

func (f *GetClientToken) Annotate(a infer.Annotator) {
	a.Describe(f, "Use this function to get an Azure authentication token for the current login context.")
	a.SetToken("core/getClientToken", "getClientToken")
}

func (f GetClientToken) Call(ctx p.Context, args GetClientTokenArgs) (res GetClientTokenResult, err error) {
	res = GetClientTokenResult{}

	envName := util.StringValue(config.ConfigValueMap, "environment", []string{"ARM_ENVIRONMENT"})
	if envName == "" {
		envName = "public"
	}

	env, err := environments.FromName(envName)
	if err != nil {
		err = fmt.Errorf("failed to read Azure environment \"%s\": %v", envName, err)
		return
	}

	if args.Endpoint != nil && *args.Endpoint != "" {
		env.Authorization.LoginEndpoint = *args.Endpoint
	}

	if args.Scope == "" {
		args.Scope = ResourceManager
	}

	ev := reflect.ValueOf(env)
	strct := ev.Elem()
	val := strct.FieldByName(string(args.Scope))
	if val.Kind() != reflect.Interface {
		err = fmt.Errorf("scope %q not supported in environment %q", args.Scope, envName)
		return
	}
	auth, err := util.CreateAuthenticator(config.ConfigValueMap, env, val.Interface().(environments.Api))
	if err != nil {
		return
	}

	token, err := auth.Token(ctx, nil)
	if err != nil {
		return
	}

	res = GetClientTokenResult{
		Token: token.AccessToken,
	}

	return
}
