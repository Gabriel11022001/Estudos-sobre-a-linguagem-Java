package com.gabrielsantos.exerciciossobrepoo.exercicio27;

import java.time.LocalDate;

public class Programa {

	public static void main(String[] args) {
		try {
			Pessoa pessoa = new Pessoa("Gabriel Rodrigues dos Santos", 1.82, LocalDate.of(2001, 2, 11));
			pessoa.apresentarDadosDaPessoa();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
