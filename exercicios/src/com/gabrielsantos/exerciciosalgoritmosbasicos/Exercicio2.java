package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/**
		 * Escreva um algoritmo que leia tr?s n?meros inteiros e positivos (A, B, C) e calcule a seguinte express?o:
		 * D = (R + S) / 2 onde R = (A + B)? e S = (B + C)?
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		double a = 0, b = 0, c = 0, r = 0, s = 0, d = 0;
		System.out.println("Informe o valor de A:");
		a = entradaUsuario.nextDouble();
		System.out.println("Informe o valor de B:");
		b = entradaUsuario.nextDouble();
		System.out.println("Informe o valor de C:");
		c = entradaUsuario.nextDouble();
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r + s) / 2;
		System.out.println("O valor de A ? igual a: " + a);
		System.out.println("O valor de B ? igual a: " + b);
		System.out.println("O valor de C ? igual a: " + c);
		System.out.println("O valor de R ? igual a: " + r);
		System.out.println("O valor de S ? igual a: " + s);
		System.out.println("O valor de D ? igual a: " + d);
	}
}
