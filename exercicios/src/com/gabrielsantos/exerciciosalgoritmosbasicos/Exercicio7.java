package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio7 {

	private static void apresentarMaiorValor(int pv, int sv, int tv) {
		if (pv == sv && sv == tv) {
			System.out.println("Os três valores são iguais!");
			return;
		}
		if (pv > sv && pv > tv) {
			System.out.println("Maior valor: " + pv);
		} else if (sv > pv && sv > tv) {
			System.out.println("Maior valor: " + sv);
		} else if (tv > pv && tv > sv) {
			System.out.println("Maior valor: " + tv);
		} else if (
				(pv == sv && pv > tv)
				|| (pv == tv && pv > sv)
				|| (sv == tv && sv > pv)
				) {
			System.out.println("Não existe maior valor!");
		}
	}
	public static void main(String[] args) {
		/**
		 * Escreva um algoritmo que leia 3
		 * números inteiros e mostre o maior deles.
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		int primeiroValor = 0, segundoValor = 0, terceiroValor = 0;
		System.out.println("Informe o primeiro valor:");
		primeiroValor = entradaUsuario.nextInt();
		System.out.println("Informe o segundo valor:");
		segundoValor = entradaUsuario.nextInt();
		System.out.println("Informe o teceiro valor:");
		terceiroValor = entradaUsuario.nextInt();
		apresentarMaiorValor(primeiroValor, segundoValor, terceiroValor);
	}
}
