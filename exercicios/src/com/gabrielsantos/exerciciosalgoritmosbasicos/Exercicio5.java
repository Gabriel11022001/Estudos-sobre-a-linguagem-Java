package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/**
		 * Elaborar um algoritmo que l� 2 valores a e b e os escreve com a mensagem:
		 * "S�o m�ltiplos" ou "N�o s�o m�ltiplos".
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		int primeiroValor = 0, segundoValor = 0, maior = 0, menor = 0;
		boolean existeMaior = false;
		System.out.println("Informe o primeiro valor:");
		primeiroValor = entradaUsuario.nextInt();
		System.out.println("Informe o segundo valor:");
		segundoValor = entradaUsuario.nextInt();
		if (primeiroValor > segundoValor) {
			maior = primeiroValor;
			menor = segundoValor;
			existeMaior = true;
		} else if (segundoValor > primeiroValor) {
			maior = segundoValor;
			menor = primeiroValor;
			existeMaior = true;
		}
		if (existeMaior == false) {
			System.out.println(primeiroValor + " e " + segundoValor + " s�o m�ltiplos!");
		} else {
			if ((maior % menor) == 0) {
				System.out.println(maior + " e " + menor + " s�o m�ltiplos!");
			} else {
				System.out.println(primeiroValor + " e " + segundoValor + " n�o s�o m�ltiplos!");
			}
		}
	}
}
