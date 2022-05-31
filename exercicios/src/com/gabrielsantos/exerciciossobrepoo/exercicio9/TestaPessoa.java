package com.gabrielsantos.exerciciossobrepoo.exercicio9;

public class TestaPessoa {

	public static void main(String[] args) {
		try {
			Pessoa pessoa = new Pessoa("Gabriel", 1.82, 85, 18);
			System.out.println(pessoa);
			pessoa.envelhecer();
			pessoa.envelhecer();
			pessoa.envelhecer();
			System.out.println(pessoa);
			pessoa.engordar(2);
			// pessoa.engordar(0);
			pessoa.engordar(0.7);
			System.out.println(pessoa);
			pessoa.emagrecer(0.9);
			System.out.println(pessoa);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
