package fr.etudiantsdefrance.bakasana;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "fr.etudiantsdefrance.bakasana.repository")
public class BakasanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BakasanaApplication.class, args);
	}
}
