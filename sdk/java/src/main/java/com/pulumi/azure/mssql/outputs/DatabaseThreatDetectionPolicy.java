// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseThreatDetectionPolicy {
    /**
     * @return Specifies a list of alerts which should be disabled. Possible values include `Access_Anomaly`, `Sql_Injection` and `Sql_Injection_Vulnerability`.
     * 
     */
    private @Nullable List<String> disabledAlerts;
    /**
     * @return Should the account administrators be emailed when this alert is triggered?
     * 
     */
    private @Nullable String emailAccountAdmins;
    /**
     * @return A list of email addresses which alerts should be sent to.
     * 
     */
    private @Nullable List<String> emailAddresses;
    /**
     * @return Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    private @Nullable Integer retentionDays;
    /**
     * @return The State of the Policy. Possible values are `Enabled`, `Disabled` or `New`.
     * 
     */
    private @Nullable String state;
    /**
     * @return Specifies the identifier key of the Threat Detection audit storage account. Required if `state` is `Enabled`.
     * 
     */
    private @Nullable String storageAccountAccessKey;
    /**
     * @return Specifies the blob storage endpoint (e.g. https://example.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs. Required if `state` is `Enabled`.
     * 
     */
    private @Nullable String storageEndpoint;

    private DatabaseThreatDetectionPolicy() {}
    /**
     * @return Specifies a list of alerts which should be disabled. Possible values include `Access_Anomaly`, `Sql_Injection` and `Sql_Injection_Vulnerability`.
     * 
     */
    public List<String> disabledAlerts() {
        return this.disabledAlerts == null ? List.of() : this.disabledAlerts;
    }
    /**
     * @return Should the account administrators be emailed when this alert is triggered?
     * 
     */
    public Optional<String> emailAccountAdmins() {
        return Optional.ofNullable(this.emailAccountAdmins);
    }
    /**
     * @return A list of email addresses which alerts should be sent to.
     * 
     */
    public List<String> emailAddresses() {
        return this.emailAddresses == null ? List.of() : this.emailAddresses;
    }
    /**
     * @return Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    public Optional<Integer> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }
    /**
     * @return The State of the Policy. Possible values are `Enabled`, `Disabled` or `New`.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return Specifies the identifier key of the Threat Detection audit storage account. Required if `state` is `Enabled`.
     * 
     */
    public Optional<String> storageAccountAccessKey() {
        return Optional.ofNullable(this.storageAccountAccessKey);
    }
    /**
     * @return Specifies the blob storage endpoint (e.g. https://example.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs. Required if `state` is `Enabled`.
     * 
     */
    public Optional<String> storageEndpoint() {
        return Optional.ofNullable(this.storageEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseThreatDetectionPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> disabledAlerts;
        private @Nullable String emailAccountAdmins;
        private @Nullable List<String> emailAddresses;
        private @Nullable Integer retentionDays;
        private @Nullable String state;
        private @Nullable String storageAccountAccessKey;
        private @Nullable String storageEndpoint;
        public Builder() {}
        public Builder(DatabaseThreatDetectionPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabledAlerts = defaults.disabledAlerts;
    	      this.emailAccountAdmins = defaults.emailAccountAdmins;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.retentionDays = defaults.retentionDays;
    	      this.state = defaults.state;
    	      this.storageAccountAccessKey = defaults.storageAccountAccessKey;
    	      this.storageEndpoint = defaults.storageEndpoint;
        }

        @CustomType.Setter
        public Builder disabledAlerts(@Nullable List<String> disabledAlerts) {
            this.disabledAlerts = disabledAlerts;
            return this;
        }
        public Builder disabledAlerts(String... disabledAlerts) {
            return disabledAlerts(List.of(disabledAlerts));
        }
        @CustomType.Setter
        public Builder emailAccountAdmins(@Nullable String emailAccountAdmins) {
            this.emailAccountAdmins = emailAccountAdmins;
            return this;
        }
        @CustomType.Setter
        public Builder emailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }
        @CustomType.Setter
        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountAccessKey(@Nullable String storageAccountAccessKey) {
            this.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }
        @CustomType.Setter
        public Builder storageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }
        public DatabaseThreatDetectionPolicy build() {
            final var o = new DatabaseThreatDetectionPolicy();
            o.disabledAlerts = disabledAlerts;
            o.emailAccountAdmins = emailAccountAdmins;
            o.emailAddresses = emailAddresses;
            o.retentionDays = retentionDays;
            o.state = state;
            o.storageAccountAccessKey = storageAccountAccessKey;
            o.storageEndpoint = storageEndpoint;
            return o;
        }
    }
}