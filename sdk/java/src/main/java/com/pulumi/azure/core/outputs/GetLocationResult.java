// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.azure.core.outputs.GetLocationZoneMapping;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLocationResult {
    /**
     * @return The display name of the location.
     * 
     */
    private String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String location;
    /**
     * @return A `zone_mappings` block as defined below.
     * 
     */
    private List<GetLocationZoneMapping> zoneMappings;

    private GetLocationResult() {}
    /**
     * @return The display name of the location.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String location() {
        return this.location;
    }
    /**
     * @return A `zone_mappings` block as defined below.
     * 
     */
    public List<GetLocationZoneMapping> zoneMappings() {
        return this.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private String id;
        private String location;
        private List<GetLocationZoneMapping> zoneMappings;
        public Builder() {}
        public Builder(GetLocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.zoneMappings = defaults.zoneMappings;
        }

        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
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
        public Builder zoneMappings(List<GetLocationZoneMapping> zoneMappings) {
            this.zoneMappings = Objects.requireNonNull(zoneMappings);
            return this;
        }
        public Builder zoneMappings(GetLocationZoneMapping... zoneMappings) {
            return zoneMappings(List.of(zoneMappings));
        }
        public GetLocationResult build() {
            final var _resultValue = new GetLocationResult();
            _resultValue.displayName = displayName;
            _resultValue.id = id;
            _resultValue.location = location;
            _resultValue.zoneMappings = zoneMappings;
            return _resultValue;
        }
    }
}
