package com.gabrielsantos.exerciciossobrepoo.exercicio18;

public class Cachorro extends Animal {

	public Cachorro() {
		super();
	}
	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}
	public void latir() {
		System.out.println("O cachorrinho de nome " + super.getNome() + " e da raça " + super.getRaca() + " está latindo, AU AU AU!");
	}
}
