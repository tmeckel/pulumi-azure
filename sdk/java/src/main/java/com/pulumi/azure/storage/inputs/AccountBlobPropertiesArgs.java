// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.azure.storage.inputs.AccountBlobPropertiesContainerDeleteRetentionPolicyArgs;
import com.pulumi.azure.storage.inputs.AccountBlobPropertiesCorsRuleArgs;
import com.pulumi.azure.storage.inputs.AccountBlobPropertiesDeleteRetentionPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountBlobPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountBlobPropertiesArgs Empty = new AccountBlobPropertiesArgs();

    /**
     * Is the blob service properties for change feed events enabled? Default to `false`.
     * 
     */
    @Import(name="changeFeedEnabled")
    private @Nullable Output<Boolean> changeFeedEnabled;

    /**
     * @return Is the blob service properties for change feed events enabled? Default to `false`.
     * 
     */
    public Optional<Output<Boolean>> changeFeedEnabled() {
        return Optional.ofNullable(this.changeFeedEnabled);
    }

    /**
     * The duration of change feed events retention in days. The possible values are between 1 and 146000 days (400 years). Setting this to null (or omit this in the configuration file) indicates an infinite retention of the change feed.
     * 
     */
    @Import(name="changeFeedRetentionInDays")
    private @Nullable Output<Integer> changeFeedRetentionInDays;

    /**
     * @return The duration of change feed events retention in days. The possible values are between 1 and 146000 days (400 years). Setting this to null (or omit this in the configuration file) indicates an infinite retention of the change feed.
     * 
     */
    public Optional<Output<Integer>> changeFeedRetentionInDays() {
        return Optional.ofNullable(this.changeFeedRetentionInDays);
    }

    /**
     * A `container_delete_retention_policy` block as defined below.
     * 
     */
    @Import(name="containerDeleteRetentionPolicy")
    private @Nullable Output<AccountBlobPropertiesContainerDeleteRetentionPolicyArgs> containerDeleteRetentionPolicy;

    /**
     * @return A `container_delete_retention_policy` block as defined below.
     * 
     */
    public Optional<Output<AccountBlobPropertiesContainerDeleteRetentionPolicyArgs>> containerDeleteRetentionPolicy() {
        return Optional.ofNullable(this.containerDeleteRetentionPolicy);
    }

    /**
     * A `cors_rule` block as defined below.
     * 
     */
    @Import(name="corsRules")
    private @Nullable Output<List<AccountBlobPropertiesCorsRuleArgs>> corsRules;

    /**
     * @return A `cors_rule` block as defined below.
     * 
     */
    public Optional<Output<List<AccountBlobPropertiesCorsRuleArgs>>> corsRules() {
        return Optional.ofNullable(this.corsRules);
    }

    /**
     * The API Version which should be used by default for requests to the Data Plane API if an incoming request doesn&#39;t specify an API Version. Defaults to `2020-06-12`.
     * 
     */
    @Import(name="defaultServiceVersion")
    private @Nullable Output<String> defaultServiceVersion;

    /**
     * @return The API Version which should be used by default for requests to the Data Plane API if an incoming request doesn&#39;t specify an API Version. Defaults to `2020-06-12`.
     * 
     */
    public Optional<Output<String>> defaultServiceVersion() {
        return Optional.ofNullable(this.defaultServiceVersion);
    }

    /**
     * A `delete_retention_policy` block as defined below.
     * 
     */
    @Import(name="deleteRetentionPolicy")
    private @Nullable Output<AccountBlobPropertiesDeleteRetentionPolicyArgs> deleteRetentionPolicy;

    /**
     * @return A `delete_retention_policy` block as defined below.
     * 
     */
    public Optional<Output<AccountBlobPropertiesDeleteRetentionPolicyArgs>> deleteRetentionPolicy() {
        return Optional.ofNullable(this.deleteRetentionPolicy);
    }

    /**
     * Is the last access time based tracking enabled? Default to `false`.
     * 
     */
    @Import(name="lastAccessTimeEnabled")
    private @Nullable Output<Boolean> lastAccessTimeEnabled;

    /**
     * @return Is the last access time based tracking enabled? Default to `false`.
     * 
     */
    public Optional<Output<Boolean>> lastAccessTimeEnabled() {
        return Optional.ofNullable(this.lastAccessTimeEnabled);
    }

    /**
     * Is versioning enabled? Default to `false`.
     * 
     */
    @Import(name="versioningEnabled")
    private @Nullable Output<Boolean> versioningEnabled;

    /**
     * @return Is versioning enabled? Default to `false`.
     * 
     */
    public Optional<Output<Boolean>> versioningEnabled() {
        return Optional.ofNullable(this.versioningEnabled);
    }

    private AccountBlobPropertiesArgs() {}

    private AccountBlobPropertiesArgs(AccountBlobPropertiesArgs $) {
        this.changeFeedEnabled = $.changeFeedEnabled;
        this.changeFeedRetentionInDays = $.changeFeedRetentionInDays;
        this.containerDeleteRetentionPolicy = $.containerDeleteRetentionPolicy;
        this.corsRules = $.corsRules;
        this.defaultServiceVersion = $.defaultServiceVersion;
        this.deleteRetentionPolicy = $.deleteRetentionPolicy;
        this.lastAccessTimeEnabled = $.lastAccessTimeEnabled;
        this.versioningEnabled = $.versioningEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountBlobPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountBlobPropertiesArgs $;

        public Builder() {
            $ = new AccountBlobPropertiesArgs();
        }

        public Builder(AccountBlobPropertiesArgs defaults) {
            $ = new AccountBlobPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param changeFeedEnabled Is the blob service properties for change feed events enabled? Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder changeFeedEnabled(@Nullable Output<Boolean> changeFeedEnabled) {
            $.changeFeedEnabled = changeFeedEnabled;
            return this;
        }

        /**
         * @param changeFeedEnabled Is the blob service properties for change feed events enabled? Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder changeFeedEnabled(Boolean changeFeedEnabled) {
            return changeFeedEnabled(Output.of(changeFeedEnabled));
        }

        /**
         * @param changeFeedRetentionInDays The duration of change feed events retention in days. The possible values are between 1 and 146000 days (400 years). Setting this to null (or omit this in the configuration file) indicates an infinite retention of the change feed.
         * 
         * @return builder
         * 
         */
        public Builder changeFeedRetentionInDays(@Nullable Output<Integer> changeFeedRetentionInDays) {
            $.changeFeedRetentionInDays = changeFeedRetentionInDays;
            return this;
        }

        /**
         * @param changeFeedRetentionInDays The duration of change feed events retention in days. The possible values are between 1 and 146000 days (400 years). Setting this to null (or omit this in the configuration file) indicates an infinite retention of the change feed.
         * 
         * @return builder
         * 
         */
        public Builder changeFeedRetentionInDays(Integer changeFeedRetentionInDays) {
            return changeFeedRetentionInDays(Output.of(changeFeedRetentionInDays));
        }

        /**
         * @param containerDeleteRetentionPolicy A `container_delete_retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder containerDeleteRetentionPolicy(@Nullable Output<AccountBlobPropertiesContainerDeleteRetentionPolicyArgs> containerDeleteRetentionPolicy) {
            $.containerDeleteRetentionPolicy = containerDeleteRetentionPolicy;
            return this;
        }

        /**
         * @param containerDeleteRetentionPolicy A `container_delete_retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder containerDeleteRetentionPolicy(AccountBlobPropertiesContainerDeleteRetentionPolicyArgs containerDeleteRetentionPolicy) {
            return containerDeleteRetentionPolicy(Output.of(containerDeleteRetentionPolicy));
        }

        /**
         * @param corsRules A `cors_rule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(@Nullable Output<List<AccountBlobPropertiesCorsRuleArgs>> corsRules) {
            $.corsRules = corsRules;
            return this;
        }

        /**
         * @param corsRules A `cors_rule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(List<AccountBlobPropertiesCorsRuleArgs> corsRules) {
            return corsRules(Output.of(corsRules));
        }

        /**
         * @param corsRules A `cors_rule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(AccountBlobPropertiesCorsRuleArgs... corsRules) {
            return corsRules(List.of(corsRules));
        }

        /**
         * @param defaultServiceVersion The API Version which should be used by default for requests to the Data Plane API if an incoming request doesn&#39;t specify an API Version. Defaults to `2020-06-12`.
         * 
         * @return builder
         * 
         */
        public Builder defaultServiceVersion(@Nullable Output<String> defaultServiceVersion) {
            $.defaultServiceVersion = defaultServiceVersion;
            return this;
        }

        /**
         * @param defaultServiceVersion The API Version which should be used by default for requests to the Data Plane API if an incoming request doesn&#39;t specify an API Version. Defaults to `2020-06-12`.
         * 
         * @return builder
         * 
         */
        public Builder defaultServiceVersion(String defaultServiceVersion) {
            return defaultServiceVersion(Output.of(defaultServiceVersion));
        }

        /**
         * @param deleteRetentionPolicy A `delete_retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deleteRetentionPolicy(@Nullable Output<AccountBlobPropertiesDeleteRetentionPolicyArgs> deleteRetentionPolicy) {
            $.deleteRetentionPolicy = deleteRetentionPolicy;
            return this;
        }

        /**
         * @param deleteRetentionPolicy A `delete_retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder deleteRetentionPolicy(AccountBlobPropertiesDeleteRetentionPolicyArgs deleteRetentionPolicy) {
            return deleteRetentionPolicy(Output.of(deleteRetentionPolicy));
        }

        /**
         * @param lastAccessTimeEnabled Is the last access time based tracking enabled? Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder lastAccessTimeEnabled(@Nullable Output<Boolean> lastAccessTimeEnabled) {
            $.lastAccessTimeEnabled = lastAccessTimeEnabled;
            return this;
        }

        /**
         * @param lastAccessTimeEnabled Is the last access time based tracking enabled? Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder lastAccessTimeEnabled(Boolean lastAccessTimeEnabled) {
            return lastAccessTimeEnabled(Output.of(lastAccessTimeEnabled));
        }

        /**
         * @param versioningEnabled Is versioning enabled? Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder versioningEnabled(@Nullable Output<Boolean> versioningEnabled) {
            $.versioningEnabled = versioningEnabled;
            return this;
        }

        /**
         * @param versioningEnabled Is versioning enabled? Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder versioningEnabled(Boolean versioningEnabled) {
            return versioningEnabled(Output.of(versioningEnabled));
        }

        public AccountBlobPropertiesArgs build() {
            return $;
        }
    }

}