package com.gabrielsantos.exerciciossobrepoo.exercicio8;

public class Quadrado {

	private double tamanhoLado;
	
	public void setTamanhoLado(double tamanhoLado) {
		if (tamanhoLado <= 0) {
			throw new RuntimeException("O valor do lado do quadrado deve ser maior que 0 cm!");
		}
		this.tamanhoLado = tamanhoLado;
	}
	public double getTamanhoDoLado() {
		return this.tamanhoLado;
	}
	public double calcularAreaDoQuadrado() {
		return this.tamanhoLado * this.tamanhoLado;
	}
}
