// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedCertificateArgs Empty = new ManagedCertificateArgs();

    /**
     * The ID of the App Service Custom Hostname Binding for the Certificate. Changing this forces a new App Service Managed Certificate to be created.
     * 
     */
    @Import(name="customHostnameBindingId", required=true)
    private Output<String> customHostnameBindingId;

    /**
     * @return The ID of the App Service Custom Hostname Binding for the Certificate. Changing this forces a new App Service Managed Certificate to be created.
     * 
     */
    public Output<String> customHostnameBindingId() {
        return this.customHostnameBindingId;
    }

    /**
     * A mapping of tags which should be assigned to the App Service Managed Certificate.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the App Service Managed Certificate.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ManagedCertificateArgs() {}

    private ManagedCertificateArgs(ManagedCertificateArgs $) {
        this.customHostnameBindingId = $.customHostnameBindingId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedCertificateArgs $;

        public Builder() {
            $ = new ManagedCertificateArgs();
        }

        public Builder(ManagedCertificateArgs defaults) {
            $ = new ManagedCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customHostnameBindingId The ID of the App Service Custom Hostname Binding for the Certificate. Changing this forces a new App Service Managed Certificate to be created.
         * 
         * @return builder
         * 
         */
        public Builder customHostnameBindingId(Output<String> customHostnameBindingId) {
            $.customHostnameBindingId = customHostnameBindingId;
            return this;
        }

        /**
         * @param customHostnameBindingId The ID of the App Service Custom Hostname Binding for the Certificate. Changing this forces a new App Service Managed Certificate to be created.
         * 
         * @return builder
         * 
         */
        public Builder customHostnameBindingId(String customHostnameBindingId) {
            return customHostnameBindingId(Output.of(customHostnameBindingId));
        }

        /**
         * @param tags A mapping of tags which should be assigned to the App Service Managed Certificate.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to the App Service Managed Certificate.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ManagedCertificateArgs build() {
            $.customHostnameBindingId = Objects.requireNonNull($.customHostnameBindingId, "expected parameter 'customHostnameBindingId' to be non-null");
            return $;
        }
    }

}