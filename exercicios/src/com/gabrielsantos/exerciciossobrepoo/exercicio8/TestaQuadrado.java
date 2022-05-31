package com.gabrielsantos.exerciciossobrepoo.exercicio8;

public class TestaQuadrado {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		try {
			// quadrado.setTamanhoLado(0);
			quadrado.setTamanhoLado(12);
			System.out.println("Área do quadrado: " + quadrado.calcularAreaDoQuadrado() + " cm");
			quadrado.setTamanhoLado(6);
			System.out.println("Área do quadrado: " + quadrado.calcularAreaDoQuadrado() + " cm");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
