// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxFunctionAppSiteConfigIpRestrictionHeader {
    /**
     * @return A list of Azure Front Door IDs.
     * 
     */
    private List<String> xAzureFdids;
    /**
     * @return Should a Front Door Health Probe be expected?
     * 
     */
    private List<String> xFdHealthProbes;
    /**
     * @return A list of addresses for which matching is applied.
     * 
     */
    private List<String> xForwardedFors;
    /**
     * @return A list of Hosts for which matching is applied.
     * 
     */
    private List<String> xForwardedHosts;

    private GetLinuxFunctionAppSiteConfigIpRestrictionHeader() {}
    /**
     * @return A list of Azure Front Door IDs.
     * 
     */
    public List<String> xAzureFdids() {
        return this.xAzureFdids;
    }
    /**
     * @return Should a Front Door Health Probe be expected?
     * 
     */
    public List<String> xFdHealthProbes() {
        return this.xFdHealthProbes;
    }
    /**
     * @return A list of addresses for which matching is applied.
     * 
     */
    public List<String> xForwardedFors() {
        return this.xForwardedFors;
    }
    /**
     * @return A list of Hosts for which matching is applied.
     * 
     */
    public List<String> xForwardedHosts() {
        return this.xForwardedHosts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxFunctionAppSiteConfigIpRestrictionHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> xAzureFdids;
        private List<String> xFdHealthProbes;
        private List<String> xForwardedFors;
        private List<String> xForwardedHosts;
        public Builder() {}
        public Builder(GetLinuxFunctionAppSiteConfigIpRestrictionHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.xAzureFdids = defaults.xAzureFdids;
    	      this.xFdHealthProbes = defaults.xFdHealthProbes;
    	      this.xForwardedFors = defaults.xForwardedFors;
    	      this.xForwardedHosts = defaults.xForwardedHosts;
        }

        @CustomType.Setter
        public Builder xAzureFdids(List<String> xAzureFdids) {
            this.xAzureFdids = Objects.requireNonNull(xAzureFdids);
            return this;
        }
        public Builder xAzureFdids(String... xAzureFdids) {
            return xAzureFdids(List.of(xAzureFdids));
        }
        @CustomType.Setter
        public Builder xFdHealthProbes(List<String> xFdHealthProbes) {
            this.xFdHealthProbes = Objects.requireNonNull(xFdHealthProbes);
            return this;
        }
        public Builder xFdHealthProbes(String... xFdHealthProbes) {
            return xFdHealthProbes(List.of(xFdHealthProbes));
        }
        @CustomType.Setter
        public Builder xForwardedFors(List<String> xForwardedFors) {
            this.xForwardedFors = Objects.requireNonNull(xForwardedFors);
            return this;
        }
        public Builder xForwardedFors(String... xForwardedFors) {
            return xForwardedFors(List.of(xForwardedFors));
        }
        @CustomType.Setter
        public Builder xForwardedHosts(List<String> xForwardedHosts) {
            this.xForwardedHosts = Objects.requireNonNull(xForwardedHosts);
            return this;
        }
        public Builder xForwardedHosts(String... xForwardedHosts) {
            return xForwardedHosts(List.of(xForwardedHosts));
        }
        public GetLinuxFunctionAppSiteConfigIpRestrictionHeader build() {
            final var o = new GetLinuxFunctionAppSiteConfigIpRestrictionHeader();
            o.xAzureFdids = xAzureFdids;
            o.xFdHealthProbes = xFdHealthProbes;
            o.xForwardedFors = xForwardedFors;
            o.xForwardedHosts = xForwardedHosts;
            return o;
        }
    }
}