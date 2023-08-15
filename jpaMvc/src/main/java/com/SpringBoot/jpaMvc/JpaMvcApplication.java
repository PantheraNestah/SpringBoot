package com.SpringBoot.jpaMvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.SpringBoot.jpaMvc.repository")
@EntityScan(basePackages = "com.SpringBoot.jpaMvc.model")
public class JpaMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaMvcApplication.class, args);
	}

}
