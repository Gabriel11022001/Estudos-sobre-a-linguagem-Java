package com.gabrielsantos.estudosjdbc.banco;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection realizarConexaoBancoDados() {
		String nomeBancoDados = "db_estudos_jdbc_produtos";
		String usuarioBancoDados = "root";
		String senhaUsuarioBancoDados = "Gabriel@11022001";
		String stringConexaoBanco = "jdbc:mysql://localhost:3306/" + nomeBancoDados;
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(stringConexaoBanco, usuarioBancoDados, senhaUsuarioBancoDados);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}
}
