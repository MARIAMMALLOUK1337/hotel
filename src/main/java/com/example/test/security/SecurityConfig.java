//package com.example.test.security;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig  {
//
//    @Bean
//    BCryptPasswordEncoder bCryptPasswordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity.formLogin(Customizer.withDefaults())
//                .httpBasic(Customizer.withDefaults())
//                .authorizeHttpRequests(
//                        authCustomizer ->authCustomizer.requestMatchers("/createClient1","/DeleteOwner","/UpdateOwner","EditOwner").hasRole("ADMIN")
//                                .requestMatchers("/DeleteClient1","/saveClient1","/ajouter","/EditLivre","/saveLivre","/ListeLivre").hasAnyRole("ADMIN","USER")
//
//                                .anyRequest().authenticated()
//                )
//                .exceptionHandling(e->e.accessDeniedPage("/accessDenied"))
//                .build();
//    }
//}
//
//
