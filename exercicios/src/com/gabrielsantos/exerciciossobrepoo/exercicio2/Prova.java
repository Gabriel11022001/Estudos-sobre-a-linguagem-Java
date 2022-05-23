package com.gabrielsantos.exerciciossobrepoo.exercicio2;

public class Prova {

	private char[] alternativasMarcadasPeloAluno;
	private Gabarito gabarito;
	private int quantidadeAcertos;
	private double notaFinal;
	
	public Prova(Gabarito gabarito) {
		this.gabarito = gabarito;
		this.alternativasMarcadasPeloAluno = new char[15];
		for (int contador = 0; contador < this.alternativasMarcadasPeloAluno.length; contador++) {
			this.alternativasMarcadasPeloAluno[contador] = ' ';
		}
	}
	public String respostaAluno(char resposta) {
		char res = Character.toLowerCase(resposta);
		if (res != 'a' && res != 'b' && res != 'c' && res != 'd' && res != 'e') {
			return "A resposta deve estar entre A e E!";
		}
		int quantidadeDeNotasInformadas = 0;
		for (int contador = 0; contador < this.alternativasMarcadasPeloAluno.length; contador++){
			if (this.alternativasMarcadasPeloAluno[contador] != ' ') {
				quantidadeDeNotasInformadas++;
			}
		}
		
		return "";
	}
}
