// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKey {
    /**
     * @return The RSA parameter exponent.
     * 
     */
    private @Nullable String rsaTokenKeyExponent;
    /**
     * @return The RSA parameter modulus.
     * 
     */
    private @Nullable String rsaTokenKeyModulus;
    /**
     * @return The key value of the key. Specifies a symmetric key for token validation.
     * 
     */
    private @Nullable String symmetricTokenKey;
    /**
     * @return The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET). Specifies a certificate for token validation.
     * 
     */
    private @Nullable String x509TokenKeyRaw;

    private ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKey() {}
    /**
     * @return The RSA parameter exponent.
     * 
     */
    public Optional<String> rsaTokenKeyExponent() {
        return Optional.ofNullable(this.rsaTokenKeyExponent);
    }
    /**
     * @return The RSA parameter modulus.
     * 
     */
    public Optional<String> rsaTokenKeyModulus() {
        return Optional.ofNullable(this.rsaTokenKeyModulus);
    }
    /**
     * @return The key value of the key. Specifies a symmetric key for token validation.
     * 
     */
    public Optional<String> symmetricTokenKey() {
        return Optional.ofNullable(this.symmetricTokenKey);
    }
    /**
     * @return The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET). Specifies a certificate for token validation.
     * 
     */
    public Optional<String> x509TokenKeyRaw() {
        return Optional.ofNullable(this.x509TokenKeyRaw);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String rsaTokenKeyExponent;
        private @Nullable String rsaTokenKeyModulus;
        private @Nullable String symmetricTokenKey;
        private @Nullable String x509TokenKeyRaw;
        public Builder() {}
        public Builder(ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rsaTokenKeyExponent = defaults.rsaTokenKeyExponent;
    	      this.rsaTokenKeyModulus = defaults.rsaTokenKeyModulus;
    	      this.symmetricTokenKey = defaults.symmetricTokenKey;
    	      this.x509TokenKeyRaw = defaults.x509TokenKeyRaw;
        }

        @CustomType.Setter
        public Builder rsaTokenKeyExponent(@Nullable String rsaTokenKeyExponent) {
            this.rsaTokenKeyExponent = rsaTokenKeyExponent;
            return this;
        }
        @CustomType.Setter
        public Builder rsaTokenKeyModulus(@Nullable String rsaTokenKeyModulus) {
            this.rsaTokenKeyModulus = rsaTokenKeyModulus;
            return this;
        }
        @CustomType.Setter
        public Builder symmetricTokenKey(@Nullable String symmetricTokenKey) {
            this.symmetricTokenKey = symmetricTokenKey;
            return this;
        }
        @CustomType.Setter
        public Builder x509TokenKeyRaw(@Nullable String x509TokenKeyRaw) {
            this.x509TokenKeyRaw = x509TokenKeyRaw;
            return this;
        }
        public ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKey build() {
            final var o = new ContentKeyPolicyPolicyOptionTokenRestrictionAlternateKey();
            o.rsaTokenKeyExponent = rsaTokenKeyExponent;
            o.rsaTokenKeyModulus = rsaTokenKeyModulus;
            o.symmetricTokenKey = symmetricTokenKey;
            o.x509TokenKeyRaw = x509TokenKeyRaw;
            return o;
        }
    }
}