// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectReplicationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectReplicationRuleArgs Empty = new ObjectReplicationRuleArgs();

    /**
     * The time after which the Block Blobs created will be copies to the destination. Possible values are `OnlyNewObjects`, `Everything` and time in RFC3339 format: `2006-01-02T15:04:00Z`.
     * 
     */
    @Import(name="copyBlobsCreatedAfter")
    private @Nullable Output<String> copyBlobsCreatedAfter;

    /**
     * @return The time after which the Block Blobs created will be copies to the destination. Possible values are `OnlyNewObjects`, `Everything` and time in RFC3339 format: `2006-01-02T15:04:00Z`.
     * 
     */
    public Optional<Output<String>> copyBlobsCreatedAfter() {
        return Optional.ofNullable(this.copyBlobsCreatedAfter);
    }

    /**
     * The destination storage container name. Changing this forces a new Storage Object Replication to be created.
     * 
     */
    @Import(name="destinationContainerName", required=true)
    private Output<String> destinationContainerName;

    /**
     * @return The destination storage container name. Changing this forces a new Storage Object Replication to be created.
     * 
     */
    public Output<String> destinationContainerName() {
        return this.destinationContainerName;
    }

    /**
     * Specifies a list of filters prefixes, the blobs whose names begin with which will be replicated.
     * 
     */
    @Import(name="filterOutBlobsWithPrefixes")
    private @Nullable Output<List<String>> filterOutBlobsWithPrefixes;

    /**
     * @return Specifies a list of filters prefixes, the blobs whose names begin with which will be replicated.
     * 
     */
    public Optional<Output<List<String>>> filterOutBlobsWithPrefixes() {
        return Optional.ofNullable(this.filterOutBlobsWithPrefixes);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The source storage container name. Changing this forces a new Storage Object Replication to be created.
     * 
     */
    @Import(name="sourceContainerName", required=true)
    private Output<String> sourceContainerName;

    /**
     * @return The source storage container name. Changing this forces a new Storage Object Replication to be created.
     * 
     */
    public Output<String> sourceContainerName() {
        return this.sourceContainerName;
    }

    private ObjectReplicationRuleArgs() {}

    private ObjectReplicationRuleArgs(ObjectReplicationRuleArgs $) {
        this.copyBlobsCreatedAfter = $.copyBlobsCreatedAfter;
        this.destinationContainerName = $.destinationContainerName;
        this.filterOutBlobsWithPrefixes = $.filterOutBlobsWithPrefixes;
        this.name = $.name;
        this.sourceContainerName = $.sourceContainerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectReplicationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectReplicationRuleArgs $;

        public Builder() {
            $ = new ObjectReplicationRuleArgs();
        }

        public Builder(ObjectReplicationRuleArgs defaults) {
            $ = new ObjectReplicationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param copyBlobsCreatedAfter The time after which the Block Blobs created will be copies to the destination. Possible values are `OnlyNewObjects`, `Everything` and time in RFC3339 format: `2006-01-02T15:04:00Z`.
         * 
         * @return builder
         * 
         */
        public Builder copyBlobsCreatedAfter(@Nullable Output<String> copyBlobsCreatedAfter) {
            $.copyBlobsCreatedAfter = copyBlobsCreatedAfter;
            return this;
        }

        /**
         * @param copyBlobsCreatedAfter The time after which the Block Blobs created will be copies to the destination. Possible values are `OnlyNewObjects`, `Everything` and time in RFC3339 format: `2006-01-02T15:04:00Z`.
         * 
         * @return builder
         * 
         */
        public Builder copyBlobsCreatedAfter(String copyBlobsCreatedAfter) {
            return copyBlobsCreatedAfter(Output.of(copyBlobsCreatedAfter));
        }

        /**
         * @param destinationContainerName The destination storage container name. Changing this forces a new Storage Object Replication to be created.
         * 
         * @return builder
         * 
         */
        public Builder destinationContainerName(Output<String> destinationContainerName) {
            $.destinationContainerName = destinationContainerName;
            return this;
        }

        /**
         * @param destinationContainerName The destination storage container name. Changing this forces a new Storage Object Replication to be created.
         * 
         * @return builder
         * 
         */
        public Builder destinationContainerName(String destinationContainerName) {
            return destinationContainerName(Output.of(destinationContainerName));
        }

        /**
         * @param filterOutBlobsWithPrefixes Specifies a list of filters prefixes, the blobs whose names begin with which will be replicated.
         * 
         * @return builder
         * 
         */
        public Builder filterOutBlobsWithPrefixes(@Nullable Output<List<String>> filterOutBlobsWithPrefixes) {
            $.filterOutBlobsWithPrefixes = filterOutBlobsWithPrefixes;
            return this;
        }

        /**
         * @param filterOutBlobsWithPrefixes Specifies a list of filters prefixes, the blobs whose names begin with which will be replicated.
         * 
         * @return builder
         * 
         */
        public Builder filterOutBlobsWithPrefixes(List<String> filterOutBlobsWithPrefixes) {
            return filterOutBlobsWithPrefixes(Output.of(filterOutBlobsWithPrefixes));
        }

        /**
         * @param filterOutBlobsWithPrefixes Specifies a list of filters prefixes, the blobs whose names begin with which will be replicated.
         * 
         * @return builder
         * 
         */
        public Builder filterOutBlobsWithPrefixes(String... filterOutBlobsWithPrefixes) {
            return filterOutBlobsWithPrefixes(List.of(filterOutBlobsWithPrefixes));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sourceContainerName The source storage container name. Changing this forces a new Storage Object Replication to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceContainerName(Output<String> sourceContainerName) {
            $.sourceContainerName = sourceContainerName;
            return this;
        }

        /**
         * @param sourceContainerName The source storage container name. Changing this forces a new Storage Object Replication to be created.
         * 
         * @return builder
         * 
         */
        public Builder sourceContainerName(String sourceContainerName) {
            return sourceContainerName(Output.of(sourceContainerName));
        }

        public ObjectReplicationRuleArgs build() {
            $.destinationContainerName = Objects.requireNonNull($.destinationContainerName, "expected parameter 'destinationContainerName' to be non-null");
            $.sourceContainerName = Objects.requireNonNull($.sourceContainerName, "expected parameter 'sourceContainerName' to be non-null");
            return $;
        }
    }

}