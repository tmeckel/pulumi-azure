// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetRouteTableRoute;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRouteTableResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Azure Region in which the Route Table exists.
     * 
     */
    private String location;
    /**
     * @return The name of the Route.
     * 
     */
    private String name;
    private String resourceGroupName;
    /**
     * @return One or more `route` blocks as documented below.
     * 
     */
    private List<GetRouteTableRoute> routes;
    /**
     * @return The collection of Subnets associated with this route table.
     * 
     */
    private List<String> subnets;
    /**
     * @return A mapping of tags assigned to the Route Table.
     * 
     */
    private Map<String,String> tags;

    private GetRouteTableResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region in which the Route Table exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the Route.
     * 
     */
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return One or more `route` blocks as documented below.
     * 
     */
    public List<GetRouteTableRoute> routes() {
        return this.routes;
    }
    /**
     * @return The collection of Subnets associated with this route table.
     * 
     */
    public List<String> subnets() {
        return this.subnets;
    }
    /**
     * @return A mapping of tags assigned to the Route Table.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTableResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private List<GetRouteTableRoute> routes;
        private List<String> subnets;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetRouteTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routes = defaults.routes;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder routes(List<GetRouteTableRoute> routes) {
            this.routes = Objects.requireNonNull(routes);
            return this;
        }
        public Builder routes(GetRouteTableRoute... routes) {
            return routes(List.of(routes));
        }
        @CustomType.Setter
        public Builder subnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetRouteTableResult build() {
            final var o = new GetRouteTableResult();
            o.id = id;
            o.location = location;
            o.name = name;
            o.resourceGroupName = resourceGroupName;
            o.routes = routes;
            o.subnets = subnets;
            o.tags = tags;
            return o;
        }
    }
}