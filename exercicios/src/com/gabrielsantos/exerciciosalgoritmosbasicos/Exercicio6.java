package com.gabrielsantos.exerciciosalgoritmosbasicos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/**
		 * Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias:
		 * infantil A = 5 - 7 anos
		 * infantil B = 8-10 anos
		 * juvenil A = 11-13 anos
		 * juvenil B = 14-17 anos
		 * adulto = maiores de 18 anos
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		int idadeNadador = 0;
		System.out.println("Informe a idade do nadador:");
		idadeNadador = entradaUsuario.nextInt();
		if (idadeNadador >= 5 && idadeNadador <= 7) {
			System.out.println("Categoria infantil A!");
		} else if (idadeNadador >= 8 && idadeNadador <= 10) {
			System.out.println("Categoria infantil B!");
		} else if (idadeNadador >= 11 && idadeNadador <= 13) {
			System.out.println("Categoria Juvenil A!");
		} else if (idadeNadador >= 14 && idadeNadador <= 17) {
			System.out.println("Categoria Juvenil B!");
		} else {
			System.out.println("Categoria Adulto!");
		}
	}
}
