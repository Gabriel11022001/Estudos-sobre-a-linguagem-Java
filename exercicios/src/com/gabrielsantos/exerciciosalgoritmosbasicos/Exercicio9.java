package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/**
		 * Faça um algoritmo que leia um nº inteiro e mostre uma mensagem 
		 * indicando se este número é par ou ímpar, e se é positivo ou negativo.
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		int numero = 0;
		System.out.println("Informe um número:");
		numero = entradaUsuario.nextInt();
		if (numero >= 0) {
			System.out.println("O número " + numero + " é positivo!");
		} else {
			System.out.println("O número " + numero + " é negativo!");
		}
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par!");
		} else {
			System.out.println("O número " + numero + " é impar!");
		}
	}
}
