// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CacheDirectoryLdapBindArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheDirectoryLdapBindArgs Empty = new CacheDirectoryLdapBindArgs();

    /**
     * The Bind Distinguished Name (DN) identity to be used in the secure LDAP connection.
     * 
     */
    @Import(name="dn", required=true)
    private Output<String> dn;

    /**
     * @return The Bind Distinguished Name (DN) identity to be used in the secure LDAP connection.
     * 
     */
    public Output<String> dn() {
        return this.dn;
    }

    /**
     * The Bind password to be used in the secure LDAP connection.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The Bind password to be used in the secure LDAP connection.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    private CacheDirectoryLdapBindArgs() {}

    private CacheDirectoryLdapBindArgs(CacheDirectoryLdapBindArgs $) {
        this.dn = $.dn;
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheDirectoryLdapBindArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheDirectoryLdapBindArgs $;

        public Builder() {
            $ = new CacheDirectoryLdapBindArgs();
        }

        public Builder(CacheDirectoryLdapBindArgs defaults) {
            $ = new CacheDirectoryLdapBindArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dn The Bind Distinguished Name (DN) identity to be used in the secure LDAP connection.
         * 
         * @return builder
         * 
         */
        public Builder dn(Output<String> dn) {
            $.dn = dn;
            return this;
        }

        /**
         * @param dn The Bind Distinguished Name (DN) identity to be used in the secure LDAP connection.
         * 
         * @return builder
         * 
         */
        public Builder dn(String dn) {
            return dn(Output.of(dn));
        }

        /**
         * @param password The Bind password to be used in the secure LDAP connection.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The Bind password to be used in the secure LDAP connection.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public CacheDirectoryLdapBindArgs build() {
            $.dn = Objects.requireNonNull($.dn, "expected parameter 'dn' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            return $;
        }
    }

}