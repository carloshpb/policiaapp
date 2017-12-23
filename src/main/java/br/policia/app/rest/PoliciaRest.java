package br.policia.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.policia.app.domain.Ocorrencia;
import br.policia.app.domain.OcorrenciaRepository;

@RestController
@RequestMapping("/gps")
public class PoliciaRest {

	@Autowired
	OcorrenciaRepository coordinateRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/listarOcorrencias")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Iterable<Ocorrencia> listarOcorrencias() {

		return coordinateRepository.findAll();

	}

}
