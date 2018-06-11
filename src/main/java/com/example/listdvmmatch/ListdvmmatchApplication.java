package com.example.listdvmmatch;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.listdvmmatch.repository")
public class ListdvmmatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListdvmmatchApplication.class, args);
	}
}
