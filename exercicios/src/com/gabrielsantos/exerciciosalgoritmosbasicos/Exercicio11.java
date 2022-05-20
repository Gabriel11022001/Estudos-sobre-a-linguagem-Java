package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/**
		 * Criar um vetor A com 5 elementos inteiros. Construir 
		 * um vetor B de mesmo tipo e tamanho
		 * e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		int[] vetorA = new int[5];
		int[] vetorB = new int[5];
		for (int contador = 0; contador < vetorA.length; contador++) {
			System.out.println("Informe o valor de vetor A no índice " + contador);
			vetorA[contador] = entradaUsuario.nextInt();
			vetorB[contador] = vetorA[contador];
		}
		System.out.println("**********************************");
		System.out.println("Valores do vetor A:");
		for (int contador = 0; contador < vetorA.length; contador++) {
			System.out.println("Vetor a [" + contador + "] = " + vetorA[contador]);
		}
		System.out.println("**********************************");
		System.out.println("Valores do vetor B:");
		for (int contador = 0; contador < vetorB.length; contador++) {
			System.out.println("Vator b [" + contador + "] = " + vetorB[contador]);
		}
	}
}
