// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotLogsHttpLogsAzureBlobStorage;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotLogsHttpLogsFileSystem;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSlotLogsHttpLogs {
    /**
     * @return A `azure_blob_storage` block as defined above.
     * 
     */
    private @Nullable WindowsWebAppSlotLogsHttpLogsAzureBlobStorage azureBlobStorage;
    /**
     * @return A `file_system` block as defined above.
     * 
     */
    private @Nullable WindowsWebAppSlotLogsHttpLogsFileSystem fileSystem;

    private WindowsWebAppSlotLogsHttpLogs() {}
    /**
     * @return A `azure_blob_storage` block as defined above.
     * 
     */
    public Optional<WindowsWebAppSlotLogsHttpLogsAzureBlobStorage> azureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }
    /**
     * @return A `file_system` block as defined above.
     * 
     */
    public Optional<WindowsWebAppSlotLogsHttpLogsFileSystem> fileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotLogsHttpLogs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WindowsWebAppSlotLogsHttpLogsAzureBlobStorage azureBlobStorage;
        private @Nullable WindowsWebAppSlotLogsHttpLogsFileSystem fileSystem;
        public Builder() {}
        public Builder(WindowsWebAppSlotLogsHttpLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.fileSystem = defaults.fileSystem;
        }

        @CustomType.Setter
        public Builder azureBlobStorage(@Nullable WindowsWebAppSlotLogsHttpLogsAzureBlobStorage azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }
        @CustomType.Setter
        public Builder fileSystem(@Nullable WindowsWebAppSlotLogsHttpLogsFileSystem fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public WindowsWebAppSlotLogsHttpLogs build() {
            final var o = new WindowsWebAppSlotLogsHttpLogs();
            o.azureBlobStorage = azureBlobStorage;
            o.fileSystem = fileSystem;
            return o;
        }
    }
}