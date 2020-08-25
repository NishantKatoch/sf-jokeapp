package app.springframework.joke.sfjokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SfJokeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfJokeappApplication.class, args);
	}

}
