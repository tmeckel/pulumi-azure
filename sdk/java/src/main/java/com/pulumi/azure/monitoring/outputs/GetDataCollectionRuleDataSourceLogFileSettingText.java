// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDataCollectionRuleDataSourceLogFileSettingText {
    /**
     * @return The timestamp format of the text log files. Possible values are `ISO 8601`, `YYYY-MM-DD HH:MM:SS`, `M/D/YYYY HH:MM:SS AM/PM`, `Mon DD, YYYY HH:MM:SS`, `yyMMdd HH:mm:ss`, `ddMMyy HH:mm:ss`, `MMM d hh:mm:ss`, `dd/MMM/yyyy:HH:mm:ss zzz`,and `yyyy-MM-ddTHH:mm:ssK`.
     * 
     */
    private String recordStartTimestampFormat;

    private GetDataCollectionRuleDataSourceLogFileSettingText() {}
    /**
     * @return The timestamp format of the text log files. Possible values are `ISO 8601`, `YYYY-MM-DD HH:MM:SS`, `M/D/YYYY HH:MM:SS AM/PM`, `Mon DD, YYYY HH:MM:SS`, `yyMMdd HH:mm:ss`, `ddMMyy HH:mm:ss`, `MMM d hh:mm:ss`, `dd/MMM/yyyy:HH:mm:ss zzz`,and `yyyy-MM-ddTHH:mm:ssK`.
     * 
     */
    public String recordStartTimestampFormat() {
        return this.recordStartTimestampFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionRuleDataSourceLogFileSettingText defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String recordStartTimestampFormat;
        public Builder() {}
        public Builder(GetDataCollectionRuleDataSourceLogFileSettingText defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordStartTimestampFormat = defaults.recordStartTimestampFormat;
        }

        @CustomType.Setter
        public Builder recordStartTimestampFormat(String recordStartTimestampFormat) {
            this.recordStartTimestampFormat = Objects.requireNonNull(recordStartTimestampFormat);
            return this;
        }
        public GetDataCollectionRuleDataSourceLogFileSettingText build() {
            final var o = new GetDataCollectionRuleDataSourceLogFileSettingText();
            o.recordStartTimestampFormat = recordStartTimestampFormat;
            return o;
        }
    }
}