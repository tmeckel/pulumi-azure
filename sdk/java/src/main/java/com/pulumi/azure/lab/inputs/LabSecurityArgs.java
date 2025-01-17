// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lab.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LabSecurityArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabSecurityArgs Empty = new LabSecurityArgs();

    /**
     * Is open access enabled to allow any user or only specified users to register to a Lab Service Lab?
     * 
     */
    @Import(name="openAccessEnabled", required=true)
    private Output<Boolean> openAccessEnabled;

    /**
     * @return Is open access enabled to allow any user or only specified users to register to a Lab Service Lab?
     * 
     */
    public Output<Boolean> openAccessEnabled() {
        return this.openAccessEnabled;
    }

    /**
     * The registration code for the Lab Service Lab.
     * 
     */
    @Import(name="registrationCode")
    private @Nullable Output<String> registrationCode;

    /**
     * @return The registration code for the Lab Service Lab.
     * 
     */
    public Optional<Output<String>> registrationCode() {
        return Optional.ofNullable(this.registrationCode);
    }

    private LabSecurityArgs() {}

    private LabSecurityArgs(LabSecurityArgs $) {
        this.openAccessEnabled = $.openAccessEnabled;
        this.registrationCode = $.registrationCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabSecurityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabSecurityArgs $;

        public Builder() {
            $ = new LabSecurityArgs();
        }

        public Builder(LabSecurityArgs defaults) {
            $ = new LabSecurityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param openAccessEnabled Is open access enabled to allow any user or only specified users to register to a Lab Service Lab?
         * 
         * @return builder
         * 
         */
        public Builder openAccessEnabled(Output<Boolean> openAccessEnabled) {
            $.openAccessEnabled = openAccessEnabled;
            return this;
        }

        /**
         * @param openAccessEnabled Is open access enabled to allow any user or only specified users to register to a Lab Service Lab?
         * 
         * @return builder
         * 
         */
        public Builder openAccessEnabled(Boolean openAccessEnabled) {
            return openAccessEnabled(Output.of(openAccessEnabled));
        }

        /**
         * @param registrationCode The registration code for the Lab Service Lab.
         * 
         * @return builder
         * 
         */
        public Builder registrationCode(@Nullable Output<String> registrationCode) {
            $.registrationCode = registrationCode;
            return this;
        }

        /**
         * @param registrationCode The registration code for the Lab Service Lab.
         * 
         * @return builder
         * 
         */
        public Builder registrationCode(String registrationCode) {
            return registrationCode(Output.of(registrationCode));
        }

        public LabSecurityArgs build() {
            $.openAccessEnabled = Objects.requireNonNull($.openAccessEnabled, "expected parameter 'openAccessEnabled' to be non-null");
            return $;
        }
    }

}
