// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.siterecovery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicationRecoveryPlanRecoveryGroupPostAction {
    /**
     * @return The fabric location of runbook or script. Possible values are `Primary` and `Recovery`.
     * 
     */
    private @Nullable String fabricLocation;
    /**
     * @return Directions of fail over. Possible values are `PrimaryToRecovery` and `RecoveryToPrimary`
     * 
     */
    private List<String> failOverDirections;
    /**
     * @return Types of fail over. Possible values are `TestFailover`, `PlannedFailover` and `UnplannedFailover`
     * 
     */
    private List<String> failOverTypes;
    /**
     * @return Instructions of manual action.
     * 
     */
    private @Nullable String manualActionInstruction;
    /**
     * @return The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters.
     * 
     */
    private String name;
    /**
     * @return Id of runbook.
     * 
     */
    private @Nullable String runbookId;
    /**
     * @return Path of action script.
     * 
     */
    private @Nullable String scriptPath;
    /**
     * @return The Recovery Plan Group Type. Possible values are `Boot`, `Failover` and `Shutdown`.
     * 
     */
    private String type;

    private ReplicationRecoveryPlanRecoveryGroupPostAction() {}
    /**
     * @return The fabric location of runbook or script. Possible values are `Primary` and `Recovery`.
     * 
     */
    public Optional<String> fabricLocation() {
        return Optional.ofNullable(this.fabricLocation);
    }
    /**
     * @return Directions of fail over. Possible values are `PrimaryToRecovery` and `RecoveryToPrimary`
     * 
     */
    public List<String> failOverDirections() {
        return this.failOverDirections;
    }
    /**
     * @return Types of fail over. Possible values are `TestFailover`, `PlannedFailover` and `UnplannedFailover`
     * 
     */
    public List<String> failOverTypes() {
        return this.failOverTypes;
    }
    /**
     * @return Instructions of manual action.
     * 
     */
    public Optional<String> manualActionInstruction() {
        return Optional.ofNullable(this.manualActionInstruction);
    }
    /**
     * @return The name of the Replication Plan. The name can contain only letters, numbers, and hyphens. It should start with a letter and end with a letter or a number. Can be a maximum of 63 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Id of runbook.
     * 
     */
    public Optional<String> runbookId() {
        return Optional.ofNullable(this.runbookId);
    }
    /**
     * @return Path of action script.
     * 
     */
    public Optional<String> scriptPath() {
        return Optional.ofNullable(this.scriptPath);
    }
    /**
     * @return The Recovery Plan Group Type. Possible values are `Boot`, `Failover` and `Shutdown`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationRecoveryPlanRecoveryGroupPostAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fabricLocation;
        private List<String> failOverDirections;
        private List<String> failOverTypes;
        private @Nullable String manualActionInstruction;
        private String name;
        private @Nullable String runbookId;
        private @Nullable String scriptPath;
        private String type;
        public Builder() {}
        public Builder(ReplicationRecoveryPlanRecoveryGroupPostAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricLocation = defaults.fabricLocation;
    	      this.failOverDirections = defaults.failOverDirections;
    	      this.failOverTypes = defaults.failOverTypes;
    	      this.manualActionInstruction = defaults.manualActionInstruction;
    	      this.name = defaults.name;
    	      this.runbookId = defaults.runbookId;
    	      this.scriptPath = defaults.scriptPath;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder fabricLocation(@Nullable String fabricLocation) {
            this.fabricLocation = fabricLocation;
            return this;
        }
        @CustomType.Setter
        public Builder failOverDirections(List<String> failOverDirections) {
            this.failOverDirections = Objects.requireNonNull(failOverDirections);
            return this;
        }
        public Builder failOverDirections(String... failOverDirections) {
            return failOverDirections(List.of(failOverDirections));
        }
        @CustomType.Setter
        public Builder failOverTypes(List<String> failOverTypes) {
            this.failOverTypes = Objects.requireNonNull(failOverTypes);
            return this;
        }
        public Builder failOverTypes(String... failOverTypes) {
            return failOverTypes(List.of(failOverTypes));
        }
        @CustomType.Setter
        public Builder manualActionInstruction(@Nullable String manualActionInstruction) {
            this.manualActionInstruction = manualActionInstruction;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder runbookId(@Nullable String runbookId) {
            this.runbookId = runbookId;
            return this;
        }
        @CustomType.Setter
        public Builder scriptPath(@Nullable String scriptPath) {
            this.scriptPath = scriptPath;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ReplicationRecoveryPlanRecoveryGroupPostAction build() {
            final var o = new ReplicationRecoveryPlanRecoveryGroupPostAction();
            o.fabricLocation = fabricLocation;
            o.failOverDirections = failOverDirections;
            o.failOverTypes = failOverTypes;
            o.manualActionInstruction = manualActionInstruction;
            o.name = name;
            o.runbookId = runbookId;
            o.scriptPath = scriptPath;
            o.type = type;
            return o;
        }
    }
}