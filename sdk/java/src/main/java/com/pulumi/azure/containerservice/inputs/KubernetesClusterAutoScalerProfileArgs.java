// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterAutoScalerProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterAutoScalerProfileArgs Empty = new KubernetesClusterAutoScalerProfileArgs();

    /**
     * Detect similar node groups and balance the number of nodes between them. Defaults to `false`.
     * 
     */
    @Import(name="balanceSimilarNodeGroups")
    private @Nullable Output<Boolean> balanceSimilarNodeGroups;

    /**
     * @return Detect similar node groups and balance the number of nodes between them. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> balanceSimilarNodeGroups() {
        return Optional.ofNullable(this.balanceSimilarNodeGroups);
    }

    /**
     * Maximum number of empty nodes that can be deleted at the same time. Defaults to `10`.
     * 
     */
    @Import(name="emptyBulkDeleteMax")
    private @Nullable Output<String> emptyBulkDeleteMax;

    /**
     * @return Maximum number of empty nodes that can be deleted at the same time. Defaults to `10`.
     * 
     */
    public Optional<Output<String>> emptyBulkDeleteMax() {
        return Optional.ofNullable(this.emptyBulkDeleteMax);
    }

    /**
     * Expander to use. Possible values are `least-waste`, `priority`, `most-pods` and `random`. Defaults to `random`.
     * 
     */
    @Import(name="expander")
    private @Nullable Output<String> expander;

    /**
     * @return Expander to use. Possible values are `least-waste`, `priority`, `most-pods` and `random`. Defaults to `random`.
     * 
     */
    public Optional<Output<String>> expander() {
        return Optional.ofNullable(this.expander);
    }

    /**
     * Maximum number of seconds the cluster autoscaler waits for pod termination when trying to scale down a node. Defaults to `600`.
     * 
     */
    @Import(name="maxGracefulTerminationSec")
    private @Nullable Output<String> maxGracefulTerminationSec;

    /**
     * @return Maximum number of seconds the cluster autoscaler waits for pod termination when trying to scale down a node. Defaults to `600`.
     * 
     */
    public Optional<Output<String>> maxGracefulTerminationSec() {
        return Optional.ofNullable(this.maxGracefulTerminationSec);
    }

    /**
     * Maximum time the autoscaler waits for a node to be provisioned. Defaults to `15m`.
     * 
     */
    @Import(name="maxNodeProvisioningTime")
    private @Nullable Output<String> maxNodeProvisioningTime;

    /**
     * @return Maximum time the autoscaler waits for a node to be provisioned. Defaults to `15m`.
     * 
     */
    public Optional<Output<String>> maxNodeProvisioningTime() {
        return Optional.ofNullable(this.maxNodeProvisioningTime);
    }

    /**
     * Maximum Number of allowed unready nodes. Defaults to `3`.
     * 
     */
    @Import(name="maxUnreadyNodes")
    private @Nullable Output<Integer> maxUnreadyNodes;

    /**
     * @return Maximum Number of allowed unready nodes. Defaults to `3`.
     * 
     */
    public Optional<Output<Integer>> maxUnreadyNodes() {
        return Optional.ofNullable(this.maxUnreadyNodes);
    }

    /**
     * Maximum percentage of unready nodes the cluster autoscaler will stop if the percentage is exceeded. Defaults to `45`.
     * 
     */
    @Import(name="maxUnreadyPercentage")
    private @Nullable Output<Double> maxUnreadyPercentage;

    /**
     * @return Maximum percentage of unready nodes the cluster autoscaler will stop if the percentage is exceeded. Defaults to `45`.
     * 
     */
    public Optional<Output<Double>> maxUnreadyPercentage() {
        return Optional.ofNullable(this.maxUnreadyPercentage);
    }

    /**
     * For scenarios like burst/batch scale where you don&#39;t want CA to act before the kubernetes scheduler could schedule all the pods, you can tell CA to ignore unscheduled pods before they&#39;re a certain age. Defaults to `10s`.
     * 
     */
    @Import(name="newPodScaleUpDelay")
    private @Nullable Output<String> newPodScaleUpDelay;

    /**
     * @return For scenarios like burst/batch scale where you don&#39;t want CA to act before the kubernetes scheduler could schedule all the pods, you can tell CA to ignore unscheduled pods before they&#39;re a certain age. Defaults to `10s`.
     * 
     */
    public Optional<Output<String>> newPodScaleUpDelay() {
        return Optional.ofNullable(this.newPodScaleUpDelay);
    }

    /**
     * How long after the scale up of AKS nodes the scale down evaluation resumes. Defaults to `10m`.
     * 
     */
    @Import(name="scaleDownDelayAfterAdd")
    private @Nullable Output<String> scaleDownDelayAfterAdd;

    /**
     * @return How long after the scale up of AKS nodes the scale down evaluation resumes. Defaults to `10m`.
     * 
     */
    public Optional<Output<String>> scaleDownDelayAfterAdd() {
        return Optional.ofNullable(this.scaleDownDelayAfterAdd);
    }

    /**
     * How long after node deletion that scale down evaluation resumes. Defaults to the value used for `scan_interval`.
     * 
     */
    @Import(name="scaleDownDelayAfterDelete")
    private @Nullable Output<String> scaleDownDelayAfterDelete;

    /**
     * @return How long after node deletion that scale down evaluation resumes. Defaults to the value used for `scan_interval`.
     * 
     */
    public Optional<Output<String>> scaleDownDelayAfterDelete() {
        return Optional.ofNullable(this.scaleDownDelayAfterDelete);
    }

    /**
     * How long after scale down failure that scale down evaluation resumes. Defaults to `3m`.
     * 
     */
    @Import(name="scaleDownDelayAfterFailure")
    private @Nullable Output<String> scaleDownDelayAfterFailure;

    /**
     * @return How long after scale down failure that scale down evaluation resumes. Defaults to `3m`.
     * 
     */
    public Optional<Output<String>> scaleDownDelayAfterFailure() {
        return Optional.ofNullable(this.scaleDownDelayAfterFailure);
    }

    /**
     * How long a node should be unneeded before it is eligible for scale down. Defaults to `10m`.
     * 
     */
    @Import(name="scaleDownUnneeded")
    private @Nullable Output<String> scaleDownUnneeded;

    /**
     * @return How long a node should be unneeded before it is eligible for scale down. Defaults to `10m`.
     * 
     */
    public Optional<Output<String>> scaleDownUnneeded() {
        return Optional.ofNullable(this.scaleDownUnneeded);
    }

    /**
     * How long an unready node should be unneeded before it is eligible for scale down. Defaults to `20m`.
     * 
     */
    @Import(name="scaleDownUnready")
    private @Nullable Output<String> scaleDownUnready;

    /**
     * @return How long an unready node should be unneeded before it is eligible for scale down. Defaults to `20m`.
     * 
     */
    public Optional<Output<String>> scaleDownUnready() {
        return Optional.ofNullable(this.scaleDownUnready);
    }

    /**
     * Node utilization level, defined as sum of requested resources divided by capacity, below which a node can be considered for scale down. Defaults to `0.5`.
     * 
     */
    @Import(name="scaleDownUtilizationThreshold")
    private @Nullable Output<String> scaleDownUtilizationThreshold;

    /**
     * @return Node utilization level, defined as sum of requested resources divided by capacity, below which a node can be considered for scale down. Defaults to `0.5`.
     * 
     */
    public Optional<Output<String>> scaleDownUtilizationThreshold() {
        return Optional.ofNullable(this.scaleDownUtilizationThreshold);
    }

    /**
     * How often the AKS Cluster should be re-evaluated for scale up/down. Defaults to `10s`.
     * 
     */
    @Import(name="scanInterval")
    private @Nullable Output<String> scanInterval;

    /**
     * @return How often the AKS Cluster should be re-evaluated for scale up/down. Defaults to `10s`.
     * 
     */
    public Optional<Output<String>> scanInterval() {
        return Optional.ofNullable(this.scanInterval);
    }

    /**
     * If `true` cluster autoscaler will never delete nodes with pods with local storage, for example, EmptyDir or HostPath. Defaults to `true`.
     * 
     */
    @Import(name="skipNodesWithLocalStorage")
    private @Nullable Output<Boolean> skipNodesWithLocalStorage;

    /**
     * @return If `true` cluster autoscaler will never delete nodes with pods with local storage, for example, EmptyDir or HostPath. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> skipNodesWithLocalStorage() {
        return Optional.ofNullable(this.skipNodesWithLocalStorage);
    }

    /**
     * If `true` cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Defaults to `true`.
     * 
     */
    @Import(name="skipNodesWithSystemPods")
    private @Nullable Output<Boolean> skipNodesWithSystemPods;

    /**
     * @return If `true` cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> skipNodesWithSystemPods() {
        return Optional.ofNullable(this.skipNodesWithSystemPods);
    }

    private KubernetesClusterAutoScalerProfileArgs() {}

    private KubernetesClusterAutoScalerProfileArgs(KubernetesClusterAutoScalerProfileArgs $) {
        this.balanceSimilarNodeGroups = $.balanceSimilarNodeGroups;
        this.emptyBulkDeleteMax = $.emptyBulkDeleteMax;
        this.expander = $.expander;
        this.maxGracefulTerminationSec = $.maxGracefulTerminationSec;
        this.maxNodeProvisioningTime = $.maxNodeProvisioningTime;
        this.maxUnreadyNodes = $.maxUnreadyNodes;
        this.maxUnreadyPercentage = $.maxUnreadyPercentage;
        this.newPodScaleUpDelay = $.newPodScaleUpDelay;
        this.scaleDownDelayAfterAdd = $.scaleDownDelayAfterAdd;
        this.scaleDownDelayAfterDelete = $.scaleDownDelayAfterDelete;
        this.scaleDownDelayAfterFailure = $.scaleDownDelayAfterFailure;
        this.scaleDownUnneeded = $.scaleDownUnneeded;
        this.scaleDownUnready = $.scaleDownUnready;
        this.scaleDownUtilizationThreshold = $.scaleDownUtilizationThreshold;
        this.scanInterval = $.scanInterval;
        this.skipNodesWithLocalStorage = $.skipNodesWithLocalStorage;
        this.skipNodesWithSystemPods = $.skipNodesWithSystemPods;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterAutoScalerProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterAutoScalerProfileArgs $;

        public Builder() {
            $ = new KubernetesClusterAutoScalerProfileArgs();
        }

        public Builder(KubernetesClusterAutoScalerProfileArgs defaults) {
            $ = new KubernetesClusterAutoScalerProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param balanceSimilarNodeGroups Detect similar node groups and balance the number of nodes between them. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder balanceSimilarNodeGroups(@Nullable Output<Boolean> balanceSimilarNodeGroups) {
            $.balanceSimilarNodeGroups = balanceSimilarNodeGroups;
            return this;
        }

        /**
         * @param balanceSimilarNodeGroups Detect similar node groups and balance the number of nodes between them. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder balanceSimilarNodeGroups(Boolean balanceSimilarNodeGroups) {
            return balanceSimilarNodeGroups(Output.of(balanceSimilarNodeGroups));
        }

        /**
         * @param emptyBulkDeleteMax Maximum number of empty nodes that can be deleted at the same time. Defaults to `10`.
         * 
         * @return builder
         * 
         */
        public Builder emptyBulkDeleteMax(@Nullable Output<String> emptyBulkDeleteMax) {
            $.emptyBulkDeleteMax = emptyBulkDeleteMax;
            return this;
        }

        /**
         * @param emptyBulkDeleteMax Maximum number of empty nodes that can be deleted at the same time. Defaults to `10`.
         * 
         * @return builder
         * 
         */
        public Builder emptyBulkDeleteMax(String emptyBulkDeleteMax) {
            return emptyBulkDeleteMax(Output.of(emptyBulkDeleteMax));
        }

        /**
         * @param expander Expander to use. Possible values are `least-waste`, `priority`, `most-pods` and `random`. Defaults to `random`.
         * 
         * @return builder
         * 
         */
        public Builder expander(@Nullable Output<String> expander) {
            $.expander = expander;
            return this;
        }

        /**
         * @param expander Expander to use. Possible values are `least-waste`, `priority`, `most-pods` and `random`. Defaults to `random`.
         * 
         * @return builder
         * 
         */
        public Builder expander(String expander) {
            return expander(Output.of(expander));
        }

        /**
         * @param maxGracefulTerminationSec Maximum number of seconds the cluster autoscaler waits for pod termination when trying to scale down a node. Defaults to `600`.
         * 
         * @return builder
         * 
         */
        public Builder maxGracefulTerminationSec(@Nullable Output<String> maxGracefulTerminationSec) {
            $.maxGracefulTerminationSec = maxGracefulTerminationSec;
            return this;
        }

        /**
         * @param maxGracefulTerminationSec Maximum number of seconds the cluster autoscaler waits for pod termination when trying to scale down a node. Defaults to `600`.
         * 
         * @return builder
         * 
         */
        public Builder maxGracefulTerminationSec(String maxGracefulTerminationSec) {
            return maxGracefulTerminationSec(Output.of(maxGracefulTerminationSec));
        }

        /**
         * @param maxNodeProvisioningTime Maximum time the autoscaler waits for a node to be provisioned. Defaults to `15m`.
         * 
         * @return builder
         * 
         */
        public Builder maxNodeProvisioningTime(@Nullable Output<String> maxNodeProvisioningTime) {
            $.maxNodeProvisioningTime = maxNodeProvisioningTime;
            return this;
        }

        /**
         * @param maxNodeProvisioningTime Maximum time the autoscaler waits for a node to be provisioned. Defaults to `15m`.
         * 
         * @return builder
         * 
         */
        public Builder maxNodeProvisioningTime(String maxNodeProvisioningTime) {
            return maxNodeProvisioningTime(Output.of(maxNodeProvisioningTime));
        }

        /**
         * @param maxUnreadyNodes Maximum Number of allowed unready nodes. Defaults to `3`.
         * 
         * @return builder
         * 
         */
        public Builder maxUnreadyNodes(@Nullable Output<Integer> maxUnreadyNodes) {
            $.maxUnreadyNodes = maxUnreadyNodes;
            return this;
        }

        /**
         * @param maxUnreadyNodes Maximum Number of allowed unready nodes. Defaults to `3`.
         * 
         * @return builder
         * 
         */
        public Builder maxUnreadyNodes(Integer maxUnreadyNodes) {
            return maxUnreadyNodes(Output.of(maxUnreadyNodes));
        }

        /**
         * @param maxUnreadyPercentage Maximum percentage of unready nodes the cluster autoscaler will stop if the percentage is exceeded. Defaults to `45`.
         * 
         * @return builder
         * 
         */
        public Builder maxUnreadyPercentage(@Nullable Output<Double> maxUnreadyPercentage) {
            $.maxUnreadyPercentage = maxUnreadyPercentage;
            return this;
        }

        /**
         * @param maxUnreadyPercentage Maximum percentage of unready nodes the cluster autoscaler will stop if the percentage is exceeded. Defaults to `45`.
         * 
         * @return builder
         * 
         */
        public Builder maxUnreadyPercentage(Double maxUnreadyPercentage) {
            return maxUnreadyPercentage(Output.of(maxUnreadyPercentage));
        }

        /**
         * @param newPodScaleUpDelay For scenarios like burst/batch scale where you don&#39;t want CA to act before the kubernetes scheduler could schedule all the pods, you can tell CA to ignore unscheduled pods before they&#39;re a certain age. Defaults to `10s`.
         * 
         * @return builder
         * 
         */
        public Builder newPodScaleUpDelay(@Nullable Output<String> newPodScaleUpDelay) {
            $.newPodScaleUpDelay = newPodScaleUpDelay;
            return this;
        }

        /**
         * @param newPodScaleUpDelay For scenarios like burst/batch scale where you don&#39;t want CA to act before the kubernetes scheduler could schedule all the pods, you can tell CA to ignore unscheduled pods before they&#39;re a certain age. Defaults to `10s`.
         * 
         * @return builder
         * 
         */
        public Builder newPodScaleUpDelay(String newPodScaleUpDelay) {
            return newPodScaleUpDelay(Output.of(newPodScaleUpDelay));
        }

        /**
         * @param scaleDownDelayAfterAdd How long after the scale up of AKS nodes the scale down evaluation resumes. Defaults to `10m`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownDelayAfterAdd(@Nullable Output<String> scaleDownDelayAfterAdd) {
            $.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
            return this;
        }

        /**
         * @param scaleDownDelayAfterAdd How long after the scale up of AKS nodes the scale down evaluation resumes. Defaults to `10m`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownDelayAfterAdd(String scaleDownDelayAfterAdd) {
            return scaleDownDelayAfterAdd(Output.of(scaleDownDelayAfterAdd));
        }

        /**
         * @param scaleDownDelayAfterDelete How long after node deletion that scale down evaluation resumes. Defaults to the value used for `scan_interval`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownDelayAfterDelete(@Nullable Output<String> scaleDownDelayAfterDelete) {
            $.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
            return this;
        }

        /**
         * @param scaleDownDelayAfterDelete How long after node deletion that scale down evaluation resumes. Defaults to the value used for `scan_interval`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownDelayAfterDelete(String scaleDownDelayAfterDelete) {
            return scaleDownDelayAfterDelete(Output.of(scaleDownDelayAfterDelete));
        }

        /**
         * @param scaleDownDelayAfterFailure How long after scale down failure that scale down evaluation resumes. Defaults to `3m`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownDelayAfterFailure(@Nullable Output<String> scaleDownDelayAfterFailure) {
            $.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
            return this;
        }

        /**
         * @param scaleDownDelayAfterFailure How long after scale down failure that scale down evaluation resumes. Defaults to `3m`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownDelayAfterFailure(String scaleDownDelayAfterFailure) {
            return scaleDownDelayAfterFailure(Output.of(scaleDownDelayAfterFailure));
        }

        /**
         * @param scaleDownUnneeded How long a node should be unneeded before it is eligible for scale down. Defaults to `10m`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownUnneeded(@Nullable Output<String> scaleDownUnneeded) {
            $.scaleDownUnneeded = scaleDownUnneeded;
            return this;
        }

        /**
         * @param scaleDownUnneeded How long a node should be unneeded before it is eligible for scale down. Defaults to `10m`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownUnneeded(String scaleDownUnneeded) {
            return scaleDownUnneeded(Output.of(scaleDownUnneeded));
        }

        /**
         * @param scaleDownUnready How long an unready node should be unneeded before it is eligible for scale down. Defaults to `20m`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownUnready(@Nullable Output<String> scaleDownUnready) {
            $.scaleDownUnready = scaleDownUnready;
            return this;
        }

        /**
         * @param scaleDownUnready How long an unready node should be unneeded before it is eligible for scale down. Defaults to `20m`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownUnready(String scaleDownUnready) {
            return scaleDownUnready(Output.of(scaleDownUnready));
        }

        /**
         * @param scaleDownUtilizationThreshold Node utilization level, defined as sum of requested resources divided by capacity, below which a node can be considered for scale down. Defaults to `0.5`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownUtilizationThreshold(@Nullable Output<String> scaleDownUtilizationThreshold) {
            $.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
            return this;
        }

        /**
         * @param scaleDownUtilizationThreshold Node utilization level, defined as sum of requested resources divided by capacity, below which a node can be considered for scale down. Defaults to `0.5`.
         * 
         * @return builder
         * 
         */
        public Builder scaleDownUtilizationThreshold(String scaleDownUtilizationThreshold) {
            return scaleDownUtilizationThreshold(Output.of(scaleDownUtilizationThreshold));
        }

        /**
         * @param scanInterval How often the AKS Cluster should be re-evaluated for scale up/down. Defaults to `10s`.
         * 
         * @return builder
         * 
         */
        public Builder scanInterval(@Nullable Output<String> scanInterval) {
            $.scanInterval = scanInterval;
            return this;
        }

        /**
         * @param scanInterval How often the AKS Cluster should be re-evaluated for scale up/down. Defaults to `10s`.
         * 
         * @return builder
         * 
         */
        public Builder scanInterval(String scanInterval) {
            return scanInterval(Output.of(scanInterval));
        }

        /**
         * @param skipNodesWithLocalStorage If `true` cluster autoscaler will never delete nodes with pods with local storage, for example, EmptyDir or HostPath. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder skipNodesWithLocalStorage(@Nullable Output<Boolean> skipNodesWithLocalStorage) {
            $.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
            return this;
        }

        /**
         * @param skipNodesWithLocalStorage If `true` cluster autoscaler will never delete nodes with pods with local storage, for example, EmptyDir or HostPath. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder skipNodesWithLocalStorage(Boolean skipNodesWithLocalStorage) {
            return skipNodesWithLocalStorage(Output.of(skipNodesWithLocalStorage));
        }

        /**
         * @param skipNodesWithSystemPods If `true` cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder skipNodesWithSystemPods(@Nullable Output<Boolean> skipNodesWithSystemPods) {
            $.skipNodesWithSystemPods = skipNodesWithSystemPods;
            return this;
        }

        /**
         * @param skipNodesWithSystemPods If `true` cluster autoscaler will never delete nodes with pods from kube-system (except for DaemonSet or mirror pods). Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder skipNodesWithSystemPods(Boolean skipNodesWithSystemPods) {
            return skipNodesWithSystemPods(Output.of(skipNodesWithSystemPods));
        }

        public KubernetesClusterAutoScalerProfileArgs build() {
            return $;
        }
    }

}