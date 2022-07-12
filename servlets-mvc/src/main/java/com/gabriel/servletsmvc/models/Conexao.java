package com.gabriel.servletsmvc.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public static Connection getConexao() throws Exception {
		String bancoDados = "db_sistema_login";
		String usuarioBancoDeDados = "root";
		String senhaUsuarioBancoDados = "Gabriel@11022001";
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bancoDados, usuarioBancoDeDados, senhaUsuarioBancoDados);
	}
}
