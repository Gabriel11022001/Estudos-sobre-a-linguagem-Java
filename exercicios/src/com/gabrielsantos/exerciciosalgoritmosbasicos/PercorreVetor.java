package com.gabrielsantos.exerciciosalgoritmosbasicos;

public class PercorreVetor {

	public static void apresentarValoresDoVetor(Object[] vetor) {
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.println("vetor[" + contador + "] = " + vetor[contador]);
		}
	}
	
}
