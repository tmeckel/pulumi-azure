// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.apimanagement.inputs.DiagnosticBackendRequestArgs;
import com.pulumi.azure.apimanagement.inputs.DiagnosticBackendResponseArgs;
import com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendRequestArgs;
import com.pulumi.azure.apimanagement.inputs.DiagnosticFrontendResponseArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiagnosticArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticArgs Empty = new DiagnosticArgs();

    /**
     * Always log errors. Send telemetry if there is an erroneous condition, regardless of sampling settings.
     * 
     */
    @Import(name="alwaysLogErrors")
    private @Nullable Output<Boolean> alwaysLogErrors;

    /**
     * @return Always log errors. Send telemetry if there is an erroneous condition, regardless of sampling settings.
     * 
     */
    public Optional<Output<Boolean>> alwaysLogErrors() {
        return Optional.ofNullable(this.alwaysLogErrors);
    }

    /**
     * The id of the target API Management Logger where the API Management Diagnostic should be saved.
     * 
     */
    @Import(name="apiManagementLoggerId", required=true)
    private Output<String> apiManagementLoggerId;

    /**
     * @return The id of the target API Management Logger where the API Management Diagnostic should be saved.
     * 
     */
    public Output<String> apiManagementLoggerId() {
        return this.apiManagementLoggerId;
    }

    /**
     * The Name of the API Management Service where this Diagnostic should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName", required=true)
    private Output<String> apiManagementName;

    /**
     * @return The Name of the API Management Service where this Diagnostic should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }

    /**
     * A `backend_request` block as defined below.
     * 
     */
    @Import(name="backendRequest")
    private @Nullable Output<DiagnosticBackendRequestArgs> backendRequest;

    /**
     * @return A `backend_request` block as defined below.
     * 
     */
    public Optional<Output<DiagnosticBackendRequestArgs>> backendRequest() {
        return Optional.ofNullable(this.backendRequest);
    }

    /**
     * A `backend_response` block as defined below.
     * 
     */
    @Import(name="backendResponse")
    private @Nullable Output<DiagnosticBackendResponseArgs> backendResponse;

    /**
     * @return A `backend_response` block as defined below.
     * 
     */
    public Optional<Output<DiagnosticBackendResponseArgs>> backendResponse() {
        return Optional.ofNullable(this.backendResponse);
    }

    /**
     * A `frontend_request` block as defined below.
     * 
     */
    @Import(name="frontendRequest")
    private @Nullable Output<DiagnosticFrontendRequestArgs> frontendRequest;

    /**
     * @return A `frontend_request` block as defined below.
     * 
     */
    public Optional<Output<DiagnosticFrontendRequestArgs>> frontendRequest() {
        return Optional.ofNullable(this.frontendRequest);
    }

    /**
     * A `frontend_response` block as defined below.
     * 
     */
    @Import(name="frontendResponse")
    private @Nullable Output<DiagnosticFrontendResponseArgs> frontendResponse;

    /**
     * @return A `frontend_response` block as defined below.
     * 
     */
    public Optional<Output<DiagnosticFrontendResponseArgs>> frontendResponse() {
        return Optional.ofNullable(this.frontendResponse);
    }

    /**
     * The HTTP Correlation Protocol to use. Possible values are `None`, `Legacy` or `W3C`.
     * 
     */
    @Import(name="httpCorrelationProtocol")
    private @Nullable Output<String> httpCorrelationProtocol;

    /**
     * @return The HTTP Correlation Protocol to use. Possible values are `None`, `Legacy` or `W3C`.
     * 
     */
    public Optional<Output<String>> httpCorrelationProtocol() {
        return Optional.ofNullable(this.httpCorrelationProtocol);
    }

    /**
     * The diagnostic identifier for the API Management Service. At this time the only supported value is `applicationinsights`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return The diagnostic identifier for the API Management Service. At this time the only supported value is `applicationinsights`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Log client IP address.
     * 
     */
    @Import(name="logClientIp")
    private @Nullable Output<Boolean> logClientIp;

    /**
     * @return Log client IP address.
     * 
     */
    public Optional<Output<Boolean>> logClientIp() {
        return Optional.ofNullable(this.logClientIp);
    }

    /**
     * The format of the Operation Name for Application Insights telemetries. Possible values are `Name`, and `Url`. Defaults to `Name`.
     * 
     */
    @Import(name="operationNameFormat")
    private @Nullable Output<String> operationNameFormat;

    /**
     * @return The format of the Operation Name for Application Insights telemetries. Possible values are `Name`, and `Url`. Defaults to `Name`.
     * 
     */
    public Optional<Output<String>> operationNameFormat() {
        return Optional.ofNullable(this.operationNameFormat);
    }

    /**
     * The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sampling (%). For high traffic APIs, please read this [documentation](https://docs.microsoft.com/azure/api-management/api-management-howto-app-insights#performance-implications-and-log-sampling) to understand performance implications and log sampling. Valid values are between `0.0` and `100.0`.
     * 
     */
    @Import(name="samplingPercentage")
    private @Nullable Output<Double> samplingPercentage;

    /**
     * @return Sampling (%). For high traffic APIs, please read this [documentation](https://docs.microsoft.com/azure/api-management/api-management-howto-app-insights#performance-implications-and-log-sampling) to understand performance implications and log sampling. Valid values are between `0.0` and `100.0`.
     * 
     */
    public Optional<Output<Double>> samplingPercentage() {
        return Optional.ofNullable(this.samplingPercentage);
    }

    /**
     * Logging verbosity. Possible values are `verbose`, `information` or `error`.
     * 
     */
    @Import(name="verbosity")
    private @Nullable Output<String> verbosity;

    /**
     * @return Logging verbosity. Possible values are `verbose`, `information` or `error`.
     * 
     */
    public Optional<Output<String>> verbosity() {
        return Optional.ofNullable(this.verbosity);
    }

    private DiagnosticArgs() {}

    private DiagnosticArgs(DiagnosticArgs $) {
        this.alwaysLogErrors = $.alwaysLogErrors;
        this.apiManagementLoggerId = $.apiManagementLoggerId;
        this.apiManagementName = $.apiManagementName;
        this.backendRequest = $.backendRequest;
        this.backendResponse = $.backendResponse;
        this.frontendRequest = $.frontendRequest;
        this.frontendResponse = $.frontendResponse;
        this.httpCorrelationProtocol = $.httpCorrelationProtocol;
        this.identifier = $.identifier;
        this.logClientIp = $.logClientIp;
        this.operationNameFormat = $.operationNameFormat;
        this.resourceGroupName = $.resourceGroupName;
        this.samplingPercentage = $.samplingPercentage;
        this.verbosity = $.verbosity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticArgs $;

        public Builder() {
            $ = new DiagnosticArgs();
        }

        public Builder(DiagnosticArgs defaults) {
            $ = new DiagnosticArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alwaysLogErrors Always log errors. Send telemetry if there is an erroneous condition, regardless of sampling settings.
         * 
         * @return builder
         * 
         */
        public Builder alwaysLogErrors(@Nullable Output<Boolean> alwaysLogErrors) {
            $.alwaysLogErrors = alwaysLogErrors;
            return this;
        }

        /**
         * @param alwaysLogErrors Always log errors. Send telemetry if there is an erroneous condition, regardless of sampling settings.
         * 
         * @return builder
         * 
         */
        public Builder alwaysLogErrors(Boolean alwaysLogErrors) {
            return alwaysLogErrors(Output.of(alwaysLogErrors));
        }

        /**
         * @param apiManagementLoggerId The id of the target API Management Logger where the API Management Diagnostic should be saved.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementLoggerId(Output<String> apiManagementLoggerId) {
            $.apiManagementLoggerId = apiManagementLoggerId;
            return this;
        }

        /**
         * @param apiManagementLoggerId The id of the target API Management Logger where the API Management Diagnostic should be saved.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementLoggerId(String apiManagementLoggerId) {
            return apiManagementLoggerId(Output.of(apiManagementLoggerId));
        }

        /**
         * @param apiManagementName The Name of the API Management Service where this Diagnostic should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The Name of the API Management Service where this Diagnostic should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param backendRequest A `backend_request` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder backendRequest(@Nullable Output<DiagnosticBackendRequestArgs> backendRequest) {
            $.backendRequest = backendRequest;
            return this;
        }

        /**
         * @param backendRequest A `backend_request` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder backendRequest(DiagnosticBackendRequestArgs backendRequest) {
            return backendRequest(Output.of(backendRequest));
        }

        /**
         * @param backendResponse A `backend_response` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder backendResponse(@Nullable Output<DiagnosticBackendResponseArgs> backendResponse) {
            $.backendResponse = backendResponse;
            return this;
        }

        /**
         * @param backendResponse A `backend_response` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder backendResponse(DiagnosticBackendResponseArgs backendResponse) {
            return backendResponse(Output.of(backendResponse));
        }

        /**
         * @param frontendRequest A `frontend_request` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder frontendRequest(@Nullable Output<DiagnosticFrontendRequestArgs> frontendRequest) {
            $.frontendRequest = frontendRequest;
            return this;
        }

        /**
         * @param frontendRequest A `frontend_request` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder frontendRequest(DiagnosticFrontendRequestArgs frontendRequest) {
            return frontendRequest(Output.of(frontendRequest));
        }

        /**
         * @param frontendResponse A `frontend_response` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder frontendResponse(@Nullable Output<DiagnosticFrontendResponseArgs> frontendResponse) {
            $.frontendResponse = frontendResponse;
            return this;
        }

        /**
         * @param frontendResponse A `frontend_response` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder frontendResponse(DiagnosticFrontendResponseArgs frontendResponse) {
            return frontendResponse(Output.of(frontendResponse));
        }

        /**
         * @param httpCorrelationProtocol The HTTP Correlation Protocol to use. Possible values are `None`, `Legacy` or `W3C`.
         * 
         * @return builder
         * 
         */
        public Builder httpCorrelationProtocol(@Nullable Output<String> httpCorrelationProtocol) {
            $.httpCorrelationProtocol = httpCorrelationProtocol;
            return this;
        }

        /**
         * @param httpCorrelationProtocol The HTTP Correlation Protocol to use. Possible values are `None`, `Legacy` or `W3C`.
         * 
         * @return builder
         * 
         */
        public Builder httpCorrelationProtocol(String httpCorrelationProtocol) {
            return httpCorrelationProtocol(Output.of(httpCorrelationProtocol));
        }

        /**
         * @param identifier The diagnostic identifier for the API Management Service. At this time the only supported value is `applicationinsights`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier The diagnostic identifier for the API Management Service. At this time the only supported value is `applicationinsights`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param logClientIp Log client IP address.
         * 
         * @return builder
         * 
         */
        public Builder logClientIp(@Nullable Output<Boolean> logClientIp) {
            $.logClientIp = logClientIp;
            return this;
        }

        /**
         * @param logClientIp Log client IP address.
         * 
         * @return builder
         * 
         */
        public Builder logClientIp(Boolean logClientIp) {
            return logClientIp(Output.of(logClientIp));
        }

        /**
         * @param operationNameFormat The format of the Operation Name for Application Insights telemetries. Possible values are `Name`, and `Url`. Defaults to `Name`.
         * 
         * @return builder
         * 
         */
        public Builder operationNameFormat(@Nullable Output<String> operationNameFormat) {
            $.operationNameFormat = operationNameFormat;
            return this;
        }

        /**
         * @param operationNameFormat The format of the Operation Name for Application Insights telemetries. Possible values are `Name`, and `Url`. Defaults to `Name`.
         * 
         * @return builder
         * 
         */
        public Builder operationNameFormat(String operationNameFormat) {
            return operationNameFormat(Output.of(operationNameFormat));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param samplingPercentage Sampling (%). For high traffic APIs, please read this [documentation](https://docs.microsoft.com/azure/api-management/api-management-howto-app-insights#performance-implications-and-log-sampling) to understand performance implications and log sampling. Valid values are between `0.0` and `100.0`.
         * 
         * @return builder
         * 
         */
        public Builder samplingPercentage(@Nullable Output<Double> samplingPercentage) {
            $.samplingPercentage = samplingPercentage;
            return this;
        }

        /**
         * @param samplingPercentage Sampling (%). For high traffic APIs, please read this [documentation](https://docs.microsoft.com/azure/api-management/api-management-howto-app-insights#performance-implications-and-log-sampling) to understand performance implications and log sampling. Valid values are between `0.0` and `100.0`.
         * 
         * @return builder
         * 
         */
        public Builder samplingPercentage(Double samplingPercentage) {
            return samplingPercentage(Output.of(samplingPercentage));
        }

        /**
         * @param verbosity Logging verbosity. Possible values are `verbose`, `information` or `error`.
         * 
         * @return builder
         * 
         */
        public Builder verbosity(@Nullable Output<String> verbosity) {
            $.verbosity = verbosity;
            return this;
        }

        /**
         * @param verbosity Logging verbosity. Possible values are `verbose`, `information` or `error`.
         * 
         * @return builder
         * 
         */
        public Builder verbosity(String verbosity) {
            return verbosity(Output.of(verbosity));
        }

        public DiagnosticArgs build() {
            $.apiManagementLoggerId = Objects.requireNonNull($.apiManagementLoggerId, "expected parameter 'apiManagementLoggerId' to be non-null");
            $.apiManagementName = Objects.requireNonNull($.apiManagementName, "expected parameter 'apiManagementName' to be non-null");
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}