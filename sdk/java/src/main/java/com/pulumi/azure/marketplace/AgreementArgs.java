// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.marketplace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AgreementArgs extends com.pulumi.resources.ResourceArgs {

    public static final AgreementArgs Empty = new AgreementArgs();

    /**
     * The Offer of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="offer", required=true)
    private Output<String> offer;

    /**
     * @return The Offer of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> offer() {
        return this.offer;
    }

    /**
     * The Plan of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="plan", required=true)
    private Output<String> plan;

    /**
     * @return The Plan of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> plan() {
        return this.plan;
    }

    /**
     * The Publisher of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="publisher", required=true)
    private Output<String> publisher;

    /**
     * @return The Publisher of the Marketplace Image. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> publisher() {
        return this.publisher;
    }

    private AgreementArgs() {}

    private AgreementArgs(AgreementArgs $) {
        this.offer = $.offer;
        this.plan = $.plan;
        this.publisher = $.publisher;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AgreementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AgreementArgs $;

        public Builder() {
            $ = new AgreementArgs();
        }

        public Builder(AgreementArgs defaults) {
            $ = new AgreementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param offer The Offer of the Marketplace Image. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder offer(Output<String> offer) {
            $.offer = offer;
            return this;
        }

        /**
         * @param offer The Offer of the Marketplace Image. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder offer(String offer) {
            return offer(Output.of(offer));
        }

        /**
         * @param plan The Plan of the Marketplace Image. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder plan(Output<String> plan) {
            $.plan = plan;
            return this;
        }

        /**
         * @param plan The Plan of the Marketplace Image. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder plan(String plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param publisher The Publisher of the Marketplace Image. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher The Publisher of the Marketplace Image. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        public AgreementArgs build() {
            $.offer = Objects.requireNonNull($.offer, "expected parameter 'offer' to be non-null");
            $.plan = Objects.requireNonNull($.plan, "expected parameter 'plan' to be non-null");
            $.publisher = Objects.requireNonNull($.publisher, "expected parameter 'publisher' to be non-null");
            return $;
        }
    }

}
