// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStandardSiteConfigCors extends com.pulumi.resources.InvokeArgs {

    public static final GetStandardSiteConfigCors Empty = new GetStandardSiteConfigCors();

    @Import(name="allowedOrigins", required=true)
    private List<String> allowedOrigins;

    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }

    @Import(name="supportCredentials")
    private @Nullable Boolean supportCredentials;

    public Optional<Boolean> supportCredentials() {
        return Optional.ofNullable(this.supportCredentials);
    }

    private GetStandardSiteConfigCors() {}

    private GetStandardSiteConfigCors(GetStandardSiteConfigCors $) {
        this.allowedOrigins = $.allowedOrigins;
        this.supportCredentials = $.supportCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStandardSiteConfigCors defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStandardSiteConfigCors $;

        public Builder() {
            $ = new GetStandardSiteConfigCors();
        }

        public Builder(GetStandardSiteConfigCors defaults) {
            $ = new GetStandardSiteConfigCors(Objects.requireNonNull(defaults));
        }

        public Builder allowedOrigins(List<String> allowedOrigins) {
            $.allowedOrigins = allowedOrigins;
            return this;
        }

        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }

        public Builder supportCredentials(@Nullable Boolean supportCredentials) {
            $.supportCredentials = supportCredentials;
            return this;
        }

        public GetStandardSiteConfigCors build() {
            $.allowedOrigins = Objects.requireNonNull($.allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
            return $;
        }
    }

}