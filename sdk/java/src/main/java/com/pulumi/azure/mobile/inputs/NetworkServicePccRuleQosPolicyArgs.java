// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mobile.inputs;

import com.pulumi.azure.mobile.inputs.NetworkServicePccRuleQosPolicyGuaranteedBitRateArgs;
import com.pulumi.azure.mobile.inputs.NetworkServicePccRuleQosPolicyMaximumBitRateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkServicePccRuleQosPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkServicePccRuleQosPolicyArgs Empty = new NetworkServicePccRuleQosPolicyArgs();

    /**
     * QoS Flow allocation and retention priority (ARP) level. Flows with higher priority preempt flows with lower priority, if the settings of `preemption_capability` and `preemption_vulnerability` allow it. 1 is the highest level of priority. If this field is not specified then `qos_indicator` is used to derive the ARP value. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters.
     * 
     */
    @Import(name="allocationAndRetentionPriorityLevel")
    private @Nullable Output<Integer> allocationAndRetentionPriorityLevel;

    /**
     * @return QoS Flow allocation and retention priority (ARP) level. Flows with higher priority preempt flows with lower priority, if the settings of `preemption_capability` and `preemption_vulnerability` allow it. 1 is the highest level of priority. If this field is not specified then `qos_indicator` is used to derive the ARP value. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters.
     * 
     */
    public Optional<Output<Integer>> allocationAndRetentionPriorityLevel() {
        return Optional.ofNullable(this.allocationAndRetentionPriorityLevel);
    }

    /**
     * A `guaranteed_bit_rate` block as defined below. The Guaranteed Bit Rate (GBR) for all service data flows that use this PCC Rule. If it&#39;s not specified, there will be no GBR set for the PCC Rule that uses this QoS definition.
     * 
     */
    @Import(name="guaranteedBitRate")
    private @Nullable Output<NetworkServicePccRuleQosPolicyGuaranteedBitRateArgs> guaranteedBitRate;

    /**
     * @return A `guaranteed_bit_rate` block as defined below. The Guaranteed Bit Rate (GBR) for all service data flows that use this PCC Rule. If it&#39;s not specified, there will be no GBR set for the PCC Rule that uses this QoS definition.
     * 
     */
    public Optional<Output<NetworkServicePccRuleQosPolicyGuaranteedBitRateArgs>> guaranteedBitRate() {
        return Optional.ofNullable(this.guaranteedBitRate);
    }

    /**
     * A `maximum_bit_rate` block as defined below. The Maximum Bit Rate (MBR) for all service data flows that use this PCC Rule or Service.
     * 
     */
    @Import(name="maximumBitRate", required=true)
    private Output<NetworkServicePccRuleQosPolicyMaximumBitRateArgs> maximumBitRate;

    /**
     * @return A `maximum_bit_rate` block as defined below. The Maximum Bit Rate (MBR) for all service data flows that use this PCC Rule or Service.
     * 
     */
    public Output<NetworkServicePccRuleQosPolicyMaximumBitRateArgs> maximumBitRate() {
        return this.maximumBitRate;
    }

    /**
     * The Preemption Capability of a QoS Flow controls whether it can preempt another QoS Flow with a lower priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters. Possible values are `NotPreempt` and `MayPreempt`, Defaults to `NotPreempt`.
     * 
     */
    @Import(name="preemptionCapability")
    private @Nullable Output<String> preemptionCapability;

    /**
     * @return The Preemption Capability of a QoS Flow controls whether it can preempt another QoS Flow with a lower priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters. Possible values are `NotPreempt` and `MayPreempt`, Defaults to `NotPreempt`.
     * 
     */
    public Optional<Output<String>> preemptionCapability() {
        return Optional.ofNullable(this.preemptionCapability);
    }

    /**
     * The Preemption Vulnerability of a QoS Flow controls whether it can be preempted by QoS Flow with a higher priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters. Possible values are `NotPreemptable` and `Preemptable`. Defaults to `Preemptable`.
     * 
     */
    @Import(name="preemptionVulnerability")
    private @Nullable Output<String> preemptionVulnerability;

    /**
     * @return The Preemption Vulnerability of a QoS Flow controls whether it can be preempted by QoS Flow with a higher priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters. Possible values are `NotPreemptable` and `Preemptable`. Defaults to `Preemptable`.
     * 
     */
    public Optional<Output<String>> preemptionVulnerability() {
        return Optional.ofNullable(this.preemptionVulnerability);
    }

    /**
     * The QoS Indicator (5QI for 5G network /QCI for 4G net work) value identifies a set of QoS characteristics that control QoS forwarding treatment for QoS flows or EPS bearers. Recommended values: 5-9; 69-70; 79-80. Must be between `1` and `127`.
     * 
     */
    @Import(name="qosIndicator", required=true)
    private Output<Integer> qosIndicator;

    /**
     * @return The QoS Indicator (5QI for 5G network /QCI for 4G net work) value identifies a set of QoS characteristics that control QoS forwarding treatment for QoS flows or EPS bearers. Recommended values: 5-9; 69-70; 79-80. Must be between `1` and `127`.
     * 
     */
    public Output<Integer> qosIndicator() {
        return this.qosIndicator;
    }

    private NetworkServicePccRuleQosPolicyArgs() {}

    private NetworkServicePccRuleQosPolicyArgs(NetworkServicePccRuleQosPolicyArgs $) {
        this.allocationAndRetentionPriorityLevel = $.allocationAndRetentionPriorityLevel;
        this.guaranteedBitRate = $.guaranteedBitRate;
        this.maximumBitRate = $.maximumBitRate;
        this.preemptionCapability = $.preemptionCapability;
        this.preemptionVulnerability = $.preemptionVulnerability;
        this.qosIndicator = $.qosIndicator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkServicePccRuleQosPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkServicePccRuleQosPolicyArgs $;

        public Builder() {
            $ = new NetworkServicePccRuleQosPolicyArgs();
        }

        public Builder(NetworkServicePccRuleQosPolicyArgs defaults) {
            $ = new NetworkServicePccRuleQosPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocationAndRetentionPriorityLevel QoS Flow allocation and retention priority (ARP) level. Flows with higher priority preempt flows with lower priority, if the settings of `preemption_capability` and `preemption_vulnerability` allow it. 1 is the highest level of priority. If this field is not specified then `qos_indicator` is used to derive the ARP value. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters.
         * 
         * @return builder
         * 
         */
        public Builder allocationAndRetentionPriorityLevel(@Nullable Output<Integer> allocationAndRetentionPriorityLevel) {
            $.allocationAndRetentionPriorityLevel = allocationAndRetentionPriorityLevel;
            return this;
        }

        /**
         * @param allocationAndRetentionPriorityLevel QoS Flow allocation and retention priority (ARP) level. Flows with higher priority preempt flows with lower priority, if the settings of `preemption_capability` and `preemption_vulnerability` allow it. 1 is the highest level of priority. If this field is not specified then `qos_indicator` is used to derive the ARP value. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters.
         * 
         * @return builder
         * 
         */
        public Builder allocationAndRetentionPriorityLevel(Integer allocationAndRetentionPriorityLevel) {
            return allocationAndRetentionPriorityLevel(Output.of(allocationAndRetentionPriorityLevel));
        }

        /**
         * @param guaranteedBitRate A `guaranteed_bit_rate` block as defined below. The Guaranteed Bit Rate (GBR) for all service data flows that use this PCC Rule. If it&#39;s not specified, there will be no GBR set for the PCC Rule that uses this QoS definition.
         * 
         * @return builder
         * 
         */
        public Builder guaranteedBitRate(@Nullable Output<NetworkServicePccRuleQosPolicyGuaranteedBitRateArgs> guaranteedBitRate) {
            $.guaranteedBitRate = guaranteedBitRate;
            return this;
        }

        /**
         * @param guaranteedBitRate A `guaranteed_bit_rate` block as defined below. The Guaranteed Bit Rate (GBR) for all service data flows that use this PCC Rule. If it&#39;s not specified, there will be no GBR set for the PCC Rule that uses this QoS definition.
         * 
         * @return builder
         * 
         */
        public Builder guaranteedBitRate(NetworkServicePccRuleQosPolicyGuaranteedBitRateArgs guaranteedBitRate) {
            return guaranteedBitRate(Output.of(guaranteedBitRate));
        }

        /**
         * @param maximumBitRate A `maximum_bit_rate` block as defined below. The Maximum Bit Rate (MBR) for all service data flows that use this PCC Rule or Service.
         * 
         * @return builder
         * 
         */
        public Builder maximumBitRate(Output<NetworkServicePccRuleQosPolicyMaximumBitRateArgs> maximumBitRate) {
            $.maximumBitRate = maximumBitRate;
            return this;
        }

        /**
         * @param maximumBitRate A `maximum_bit_rate` block as defined below. The Maximum Bit Rate (MBR) for all service data flows that use this PCC Rule or Service.
         * 
         * @return builder
         * 
         */
        public Builder maximumBitRate(NetworkServicePccRuleQosPolicyMaximumBitRateArgs maximumBitRate) {
            return maximumBitRate(Output.of(maximumBitRate));
        }

        /**
         * @param preemptionCapability The Preemption Capability of a QoS Flow controls whether it can preempt another QoS Flow with a lower priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters. Possible values are `NotPreempt` and `MayPreempt`, Defaults to `NotPreempt`.
         * 
         * @return builder
         * 
         */
        public Builder preemptionCapability(@Nullable Output<String> preemptionCapability) {
            $.preemptionCapability = preemptionCapability;
            return this;
        }

        /**
         * @param preemptionCapability The Preemption Capability of a QoS Flow controls whether it can preempt another QoS Flow with a lower priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters. Possible values are `NotPreempt` and `MayPreempt`, Defaults to `NotPreempt`.
         * 
         * @return builder
         * 
         */
        public Builder preemptionCapability(String preemptionCapability) {
            return preemptionCapability(Output.of(preemptionCapability));
        }

        /**
         * @param preemptionVulnerability The Preemption Vulnerability of a QoS Flow controls whether it can be preempted by QoS Flow with a higher priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters. Possible values are `NotPreemptable` and `Preemptable`. Defaults to `Preemptable`.
         * 
         * @return builder
         * 
         */
        public Builder preemptionVulnerability(@Nullable Output<String> preemptionVulnerability) {
            $.preemptionVulnerability = preemptionVulnerability;
            return this;
        }

        /**
         * @param preemptionVulnerability The Preemption Vulnerability of a QoS Flow controls whether it can be preempted by QoS Flow with a higher priority level. See 3GPP TS23.501 section 5.7.2.2 for a full description of the ARP parameters. Possible values are `NotPreemptable` and `Preemptable`. Defaults to `Preemptable`.
         * 
         * @return builder
         * 
         */
        public Builder preemptionVulnerability(String preemptionVulnerability) {
            return preemptionVulnerability(Output.of(preemptionVulnerability));
        }

        /**
         * @param qosIndicator The QoS Indicator (5QI for 5G network /QCI for 4G net work) value identifies a set of QoS characteristics that control QoS forwarding treatment for QoS flows or EPS bearers. Recommended values: 5-9; 69-70; 79-80. Must be between `1` and `127`.
         * 
         * @return builder
         * 
         */
        public Builder qosIndicator(Output<Integer> qosIndicator) {
            $.qosIndicator = qosIndicator;
            return this;
        }

        /**
         * @param qosIndicator The QoS Indicator (5QI for 5G network /QCI for 4G net work) value identifies a set of QoS characteristics that control QoS forwarding treatment for QoS flows or EPS bearers. Recommended values: 5-9; 69-70; 79-80. Must be between `1` and `127`.
         * 
         * @return builder
         * 
         */
        public Builder qosIndicator(Integer qosIndicator) {
            return qosIndicator(Output.of(qosIndicator));
        }

        public NetworkServicePccRuleQosPolicyArgs build() {
            $.maximumBitRate = Objects.requireNonNull($.maximumBitRate, "expected parameter 'maximumBitRate' to be non-null");
            $.qosIndicator = Objects.requireNonNull($.qosIndicator, "expected parameter 'qosIndicator' to be non-null");
            return $;
        }
    }

}
