// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduleDailyRecurrence {
    /**
     * @return The time each day when the schedule takes effect.
     * 
     */
    private String time;

    private ScheduleDailyRecurrence() {}
    /**
     * @return The time each day when the schedule takes effect.
     * 
     */
    public String time() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleDailyRecurrence defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String time;
        public Builder() {}
        public Builder(ScheduleDailyRecurrence defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.time = defaults.time;
        }

        @CustomType.Setter
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        public ScheduleDailyRecurrence build() {
            final var o = new ScheduleDailyRecurrence();
            o.time = time;
            return o;
        }
    }
}