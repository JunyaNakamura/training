package jp.genuine.training.scheduler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import jp.genuine.training.scheduler.service.user.SchedulerUserDetailsServiceImpl;

@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers(
					"/webjars/**",
					"/images/**",
					"/css/**",
					"/js/**",
					"/errors/**",
					"/login",
					"/logout",
					"/account/register",
					"/healthcheck").permitAll()
			.anyRequest().hasAnyRole("USER","ADMIN");

		http.formLogin()
				.loginPage("/login")
				.failureUrl("/login?error").permitAll()
        	.defaultSuccessUrl("/index");

		http.logout()
    		.logoutRequestMatcher( new AntPathRequestMatcher( "/logout" ) );

		http.csrf();
	}

    @Override
    protected void configure( AuthenticationManagerBuilder auth ) throws Exception{
    	auth.userDetailsService(schedulerUserDetailsService());
    }

    @Bean
    public UserDetailsService schedulerUserDetailsService(){
    	return new SchedulerUserDetailsServiceImpl();
    }

}
