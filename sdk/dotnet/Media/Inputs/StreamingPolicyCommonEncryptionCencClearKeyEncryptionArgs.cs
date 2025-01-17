// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class StreamingPolicyCommonEncryptionCencClearKeyEncryptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL template for the custom service that delivers content keys to the end user. This is not required when using Azure Media Services for issuing keys. Changing this forces a new Streaming Policy to be created.
        /// 
        /// &gt; **Note** Either `clear_key_encryption` or `drm` must be specified.
        /// </summary>
        [Input("customKeysAcquisitionUrlTemplate", required: true)]
        public Input<string> CustomKeysAcquisitionUrlTemplate { get; set; } = null!;

        public StreamingPolicyCommonEncryptionCencClearKeyEncryptionArgs()
        {
        }
        public static new StreamingPolicyCommonEncryptionCencClearKeyEncryptionArgs Empty => new StreamingPolicyCommonEncryptionCencClearKeyEncryptionArgs();
    }
}
