package com.gabrielsantos.apiprodutos.repositorios;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBancoDados {

	public static Connection getConexao() throws Exception {
		String usuarioBanco = "";
		String senhaUsuarioBanco = "";
		String nomeBanco = "";
		Class.forName("com.jdbc.mysql.cj.Driver");
		Connection conexaoBancoDados = DriverManager.getConnection("", usuarioBanco, senhaUsuarioBanco);
		return conexaoBancoDados;
	}
}
