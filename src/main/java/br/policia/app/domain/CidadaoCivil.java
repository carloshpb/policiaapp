package br.policia.app.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "civil")
public class CidadaoCivil extends Pessoa{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCivil;
	
	public CidadaoCivil(String nomeUsuario, String nome, String cpf, String rg, String email, String endereco,
			Date dataNasc, String senha) {
		super(nomeUsuario, nome, cpf, rg, email, endereco, dataNasc, senha);
		
	}

	public Integer getIdCivil() {
		return idCivil;
	}

	public void setIdCivil(Integer idCivil) {
		this.idCivil = idCivil;
	}

}
