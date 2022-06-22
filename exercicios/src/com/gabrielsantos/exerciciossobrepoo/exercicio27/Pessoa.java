package com.gabrielsantos.exerciciossobrepoo.exercicio27;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private Double altura;
	private LocalDate dataNascimento;
	
	public Pessoa() {}
	public Pessoa(String nome, Double altura, LocalDate dataNascimento) {
		this.nome = nome;
		this.altura = altura;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getAltura() {
		return this.altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void apresentarDadosDaPessoa() throws Exception {
		System.out.println("Dados da pessoa:");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Data de nascimento: " + this.getDataNascimento());
		System.out.println("Altura: " + this.getAltura() + " metros");
		System.out.println("Idade: " + CalculaIdades.calcularIdade(this) + " anos.");
	}
}
