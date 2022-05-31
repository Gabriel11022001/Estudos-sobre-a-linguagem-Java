package com.gabrielsantos.exerciciossobrepoo.exercicio7;

public class Bola {

	private String cor;
	private double circunferencia;
	private String material;
	
	public Bola(String cor) {
		this.cor = cor;
	}
	public void trocarCor(String novaCor) {
		this.cor = novaCor;
	}
	public void mostrarCor() {
		System.out.println("Cor: " + this.cor);
	}
}
