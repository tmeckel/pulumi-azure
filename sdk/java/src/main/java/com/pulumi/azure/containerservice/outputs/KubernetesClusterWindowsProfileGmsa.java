// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KubernetesClusterWindowsProfileGmsa {
    /**
     * @return Specifies the DNS server for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
     * 
     */
    private String dnsServer;
    /**
     * @return Specifies the root domain name for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
     * 
     * &gt; **Note:** The properties `dns_server` and `root_domain` must both either be set or unset, i.e. empty.
     * 
     */
    private String rootDomain;

    private KubernetesClusterWindowsProfileGmsa() {}
    /**
     * @return Specifies the DNS server for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
     * 
     */
    public String dnsServer() {
        return this.dnsServer;
    }
    /**
     * @return Specifies the root domain name for Windows gMSA. Set this to an empty string if you have configured the DNS server in the VNet which was used to create the managed cluster.
     * 
     * &gt; **Note:** The properties `dns_server` and `root_domain` must both either be set or unset, i.e. empty.
     * 
     */
    public String rootDomain() {
        return this.rootDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterWindowsProfileGmsa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dnsServer;
        private String rootDomain;
        public Builder() {}
        public Builder(KubernetesClusterWindowsProfileGmsa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServer = defaults.dnsServer;
    	      this.rootDomain = defaults.rootDomain;
        }

        @CustomType.Setter
        public Builder dnsServer(String dnsServer) {
            this.dnsServer = Objects.requireNonNull(dnsServer);
            return this;
        }
        @CustomType.Setter
        public Builder rootDomain(String rootDomain) {
            this.rootDomain = Objects.requireNonNull(rootDomain);
            return this;
        }
        public KubernetesClusterWindowsProfileGmsa build() {
            final var _resultValue = new KubernetesClusterWindowsProfileGmsa();
            _resultValue.dnsServer = dnsServer;
            _resultValue.rootDomain = rootDomain;
            return _resultValue;
        }
    }
}
