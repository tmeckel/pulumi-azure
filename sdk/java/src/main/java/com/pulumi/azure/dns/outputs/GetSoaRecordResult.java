// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSoaRecordResult {
    /**
     * @return The email contact for the SOA record.
     * 
     */
    private String email;
    /**
     * @return The expire time for the SOA record.
     * 
     */
    private Integer expireTime;
    /**
     * @return The FQDN of the DNS SOA Record.
     * 
     */
    private String fqdn;
    /**
     * @return The domain name of the authoritative name server for the SOA record.
     * 
     */
    private String hostName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The minimum Time To Live for the SOA record. By convention, it is used to determine the negative caching duration.
     * 
     */
    private Integer minimumTtl;
    /**
     * @return The name of the DNS SOA Record.
     * 
     */
    private @Nullable String name;
    /**
     * @return The refresh time for the SOA record.
     * 
     */
    private Integer refreshTime;
    private String resourceGroupName;
    /**
     * @return The retry time for the SOA record.
     * 
     */
    private Integer retryTime;
    /**
     * @return The serial number for the SOA record.
     * 
     */
    private Integer serialNumber;
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The Time To Live (TTL) of the DNS record in seconds.
     * 
     */
    private Integer ttl;
    private String zoneName;

    private GetSoaRecordResult() {}
    /**
     * @return The email contact for the SOA record.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The expire time for the SOA record.
     * 
     */
    public Integer expireTime() {
        return this.expireTime;
    }
    /**
     * @return The FQDN of the DNS SOA Record.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return The domain name of the authoritative name server for the SOA record.
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The minimum Time To Live for the SOA record. By convention, it is used to determine the negative caching duration.
     * 
     */
    public Integer minimumTtl() {
        return this.minimumTtl;
    }
    /**
     * @return The name of the DNS SOA Record.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The refresh time for the SOA record.
     * 
     */
    public Integer refreshTime() {
        return this.refreshTime;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The retry time for the SOA record.
     * 
     */
    public Integer retryTime() {
        return this.retryTime;
    }
    /**
     * @return The serial number for the SOA record.
     * 
     */
    public Integer serialNumber() {
        return this.serialNumber;
    }
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The Time To Live (TTL) of the DNS record in seconds.
     * 
     */
    public Integer ttl() {
        return this.ttl;
    }
    public String zoneName() {
        return this.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSoaRecordResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private Integer expireTime;
        private String fqdn;
        private String hostName;
        private String id;
        private Integer minimumTtl;
        private @Nullable String name;
        private Integer refreshTime;
        private String resourceGroupName;
        private Integer retryTime;
        private Integer serialNumber;
        private Map<String,String> tags;
        private Integer ttl;
        private String zoneName;
        public Builder() {}
        public Builder(GetSoaRecordResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.expireTime = defaults.expireTime;
    	      this.fqdn = defaults.fqdn;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.minimumTtl = defaults.minimumTtl;
    	      this.name = defaults.name;
    	      this.refreshTime = defaults.refreshTime;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retryTime = defaults.retryTime;
    	      this.serialNumber = defaults.serialNumber;
    	      this.tags = defaults.tags;
    	      this.ttl = defaults.ttl;
    	      this.zoneName = defaults.zoneName;
        }

        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(Integer expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        @CustomType.Setter
        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        @CustomType.Setter
        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder minimumTtl(Integer minimumTtl) {
            this.minimumTtl = Objects.requireNonNull(minimumTtl);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder refreshTime(Integer refreshTime) {
            this.refreshTime = Objects.requireNonNull(refreshTime);
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        @CustomType.Setter
        public Builder retryTime(Integer retryTime) {
            this.retryTime = Objects.requireNonNull(retryTime);
            return this;
        }
        @CustomType.Setter
        public Builder serialNumber(Integer serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        @CustomType.Setter
        public Builder zoneName(String zoneName) {
            this.zoneName = Objects.requireNonNull(zoneName);
            return this;
        }
        public GetSoaRecordResult build() {
            final var o = new GetSoaRecordResult();
            o.email = email;
            o.expireTime = expireTime;
            o.fqdn = fqdn;
            o.hostName = hostName;
            o.id = id;
            o.minimumTtl = minimumTtl;
            o.name = name;
            o.refreshTime = refreshTime;
            o.resourceGroupName = resourceGroupName;
            o.retryTime = retryTime;
            o.serialNumber = serialNumber;
            o.tags = tags;
            o.ttl = ttl;
            o.zoneName = zoneName;
            return o;
        }
    }
}