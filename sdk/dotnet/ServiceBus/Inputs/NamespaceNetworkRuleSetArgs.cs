// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.ServiceBus.Inputs
{

    public sealed class NamespaceNetworkRuleSetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the default action for the Network Rule Set. Possible values are `Allow` and `Deny`. Defaults to `Deny`.
        /// </summary>
        [Input("defaultAction")]
        public Input<string>? DefaultAction { get; set; }

        [Input("ipRules")]
        private InputList<string>? _ipRules;

        /// <summary>
        /// One or more IP Addresses, or CIDR Blocks which should be able to access the ServiceBus Namespace.
        /// </summary>
        public InputList<string> IpRules
        {
            get => _ipRules ?? (_ipRules = new InputList<string>());
            set => _ipRules = value;
        }

        [Input("networkRules")]
        private InputList<Inputs.NamespaceNetworkRuleSetNetworkRuleArgs>? _networkRules;

        /// <summary>
        /// One or more `network_rules` blocks as defined below.
        /// </summary>
        public InputList<Inputs.NamespaceNetworkRuleSetNetworkRuleArgs> NetworkRules
        {
            get => _networkRules ?? (_networkRules = new InputList<Inputs.NamespaceNetworkRuleSetNetworkRuleArgs>());
            set => _networkRules = value;
        }

        /// <summary>
        /// Whether to allow traffic over public network. Possible values are `true` and `false`. Defaults to `true`.
        /// </summary>
        [Input("publicNetworkAccessEnabled")]
        public Input<bool>? PublicNetworkAccessEnabled { get; set; }

        /// <summary>
        /// Are Azure Services that are known and trusted for this resource type are allowed to bypass firewall configuration? See [Trusted Microsoft Services](https://github.com/MicrosoftDocs/azure-docs/blob/master/articles/service-bus-messaging/includes/service-bus-trusted-services.md)
        /// </summary>
        [Input("trustedServicesAllowed")]
        public Input<bool>? TrustedServicesAllowed { get; set; }

        public NamespaceNetworkRuleSetArgs()
        {
        }
        public static new NamespaceNetworkRuleSetArgs Empty => new NamespaceNetworkRuleSetArgs();
    }
}