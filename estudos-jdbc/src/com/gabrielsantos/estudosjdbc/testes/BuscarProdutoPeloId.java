package com.gabrielsantos.estudosjdbc.testes;

import com.gabrielsantos.estudosjdbc.dtos.ProdutoDTO;
import com.gabrielsantos.estudosjdbc.repositorios.ProdutoRepositorio;

public class BuscarProdutoPeloId {

	public static void main(String[] args) {
		try {
			ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
			ProdutoDTO produtoDTO = produtoRepositorio.buscarProdutoPeloId(1);
			if (produtoDTO == null) {
				System.out.println("Esse produto não está cadastrado no banco de dados!");
				return;
			}
			System.out.println("Id do produto: " + produtoDTO.getId());
			System.out.println("Nome do produto: " + produtoDTO.getNome());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
