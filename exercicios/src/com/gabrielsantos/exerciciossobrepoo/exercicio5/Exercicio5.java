package com.gabrielsantos.exerciciossobrepoo.exercicio5;

import java.text.SimpleDateFormat;

import com.gabrielsantos.exerciciossobrepoo.exercicio4.Pessoa;

public class Exercicio5 {

	public static void main(String[] args) {
		try {
			Agenda agenda = new Agenda();
			agenda.armazenarPessoa(new Pessoa("Gabriel", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2001-02-11")));
			agenda.armazenarPessoa(new Pessoa("Pedro", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2001-02-12")));
			agenda.armazenarPessoa(new Pessoa("Gustavo", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2001-03-01")));
			agenda.armazenarPessoa(new Pessoa("Matheus", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2002-02-11")));
			agenda.armazenarPessoa(new Pessoa("Cesar", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2003-02-11")));
			agenda.armazenarPessoa(new Pessoa("Maria", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2004-02-11")));
			agenda.armazenarPessoa(new Pessoa("Otávio", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2001-06-11")));
			agenda.armazenarPessoa(new Pessoa("Maria Eduarda", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2000-02-11")));
			agenda.armazenarPessoa(new Pessoa("Lívia", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("1999-02-11")));
			agenda.armazenarPessoa(new Pessoa("Vivian", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2005-02-11")));
			agenda.armazenarPessoa(new Pessoa("Eduarda", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2000-02-18")));
			agenda.armazenarPessoa(new Pessoa("Isabela", 1.82, new SimpleDateFormat("yyyy-mm-dd").parse("2001-02-11")));
			int resBuscarGustavo = agenda.buscarPessoa("Gustavo");
			if (resBuscarGustavo == -1) {
				System.out.println("Não existem pessoas cadastradas na agenda!");
			} else if (resBuscarGustavo == -2) {
				System.out.println("O Gustavo não está cadastrado na agenda!");
			} else {
				System.out.println("Posição do Gustavo na agenda: " + resBuscarGustavo);
			}
			agenda.apresentarDadosAgenda();
			agenda.apresentarDadosDaPessoa("Edu");
			agenda.apresentarDadosDaPessoa("Gabriel");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
