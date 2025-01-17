// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.pim.inputs;

import com.pulumi.azure.pim.inputs.ActiveRoleAssignmentScheduleExpirationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActiveRoleAssignmentScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActiveRoleAssignmentScheduleArgs Empty = new ActiveRoleAssignmentScheduleArgs();

    /**
     * A `expiration` block as defined above.
     * 
     */
    @Import(name="expiration")
    private @Nullable Output<ActiveRoleAssignmentScheduleExpirationArgs> expiration;

    /**
     * @return A `expiration` block as defined above.
     * 
     */
    public Optional<Output<ActiveRoleAssignmentScheduleExpirationArgs>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    /**
     * The start date time of the role assignment. Changing this forces a new Pim Active Role Assignment to be created.
     * 
     */
    @Import(name="startDateTime")
    private @Nullable Output<String> startDateTime;

    /**
     * @return The start date time of the role assignment. Changing this forces a new Pim Active Role Assignment to be created.
     * 
     */
    public Optional<Output<String>> startDateTime() {
        return Optional.ofNullable(this.startDateTime);
    }

    private ActiveRoleAssignmentScheduleArgs() {}

    private ActiveRoleAssignmentScheduleArgs(ActiveRoleAssignmentScheduleArgs $) {
        this.expiration = $.expiration;
        this.startDateTime = $.startDateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActiveRoleAssignmentScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActiveRoleAssignmentScheduleArgs $;

        public Builder() {
            $ = new ActiveRoleAssignmentScheduleArgs();
        }

        public Builder(ActiveRoleAssignmentScheduleArgs defaults) {
            $ = new ActiveRoleAssignmentScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expiration A `expiration` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder expiration(@Nullable Output<ActiveRoleAssignmentScheduleExpirationArgs> expiration) {
            $.expiration = expiration;
            return this;
        }

        /**
         * @param expiration A `expiration` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder expiration(ActiveRoleAssignmentScheduleExpirationArgs expiration) {
            return expiration(Output.of(expiration));
        }

        /**
         * @param startDateTime The start date time of the role assignment. Changing this forces a new Pim Active Role Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder startDateTime(@Nullable Output<String> startDateTime) {
            $.startDateTime = startDateTime;
            return this;
        }

        /**
         * @param startDateTime The start date time of the role assignment. Changing this forces a new Pim Active Role Assignment to be created.
         * 
         * @return builder
         * 
         */
        public Builder startDateTime(String startDateTime) {
            return startDateTime(Output.of(startDateTime));
        }

        public ActiveRoleAssignmentScheduleArgs build() {
            return $;
        }
    }

}
