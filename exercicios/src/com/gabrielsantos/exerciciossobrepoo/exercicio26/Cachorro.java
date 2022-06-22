package com.gabrielsantos.exerciciossobrepoo.exercicio26;

public abstract class Cachorro extends Animal {

	private String raca;
	private String nome;
	
	public Cachorro(String tipo, String cor, String nome, String raca) {
		super(tipo, cor);
		this.setNome(nome);
		this.setRaca(raca);
	}
	public String getRaca() {
		return this.raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return super.toString() + " | Raça: " + this.getRaca() + " | Nome: " + this.getNome();
	}
}
