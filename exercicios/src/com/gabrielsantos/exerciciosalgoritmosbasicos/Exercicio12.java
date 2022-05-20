package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/**
		 * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo
		 * e tamanho e com os elementos do vetor A multiplicados
		 * por 2, ou seja: B[i] = A[i] * 2.
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		Integer[] vetorA = new Integer[8];
		Integer[] vetorB = new Integer[8];
		for (int contador = 0; contador < vetorA.length; contador++) {
			System.out.println("Informe o valor de vetor A no índice " + contador);
			vetorA[contador] = entradaUsuario.nextInt();
			vetorB[contador] = vetorA[contador] * 2;
		}
		System.out.println("Valores do vetor A:");
		PercorreVetor.apresentarValoresDoVetor(vetorA);
		System.out.println("Valores do vetor B:");
		PercorreVetor.apresentarValoresDoVetor(vetorB);
	}
}
