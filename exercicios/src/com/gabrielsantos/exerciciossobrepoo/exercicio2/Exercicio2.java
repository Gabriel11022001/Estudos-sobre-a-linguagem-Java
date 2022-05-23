package com.gabrielsantos.exerciciossobrepoo.exercicio2;

public class Exercicio2 {

	public static void main(String[] args) {
		/**
		 * Considere a seguinte classe, cujo m�todo respostaQuestao recebe como par�metro o n�mero de uma
		 * quest�o e retorna a sua resposta correta, proveniente de um gabarito.
		 * public class Gabarito
		 * {
		 * 		public char respostaQuestao(int numeroQuestao)
		 * 		{
		 * 			implementa��o do m�todo...
		 * 		}
		 * }
		 * Escreva uma classe classe Prova em que cada objeto representa uma prova feita por um aluno. Esta
		 * prova possui 15 quest�es de m�ltipla escolha (letras A a E). As 10 primeiras quest�es valem 0,5 ponto e as
		 * 5 �ltimas quest�es valem 1 ponto. Esta classe dever� controlar as quest�es respondidas pelo aluno. Para
		 * isto, a classe deve implementar os m�todos:
		 * construtor: recebe como par�metro um objeto da classe Gabarito contendo o gabarito da prova
		 * respostaAluno: recebe como par�metro a resposta dada pelo aluno a uma quest�o; este m�todo n�o
		 * recebe entre os par�metros o n�mero da quest�o, ele mesmo deve estabelecer um
		 * controle interno de modo que as quest�es sejam inseridas sequencialmente, ou seja, a
		 * primeira vez que o m�todo � chamado, insere a primeira quest�o, a segunda, insere a
		 * segunda quest�o, e assim por diante.
		 * acertos: retorna a quantidade de quest�es que o aluno acertou
		 * nota: retorna a nota que o aluno tirou na prova
		 * maior: recebe como par�metro um outro objeto da classe Prova e retorna a nota do aluno que
		 * acertou mais quest�es; se houver empate, retorna a maior nota; se houver empate
		 * novamente, retorna a nota do aluno representado no objeto corrente
		 */
		Gabarito gabarito = new Gabarito();
		Prova prova1 = new Prova(gabarito);
		prova1.respostaAluno('C');
		char letra = ' ';
		System.out.println();
	}
}
