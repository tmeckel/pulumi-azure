// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FailoverGroupPartnerServer {
    /**
     * @return The ID of a partner SQL server to include in the failover group.
     * 
     */
    private String id;
    /**
     * @return The location of the partner server.
     * 
     */
    private @Nullable String location;
    /**
     * @return The replication role of the partner server. Possible values include `Primary` or `Secondary`.
     * 
     */
    private @Nullable String role;

    private FailoverGroupPartnerServer() {}
    /**
     * @return The ID of a partner SQL server to include in the failover group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The location of the partner server.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The replication role of the partner server. Possible values include `Primary` or `Secondary`.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverGroupPartnerServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String location;
        private @Nullable String role;
        public Builder() {}
        public Builder(FailoverGroupPartnerServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public FailoverGroupPartnerServer build() {
            final var o = new FailoverGroupPartnerServer();
            o.id = id;
            o.location = location;
            o.role = role;
            return o;
        }
    }
}