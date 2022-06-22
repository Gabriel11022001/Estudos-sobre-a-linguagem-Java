package com.gabrielsantos.exerciciossobrepoo.exercicio26;

public class TestaCocker {

	public static void main(String[] args) {
		Cocker cocker = new Cocker("Cachorro", "Preto", "Cachorro", "Cocker", true);
		System.out.println(cocker);
		System.out.println("Precisa de tosa?: " + cocker.isPrecisaDeTosa());
	}
}
