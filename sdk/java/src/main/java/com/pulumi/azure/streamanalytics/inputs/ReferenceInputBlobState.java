// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.azure.streamanalytics.inputs.ReferenceInputBlobSerializationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReferenceInputBlobState extends com.pulumi.resources.ResourceArgs {

    public static final ReferenceInputBlobState Empty = new ReferenceInputBlobState();

    /**
     * The authentication mode for the Stream Analytics Reference Input. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     * 
     */
    @Import(name="authenticationMode")
    private @Nullable Output<String> authenticationMode;

    /**
     * @return The authentication mode for the Stream Analytics Reference Input. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
     * 
     */
    public Optional<Output<String>> authenticationMode() {
        return Optional.ofNullable(this.authenticationMode);
    }

    /**
     * The date format. Wherever `{date}` appears in `path_pattern`, the value of this property is used as the date format instead.
     * 
     */
    @Import(name="dateFormat")
    private @Nullable Output<String> dateFormat;

    /**
     * @return The date format. Wherever `{date}` appears in `path_pattern`, the value of this property is used as the date format instead.
     * 
     */
    public Optional<Output<String>> dateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }

    /**
     * The name of the Reference Input Blob. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Reference Input Blob. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job.
     * 
     */
    @Import(name="pathPattern")
    private @Nullable Output<String> pathPattern;

    /**
     * @return The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job.
     * 
     */
    public Optional<Output<String>> pathPattern() {
        return Optional.ofNullable(this.pathPattern);
    }

    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A `serialization` block as defined below.
     * 
     */
    @Import(name="serialization")
    private @Nullable Output<ReferenceInputBlobSerializationArgs> serialization;

    /**
     * @return A `serialization` block as defined below.
     * 
     */
    public Optional<Output<ReferenceInputBlobSerializationArgs>> serialization() {
        return Optional.ofNullable(this.serialization);
    }

    /**
     * The Access Key which should be used to connect to this Storage Account.
     * 
     */
    @Import(name="storageAccountKey")
    private @Nullable Output<String> storageAccountKey;

    /**
     * @return The Access Key which should be used to connect to this Storage Account.
     * 
     */
    public Optional<Output<String>> storageAccountKey() {
        return Optional.ofNullable(this.storageAccountKey);
    }

    /**
     * The name of the Storage Account that has the blob container with reference data.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    /**
     * @return The name of the Storage Account that has the blob container with reference data.
     * 
     */
    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    /**
     * The name of the Container within the Storage Account.
     * 
     */
    @Import(name="storageContainerName")
    private @Nullable Output<String> storageContainerName;

    /**
     * @return The name of the Container within the Storage Account.
     * 
     */
    public Optional<Output<String>> storageContainerName() {
        return Optional.ofNullable(this.storageContainerName);
    }

    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobName")
    private @Nullable Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> streamAnalyticsJobName() {
        return Optional.ofNullable(this.streamAnalyticsJobName);
    }

    /**
     * The time format. Wherever `{time}` appears in `path_pattern`, the value of this property is used as the time format instead.
     * 
     */
    @Import(name="timeFormat")
    private @Nullable Output<String> timeFormat;

    /**
     * @return The time format. Wherever `{time}` appears in `path_pattern`, the value of this property is used as the time format instead.
     * 
     */
    public Optional<Output<String>> timeFormat() {
        return Optional.ofNullable(this.timeFormat);
    }

    private ReferenceInputBlobState() {}

    private ReferenceInputBlobState(ReferenceInputBlobState $) {
        this.authenticationMode = $.authenticationMode;
        this.dateFormat = $.dateFormat;
        this.name = $.name;
        this.pathPattern = $.pathPattern;
        this.resourceGroupName = $.resourceGroupName;
        this.serialization = $.serialization;
        this.storageAccountKey = $.storageAccountKey;
        this.storageAccountName = $.storageAccountName;
        this.storageContainerName = $.storageContainerName;
        this.streamAnalyticsJobName = $.streamAnalyticsJobName;
        this.timeFormat = $.timeFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReferenceInputBlobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReferenceInputBlobState $;

        public Builder() {
            $ = new ReferenceInputBlobState();
        }

        public Builder(ReferenceInputBlobState defaults) {
            $ = new ReferenceInputBlobState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationMode The authentication mode for the Stream Analytics Reference Input. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationMode(@Nullable Output<String> authenticationMode) {
            $.authenticationMode = authenticationMode;
            return this;
        }

        /**
         * @param authenticationMode The authentication mode for the Stream Analytics Reference Input. Possible values are `Msi` and `ConnectionString`. Defaults to `ConnectionString`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationMode(String authenticationMode) {
            return authenticationMode(Output.of(authenticationMode));
        }

        /**
         * @param dateFormat The date format. Wherever `{date}` appears in `path_pattern`, the value of this property is used as the date format instead.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(@Nullable Output<String> dateFormat) {
            $.dateFormat = dateFormat;
            return this;
        }

        /**
         * @param dateFormat The date format. Wherever `{date}` appears in `path_pattern`, the value of this property is used as the date format instead.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(String dateFormat) {
            return dateFormat(Output.of(dateFormat));
        }

        /**
         * @param name The name of the Reference Input Blob. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Reference Input Blob. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pathPattern The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job.
         * 
         * @return builder
         * 
         */
        public Builder pathPattern(@Nullable Output<String> pathPattern) {
            $.pathPattern = pathPattern;
            return this;
        }

        /**
         * @param pathPattern The blob path pattern. Not a regular expression. It represents a pattern against which blob names will be matched to determine whether or not they should be included as input or output to the job.
         * 
         * @return builder
         * 
         */
        public Builder pathPattern(String pathPattern) {
            return pathPattern(Output.of(pathPattern));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serialization A `serialization` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serialization(@Nullable Output<ReferenceInputBlobSerializationArgs> serialization) {
            $.serialization = serialization;
            return this;
        }

        /**
         * @param serialization A `serialization` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serialization(ReferenceInputBlobSerializationArgs serialization) {
            return serialization(Output.of(serialization));
        }

        /**
         * @param storageAccountKey The Access Key which should be used to connect to this Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(@Nullable Output<String> storageAccountKey) {
            $.storageAccountKey = storageAccountKey;
            return this;
        }

        /**
         * @param storageAccountKey The Access Key which should be used to connect to this Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(String storageAccountKey) {
            return storageAccountKey(Output.of(storageAccountKey));
        }

        /**
         * @param storageAccountName The name of the Storage Account that has the blob container with reference data.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The name of the Storage Account that has the blob container with reference data.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        /**
         * @param storageContainerName The name of the Container within the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerName(@Nullable Output<String> storageContainerName) {
            $.storageContainerName = storageContainerName;
            return this;
        }

        /**
         * @param storageContainerName The name of the Container within the Storage Account.
         * 
         * @return builder
         * 
         */
        public Builder storageContainerName(String storageContainerName) {
            return storageContainerName(Output.of(storageContainerName));
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(@Nullable Output<String> streamAnalyticsJobName) {
            $.streamAnalyticsJobName = streamAnalyticsJobName;
            return this;
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(String streamAnalyticsJobName) {
            return streamAnalyticsJobName(Output.of(streamAnalyticsJobName));
        }

        /**
         * @param timeFormat The time format. Wherever `{time}` appears in `path_pattern`, the value of this property is used as the time format instead.
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(@Nullable Output<String> timeFormat) {
            $.timeFormat = timeFormat;
            return this;
        }

        /**
         * @param timeFormat The time format. Wherever `{time}` appears in `path_pattern`, the value of this property is used as the time format instead.
         * 
         * @return builder
         * 
         */
        public Builder timeFormat(String timeFormat) {
            return timeFormat(Output.of(timeFormat));
        }

        public ReferenceInputBlobState build() {
            return $;
        }
    }

}