package no.russesamfunnet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import no.russesamfunnet.storage.StorageService;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class PictureserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PictureserverApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
           
            storageService.init();
        };
    }
	
	
}
