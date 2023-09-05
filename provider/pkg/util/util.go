package util

import (
	"context"
	"os"
	"strings"

	"github.com/hashicorp/go-azure-sdk/sdk/auth"
	"github.com/hashicorp/go-azure-sdk/sdk/environments"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

// StringValue gets a string value from a property map, then from environment vars; if neither are present, returns empty string ""
func StringValue(vars resource.PropertyMap, prop resource.PropertyKey, envs []string) string {
	val, ok := vars[prop]
	if ok && val.IsString() {
		return val.StringValue()
	}
	for _, env := range envs {
		val, ok := os.LookupEnv(env)
		if ok {
			return val
		}
	}
	return ""
}

// BoolValue takes a bool value from a property map, then from environment vars; defaults to false
func BoolValue(vars resource.PropertyMap, prop resource.PropertyKey, envs []string) bool {
	val, ok := vars[prop]
	if ok && val.IsBool() {
		return val.BoolValue()
	}
	for _, env := range envs {
		val, ok := os.LookupEnv(env)
		if ok && val == "true" {
			return true
		}
	}
	return false
}

// ArrayValue takes an array value from a property map, then from environment vars; defaults to an empty array
func ArrayValue(vars resource.PropertyMap, prop resource.PropertyKey, envs []string) []string {
	val, ok := vars[prop]
	var vals []string
	if ok && val.IsArray() {
		for _, v := range val.ArrayValue() {
			vals = append(vals, v.StringValue())
		}
		return vals
	}

	for _, env := range envs {
		val, ok := os.LookupEnv(env)
		if ok {
			return strings.Split(val, ";")
		}
	}
	return vals
}

func CreateAuthenticator(vars resource.PropertyMap, env *environments.Environment, api environments.Api) (auth.Authorizer, error) {
	//check for auxiliary tenants
	auxTenants := ArrayValue(vars, "auxiliaryTenantIDs", []string{"ARM_AUXILIARY_TENANT_IDS"})

	// validate the azure config
	useOIDC := BoolValue(vars, "useOidc", []string{"ARM_USE_OIDC"})
	authConfig := auth.Credentials{
		// SubscriptionID:                stringValue(vars, "subscriptionId", []string{"ARM_SUBSCRIPTION_ID"}),
		ClientID:                      StringValue(vars, "clientId", []string{"ARM_CLIENT_ID"}),
		ClientSecret:                  StringValue(vars, "clientSecret", []string{"ARM_CLIENT_SECRET"}),
		TenantID:                      StringValue(vars, "tenantId", []string{"ARM_TENANT_ID"}),
		Environment:                   *env,
		ClientCertificatePath:         StringValue(vars, "clientCertificatePath", []string{"ARM_CLIENT_CERTIFICATE_PATH"}),
		ClientCertificatePassword:     StringValue(vars, "clientCertificatePassword", []string{"ARM_CLIENT_CERTIFICATE_PASSWORD"}),
		CustomManagedIdentityEndpoint: StringValue(vars, "msiEndpoint", []string{"ARM_MSI_ENDPOINT"}),
		AuxiliaryTenantIDs:            auxTenants,

		// OIDC section. The ACTIONS_ variables are set by GitHub.
		GitHubOIDCTokenRequestToken: StringValue(vars, "oidcRequestToken", []string{"ARM_OIDC_REQUEST_TOKEN", "ACTIONS_ID_TOKEN_REQUEST_TOKEN"}),
		GitHubOIDCTokenRequestURL:   StringValue(vars, "oidcRequestUrl", []string{"ARM_OIDC_REQUEST_URL", "ACTIONS_ID_TOKEN_REQUEST_URL"}),
		OIDCAssertionToken:          StringValue(vars, "oidcToken", []string{"ARM_OIDC_TOKEN"}),

		// Feature Toggles
		EnableAuthenticatingUsingClientCertificate: true,
		EnableAuthenticatingUsingClientSecret:      true,
		EnableAuthenticatingUsingManagedIdentity:   BoolValue(vars, "useMsi", []string{"ARM_USE_MSI"}),
		EnableAuthenticatingUsingAzureCLI:          true,
		EnableAuthenticationUsingOIDC:              useOIDC,
		EnableAuthenticationUsingGitHubOIDC:        useOIDC,
	}

	return auth.NewAuthorizerFromCredentials(context.Background(), authConfig, api)
}
