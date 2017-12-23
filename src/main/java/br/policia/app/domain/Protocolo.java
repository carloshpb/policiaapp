package br.policia.app.domain;

import java.util.List;
import java.util.Random;

public class Protocolo {

	private Long idProtocol;
	private String cpfCivil;
	private List<CidadaoPolicial> policiais;
	private List<String> viaturas;
	
	public Protocolo(CidadaoCivil civil, List<CidadaoPolicial> policiais, List<String> viaturas) {
		this.cpfCivil = civil.getCpf();
		this.policiais = policiais;
		this.viaturas = viaturas;
		
		Random gerador = new Random();
		//Necessário verificar se já existe um número de protocolo. Necessidade de banco de dados.
		idProtocol = (long) gerador.nextInt(1000000000);
	}
	
	public Long getIdProtocol() {
		return idProtocol;
	}
	public void setIdProtocol(Long idProtocol) {
		this.idProtocol = idProtocol;
	}
	public List<CidadaoPolicial> getPoliciais() {
		return policiais;
	}
	public void setPoliciais(List<CidadaoPolicial> policiais) {
		this.policiais = policiais;
	}
	public List<String> getViaturas() {
		return viaturas;
	}
	public void setViaturas(List<String> viaturas) {
		this.viaturas = viaturas;
	}

	public String getCpfCivil() {
		return cpfCivil;
	}

	public void setCpfCivil(String cpfCivil) {
		this.cpfCivil = cpfCivil;
	}
	
	
}
