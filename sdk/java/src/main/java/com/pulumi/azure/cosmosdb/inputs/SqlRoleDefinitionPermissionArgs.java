// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SqlRoleDefinitionPermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlRoleDefinitionPermissionArgs Empty = new SqlRoleDefinitionPermissionArgs();

    /**
     * A list of data actions that are allowed for the Cosmos DB SQL Role Definition.
     * 
     */
    @Import(name="dataActions", required=true)
    private Output<List<String>> dataActions;

    /**
     * @return A list of data actions that are allowed for the Cosmos DB SQL Role Definition.
     * 
     */
    public Output<List<String>> dataActions() {
        return this.dataActions;
    }

    private SqlRoleDefinitionPermissionArgs() {}

    private SqlRoleDefinitionPermissionArgs(SqlRoleDefinitionPermissionArgs $) {
        this.dataActions = $.dataActions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlRoleDefinitionPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlRoleDefinitionPermissionArgs $;

        public Builder() {
            $ = new SqlRoleDefinitionPermissionArgs();
        }

        public Builder(SqlRoleDefinitionPermissionArgs defaults) {
            $ = new SqlRoleDefinitionPermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataActions A list of data actions that are allowed for the Cosmos DB SQL Role Definition.
         * 
         * @return builder
         * 
         */
        public Builder dataActions(Output<List<String>> dataActions) {
            $.dataActions = dataActions;
            return this;
        }

        /**
         * @param dataActions A list of data actions that are allowed for the Cosmos DB SQL Role Definition.
         * 
         * @return builder
         * 
         */
        public Builder dataActions(List<String> dataActions) {
            return dataActions(Output.of(dataActions));
        }

        /**
         * @param dataActions A list of data actions that are allowed for the Cosmos DB SQL Role Definition.
         * 
         * @return builder
         * 
         */
        public Builder dataActions(String... dataActions) {
            return dataActions(List.of(dataActions));
        }

        public SqlRoleDefinitionPermissionArgs build() {
            $.dataActions = Objects.requireNonNull($.dataActions, "expected parameter 'dataActions' to be non-null");
            return $;
        }
    }

}
