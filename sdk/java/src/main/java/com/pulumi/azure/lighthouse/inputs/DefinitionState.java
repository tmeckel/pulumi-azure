// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lighthouse.inputs;

import com.pulumi.azure.lighthouse.inputs.DefinitionAuthorizationArgs;
import com.pulumi.azure.lighthouse.inputs.DefinitionPlanArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefinitionState extends com.pulumi.resources.ResourceArgs {

    public static final DefinitionState Empty = new DefinitionState();

    /**
     * An authorization block as defined below.
     * 
     */
    @Import(name="authorizations")
    private @Nullable Output<List<DefinitionAuthorizationArgs>> authorizations;

    /**
     * @return An authorization block as defined below.
     * 
     */
    public Optional<Output<List<DefinitionAuthorizationArgs>>> authorizations() {
        return Optional.ofNullable(this.authorizations);
    }

    /**
     * A description of the Lighthouse Definition.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the Lighthouse Definition.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="lighthouseDefinitionId")
    private @Nullable Output<String> lighthouseDefinitionId;

    /**
     * @return A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> lighthouseDefinitionId() {
        return Optional.ofNullable(this.lighthouseDefinitionId);
    }

    /**
     * The ID of the managing tenant. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="managingTenantId")
    private @Nullable Output<String> managingTenantId;

    /**
     * @return The ID of the managing tenant. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> managingTenantId() {
        return Optional.ofNullable(this.managingTenantId);
    }

    /**
     * The name of the Lighthouse Definition. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Lighthouse Definition. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `plan` block as defined below.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<DefinitionPlanArgs> plan;

    /**
     * @return A `plan` block as defined below.
     * 
     */
    public Optional<Output<DefinitionPlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * The ID of the managed subscription. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The ID of the managed subscription. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private DefinitionState() {}

    private DefinitionState(DefinitionState $) {
        this.authorizations = $.authorizations;
        this.description = $.description;
        this.lighthouseDefinitionId = $.lighthouseDefinitionId;
        this.managingTenantId = $.managingTenantId;
        this.name = $.name;
        this.plan = $.plan;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefinitionState $;

        public Builder() {
            $ = new DefinitionState();
        }

        public Builder(DefinitionState defaults) {
            $ = new DefinitionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizations An authorization block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder authorizations(@Nullable Output<List<DefinitionAuthorizationArgs>> authorizations) {
            $.authorizations = authorizations;
            return this;
        }

        /**
         * @param authorizations An authorization block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder authorizations(List<DefinitionAuthorizationArgs> authorizations) {
            return authorizations(Output.of(authorizations));
        }

        /**
         * @param authorizations An authorization block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder authorizations(DefinitionAuthorizationArgs... authorizations) {
            return authorizations(List.of(authorizations));
        }

        /**
         * @param description A description of the Lighthouse Definition.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the Lighthouse Definition.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param lighthouseDefinitionId A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder lighthouseDefinitionId(@Nullable Output<String> lighthouseDefinitionId) {
            $.lighthouseDefinitionId = lighthouseDefinitionId;
            return this;
        }

        /**
         * @param lighthouseDefinitionId A unique UUID/GUID which identifies this lighthouse definition - one will be generated if not specified. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder lighthouseDefinitionId(String lighthouseDefinitionId) {
            return lighthouseDefinitionId(Output.of(lighthouseDefinitionId));
        }

        /**
         * @param managingTenantId The ID of the managing tenant. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managingTenantId(@Nullable Output<String> managingTenantId) {
            $.managingTenantId = managingTenantId;
            return this;
        }

        /**
         * @param managingTenantId The ID of the managing tenant. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder managingTenantId(String managingTenantId) {
            return managingTenantId(Output.of(managingTenantId));
        }

        /**
         * @param name The name of the Lighthouse Definition. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Lighthouse Definition. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param plan A `plan` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder plan(@Nullable Output<DefinitionPlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan A `plan` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder plan(DefinitionPlanArgs plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param scope The ID of the managed subscription. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The ID of the managed subscription. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public DefinitionState build() {
            return $;
        }
    }

}