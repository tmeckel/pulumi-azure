// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedClusterNodeTypeVmSecretCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterNodeTypeVmSecretCertificateArgs Empty = new ManagedClusterNodeTypeVmSecretCertificateArgs();

    /**
     * The certificate store on the Virtual Machine to which the certificate should be added.
     * 
     */
    @Import(name="store", required=true)
    private Output<String> store;

    /**
     * @return The certificate store on the Virtual Machine to which the certificate should be added.
     * 
     */
    public Output<String> store() {
        return this.store;
    }

    /**
     * The URL of a certificate that has been uploaded to Key Vault as a secret
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The URL of a certificate that has been uploaded to Key Vault as a secret
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private ManagedClusterNodeTypeVmSecretCertificateArgs() {}

    private ManagedClusterNodeTypeVmSecretCertificateArgs(ManagedClusterNodeTypeVmSecretCertificateArgs $) {
        this.store = $.store;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterNodeTypeVmSecretCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterNodeTypeVmSecretCertificateArgs $;

        public Builder() {
            $ = new ManagedClusterNodeTypeVmSecretCertificateArgs();
        }

        public Builder(ManagedClusterNodeTypeVmSecretCertificateArgs defaults) {
            $ = new ManagedClusterNodeTypeVmSecretCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param store The certificate store on the Virtual Machine to which the certificate should be added.
         * 
         * @return builder
         * 
         */
        public Builder store(Output<String> store) {
            $.store = store;
            return this;
        }

        /**
         * @param store The certificate store on the Virtual Machine to which the certificate should be added.
         * 
         * @return builder
         * 
         */
        public Builder store(String store) {
            return store(Output.of(store));
        }

        /**
         * @param url The URL of a certificate that has been uploaded to Key Vault as a secret
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of a certificate that has been uploaded to Key Vault as a secret
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ManagedClusterNodeTypeVmSecretCertificateArgs build() {
            $.store = Objects.requireNonNull($.store, "expected parameter 'store' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}