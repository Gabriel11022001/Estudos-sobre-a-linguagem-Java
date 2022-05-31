package com.gabriel.estudospacotesstringobject.testes;

import com.gabriel.estudospacotesstringobject.modelos.Pessoa;

public class TestaString {

	private static void apresentar(Object ref) {
		System.out.println(ref);
	}
	public static void main(String[] args) {
		String nome = "Gabriel";
		char[] nomeChar = {'G', 'a', 'b', 'r', 'i', 'e', 'l'};
		System.out.println(nome);
		System.out.println(nomeChar);
		nome = nome.replace('G', 'g');
		System.out.println(nome);
		nome = nome.toUpperCase();
		System.out.println(nome);
		nome = nome.toLowerCase();
		System.out.println(nome);
		char caracterNaPosicao2 = nome.charAt(2);
		System.out.println(caracterNaPosicao2);
		System.out.println(nome.indexOf("ab"));
		System.out.println(nome.substring(2));
		System.out.println(nome.length());
		for (int cont = 0; cont < nome.length(); cont++) {
			System.out.println(nome.charAt(cont));
		}
		String sobrenome = "";
		if (sobrenome.isEmpty()) {
			System.out.println("O sobrenome está vazio!");
		} else {
			System.out.println("O sobrenome não está vazio!");
		}
		sobrenome = "Rodrigues";
		if (sobrenome.isEmpty()) {
			System.out.println("O sobrenome está vazio!");
		} else {
			System.out.println("O sobrenome não está vazio!");
		}
		System.out.println(sobrenome.contains("dri"));
		System.out.println(sobrenome.contains("al"));
		apresentar(sobrenome);
		apresentar(nome);
		apresentar(1);
		apresentar(new Pessoa("José", 1.82, 85.0));
	}
}
