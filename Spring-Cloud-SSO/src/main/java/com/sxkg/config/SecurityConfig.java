package com.sxkg.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Description:在接口上配置权限时使用
 *
 * @author JourWon
 * @date 2019/12/24 16:24
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(-1)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors()
        .and()
        .csrf().disable().authorizeRequests()
        //允许以下请求
        //.antMatchers("").permitAll()
        // 所有请求需要身份认证
        .anyRequest().authenticated()
        .and().oauth2Login().failureUrl("http://localhost:8085/user/getCurrentUser");
        ;
	}
}