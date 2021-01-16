//package com.camoleo.basicsocialmediaapp.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests()
//                .anyRequest()
//                .permitAll()
//                .and().csrf().disable();
//    }
//or @Override
//protected void configure(final HttpSecurity http) throws Exception {
//        http
//        .formLogin()
//        .loginPage("/login.html")
//        .failureUrl("/login-error.html")
//        .and()
//        .logout()
//        .logoutSuccessUrl("/index.html");
       // }
//}
