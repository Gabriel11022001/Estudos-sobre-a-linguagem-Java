package com.gabrielsantos.exerciciossobrepoo.exercicio12;

public class Carro {

	private double consumoCombustivel;
	private double quantidadeLitrosGasolinaNoTanque;
	
	public Carro(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	public double obterGasolinaNoTanque() {
		return this.quantidadeLitrosGasolinaNoTanque;
	}
	public void andar(double kilometros) {
		if (kilometros <= 0) {
			throw new RuntimeException("Dist�ncia inv�lida!");
		}
		double quantidadeLitrosNecessarios = kilometros / this.consumoCombustivel;
		if (quantidadeLitrosNecessarios > this.quantidadeLitrosGasolinaNoTanque) {
			throw new RuntimeException("Voc� n�o conseguir� chegar ao destino pois voc� n�o possui combust�vel necess�rio, atualmente voc� possui " + this.quantidadeLitrosGasolinaNoTanque + " litros no tanque, para terminar a viagem voc� precisa de " + quantidadeLitrosNecessarios + " litros, ent�o, voc� precisa abastecer " + (quantidadeLitrosNecessarios - this.quantidadeLitrosGasolinaNoTanque) + " litros para completar a viagem!");
		}
		this.quantidadeLitrosGasolinaNoTanque -= quantidadeLitrosNecessarios;
		System.out.println("O carro andou " + kilometros + " kilometros!");
	}
	public void abastecer(double quantidadeLitros) {
		if (quantidadeLitros <= 0) {
			throw new RuntimeException("N�o � poss�vel abastecer essa quantidade de litros!");
		}
		this.quantidadeLitrosGasolinaNoTanque += quantidadeLitros;
	}
}
