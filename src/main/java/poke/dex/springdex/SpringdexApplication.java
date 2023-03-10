package poke.dex.springdex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import pt.figtreestudios.springpokeapi.config.SpringPokeApiConfig;

@SpringBootApplication
@Import(SpringPokeApiConfig.class)
public class SpringdexApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdexApplication.class, args);
	}

}
