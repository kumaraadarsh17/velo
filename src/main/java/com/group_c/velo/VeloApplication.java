package com.group_c.velo;

import com.group_c.velo.entity.User;
import com.group_c.velo.repository.UserRepository;
import com.group_c.velo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeloApplication implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(VeloApplication.class, args);
	}

	@Override
	public void run(String... args){
		User user = new User(
				102003516L,
				"Kumar",
				"Aadarsh",
				"9041844219",
				"O");
		userRepository.save(user);
	}
}
