// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.arckubernetes.inputs;

import com.pulumi.azure.arckubernetes.inputs.ClusterIdentityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * Specifies the base64-encoded public certificate used by the agent to do the initial handshake to the backend services in Azure. Changing this forces a new Arc Kubernetes Cluster to be created.
     * 
     */
    @Import(name="agentPublicKeyCertificate")
    private @Nullable Output<String> agentPublicKeyCertificate;

    /**
     * @return Specifies the base64-encoded public certificate used by the agent to do the initial handshake to the backend services in Azure. Changing this forces a new Arc Kubernetes Cluster to be created.
     * 
     */
    public Optional<Output<String>> agentPublicKeyCertificate() {
        return Optional.ofNullable(this.agentPublicKeyCertificate);
    }

    /**
     * Version of the agent running on the cluster resource.
     * 
     */
    @Import(name="agentVersion")
    private @Nullable Output<String> agentVersion;

    /**
     * @return Version of the agent running on the cluster resource.
     * 
     */
    public Optional<Output<String>> agentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }

    /**
     * The distribution running on this Arc Kubernetes Cluster.
     * 
     */
    @Import(name="distribution")
    private @Nullable Output<String> distribution;

    /**
     * @return The distribution running on this Arc Kubernetes Cluster.
     * 
     */
    public Optional<Output<String>> distribution() {
        return Optional.ofNullable(this.distribution);
    }

    /**
     * An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ClusterIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
     * 
     */
    public Optional<Output<ClusterIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The infrastructure on which the Arc Kubernetes Cluster is running on.
     * 
     */
    @Import(name="infrastructure")
    private @Nullable Output<String> infrastructure;

    /**
     * @return The infrastructure on which the Arc Kubernetes Cluster is running on.
     * 
     */
    public Optional<Output<String>> infrastructure() {
        return Optional.ofNullable(this.infrastructure);
    }

    /**
     * The Kubernetes version of the cluster resource.
     * 
     */
    @Import(name="kubernetesVersion")
    private @Nullable Output<String> kubernetesVersion;

    /**
     * @return The Kubernetes version of the cluster resource.
     * 
     */
    public Optional<Output<String>> kubernetesVersion() {
        return Optional.ofNullable(this.kubernetesVersion);
    }

    /**
     * Specifies the Azure Region where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name which should be used for this Arc Kubernetes Cluster. Changing this forces a new Arc Kubernetes Cluster to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name which should be used for this Arc Kubernetes Cluster. Changing this forces a new Arc Kubernetes Cluster to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The cluster offering.
     * 
     */
    @Import(name="offering")
    private @Nullable Output<String> offering;

    /**
     * @return The cluster offering.
     * 
     */
    public Optional<Output<String>> offering() {
        return Optional.ofNullable(this.offering);
    }

    /**
     * Specifies the name of the Resource Group where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A mapping of tags which should be assigned to the Arc Kubernetes Cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Arc Kubernetes Cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Number of CPU cores present in the cluster resource.
     * 
     */
    @Import(name="totalCoreCount")
    private @Nullable Output<Integer> totalCoreCount;

    /**
     * @return Number of CPU cores present in the cluster resource.
     * 
     */
    public Optional<Output<Integer>> totalCoreCount() {
        return Optional.ofNullable(this.totalCoreCount);
    }

    /**
     * Number of nodes present in the cluster resource.
     * 
     */
    @Import(name="totalNodeCount")
    private @Nullable Output<Integer> totalNodeCount;

    /**
     * @return Number of nodes present in the cluster resource.
     * 
     */
    public Optional<Output<Integer>> totalNodeCount() {
        return Optional.ofNullable(this.totalNodeCount);
    }

    private ClusterState() {}

    private ClusterState(ClusterState $) {
        this.agentPublicKeyCertificate = $.agentPublicKeyCertificate;
        this.agentVersion = $.agentVersion;
        this.distribution = $.distribution;
        this.identity = $.identity;
        this.infrastructure = $.infrastructure;
        this.kubernetesVersion = $.kubernetesVersion;
        this.location = $.location;
        this.name = $.name;
        this.offering = $.offering;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.totalCoreCount = $.totalCoreCount;
        this.totalNodeCount = $.totalNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterState $;

        public Builder() {
            $ = new ClusterState();
        }

        public Builder(ClusterState defaults) {
            $ = new ClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentPublicKeyCertificate Specifies the base64-encoded public certificate used by the agent to do the initial handshake to the backend services in Azure. Changing this forces a new Arc Kubernetes Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder agentPublicKeyCertificate(@Nullable Output<String> agentPublicKeyCertificate) {
            $.agentPublicKeyCertificate = agentPublicKeyCertificate;
            return this;
        }

        /**
         * @param agentPublicKeyCertificate Specifies the base64-encoded public certificate used by the agent to do the initial handshake to the backend services in Azure. Changing this forces a new Arc Kubernetes Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder agentPublicKeyCertificate(String agentPublicKeyCertificate) {
            return agentPublicKeyCertificate(Output.of(agentPublicKeyCertificate));
        }

        /**
         * @param agentVersion Version of the agent running on the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder agentVersion(@Nullable Output<String> agentVersion) {
            $.agentVersion = agentVersion;
            return this;
        }

        /**
         * @param agentVersion Version of the agent running on the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder agentVersion(String agentVersion) {
            return agentVersion(Output.of(agentVersion));
        }

        /**
         * @param distribution The distribution running on this Arc Kubernetes Cluster.
         * 
         * @return builder
         * 
         */
        public Builder distribution(@Nullable Output<String> distribution) {
            $.distribution = distribution;
            return this;
        }

        /**
         * @param distribution The distribution running on this Arc Kubernetes Cluster.
         * 
         * @return builder
         * 
         */
        public Builder distribution(String distribution) {
            return distribution(Output.of(distribution));
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ClusterIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder identity(ClusterIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param infrastructure The infrastructure on which the Arc Kubernetes Cluster is running on.
         * 
         * @return builder
         * 
         */
        public Builder infrastructure(@Nullable Output<String> infrastructure) {
            $.infrastructure = infrastructure;
            return this;
        }

        /**
         * @param infrastructure The infrastructure on which the Arc Kubernetes Cluster is running on.
         * 
         * @return builder
         * 
         */
        public Builder infrastructure(String infrastructure) {
            return infrastructure(Output.of(infrastructure));
        }

        /**
         * @param kubernetesVersion The Kubernetes version of the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(@Nullable Output<String> kubernetesVersion) {
            $.kubernetesVersion = kubernetesVersion;
            return this;
        }

        /**
         * @param kubernetesVersion The Kubernetes version of the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder kubernetesVersion(String kubernetesVersion) {
            return kubernetesVersion(Output.of(kubernetesVersion));
        }

        /**
         * @param location Specifies the Azure Region where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name which should be used for this Arc Kubernetes Cluster. Changing this forces a new Arc Kubernetes Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name which should be used for this Arc Kubernetes Cluster. Changing this forces a new Arc Kubernetes Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param offering The cluster offering.
         * 
         * @return builder
         * 
         */
        public Builder offering(@Nullable Output<String> offering) {
            $.offering = offering;
            return this;
        }

        /**
         * @param offering The cluster offering.
         * 
         * @return builder
         * 
         */
        public Builder offering(String offering) {
            return offering(Output.of(offering));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group where the Arc Kubernetes Cluster should exist. Changing this forces a new Arc Kubernetes Cluster to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Arc Kubernetes Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the Arc Kubernetes Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param totalCoreCount Number of CPU cores present in the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder totalCoreCount(@Nullable Output<Integer> totalCoreCount) {
            $.totalCoreCount = totalCoreCount;
            return this;
        }

        /**
         * @param totalCoreCount Number of CPU cores present in the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder totalCoreCount(Integer totalCoreCount) {
            return totalCoreCount(Output.of(totalCoreCount));
        }

        /**
         * @param totalNodeCount Number of nodes present in the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder totalNodeCount(@Nullable Output<Integer> totalNodeCount) {
            $.totalNodeCount = totalNodeCount;
            return this;
        }

        /**
         * @param totalNodeCount Number of nodes present in the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder totalNodeCount(Integer totalNodeCount) {
            return totalNodeCount(Output.of(totalNodeCount));
        }

        public ClusterState build() {
            return $;
        }
    }

}