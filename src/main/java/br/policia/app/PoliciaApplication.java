package br.policia.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.policia.app.domain.Coordinate;
import br.policia.app.domain.OcorrenciaRepository;

@SpringBootApplication
public class PoliciaApplication {

	private static final Logger log = LoggerFactory.getLogger(PoliciaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PoliciaApplication.class, args);
	}
	
}
