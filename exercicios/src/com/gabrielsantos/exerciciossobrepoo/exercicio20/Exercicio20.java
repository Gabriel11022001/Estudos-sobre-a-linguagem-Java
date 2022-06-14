package com.gabrielsantos.exerciciossobrepoo.exercicio20;

public class Exercicio20 {

	public static void main(String[] args) {
		try {
			Fatura fatura = new Fatura("Fatura 1", 12345, 21, 7.98);
			System.out.println("Valor total da fatura: R$" + fatura.calcularValorTotalFatura());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
