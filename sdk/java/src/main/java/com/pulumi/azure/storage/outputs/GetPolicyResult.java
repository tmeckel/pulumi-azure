// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.azure.storage.outputs.GetPolicyRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPolicyResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A `rule` block as documented below.
     * 
     */
    private List<GetPolicyRule> rules;
    private String storageAccountId;

    private GetPolicyResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A `rule` block as documented below.
     * 
     */
    public List<GetPolicyRule> rules() {
        return this.rules;
    }
    public String storageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetPolicyRule> rules;
        private String storageAccountId;
        public Builder() {}
        public Builder(GetPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.rules = defaults.rules;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<GetPolicyRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetPolicyRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public GetPolicyResult build() {
            final var o = new GetPolicyResult();
            o.id = id;
            o.rules = rules;
            o.storageAccountId = storageAccountId;
            return o;
        }
    }
}