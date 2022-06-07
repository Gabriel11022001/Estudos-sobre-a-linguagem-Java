package com.gabrielsantos.estudosjdbc.testes;

import java.sql.Connection;

import com.gabrielsantos.estudosjdbc.banco.Conexao;

public class TestaConexao {

	public static void main(String[] args) {
		Connection conexao = Conexao.realizarConexaoBancoDados();
		if (conexao == null) {
			System.out.println("Ocorreu um erro ao tentar-se realizar a conex�o com o banco de dados!");
		} else {
			System.out.println("Conex�o com o banco de dados realizada com sucesso!");
		}
	}
}
