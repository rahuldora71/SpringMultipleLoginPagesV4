package net.codejava.customer;

import net.codejava.CustomAccessDeniedHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@Order(2)
public class CustomerSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public CustomAccessDeniedHandler accessDeniedHandler;
	@Bean
	public UserDetailsService customerUserDetailsService2() {
		return new CustomerUserDetailsService();
	}

	@Bean
	public PasswordEncoder passwordEncoder2() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider2() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(customerUserDetailsService2());
		authProvider.setPasswordEncoder(passwordEncoder2());

		return authProvider;
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authenticationProvider(authenticationProvider2());

		http.antMatcher("/customer/**")
			.authorizeRequests().anyRequest().hasAuthority("LIBRARIAN")
			.and()
				.formLogin()
					.loginPage("/customer/login")
					.usernameParameter("email")
					.loginProcessingUrl("/customer/login")
					.defaultSuccessUrl("/customer/home")
				.permitAll()
			.and()
				.logout()
					.logoutUrl("/customer/logout")
					.logoutSuccessUrl("/")
				.and()
				.exceptionHandling()
				.accessDeniedHandler(accessDeniedHandler);
	}
}
