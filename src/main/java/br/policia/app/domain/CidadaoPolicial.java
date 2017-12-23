package br.policia.app.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CidadaoPolicial extends Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPolicial;
	
	public CidadaoPolicial(String nomeUsuario, String nome, String cpf, String rg, String email, String endereco,
			Date dataNasc, String senha) {
		super(nomeUsuario, nome, cpf, rg, email, endereco, dataNasc, senha);
	}

	public Integer getIdPolicial() {
		return idPolicial;
	}

	public void setIdPolicial(Integer idPolicial) {
		this.idPolicial = idPolicial;
	}

}
