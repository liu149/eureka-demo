package com.example.eurekademo.config;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configurers.ldap.LdapAuthenticationProviderConfigurer;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.ldap.authentication.BindAuthenticator;
//import org.springframework.security.ldap.authentication.LdapAuthenticationProvider;
//import org.springframework.security.ldap.ppolicy.PasswordPolicyAwareContextSource;
//import org.springframework.security.ldap.search.FilterBasedLdapUserSearch;
//import org.springframework.security.ldap.userdetails.DefaultLdapAuthoritiesPopulator;


//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@PropertySource("classpath:security.properties")
public class XroadSSOSecurity /*extends WebSecurityConfigurerAdapter*/ {

//	@Value("${ldap.server}")
//	private String adServer;
//
//	@Value("${ldap.searchRoot}")
//	private String searchRoot;
//
//	@Value("${ldap.userName}")
//	private String userName;
//
//	@Value("${ldap.password}")
//	private String password;
//
//	@Value("${ldap.userSearchBase}")
//	private String userSearchBase;
//
//	@Value("${xroad.userName}")
//	private String xroadUserName;
//
//	@Value("${xroad.password}")
//	private String xroadPassword;
//
//	@Value("${ldap.searchFilter}")
//	private String searchFilter;
//
//
//
//	@Bean
//	public LdapAuthenticationProvider ldapAuthenticationProvider(){
//		final PasswordPolicyAwareContextSource passwordPolicyAwareContextSource = getPasswordPolicyAwareContext();
//		final BindAuthenticator authenticator = new BindAuthenticator(passwordPolicyAwareContextSource);
//		authenticator.setUserSearch(new FilterBasedLdapUserSearch(userSearchBase,searchFilter,passwordPolicyAwareContextSource));
//		final DefaultLdapAuthoritiesPopulator ldapAuthoritiesPopulator = new DefaultLdapAuthoritiesPopulator(passwordPolicyAwareContextSource,"");
//		ldapAuthoritiesPopulator.setSearchSubtree(true);
//		return new LdapAuthenticationProvider(authenticator, ldapAuthoritiesPopulator);
//	}
//
//	@Bean
//	public PasswordPolicyAwareContextSource getPasswordPolicyAwareContext(){
//		final PasswordPolicyAwareContextSource contextSource = new PasswordPolicyAwareContextSource(adServer + "/" + searchRoot);
//		contextSource.setBase(searchRoot);
//		contextSource.setUrl(adServer);
//		contextSource.setUserDn(userName);
//		contextSource.setPassword(password);
//		contextSource.setPooled(true);
//		return contextSource;
//	}
//
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(ldapAuthenticationProvider());
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.authorizeRequests()
//
//				.anyRequest().permitAll()
//				.and()
//				.formLogin();
//	}
}
