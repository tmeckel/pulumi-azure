// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicySetDefinitionPolicyDefinitionReference {
    /**
     * @return Parameter values for the referenced policy rule. This field is a JSON string that allows you to assign parameters to this policy rule.
     * 
     */
    private @Nullable String parameterValues;
    /**
     * @return The ID of the policy definition or policy set definition that will be included in this policy set definition.
     * 
     */
    private String policyDefinitionId;
    /**
     * @return A list of names of the policy definition groups that this policy definition reference belongs to.
     * 
     */
    private @Nullable List<String> policyGroupNames;
    /**
     * @return A unique ID within this policy set definition for this policy definition reference.
     * 
     */
    private @Nullable String referenceId;

    private PolicySetDefinitionPolicyDefinitionReference() {}
    /**
     * @return Parameter values for the referenced policy rule. This field is a JSON string that allows you to assign parameters to this policy rule.
     * 
     */
    public Optional<String> parameterValues() {
        return Optional.ofNullable(this.parameterValues);
    }
    /**
     * @return The ID of the policy definition or policy set definition that will be included in this policy set definition.
     * 
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }
    /**
     * @return A list of names of the policy definition groups that this policy definition reference belongs to.
     * 
     */
    public List<String> policyGroupNames() {
        return this.policyGroupNames == null ? List.of() : this.policyGroupNames;
    }
    /**
     * @return A unique ID within this policy set definition for this policy definition reference.
     * 
     */
    public Optional<String> referenceId() {
        return Optional.ofNullable(this.referenceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySetDefinitionPolicyDefinitionReference defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String parameterValues;
        private String policyDefinitionId;
        private @Nullable List<String> policyGroupNames;
        private @Nullable String referenceId;
        public Builder() {}
        public Builder(PolicySetDefinitionPolicyDefinitionReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterValues = defaults.parameterValues;
    	      this.policyDefinitionId = defaults.policyDefinitionId;
    	      this.policyGroupNames = defaults.policyGroupNames;
    	      this.referenceId = defaults.referenceId;
        }

        @CustomType.Setter
        public Builder parameterValues(@Nullable String parameterValues) {
            this.parameterValues = parameterValues;
            return this;
        }
        @CustomType.Setter
        public Builder policyDefinitionId(String policyDefinitionId) {
            this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId);
            return this;
        }
        @CustomType.Setter
        public Builder policyGroupNames(@Nullable List<String> policyGroupNames) {
            this.policyGroupNames = policyGroupNames;
            return this;
        }
        public Builder policyGroupNames(String... policyGroupNames) {
            return policyGroupNames(List.of(policyGroupNames));
        }
        @CustomType.Setter
        public Builder referenceId(@Nullable String referenceId) {
            this.referenceId = referenceId;
            return this;
        }
        public PolicySetDefinitionPolicyDefinitionReference build() {
            final var o = new PolicySetDefinitionPolicyDefinitionReference();
            o.parameterValues = parameterValues;
            o.policyDefinitionId = policyDefinitionId;
            o.policyGroupNames = policyGroupNames;
            o.referenceId = referenceId;
            return o;
        }
    }
}