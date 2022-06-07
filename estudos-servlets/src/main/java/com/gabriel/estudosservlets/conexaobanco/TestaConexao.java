package com.gabriel.estudosservlets.conexaobanco;

import java.sql.Connection;

public class TestaConexao {

	public static void main(String[] args) {
		try {
			Connection conexao = ConexaoBancoDados.getConexaoBancoDados();
			System.out.println("Conexão com o banco de dados efetivada com sucesso!");
			conexao.close();
			System.out.println("Conexão com o banco de dados finalizada!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
