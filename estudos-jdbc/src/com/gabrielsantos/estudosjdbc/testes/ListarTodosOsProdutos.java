package com.gabrielsantos.estudosjdbc.testes;

import java.util.List;

import com.gabrielsantos.estudosjdbc.dtos.ProdutoDTO;
import com.gabrielsantos.estudosjdbc.repositorios.ProdutoRepositorio;

public class ListarTodosOsProdutos {

	public static void main(String[] args) {
		try {
			ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
			List<ProdutoDTO> produtos = produtoRepositorio.buscarTodosProdutos();
			if (produtos.size() == 0) {
				System.out.println("N�o existem produtos cadastrados no banco de dados!");
				return;
			}
			for (ProdutoDTO produtoDTO : produtos) {
				System.out.println("=======================================");
				System.out.println("Id: " + produtoDTO.getId());
				System.out.println("Nome: " + produtoDTO.getNome());
				System.out.println("Pre�o de venda: R$" + produtoDTO.getPreco());
				System.out.println("Descri��o resumida: " + produtoDTO.getDescricaoResumida());
				System.out.println("Descri��o completa: " + produtoDTO.getDescricaoCompleta());
				System.out.println("Est� ativo? " + produtoDTO.getEstaAtivo());
				System.out.println("Quantidade de unidades em estoque: " + produtoDTO.getQuantidadeUnidadesEmEstoque());
				System.out.println("=======================================");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
