package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/**
		 * Calcule a m?dia aritm?tica das 3 notas de um aluno e mostre,
		 * al?m do valor da m?dia, uma mensagem de "Aprovado",
		 * caso a m?dia seja igual ou superior a 6, ou a mensagem "reprovado", caso contr?rio.
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		double primeiraNota = 0;
		double segundaNota = 0;
		double terceiraNota = 0;
		double media = 0;
		System.out.println("Informe a primeira nota do aluno:");
		primeiraNota = entradaUsuario.nextDouble();
		System.out.println("Informe a segunda nota do aluno:");
		segundaNota = entradaUsuario.nextDouble();
		System.out.println("Informe a terceira nota do aluno:");
		terceiraNota = entradaUsuario.nextDouble();
		media = (primeiraNota + segundaNota + terceiraNota) / 3;
		System.out.println("A m?dia do aluno ?: " + media);
		if (media >= 6) {
			System.out.println("Aprovado!!");
		} else {
			System.out.println("Reprovado!!");
		}
	}
}
