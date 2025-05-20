package ch.leon_brodbeck.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class TemplateApplication {
	private static final Logger log = LoggerFactory.getLogger(TemplateApplication.class);

	public static void main(String[] args) {
		log.info("Starting Template application");
		SpringApplication.run(TemplateApplication.class, args);
	}

}
