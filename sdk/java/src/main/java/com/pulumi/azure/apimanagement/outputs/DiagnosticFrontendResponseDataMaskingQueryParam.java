// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiagnosticFrontendResponseDataMaskingQueryParam {
    private String mode;
    private String value;

    private DiagnosticFrontendResponseDataMaskingQueryParam() {}
    public String mode() {
        return this.mode;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticFrontendResponseDataMaskingQueryParam defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mode;
        private String value;
        public Builder() {}
        public Builder(DiagnosticFrontendResponseDataMaskingQueryParam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public DiagnosticFrontendResponseDataMaskingQueryParam build() {
            final var o = new DiagnosticFrontendResponseDataMaskingQueryParam();
            o.mode = mode;
            o.value = value;
            return o;
        }
    }
}