package com.group_c.velo;

import com.group_c.velo.entity.User;
import com.group_c.velo.repository.UserRepository;
import com.group_c.velo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class VeloApplication implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(VeloApplication.class, args);
	}

	@Override
	public void run(String... args){
//		User user = new User(
//				102003516L,
//				"password_test",
//				"Kumar",
//				"Aadarsh",
//				"9041844219",
//				"O");
//		userRepository.save(user);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
