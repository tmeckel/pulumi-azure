// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PoolMountCifsMount {
    /**
     * @return Additional command line options to pass to the mount command. These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    private @Nullable String mountOptions;
    /**
     * @return The password to use for authentication against the CIFS file system.
     * 
     */
    private String password;
    /**
     * @return The relative path on compute node where the file system will be mounted All file systems are mounted relative to the Batch mounts directory, accessible via the `AZ_BATCH_NODE_MOUNTS_DIR` environment variable.
     * 
     */
    private String relativeMountPath;
    /**
     * @return The URI of the file system to mount.
     * 
     */
    private String source;
    /**
     * @return The user to use for authentication against the CIFS file system.
     * 
     */
    private String userName;

    private PoolMountCifsMount() {}
    /**
     * @return Additional command line options to pass to the mount command. These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    public Optional<String> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }
    /**
     * @return The password to use for authentication against the CIFS file system.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The relative path on compute node where the file system will be mounted All file systems are mounted relative to the Batch mounts directory, accessible via the `AZ_BATCH_NODE_MOUNTS_DIR` environment variable.
     * 
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }
    /**
     * @return The URI of the file system to mount.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return The user to use for authentication against the CIFS file system.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolMountCifsMount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mountOptions;
        private String password;
        private String relativeMountPath;
        private String source;
        private String userName;
        public Builder() {}
        public Builder(PoolMountCifsMount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountOptions = defaults.mountOptions;
    	      this.password = defaults.password;
    	      this.relativeMountPath = defaults.relativeMountPath;
    	      this.source = defaults.source;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder mountOptions(@Nullable String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder relativeMountPath(String relativeMountPath) {
            this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public PoolMountCifsMount build() {
            final var o = new PoolMountCifsMount();
            o.mountOptions = mountOptions;
            o.password = password;
            o.relativeMountPath = relativeMountPath;
            o.source = source;
            o.userName = userName;
            return o;
        }
    }
}