package br.policia.app.domain;

import java.util.Date;

import javax.persistence.Column;

public abstract class Pessoa {

	@Column(name = "user")
	private String nomeUsuario;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "rg")
	private String rg;

	@Column(name = "email")
	private String email;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "data")
	private Date dataNasc;

	@Column(name = "senha")
	private String senha;

	public Pessoa(String nomeUsuario, String nome, String cpf, String rg, String email, String endereco, Date dataNasc,
			String senha) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
		this.senha = senha;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
