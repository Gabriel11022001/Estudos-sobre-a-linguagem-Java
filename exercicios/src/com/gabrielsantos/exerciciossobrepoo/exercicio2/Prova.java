package com.gabrielsantos.exerciciossobrepoo.exercicio2;

public class Prova {

	private char[] alternativasMarcadasPeloAluno;
	private Gabarito gabarito;
	
	public Prova(Gabarito gabarito) {
		this.gabarito = gabarito;
		this.alternativasMarcadasPeloAluno = new char[15];
		for (int contador = 0; contador < this.alternativasMarcadasPeloAluno.length; contador++) {
			this.alternativasMarcadasPeloAluno[contador] = ' ';
		}
	}
	public void respostaAluno(char resposta) {
		char res = Character.toLowerCase(resposta);
		if (res != 'a' && res != 'b' && res != 'c' && res != 'd' && res != 'e') {
			System.out.println("A resposta deve estar entre A e E!");
			return;
		}
		int quantidadeDeNotasInformadas = this.getQuantidadeQuestoesAlunoRespondeu();
		if (quantidadeDeNotasInformadas == 15) {
			System.out.println("Você já informou as 15 respostas!");
			return;
		}
		this.alternativasMarcadasPeloAluno[quantidadeDeNotasInformadas] = resposta;
		System.out.println("Alternativa marcada pelo aluno: " + resposta);
	}
	public int acertos() {
		int quantidadeAcertosAluno = 0;
		int quantidadeQuestoesRespondidas = this.getQuantidadeQuestoesAlunoRespondeu();
		if (quantidadeQuestoesRespondidas < 15) {
			System.out.println("Ainda não foi fornecido as 15 alternativas que foram marcadas pelo aluno!");
			return -1;
		}
		char[] respostasQuestoesGabarito = this.gabarito.getRespostas();
		for (int contador = 0; contador < this.alternativasMarcadasPeloAluno.length; contador++) {
			System.out.println("********************************");
			System.out.println("Alternativa que o aluno selecionou: " + this.alternativasMarcadasPeloAluno[contador]);
			System.out.println("Reposta correta da questão: " + respostasQuestoesGabarito[contador]);
			System.out.println("********************************");
			if (this.alternativasMarcadasPeloAluno[contador] == respostasQuestoesGabarito[contador]) {
				quantidadeAcertosAluno++;
			}
		}
		return quantidadeAcertosAluno;
	}
	public double nota() {
		double notaSoma = 0;
		int quantidadeQuestoesAlunoRespondeu = this.getQuantidadeQuestoesAlunoRespondeu();
		if (quantidadeQuestoesAlunoRespondeu < 15) {
			System.out.println("Ainda não foi fornecido as 15 alternativas que foram marcadas pelo aluno!");
			return -1;
		}
		char[] questoesGabarito = this.gabarito.getRespostas();
		for (int contador = 0; contador < 10; contador++) {
			if (this.alternativasMarcadasPeloAluno[contador] == questoesGabarito[contador]) {
				notaSoma += 0.5;
			}
		}
		for (int contador = 10; contador < 15; contador++) {
			if (this.alternativasMarcadasPeloAluno[contador] == questoesGabarito[contador]) {
				notaSoma += 1;
			}
		}
		return notaSoma;
	}
	private int getQuantidadeQuestoesAlunoRespondeu() {
		int quantidadeQuestoesRespondidas = 0;
		for (int contador = 0; contador < this.alternativasMarcadasPeloAluno.length; contador++) {
			if (this.alternativasMarcadasPeloAluno[contador] != ' ') {
				quantidadeQuestoesRespondidas++;
			}
		}
		return quantidadeQuestoesRespondidas;
	}
}
