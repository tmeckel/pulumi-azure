// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.azure.core.outputs.ResourcePolicyAssignmentResourceSelectorSelector;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourcePolicyAssignmentResourceSelector {
    /**
     * @return Specifies a name for the resource selector.
     * 
     */
    private @Nullable String name;
    /**
     * @return One or more `resource_selector` block as defined below.
     * 
     */
    private List<ResourcePolicyAssignmentResourceSelectorSelector> selectors;

    private ResourcePolicyAssignmentResourceSelector() {}
    /**
     * @return Specifies a name for the resource selector.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return One or more `resource_selector` block as defined below.
     * 
     */
    public List<ResourcePolicyAssignmentResourceSelectorSelector> selectors() {
        return this.selectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyAssignmentResourceSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private List<ResourcePolicyAssignmentResourceSelectorSelector> selectors;
        public Builder() {}
        public Builder(ResourcePolicyAssignmentResourceSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.selectors = defaults.selectors;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder selectors(List<ResourcePolicyAssignmentResourceSelectorSelector> selectors) {
            this.selectors = Objects.requireNonNull(selectors);
            return this;
        }
        public Builder selectors(ResourcePolicyAssignmentResourceSelectorSelector... selectors) {
            return selectors(List.of(selectors));
        }
        public ResourcePolicyAssignmentResourceSelector build() {
            final var o = new ResourcePolicyAssignmentResourceSelector();
            o.name = name;
            o.selectors = selectors;
            return o;
        }
    }
}