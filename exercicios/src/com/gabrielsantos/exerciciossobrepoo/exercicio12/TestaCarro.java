package com.gabrielsantos.exerciciossobrepoo.exercicio12;

public class TestaCarro {

	public static void main(String[] args) {
		try {
			Carro carro = new Carro(12);
			// carro.andar(20);
			carro.abastecer(20);
			carro.andar(40);
			carro.andar(20);
			carro.andar(100);
			// carro.andar(100);
			carro.abastecer(10);
			carro.andar(100);
			System.out.println(carro.obterGasolinaNoTanque());
			carro.andar(90);
			System.out.println(carro.obterGasolinaNoTanque());
			carro.andar(1);
			carro.andar(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
