// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceWindowsEventArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceWindowsEventArgs Empty = new DataSourceWindowsEventArgs();

    /**
     * Specifies the name of the Windows Event Log to collect events from.
     * 
     */
    @Import(name="eventLogName", required=true)
    private Output<String> eventLogName;

    /**
     * @return Specifies the name of the Windows Event Log to collect events from.
     * 
     */
    public Output<String> eventLogName() {
        return this.eventLogName;
    }

    /**
     * Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
     * 
     */
    @Import(name="eventTypes", required=true)
    private Output<List<String>> eventTypes;

    /**
     * @return Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
     * 
     */
    public Output<List<String>> eventTypes() {
        return this.eventTypes;
    }

    /**
     * The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private DataSourceWindowsEventArgs() {}

    private DataSourceWindowsEventArgs(DataSourceWindowsEventArgs $) {
        this.eventLogName = $.eventLogName;
        this.eventTypes = $.eventTypes;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceWindowsEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceWindowsEventArgs $;

        public Builder() {
            $ = new DataSourceWindowsEventArgs();
        }

        public Builder(DataSourceWindowsEventArgs defaults) {
            $ = new DataSourceWindowsEventArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventLogName Specifies the name of the Windows Event Log to collect events from.
         * 
         * @return builder
         * 
         */
        public Builder eventLogName(Output<String> eventLogName) {
            $.eventLogName = eventLogName;
            return this;
        }

        /**
         * @param eventLogName Specifies the name of the Windows Event Log to collect events from.
         * 
         * @return builder
         * 
         */
        public Builder eventLogName(String eventLogName) {
            return eventLogName(Output.of(eventLogName));
        }

        /**
         * @param eventTypes Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
         * 
         * @return builder
         * 
         */
        public Builder eventTypes(Output<List<String>> eventTypes) {
            $.eventTypes = eventTypes;
            return this;
        }

        /**
         * @param eventTypes Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
         * 
         * @return builder
         * 
         */
        public Builder eventTypes(List<String> eventTypes) {
            return eventTypes(Output.of(eventTypes));
        }

        /**
         * @param eventTypes Specifies an array of event types applied to the specified event log. Possible values include `Error`, `Warning` and `Information`.
         * 
         * @return builder
         * 
         */
        public Builder eventTypes(String... eventTypes) {
            return eventTypes(List.of(eventTypes));
        }

        /**
         * @param name The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Log Analytics Windows Event DataSource. Changing this forces a new Log Analytics Windows Event DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the Log Analytics Workspace where the Log Analytics Windows Event DataSource should exist. Changing this forces a new Log Analytics Windows Event DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public DataSourceWindowsEventArgs build() {
            $.eventLogName = Objects.requireNonNull($.eventLogName, "expected parameter 'eventLogName' to be non-null");
            $.eventTypes = Objects.requireNonNull($.eventTypes, "expected parameter 'eventTypes' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
