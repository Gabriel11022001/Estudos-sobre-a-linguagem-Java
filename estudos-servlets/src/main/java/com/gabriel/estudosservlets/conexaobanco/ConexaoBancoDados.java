package com.gabriel.estudosservlets.conexaobanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDados {

	public static Connection getConexaoBancoDados() throws SQLException, ClassNotFoundException {
		String usuarioBancoDados = "root";
		String nomeBancoDados = "db_estudos_servlets_sis_login";
		String senhaUsuarioBancoDados = "Gabriel@11022001";
		String stringConexaoBancoDados = "jdbc:mysql://localhost:3306/" + nomeBancoDados;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conexaoBancoDados = DriverManager.getConnection(stringConexaoBancoDados, usuarioBancoDados, senhaUsuarioBancoDados);
		return conexaoBancoDados;
	}
}
