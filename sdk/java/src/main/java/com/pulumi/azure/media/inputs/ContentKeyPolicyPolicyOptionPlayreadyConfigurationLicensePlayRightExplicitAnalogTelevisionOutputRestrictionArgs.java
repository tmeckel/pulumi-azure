// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs Empty = new ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs();

    @Import(name="bestEffortEnforced")
    private @Nullable Output<Boolean> bestEffortEnforced;

    public Optional<Output<Boolean>> bestEffortEnforced() {
        return Optional.ofNullable(this.bestEffortEnforced);
    }

    /**
     * The restriction control bits. Possible value is integer between `0` and `3` inclusive.
     * 
     */
    @Import(name="controlBits", required=true)
    private Output<Integer> controlBits;

    /**
     * @return The restriction control bits. Possible value is integer between `0` and `3` inclusive.
     * 
     */
    public Output<Integer> controlBits() {
        return this.controlBits;
    }

    private ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs() {}

    private ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs $) {
        this.bestEffortEnforced = $.bestEffortEnforced;
        this.controlBits = $.controlBits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs $;

        public Builder() {
            $ = new ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs();
        }

        public Builder(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs defaults) {
            $ = new ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs(Objects.requireNonNull(defaults));
        }

        public Builder bestEffortEnforced(@Nullable Output<Boolean> bestEffortEnforced) {
            $.bestEffortEnforced = bestEffortEnforced;
            return this;
        }

        public Builder bestEffortEnforced(Boolean bestEffortEnforced) {
            return bestEffortEnforced(Output.of(bestEffortEnforced));
        }

        /**
         * @param controlBits The restriction control bits. Possible value is integer between `0` and `3` inclusive.
         * 
         * @return builder
         * 
         */
        public Builder controlBits(Output<Integer> controlBits) {
            $.controlBits = controlBits;
            return this;
        }

        /**
         * @param controlBits The restriction control bits. Possible value is integer between `0` and `3` inclusive.
         * 
         * @return builder
         * 
         */
        public Builder controlBits(Integer controlBits) {
            return controlBits(Output.of(controlBits));
        }

        public ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightExplicitAnalogTelevisionOutputRestrictionArgs build() {
            $.controlBits = Objects.requireNonNull($.controlBits, "expected parameter 'controlBits' to be non-null");
            return $;
        }
    }

}