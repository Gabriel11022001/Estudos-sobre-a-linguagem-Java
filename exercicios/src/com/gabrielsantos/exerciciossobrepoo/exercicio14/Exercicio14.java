package com.gabrielsantos.exerciciossobrepoo.exercicio14;

import java.text.SimpleDateFormat;

import com.gabrielsantos.exerciciossobrepoo.exercicio4.Pessoa;

public class Exercicio14 {

	public static void main(String[] args) {
		try {
			Agenda agenda = new Agenda();
			agenda.armazenarContato(new Pessoa("Gabriel", 1.82, new SimpleDateFormat("dd-mm-yyyy").parse("11-02-2001")));
			agenda.armazenarContato(new Pessoa("Maria", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("Pedro", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("Gustavo", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("Daniel", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("José", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("Ruan", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("Eduardo", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("Eduarda", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("Maria Eduarda", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			// agenda.armazenarContato(new Pessoa("Pedro José", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.removerContato("Maria Eduarda");
			agenda.removerContato("Pedro");
			agenda.apresentarContatosDaAgenda();
			// agenda.removerContato("Teste");
			agenda.limparAgenda();
			agenda.apresentarContatosDaAgenda();
			agenda.armazenarContato(new Pessoa("Ruan", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("José", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("Ruan", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.armazenarContato(new Pessoa("Eduardo", 1.76, new SimpleDateFormat("dd-mm-yyyy").parse("11-09-2009")));
			agenda.apresentarContatosDaAgenda();
			Pessoa contatoConsultaTeste = agenda.buscarContato("Ruan");
			System.out.println(contatoConsultaTeste.getNome());
			// Pessoa contatoConsultaTeste2 = agenda.buscarContato("Pedro");
			agenda.apresentarDadosContato(0);
			agenda.apresentarDadosContato(1);
			agenda.apresentarDadosContato(3);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Não é possível consultar uma pessoa em um índice menor que 0 ou maior que o tamanho da lista menos 1!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
