package az.edu.usersms;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UsersMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersMsApplication.class, args);
	}

	@Bean
	public CommandLineRunner testLiquibase(@Autowired(required = false) SpringLiquibase liquibase) {
		return args -> {
			if (liquibase != null) {
				System.out.println("✅ Liquibase bean tapıldı və aktivdir.");
			} else {
				System.out.println("❌ Liquibase bean TAPILMADI! Problem var.");
			}
		};
	}
}
