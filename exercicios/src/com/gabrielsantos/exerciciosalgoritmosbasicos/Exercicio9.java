package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/**
		 * Fa�a um algoritmo que leia um n� inteiro e mostre uma mensagem 
		 * indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		int numero = 0;
		System.out.println("Informe um n�mero:");
		numero = entradaUsuario.nextInt();
		if (numero >= 0) {
			System.out.println("O n�mero " + numero + " � positivo!");
		} else {
			System.out.println("O n�mero " + numero + " � negativo!");
		}
		if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par!");
		} else {
			System.out.println("O n�mero " + numero + " � impar!");
		}
	}
}
