// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestriction {
    private @Nullable Boolean bestEffortEnforced;
    /**
     * @return The restriction control bits. Possible value is integer between `0` and `3` inclusive.
     * 
     */
    private Integer controlBits;

    private ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestriction() {}
    public Optional<Boolean> bestEffortEnforced() {
        return Optional.ofNullable(this.bestEffortEnforced);
    }
    /**
     * @return The restriction control bits. Possible value is integer between `0` and `3` inclusive.
     * 
     */
    public Integer controlBits() {
        return this.controlBits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestriction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean bestEffortEnforced;
        private Integer controlBits;
        public Builder() {}
        public Builder(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bestEffortEnforced = defaults.bestEffortEnforced;
    	      this.controlBits = defaults.controlBits;
        }

        @CustomType.Setter
        public Builder bestEffortEnforced(@Nullable Boolean bestEffortEnforced) {
            this.bestEffortEnforced = bestEffortEnforced;
            return this;
        }
        @CustomType.Setter
        public Builder controlBits(Integer controlBits) {
            this.controlBits = Objects.requireNonNull(controlBits);
            return this;
        }
        public ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestriction build() {
            final var o = new ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestriction();
            o.bestEffortEnforced = bestEffortEnforced;
            o.controlBits = controlBits;
            return o;
        }
    }
}