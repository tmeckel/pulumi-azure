// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network.Inputs
{

    public sealed class NetworkManagerScopeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("managementGroupIds")]
        private InputList<string>? _managementGroupIds;

        /// <summary>
        /// A list of management group IDs.
        /// </summary>
        public InputList<string> ManagementGroupIds
        {
            get => _managementGroupIds ?? (_managementGroupIds = new InputList<string>());
            set => _managementGroupIds = value;
        }

        [Input("subscriptionIds")]
        private InputList<string>? _subscriptionIds;

        /// <summary>
        /// A list of subscription IDs.
        /// </summary>
        public InputList<string> SubscriptionIds
        {
            get => _subscriptionIds ?? (_subscriptionIds = new InputList<string>());
            set => _subscriptionIds = value;
        }

        public NetworkManagerScopeGetArgs()
        {
        }
        public static new NetworkManagerScopeGetArgs Empty => new NetworkManagerScopeGetArgs();
    }
}