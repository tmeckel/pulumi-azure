// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.azure.containerservice.outputs.GetKubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKubernetesClusterIngressApplicationGateway {
    /**
     * @return The ID of the Application Gateway associated with the ingress controller deployed to this Kubernetes Cluster.
     * 
     */
    private String effectiveGatewayId;
    /**
     * @return The ID of the Application Gateway integrated with the ingress controller of this Kubernetes Cluster. This attribute is only set when gateway_id is specified when configuring the `ingress_application_gateway` addon.
     * 
     */
    private String gatewayId;
    private String gatewayName;
    /**
     * @return An `ingress_application_gateway_identity` block as defined below.
     * 
     */
    private List<GetKubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity> ingressApplicationGatewayIdentities;
    /**
     * @return The subnet CIDR used to create an Application Gateway, which in turn will be integrated with the ingress controller of this Kubernetes Cluster. This attribute is only set when `subnet_cidr` is specified when configuring the `ingress_application_gateway` addon.
     * 
     */
    private String subnetCidr;
    /**
     * @return The ID of the subnet on which to create an Application Gateway, which in turn will be integrated with the ingress controller of this Kubernetes Cluster. This attribute is only set when `subnet_id` is specified when configuring the `ingress_application_gateway` addon.
     * 
     */
    private String subnetId;

    private GetKubernetesClusterIngressApplicationGateway() {}
    /**
     * @return The ID of the Application Gateway associated with the ingress controller deployed to this Kubernetes Cluster.
     * 
     */
    public String effectiveGatewayId() {
        return this.effectiveGatewayId;
    }
    /**
     * @return The ID of the Application Gateway integrated with the ingress controller of this Kubernetes Cluster. This attribute is only set when gateway_id is specified when configuring the `ingress_application_gateway` addon.
     * 
     */
    public String gatewayId() {
        return this.gatewayId;
    }
    public String gatewayName() {
        return this.gatewayName;
    }
    /**
     * @return An `ingress_application_gateway_identity` block as defined below.
     * 
     */
    public List<GetKubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity> ingressApplicationGatewayIdentities() {
        return this.ingressApplicationGatewayIdentities;
    }
    /**
     * @return The subnet CIDR used to create an Application Gateway, which in turn will be integrated with the ingress controller of this Kubernetes Cluster. This attribute is only set when `subnet_cidr` is specified when configuring the `ingress_application_gateway` addon.
     * 
     */
    public String subnetCidr() {
        return this.subnetCidr;
    }
    /**
     * @return The ID of the subnet on which to create an Application Gateway, which in turn will be integrated with the ingress controller of this Kubernetes Cluster. This attribute is only set when `subnet_id` is specified when configuring the `ingress_application_gateway` addon.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterIngressApplicationGateway defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effectiveGatewayId;
        private String gatewayId;
        private String gatewayName;
        private List<GetKubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity> ingressApplicationGatewayIdentities;
        private String subnetCidr;
        private String subnetId;
        public Builder() {}
        public Builder(GetKubernetesClusterIngressApplicationGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveGatewayId = defaults.effectiveGatewayId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.gatewayName = defaults.gatewayName;
    	      this.ingressApplicationGatewayIdentities = defaults.ingressApplicationGatewayIdentities;
    	      this.subnetCidr = defaults.subnetCidr;
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder effectiveGatewayId(String effectiveGatewayId) {
            this.effectiveGatewayId = Objects.requireNonNull(effectiveGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder gatewayName(String gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }
        @CustomType.Setter
        public Builder ingressApplicationGatewayIdentities(List<GetKubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity> ingressApplicationGatewayIdentities) {
            this.ingressApplicationGatewayIdentities = Objects.requireNonNull(ingressApplicationGatewayIdentities);
            return this;
        }
        public Builder ingressApplicationGatewayIdentities(GetKubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity... ingressApplicationGatewayIdentities) {
            return ingressApplicationGatewayIdentities(List.of(ingressApplicationGatewayIdentities));
        }
        @CustomType.Setter
        public Builder subnetCidr(String subnetCidr) {
            this.subnetCidr = Objects.requireNonNull(subnetCidr);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public GetKubernetesClusterIngressApplicationGateway build() {
            final var o = new GetKubernetesClusterIngressApplicationGateway();
            o.effectiveGatewayId = effectiveGatewayId;
            o.gatewayId = gatewayId;
            o.gatewayName = gatewayName;
            o.ingressApplicationGatewayIdentities = ingressApplicationGatewayIdentities;
            o.subnetCidr = subnetCidr;
            o.subnetId = subnetId;
            return o;
        }
    }
}