package com.lyh.frame.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
//                        필요할 시 아래 경로 바꿀 것
                                .requestMatchers("/","/favicon.ico","/css/**", "/images/**","/js/**","/test", "/home", "/login", "/register", "/goRegister", "/goLogin").permitAll()
                                .requestMatchers("/logout").hasAuthority("user")
//                        .requestMatchers("/user/**").hasRole("user")
                                .anyRequest().authenticated()
                )
                .formLogin(formLogin -> formLogin
                                .loginPage("/login")
//                                .usernameParameter("userId")
//                                .passwordParameter("password")
                                .permitAll()
//                        .loginProcessingUrl("/")
                                .defaultSuccessUrl("/home", true)
                )
                .logout(logout -> logout
                        .permitAll()
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/home")
                );



//                        .requestMatchers(new AntPathRequestMatcher("/**")).permitAll())
        // 인증되지 않은 모든 페이지의 요청을 허락한다는 의미
        // 이것만 했을 땐 csrf 방어 기능에 의해 때 접근 권한 X
//                .csrf((csrf) -> csrf.ignoringRequestMatchers(new AntPathRequestMatcher("/**")));
        // /으로 시작하는 모든 URL은 csrf 검증 X
        return http.build();
    }


    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



}
