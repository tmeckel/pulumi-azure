// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.outputs;

import com.pulumi.azure.privatedns.outputs.GetSrvRecordRecord;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSrvRecordResult {
    /**
     * @return The FQDN of the Private DNS SRV Record.
     * 
     */
    private String fqdn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String name;
    /**
     * @return A list of values that make up the SRV record. Each `record` block supports fields documented below.
     * 
     */
    private List<GetSrvRecordRecord> records;
    private String resourceGroupName;
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The Time To Live (TTL) of the Private DNS record in seconds.
     * 
     */
    private Integer ttl;
    private String zoneName;

    private GetSrvRecordResult() {}
    /**
     * @return The FQDN of the Private DNS SRV Record.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return A list of values that make up the SRV record. Each `record` block supports fields documented below.
     * 
     */
    public List<GetSrvRecordRecord> records() {
        return this.records;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The Time To Live (TTL) of the Private DNS record in seconds.
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

    public static Builder builder(GetSrvRecordResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fqdn;
        private String id;
        private String name;
        private List<GetSrvRecordRecord> records;
        private String resourceGroupName;
        private Map<String,String> tags;
        private Integer ttl;
        private String zoneName;
        public Builder() {}
        public Builder(GetSrvRecordResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.records = defaults.records;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.ttl = defaults.ttl;
    	      this.zoneName = defaults.zoneName;
        }

        @CustomType.Setter
        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder records(List<GetSrvRecordRecord> records) {
            this.records = Objects.requireNonNull(records);
            return this;
        }
        public Builder records(GetSrvRecordRecord... records) {
            return records(List.of(records));
        }
        @CustomType.Setter
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
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
        public GetSrvRecordResult build() {
            final var o = new GetSrvRecordResult();
            o.fqdn = fqdn;
            o.id = id;
            o.name = name;
            o.records = records;
            o.resourceGroupName = resourceGroupName;
            o.tags = tags;
            o.ttl = ttl;
            o.zoneName = zoneName;
            return o;
        }
    }
}