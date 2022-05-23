package com.gabrielsantos.exerciciossobrepoo.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/**
		 * Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto
		 * dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de
		 * trabalho. Escreva o seguinte método para esta classe:
		 * media calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
		 */
		Scanner entradaUsuario = new Scanner(System.in);
		int quantidadeDeAlunos = -1;
		Aluno[] alunos = null;
		while (quantidadeDeAlunos < 0) {
			System.out.println("Você gostaria de registrar quantos alunos? Caso deseje encerrar o programa, digite 0, caso queira registrar alunos, digite um númeor inteiro maior que 0!");
			quantidadeDeAlunos = entradaUsuario.nextInt();
			if (quantidadeDeAlunos > 0) {
				alunos = new Aluno[quantidadeDeAlunos];
				// Ler informações sobre os alunos
				for (int contador = 0; contador < alunos.length; contador++) {
					Aluno aluno = new Aluno();
					System.out.println("Informe o nome do aluno:");
					aluno.setNome(entradaUsuario.next());
					while (aluno.getNumeroMatricula() <= 0) {
						System.out.println("Informe o número de matrícula do aluno " + aluno.getNome());
						aluno.setNumeroMatricula(entradaUsuario.nextInt());
						if (aluno.getNumeroMatricula() <= 0) {
							System.out.println("O número de matrícula deve ser maior que 0!");
						}
					}
					while (aluno.getNotaPrimeiraProva() < 0) {
						System.out.println("Informe uma nota entre 0 e 10 para a primeira prova:");
						aluno.setNotaPrimeiraProva(entradaUsuario.nextDouble());
						if (aluno.getNotaPrimeiraProva() < 0) {
							System.out.println("Nota inválida! A nota do aluno deve estar entre 0 e 10!");
						}
					}
					while (aluno.getNotaSegundaProva() < 0) {
						System.out.println("Informe uma nota entre 0 e 10 para a segunda prova:");
						aluno.setNotaSegundaProva(entradaUsuario.nextDouble());
						if (aluno.getNotaSegundaProva() < 0) {
							System.out.println("Nota inválida! A nota do aluno deve estar entre 0 e 10!");
						}
					}
					while (aluno.getNotaTrabalho() < 0) {
						System.out.println("Informe uma nota entre 0 e 10 para o trabalho do aluno:");
						aluno.setNotaTrabalho(entradaUsuario.nextDouble());
						if (aluno.getNotaTrabalho() < 0) {
							System.out.println("Nota inválida! A nota do trabalho deve estar entre 0 e 10!");
						}
					}
					alunos[contador] = aluno;
				}
				System.out.println("********** Informações sobre os alunos **********");
				// Apresentar as informações dos alunos
				for (int contador = 0; contador < alunos.length; contador++) {
					System.out.println("***************");
					alunos[contador].apresentarInformacoesSobreAluno();
					System.out.println("Média do aluno: " + alunos[contador].calcularMedia());
					System.out.println("***************");
				}
				System.out.println("PROGRAMA ENCERRADO!");
			} else if (quantidadeDeAlunos < 0) {
				System.out.println("Valor inválido!");
			} else {
				System.out.println("PROGRAMA ENCERRADO!");
			}
		}
	}
}
