// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppLogsHttpLogsAzureBlobStorage;
import com.pulumi.azure.appservice.outputs.WindowsWebAppLogsHttpLogsFileSystem;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppLogsHttpLogs {
    /**
     * @return A `azure_blob_storage` block as defined above.
     * 
     */
    private @Nullable WindowsWebAppLogsHttpLogsAzureBlobStorage azureBlobStorage;
    /**
     * @return A `file_system` block as defined above.
     * 
     */
    private @Nullable WindowsWebAppLogsHttpLogsFileSystem fileSystem;

    private WindowsWebAppLogsHttpLogs() {}
    /**
     * @return A `azure_blob_storage` block as defined above.
     * 
     */
    public Optional<WindowsWebAppLogsHttpLogsAzureBlobStorage> azureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }
    /**
     * @return A `file_system` block as defined above.
     * 
     */
    public Optional<WindowsWebAppLogsHttpLogsFileSystem> fileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppLogsHttpLogs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WindowsWebAppLogsHttpLogsAzureBlobStorage azureBlobStorage;
        private @Nullable WindowsWebAppLogsHttpLogsFileSystem fileSystem;
        public Builder() {}
        public Builder(WindowsWebAppLogsHttpLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.fileSystem = defaults.fileSystem;
        }

        @CustomType.Setter
        public Builder azureBlobStorage(@Nullable WindowsWebAppLogsHttpLogsAzureBlobStorage azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }
        @CustomType.Setter
        public Builder fileSystem(@Nullable WindowsWebAppLogsHttpLogsFileSystem fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public WindowsWebAppLogsHttpLogs build() {
            final var o = new WindowsWebAppLogsHttpLogs();
            o.azureBlobStorage = azureBlobStorage;
            o.fileSystem = fileSystem;
            return o;
        }
    }
}