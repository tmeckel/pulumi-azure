// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs Empty = new WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs();

    /**
     * The time in days after which to remove blobs. A value of `0` means no retention.
     * 
     */
    @Import(name="retentionInDays")
    private @Nullable Output<Integer> retentionInDays;

    /**
     * @return The time in days after which to remove blobs. A value of `0` means no retention.
     * 
     */
    public Optional<Output<Integer>> retentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }

    /**
     * SAS url to an Azure blob container with read/write/list/delete permissions.
     * 
     */
    @Import(name="sasUrl", required=true)
    private Output<String> sasUrl;

    /**
     * @return SAS url to an Azure blob container with read/write/list/delete permissions.
     * 
     */
    public Output<String> sasUrl() {
        return this.sasUrl;
    }

    private WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs() {}

    private WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs(WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs $) {
        this.retentionInDays = $.retentionInDays;
        this.sasUrl = $.sasUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs $;

        public Builder() {
            $ = new WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs();
        }

        public Builder(WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs defaults) {
            $ = new WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param retentionInDays The time in days after which to remove blobs. A value of `0` means no retention.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(@Nullable Output<Integer> retentionInDays) {
            $.retentionInDays = retentionInDays;
            return this;
        }

        /**
         * @param retentionInDays The time in days after which to remove blobs. A value of `0` means no retention.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(Integer retentionInDays) {
            return retentionInDays(Output.of(retentionInDays));
        }

        /**
         * @param sasUrl SAS url to an Azure blob container with read/write/list/delete permissions.
         * 
         * @return builder
         * 
         */
        public Builder sasUrl(Output<String> sasUrl) {
            $.sasUrl = sasUrl;
            return this;
        }

        /**
         * @param sasUrl SAS url to an Azure blob container with read/write/list/delete permissions.
         * 
         * @return builder
         * 
         */
        public Builder sasUrl(String sasUrl) {
            return sasUrl(Output.of(sasUrl));
        }

        public WindowsWebAppSlotLogsHttpLogsAzureBlobStorageArgs build() {
            $.sasUrl = Objects.requireNonNull($.sasUrl, "expected parameter 'sasUrl' to be non-null");
            return $;
        }
    }

}