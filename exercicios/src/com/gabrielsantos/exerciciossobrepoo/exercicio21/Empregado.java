package com.gabrielsantos.exerciciossobrepoo.exercicio21;

public class Empregado {

	private String nome;
	private String sobrenome;
	private Double salarioMensal;
	
	public Empregado() {}
	public Empregado(String nome, String sobrenome, Double salarioMensal) {
		
	}
	public void setNome(String nome) throws Exception {
		if (nome.equals("") || nome.isEmpty()) {
			throw new Exception("Informe o nome do empregado!");
		}
		this.nome = nome;
	}
	public String getNome() throws Exception {
		if (this.nome == null || this.nome.equals("")) {
			throw new Exception("O nome do empregado ainda não foi informado, informe o nome do empregado!");
		}
		return this.nome;
	}
	
}
