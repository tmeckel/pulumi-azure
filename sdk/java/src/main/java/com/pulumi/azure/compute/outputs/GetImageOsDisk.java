// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImageOsDisk {
    /**
     * @return the URI in Azure storage of the blob used to create the image.
     * 
     */
    private String blobUri;
    /**
     * @return the caching mode for the Data Disk, such as `ReadWrite`, `ReadOnly`, or `None`.
     * 
     */
    private String caching;
    /**
     * @return the ID of the Managed Disk used as the Data Disk Image.
     * 
     */
    private String managedDiskId;
    /**
     * @return the State of the OS used in the Image, such as `Generalized`.
     * 
     */
    private String osState;
    /**
     * @return the type of Operating System used on the OS Disk. such as `Linux` or `Windows`.
     * 
     */
    private String osType;
    /**
     * @return the size of this Data Disk in GB.
     * 
     */
    private Integer sizeGb;

    private GetImageOsDisk() {}
    /**
     * @return the URI in Azure storage of the blob used to create the image.
     * 
     */
    public String blobUri() {
        return this.blobUri;
    }
    /**
     * @return the caching mode for the Data Disk, such as `ReadWrite`, `ReadOnly`, or `None`.
     * 
     */
    public String caching() {
        return this.caching;
    }
    /**
     * @return the ID of the Managed Disk used as the Data Disk Image.
     * 
     */
    public String managedDiskId() {
        return this.managedDiskId;
    }
    /**
     * @return the State of the OS used in the Image, such as `Generalized`.
     * 
     */
    public String osState() {
        return this.osState;
    }
    /**
     * @return the type of Operating System used on the OS Disk. such as `Linux` or `Windows`.
     * 
     */
    public String osType() {
        return this.osType;
    }
    /**
     * @return the size of this Data Disk in GB.
     * 
     */
    public Integer sizeGb() {
        return this.sizeGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageOsDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String blobUri;
        private String caching;
        private String managedDiskId;
        private String osState;
        private String osType;
        private Integer sizeGb;
        public Builder() {}
        public Builder(GetImageOsDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUri = defaults.blobUri;
    	      this.caching = defaults.caching;
    	      this.managedDiskId = defaults.managedDiskId;
    	      this.osState = defaults.osState;
    	      this.osType = defaults.osType;
    	      this.sizeGb = defaults.sizeGb;
        }

        @CustomType.Setter
        public Builder blobUri(String blobUri) {
            this.blobUri = Objects.requireNonNull(blobUri);
            return this;
        }
        @CustomType.Setter
        public Builder caching(String caching) {
            this.caching = Objects.requireNonNull(caching);
            return this;
        }
        @CustomType.Setter
        public Builder managedDiskId(String managedDiskId) {
            this.managedDiskId = Objects.requireNonNull(managedDiskId);
            return this;
        }
        @CustomType.Setter
        public Builder osState(String osState) {
            this.osState = Objects.requireNonNull(osState);
            return this;
        }
        @CustomType.Setter
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        @CustomType.Setter
        public Builder sizeGb(Integer sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }
        public GetImageOsDisk build() {
            final var o = new GetImageOsDisk();
            o.blobUri = blobUri;
            o.caching = caching;
            o.managedDiskId = managedDiskId;
            o.osState = osState;
            o.osType = osType;
            o.sizeGb = sizeGb;
            return o;
        }
    }
}