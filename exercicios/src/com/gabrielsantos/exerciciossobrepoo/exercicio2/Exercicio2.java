package com.gabrielsantos.exerciciossobrepoo.exercicio2;

public class Exercicio2 {

	public static void main(String[] args) {
		/**
		 * Considere a seguinte classe, cujo método respostaQuestao recebe como parâmetro o número de uma
		 * questão e retorna a sua resposta correta, proveniente de um gabarito.
		 * public class Gabarito
		 * {
		 * 		public char respostaQuestao(int numeroQuestao)
		 * 		{
		 * 			implementação do método...
		 * 		}
		 * }
		 * Escreva uma classe classe Prova em que cada objeto representa uma prova feita por um aluno. Esta
		 * prova possui 15 questões de múltipla escolha (letras A a E). As 10 primeiras questões valem 0,5 ponto e as
		 * 5 últimas questões valem 1 ponto. Esta classe deverá controlar as questões respondidas pelo aluno. Para
		 * isto, a classe deve implementar os métodos:
		 * construtor: recebe como parâmetro um objeto da classe Gabarito contendo o gabarito da prova
		 * respostaAluno: recebe como parâmetro a resposta dada pelo aluno a uma questão; este método não
		 * recebe entre os parâmetros o número da questão, ele mesmo deve estabelecer um
		 * controle interno de modo que as questões sejam inseridas sequencialmente, ou seja, a
		 * primeira vez que o método é chamado, insere a primeira questão, a segunda, insere a
		 * segunda questão, e assim por diante.
		 * acertos: retorna a quantidade de questões que o aluno acertou
		 * nota: retorna a nota que o aluno tirou na prova
		 */
		Gabarito gabarito = new Gabarito();
		Prova prova1 = new Prova(gabarito);
		prova1.respostaAluno('C');
		prova1.respostaAluno('B');
		prova1.respostaAluno('A');
		prova1.respostaAluno('D');
		prova1.respostaAluno('E');
		prova1.respostaAluno('A');
		prova1.respostaAluno('A');
		prova1.respostaAluno('C');
		prova1.respostaAluno('C');
		prova1.respostaAluno('C');
		prova1.respostaAluno('D');
		prova1.respostaAluno('D');
		prova1.respostaAluno('A');
		prova1.respostaAluno('B');
		prova1.respostaAluno('E');
		prova1.respostaAluno('C');
		System.out.println("Quantidade de acertos: " + prova1.acertos());
		System.out.println("Nota do aluno: " + prova1.nota());
	}
}
