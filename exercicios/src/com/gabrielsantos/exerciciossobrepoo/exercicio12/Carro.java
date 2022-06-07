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
			throw new RuntimeException("Distância inválida!");
		}
		double quantidadeLitrosNecessarios = kilometros / this.consumoCombustivel;
		if (quantidadeLitrosNecessarios > this.quantidadeLitrosGasolinaNoTanque) {
			throw new RuntimeException("Você não conseguirá chegar ao destino pois você não possui combustível necessário, atualmente você possui " + this.quantidadeLitrosGasolinaNoTanque + " litros no tanque, para terminar a viagem você precisa de " + quantidadeLitrosNecessarios + " litros, então, você precisa abastecer " + (quantidadeLitrosNecessarios - this.quantidadeLitrosGasolinaNoTanque) + " litros para completar a viagem!");
		}
		this.quantidadeLitrosGasolinaNoTanque -= quantidadeLitrosNecessarios;
		System.out.println("O carro andou " + kilometros + " kilometros!");
	}
	public void abastecer(double quantidadeLitros) {
		if (quantidadeLitros <= 0) {
			throw new RuntimeException("Não é possível abastecer essa quantidade de litros!");
		}
		this.quantidadeLitrosGasolinaNoTanque += quantidadeLitros;
	}
}
