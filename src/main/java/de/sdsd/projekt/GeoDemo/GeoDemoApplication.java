package de.sdsd.projekt.GeoDemo;

import de.sdsd.projekt.GeoDemo.model.User;
import de.sdsd.projekt.GeoDemo.repository.UserDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan
public class GeoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeoDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UserDao userDao) {
		return strings -> {

			User user = new User();
			user.setName("Gagan");
			user.setPassword("Pass");
			user.setUsername("gagan");

			userDao.save(user);
		};
	}
}
