// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DpsSharedAccessPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final DpsSharedAccessPolicyState Empty = new DpsSharedAccessPolicyState();

    /**
     * Adds `EnrollmentRead` permission to this Shared Access Account. It allows read access to enrollment data.
     * 
     */
    @Import(name="enrollmentRead")
    private @Nullable Output<Boolean> enrollmentRead;

    /**
     * @return Adds `EnrollmentRead` permission to this Shared Access Account. It allows read access to enrollment data.
     * 
     */
    public Optional<Output<Boolean>> enrollmentRead() {
        return Optional.ofNullable(this.enrollmentRead);
    }

    /**
     * Adds `EnrollmentWrite` permission to this Shared Access Account. It allows write access to enrollment data.
     * 
     */
    @Import(name="enrollmentWrite")
    private @Nullable Output<Boolean> enrollmentWrite;

    /**
     * @return Adds `EnrollmentWrite` permission to this Shared Access Account. It allows write access to enrollment data.
     * 
     */
    public Optional<Output<Boolean>> enrollmentWrite() {
        return Optional.ofNullable(this.enrollmentWrite);
    }

    /**
     * The name of the IoT Hub Device Provisioning service to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="iothubDpsName")
    private @Nullable Output<String> iothubDpsName;

    /**
     * @return The name of the IoT Hub Device Provisioning service to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> iothubDpsName() {
        return Optional.ofNullable(this.iothubDpsName);
    }

    /**
     * Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The primary connection string of the Shared Access Policy.
     * 
     */
    @Import(name="primaryConnectionString")
    private @Nullable Output<String> primaryConnectionString;

    /**
     * @return The primary connection string of the Shared Access Policy.
     * 
     */
    public Optional<Output<String>> primaryConnectionString() {
        return Optional.ofNullable(this.primaryConnectionString);
    }

    /**
     * The primary key used to create the authentication token.
     * 
     */
    @Import(name="primaryKey")
    private @Nullable Output<String> primaryKey;

    /**
     * @return The primary key used to create the authentication token.
     * 
     */
    public Optional<Output<String>> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }

    /**
     * Adds `RegistrationStatusRead` permission to this Shared Access Account. It allows read access to device registrations.
     * 
     */
    @Import(name="registrationRead")
    private @Nullable Output<Boolean> registrationRead;

    /**
     * @return Adds `RegistrationStatusRead` permission to this Shared Access Account. It allows read access to device registrations.
     * 
     */
    public Optional<Output<Boolean>> registrationRead() {
        return Optional.ofNullable(this.registrationRead);
    }

    /**
     * Adds `RegistrationStatusWrite` permission to this Shared Access Account. It allows write access to device registrations.
     * 
     */
    @Import(name="registrationWrite")
    private @Nullable Output<Boolean> registrationWrite;

    /**
     * @return Adds `RegistrationStatusWrite` permission to this Shared Access Account. It allows write access to device registrations.
     * 
     */
    public Optional<Output<Boolean>> registrationWrite() {
        return Optional.ofNullable(this.registrationWrite);
    }

    /**
     * The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The secondary connection string of the Shared Access Policy.
     * 
     */
    @Import(name="secondaryConnectionString")
    private @Nullable Output<String> secondaryConnectionString;

    /**
     * @return The secondary connection string of the Shared Access Policy.
     * 
     */
    public Optional<Output<String>> secondaryConnectionString() {
        return Optional.ofNullable(this.secondaryConnectionString);
    }

    /**
     * The secondary key used to create the authentication token.
     * 
     */
    @Import(name="secondaryKey")
    private @Nullable Output<String> secondaryKey;

    /**
     * @return The secondary key used to create the authentication token.
     * 
     */
    public Optional<Output<String>> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    /**
     * Adds `ServiceConfig` permission to this Shared Access Account. It allows configuration of the Device Provisioning Service.
     * 
     */
    @Import(name="serviceConfig")
    private @Nullable Output<Boolean> serviceConfig;

    /**
     * @return Adds `ServiceConfig` permission to this Shared Access Account. It allows configuration of the Device Provisioning Service.
     * 
     */
    public Optional<Output<Boolean>> serviceConfig() {
        return Optional.ofNullable(this.serviceConfig);
    }

    private DpsSharedAccessPolicyState() {}

    private DpsSharedAccessPolicyState(DpsSharedAccessPolicyState $) {
        this.enrollmentRead = $.enrollmentRead;
        this.enrollmentWrite = $.enrollmentWrite;
        this.iothubDpsName = $.iothubDpsName;
        this.name = $.name;
        this.primaryConnectionString = $.primaryConnectionString;
        this.primaryKey = $.primaryKey;
        this.registrationRead = $.registrationRead;
        this.registrationWrite = $.registrationWrite;
        this.resourceGroupName = $.resourceGroupName;
        this.secondaryConnectionString = $.secondaryConnectionString;
        this.secondaryKey = $.secondaryKey;
        this.serviceConfig = $.serviceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DpsSharedAccessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DpsSharedAccessPolicyState $;

        public Builder() {
            $ = new DpsSharedAccessPolicyState();
        }

        public Builder(DpsSharedAccessPolicyState defaults) {
            $ = new DpsSharedAccessPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param enrollmentRead Adds `EnrollmentRead` permission to this Shared Access Account. It allows read access to enrollment data.
         * 
         * @return builder
         * 
         */
        public Builder enrollmentRead(@Nullable Output<Boolean> enrollmentRead) {
            $.enrollmentRead = enrollmentRead;
            return this;
        }

        /**
         * @param enrollmentRead Adds `EnrollmentRead` permission to this Shared Access Account. It allows read access to enrollment data.
         * 
         * @return builder
         * 
         */
        public Builder enrollmentRead(Boolean enrollmentRead) {
            return enrollmentRead(Output.of(enrollmentRead));
        }

        /**
         * @param enrollmentWrite Adds `EnrollmentWrite` permission to this Shared Access Account. It allows write access to enrollment data.
         * 
         * @return builder
         * 
         */
        public Builder enrollmentWrite(@Nullable Output<Boolean> enrollmentWrite) {
            $.enrollmentWrite = enrollmentWrite;
            return this;
        }

        /**
         * @param enrollmentWrite Adds `EnrollmentWrite` permission to this Shared Access Account. It allows write access to enrollment data.
         * 
         * @return builder
         * 
         */
        public Builder enrollmentWrite(Boolean enrollmentWrite) {
            return enrollmentWrite(Output.of(enrollmentWrite));
        }

        /**
         * @param iothubDpsName The name of the IoT Hub Device Provisioning service to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder iothubDpsName(@Nullable Output<String> iothubDpsName) {
            $.iothubDpsName = iothubDpsName;
            return this;
        }

        /**
         * @param iothubDpsName The name of the IoT Hub Device Provisioning service to which this Shared Access Policy belongs. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder iothubDpsName(String iothubDpsName) {
            return iothubDpsName(Output.of(iothubDpsName));
        }

        /**
         * @param name Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the IotHub Shared Access Policy resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primaryConnectionString The primary connection string of the Shared Access Policy.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionString(@Nullable Output<String> primaryConnectionString) {
            $.primaryConnectionString = primaryConnectionString;
            return this;
        }

        /**
         * @param primaryConnectionString The primary connection string of the Shared Access Policy.
         * 
         * @return builder
         * 
         */
        public Builder primaryConnectionString(String primaryConnectionString) {
            return primaryConnectionString(Output.of(primaryConnectionString));
        }

        /**
         * @param primaryKey The primary key used to create the authentication token.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(@Nullable Output<String> primaryKey) {
            $.primaryKey = primaryKey;
            return this;
        }

        /**
         * @param primaryKey The primary key used to create the authentication token.
         * 
         * @return builder
         * 
         */
        public Builder primaryKey(String primaryKey) {
            return primaryKey(Output.of(primaryKey));
        }

        /**
         * @param registrationRead Adds `RegistrationStatusRead` permission to this Shared Access Account. It allows read access to device registrations.
         * 
         * @return builder
         * 
         */
        public Builder registrationRead(@Nullable Output<Boolean> registrationRead) {
            $.registrationRead = registrationRead;
            return this;
        }

        /**
         * @param registrationRead Adds `RegistrationStatusRead` permission to this Shared Access Account. It allows read access to device registrations.
         * 
         * @return builder
         * 
         */
        public Builder registrationRead(Boolean registrationRead) {
            return registrationRead(Output.of(registrationRead));
        }

        /**
         * @param registrationWrite Adds `RegistrationStatusWrite` permission to this Shared Access Account. It allows write access to device registrations.
         * 
         * @return builder
         * 
         */
        public Builder registrationWrite(@Nullable Output<Boolean> registrationWrite) {
            $.registrationWrite = registrationWrite;
            return this;
        }

        /**
         * @param registrationWrite Adds `RegistrationStatusWrite` permission to this Shared Access Account. It allows write access to device registrations.
         * 
         * @return builder
         * 
         */
        public Builder registrationWrite(Boolean registrationWrite) {
            return registrationWrite(Output.of(registrationWrite));
        }

        /**
         * @param resourceGroupName The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group under which the IotHub Shared Access Policy resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param secondaryConnectionString The secondary connection string of the Shared Access Policy.
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionString(@Nullable Output<String> secondaryConnectionString) {
            $.secondaryConnectionString = secondaryConnectionString;
            return this;
        }

        /**
         * @param secondaryConnectionString The secondary connection string of the Shared Access Policy.
         * 
         * @return builder
         * 
         */
        public Builder secondaryConnectionString(String secondaryConnectionString) {
            return secondaryConnectionString(Output.of(secondaryConnectionString));
        }

        /**
         * @param secondaryKey The secondary key used to create the authentication token.
         * 
         * @return builder
         * 
         */
        public Builder secondaryKey(@Nullable Output<String> secondaryKey) {
            $.secondaryKey = secondaryKey;
            return this;
        }

        /**
         * @param secondaryKey The secondary key used to create the authentication token.
         * 
         * @return builder
         * 
         */
        public Builder secondaryKey(String secondaryKey) {
            return secondaryKey(Output.of(secondaryKey));
        }

        /**
         * @param serviceConfig Adds `ServiceConfig` permission to this Shared Access Account. It allows configuration of the Device Provisioning Service.
         * 
         * @return builder
         * 
         */
        public Builder serviceConfig(@Nullable Output<Boolean> serviceConfig) {
            $.serviceConfig = serviceConfig;
            return this;
        }

        /**
         * @param serviceConfig Adds `ServiceConfig` permission to this Shared Access Account. It allows configuration of the Device Provisioning Service.
         * 
         * @return builder
         * 
         */
        public Builder serviceConfig(Boolean serviceConfig) {
            return serviceConfig(Output.of(serviceConfig));
        }

        public DpsSharedAccessPolicyState build() {
            return $;
        }
    }

}