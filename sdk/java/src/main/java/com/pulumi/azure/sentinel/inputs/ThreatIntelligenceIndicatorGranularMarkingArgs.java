// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThreatIntelligenceIndicatorGranularMarkingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThreatIntelligenceIndicatorGranularMarkingArgs Empty = new ThreatIntelligenceIndicatorGranularMarkingArgs();

    /**
     * The language of granular marking of the Threat Intelligence Indicator.
     * 
     */
    @Import(name="language")
    private @Nullable Output<String> language;

    /**
     * @return The language of granular marking of the Threat Intelligence Indicator.
     * 
     */
    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    /**
     * The reference of the granular marking of the Threat Intelligence Indicator.
     * 
     */
    @Import(name="markingRef")
    private @Nullable Output<String> markingRef;

    /**
     * @return The reference of the granular marking of the Threat Intelligence Indicator.
     * 
     */
    public Optional<Output<String>> markingRef() {
        return Optional.ofNullable(this.markingRef);
    }

    /**
     * A list of selectors of the granular marking of the Threat Intelligence Indicator.
     * 
     */
    @Import(name="selectors")
    private @Nullable Output<List<String>> selectors;

    /**
     * @return A list of selectors of the granular marking of the Threat Intelligence Indicator.
     * 
     */
    public Optional<Output<List<String>>> selectors() {
        return Optional.ofNullable(this.selectors);
    }

    private ThreatIntelligenceIndicatorGranularMarkingArgs() {}

    private ThreatIntelligenceIndicatorGranularMarkingArgs(ThreatIntelligenceIndicatorGranularMarkingArgs $) {
        this.language = $.language;
        this.markingRef = $.markingRef;
        this.selectors = $.selectors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThreatIntelligenceIndicatorGranularMarkingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThreatIntelligenceIndicatorGranularMarkingArgs $;

        public Builder() {
            $ = new ThreatIntelligenceIndicatorGranularMarkingArgs();
        }

        public Builder(ThreatIntelligenceIndicatorGranularMarkingArgs defaults) {
            $ = new ThreatIntelligenceIndicatorGranularMarkingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param language The language of granular marking of the Threat Intelligence Indicator.
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language The language of granular marking of the Threat Intelligence Indicator.
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            return language(Output.of(language));
        }

        /**
         * @param markingRef The reference of the granular marking of the Threat Intelligence Indicator.
         * 
         * @return builder
         * 
         */
        public Builder markingRef(@Nullable Output<String> markingRef) {
            $.markingRef = markingRef;
            return this;
        }

        /**
         * @param markingRef The reference of the granular marking of the Threat Intelligence Indicator.
         * 
         * @return builder
         * 
         */
        public Builder markingRef(String markingRef) {
            return markingRef(Output.of(markingRef));
        }

        /**
         * @param selectors A list of selectors of the granular marking of the Threat Intelligence Indicator.
         * 
         * @return builder
         * 
         */
        public Builder selectors(@Nullable Output<List<String>> selectors) {
            $.selectors = selectors;
            return this;
        }

        /**
         * @param selectors A list of selectors of the granular marking of the Threat Intelligence Indicator.
         * 
         * @return builder
         * 
         */
        public Builder selectors(List<String> selectors) {
            return selectors(Output.of(selectors));
        }

        /**
         * @param selectors A list of selectors of the granular marking of the Threat Intelligence Indicator.
         * 
         * @return builder
         * 
         */
        public Builder selectors(String... selectors) {
            return selectors(List.of(selectors));
        }

        public ThreatIntelligenceIndicatorGranularMarkingArgs build() {
            return $;
        }
    }

}