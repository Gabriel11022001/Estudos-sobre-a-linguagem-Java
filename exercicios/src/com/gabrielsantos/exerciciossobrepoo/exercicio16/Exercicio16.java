package com.gabrielsantos.exerciciossobrepoo.exercicio16;

import java.util.ArrayList;
import java.util.List;

public class Exercicio16 {

	public static void main(String[] args) {
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			produtos.add(new Mouse("Mouse 1", "Tipo 1"));
			produtos.add(new Mouse("Mouse 2", "Tipo 2"));
			produtos.add(new Livro("Livro 1", "Gabriel"));
			produtos.add(new Livro("Livro 2", "João"));
			for (Produto produto : produtos) {
				System.out.println(produto.getDescricao());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
