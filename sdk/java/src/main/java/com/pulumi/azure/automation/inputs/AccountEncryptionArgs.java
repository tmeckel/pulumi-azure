// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountEncryptionArgs Empty = new AccountEncryptionArgs();

    /**
     * The source of the encryption key. Possible values are `Microsoft.Keyvault` and `Microsoft.Storage`.
     * 
     */
    @Import(name="keySource")
    private @Nullable Output<String> keySource;

    /**
     * @return The source of the encryption key. Possible values are `Microsoft.Keyvault` and `Microsoft.Storage`.
     * 
     */
    public Optional<Output<String>> keySource() {
        return Optional.ofNullable(this.keySource);
    }

    /**
     * The ID of the Key Vault Key which should be used to Encrypt the data in this Automation Account.
     * 
     */
    @Import(name="keyVaultKeyId", required=true)
    private Output<String> keyVaultKeyId;

    /**
     * @return The ID of the Key Vault Key which should be used to Encrypt the data in this Automation Account.
     * 
     */
    public Output<String> keyVaultKeyId() {
        return this.keyVaultKeyId;
    }

    /**
     * The User Assigned Managed Identity ID to be used for accessing the Customer Managed Key for encryption.
     * 
     */
    @Import(name="userAssignedIdentityId")
    private @Nullable Output<String> userAssignedIdentityId;

    /**
     * @return The User Assigned Managed Identity ID to be used for accessing the Customer Managed Key for encryption.
     * 
     */
    public Optional<Output<String>> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    private AccountEncryptionArgs() {}

    private AccountEncryptionArgs(AccountEncryptionArgs $) {
        this.keySource = $.keySource;
        this.keyVaultKeyId = $.keyVaultKeyId;
        this.userAssignedIdentityId = $.userAssignedIdentityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountEncryptionArgs $;

        public Builder() {
            $ = new AccountEncryptionArgs();
        }

        public Builder(AccountEncryptionArgs defaults) {
            $ = new AccountEncryptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keySource The source of the encryption key. Possible values are `Microsoft.Keyvault` and `Microsoft.Storage`.
         * 
         * @return builder
         * 
         */
        public Builder keySource(@Nullable Output<String> keySource) {
            $.keySource = keySource;
            return this;
        }

        /**
         * @param keySource The source of the encryption key. Possible values are `Microsoft.Keyvault` and `Microsoft.Storage`.
         * 
         * @return builder
         * 
         */
        public Builder keySource(String keySource) {
            return keySource(Output.of(keySource));
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to Encrypt the data in this Automation Account.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(Output<String> keyVaultKeyId) {
            $.keyVaultKeyId = keyVaultKeyId;
            return this;
        }

        /**
         * @param keyVaultKeyId The ID of the Key Vault Key which should be used to Encrypt the data in this Automation Account.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            return keyVaultKeyId(Output.of(keyVaultKeyId));
        }

        /**
         * @param userAssignedIdentityId The User Assigned Managed Identity ID to be used for accessing the Customer Managed Key for encryption.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(@Nullable Output<String> userAssignedIdentityId) {
            $.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }

        /**
         * @param userAssignedIdentityId The User Assigned Managed Identity ID to be used for accessing the Customer Managed Key for encryption.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityId(String userAssignedIdentityId) {
            return userAssignedIdentityId(Output.of(userAssignedIdentityId));
        }

        public AccountEncryptionArgs build() {
            $.keyVaultKeyId = Objects.requireNonNull($.keyVaultKeyId, "expected parameter 'keyVaultKeyId' to be non-null");
            return $;
        }
    }

}