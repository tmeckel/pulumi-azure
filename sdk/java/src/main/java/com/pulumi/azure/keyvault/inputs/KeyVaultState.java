// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs;
import com.pulumi.azure.keyvault.inputs.KeyVaultContactArgs;
import com.pulumi.azure.keyvault.inputs.KeyVaultNetworkAclsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyVaultState extends com.pulumi.resources.ResourceArgs {

    public static final KeyVaultState Empty = new KeyVaultState();

    /**
     * A list of up to 16 objects describing access policies, as described below.
     * 
     */
    @Import(name="accessPolicies")
    private @Nullable Output<List<KeyVaultAccessPolicyArgs>> accessPolicies;

    /**
     * @return A list of up to 16 objects describing access policies, as described below.
     * 
     */
    public Optional<Output<List<KeyVaultAccessPolicyArgs>>> accessPolicies() {
        return Optional.ofNullable(this.accessPolicies);
    }

    /**
     * One or more `contact` block as defined below.
     * 
     */
    @Import(name="contacts")
    private @Nullable Output<List<KeyVaultContactArgs>> contacts;

    /**
     * @return One or more `contact` block as defined below.
     * 
     */
    public Optional<Output<List<KeyVaultContactArgs>>> contacts() {
        return Optional.ofNullable(this.contacts);
    }

    /**
     * Boolean flag to specify whether Azure Key Vault uses Role Based Access Control (RBAC) for authorization of data actions. Defaults to `false`.
     * 
     */
    @Import(name="enableRbacAuthorization")
    private @Nullable Output<Boolean> enableRbacAuthorization;

    /**
     * @return Boolean flag to specify whether Azure Key Vault uses Role Based Access Control (RBAC) for authorization of data actions. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableRbacAuthorization() {
        return Optional.ofNullable(this.enableRbacAuthorization);
    }

    /**
     * Boolean flag to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault. Defaults to `false`.
     * 
     */
    @Import(name="enabledForDeployment")
    private @Nullable Output<Boolean> enabledForDeployment;

    /**
     * @return Boolean flag to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enabledForDeployment() {
        return Optional.ofNullable(this.enabledForDeployment);
    }

    /**
     * Boolean flag to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys. Defaults to `false`.
     * 
     */
    @Import(name="enabledForDiskEncryption")
    private @Nullable Output<Boolean> enabledForDiskEncryption;

    /**
     * @return Boolean flag to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enabledForDiskEncryption() {
        return Optional.ofNullable(this.enabledForDiskEncryption);
    }

    /**
     * Boolean flag to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault. Defaults to `false`.
     * 
     */
    @Import(name="enabledForTemplateDeployment")
    private @Nullable Output<Boolean> enabledForTemplateDeployment;

    /**
     * @return Boolean flag to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enabledForTemplateDeployment() {
        return Optional.ofNullable(this.enabledForTemplateDeployment);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Key Vault. Changing this forces a new resource to be created. The name must be globally unique. If the vault is in a recoverable state then the vault will need to be purged before reusing the name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Key Vault. Changing this forces a new resource to be created. The name must be globally unique. If the vault is in a recoverable state then the vault will need to be purged before reusing the name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `network_acls` block as defined below.
     * 
     */
    @Import(name="networkAcls")
    private @Nullable Output<KeyVaultNetworkAclsArgs> networkAcls;

    /**
     * @return A `network_acls` block as defined below.
     * 
     */
    public Optional<Output<KeyVaultNetworkAclsArgs>> networkAcls() {
        return Optional.ofNullable(this.networkAcls);
    }

    /**
     * Whether public network access is allowed for this Key Vault. Defaults to `true`.
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether public network access is allowed for this Key Vault. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * Is Purge Protection enabled for this Key Vault? Defaults to `false`.
     * 
     */
    @Import(name="purgeProtectionEnabled")
    private @Nullable Output<Boolean> purgeProtectionEnabled;

    /**
     * @return Is Purge Protection enabled for this Key Vault? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> purgeProtectionEnabled() {
        return Optional.ofNullable(this.purgeProtectionEnabled);
    }

    /**
     * The name of the resource group in which to create the Key Vault. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Key Vault. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The Name of the SKU used for this Key Vault. Possible values are `standard` and `premium`.
     * 
     */
    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    /**
     * @return The Name of the SKU used for this Key Vault. Possible values are `standard` and `premium`.
     * 
     */
    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    /**
     * The number of days that items should be retained for once soft-deleted. This value can be between `7` and `90` (the default) days.
     * 
     */
    @Import(name="softDeleteRetentionDays")
    private @Nullable Output<Integer> softDeleteRetentionDays;

    /**
     * @return The number of days that items should be retained for once soft-deleted. This value can be between `7` and `90` (the default) days.
     * 
     */
    public Optional<Output<Integer>> softDeleteRetentionDays() {
        return Optional.ofNullable(this.softDeleteRetentionDays);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The URI of the Key Vault, used for performing operations on keys and secrets.
     * 
     */
    @Import(name="vaultUri")
    private @Nullable Output<String> vaultUri;

    /**
     * @return The URI of the Key Vault, used for performing operations on keys and secrets.
     * 
     */
    public Optional<Output<String>> vaultUri() {
        return Optional.ofNullable(this.vaultUri);
    }

    private KeyVaultState() {}

    private KeyVaultState(KeyVaultState $) {
        this.accessPolicies = $.accessPolicies;
        this.contacts = $.contacts;
        this.enableRbacAuthorization = $.enableRbacAuthorization;
        this.enabledForDeployment = $.enabledForDeployment;
        this.enabledForDiskEncryption = $.enabledForDiskEncryption;
        this.enabledForTemplateDeployment = $.enabledForTemplateDeployment;
        this.location = $.location;
        this.name = $.name;
        this.networkAcls = $.networkAcls;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.purgeProtectionEnabled = $.purgeProtectionEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.softDeleteRetentionDays = $.softDeleteRetentionDays;
        this.tags = $.tags;
        this.tenantId = $.tenantId;
        this.vaultUri = $.vaultUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultState $;

        public Builder() {
            $ = new KeyVaultState();
        }

        public Builder(KeyVaultState defaults) {
            $ = new KeyVaultState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessPolicies A list of up to 16 objects describing access policies, as described below.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(@Nullable Output<List<KeyVaultAccessPolicyArgs>> accessPolicies) {
            $.accessPolicies = accessPolicies;
            return this;
        }

        /**
         * @param accessPolicies A list of up to 16 objects describing access policies, as described below.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(List<KeyVaultAccessPolicyArgs> accessPolicies) {
            return accessPolicies(Output.of(accessPolicies));
        }

        /**
         * @param accessPolicies A list of up to 16 objects describing access policies, as described below.
         * 
         * @return builder
         * 
         */
        public Builder accessPolicies(KeyVaultAccessPolicyArgs... accessPolicies) {
            return accessPolicies(List.of(accessPolicies));
        }

        /**
         * @param contacts One or more `contact` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder contacts(@Nullable Output<List<KeyVaultContactArgs>> contacts) {
            $.contacts = contacts;
            return this;
        }

        /**
         * @param contacts One or more `contact` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder contacts(List<KeyVaultContactArgs> contacts) {
            return contacts(Output.of(contacts));
        }

        /**
         * @param contacts One or more `contact` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder contacts(KeyVaultContactArgs... contacts) {
            return contacts(List.of(contacts));
        }

        /**
         * @param enableRbacAuthorization Boolean flag to specify whether Azure Key Vault uses Role Based Access Control (RBAC) for authorization of data actions. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableRbacAuthorization(@Nullable Output<Boolean> enableRbacAuthorization) {
            $.enableRbacAuthorization = enableRbacAuthorization;
            return this;
        }

        /**
         * @param enableRbacAuthorization Boolean flag to specify whether Azure Key Vault uses Role Based Access Control (RBAC) for authorization of data actions. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableRbacAuthorization(Boolean enableRbacAuthorization) {
            return enableRbacAuthorization(Output.of(enableRbacAuthorization));
        }

        /**
         * @param enabledForDeployment Boolean flag to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabledForDeployment(@Nullable Output<Boolean> enabledForDeployment) {
            $.enabledForDeployment = enabledForDeployment;
            return this;
        }

        /**
         * @param enabledForDeployment Boolean flag to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabledForDeployment(Boolean enabledForDeployment) {
            return enabledForDeployment(Output.of(enabledForDeployment));
        }

        /**
         * @param enabledForDiskEncryption Boolean flag to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabledForDiskEncryption(@Nullable Output<Boolean> enabledForDiskEncryption) {
            $.enabledForDiskEncryption = enabledForDiskEncryption;
            return this;
        }

        /**
         * @param enabledForDiskEncryption Boolean flag to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabledForDiskEncryption(Boolean enabledForDiskEncryption) {
            return enabledForDiskEncryption(Output.of(enabledForDiskEncryption));
        }

        /**
         * @param enabledForTemplateDeployment Boolean flag to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabledForTemplateDeployment(@Nullable Output<Boolean> enabledForTemplateDeployment) {
            $.enabledForTemplateDeployment = enabledForTemplateDeployment;
            return this;
        }

        /**
         * @param enabledForTemplateDeployment Boolean flag to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabledForTemplateDeployment(Boolean enabledForTemplateDeployment) {
            return enabledForTemplateDeployment(Output.of(enabledForTemplateDeployment));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Key Vault. Changing this forces a new resource to be created. The name must be globally unique. If the vault is in a recoverable state then the vault will need to be purged before reusing the name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Key Vault. Changing this forces a new resource to be created. The name must be globally unique. If the vault is in a recoverable state then the vault will need to be purged before reusing the name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkAcls A `network_acls` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder networkAcls(@Nullable Output<KeyVaultNetworkAclsArgs> networkAcls) {
            $.networkAcls = networkAcls;
            return this;
        }

        /**
         * @param networkAcls A `network_acls` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder networkAcls(KeyVaultNetworkAclsArgs networkAcls) {
            return networkAcls(Output.of(networkAcls));
        }

        /**
         * @param publicNetworkAccessEnabled Whether public network access is allowed for this Key Vault. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Whether public network access is allowed for this Key Vault. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param purgeProtectionEnabled Is Purge Protection enabled for this Key Vault? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder purgeProtectionEnabled(@Nullable Output<Boolean> purgeProtectionEnabled) {
            $.purgeProtectionEnabled = purgeProtectionEnabled;
            return this;
        }

        /**
         * @param purgeProtectionEnabled Is Purge Protection enabled for this Key Vault? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder purgeProtectionEnabled(Boolean purgeProtectionEnabled) {
            return purgeProtectionEnabled(Output.of(purgeProtectionEnabled));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Key Vault. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Key Vault. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param skuName The Name of the SKU used for this Key Vault. Possible values are `standard` and `premium`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        /**
         * @param skuName The Name of the SKU used for this Key Vault. Possible values are `standard` and `premium`.
         * 
         * @return builder
         * 
         */
        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        /**
         * @param softDeleteRetentionDays The number of days that items should be retained for once soft-deleted. This value can be between `7` and `90` (the default) days.
         * 
         * @return builder
         * 
         */
        public Builder softDeleteRetentionDays(@Nullable Output<Integer> softDeleteRetentionDays) {
            $.softDeleteRetentionDays = softDeleteRetentionDays;
            return this;
        }

        /**
         * @param softDeleteRetentionDays The number of days that items should be retained for once soft-deleted. This value can be between `7` and `90` (the default) days.
         * 
         * @return builder
         * 
         */
        public Builder softDeleteRetentionDays(Integer softDeleteRetentionDays) {
            return softDeleteRetentionDays(Output.of(softDeleteRetentionDays));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tenantId The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param vaultUri The URI of the Key Vault, used for performing operations on keys and secrets.
         * 
         * @return builder
         * 
         */
        public Builder vaultUri(@Nullable Output<String> vaultUri) {
            $.vaultUri = vaultUri;
            return this;
        }

        /**
         * @param vaultUri The URI of the Key Vault, used for performing operations on keys and secrets.
         * 
         * @return builder
         * 
         */
        public Builder vaultUri(String vaultUri) {
            return vaultUri(Output.of(vaultUri));
        }

        public KeyVaultState build() {
            return $;
        }
    }

}