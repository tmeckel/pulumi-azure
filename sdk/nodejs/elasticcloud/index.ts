// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ElasticsearchArgs, ElasticsearchState } from "./elasticsearch";
export type Elasticsearch = import("./elasticsearch").Elasticsearch;
export const Elasticsearch: typeof import("./elasticsearch").Elasticsearch = null as any;
utilities.lazyLoad(exports, ["Elasticsearch"], () => require("./elasticsearch"));

export { GetElasticsearchArgs, GetElasticsearchResult, GetElasticsearchOutputArgs } from "./getElasticsearch";
export const getElasticsearch: typeof import("./getElasticsearch").getElasticsearch = null as any;
export const getElasticsearchOutput: typeof import("./getElasticsearch").getElasticsearchOutput = null as any;
utilities.lazyLoad(exports, ["getElasticsearch","getElasticsearchOutput"], () => require("./getElasticsearch"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "azure:elasticcloud/elasticsearch:Elasticsearch":
                return new Elasticsearch(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("azure", "elasticcloud/elasticsearch", _module)