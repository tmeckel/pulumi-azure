// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Lab.Inputs
{

    public sealed class LabVirtualMachineAdminUserGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("password", required: true)]
        private Input<string>? _password;

        /// <summary>
        /// The password for the Lab user. Changing this forces a new resource to be created.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The username to use when signing in to Lab Service Lab VMs. Changing this forces a new resource to be created.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public LabVirtualMachineAdminUserGetArgs()
        {
        }
        public static new LabVirtualMachineAdminUserGetArgs Empty => new LabVirtualMachineAdminUserGetArgs();
    }
}