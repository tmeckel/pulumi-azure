// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AutomationRuleCondition {
    /**
     * @return The operator to use for evaluate the condition. Possible values include: `Equals`, `NotEquals`, `Contains`, `NotContains`, `StartsWith`, `NotStartsWith`, `EndsWith`, `NotEndsWith`.
     * 
     */
    private String operator;
    /**
     * @return The property to use for evaluate the condition. Possible values are `AccountAadTenantId`, `AccountAadUserId`, `AccountNTDomain`, `AccountName`, `AccountObjectGuid`, `AccountPUID`, `AccountSid`, `AccountUPNSuffix`, `AlertAnalyticRuleIds`, `AlertProductNames`, `AzureResourceResourceId`, `AzureResourceSubscriptionId`, `CloudApplicationAppId`, `CloudApplicationAppName`, `DNSDomainName`, `FileDirectory`, `FileHashValue`, `FileName`, `HostAzureID`, `HostNTDomain`, `HostName`, `HostNetBiosName`, `HostOSVersion`, `IPAddress`, `IncidentCustomDetailsKey`, `IncidentCustomDetailsValue`, `IncidentDescription`, `IncidentLabel`, `IncidentProviderName`, `IncidentRelatedAnalyticRuleIds`, `IncidentSeverity`, `IncidentStatus`, `IncidentTactics`, `IncidentTitle`, `IncidentUpdatedBySource`, `IoTDeviceId`, `IoTDeviceModel`, `IoTDeviceName`, `IoTDeviceOperatingSystem`, `IoTDeviceType`, `IoTDeviceVendor`, `MailMessageDeliveryAction`, `MailMessageDeliveryLocation`, `MailMessageP1Sender`, `MailMessageP2Sender`, `MailMessageRecipient`, `MailMessageSenderIP`, `MailMessageSubject`, `MailboxDisplayName`, `MailboxPrimaryAddress`, `MailboxUPN`, `MalwareCategory`, `MalwareName`, `ProcessCommandLine`, `ProcessId`, `RegistryKey`, `RegistryValueData` and `Url`.
     * 
     */
    private String property;
    /**
     * @return Specifies a list of values to use for evaluate the condition.
     * 
     */
    private List<String> values;

    private AutomationRuleCondition() {}
    /**
     * @return The operator to use for evaluate the condition. Possible values include: `Equals`, `NotEquals`, `Contains`, `NotContains`, `StartsWith`, `NotStartsWith`, `EndsWith`, `NotEndsWith`.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return The property to use for evaluate the condition. Possible values are `AccountAadTenantId`, `AccountAadUserId`, `AccountNTDomain`, `AccountName`, `AccountObjectGuid`, `AccountPUID`, `AccountSid`, `AccountUPNSuffix`, `AlertAnalyticRuleIds`, `AlertProductNames`, `AzureResourceResourceId`, `AzureResourceSubscriptionId`, `CloudApplicationAppId`, `CloudApplicationAppName`, `DNSDomainName`, `FileDirectory`, `FileHashValue`, `FileName`, `HostAzureID`, `HostNTDomain`, `HostName`, `HostNetBiosName`, `HostOSVersion`, `IPAddress`, `IncidentCustomDetailsKey`, `IncidentCustomDetailsValue`, `IncidentDescription`, `IncidentLabel`, `IncidentProviderName`, `IncidentRelatedAnalyticRuleIds`, `IncidentSeverity`, `IncidentStatus`, `IncidentTactics`, `IncidentTitle`, `IncidentUpdatedBySource`, `IoTDeviceId`, `IoTDeviceModel`, `IoTDeviceName`, `IoTDeviceOperatingSystem`, `IoTDeviceType`, `IoTDeviceVendor`, `MailMessageDeliveryAction`, `MailMessageDeliveryLocation`, `MailMessageP1Sender`, `MailMessageP2Sender`, `MailMessageRecipient`, `MailMessageSenderIP`, `MailMessageSubject`, `MailboxDisplayName`, `MailboxPrimaryAddress`, `MailboxUPN`, `MalwareCategory`, `MalwareName`, `ProcessCommandLine`, `ProcessId`, `RegistryKey`, `RegistryValueData` and `Url`.
     * 
     */
    public String property() {
        return this.property;
    }
    /**
     * @return Specifies a list of values to use for evaluate the condition.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private String property;
        private List<String> values;
        public Builder() {}
        public Builder(AutomationRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.property = defaults.property;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder property(String property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public AutomationRuleCondition build() {
            final var _resultValue = new AutomationRuleCondition();
            _resultValue.operator = operator;
            _resultValue.property = property;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
