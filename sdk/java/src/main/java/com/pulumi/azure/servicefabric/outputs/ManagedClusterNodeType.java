// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.outputs;

import com.pulumi.azure.servicefabric.outputs.ManagedClusterNodeTypeVmSecret;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedClusterNodeType {
    /**
     * @return Sets the port range available for applications. Format is `&lt;from_port&gt;-&lt;to_port&gt;`, for example `10000-20000`.
     * 
     */
    private String applicationPortRange;
    /**
     * @return Specifies a list of key/value pairs used to set capacity tags for this node type.
     * 
     */
    private @Nullable Map<String,String> capacities;
    /**
     * @return The size of the data disk in gigabytes..
     * 
     */
    private Integer dataDiskSizeGb;
    /**
     * @return The type of the disk to use for storing data. It can be one of `Premium_LRS`, `Standard_LRS`, or `StandardSSD_LRS`.
     * 
     */
    private @Nullable String dataDiskType;
    /**
     * @return Sets the port range available for the OS. Format is `&lt;from_port&gt;-&lt;to_port&gt;`, for example `10000-20000`. There has to be at least 255 ports available and cannot overlap with `application_port_range`..
     * 
     */
    private String ephemeralPortRange;
    /**
     * @return The ID of the Resource Group.
     * 
     */
    private @Nullable String id;
    /**
     * @return If set the node type can be composed of multiple placement groups.
     * 
     */
    private @Nullable Boolean multiplePlacementGroupsEnabled;
    /**
     * @return The name which should be used for this node type.
     * 
     */
    private String name;
    /**
     * @return Specifies a list of placement tags that can be used to indicate where services should run..
     * 
     */
    private @Nullable Map<String,String> placementProperties;
    /**
     * @return If set to true, system services will run on this node type. Only one node type should be marked as primary. Primary node type cannot be deleted or changed once they&#39;re created.
     * 
     */
    private @Nullable Boolean primary;
    /**
     * @return If set to true, only stateless workloads can run on this node type.
     * 
     */
    private @Nullable Boolean stateless;
    /**
     * @return The offer type of the marketplace image cluster VMs will use.
     * 
     */
    private String vmImageOffer;
    /**
     * @return The publisher of the marketplace image cluster VMs will use.
     * 
     */
    private String vmImagePublisher;
    /**
     * @return The SKU of the marketplace image cluster VMs will use.
     * 
     */
    private String vmImageSku;
    /**
     * @return The version of the marketplace image cluster VMs will use.
     * 
     */
    private String vmImageVersion;
    /**
     * @return The number of instances this node type will launch.
     * 
     */
    private Integer vmInstanceCount;
    /**
     * @return One or more `vm_secrets` blocks as defined below.
     * 
     */
    private @Nullable List<ManagedClusterNodeTypeVmSecret> vmSecrets;
    /**
     * @return The size of the instances in this node type.
     * 
     */
    private String vmSize;

    private ManagedClusterNodeType() {}
    /**
     * @return Sets the port range available for applications. Format is `&lt;from_port&gt;-&lt;to_port&gt;`, for example `10000-20000`.
     * 
     */
    public String applicationPortRange() {
        return this.applicationPortRange;
    }
    /**
     * @return Specifies a list of key/value pairs used to set capacity tags for this node type.
     * 
     */
    public Map<String,String> capacities() {
        return this.capacities == null ? Map.of() : this.capacities;
    }
    /**
     * @return The size of the data disk in gigabytes..
     * 
     */
    public Integer dataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }
    /**
     * @return The type of the disk to use for storing data. It can be one of `Premium_LRS`, `Standard_LRS`, or `StandardSSD_LRS`.
     * 
     */
    public Optional<String> dataDiskType() {
        return Optional.ofNullable(this.dataDiskType);
    }
    /**
     * @return Sets the port range available for the OS. Format is `&lt;from_port&gt;-&lt;to_port&gt;`, for example `10000-20000`. There has to be at least 255 ports available and cannot overlap with `application_port_range`..
     * 
     */
    public String ephemeralPortRange() {
        return this.ephemeralPortRange;
    }
    /**
     * @return The ID of the Resource Group.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return If set the node type can be composed of multiple placement groups.
     * 
     */
    public Optional<Boolean> multiplePlacementGroupsEnabled() {
        return Optional.ofNullable(this.multiplePlacementGroupsEnabled);
    }
    /**
     * @return The name which should be used for this node type.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies a list of placement tags that can be used to indicate where services should run..
     * 
     */
    public Map<String,String> placementProperties() {
        return this.placementProperties == null ? Map.of() : this.placementProperties;
    }
    /**
     * @return If set to true, system services will run on this node type. Only one node type should be marked as primary. Primary node type cannot be deleted or changed once they&#39;re created.
     * 
     */
    public Optional<Boolean> primary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * @return If set to true, only stateless workloads can run on this node type.
     * 
     */
    public Optional<Boolean> stateless() {
        return Optional.ofNullable(this.stateless);
    }
    /**
     * @return The offer type of the marketplace image cluster VMs will use.
     * 
     */
    public String vmImageOffer() {
        return this.vmImageOffer;
    }
    /**
     * @return The publisher of the marketplace image cluster VMs will use.
     * 
     */
    public String vmImagePublisher() {
        return this.vmImagePublisher;
    }
    /**
     * @return The SKU of the marketplace image cluster VMs will use.
     * 
     */
    public String vmImageSku() {
        return this.vmImageSku;
    }
    /**
     * @return The version of the marketplace image cluster VMs will use.
     * 
     */
    public String vmImageVersion() {
        return this.vmImageVersion;
    }
    /**
     * @return The number of instances this node type will launch.
     * 
     */
    public Integer vmInstanceCount() {
        return this.vmInstanceCount;
    }
    /**
     * @return One or more `vm_secrets` blocks as defined below.
     * 
     */
    public List<ManagedClusterNodeTypeVmSecret> vmSecrets() {
        return this.vmSecrets == null ? List.of() : this.vmSecrets;
    }
    /**
     * @return The size of the instances in this node type.
     * 
     */
    public String vmSize() {
        return this.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterNodeType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationPortRange;
        private @Nullable Map<String,String> capacities;
        private Integer dataDiskSizeGb;
        private @Nullable String dataDiskType;
        private String ephemeralPortRange;
        private @Nullable String id;
        private @Nullable Boolean multiplePlacementGroupsEnabled;
        private String name;
        private @Nullable Map<String,String> placementProperties;
        private @Nullable Boolean primary;
        private @Nullable Boolean stateless;
        private String vmImageOffer;
        private String vmImagePublisher;
        private String vmImageSku;
        private String vmImageVersion;
        private Integer vmInstanceCount;
        private @Nullable List<ManagedClusterNodeTypeVmSecret> vmSecrets;
        private String vmSize;
        public Builder() {}
        public Builder(ManagedClusterNodeType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationPortRange = defaults.applicationPortRange;
    	      this.capacities = defaults.capacities;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.ephemeralPortRange = defaults.ephemeralPortRange;
    	      this.id = defaults.id;
    	      this.multiplePlacementGroupsEnabled = defaults.multiplePlacementGroupsEnabled;
    	      this.name = defaults.name;
    	      this.placementProperties = defaults.placementProperties;
    	      this.primary = defaults.primary;
    	      this.stateless = defaults.stateless;
    	      this.vmImageOffer = defaults.vmImageOffer;
    	      this.vmImagePublisher = defaults.vmImagePublisher;
    	      this.vmImageSku = defaults.vmImageSku;
    	      this.vmImageVersion = defaults.vmImageVersion;
    	      this.vmInstanceCount = defaults.vmInstanceCount;
    	      this.vmSecrets = defaults.vmSecrets;
    	      this.vmSize = defaults.vmSize;
        }

        @CustomType.Setter
        public Builder applicationPortRange(String applicationPortRange) {
            this.applicationPortRange = Objects.requireNonNull(applicationPortRange);
            return this;
        }
        @CustomType.Setter
        public Builder capacities(@Nullable Map<String,String> capacities) {
            this.capacities = capacities;
            return this;
        }
        @CustomType.Setter
        public Builder dataDiskSizeGb(Integer dataDiskSizeGb) {
            this.dataDiskSizeGb = Objects.requireNonNull(dataDiskSizeGb);
            return this;
        }
        @CustomType.Setter
        public Builder dataDiskType(@Nullable String dataDiskType) {
            this.dataDiskType = dataDiskType;
            return this;
        }
        @CustomType.Setter
        public Builder ephemeralPortRange(String ephemeralPortRange) {
            this.ephemeralPortRange = Objects.requireNonNull(ephemeralPortRange);
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder multiplePlacementGroupsEnabled(@Nullable Boolean multiplePlacementGroupsEnabled) {
            this.multiplePlacementGroupsEnabled = multiplePlacementGroupsEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder placementProperties(@Nullable Map<String,String> placementProperties) {
            this.placementProperties = placementProperties;
            return this;
        }
        @CustomType.Setter
        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }
        @CustomType.Setter
        public Builder stateless(@Nullable Boolean stateless) {
            this.stateless = stateless;
            return this;
        }
        @CustomType.Setter
        public Builder vmImageOffer(String vmImageOffer) {
            this.vmImageOffer = Objects.requireNonNull(vmImageOffer);
            return this;
        }
        @CustomType.Setter
        public Builder vmImagePublisher(String vmImagePublisher) {
            this.vmImagePublisher = Objects.requireNonNull(vmImagePublisher);
            return this;
        }
        @CustomType.Setter
        public Builder vmImageSku(String vmImageSku) {
            this.vmImageSku = Objects.requireNonNull(vmImageSku);
            return this;
        }
        @CustomType.Setter
        public Builder vmImageVersion(String vmImageVersion) {
            this.vmImageVersion = Objects.requireNonNull(vmImageVersion);
            return this;
        }
        @CustomType.Setter
        public Builder vmInstanceCount(Integer vmInstanceCount) {
            this.vmInstanceCount = Objects.requireNonNull(vmInstanceCount);
            return this;
        }
        @CustomType.Setter
        public Builder vmSecrets(@Nullable List<ManagedClusterNodeTypeVmSecret> vmSecrets) {
            this.vmSecrets = vmSecrets;
            return this;
        }
        public Builder vmSecrets(ManagedClusterNodeTypeVmSecret... vmSecrets) {
            return vmSecrets(List.of(vmSecrets));
        }
        @CustomType.Setter
        public Builder vmSize(String vmSize) {
            this.vmSize = Objects.requireNonNull(vmSize);
            return this;
        }
        public ManagedClusterNodeType build() {
            final var o = new ManagedClusterNodeType();
            o.applicationPortRange = applicationPortRange;
            o.capacities = capacities;
            o.dataDiskSizeGb = dataDiskSizeGb;
            o.dataDiskType = dataDiskType;
            o.ephemeralPortRange = ephemeralPortRange;
            o.id = id;
            o.multiplePlacementGroupsEnabled = multiplePlacementGroupsEnabled;
            o.name = name;
            o.placementProperties = placementProperties;
            o.primary = primary;
            o.stateless = stateless;
            o.vmImageOffer = vmImageOffer;
            o.vmImagePublisher = vmImagePublisher;
            o.vmImageSku = vmImageSku;
            o.vmImageVersion = vmImageVersion;
            o.vmInstanceCount = vmInstanceCount;
            o.vmSecrets = vmSecrets;
            o.vmSize = vmSize;
            return o;
        }
    }
}