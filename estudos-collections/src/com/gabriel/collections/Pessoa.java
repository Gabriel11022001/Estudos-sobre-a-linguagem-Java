package com.gabriel.collections;

import java.util.List;

public class Pessoa {

	private String nome;
	private String rg;
	private String cpf;
	private Email email;
	private List<Telefone> telefones;

	public Pessoa(String nome, String rg, String cpf, Email email, List<Telefone> telefones) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		if (email == null) {
			throw new RuntimeException("Informe o e-mail da pessoa!");
		}
		this.email = email;
		if (telefones == null || telefones.size() == 0) {
			throw new RuntimeException("Informe pelo menos um telefone para essa pessoa!");
		}
		this.telefones = telefones;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		if (email == null) {
			throw new RuntimeException("Informe o e-mail da pessoa!");
		}
		this.email = email;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		if (telefones == null || telefones.size() == 0) {
			throw new RuntimeException("Informe pelo menos um telefone para essa pessoa!");
		}
		this.telefones = telefones;
	}
	public void adicionarTelefone(Telefone telefone) {
		if (telefone == null) {
			throw new RuntimeException("Informe o telefone dessa pessoa!");
		}
		this.getTelefones().add(telefone);
	}
}
