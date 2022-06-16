package com.gabrielsantos.exerciciossobrepoo.exercicio23;

public class TestaMaiorMenor {

	public static void main(String[] args) {
		try {
			BuscaMaiorMenor buscaMaiorMenor = new BuscaMaiorMenor(12.0, 1.87, 14.7, 7.65, 2.87);
			System.out.println(buscaMaiorMenor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
