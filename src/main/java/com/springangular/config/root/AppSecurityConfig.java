package com.springangular.config.root;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;

import com.springangular.filter.CsrfHeaderFilter;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
        .antMatchers("/").permitAll()
        .antMatchers("/admin/**").access("hasRole('ADMIN')")
        .antMatchers("/user/**").access("hasRole('ADMIN') and hasRole('USER')")
        .and().formLogin().loginPage("/login")
        .usernameParameter("username").passwordParameter("password")
        .and().exceptionHandling().accessDeniedPage("/denied")
		
		.and().addFilterAfter(new CsrfHeaderFilter(), CsrfFilter.class);
	}
}
