// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appinsights;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebTestArgs Empty = new WebTestArgs();

    /**
     * The ID of the Application Insights component on which the WebTest operates. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="applicationInsightsId", required=true)
    private Output<String> applicationInsightsId;

    /**
     * @return The ID of the Application Insights component on which the WebTest operates. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> applicationInsightsId() {
        return this.applicationInsightsId;
    }

    /**
     * An XML configuration specification for a WebTest ([see here for more information](https://docs.microsoft.com/rest/api/application-insights/webtests/createorupdate/)).
     * 
     */
    @Import(name="configuration", required=true)
    private Output<String> configuration;

    /**
     * @return An XML configuration specification for a WebTest ([see here for more information](https://docs.microsoft.com/rest/api/application-insights/webtests/createorupdate/)).
     * 
     */
    public Output<String> configuration() {
        return this.configuration;
    }

    /**
     * Purpose/user defined descriptive test for this WebTest.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Purpose/user defined descriptive test for this WebTest.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Is the test actively being monitored.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is the test actively being monitored.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Interval in seconds between test runs for this WebTest. Valid options are `300`, `600` and `900`. Defaults to `300`.
     * 
     */
    @Import(name="frequency")
    private @Nullable Output<Integer> frequency;

    /**
     * @return Interval in seconds between test runs for this WebTest. Valid options are `300`, `600` and `900`. Defaults to `300`.
     * 
     */
    public Optional<Output<Integer>> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * A list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
     */
    @Import(name="geoLocations", required=true)
    private Output<List<String>> geoLocations;

    /**
     * @return A list of where to physically run the tests from to give global coverage for accessibility of your application.
     * 
     */
    public Output<List<String>> geoLocations() {
        return this.geoLocations;
    }

    /**
     * = (Required) The kind of web test that this web test watches. Choices are `ping` and `multistep`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return = (Required) The kind of web test that this web test watches. Choices are `ping` and `multistep`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. It needs to correlate with location of parent resource (azurerm_application_insights).
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. It needs to correlate with location of parent resource (azurerm_application_insights).
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the Application Insights WebTest. Changing this forces a
     * new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Application Insights WebTest. Changing this forces a
     * new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which to create the Application Insights WebTest. Changing this forces a new resource
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Application Insights WebTest. Changing this forces a new resource
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Allow for retries should this WebTest fail.
     * 
     */
    @Import(name="retryEnabled")
    private @Nullable Output<Boolean> retryEnabled;

    /**
     * @return Allow for retries should this WebTest fail.
     * 
     */
    public Optional<Output<Boolean>> retryEnabled() {
        return Optional.ofNullable(this.retryEnabled);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Seconds until this WebTest will timeout and fail. Default is `30`.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Seconds until this WebTest will timeout and fail. Default is `30`.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private WebTestArgs() {}

    private WebTestArgs(WebTestArgs $) {
        this.applicationInsightsId = $.applicationInsightsId;
        this.configuration = $.configuration;
        this.description = $.description;
        this.enabled = $.enabled;
        this.frequency = $.frequency;
        this.geoLocations = $.geoLocations;
        this.kind = $.kind;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.retryEnabled = $.retryEnabled;
        this.tags = $.tags;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebTestArgs $;

        public Builder() {
            $ = new WebTestArgs();
        }

        public Builder(WebTestArgs defaults) {
            $ = new WebTestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationInsightsId The ID of the Application Insights component on which the WebTest operates. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationInsightsId(Output<String> applicationInsightsId) {
            $.applicationInsightsId = applicationInsightsId;
            return this;
        }

        /**
         * @param applicationInsightsId The ID of the Application Insights component on which the WebTest operates. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationInsightsId(String applicationInsightsId) {
            return applicationInsightsId(Output.of(applicationInsightsId));
        }

        /**
         * @param configuration An XML configuration specification for a WebTest ([see here for more information](https://docs.microsoft.com/rest/api/application-insights/webtests/createorupdate/)).
         * 
         * @return builder
         * 
         */
        public Builder configuration(Output<String> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration An XML configuration specification for a WebTest ([see here for more information](https://docs.microsoft.com/rest/api/application-insights/webtests/createorupdate/)).
         * 
         * @return builder
         * 
         */
        public Builder configuration(String configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param description Purpose/user defined descriptive test for this WebTest.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Purpose/user defined descriptive test for this WebTest.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Is the test actively being monitored.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is the test actively being monitored.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param frequency Interval in seconds between test runs for this WebTest. Valid options are `300`, `600` and `900`. Defaults to `300`.
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable Output<Integer> frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param frequency Interval in seconds between test runs for this WebTest. Valid options are `300`, `600` and `900`. Defaults to `300`.
         * 
         * @return builder
         * 
         */
        public Builder frequency(Integer frequency) {
            return frequency(Output.of(frequency));
        }

        /**
         * @param geoLocations A list of where to physically run the tests from to give global coverage for accessibility of your application.
         * 
         * @return builder
         * 
         */
        public Builder geoLocations(Output<List<String>> geoLocations) {
            $.geoLocations = geoLocations;
            return this;
        }

        /**
         * @param geoLocations A list of where to physically run the tests from to give global coverage for accessibility of your application.
         * 
         * @return builder
         * 
         */
        public Builder geoLocations(List<String> geoLocations) {
            return geoLocations(Output.of(geoLocations));
        }

        /**
         * @param geoLocations A list of where to physically run the tests from to give global coverage for accessibility of your application.
         * 
         * @return builder
         * 
         */
        public Builder geoLocations(String... geoLocations) {
            return geoLocations(List.of(geoLocations));
        }

        /**
         * @param kind = (Required) The kind of web test that this web test watches. Choices are `ping` and `multistep`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind = (Required) The kind of web test that this web test watches. Choices are `ping` and `multistep`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. It needs to correlate with location of parent resource (azurerm_application_insights).
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created. It needs to correlate with location of parent resource (azurerm_application_insights).
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the Application Insights WebTest. Changing this forces a
         * new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Application Insights WebTest. Changing this forces a
         * new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Application Insights WebTest. Changing this forces a new resource
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Application Insights WebTest. Changing this forces a new resource
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param retryEnabled Allow for retries should this WebTest fail.
         * 
         * @return builder
         * 
         */
        public Builder retryEnabled(@Nullable Output<Boolean> retryEnabled) {
            $.retryEnabled = retryEnabled;
            return this;
        }

        /**
         * @param retryEnabled Allow for retries should this WebTest fail.
         * 
         * @return builder
         * 
         */
        public Builder retryEnabled(Boolean retryEnabled) {
            return retryEnabled(Output.of(retryEnabled));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param timeout Seconds until this WebTest will timeout and fail. Default is `30`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Seconds until this WebTest will timeout and fail. Default is `30`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public WebTestArgs build() {
            $.applicationInsightsId = Objects.requireNonNull($.applicationInsightsId, "expected parameter 'applicationInsightsId' to be non-null");
            $.configuration = Objects.requireNonNull($.configuration, "expected parameter 'configuration' to be non-null");
            $.geoLocations = Objects.requireNonNull($.geoLocations, "expected parameter 'geoLocations' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}