package com.gabrielsantos.exerciciossobrepoo.exercicio19;

public class Passageiro {

	private String nome;
	private String cpf;
	
	public Passageiro(String nome, String cpf) throws Exception {
		this.setNome(nome);
		this.setCpf(cpf);
	}
	public void setNome(String nome) throws Exception {
		if (nome.equals("") || nome.isEmpty()) {
			throw new Exception("Informe o nome do passageiro!");
		}
		this.nome = nome;
	}
	public String getNome() throws Exception {
		if (this.nome.equals("") || this.nome.isEmpty()) {
			throw new Exception("Informe o nome do passageiro!");
		}
		return this.nome;
	}
	public void setCpf(String cpf) throws Exception {
		if (cpf.equals("") || cpf.isEmpty()) {
			throw new Exception("Informe o cpf do passageiro!");
		}
		this.cpf = cpf;
	}
	public String getCpf() throws Exception {
		if (this.cpf.equals("") || this.cpf.isEmpty()) {
			throw new Exception("Informe o cpf do passageiro!");
		}
		return this.cpf;
	}
}
