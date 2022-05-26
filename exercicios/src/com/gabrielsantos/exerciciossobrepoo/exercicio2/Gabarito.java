package com.gabrielsantos.exerciciossobrepoo.exercicio2;

public class Gabarito {
	private char[] respostasQuestoes;
	
	public Gabarito() {
		this.respostasQuestoes = new char[15];
		this.definirRespostasDasQuestoes();
	}
	private void definirRespostasDasQuestoes() {
		this.respostasQuestoes[0] = 'A';
		this.respostasQuestoes[1] = 'B';
		this.respostasQuestoes[2] = 'E';
		this.respostasQuestoes[3] = 'C';
		this.respostasQuestoes[4] = 'A';
		this.respostasQuestoes[5] = 'A';
		this.respostasQuestoes[6] = 'A';
		this.respostasQuestoes[7] = 'A';
		this.respostasQuestoes[8] = 'B';
		this.respostasQuestoes[9] = 'E';
		this.respostasQuestoes[10] = 'D';
		this.respostasQuestoes[11] = 'D';
		this.respostasQuestoes[12] = 'B';
		this.respostasQuestoes[13] = 'A';
		this.respostasQuestoes[14] = 'B';
	}
	public char[] getRespostas() {
		return this.respostasQuestoes;
	}
}
