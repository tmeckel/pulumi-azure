// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class RouteMapRuleActionArgs : global::Pulumi.ResourceArgs
    {
        [Input("parameters", required: true)]
        private InputList<Inputs.RouteMapRuleActionParameterArgs>? _parameters;

        /// <summary>
        /// A `parameter` block as defined below.
        /// </summary>
        public InputList<Inputs.RouteMapRuleActionParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.RouteMapRuleActionParameterArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The type of the action to be taken. Possible values are `Add`, `Drop`, `Remove`, `Replace` and `Unknown`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public RouteMapRuleActionArgs()
        {
        }
        public static new RouteMapRuleActionArgs Empty => new RouteMapRuleActionArgs();
    }
}