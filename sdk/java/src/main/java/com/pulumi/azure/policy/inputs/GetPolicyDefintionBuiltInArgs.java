// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.policy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyDefintionBuiltInArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyDefintionBuiltInArgs Empty = new GetPolicyDefintionBuiltInArgs();

    /**
     * Specifies the display name of the Policy Definition. Conflicts with `name`.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Specifies the display name of the Policy Definition. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Only retrieve Policy Definitions from this Management Group.
     * 
     */
    @Import(name="managementGroupName")
    private @Nullable Output<String> managementGroupName;

    /**
     * @return Only retrieve Policy Definitions from this Management Group.
     * 
     */
    public Optional<Output<String>> managementGroupName() {
        return Optional.ofNullable(this.managementGroupName);
    }

    /**
     * Specifies the name of the Policy Definition. Conflicts with `display_name`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Policy Definition. Conflicts with `display_name`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetPolicyDefintionBuiltInArgs() {}

    private GetPolicyDefintionBuiltInArgs(GetPolicyDefintionBuiltInArgs $) {
        this.displayName = $.displayName;
        this.managementGroupName = $.managementGroupName;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyDefintionBuiltInArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyDefintionBuiltInArgs $;

        public Builder() {
            $ = new GetPolicyDefintionBuiltInArgs();
        }

        public Builder(GetPolicyDefintionBuiltInArgs defaults) {
            $ = new GetPolicyDefintionBuiltInArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Specifies the display name of the Policy Definition. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Specifies the display name of the Policy Definition. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param managementGroupName Only retrieve Policy Definitions from this Management Group.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupName(@Nullable Output<String> managementGroupName) {
            $.managementGroupName = managementGroupName;
            return this;
        }

        /**
         * @param managementGroupName Only retrieve Policy Definitions from this Management Group.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupName(String managementGroupName) {
            return managementGroupName(Output.of(managementGroupName));
        }

        /**
         * @param name Specifies the name of the Policy Definition. Conflicts with `display_name`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Policy Definition. Conflicts with `display_name`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetPolicyDefintionBuiltInArgs build() {
            return $;
        }
    }

}