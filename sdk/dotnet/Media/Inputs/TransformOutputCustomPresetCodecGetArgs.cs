// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Media.Inputs
{

    public sealed class TransformOutputCustomPresetCodecGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A `aac_audio` block as defined above.
        /// </summary>
        [Input("aacAudio")]
        public Input<Inputs.TransformOutputCustomPresetCodecAacAudioGetArgs>? AacAudio { get; set; }

        /// <summary>
        /// A `copy_audio` block as defined below.
        /// </summary>
        [Input("copyAudio")]
        public Input<Inputs.TransformOutputCustomPresetCodecCopyAudioGetArgs>? CopyAudio { get; set; }

        /// <summary>
        /// A `copy_video` block as defined below.
        /// </summary>
        [Input("copyVideo")]
        public Input<Inputs.TransformOutputCustomPresetCodecCopyVideoGetArgs>? CopyVideo { get; set; }

        /// <summary>
        /// A `dd_audio` block as defined below.
        /// </summary>
        [Input("ddAudio")]
        public Input<Inputs.TransformOutputCustomPresetCodecDdAudioGetArgs>? DdAudio { get; set; }

        /// <summary>
        /// A `h264_video` block as defined below.
        /// </summary>
        [Input("h264Video")]
        public Input<Inputs.TransformOutputCustomPresetCodecH264VideoGetArgs>? H264Video { get; set; }

        /// <summary>
        /// A `h265_video` block as defined below.
        /// </summary>
        [Input("h265Video")]
        public Input<Inputs.TransformOutputCustomPresetCodecH265VideoGetArgs>? H265Video { get; set; }

        public TransformOutputCustomPresetCodecGetArgs()
        {
        }
        public static new TransformOutputCustomPresetCodecGetArgs Empty => new TransformOutputCustomPresetCodecGetArgs();
    }
}