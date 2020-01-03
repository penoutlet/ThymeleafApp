//package com.samjones.ThymeleafCrud.security;
//
////import org.springframework.cloud.security.oauth2.sso.EnableOAuth2Sso;
//        import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
//        import org.springframework.context.annotation.Configuration;
//        import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//        import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//        import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
//
//@EnableOAuth2Sso
//@Configuration
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////        super.configure(http);
//        http
//                .csrf()
//                .disable()
//                .antMatcher("/**")
//                .authorizeRequests()
//                .antMatchers("/", "", "/index")
//                .permitAll();
////                .anyRequest()
////                .authenticated();
//    }
//}
