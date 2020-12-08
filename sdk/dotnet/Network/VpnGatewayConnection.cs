// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Network
{
    /// <summary>
    /// Manages a VPN Gateway Connection.
    /// 
    /// ## Import
    /// 
    /// VPN Gateway Connections can be imported using the `resource id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import azure:network/vpnGatewayConnection:VpnGatewayConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/vpnGateways/gateway1/vpnConnections/conn1
    /// ```
    /// </summary>
    public partial class VpnGatewayConnection : Pulumi.CustomResource
    {
        /// <summary>
        /// Whether Internet Security is enabled for this VPN Connection. Defaults to `false`.
        /// </summary>
        [Output("internetSecurityEnabled")]
        public Output<bool?> InternetSecurityEnabled { get; private set; } = null!;

        /// <summary>
        /// The name which should be used for this VPN Gateway Connection. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the remote VPN Site, which will connect to the VPN Gateway. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Output("remoteVpnSiteId")]
        public Output<string> RemoteVpnSiteId { get; private set; } = null!;

        /// <summary>
        /// A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
        /// </summary>
        [Output("routings")]
        public Output<ImmutableArray<Outputs.VpnGatewayConnectionRouting>> Routings { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPN Gateway that this VPN Gateway Connection belongs to. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Output("vpnGatewayId")]
        public Output<string> VpnGatewayId { get; private set; } = null!;

        /// <summary>
        /// One or more `vpn_link` blocks as defined below.
        /// </summary>
        [Output("vpnLinks")]
        public Output<ImmutableArray<Outputs.VpnGatewayConnectionVpnLink>> VpnLinks { get; private set; } = null!;


        /// <summary>
        /// Create a VpnGatewayConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpnGatewayConnection(string name, VpnGatewayConnectionArgs args, CustomResourceOptions? options = null)
            : base("azure:network/vpnGatewayConnection:VpnGatewayConnection", name, args ?? new VpnGatewayConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpnGatewayConnection(string name, Input<string> id, VpnGatewayConnectionState? state = null, CustomResourceOptions? options = null)
            : base("azure:network/vpnGatewayConnection:VpnGatewayConnection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VpnGatewayConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpnGatewayConnection Get(string name, Input<string> id, VpnGatewayConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new VpnGatewayConnection(name, id, state, options);
        }
    }

    public sealed class VpnGatewayConnectionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether Internet Security is enabled for this VPN Connection. Defaults to `false`.
        /// </summary>
        [Input("internetSecurityEnabled")]
        public Input<bool>? InternetSecurityEnabled { get; set; }

        /// <summary>
        /// The name which should be used for this VPN Gateway Connection. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the remote VPN Site, which will connect to the VPN Gateway. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("remoteVpnSiteId", required: true)]
        public Input<string> RemoteVpnSiteId { get; set; } = null!;

        [Input("routings")]
        private InputList<Inputs.VpnGatewayConnectionRoutingArgs>? _routings;

        /// <summary>
        /// A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
        /// </summary>
        public InputList<Inputs.VpnGatewayConnectionRoutingArgs> Routings
        {
            get => _routings ?? (_routings = new InputList<Inputs.VpnGatewayConnectionRoutingArgs>());
            set => _routings = value;
        }

        /// <summary>
        /// The ID of the VPN Gateway that this VPN Gateway Connection belongs to. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("vpnGatewayId", required: true)]
        public Input<string> VpnGatewayId { get; set; } = null!;

        [Input("vpnLinks", required: true)]
        private InputList<Inputs.VpnGatewayConnectionVpnLinkArgs>? _vpnLinks;

        /// <summary>
        /// One or more `vpn_link` blocks as defined below.
        /// </summary>
        public InputList<Inputs.VpnGatewayConnectionVpnLinkArgs> VpnLinks
        {
            get => _vpnLinks ?? (_vpnLinks = new InputList<Inputs.VpnGatewayConnectionVpnLinkArgs>());
            set => _vpnLinks = value;
        }

        public VpnGatewayConnectionArgs()
        {
        }
    }

    public sealed class VpnGatewayConnectionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether Internet Security is enabled for this VPN Connection. Defaults to `false`.
        /// </summary>
        [Input("internetSecurityEnabled")]
        public Input<bool>? InternetSecurityEnabled { get; set; }

        /// <summary>
        /// The name which should be used for this VPN Gateway Connection. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the remote VPN Site, which will connect to the VPN Gateway. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("remoteVpnSiteId")]
        public Input<string>? RemoteVpnSiteId { get; set; }

        [Input("routings")]
        private InputList<Inputs.VpnGatewayConnectionRoutingGetArgs>? _routings;

        /// <summary>
        /// A `routing` block as defined below. If this is not specified, there will be a default route table created implicitly.
        /// </summary>
        public InputList<Inputs.VpnGatewayConnectionRoutingGetArgs> Routings
        {
            get => _routings ?? (_routings = new InputList<Inputs.VpnGatewayConnectionRoutingGetArgs>());
            set => _routings = value;
        }

        /// <summary>
        /// The ID of the VPN Gateway that this VPN Gateway Connection belongs to. Changing this forces a new VPN Gateway Connection to be created.
        /// </summary>
        [Input("vpnGatewayId")]
        public Input<string>? VpnGatewayId { get; set; }

        [Input("vpnLinks")]
        private InputList<Inputs.VpnGatewayConnectionVpnLinkGetArgs>? _vpnLinks;

        /// <summary>
        /// One or more `vpn_link` blocks as defined below.
        /// </summary>
        public InputList<Inputs.VpnGatewayConnectionVpnLinkGetArgs> VpnLinks
        {
            get => _vpnLinks ?? (_vpnLinks = new InputList<Inputs.VpnGatewayConnectionVpnLinkGetArgs>());
            set => _vpnLinks = value;
        }

        public VpnGatewayConnectionState()
        {
        }
    }
}