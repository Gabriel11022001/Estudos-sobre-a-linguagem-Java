package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		/**
		 * Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos,
		 * meses e dias e mostre-a expressa apenas em dias.
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		int anos = 0;
		int meses = 0;
		int dias = 0;
		int quantidadeDeDiasQueAPessoaViveu = 0;
		System.out.println("Informe sua idade em anos:");
		anos = entradaUsuario.nextInt();
		System.out.println("Informe sua idade em meses:");
		meses = entradaUsuario.nextInt();
		System.out.println("Informe sua idade em dias:");
		dias = entradaUsuario.nextInt();
		quantidadeDeDiasQueAPessoaViveu = (anos * 365) + (meses * 30) + dias;
		System.out.println("Voc� j� viveu " + quantidadeDeDiasQueAPessoaViveu + " dias.");
	}
}
