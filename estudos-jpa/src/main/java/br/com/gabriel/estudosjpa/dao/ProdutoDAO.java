package br.com.gabriel.estudosjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gabriel.estudosjpa.modelo.Produto;

public class ProdutoDAO {

	private EntityManager entityManager;
	
	public ProdutoDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	public void cadastrarProduto(Produto produto) throws Exception {
		this.entityManager.persist(produto);
	}
}
