// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudApplicationInsightsApplicationPerformanceMonitoringState extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudApplicationInsightsApplicationPerformanceMonitoringState Empty = new SpringCloudApplicationInsightsApplicationPerformanceMonitoringState();

    /**
     * The instrumentation key used to push data to Application Insights.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return The instrumentation key used to push data to Application Insights.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * Specifies whether the Spring Cloud Application Performance Monitoring resource for Application Insights is enabled globally. Defaults to `false`.
     * 
     */
    @Import(name="globallyEnabled")
    private @Nullable Output<Boolean> globallyEnabled;

    /**
     * @return Specifies whether the Spring Cloud Application Performance Monitoring resource for Application Insights is enabled globally. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> globallyEnabled() {
        return Optional.ofNullable(this.globallyEnabled);
    }

    /**
     * The name which should be used for this Spring Cloud Application Performance Monitoring resource for Application Insights. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Spring Cloud Application Performance Monitoring resource for Application Insights. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the cloud role instance.
     * 
     */
    @Import(name="roleInstance")
    private @Nullable Output<String> roleInstance;

    /**
     * @return Specifies the cloud role instance.
     * 
     */
    public Optional<Output<String>> roleInstance() {
        return Optional.ofNullable(this.roleInstance);
    }

    /**
     * Specifies the cloud role name used to label the component on the application map.
     * 
     */
    @Import(name="roleName")
    private @Nullable Output<String> roleName;

    /**
     * @return Specifies the cloud role name used to label the component on the application map.
     * 
     */
    public Optional<Output<String>> roleName() {
        return Optional.ofNullable(this.roleName);
    }

    /**
     * Specifies the percentage for fixed-percentage sampling.
     * 
     */
    @Import(name="samplingPercentage")
    private @Nullable Output<Integer> samplingPercentage;

    /**
     * @return Specifies the percentage for fixed-percentage sampling.
     * 
     */
    public Optional<Output<Integer>> samplingPercentage() {
        return Optional.ofNullable(this.samplingPercentage);
    }

    /**
     * Specifies the number of requests per second for the rate-limited sampling.
     * 
     */
    @Import(name="samplingRequestsPerSecond")
    private @Nullable Output<Integer> samplingRequestsPerSecond;

    /**
     * @return Specifies the number of requests per second for the rate-limited sampling.
     * 
     */
    public Optional<Output<Integer>> samplingRequestsPerSecond() {
        return Optional.ofNullable(this.samplingRequestsPerSecond);
    }

    /**
     * The ID of the Spring Cloud Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="springCloudServiceId")
    private @Nullable Output<String> springCloudServiceId;

    /**
     * @return The ID of the Spring Cloud Service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> springCloudServiceId() {
        return Optional.ofNullable(this.springCloudServiceId);
    }

    private SpringCloudApplicationInsightsApplicationPerformanceMonitoringState() {}

    private SpringCloudApplicationInsightsApplicationPerformanceMonitoringState(SpringCloudApplicationInsightsApplicationPerformanceMonitoringState $) {
        this.connectionString = $.connectionString;
        this.globallyEnabled = $.globallyEnabled;
        this.name = $.name;
        this.roleInstance = $.roleInstance;
        this.roleName = $.roleName;
        this.samplingPercentage = $.samplingPercentage;
        this.samplingRequestsPerSecond = $.samplingRequestsPerSecond;
        this.springCloudServiceId = $.springCloudServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudApplicationInsightsApplicationPerformanceMonitoringState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudApplicationInsightsApplicationPerformanceMonitoringState $;

        public Builder() {
            $ = new SpringCloudApplicationInsightsApplicationPerformanceMonitoringState();
        }

        public Builder(SpringCloudApplicationInsightsApplicationPerformanceMonitoringState defaults) {
            $ = new SpringCloudApplicationInsightsApplicationPerformanceMonitoringState(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionString The instrumentation key used to push data to Application Insights.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The instrumentation key used to push data to Application Insights.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param globallyEnabled Specifies whether the Spring Cloud Application Performance Monitoring resource for Application Insights is enabled globally. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder globallyEnabled(@Nullable Output<Boolean> globallyEnabled) {
            $.globallyEnabled = globallyEnabled;
            return this;
        }

        /**
         * @param globallyEnabled Specifies whether the Spring Cloud Application Performance Monitoring resource for Application Insights is enabled globally. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder globallyEnabled(Boolean globallyEnabled) {
            return globallyEnabled(Output.of(globallyEnabled));
        }

        /**
         * @param name The name which should be used for this Spring Cloud Application Performance Monitoring resource for Application Insights. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Spring Cloud Application Performance Monitoring resource for Application Insights. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleInstance Specifies the cloud role instance.
         * 
         * @return builder
         * 
         */
        public Builder roleInstance(@Nullable Output<String> roleInstance) {
            $.roleInstance = roleInstance;
            return this;
        }

        /**
         * @param roleInstance Specifies the cloud role instance.
         * 
         * @return builder
         * 
         */
        public Builder roleInstance(String roleInstance) {
            return roleInstance(Output.of(roleInstance));
        }

        /**
         * @param roleName Specifies the cloud role name used to label the component on the application map.
         * 
         * @return builder
         * 
         */
        public Builder roleName(@Nullable Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName Specifies the cloud role name used to label the component on the application map.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        /**
         * @param samplingPercentage Specifies the percentage for fixed-percentage sampling.
         * 
         * @return builder
         * 
         */
        public Builder samplingPercentage(@Nullable Output<Integer> samplingPercentage) {
            $.samplingPercentage = samplingPercentage;
            return this;
        }

        /**
         * @param samplingPercentage Specifies the percentage for fixed-percentage sampling.
         * 
         * @return builder
         * 
         */
        public Builder samplingPercentage(Integer samplingPercentage) {
            return samplingPercentage(Output.of(samplingPercentage));
        }

        /**
         * @param samplingRequestsPerSecond Specifies the number of requests per second for the rate-limited sampling.
         * 
         * @return builder
         * 
         */
        public Builder samplingRequestsPerSecond(@Nullable Output<Integer> samplingRequestsPerSecond) {
            $.samplingRequestsPerSecond = samplingRequestsPerSecond;
            return this;
        }

        /**
         * @param samplingRequestsPerSecond Specifies the number of requests per second for the rate-limited sampling.
         * 
         * @return builder
         * 
         */
        public Builder samplingRequestsPerSecond(Integer samplingRequestsPerSecond) {
            return samplingRequestsPerSecond(Output.of(samplingRequestsPerSecond));
        }

        /**
         * @param springCloudServiceId The ID of the Spring Cloud Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudServiceId(@Nullable Output<String> springCloudServiceId) {
            $.springCloudServiceId = springCloudServiceId;
            return this;
        }

        /**
         * @param springCloudServiceId The ID of the Spring Cloud Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder springCloudServiceId(String springCloudServiceId) {
            return springCloudServiceId(Output.of(springCloudServiceId));
        }

        public SpringCloudApplicationInsightsApplicationPerformanceMonitoringState build() {
            return $;
        }
    }

}