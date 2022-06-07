package com.gabriel.estudosservlets.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gabriel.estudosservlets.conexaobanco.ConexaoBancoDados;
import com.gabriel.estudosservlets.models.Usuario;

public class UsuarioDAO {

	public void cadastrarUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
		String query = "";
		Connection conexaoBancoDados = ConexaoBancoDados.getConexaoBancoDados();
		
		conexaoBancoDados.close();
	}
	public void deletarUsuario(int id) throws ClassNotFoundException, SQLException {
		String query = "";
		Connection conexaoBancoDados = ConexaoBancoDados.getConexaoBancoDados();
		conexaoBancoDados.close();
	}
	public void atualizarDadosUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
		Connection conexaoBancoDados = ConexaoBancoDados.getConexaoBancoDados();
		conexaoBancoDados.close();
	}
	public Usuario buscarUsuarioPeloEmailESenha(String email, String senha) throws ClassNotFoundException, SQLException {
		Usuario usuario = new Usuario();
		Connection conexaoBancoDados = ConexaoBancoDados.getConexaoBancoDados();
		conexaoBancoDados.close();
		return usuario;
	}
}
