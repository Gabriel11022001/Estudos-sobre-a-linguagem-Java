package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/**
		 *  Fa?a um algoritmo que leia a idade de uma pessoa expressa em dias
		 *  e mostre-a expressa em anos, meses e dias.
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		int idadeEmDias = 0;
		int idadeEmAnos = 0;
		int idadeEmMeses = 0;
		int quantidadeDeDiasQueSobraramAposCalcularOsAnos = 0;
		int quantidadeDeDiasQueSobraramAposCalcularOsMeses = 0;
		int idadeEmDiasRestantes = 0;
		System.out.println("Informe quantos dias voc? viveu:");
		idadeEmDias = entradaUsuario.nextInt();
		idadeEmAnos = idadeEmDias / 365;
		quantidadeDeDiasQueSobraramAposCalcularOsAnos = idadeEmDias % 365;
		idadeEmMeses = quantidadeDeDiasQueSobraramAposCalcularOsAnos / 30;
		quantidadeDeDiasQueSobraramAposCalcularOsMeses = quantidadeDeDiasQueSobraramAposCalcularOsAnos % 30;
		idadeEmDiasRestantes = quantidadeDeDiasQueSobraramAposCalcularOsMeses;
		System.out.println("Voc? viveu " + idadeEmAnos + " anos, " + idadeEmMeses + " meses e " + idadeEmDiasRestantes + " dias.");
	}
}
