package mux

import (
	"context"

	"github.com/pulumi/pulumi-azure/provider/v5/mux/config"
	"github.com/pulumi/pulumi-azure/provider/v5/mux/core"
	gop "github.com/pulumi/pulumi-go-provider"
	"github.com/pulumi/pulumi-go-provider/infer"
	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/pulumi/pulumi/pkg/v3/resource/provider"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
	rpc "github.com/pulumi/pulumi/sdk/v3/proto/go"
)

type Provider struct {
	prov gop.Provider
}

func NewProvider() *Provider {
	inst := Provider{}
	inst.prov = infer.Provider(infer.Options{
		Functions: []infer.InferredFunction{
			infer.Function[*core.GetClientToken, core.GetClientTokenArgs, core.GetClientTokenResult](),
			infer.Function[*core.GetResources, core.GetResourcesArgs, core.GetResourcesResult](),
		},
		ModuleMap: map[tokens.ModuleName]tokens.ModuleName{
			"mux": "index",
		},
	})
	inst.prov.Configure = configure
	return &inst
}

func configure(ctx gop.Context, req gop.ConfigureRequest) (err error) {
	config.ConfigValueMap = req.Args
	return
}

func (p *Provider) GetInstance(ctx context.Context, name, version string, host *provider.HostClient) (rpc.ResourceProviderServer, error) {
	return gop.RawServer(name, version, p.prov)
}

func (p *Provider) GetSpec(ctx context.Context, name, version string) (schema.PackageSpec, error) {
	return gop.GetSchema(ctx, name, version, p.prov)
}
