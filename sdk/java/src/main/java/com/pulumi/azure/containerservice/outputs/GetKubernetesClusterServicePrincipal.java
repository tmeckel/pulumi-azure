// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesClusterServicePrincipal {
    /**
     * @return The Client ID of the user-defined Managed Identity assigned to the Kubelets.
     * 
     */
    private String clientId;

    private GetKubernetesClusterServicePrincipal() {}
    /**
     * @return The Client ID of the user-defined Managed Identity assigned to the Kubelets.
     * 
     */
    public String clientId() {
        return this.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterServicePrincipal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        public Builder() {}
        public Builder(GetKubernetesClusterServicePrincipal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public GetKubernetesClusterServicePrincipal build() {
            final var o = new GetKubernetesClusterServicePrincipal();
            o.clientId = clientId;
            return o;
        }
    }
}