// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SparkClusterMetastoresOozieArgs extends com.pulumi.resources.ResourceArgs {

    public static final SparkClusterMetastoresOozieArgs Empty = new SparkClusterMetastoresOozieArgs();

    /**
     * The external Oozie metastore&#39;s existing SQL database.  Changing this forces a new resource to be created.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The external Oozie metastore&#39;s existing SQL database.  Changing this forces a new resource to be created.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The external Oozie metastore&#39;s existing SQL server admin password.  Changing this forces a new resource to be created.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The external Oozie metastore&#39;s existing SQL server admin password.  Changing this forces a new resource to be created.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The fully-qualified domain name (FQDN) of the SQL server to use for the external Oozie metastore.  Changing this forces a new resource to be created.
     * 
     */
    @Import(name="server", required=true)
    private Output<String> server;

    /**
     * @return The fully-qualified domain name (FQDN) of the SQL server to use for the external Oozie metastore.  Changing this forces a new resource to be created.
     * 
     */
    public Output<String> server() {
        return this.server;
    }

    /**
     * The external Oozie metastore&#39;s existing SQL server admin username.  Changing this forces a new resource to be created.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The external Oozie metastore&#39;s existing SQL server admin username.  Changing this forces a new resource to be created.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private SparkClusterMetastoresOozieArgs() {}

    private SparkClusterMetastoresOozieArgs(SparkClusterMetastoresOozieArgs $) {
        this.databaseName = $.databaseName;
        this.password = $.password;
        this.server = $.server;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkClusterMetastoresOozieArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkClusterMetastoresOozieArgs $;

        public Builder() {
            $ = new SparkClusterMetastoresOozieArgs();
        }

        public Builder(SparkClusterMetastoresOozieArgs defaults) {
            $ = new SparkClusterMetastoresOozieArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The external Oozie metastore&#39;s existing SQL database.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The external Oozie metastore&#39;s existing SQL database.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param password The external Oozie metastore&#39;s existing SQL server admin password.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The external Oozie metastore&#39;s existing SQL server admin password.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param server The fully-qualified domain name (FQDN) of the SQL server to use for the external Oozie metastore.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder server(Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server The fully-qualified domain name (FQDN) of the SQL server to use for the external Oozie metastore.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        /**
         * @param username The external Oozie metastore&#39;s existing SQL server admin username.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The external Oozie metastore&#39;s existing SQL server admin username.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public SparkClusterMetastoresOozieArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}