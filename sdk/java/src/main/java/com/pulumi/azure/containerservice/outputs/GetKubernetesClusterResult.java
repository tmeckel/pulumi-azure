// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterAciConnectorLinux;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterAgentPoolProfile;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterAzureActiveDirectoryRoleBasedAccessControl;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterIdentity;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterIngressApplicationGateway;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterKeyManagementService;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterKeyVaultSecretsProvider;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterKubeAdminConfig;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterKubeConfig;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterKubeletIdentity;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterLinuxProfile;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterMicrosoftDefender;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterNetworkProfile;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterOmsAgent;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterServiceMeshProfile;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterServicePrincipal;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterStorageProfile;
import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterWindowsProfile;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetKubernetesClusterResult {
    /**
     * @return An `aci_connector_linux` block as documented below.
     * 
     */
    private List<GetKubernetesClusterAciConnectorLinux> aciConnectorLinuxes;
    /**
     * @return An `agent_pool_profile` block as documented below.
     * 
     */
    private List<GetKubernetesClusterAgentPoolProfile> agentPoolProfiles;
    /**
     * @return The IP ranges to whitelist for incoming traffic to the primaries.
     * 
     */
    private List<String> apiServerAuthorizedIpRanges;
    /**
     * @return An `azure_active_directory_role_based_access_control` block as documented below.
     * 
     */
    private List<GetKubernetesClusterAzureActiveDirectoryRoleBasedAccessControl> azureActiveDirectoryRoleBasedAccessControls;
    /**
     * @return Is Azure Policy enabled on this managed Kubernetes Cluster?
     * 
     */
    private Boolean azurePolicyEnabled;
    /**
     * @return Contains the current version of Kubernetes running on the Cluster.
     * 
     */
    private String currentKubernetesVersion;
    /**
     * @return A list of custom base64 encoded CAs used by this Managed Kubernetes Cluster.
     * 
     */
    private List<String> customCaTrustCertificatesBase64s;
    /**
     * @return The ID of the Disk Encryption Set used for the Nodes and Volumes.
     * 
     */
    private String diskEncryptionSetId;
    /**
     * @return The DNS Prefix of the managed Kubernetes cluster.
     * 
     */
    private String dnsPrefix;
    /**
     * @return The FQDN of the Azure Kubernetes Managed Cluster.
     * 
     */
    private String fqdn;
    /**
     * @return Is HTTP Application Routing enabled for this managed Kubernetes Cluster?
     * 
     */
    private Boolean httpApplicationRoutingEnabled;
    /**
     * @return The Zone Name of the HTTP Application Routing.
     * 
     */
    private String httpApplicationRoutingZoneName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return An `identity` block as documented below.
     * 
     */
    private List<GetKubernetesClusterIdentity> identities;
    /**
     * @return An `ingress_application_gateway` block as documented below.
     * 
     */
    private List<GetKubernetesClusterIngressApplicationGateway> ingressApplicationGateways;
    /**
     * @return A `key_management_service` block as documented below.
     * 
     */
    private List<GetKubernetesClusterKeyManagementService> keyManagementServices;
    /**
     * @return A `key_vault_secrets_provider` block as documented below.
     * 
     */
    private List<GetKubernetesClusterKeyVaultSecretsProvider> keyVaultSecretsProviders;
    /**
     * @return Raw Kubernetes config for the admin account to be used by [kubectl](https://kubernetes.io/docs/reference/kubectl/overview/) and other compatible tools. This is only available when Role Based Access Control with Azure Active Directory is enabled and local accounts are not disabled.
     * 
     */
    private String kubeAdminConfigRaw;
    /**
     * @return A `kube_admin_config` block as defined below. This is only available when Role Based Access Control with Azure Active Directory is enabled and local accounts are not disabled.
     * 
     */
    private List<GetKubernetesClusterKubeAdminConfig> kubeAdminConfigs;
    /**
     * @return Base64 encoded Kubernetes configuration.
     * 
     */
    private String kubeConfigRaw;
    /**
     * @return A `kube_config` block as defined below.
     * 
     */
    private List<GetKubernetesClusterKubeConfig> kubeConfigs;
    /**
     * @return A `kubelet_identity` block as documented below.
     * 
     */
    private List<GetKubernetesClusterKubeletIdentity> kubeletIdentities;
    /**
     * @return The version of Kubernetes used on the managed Kubernetes Cluster.
     * 
     */
    private String kubernetesVersion;
    /**
     * @return A `linux_profile` block as documented below.
     * 
     */
    private List<GetKubernetesClusterLinuxProfile> linuxProfiles;
    /**
     * @return The Azure Region in which the managed Kubernetes Cluster exists.
     * 
     */
    private String location;
    /**
     * @return A `microsoft_defender` block as defined below.
     * 
     */
    private List<GetKubernetesClusterMicrosoftDefender> microsoftDefenders;
    /**
     * @return The name assigned to this pool of agents.
     * 
     */
    private String name;
    /**
     * @return A `network_profile` block as documented below.
     * 
     */
    private List<GetKubernetesClusterNetworkProfile> networkProfiles;
    /**
     * @return Auto-generated Resource Group containing AKS Cluster resources.
     * 
     */
    private String nodeResourceGroup;
    /**
     * @return The ID of the Resource Group containing the resources for this Managed Kubernetes Cluster.
     * 
     */
    private String nodeResourceGroupId;
    /**
     * @return Whether or not the OIDC feature is enabled or disabled.
     * 
     */
    private Boolean oidcIssuerEnabled;
    /**
     * @return The OIDC issuer URL that is associated with the cluster.
     * 
     */
    private String oidcIssuerUrl;
    /**
     * @return An `oms_agent` block as documented below.
     * 
     */
    private List<GetKubernetesClusterOmsAgent> omsAgents;
    /**
     * @return Is Open Service Mesh enabled for this managed Kubernetes Cluster?
     * 
     */
    private Boolean openServiceMeshEnabled;
    /**
     * @return If the cluster has the Kubernetes API only exposed on internal IP addresses.
     * 
     */
    private Boolean privateClusterEnabled;
    /**
     * @return The FQDN of this Kubernetes Cluster when private link has been enabled. This name is only resolvable inside the Virtual Network where the Azure Kubernetes Service is located
     * 
     */
    private String privateFqdn;
    private String resourceGroupName;
    /**
     * @return Is Role Based Access Control enabled for this managed Kubernetes Cluster?
     * 
     */
    private Boolean roleBasedAccessControlEnabled;
    private List<GetKubernetesClusterServiceMeshProfile> serviceMeshProfiles;
    /**
     * @return A `service_principal` block as documented below.
     * 
     */
    private List<GetKubernetesClusterServicePrincipal> servicePrincipals;
    /**
     * @return A `storage_profile` block as documented below.
     * 
     */
    private List<GetKubernetesClusterStorageProfile> storageProfiles;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return A `windows_profile` block as documented below.
     * 
     */
    private List<GetKubernetesClusterWindowsProfile> windowsProfiles;

    private GetKubernetesClusterResult() {}
    /**
     * @return An `aci_connector_linux` block as documented below.
     * 
     */
    public List<GetKubernetesClusterAciConnectorLinux> aciConnectorLinuxes() {
        return this.aciConnectorLinuxes;
    }
    /**
     * @return An `agent_pool_profile` block as documented below.
     * 
     */
    public List<GetKubernetesClusterAgentPoolProfile> agentPoolProfiles() {
        return this.agentPoolProfiles;
    }
    /**
     * @return The IP ranges to whitelist for incoming traffic to the primaries.
     * 
     */
    public List<String> apiServerAuthorizedIpRanges() {
        return this.apiServerAuthorizedIpRanges;
    }
    /**
     * @return An `azure_active_directory_role_based_access_control` block as documented below.
     * 
     */
    public List<GetKubernetesClusterAzureActiveDirectoryRoleBasedAccessControl> azureActiveDirectoryRoleBasedAccessControls() {
        return this.azureActiveDirectoryRoleBasedAccessControls;
    }
    /**
     * @return Is Azure Policy enabled on this managed Kubernetes Cluster?
     * 
     */
    public Boolean azurePolicyEnabled() {
        return this.azurePolicyEnabled;
    }
    /**
     * @return Contains the current version of Kubernetes running on the Cluster.
     * 
     */
    public String currentKubernetesVersion() {
        return this.currentKubernetesVersion;
    }
    /**
     * @return A list of custom base64 encoded CAs used by this Managed Kubernetes Cluster.
     * 
     */
    public List<String> customCaTrustCertificatesBase64s() {
        return this.customCaTrustCertificatesBase64s;
    }
    /**
     * @return The ID of the Disk Encryption Set used for the Nodes and Volumes.
     * 
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }
    /**
     * @return The DNS Prefix of the managed Kubernetes cluster.
     * 
     */
    public String dnsPrefix() {
        return this.dnsPrefix;
    }
    /**
     * @return The FQDN of the Azure Kubernetes Managed Cluster.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return Is HTTP Application Routing enabled for this managed Kubernetes Cluster?
     * 
     */
    public Boolean httpApplicationRoutingEnabled() {
        return this.httpApplicationRoutingEnabled;
    }
    /**
     * @return The Zone Name of the HTTP Application Routing.
     * 
     */
    public String httpApplicationRoutingZoneName() {
        return this.httpApplicationRoutingZoneName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return An `identity` block as documented below.
     * 
     */
    public List<GetKubernetesClusterIdentity> identities() {
        return this.identities;
    }
    /**
     * @return An `ingress_application_gateway` block as documented below.
     * 
     */
    public List<GetKubernetesClusterIngressApplicationGateway> ingressApplicationGateways() {
        return this.ingressApplicationGateways;
    }
    /**
     * @return A `key_management_service` block as documented below.
     * 
     */
    public List<GetKubernetesClusterKeyManagementService> keyManagementServices() {
        return this.keyManagementServices;
    }
    /**
     * @return A `key_vault_secrets_provider` block as documented below.
     * 
     */
    public List<GetKubernetesClusterKeyVaultSecretsProvider> keyVaultSecretsProviders() {
        return this.keyVaultSecretsProviders;
    }
    /**
     * @return Raw Kubernetes config for the admin account to be used by [kubectl](https://kubernetes.io/docs/reference/kubectl/overview/) and other compatible tools. This is only available when Role Based Access Control with Azure Active Directory is enabled and local accounts are not disabled.
     * 
     */
    public String kubeAdminConfigRaw() {
        return this.kubeAdminConfigRaw;
    }
    /**
     * @return A `kube_admin_config` block as defined below. This is only available when Role Based Access Control with Azure Active Directory is enabled and local accounts are not disabled.
     * 
     */
    public List<GetKubernetesClusterKubeAdminConfig> kubeAdminConfigs() {
        return this.kubeAdminConfigs;
    }
    /**
     * @return Base64 encoded Kubernetes configuration.
     * 
     */
    public String kubeConfigRaw() {
        return this.kubeConfigRaw;
    }
    /**
     * @return A `kube_config` block as defined below.
     * 
     */
    public List<GetKubernetesClusterKubeConfig> kubeConfigs() {
        return this.kubeConfigs;
    }
    /**
     * @return A `kubelet_identity` block as documented below.
     * 
     */
    public List<GetKubernetesClusterKubeletIdentity> kubeletIdentities() {
        return this.kubeletIdentities;
    }
    /**
     * @return The version of Kubernetes used on the managed Kubernetes Cluster.
     * 
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }
    /**
     * @return A `linux_profile` block as documented below.
     * 
     */
    public List<GetKubernetesClusterLinuxProfile> linuxProfiles() {
        return this.linuxProfiles;
    }
    /**
     * @return The Azure Region in which the managed Kubernetes Cluster exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return A `microsoft_defender` block as defined below.
     * 
     */
    public List<GetKubernetesClusterMicrosoftDefender> microsoftDefenders() {
        return this.microsoftDefenders;
    }
    /**
     * @return The name assigned to this pool of agents.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `network_profile` block as documented below.
     * 
     */
    public List<GetKubernetesClusterNetworkProfile> networkProfiles() {
        return this.networkProfiles;
    }
    /**
     * @return Auto-generated Resource Group containing AKS Cluster resources.
     * 
     */
    public String nodeResourceGroup() {
        return this.nodeResourceGroup;
    }
    /**
     * @return The ID of the Resource Group containing the resources for this Managed Kubernetes Cluster.
     * 
     */
    public String nodeResourceGroupId() {
        return this.nodeResourceGroupId;
    }
    /**
     * @return Whether or not the OIDC feature is enabled or disabled.
     * 
     */
    public Boolean oidcIssuerEnabled() {
        return this.oidcIssuerEnabled;
    }
    /**
     * @return The OIDC issuer URL that is associated with the cluster.
     * 
     */
    public String oidcIssuerUrl() {
        return this.oidcIssuerUrl;
    }
    /**
     * @return An `oms_agent` block as documented below.
     * 
     */
    public List<GetKubernetesClusterOmsAgent> omsAgents() {
        return this.omsAgents;
    }
    /**
     * @return Is Open Service Mesh enabled for this managed Kubernetes Cluster?
     * 
     */
    public Boolean openServiceMeshEnabled() {
        return this.openServiceMeshEnabled;
    }
    /**
     * @return If the cluster has the Kubernetes API only exposed on internal IP addresses.
     * 
     */
    public Boolean privateClusterEnabled() {
        return this.privateClusterEnabled;
    }
    /**
     * @return The FQDN of this Kubernetes Cluster when private link has been enabled. This name is only resolvable inside the Virtual Network where the Azure Kubernetes Service is located
     * 
     */
    public String privateFqdn() {
        return this.privateFqdn;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return Is Role Based Access Control enabled for this managed Kubernetes Cluster?
     * 
     */
    public Boolean roleBasedAccessControlEnabled() {
        return this.roleBasedAccessControlEnabled;
    }
    public List<GetKubernetesClusterServiceMeshProfile> serviceMeshProfiles() {
        return this.serviceMeshProfiles;
    }
    /**
     * @return A `service_principal` block as documented below.
     * 
     */
    public List<GetKubernetesClusterServicePrincipal> servicePrincipals() {
        return this.servicePrincipals;
    }
    /**
     * @return A `storage_profile` block as documented below.
     * 
     */
    public List<GetKubernetesClusterStorageProfile> storageProfiles() {
        return this.storageProfiles;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return A `windows_profile` block as documented below.
     * 
     */
    public List<GetKubernetesClusterWindowsProfile> windowsProfiles() {
        return this.windowsProfiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetKubernetesClusterAciConnectorLinux> aciConnectorLinuxes;
        private List<GetKubernetesClusterAgentPoolProfile> agentPoolProfiles;
        private List<String> apiServerAuthorizedIpRanges;
        private List<GetKubernetesClusterAzureActiveDirectoryRoleBasedAccessControl> azureActiveDirectoryRoleBasedAccessControls;
        private Boolean azurePolicyEnabled;
        private String currentKubernetesVersion;
        private List<String> customCaTrustCertificatesBase64s;
        private String diskEncryptionSetId;
        private String dnsPrefix;
        private String fqdn;
        private Boolean httpApplicationRoutingEnabled;
        private String httpApplicationRoutingZoneName;
        private String id;
        private List<GetKubernetesClusterIdentity> identities;
        private List<GetKubernetesClusterIngressApplicationGateway> ingressApplicationGateways;
        private List<GetKubernetesClusterKeyManagementService> keyManagementServices;
        private List<GetKubernetesClusterKeyVaultSecretsProvider> keyVaultSecretsProviders;
        private String kubeAdminConfigRaw;
        private List<GetKubernetesClusterKubeAdminConfig> kubeAdminConfigs;
        private String kubeConfigRaw;
        private List<GetKubernetesClusterKubeConfig> kubeConfigs;
        private List<GetKubernetesClusterKubeletIdentity> kubeletIdentities;
        private String kubernetesVersion;
        private List<GetKubernetesClusterLinuxProfile> linuxProfiles;
        private String location;
        private List<GetKubernetesClusterMicrosoftDefender> microsoftDefenders;
        private String name;
        private List<GetKubernetesClusterNetworkProfile> networkProfiles;
        private String nodeResourceGroup;
        private String nodeResourceGroupId;
        private Boolean oidcIssuerEnabled;
        private String oidcIssuerUrl;
        private List<GetKubernetesClusterOmsAgent> omsAgents;
        private Boolean openServiceMeshEnabled;
        private Boolean privateClusterEnabled;
        private String privateFqdn;
        private String resourceGroupName;
        private Boolean roleBasedAccessControlEnabled;
        private List<GetKubernetesClusterServiceMeshProfile> serviceMeshProfiles;
        private List<GetKubernetesClusterServicePrincipal> servicePrincipals;
        private List<GetKubernetesClusterStorageProfile> storageProfiles;
        private Map<String,String> tags;
        private List<GetKubernetesClusterWindowsProfile> windowsProfiles;
        public Builder() {}
        public Builder(GetKubernetesClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aciConnectorLinuxes = defaults.aciConnectorLinuxes;
    	      this.agentPoolProfiles = defaults.agentPoolProfiles;
    	      this.apiServerAuthorizedIpRanges = defaults.apiServerAuthorizedIpRanges;
    	      this.azureActiveDirectoryRoleBasedAccessControls = defaults.azureActiveDirectoryRoleBasedAccessControls;
    	      this.azurePolicyEnabled = defaults.azurePolicyEnabled;
    	      this.currentKubernetesVersion = defaults.currentKubernetesVersion;
    	      this.customCaTrustCertificatesBase64s = defaults.customCaTrustCertificatesBase64s;
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.dnsPrefix = defaults.dnsPrefix;
    	      this.fqdn = defaults.fqdn;
    	      this.httpApplicationRoutingEnabled = defaults.httpApplicationRoutingEnabled;
    	      this.httpApplicationRoutingZoneName = defaults.httpApplicationRoutingZoneName;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.ingressApplicationGateways = defaults.ingressApplicationGateways;
    	      this.keyManagementServices = defaults.keyManagementServices;
    	      this.keyVaultSecretsProviders = defaults.keyVaultSecretsProviders;
    	      this.kubeAdminConfigRaw = defaults.kubeAdminConfigRaw;
    	      this.kubeAdminConfigs = defaults.kubeAdminConfigs;
    	      this.kubeConfigRaw = defaults.kubeConfigRaw;
    	      this.kubeConfigs = defaults.kubeConfigs;
    	      this.kubeletIdentities = defaults.kubeletIdentities;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.linuxProfiles = defaults.linuxProfiles;
    	      this.location = defaults.location;
    	      this.microsoftDefenders = defaults.microsoftDefenders;
    	      this.name = defaults.name;
    	      this.networkProfiles = defaults.networkProfiles;
    	      this.nodeResourceGroup = defaults.nodeResourceGroup;
    	      this.nodeResourceGroupId = defaults.nodeResourceGroupId;
    	      this.oidcIssuerEnabled = defaults.oidcIssuerEnabled;
    	      this.oidcIssuerUrl = defaults.oidcIssuerUrl;
    	      this.omsAgents = defaults.omsAgents;
    	      this.openServiceMeshEnabled = defaults.openServiceMeshEnabled;
    	      this.privateClusterEnabled = defaults.privateClusterEnabled;
    	      this.privateFqdn = defaults.privateFqdn;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleBasedAccessControlEnabled = defaults.roleBasedAccessControlEnabled;
    	      this.serviceMeshProfiles = defaults.serviceMeshProfiles;
    	      this.servicePrincipals = defaults.servicePrincipals;
    	      this.storageProfiles = defaults.storageProfiles;
    	      this.tags = defaults.tags;
    	      this.windowsProfiles = defaults.windowsProfiles;
        }

        @CustomType.Setter
        public Builder aciConnectorLinuxes(List<GetKubernetesClusterAciConnectorLinux> aciConnectorLinuxes) {
            this.aciConnectorLinuxes = Objects.requireNonNull(aciConnectorLinuxes);
            return this;
        }
        public Builder aciConnectorLinuxes(GetKubernetesClusterAciConnectorLinux... aciConnectorLinuxes) {
            return aciConnectorLinuxes(List.of(aciConnectorLinuxes));
        }
        @CustomType.Setter
        public Builder agentPoolProfiles(List<GetKubernetesClusterAgentPoolProfile> agentPoolProfiles) {
            this.agentPoolProfiles = Objects.requireNonNull(agentPoolProfiles);
            return this;
        }
        public Builder agentPoolProfiles(GetKubernetesClusterAgentPoolProfile... agentPoolProfiles) {
            return agentPoolProfiles(List.of(agentPoolProfiles));
        }
        @CustomType.Setter
        public Builder apiServerAuthorizedIpRanges(List<String> apiServerAuthorizedIpRanges) {
            this.apiServerAuthorizedIpRanges = Objects.requireNonNull(apiServerAuthorizedIpRanges);
            return this;
        }
        public Builder apiServerAuthorizedIpRanges(String... apiServerAuthorizedIpRanges) {
            return apiServerAuthorizedIpRanges(List.of(apiServerAuthorizedIpRanges));
        }
        @CustomType.Setter
        public Builder azureActiveDirectoryRoleBasedAccessControls(List<GetKubernetesClusterAzureActiveDirectoryRoleBasedAccessControl> azureActiveDirectoryRoleBasedAccessControls) {
            this.azureActiveDirectoryRoleBasedAccessControls = Objects.requireNonNull(azureActiveDirectoryRoleBasedAccessControls);
            return this;
        }
        public Builder azureActiveDirectoryRoleBasedAccessControls(GetKubernetesClusterAzureActiveDirectoryRoleBasedAccessControl... azureActiveDirectoryRoleBasedAccessControls) {
            return azureActiveDirectoryRoleBasedAccessControls(List.of(azureActiveDirectoryRoleBasedAccessControls));
        }
        @CustomType.Setter
        public Builder azurePolicyEnabled(Boolean azurePolicyEnabled) {
            this.azurePolicyEnabled = Objects.requireNonNull(azurePolicyEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder currentKubernetesVersion(String currentKubernetesVersion) {
            this.currentKubernetesVersion = Objects.requireNonNull(currentKubernetesVersion);
            return this;
        }
        @CustomType.Setter
        public Builder customCaTrustCertificatesBase64s(List<String> customCaTrustCertificatesBase64s) {
            this.customCaTrustCertificatesBase64s = Objects.requireNonNull(customCaTrustCertificatesBase64s);
            return this;
        }
        public Builder customCaTrustCertificatesBase64s(String... customCaTrustCertificatesBase64s) {
            return customCaTrustCertificatesBase64s(List.of(customCaTrustCertificatesBase64s));
        }
        @CustomType.Setter
        public Builder diskEncryptionSetId(String diskEncryptionSetId) {
            this.diskEncryptionSetId = Objects.requireNonNull(diskEncryptionSetId);
            return this;
        }
        @CustomType.Setter
        public Builder dnsPrefix(String dnsPrefix) {
            this.dnsPrefix = Objects.requireNonNull(dnsPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        @CustomType.Setter
        public Builder httpApplicationRoutingEnabled(Boolean httpApplicationRoutingEnabled) {
            this.httpApplicationRoutingEnabled = Objects.requireNonNull(httpApplicationRoutingEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder httpApplicationRoutingZoneName(String httpApplicationRoutingZoneName) {
            this.httpApplicationRoutingZoneName = Objects.requireNonNull(httpApplicationRoutingZoneName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identities(List<GetKubernetesClusterIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetKubernetesClusterIdentity... identities) {
            return identities(List.of(identities));
        }
        @CustomType.Setter
        public Builder ingressApplicationGateways(List<GetKubernetesClusterIngressApplicationGateway> ingressApplicationGateways) {
            this.ingressApplicationGateways = Objects.requireNonNull(ingressApplicationGateways);
            return this;
        }
        public Builder ingressApplicationGateways(GetKubernetesClusterIngressApplicationGateway... ingressApplicationGateways) {
            return ingressApplicationGateways(List.of(ingressApplicationGateways));
        }
        @CustomType.Setter
        public Builder keyManagementServices(List<GetKubernetesClusterKeyManagementService> keyManagementServices) {
            this.keyManagementServices = Objects.requireNonNull(keyManagementServices);
            return this;
        }
        public Builder keyManagementServices(GetKubernetesClusterKeyManagementService... keyManagementServices) {
            return keyManagementServices(List.of(keyManagementServices));
        }
        @CustomType.Setter
        public Builder keyVaultSecretsProviders(List<GetKubernetesClusterKeyVaultSecretsProvider> keyVaultSecretsProviders) {
            this.keyVaultSecretsProviders = Objects.requireNonNull(keyVaultSecretsProviders);
            return this;
        }
        public Builder keyVaultSecretsProviders(GetKubernetesClusterKeyVaultSecretsProvider... keyVaultSecretsProviders) {
            return keyVaultSecretsProviders(List.of(keyVaultSecretsProviders));
        }
        @CustomType.Setter
        public Builder kubeAdminConfigRaw(String kubeAdminConfigRaw) {
            this.kubeAdminConfigRaw = Objects.requireNonNull(kubeAdminConfigRaw);
            return this;
        }
        @CustomType.Setter
        public Builder kubeAdminConfigs(List<GetKubernetesClusterKubeAdminConfig> kubeAdminConfigs) {
            this.kubeAdminConfigs = Objects.requireNonNull(kubeAdminConfigs);
            return this;
        }
        public Builder kubeAdminConfigs(GetKubernetesClusterKubeAdminConfig... kubeAdminConfigs) {
            return kubeAdminConfigs(List.of(kubeAdminConfigs));
        }
        @CustomType.Setter
        public Builder kubeConfigRaw(String kubeConfigRaw) {
            this.kubeConfigRaw = Objects.requireNonNull(kubeConfigRaw);
            return this;
        }
        @CustomType.Setter
        public Builder kubeConfigs(List<GetKubernetesClusterKubeConfig> kubeConfigs) {
            this.kubeConfigs = Objects.requireNonNull(kubeConfigs);
            return this;
        }
        public Builder kubeConfigs(GetKubernetesClusterKubeConfig... kubeConfigs) {
            return kubeConfigs(List.of(kubeConfigs));
        }
        @CustomType.Setter
        public Builder kubeletIdentities(List<GetKubernetesClusterKubeletIdentity> kubeletIdentities) {
            this.kubeletIdentities = Objects.requireNonNull(kubeletIdentities);
            return this;
        }
        public Builder kubeletIdentities(GetKubernetesClusterKubeletIdentity... kubeletIdentities) {
            return kubeletIdentities(List.of(kubeletIdentities));
        }
        @CustomType.Setter
        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = Objects.requireNonNull(kubernetesVersion);
            return this;
        }
        @CustomType.Setter
        public Builder linuxProfiles(List<GetKubernetesClusterLinuxProfile> linuxProfiles) {
            this.linuxProfiles = Objects.requireNonNull(linuxProfiles);
            return this;
        }
        public Builder linuxProfiles(GetKubernetesClusterLinuxProfile... linuxProfiles) {
            return linuxProfiles(List.of(linuxProfiles));
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder microsoftDefenders(List<GetKubernetesClusterMicrosoftDefender> microsoftDefenders) {
            this.microsoftDefenders = Objects.requireNonNull(microsoftDefenders);
            return this;
        }
        public Builder microsoftDefenders(GetKubernetesClusterMicrosoftDefender... microsoftDefenders) {
            return microsoftDefenders(List.of(microsoftDefenders));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder networkProfiles(List<GetKubernetesClusterNetworkProfile> networkProfiles) {
            this.networkProfiles = Objects.requireNonNull(networkProfiles);
            return this;
        }
        public Builder networkProfiles(GetKubernetesClusterNetworkProfile... networkProfiles) {
            return networkProfiles(List.of(networkProfiles));
        }
        @CustomType.Setter
        public Builder nodeResourceGroup(String nodeResourceGroup) {
            this.nodeResourceGroup = Objects.requireNonNull(nodeResourceGroup);
            return this;
        }
        @CustomType.Setter
        public Builder nodeResourceGroupId(String nodeResourceGroupId) {
            this.nodeResourceGroupId = Objects.requireNonNull(nodeResourceGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder oidcIssuerEnabled(Boolean oidcIssuerEnabled) {
            this.oidcIssuerEnabled = Objects.requireNonNull(oidcIssuerEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder oidcIssuerUrl(String oidcIssuerUrl) {
            this.oidcIssuerUrl = Objects.requireNonNull(oidcIssuerUrl);
            return this;
        }
        @CustomType.Setter
        public Builder omsAgents(List<GetKubernetesClusterOmsAgent> omsAgents) {
            this.omsAgents = Objects.requireNonNull(omsAgents);
            return this;
        }
        public Builder omsAgents(GetKubernetesClusterOmsAgent... omsAgents) {
            return omsAgents(List.of(omsAgents));
        }
        @CustomType.Setter
        public Builder openServiceMeshEnabled(Boolean openServiceMeshEnabled) {
            this.openServiceMeshEnabled = Objects.requireNonNull(openServiceMeshEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder privateClusterEnabled(Boolean privateClusterEnabled) {
            this.privateClusterEnabled = Objects.requireNonNull(privateClusterEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder privateFqdn(String privateFqdn) {
            this.privateFqdn = Objects.requireNonNull(privateFqdn);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder roleBasedAccessControlEnabled(Boolean roleBasedAccessControlEnabled) {
            this.roleBasedAccessControlEnabled = Objects.requireNonNull(roleBasedAccessControlEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder serviceMeshProfiles(List<GetKubernetesClusterServiceMeshProfile> serviceMeshProfiles) {
            this.serviceMeshProfiles = Objects.requireNonNull(serviceMeshProfiles);
            return this;
        }
        public Builder serviceMeshProfiles(GetKubernetesClusterServiceMeshProfile... serviceMeshProfiles) {
            return serviceMeshProfiles(List.of(serviceMeshProfiles));
        }
        @CustomType.Setter
        public Builder servicePrincipals(List<GetKubernetesClusterServicePrincipal> servicePrincipals) {
            this.servicePrincipals = Objects.requireNonNull(servicePrincipals);
            return this;
        }
        public Builder servicePrincipals(GetKubernetesClusterServicePrincipal... servicePrincipals) {
            return servicePrincipals(List.of(servicePrincipals));
        }
        @CustomType.Setter
        public Builder storageProfiles(List<GetKubernetesClusterStorageProfile> storageProfiles) {
            this.storageProfiles = Objects.requireNonNull(storageProfiles);
            return this;
        }
        public Builder storageProfiles(GetKubernetesClusterStorageProfile... storageProfiles) {
            return storageProfiles(List.of(storageProfiles));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder windowsProfiles(List<GetKubernetesClusterWindowsProfile> windowsProfiles) {
            this.windowsProfiles = Objects.requireNonNull(windowsProfiles);
            return this;
        }
        public Builder windowsProfiles(GetKubernetesClusterWindowsProfile... windowsProfiles) {
            return windowsProfiles(List.of(windowsProfiles));
        }
        public GetKubernetesClusterResult build() {
            final var _resultValue = new GetKubernetesClusterResult();
            _resultValue.aciConnectorLinuxes = aciConnectorLinuxes;
            _resultValue.agentPoolProfiles = agentPoolProfiles;
            _resultValue.apiServerAuthorizedIpRanges = apiServerAuthorizedIpRanges;
            _resultValue.azureActiveDirectoryRoleBasedAccessControls = azureActiveDirectoryRoleBasedAccessControls;
            _resultValue.azurePolicyEnabled = azurePolicyEnabled;
            _resultValue.currentKubernetesVersion = currentKubernetesVersion;
            _resultValue.customCaTrustCertificatesBase64s = customCaTrustCertificatesBase64s;
            _resultValue.diskEncryptionSetId = diskEncryptionSetId;
            _resultValue.dnsPrefix = dnsPrefix;
            _resultValue.fqdn = fqdn;
            _resultValue.httpApplicationRoutingEnabled = httpApplicationRoutingEnabled;
            _resultValue.httpApplicationRoutingZoneName = httpApplicationRoutingZoneName;
            _resultValue.id = id;
            _resultValue.identities = identities;
            _resultValue.ingressApplicationGateways = ingressApplicationGateways;
            _resultValue.keyManagementServices = keyManagementServices;
            _resultValue.keyVaultSecretsProviders = keyVaultSecretsProviders;
            _resultValue.kubeAdminConfigRaw = kubeAdminConfigRaw;
            _resultValue.kubeAdminConfigs = kubeAdminConfigs;
            _resultValue.kubeConfigRaw = kubeConfigRaw;
            _resultValue.kubeConfigs = kubeConfigs;
            _resultValue.kubeletIdentities = kubeletIdentities;
            _resultValue.kubernetesVersion = kubernetesVersion;
            _resultValue.linuxProfiles = linuxProfiles;
            _resultValue.location = location;
            _resultValue.microsoftDefenders = microsoftDefenders;
            _resultValue.name = name;
            _resultValue.networkProfiles = networkProfiles;
            _resultValue.nodeResourceGroup = nodeResourceGroup;
            _resultValue.nodeResourceGroupId = nodeResourceGroupId;
            _resultValue.oidcIssuerEnabled = oidcIssuerEnabled;
            _resultValue.oidcIssuerUrl = oidcIssuerUrl;
            _resultValue.omsAgents = omsAgents;
            _resultValue.openServiceMeshEnabled = openServiceMeshEnabled;
            _resultValue.privateClusterEnabled = privateClusterEnabled;
            _resultValue.privateFqdn = privateFqdn;
            _resultValue.resourceGroupName = resourceGroupName;
            _resultValue.roleBasedAccessControlEnabled = roleBasedAccessControlEnabled;
            _resultValue.serviceMeshProfiles = serviceMeshProfiles;
            _resultValue.servicePrincipals = servicePrincipals;
            _resultValue.storageProfiles = storageProfiles;
            _resultValue.tags = tags;
            _resultValue.windowsProfiles = windowsProfiles;
            return _resultValue;
        }
    }
}
