package com.gabrielsantos.estudosjdbc.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gabrielsantos.estudosjdbc.banco.Conexao;
import com.gabrielsantos.estudosjdbc.dtos.ProdutoDTO;

public class ProdutoRepositorio {
	
	// Método para cadastrar um produto no banco de dados
	public void cadastrarProduto(ProdutoDTO produtoDTO) throws Exception {
		String query = "INSERT INTO tbl_produtos(nome, preco, qtdUnidadesEmEstoque, estaAtivo, descricaoResumida, descricaoCompleta)"
				+ "VALUES(?, ?, ?, ?, ?, ?);";
		Connection conn = Conexao.realizarConexaoBancoDados();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, produtoDTO.getNome());
		preparedStatement.setDouble(2, produtoDTO.getPreco());
		preparedStatement.setInt(3, produtoDTO.getQuantidadeUnidadesEmEstoque());
		preparedStatement.setBoolean(4, produtoDTO.getEstaAtivo());
		preparedStatement.setString(5, produtoDTO.getDescricaoResumida());
		preparedStatement.setString(6, produtoDTO.getDescricaoCompleta());
		preparedStatement.execute();
		conn.close();
	}
	// Método para deletar um produto do banco de dados
	public void deletarProduto(Integer id) throws Exception {
		String query = "DELETE FROM tbl_produtos WHERE id = ?;";
		Connection conn = Conexao.realizarConexaoBancoDados();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
		conn.close();
	}
	// Método para listar todos os produtos cadastrados no banco de dados
	public List<ProdutoDTO> buscarTodosProdutos() throws Exception {
		List<ProdutoDTO> produtos = new ArrayList<ProdutoDTO>();
		String query = "SELECT * FROM tbl_produtos;";
		Connection conn = Conexao.realizarConexaoBancoDados();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		ResultSet res = preparedStatement.executeQuery();
		while (res.next()) {
			ProdutoDTO produtoDTO = new ProdutoDTO();
			produtoDTO.setId(res.getInt("id"));
			produtoDTO.setNome(res.getString("nome"));
			produtoDTO.setDescricaoResumida(res.getString("descricaoResumida"));
			produtoDTO.setDescricaoCompleta(res.getString("descricaoCompleta"));
			produtoDTO.setPreco(res.getDouble("preco"));
			produtoDTO.setEstaAtivo(res.getBoolean("estaAtivo"));
			produtoDTO.setQuantidadeUnidadesEmEstoque(res.getInt("qtdUnidadesEmEstoque"));
			produtos.add(produtoDTO);
		}
		conn.close();
		return produtos;
	}
	// Método para buscar um produto pelo id
	public ProdutoDTO buscarProdutoPeloId(Integer id) throws Exception {
		ProdutoDTO produtoDTO = null;
		Connection conn = Conexao.realizarConexaoBancoDados();
		String query = "SELECT * FROM tbl_produtos WHERE id = ?;";
		
		conn.close();
		return produtoDTO;
	}
	// Método para atualizar os dados de um produto
	public void atualizarProduto(ProdutoDTO produtoDTO) throws Exception {
		String query = "UPDATE tbl_produtos SET nome = ?, descricaoResumida = ?,"
				+ "descricaoCompleta = ?, estaAtivo = ?, preco = ?,"
				+ "qtdUnidadesEmEstoque = ? WHERE id = ?;";
		Connection conn = Conexao.realizarConexaoBancoDados();
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, produtoDTO.getNome());
		preparedStatement.setString(2, produtoDTO.getDescricaoResumida());
		preparedStatement.setString(3, produtoDTO.getDescricaoCompleta());
		preparedStatement.setBoolean(4, produtoDTO.getEstaAtivo());
		preparedStatement.setDouble(5, produtoDTO.getPreco());
		preparedStatement.setInt(6, produtoDTO.getQuantidadeUnidadesEmEstoque());
		preparedStatement.setInt(7, produtoDTO.getId());
		preparedStatement.execute();
		conn.close();
	}
}
