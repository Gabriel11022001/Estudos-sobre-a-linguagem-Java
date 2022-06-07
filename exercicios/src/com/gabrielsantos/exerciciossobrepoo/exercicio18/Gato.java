package com.gabrielsantos.exerciciossobrepoo.exercicio18;

public class Gato extends Animal {

	public Gato() {
		super();
	}
	public Gato(String nome, String raca) {
		super(nome, raca);
	}
	public void miar() {
		System.out.println("O gatinho de nome " + super.getNome() + " e da raça " + super.getRaca() + " está miando, MIAU MIAU!");
	}
}
