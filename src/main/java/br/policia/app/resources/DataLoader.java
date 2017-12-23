package br.policia.app.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.policia.app.domain.Coordinate;
import br.policia.app.domain.OcorrenciaRepository;

@Component
public class DataLoader implements ApplicationRunner {

    private OcorrenciaRepository repository;

    @Autowired
    public DataLoader(OcorrenciaRepository repository) {
        this.repository = repository;
    }

    public void run(ApplicationArguments args) {
    }
}
