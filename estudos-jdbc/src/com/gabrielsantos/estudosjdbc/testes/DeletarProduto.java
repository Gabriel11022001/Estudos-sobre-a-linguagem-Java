package com.gabrielsantos.estudosjdbc.testes;

import com.gabrielsantos.estudosjdbc.repositorios.ProdutoRepositorio;

public class DeletarProduto {

	public static void main(String[] args) {
		try {
			ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
			produtoRepositorio.deletarProduto(4);
			System.out.println("Produto deletado com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
