package com.gabrielsantos.estudosjdbc.testes;

import java.sql.Connection;

import com.gabrielsantos.estudosjdbc.banco.Conexao;
import com.gabrielsantos.estudosjdbc.dtos.ProdutoDTO;
import com.gabrielsantos.estudosjdbc.repositorios.ProdutoRepositorio;

public class CadastrarProduto {

	public static void main(String[] args) {
		try {
			ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
			ProdutoDTO produtoDTO = new ProdutoDTO();
			produtoDTO.setNome("Fanta Uva 2 Litros");
			produtoDTO.setEstaAtivo(true);
			produtoDTO.setPreco(12.0);
			produtoDTO.setQuantidadeUnidadesEmEstoque(30);
			produtoDTO.setDescricaoResumida("Lorem Ipsum � simplesmente uma simula��o de texto da ind�stria tipogr�fica e de impressos.");
			produtoDTO.setDescricaoCompleta("Lorem Ipsum � simplesmente uma simula��o de texto da ind�stria tipogr�fica e de impressos, e vem sendo utilizado desde o s�culo XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu n�o s� a cinco s�culos, como tamb�m ao salto para a editora��o eletr�nica, permanecendo essencialmente inalterado. Se popularizou na d�cada de 60, quando a Letraset lan�ou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editora��o eletr�nica como Aldus PageMaker.");
			produtoRepositorio.cadastrarProduto(produtoDTO);
			System.out.println("Produto cadastrado com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
