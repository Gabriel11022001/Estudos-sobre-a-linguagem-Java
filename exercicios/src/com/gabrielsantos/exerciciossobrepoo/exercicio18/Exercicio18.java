package com.gabrielsantos.exerciciossobrepoo.exercicio18;

public class Exercicio18 {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Bile", "Pastor alem�o");
		Gato gato = new Gato("Gatinho", "Qualquer ra�a");
		cachorro.latir();
		cachorro.caminhar();
		gato.miar();
		gato.caminhar();
	}
}
