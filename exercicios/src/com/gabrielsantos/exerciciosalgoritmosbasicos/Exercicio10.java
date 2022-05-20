package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/**
		 * Tendo como dados de entrada a altura e o sexo de uma pessoa (?M? masculino e ?F? feminino),
		 * construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
		 * - para homens: (72.7*h)-58
		 * - para mulheres: (62.1*h)-44.7
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		double altura = 0, pesoIdeal = 0;
		String sexo = "";
		while (sexo.equals("M") == false && sexo.equals("F") == false) {
			System.out.println("Informe seu sexo: M - Masculino, F - Feminino:");
			sexo = entradaUsuario.nextLine();
			if (sexo.equals("M") || sexo.equals("F")) {
				System.out.println("Informe sua altura:");
				altura = entradaUsuario.nextDouble();
				if (sexo.equals("M")) {
					pesoIdeal = (72.7 * altura) - 58;
				} else {
					pesoIdeal = (62.1 * altura) - 44.7;
				}
				System.out.println("Sua altura é: " + altura + " metros.");
				System.out.println("Seu peso ideal é: " + pesoIdeal + "Kg.");
			} else {
				System.out.println("Sexo inválido, informe M para Masculino ou F para Feminino!");
			}
		}
	}
}
