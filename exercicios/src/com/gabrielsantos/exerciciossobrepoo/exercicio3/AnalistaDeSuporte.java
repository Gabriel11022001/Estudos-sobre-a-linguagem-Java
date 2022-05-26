package com.gabrielsantos.exerciciossobrepoo.exercicio3;

public class AnalistaDeSuporte implements IPessoa {

	private String cpf;
	private String nome;
	
	public AnalistaDeSuporte(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	@Override
	public String getCpf() {
		return this.cpf;
	}
	@Override
	public String getNome() {
		return this.nome;
	}
}
