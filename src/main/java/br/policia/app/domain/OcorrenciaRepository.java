package br.policia.app.domain;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface OcorrenciaRepository extends CrudRepository<Ocorrencia, Integer>{
	
	List<Ocorrencia> findByIdOcorrencia(Integer id);
	
}
