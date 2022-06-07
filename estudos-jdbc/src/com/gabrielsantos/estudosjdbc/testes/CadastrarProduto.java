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
			produtoDTO.setDescricaoResumida("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos.");
			produtoDTO.setDescricaoCompleta("Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI, quando um impressor desconhecido pegou uma bandeja de tipos e os embaralhou para fazer um livro de modelos de tipos. Lorem Ipsum sobreviveu não só a cinco séculos, como também ao salto para a editoração eletrônica, permanecendo essencialmente inalterado. Se popularizou na década de 60, quando a Letraset lançou decalques contendo passagens de Lorem Ipsum, e mais recentemente quando passou a ser integrado a softwares de editoração eletrônica como Aldus PageMaker.");
			produtoRepositorio.cadastrarProduto(produtoDTO);
			System.out.println("Produto cadastrado com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
