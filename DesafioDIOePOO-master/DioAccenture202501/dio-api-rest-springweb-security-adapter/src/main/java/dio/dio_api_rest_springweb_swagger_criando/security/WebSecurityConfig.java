package dio.dio_api_rest_springweb_swagger_criando.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig  {
	
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
		
		UserDetails user = User.withUsername("johnh1")
							.password(encoder.encode("senha"))
							.roles("user").build();
		
		return new InMemoryUserDetailsManager(user);
		
	}
		
	
	
    /*@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/dio/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(withDefaults())
            .httpBasic(withDefaults());
        return http.build();
    }*/
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		// AJUSTAR A SEGURANCA PARA OUTRAS ROLE E USUARIO
		// AJUSTAR PARA SEGURANCA PARA CADA VERBO:  POST, GET, etc.
		
	    http
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/").permitAll()       // rotas públicas AJUSTAR TUDO
	            .requestMatchers("/dio/getusuarios**").hasRole("user")   // só ADMIN acessa
	            .requestMatchers("/dio/**").hasRole("manager")     // só USER acessa
	            .anyRequest().authenticated()                    // o resto precisa login
	        )
	        .formLogin(withDefaults())
	        .httpBasic(withDefaults());
	    return http.build();
	}

	
    
	
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	

    
}
