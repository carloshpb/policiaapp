package br.policia.app.domain;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.hibernate.type.EnumType;

public class Ocorrencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idOcorrencia;
	
	@Type(type="br.policia.app.domain.Protocolo")
	@Column(name = "protocolo")
	private CidadaoCivil civil;
	
	@Type(type="br.policia.app.domain.Protocolo")
	@Column(name = "protocolo")
	private CidadaoPolicial policial;
	
	@Column(name = "nro_ocorrencia")
	private Integer nroOcorrencia;
	
	@Enumerated(EnumType.STRING)
	private TipoOcorrencia tipoOcorrencia;
	
	@Type(type="br.policia.app.domain.Protocolo")
	@Column(name = "protocolo")
	private Protocolo protocolo;
	
	public Ocorrencia(CidadaoCivil civil) {
		this.civil = civil;
	}

	public CidadaoCivil getCivil() {
		return civil;
	}

	public void setCivil(CidadaoCivil civil) {
		this.civil = civil;
	}

	public CidadaoPolicial getPolicial() {
		return policial;
	}

	public void setPolicial(CidadaoPolicial policial) {
		this.policial = policial;
	}

	public Integer getNroOcorrencia() {
		return nroOcorrencia;
	}

	public void setNroOcorrencia(Integer nroOcorrencia) {
		this.nroOcorrencia = nroOcorrencia;
	}

	public Protocolo getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Protocolo protocolo) {
		this.protocolo = protocolo;
	}

	public TipoOcorrencia getTipoOcorrencia() {
		return tipoOcorrencia;
	}

	public void setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
	}
}
