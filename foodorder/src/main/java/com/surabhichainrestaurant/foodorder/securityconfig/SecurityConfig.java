package com.surabhichainrestaurant.foodorder.securityconfig;

//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.*;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.surabhichainrestaurant.foodorder.entity.User;
//import com.surabhichainrestaurant.foodorder.repo.UserRepo;


//@Configuration
//@EnableWebSecurity
//class SecurityConfig extends WebSecurityConfiguration {
//
//}


//@Configuration
//@EnableWebSecurity
public class SecurityConfig  {
	//webSecurityConfigurerAdapter

//    @Autowired
//    private UserRepo userRepository;
//    
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(User email() {
//            User user = userRepository.findByEmail(email);
//            if (user != null) {
//                return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList());
//            } else {
//                throw new UsernameNotFoundException("User not found with email: " + email);
//            }
//        });
//    }
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
