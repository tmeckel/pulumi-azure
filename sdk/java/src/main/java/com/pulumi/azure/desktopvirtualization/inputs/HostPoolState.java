// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.desktopvirtualization.inputs;

import com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostPoolState extends com.pulumi.resources.ResourceArgs {

    public static final HostPoolState Empty = new HostPoolState();

    /**
     * A valid custom RDP properties string for the Virtual Desktop Host Pool, available properties can be [found in this article](https://docs.microsoft.com/windows-server/remote/remote-desktop-services/clients/rdp-files).
     * 
     */
    @Import(name="customRdpProperties")
    private @Nullable Output<String> customRdpProperties;

    /**
     * @return A valid custom RDP properties string for the Virtual Desktop Host Pool, available properties can be [found in this article](https://docs.microsoft.com/windows-server/remote/remote-desktop-services/clients/rdp-files).
     * 
     */
    public Optional<Output<String>> customRdpProperties() {
        return Optional.ofNullable(this.customRdpProperties);
    }

    /**
     * A description for the Virtual Desktop Host Pool.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for the Virtual Desktop Host Pool.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A friendly name for the Virtual Desktop Host Pool.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return A friendly name for the Virtual Desktop Host Pool.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * `BreadthFirst` load balancing distributes new user sessions across all available session hosts in the host pool.
     * `DepthFirst` load balancing distributes new user sessions to an available session host with the highest number of connections but has not reached its maximum session limit threshold.
     * `Persistent` should be used if the host pool type is `Personal`
     * 
     */
    @Import(name="loadBalancerType")
    private @Nullable Output<String> loadBalancerType;

    /**
     * @return `BreadthFirst` load balancing distributes new user sessions across all available session hosts in the host pool.
     * `DepthFirst` load balancing distributes new user sessions to an available session host with the highest number of connections but has not reached its maximum session limit threshold.
     * `Persistent` should be used if the host pool type is `Personal`
     * 
     */
    public Optional<Output<String>> loadBalancerType() {
        return Optional.ofNullable(this.loadBalancerType);
    }

    /**
     * The location/region where the Virtual Desktop Host Pool is
     * located. Changing the location/region forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location/region where the Virtual Desktop Host Pool is
     * located. Changing the location/region forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A valid integer value from 0 to 999999 for the maximum number of users that have concurrent sessions on a session host.
     * Should only be set if the `type` of your Virtual Desktop Host Pool is `Pooled`.
     * 
     */
    @Import(name="maximumSessionsAllowed")
    private @Nullable Output<Integer> maximumSessionsAllowed;

    /**
     * @return A valid integer value from 0 to 999999 for the maximum number of users that have concurrent sessions on a session host.
     * Should only be set if the `type` of your Virtual Desktop Host Pool is `Pooled`.
     * 
     */
    public Optional<Output<Integer>> maximumSessionsAllowed() {
        return Optional.ofNullable(this.maximumSessionsAllowed);
    }

    /**
     * The name of the Virtual Desktop Host Pool. Changing the name
     * forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Virtual Desktop Host Pool. Changing the name
     * forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `Automatic` assignment – The service will select an available host and assign it to an user.
     * `Direct` Assignment – Admin selects a specific host to assign to an user.
     * 
     */
    @Import(name="personalDesktopAssignmentType")
    private @Nullable Output<String> personalDesktopAssignmentType;

    /**
     * @return `Automatic` assignment – The service will select an available host and assign it to an user.
     * `Direct` Assignment – Admin selects a specific host to assign to an user.
     * 
     */
    public Optional<Output<String>> personalDesktopAssignmentType() {
        return Optional.ofNullable(this.personalDesktopAssignmentType);
    }

    /**
     * Option to specify the preferred Application Group type for the Virtual Desktop Host Pool.
     * Valid options are `None`, `Desktop` or `RailApplications`. Default is `None`.
     * 
     */
    @Import(name="preferredAppGroupType")
    private @Nullable Output<String> preferredAppGroupType;

    /**
     * @return Option to specify the preferred Application Group type for the Virtual Desktop Host Pool.
     * Valid options are `None`, `Desktop` or `RailApplications`. Default is `None`.
     * 
     */
    public Optional<Output<String>> preferredAppGroupType() {
        return Optional.ofNullable(this.preferredAppGroupType);
    }

    /**
     * The name of the resource group in which to
     * create the Virtual Desktop Host Pool. Changing the resource group name forces
     * a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to
     * create the Virtual Desktop Host Pool. Changing the resource group name forces
     * a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A `scheduled_agent_updates` block as defined below. This enables control of when Agent Updates will be applied to Session Hosts.
     * 
     */
    @Import(name="scheduledAgentUpdates")
    private @Nullable Output<HostPoolScheduledAgentUpdatesArgs> scheduledAgentUpdates;

    /**
     * @return A `scheduled_agent_updates` block as defined below. This enables control of when Agent Updates will be applied to Session Hosts.
     * 
     */
    public Optional<Output<HostPoolScheduledAgentUpdatesArgs>> scheduledAgentUpdates() {
        return Optional.ofNullable(this.scheduledAgentUpdates);
    }

    /**
     * Enables or disables the Start VM on Connection Feature. Defaults to `false`.
     * 
     */
    @Import(name="startVmOnConnect")
    private @Nullable Output<Boolean> startVmOnConnect;

    /**
     * @return Enables or disables the Start VM on Connection Feature. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> startVmOnConnect() {
        return Optional.ofNullable(this.startVmOnConnect);
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
     * The type of the Virtual Desktop Host Pool. Valid options are
     * `Personal` or `Pooled`. Changing the type forces a new resource to be created.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the Virtual Desktop Host Pool. Valid options are
     * `Personal` or `Pooled`. Changing the type forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Allows you to test service changes before they are deployed to production. Defaults to `false`.
     * 
     */
    @Import(name="validateEnvironment")
    private @Nullable Output<Boolean> validateEnvironment;

    /**
     * @return Allows you to test service changes before they are deployed to production. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> validateEnvironment() {
        return Optional.ofNullable(this.validateEnvironment);
    }

    private HostPoolState() {}

    private HostPoolState(HostPoolState $) {
        this.customRdpProperties = $.customRdpProperties;
        this.description = $.description;
        this.friendlyName = $.friendlyName;
        this.loadBalancerType = $.loadBalancerType;
        this.location = $.location;
        this.maximumSessionsAllowed = $.maximumSessionsAllowed;
        this.name = $.name;
        this.personalDesktopAssignmentType = $.personalDesktopAssignmentType;
        this.preferredAppGroupType = $.preferredAppGroupType;
        this.resourceGroupName = $.resourceGroupName;
        this.scheduledAgentUpdates = $.scheduledAgentUpdates;
        this.startVmOnConnect = $.startVmOnConnect;
        this.tags = $.tags;
        this.type = $.type;
        this.validateEnvironment = $.validateEnvironment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostPoolState $;

        public Builder() {
            $ = new HostPoolState();
        }

        public Builder(HostPoolState defaults) {
            $ = new HostPoolState(Objects.requireNonNull(defaults));
        }

        /**
         * @param customRdpProperties A valid custom RDP properties string for the Virtual Desktop Host Pool, available properties can be [found in this article](https://docs.microsoft.com/windows-server/remote/remote-desktop-services/clients/rdp-files).
         * 
         * @return builder
         * 
         */
        public Builder customRdpProperties(@Nullable Output<String> customRdpProperties) {
            $.customRdpProperties = customRdpProperties;
            return this;
        }

        /**
         * @param customRdpProperties A valid custom RDP properties string for the Virtual Desktop Host Pool, available properties can be [found in this article](https://docs.microsoft.com/windows-server/remote/remote-desktop-services/clients/rdp-files).
         * 
         * @return builder
         * 
         */
        public Builder customRdpProperties(String customRdpProperties) {
            return customRdpProperties(Output.of(customRdpProperties));
        }

        /**
         * @param description A description for the Virtual Desktop Host Pool.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the Virtual Desktop Host Pool.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param friendlyName A friendly name for the Virtual Desktop Host Pool.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName A friendly name for the Virtual Desktop Host Pool.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param loadBalancerType `BreadthFirst` load balancing distributes new user sessions across all available session hosts in the host pool.
         * `DepthFirst` load balancing distributes new user sessions to an available session host with the highest number of connections but has not reached its maximum session limit threshold.
         * `Persistent` should be used if the host pool type is `Personal`
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerType(@Nullable Output<String> loadBalancerType) {
            $.loadBalancerType = loadBalancerType;
            return this;
        }

        /**
         * @param loadBalancerType `BreadthFirst` load balancing distributes new user sessions across all available session hosts in the host pool.
         * `DepthFirst` load balancing distributes new user sessions to an available session host with the highest number of connections but has not reached its maximum session limit threshold.
         * `Persistent` should be used if the host pool type is `Personal`
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerType(String loadBalancerType) {
            return loadBalancerType(Output.of(loadBalancerType));
        }

        /**
         * @param location The location/region where the Virtual Desktop Host Pool is
         * located. Changing the location/region forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location/region where the Virtual Desktop Host Pool is
         * located. Changing the location/region forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maximumSessionsAllowed A valid integer value from 0 to 999999 for the maximum number of users that have concurrent sessions on a session host.
         * Should only be set if the `type` of your Virtual Desktop Host Pool is `Pooled`.
         * 
         * @return builder
         * 
         */
        public Builder maximumSessionsAllowed(@Nullable Output<Integer> maximumSessionsAllowed) {
            $.maximumSessionsAllowed = maximumSessionsAllowed;
            return this;
        }

        /**
         * @param maximumSessionsAllowed A valid integer value from 0 to 999999 for the maximum number of users that have concurrent sessions on a session host.
         * Should only be set if the `type` of your Virtual Desktop Host Pool is `Pooled`.
         * 
         * @return builder
         * 
         */
        public Builder maximumSessionsAllowed(Integer maximumSessionsAllowed) {
            return maximumSessionsAllowed(Output.of(maximumSessionsAllowed));
        }

        /**
         * @param name The name of the Virtual Desktop Host Pool. Changing the name
         * forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Virtual Desktop Host Pool. Changing the name
         * forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param personalDesktopAssignmentType `Automatic` assignment – The service will select an available host and assign it to an user.
         * `Direct` Assignment – Admin selects a specific host to assign to an user.
         * 
         * @return builder
         * 
         */
        public Builder personalDesktopAssignmentType(@Nullable Output<String> personalDesktopAssignmentType) {
            $.personalDesktopAssignmentType = personalDesktopAssignmentType;
            return this;
        }

        /**
         * @param personalDesktopAssignmentType `Automatic` assignment – The service will select an available host and assign it to an user.
         * `Direct` Assignment – Admin selects a specific host to assign to an user.
         * 
         * @return builder
         * 
         */
        public Builder personalDesktopAssignmentType(String personalDesktopAssignmentType) {
            return personalDesktopAssignmentType(Output.of(personalDesktopAssignmentType));
        }

        /**
         * @param preferredAppGroupType Option to specify the preferred Application Group type for the Virtual Desktop Host Pool.
         * Valid options are `None`, `Desktop` or `RailApplications`. Default is `None`.
         * 
         * @return builder
         * 
         */
        public Builder preferredAppGroupType(@Nullable Output<String> preferredAppGroupType) {
            $.preferredAppGroupType = preferredAppGroupType;
            return this;
        }

        /**
         * @param preferredAppGroupType Option to specify the preferred Application Group type for the Virtual Desktop Host Pool.
         * Valid options are `None`, `Desktop` or `RailApplications`. Default is `None`.
         * 
         * @return builder
         * 
         */
        public Builder preferredAppGroupType(String preferredAppGroupType) {
            return preferredAppGroupType(Output.of(preferredAppGroupType));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the Virtual Desktop Host Pool. Changing the resource group name forces
         * a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the Virtual Desktop Host Pool. Changing the resource group name forces
         * a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scheduledAgentUpdates A `scheduled_agent_updates` block as defined below. This enables control of when Agent Updates will be applied to Session Hosts.
         * 
         * @return builder
         * 
         */
        public Builder scheduledAgentUpdates(@Nullable Output<HostPoolScheduledAgentUpdatesArgs> scheduledAgentUpdates) {
            $.scheduledAgentUpdates = scheduledAgentUpdates;
            return this;
        }

        /**
         * @param scheduledAgentUpdates A `scheduled_agent_updates` block as defined below. This enables control of when Agent Updates will be applied to Session Hosts.
         * 
         * @return builder
         * 
         */
        public Builder scheduledAgentUpdates(HostPoolScheduledAgentUpdatesArgs scheduledAgentUpdates) {
            return scheduledAgentUpdates(Output.of(scheduledAgentUpdates));
        }

        /**
         * @param startVmOnConnect Enables or disables the Start VM on Connection Feature. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder startVmOnConnect(@Nullable Output<Boolean> startVmOnConnect) {
            $.startVmOnConnect = startVmOnConnect;
            return this;
        }

        /**
         * @param startVmOnConnect Enables or disables the Start VM on Connection Feature. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder startVmOnConnect(Boolean startVmOnConnect) {
            return startVmOnConnect(Output.of(startVmOnConnect));
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
         * @param type The type of the Virtual Desktop Host Pool. Valid options are
         * `Personal` or `Pooled`. Changing the type forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the Virtual Desktop Host Pool. Valid options are
         * `Personal` or `Pooled`. Changing the type forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param validateEnvironment Allows you to test service changes before they are deployed to production. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder validateEnvironment(@Nullable Output<Boolean> validateEnvironment) {
            $.validateEnvironment = validateEnvironment;
            return this;
        }

        /**
         * @param validateEnvironment Allows you to test service changes before they are deployed to production. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder validateEnvironment(Boolean validateEnvironment) {
            return validateEnvironment(Output.of(validateEnvironment));
        }

        public HostPoolState build() {
            return $;
        }
    }

}