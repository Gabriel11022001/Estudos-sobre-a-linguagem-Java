package com.gabrielsantos.exerciciossobrepoo.exercicio18;

public class Exercicio18 {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Bile", "Pastor alemão");
		Gato gato = new Gato("Gatinho", "Qualquer raça");
		cachorro.latir();
		cachorro.caminhar();
		gato.miar();
		gato.caminhar();
	}
}
