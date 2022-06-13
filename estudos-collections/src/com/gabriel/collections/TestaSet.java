package com.gabriel.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaSet {

	private static void testarConsultarNaList() {
		List<Integer> numeros = new ArrayList<Integer>();
		for (int i = 0; i <= 10000000; i++) {
			numeros.add(i);
			System.out.println(i + 1);
		}
		System.out.println(numeros.contains(90000000));
	}
	private static void testarConsultarNoSet() {
		Set<Integer> numeros = new HashSet<Integer>();
		for (int i = 0; i <= 10000000; i++) {
			numeros.add(i);
			System.out.println(i + 1);
		}
		System.out.println(numeros.contains(90000000));
	}
	public static void main(String[] args) {
		// A interface Set tambï¿½m herda da interface Collection e a classe HashSet
		// implementa Set.
		Set<String> nomes = new HashSet<String>();
		nomes.add("Gabriel Rodrigues dos Santos");
		nomes.add("Maria Helena da Silva");
		nomes.add("Pedro Henrique da Silva");
		/**
		 * Os Sets não aceitam elementos repetidos
		 */
		nomes.add("Gabriel Rodrigues dos Santos");
		System.out.println(nomes);
		System.out.println(nomes.size());
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("================================================");
		// testarConsultarNaList();
		// testarConsultarNoSet();
	}
}
