package com.gabrielsantos.exerciciossobrepoo.exercicio18;

public abstract class Animal {

	private String nome;
	private String raca;
	
	public Animal() {}
	public Animal(String nome, String raca) {
		this.setNome(nome);
		this.setRaca(raca);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getRaca() {
		return this.raca;
	}
	public void caminhar() {
		System.out.println("O animalzinho de nome " + this.getNome() + " e da raça " + this.getRaca() + " está caminhando...");
	}
}
