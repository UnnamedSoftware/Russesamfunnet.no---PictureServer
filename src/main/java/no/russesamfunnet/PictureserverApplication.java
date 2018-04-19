package no.russesamfunnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class PictureserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PictureserverApplication.class, args);
	}
}
