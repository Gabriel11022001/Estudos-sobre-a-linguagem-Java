package com.gabriel.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestantoListas {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Gabriel Rodrigues dos Santos");
		nomes.add("Maria Helena da Silva");
		nomes.add("Luisa Cardoso da Silva");
		ArrayList<String> maisNomes = new ArrayList<String>();
		maisNomes.add("Maria Eduarda da Silva");
		maisNomes.add("José Pereira da Silva");
		nomes.addAll(maisNomes);
		nomes.forEach((nome) -> {
			System.out.println(nome);
		});
		System.out.println(nomes.toString());
		nomes.remove(2);
		System.out.println(nomes.toString());
		System.out.println("=====================================");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		for (int cont = 0; cont < nomes.size(); cont++) {
			System.out.println("Nome da pessoa no índice: [" + cont + "] = " + nomes.get(cont));
		}
		Collections.sort(nomes);
		nomes.forEach((nome) -> {
			System.out.println("Nome: " + nome);
		});
	}
}
