// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountPlainArgs Empty = new GetAccountPlainArgs();

    /**
     * The minimum supported TLS version for this storage account.
     * 
     */
    @Import(name="minTlsVersion")
    private @Nullable String minTlsVersion;

    /**
     * @return The minimum supported TLS version for this storage account.
     * 
     */
    public Optional<String> minTlsVersion() {
        return Optional.ofNullable(this.minTlsVersion);
    }

    /**
     * Specifies the name of the Storage Account
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the Storage Account
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies the name of the resource group the Storage Account is located in.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable String resourceGroupName;

    /**
     * @return Specifies the name of the resource group the Storage Account is located in.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private GetAccountPlainArgs() {}

    private GetAccountPlainArgs(GetAccountPlainArgs $) {
        this.minTlsVersion = $.minTlsVersion;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountPlainArgs $;

        public Builder() {
            $ = new GetAccountPlainArgs();
        }

        public Builder(GetAccountPlainArgs defaults) {
            $ = new GetAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minTlsVersion The minimum supported TLS version for this storage account.
         * 
         * @return builder
         * 
         */
        public Builder minTlsVersion(@Nullable String minTlsVersion) {
            $.minTlsVersion = minTlsVersion;
            return this;
        }

        /**
         * @param name Specifies the name of the Storage Account
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group the Storage Account is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAccountPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}