package com.gabrielsantos.exerciciossobrepoo.exercicio11;

public class TestaBombaCombustivel {

	public static void main(String[] args) {
		try {
			BombaCombustivel bombaCombustivel = new BombaCombustivel(5, "Gasolina");
			// bombaCombustivel.abastecerPorLitro(9);
			// bombaCombustivel.abastecerPorValor(50);
			bombaCombustivel.reabastecerABomba(100);
			bombaCombustivel.abastecerPorLitro(20);
			bombaCombustivel.abastecerPorValor(50);
			bombaCombustivel.setValorLitro(5.59);
			bombaCombustivel.abastecerPorLitro(10);
			bombaCombustivel.abastecerPorLitro(12);
			bombaCombustivel.abastecerPorValor(50);
			// bombaCombustivel.abastecerPorLitro(80);
			bombaCombustivel.apresentarQuantidadeCombustivelNaBomba();
			bombaCombustivel.abastecerPorLitro(10);
			bombaCombustivel.abastecerPorLitro(12);
			bombaCombustivel.abastecerPorValor(80);
			bombaCombustivel.apresentarQuantidadeCombustivelNaBomba();
			// bombaCombustivel.abastecerPorLitro(3);
			bombaCombustivel.reabastecerABomba(100);
			bombaCombustivel.apresentarQuantidadeCombustivelNaBomba();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
