// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.signalr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceResult {
    /**
     * @return The FQDN of the SignalR service.
     * 
     */
    private String hostname;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The publicly accessible IP of the SignalR service.
     * 
     */
    private String ipAddress;
    /**
     * @return Specifies the supported Azure location where the SignalR service exists.
     * 
     */
    private String location;
    private String name;
    /**
     * @return The primary access key of the SignalR service.
     * 
     */
    private String primaryAccessKey;
    /**
     * @return The primary connection string of the SignalR service.
     * 
     */
    private String primaryConnectionString;
    /**
     * @return The publicly accessible port of the SignalR service which is designed for browser/client use.
     * 
     */
    private Integer publicPort;
    private String resourceGroupName;
    /**
     * @return The secondary access key of the SignalR service.
     * 
     */
    private String secondaryAccessKey;
    /**
     * @return The secondary connection string of the SignalR service.
     * 
     */
    private String secondaryConnectionString;
    /**
     * @return The publicly accessible port of the SignalR service which is designed for customer server side use.
     * 
     */
    private Integer serverPort;
    private Map<String,String> tags;

    private GetServiceResult() {}
    /**
     * @return The FQDN of the SignalR service.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The publicly accessible IP of the SignalR service.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return Specifies the supported Azure location where the SignalR service exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The primary access key of the SignalR service.
     * 
     */
    public String primaryAccessKey() {
        return this.primaryAccessKey;
    }
    /**
     * @return The primary connection string of the SignalR service.
     * 
     */
    public String primaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * @return The publicly accessible port of the SignalR service which is designed for browser/client use.
     * 
     */
    public Integer publicPort() {
        return this.publicPort;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The secondary access key of the SignalR service.
     * 
     */
    public String secondaryAccessKey() {
        return this.secondaryAccessKey;
    }
    /**
     * @return The secondary connection string of the SignalR service.
     * 
     */
    public String secondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * @return The publicly accessible port of the SignalR service which is designed for customer server side use.
     * 
     */
    public Integer serverPort() {
        return this.serverPort;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        private String id;
        private String ipAddress;
        private String location;
        private String name;
        private String primaryAccessKey;
        private String primaryConnectionString;
        private Integer publicPort;
        private String resourceGroupName;
        private String secondaryAccessKey;
        private String secondaryConnectionString;
        private Integer serverPort;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.primaryAccessKey = defaults.primaryAccessKey;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.publicPort = defaults.publicPort;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryAccessKey = defaults.secondaryAccessKey;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.serverPort = defaults.serverPort;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
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
        public Builder primaryAccessKey(String primaryAccessKey) {
            this.primaryAccessKey = Objects.requireNonNull(primaryAccessKey);
            return this;
        }
        @CustomType.Setter
        public Builder primaryConnectionString(String primaryConnectionString) {
            this.primaryConnectionString = Objects.requireNonNull(primaryConnectionString);
            return this;
        }
        @CustomType.Setter
        public Builder publicPort(Integer publicPort) {
            this.publicPort = Objects.requireNonNull(publicPort);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryAccessKey(String secondaryAccessKey) {
            this.secondaryAccessKey = Objects.requireNonNull(secondaryAccessKey);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryConnectionString(String secondaryConnectionString) {
            this.secondaryConnectionString = Objects.requireNonNull(secondaryConnectionString);
            return this;
        }
        @CustomType.Setter
        public Builder serverPort(Integer serverPort) {
            this.serverPort = Objects.requireNonNull(serverPort);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetServiceResult build() {
            final var o = new GetServiceResult();
            o.hostname = hostname;
            o.id = id;
            o.ipAddress = ipAddress;
            o.location = location;
            o.name = name;
            o.primaryAccessKey = primaryAccessKey;
            o.primaryConnectionString = primaryConnectionString;
            o.publicPort = publicPort;
            o.resourceGroupName = resourceGroupName;
            o.secondaryAccessKey = secondaryAccessKey;
            o.secondaryConnectionString = secondaryConnectionString;
            o.serverPort = serverPort;
            o.tags = tags;
            return o;
        }
    }
}