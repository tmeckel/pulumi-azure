// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.MediaServices.Inputs
{

    public sealed class AccountKeyDeliveryAccessControlGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Default Action to use when no rules match from `ip_allow_list`. Possible values are `Allow` and `Deny`.
        /// </summary>
        [Input("defaultAction")]
        public Input<string>? DefaultAction { get; set; }

        [Input("ipAllowLists")]
        private InputList<string>? _ipAllowLists;

        /// <summary>
        /// One or more IP Addresses, or CIDR Blocks which should be able to access the Key Delivery.
        /// </summary>
        public InputList<string> IpAllowLists
        {
            get => _ipAllowLists ?? (_ipAllowLists = new InputList<string>());
            set => _ipAllowLists = value;
        }

        public AccountKeyDeliveryAccessControlGetArgs()
        {
        }
        public static new AccountKeyDeliveryAccessControlGetArgs Empty => new AccountKeyDeliveryAccessControlGetArgs();
    }
}
