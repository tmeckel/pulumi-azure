// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Core.Inputs
{

    public sealed class ResourceGroupPolicyAssignmentResourceSelectorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a name for the resource selector.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("selectors", required: true)]
        private InputList<Inputs.ResourceGroupPolicyAssignmentResourceSelectorSelectorArgs>? _selectors;

        /// <summary>
        /// One or more `resource_selector` block as defined below.
        /// </summary>
        public InputList<Inputs.ResourceGroupPolicyAssignmentResourceSelectorSelectorArgs> Selectors
        {
            get => _selectors ?? (_selectors = new InputList<Inputs.ResourceGroupPolicyAssignmentResourceSelectorSelectorArgs>());
            set => _selectors = value;
        }

        public ResourceGroupPolicyAssignmentResourceSelectorArgs()
        {
        }
        public static new ResourceGroupPolicyAssignmentResourceSelectorArgs Empty => new ResourceGroupPolicyAssignmentResourceSelectorArgs();
    }
}