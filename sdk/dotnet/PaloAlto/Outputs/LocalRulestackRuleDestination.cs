// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Azure.PaloAlto.Outputs
{

    [OutputType]
    public sealed class LocalRulestackRuleDestination
    {
        /// <summary>
        /// Specifies a list of CIDR's.
        /// </summary>
        public readonly ImmutableArray<string> Cidrs;
        /// <summary>
        /// Specifies a list of ISO3361-1 Alpha-2 Country codes. Possible values include `AF`, `AX`, `AL`, `DZ`, `AS`, `AD`, `AO`, `AI`, `AQ`, `AG`, `AR`, `AM`, `AW`, `AU`, `AT`, `AZ`, `BS`, `BH`, `BD`, `BB`, `BY`, `BE`, `BZ`, `BJ`, `BM`, `BT`, `BO`, `BQ`, `BA`, `BW`, `BV`, `BR`, `IO`, `BN`, `BG`, `BF`, `BI`, `KH`, `CM`, `CA`, `CV`, `KY`, `CF`, `TD`, `CL`, `CN`, `CX`, `CC`, `CO`, `KM`, `CG`, `CD`, `CK`, `CR`, `CI`, `HR`, `CU`, `CW`, `CY`, `CZ`, `DK`, `DJ`, `DM`, `DO`, `EC`, `EG`, `SV`, `GQ`, `ER`, `EE`, `ET`, `FK`, `FO`, `FJ`, `FI`, `FR`, `GF`, `PF`, `TF`, `GA`, `GM`, `GE`, `DE`, `GH`, `GI`, `GR`, `GL`, `GD`, `GP`, `GU`, `GT`, `GG`, `GN`, `GW`, `GY`, `HT`, `HM`, `VA`, `HN`, `HK`, `HU`, `IS`, `IN`, `ID`, `IR`, `IQ`, `IE`, `IM`, `IL`, `IT`, `JM`, `JP`, `JE`, `JO`, `KZ`, `KE`, `KI`, `KP`, `KR`, `KW`, `KG`, `LA`, `LV`, `LB`, `LS`, `LR`, `LY`, `LI`, `LT`, `LU`, `MO`, `MK`, `MG`, `MW`, `MY`, `MV`, `ML`, `MT`, `MH`, `MQ`, `MR`, `MU`, `YT`, `MX`, `FM`, `MD`, `MC`, `MN`, `ME`, `MS`, `MA`, `MZ`, `MM`, `NA`, `NR`, `NP`, `NL`, `NC`, `NZ`, `NI`, `NE`, `NG`, `NU`, `NF`, `MP`, `NO`, `OM`, `PK`, `PW`, `PS`, `PA`, `PG`, `PY`, `PE`, `PH`, `PN`, `PL`, `PT`, `PR`, `QA`, `RE`, `RO`, `RU`, `RW`, `BL`, `SH`, `KN`, `LC`, `MF`, `PM`, `VC`, `WS`, `SM`, `ST`, `SA`, `SN`, `RS`, `SC`, `SL`, `SG`, `SX`, `SK`, `SI`, `SB`, `SO`, `ZA`, `GS`, `SS`, `ES`, `LK`, `SD`, `SR`, `SJ`, `SZ`, `SE`, `CH`, `SY`, `TW`, `TJ`, `TZ`, `TH`, `TL`, `TG`, `TK`, `TO`, `TT`, `TN`, `TR`, `TM`, `TC`, `TV`, `UG`, `UA`, `AE`, `GB`, `US`, `UM`, `UY`, `UZ`, `VU`, `VE`, `VN`, `VG`, `VI`, `WF`, `EH`, `YE`, `ZM`, `ZW`
        /// </summary>
        public readonly ImmutableArray<string> Countries;
        /// <summary>
        /// Specifies a list of Feeds.
        /// </summary>
        public readonly ImmutableArray<string> Feeds;
        /// <summary>
        /// Specifies a list of FQDN lists.
        /// 
        /// &gt; **Note:** This is a list of names of FQDN Lists configured on the same Local Rulestack as this Rule is being created.
        /// </summary>
        public readonly ImmutableArray<string> LocalRulestackFqdnListIds;
        /// <summary>
        /// Specifies a list of Prefix Lists.
        /// 
        /// &gt; **Note:** This is a list of names of Prefix Lists configured on the same Local Rulestack as this Rule is being created.
        /// </summary>
        public readonly ImmutableArray<string> LocalRulestackPrefixListIds;

        [OutputConstructor]
        private LocalRulestackRuleDestination(
            ImmutableArray<string> cidrs,

            ImmutableArray<string> countries,

            ImmutableArray<string> feeds,

            ImmutableArray<string> localRulestackFqdnListIds,

            ImmutableArray<string> localRulestackPrefixListIds)
        {
            Cidrs = cidrs;
            Countries = countries;
            Feeds = feeds;
            LocalRulestackFqdnListIds = localRulestackFqdnListIds;
            LocalRulestackPrefixListIds = localRulestackPrefixListIds;
        }
    }
}