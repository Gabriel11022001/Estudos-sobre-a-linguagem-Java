package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/**
		 * Escreva um algoritmo que leia o c�digo de um aluno e suas tr�s notas. 
		 * Calcule a m�dia ponderada do aluno, considerando que o peso para a maior nota
		 * seja 4 e para as duas restantes, 3. Mostre o c�digo do aluno, suas tr�s notas, 
		 * a m�dia calculada e uma mensagem "APROVADO" se a m�dia for maior ou igual a 5 e
		 * "REPROVADO" se a m�dia for menor que 5.
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, nota3 = 0, maiorNota = 0, mediaPonderada = 0, menor1 = 0, menor2 = 0;
		int codigo = 0;
		boolean existeMaiorNota = true;
		System.out.println("Informe o c�digo do aluno:");
		codigo = entradaUsuario.nextInt();
		System.out.println("Informe a primeira nota do aluno:");
		nota1 = entradaUsuario.nextDouble();
		System.out.println("Informe a segunda nota do aluno:");
		nota2 = entradaUsuario.nextDouble();
		System.out.println("Informe a terceira nota do aluno:");
		nota3 = entradaUsuario.nextDouble();
		if (((nota1 == nota2) && (nota2 == nota3)) || ((nota1 == nota2) && (nota1 > nota3)) || ((nota1 == nota3) && (nota1 > nota2)) || ((nota2 == nota3) && (nota2 > nota1))) {
			existeMaiorNota = false;
		} else if ((nota1 > nota2) && (nota1 > nota3)) {
			existeMaiorNota = true;
			maiorNota = nota1;
			menor1 = nota2;
			menor2 = nota3;
		} else if ((nota2 > nota1) && (nota2 > nota3)) {
			existeMaiorNota = true;
			maiorNota = nota2;
			menor1 = nota1;
			menor2 = nota3;
		} else {
			existeMaiorNota = true;
			maiorNota = nota3;
			menor1 = nota1;
			menor2 = nota2;
		}
		if (existeMaiorNota) {
			mediaPonderada = ((maiorNota * 4) + (menor1 * 3) + (menor2 * 3)) / 10;
		} else {
			System.out.println("Como n�o existe a maior nota, defini que todas as notas ter�o peso 3!");
			mediaPonderada = ((nota1 * 3) + (nota2 * 3) + (nota3 * 3)) / 9;
		}
		System.out.println("C�digo do aluno: " + codigo);
		System.out.println("M�dia ponderada: " + mediaPonderada);
		if (mediaPonderada >= 5) {
			System.out.println("APROVADO!");
		} else {
			System.out.println("REPROVADO!");
		}
	}
}
