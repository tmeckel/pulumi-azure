// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Azure.Billing
{
    public static class GetMpaAccountScope
    {
        /// <summary>
        /// Use this data source to access an ID for your MPA Account billing scope.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Azure.Billing.GetMpaAccountScope.InvokeAsync(new Azure.Billing.GetMpaAccountScopeArgs
        ///         {
        ///             BillingAccountName = "e879cf0f-2b4d-5431-109a-f72fc9868693:024cabf4-7321-4cf9-be59-df0c77ca51de_2019-05-31",
        ///             CustomerName = "2281f543-7321-4cf9-1e23-edb4Oc31a31c",
        ///         }));
        ///         this.Id = example.Apply(example =&gt; example.Id);
        ///     }
        /// 
        ///     [Output("id")]
        ///     public Output&lt;string&gt; Id { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetMpaAccountScopeResult> InvokeAsync(GetMpaAccountScopeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetMpaAccountScopeResult>("azure:billing/getMpaAccountScope:getMpaAccountScope", args ?? new GetMpaAccountScopeArgs(), options.WithVersion());

        /// <summary>
        /// Use this data source to access an ID for your MPA Account billing scope.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Azure = Pulumi.Azure;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(Azure.Billing.GetMpaAccountScope.InvokeAsync(new Azure.Billing.GetMpaAccountScopeArgs
        ///         {
        ///             BillingAccountName = "e879cf0f-2b4d-5431-109a-f72fc9868693:024cabf4-7321-4cf9-be59-df0c77ca51de_2019-05-31",
        ///             CustomerName = "2281f543-7321-4cf9-1e23-edb4Oc31a31c",
        ///         }));
        ///         this.Id = example.Apply(example =&gt; example.Id);
        ///     }
        /// 
        ///     [Output("id")]
        ///     public Output&lt;string&gt; Id { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetMpaAccountScopeResult> Invoke(GetMpaAccountScopeInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetMpaAccountScopeResult>("azure:billing/getMpaAccountScope:getMpaAccountScope", args ?? new GetMpaAccountScopeInvokeArgs(), options.WithVersion());
    }


    public sealed class GetMpaAccountScopeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Billing Account Name of the MPA account.
        /// </summary>
        [Input("billingAccountName", required: true)]
        public string BillingAccountName { get; set; } = null!;

        /// <summary>
        /// The Customer Name in the above Billing Account.
        /// </summary>
        [Input("customerName", required: true)]
        public string CustomerName { get; set; } = null!;

        public GetMpaAccountScopeArgs()
        {
        }
    }

    public sealed class GetMpaAccountScopeInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Billing Account Name of the MPA account.
        /// </summary>
        [Input("billingAccountName", required: true)]
        public Input<string> BillingAccountName { get; set; } = null!;

        /// <summary>
        /// The Customer Name in the above Billing Account.
        /// </summary>
        [Input("customerName", required: true)]
        public Input<string> CustomerName { get; set; } = null!;

        public GetMpaAccountScopeInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetMpaAccountScopeResult
    {
        public readonly string BillingAccountName;
        public readonly string CustomerName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetMpaAccountScopeResult(
            string billingAccountName,

            string customerName,

            string id)
        {
            BillingAccountName = billingAccountName;
            CustomerName = customerName;
            Id = id;
        }
    }
}