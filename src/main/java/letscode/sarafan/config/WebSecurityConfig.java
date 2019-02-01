package letscode.sarafan.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

                 http
                .authorizeRequests()
                         .mvcMatchers("/message").authenticated()
                         .mvcMatchers("/**").permitAll()
                         .and()
                .csrf().disable();

//        http
//                .antMatcher("/**")
//                .authorizeRequests()
//                .antMatchers("/", "/login**", "/webjars/**", "/error**")
//                .permitAll()
//                .anyRequest()
//                .authenticated().and().csrf().disable();


//        http
//                .antMatcher("/**")
//                .authorizeRequests()
//                .antMatchers("/", "/login**", "/webjars/**", "/error**")
//                .permitAll()
//                .anyRequest()
//                .authenticated().and()
//                .csrf().disable();


//                 http
//                .authorizeRequests()
//                         .mvcMatchers("/message").authenticated()
//                         .mvcMatchers("/**").permitAll()              ??????????????
//                         .and()
//                .csrf().disable();



//                .anyRequest().authenticated();
//        http.requestMatchers()
//                .antMatchers("/login**", "/oauth/authorize", "/logout.do")
//                .and()
//                .authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .loginProcessingUrl("/login.do")
//                .usernameParameter("username")
//                .passwordParameter("password")/*
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout.do"))*/
//                .permitAll()
//                .and()
//                .userDetailsService(userDetailsServiceBean());
//        http
//                .authorizeRequests()
//                .mvcMatchers("/").permitAll()
//                .anyRequest().authenticated();
////                .and()
////                .csrf().disable();  // what is token??
    }

//    @Bean
//    public PrincipalExtractor principalExtractor(UserDetailsRepo userDetailsRepo) {
//        return map -> {
//            String id = (String) map.get("sub");
//
//            User user = userDetailsRepo.findById(id).orElseGet(() -> {
//                User newUser = new User();
//
//                newUser.setId(id);
//                newUser.setName((String) map.get("name"));
//                newUser.setEmail((String) map.get("email"));
//                newUser.setGender((String) map.get("gender"));
//                newUser.setLocale((String) map.get("locale"));
//                newUser.setUserpic((String) map.get("picture"));
//
//                return newUser;
//            });
//
//            user.setLastVisit(LocalDateTime.now());
//
//            return userDetailsRepo.save(user);
//        };
//    }
}
