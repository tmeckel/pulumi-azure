// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvironmentWorkloadProfile {
    private Integer maximumCount;
    private Integer minimumCount;
    /**
     * @return The name of the workload profile.
     * 
     */
    private String name;
    /**
     * @return Workload profile type for the workloads to run on. Possible values include `D4`, `D8`, `D16`, `D32`, `E4`, `E8`, `E16` and `E32`.
     * 
     */
    private String workloadProfileType;

    private EnvironmentWorkloadProfile() {}
    public Integer maximumCount() {
        return this.maximumCount;
    }
    public Integer minimumCount() {
        return this.minimumCount;
    }
    /**
     * @return The name of the workload profile.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Workload profile type for the workloads to run on. Possible values include `D4`, `D8`, `D16`, `D32`, `E4`, `E8`, `E16` and `E32`.
     * 
     */
    public String workloadProfileType() {
        return this.workloadProfileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentWorkloadProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maximumCount;
        private Integer minimumCount;
        private String name;
        private String workloadProfileType;
        public Builder() {}
        public Builder(EnvironmentWorkloadProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumCount = defaults.maximumCount;
    	      this.minimumCount = defaults.minimumCount;
    	      this.name = defaults.name;
    	      this.workloadProfileType = defaults.workloadProfileType;
        }

        @CustomType.Setter
        public Builder maximumCount(Integer maximumCount) {
            this.maximumCount = Objects.requireNonNull(maximumCount);
            return this;
        }
        @CustomType.Setter
        public Builder minimumCount(Integer minimumCount) {
            this.minimumCount = Objects.requireNonNull(minimumCount);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder workloadProfileType(String workloadProfileType) {
            this.workloadProfileType = Objects.requireNonNull(workloadProfileType);
            return this;
        }
        public EnvironmentWorkloadProfile build() {
            final var _resultValue = new EnvironmentWorkloadProfile();
            _resultValue.maximumCount = maximumCount;
            _resultValue.minimumCount = minimumCount;
            _resultValue.name = name;
            _resultValue.workloadProfileType = workloadProfileType;
            return _resultValue;
        }
    }
}