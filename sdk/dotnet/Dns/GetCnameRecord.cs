// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.Dns
{
    public static class GetCnameRecord
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = new Azure.Dns.CNameRecord("example", new()
        ///     {
        ///         ZoneName = "test-zone",
        ///         ResourceGroupName = "test-rg",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dnsCnameRecordId"] = example.Id,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCnameRecordResult> InvokeAsync(GetCnameRecordArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCnameRecordResult>("azure:dns/getCnameRecord:getCnameRecord", args ?? new GetCnameRecordArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = new Azure.Dns.CNameRecord("example", new()
        ///     {
        ///         ZoneName = "test-zone",
        ///         ResourceGroupName = "test-rg",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dnsCnameRecordId"] = example.Id,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCnameRecordResult> Invoke(GetCnameRecordInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCnameRecordResult>("azure:dns/getCnameRecord:getCnameRecord", args ?? new GetCnameRecordInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCnameRecordArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the DNS CNAME Record.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Specifies the resource group where the DNS Zone (parent resource) exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public string ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// Specifies the DNS Zone where the resource exists.
        /// </summary>
        [Input("zoneName", required: true)]
        public string ZoneName { get; set; } = null!;

        public GetCnameRecordArgs()
        {
        }
        public static new GetCnameRecordArgs Empty => new GetCnameRecordArgs();
    }

    public sealed class GetCnameRecordInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the DNS CNAME Record.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Specifies the resource group where the DNS Zone (parent resource) exists.
        /// </summary>
        [Input("resourceGroupName", required: true)]
        public Input<string> ResourceGroupName { get; set; } = null!;

        /// <summary>
        /// Specifies the DNS Zone where the resource exists.
        /// </summary>
        [Input("zoneName", required: true)]
        public Input<string> ZoneName { get; set; } = null!;

        public GetCnameRecordInvokeArgs()
        {
        }
        public static new GetCnameRecordInvokeArgs Empty => new GetCnameRecordInvokeArgs();
    }


    [OutputType]
    public sealed class GetCnameRecordResult
    {
        /// <summary>
        /// The FQDN of the DNS CName Record.
        /// </summary>
        public readonly string Fqdn;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// The target of the CNAME.
        /// </summary>
        public readonly string Record;
        public readonly string ResourceGroupName;
        /// <summary>
        /// A mapping of tags assigned to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// The Azure resource id of the target object from where the dns resource value is taken.
        /// </summary>
        public readonly string TargetResourceId;
        /// <summary>
        /// The Time To Live (TTL) of the DNS record in seconds.
        /// </summary>
        public readonly int Ttl;
        public readonly string ZoneName;

        [OutputConstructor]
        private GetCnameRecordResult(
            string fqdn,

            string id,

            string name,

            string record,

            string resourceGroupName,

            ImmutableDictionary<string, string> tags,

            string targetResourceId,

            int ttl,

            string zoneName)
        {
            Fqdn = fqdn;
            Id = id;
            Name = name;
            Record = record;
            ResourceGroupName = resourceGroupName;
            Tags = tags;
            TargetResourceId = targetResourceId;
            Ttl = ttl;
            ZoneName = zoneName;
        }
    }
}