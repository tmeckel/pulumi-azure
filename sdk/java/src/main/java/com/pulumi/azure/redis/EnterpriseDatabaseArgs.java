// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.redis;

import com.pulumi.azure.redis.inputs.EnterpriseDatabaseModuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnterpriseDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnterpriseDatabaseArgs Empty = new EnterpriseDatabaseArgs();

    /**
     * Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Default is TLS-encrypted. Possible values are `Encrypted` and `Plaintext`. Defaults to `Encrypted`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Import(name="clientProtocol")
    private @Nullable Output<String> clientProtocol;

    /**
     * @return Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Default is TLS-encrypted. Possible values are `Encrypted` and `Plaintext`. Defaults to `Encrypted`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Optional<Output<String>> clientProtocol() {
        return Optional.ofNullable(this.clientProtocol);
    }

    /**
     * The resource id of the Redis Enterprise Cluster to deploy this Redis Enterprise Database. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The resource id of the Redis Enterprise Cluster to deploy this Redis Enterprise Database. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * Clustering policy - default is OSSCluster. Specified at create time. Possible values are `EnterpriseCluster` and `OSSCluster`. Defaults to `OSSCluster`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Import(name="clusteringPolicy")
    private @Nullable Output<String> clusteringPolicy;

    /**
     * @return Clustering policy - default is OSSCluster. Specified at create time. Possible values are `EnterpriseCluster` and `OSSCluster`. Defaults to `OSSCluster`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Optional<Output<String>> clusteringPolicy() {
        return Optional.ofNullable(this.clusteringPolicy);
    }

    /**
     * Redis eviction policy - default is `VolatileLRU`. Possible values are `AllKeysLFU`, `AllKeysLRU`, `AllKeysRandom`, `VolatileLRU`, `VolatileLFU`, `VolatileTTL`, `VolatileRandom` and `NoEviction`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Import(name="evictionPolicy")
    private @Nullable Output<String> evictionPolicy;

    /**
     * @return Redis eviction policy - default is `VolatileLRU`. Possible values are `AllKeysLFU`, `AllKeysLRU`, `AllKeysRandom`, `VolatileLRU`, `VolatileLFU`, `VolatileTTL`, `VolatileRandom` and `NoEviction`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Optional<Output<String>> evictionPolicy() {
        return Optional.ofNullable(this.evictionPolicy);
    }

    /**
     * Nickname of the group of linked databases. Changing this force a new Redis Enterprise Geo Database to be created.
     * 
     */
    @Import(name="linkedDatabaseGroupNickname")
    private @Nullable Output<String> linkedDatabaseGroupNickname;

    /**
     * @return Nickname of the group of linked databases. Changing this force a new Redis Enterprise Geo Database to be created.
     * 
     */
    public Optional<Output<String>> linkedDatabaseGroupNickname() {
        return Optional.ofNullable(this.linkedDatabaseGroupNickname);
    }

    /**
     * A list of database resources to link with this database with a maximum of 5.
     * 
     */
    @Import(name="linkedDatabaseIds")
    private @Nullable Output<List<String>> linkedDatabaseIds;

    /**
     * @return A list of database resources to link with this database with a maximum of 5.
     * 
     */
    public Optional<Output<List<String>>> linkedDatabaseIds() {
        return Optional.ofNullable(this.linkedDatabaseIds);
    }

    /**
     * A `module` block as defined below.
     * 
     */
    @Import(name="modules")
    private @Nullable Output<List<EnterpriseDatabaseModuleArgs>> modules;

    /**
     * @return A `module` block as defined below.
     * 
     */
    public Optional<Output<List<EnterpriseDatabaseModuleArgs>>> modules() {
        return Optional.ofNullable(this.modules);
    }

    /**
     * The name which should be used for this Redis Enterprise Database. Currently the acceptable value for this argument is `default`. Defaults to `default`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Redis Enterprise Database. Currently the acceptable value for this argument is `default`. Defaults to `default`. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * TCP port of the database endpoint. Specified at create time. Defaults to an available port. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return TCP port of the database endpoint. Specified at create time. Defaults to an available port. Changing this forces a new Redis Enterprise Database to be created.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The name of the Resource Group where the Redis Enterprise Database should exist. Changing this forces a new Redis Enterprise Database to be created.
     * 
     * @deprecated
     * This field is no longer used and will be removed in the next major version of the Azure Provider
     * 
     */
    @Deprecated /* This field is no longer used and will be removed in the next major version of the Azure Provider */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Redis Enterprise Database should exist. Changing this forces a new Redis Enterprise Database to be created.
     * 
     * @deprecated
     * This field is no longer used and will be removed in the next major version of the Azure Provider
     * 
     */
    @Deprecated /* This field is no longer used and will be removed in the next major version of the Azure Provider */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private EnterpriseDatabaseArgs() {}

    private EnterpriseDatabaseArgs(EnterpriseDatabaseArgs $) {
        this.clientProtocol = $.clientProtocol;
        this.clusterId = $.clusterId;
        this.clusteringPolicy = $.clusteringPolicy;
        this.evictionPolicy = $.evictionPolicy;
        this.linkedDatabaseGroupNickname = $.linkedDatabaseGroupNickname;
        this.linkedDatabaseIds = $.linkedDatabaseIds;
        this.modules = $.modules;
        this.name = $.name;
        this.port = $.port;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseDatabaseArgs $;

        public Builder() {
            $ = new EnterpriseDatabaseArgs();
        }

        public Builder(EnterpriseDatabaseArgs defaults) {
            $ = new EnterpriseDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientProtocol Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Default is TLS-encrypted. Possible values are `Encrypted` and `Plaintext`. Defaults to `Encrypted`. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder clientProtocol(@Nullable Output<String> clientProtocol) {
            $.clientProtocol = clientProtocol;
            return this;
        }

        /**
         * @param clientProtocol Specifies whether redis clients can connect using TLS-encrypted or plaintext redis protocols. Default is TLS-encrypted. Possible values are `Encrypted` and `Plaintext`. Defaults to `Encrypted`. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder clientProtocol(String clientProtocol) {
            return clientProtocol(Output.of(clientProtocol));
        }

        /**
         * @param clusterId The resource id of the Redis Enterprise Cluster to deploy this Redis Enterprise Database. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The resource id of the Redis Enterprise Cluster to deploy this Redis Enterprise Database. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param clusteringPolicy Clustering policy - default is OSSCluster. Specified at create time. Possible values are `EnterpriseCluster` and `OSSCluster`. Defaults to `OSSCluster`. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusteringPolicy(@Nullable Output<String> clusteringPolicy) {
            $.clusteringPolicy = clusteringPolicy;
            return this;
        }

        /**
         * @param clusteringPolicy Clustering policy - default is OSSCluster. Specified at create time. Possible values are `EnterpriseCluster` and `OSSCluster`. Defaults to `OSSCluster`. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusteringPolicy(String clusteringPolicy) {
            return clusteringPolicy(Output.of(clusteringPolicy));
        }

        /**
         * @param evictionPolicy Redis eviction policy - default is `VolatileLRU`. Possible values are `AllKeysLFU`, `AllKeysLRU`, `AllKeysRandom`, `VolatileLRU`, `VolatileLFU`, `VolatileTTL`, `VolatileRandom` and `NoEviction`. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder evictionPolicy(@Nullable Output<String> evictionPolicy) {
            $.evictionPolicy = evictionPolicy;
            return this;
        }

        /**
         * @param evictionPolicy Redis eviction policy - default is `VolatileLRU`. Possible values are `AllKeysLFU`, `AllKeysLRU`, `AllKeysRandom`, `VolatileLRU`, `VolatileLFU`, `VolatileTTL`, `VolatileRandom` and `NoEviction`. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder evictionPolicy(String evictionPolicy) {
            return evictionPolicy(Output.of(evictionPolicy));
        }

        /**
         * @param linkedDatabaseGroupNickname Nickname of the group of linked databases. Changing this force a new Redis Enterprise Geo Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedDatabaseGroupNickname(@Nullable Output<String> linkedDatabaseGroupNickname) {
            $.linkedDatabaseGroupNickname = linkedDatabaseGroupNickname;
            return this;
        }

        /**
         * @param linkedDatabaseGroupNickname Nickname of the group of linked databases. Changing this force a new Redis Enterprise Geo Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder linkedDatabaseGroupNickname(String linkedDatabaseGroupNickname) {
            return linkedDatabaseGroupNickname(Output.of(linkedDatabaseGroupNickname));
        }

        /**
         * @param linkedDatabaseIds A list of database resources to link with this database with a maximum of 5.
         * 
         * @return builder
         * 
         */
        public Builder linkedDatabaseIds(@Nullable Output<List<String>> linkedDatabaseIds) {
            $.linkedDatabaseIds = linkedDatabaseIds;
            return this;
        }

        /**
         * @param linkedDatabaseIds A list of database resources to link with this database with a maximum of 5.
         * 
         * @return builder
         * 
         */
        public Builder linkedDatabaseIds(List<String> linkedDatabaseIds) {
            return linkedDatabaseIds(Output.of(linkedDatabaseIds));
        }

        /**
         * @param linkedDatabaseIds A list of database resources to link with this database with a maximum of 5.
         * 
         * @return builder
         * 
         */
        public Builder linkedDatabaseIds(String... linkedDatabaseIds) {
            return linkedDatabaseIds(List.of(linkedDatabaseIds));
        }

        /**
         * @param modules A `module` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder modules(@Nullable Output<List<EnterpriseDatabaseModuleArgs>> modules) {
            $.modules = modules;
            return this;
        }

        /**
         * @param modules A `module` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder modules(List<EnterpriseDatabaseModuleArgs> modules) {
            return modules(Output.of(modules));
        }

        /**
         * @param modules A `module` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder modules(EnterpriseDatabaseModuleArgs... modules) {
            return modules(List.of(modules));
        }

        /**
         * @param name The name which should be used for this Redis Enterprise Database. Currently the acceptable value for this argument is `default`. Defaults to `default`. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Redis Enterprise Database. Currently the acceptable value for this argument is `default`. Defaults to `default`. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port TCP port of the database endpoint. Specified at create time. Defaults to an available port. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port TCP port of the database endpoint. Specified at create time. Defaults to an available port. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Redis Enterprise Database should exist. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer used and will be removed in the next major version of the Azure Provider
         * 
         */
        @Deprecated /* This field is no longer used and will be removed in the next major version of the Azure Provider */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Redis Enterprise Database should exist. Changing this forces a new Redis Enterprise Database to be created.
         * 
         * @return builder
         * 
         * @deprecated
         * This field is no longer used and will be removed in the next major version of the Azure Provider
         * 
         */
        @Deprecated /* This field is no longer used and will be removed in the next major version of the Azure Provider */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public EnterpriseDatabaseArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}