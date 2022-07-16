package br.com.gabriel.estudosjpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.gabriel.estudosjpa.dao.ProdutoDAO;
import br.com.gabriel.estudosjpa.modelo.Produto;

public class CadastrarProduto {

	public static void main(String[] args) throws Exception {
		ProdutoDAO produtoDAO = null;
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		emf = Persistence.createEntityManagerFactory("estudos-jpa");
		entityManager = emf.createEntityManager();
		produtoDAO = new ProdutoDAO(entityManager);
		Produto produto = new Produto();
		produto.setNome("Suco de laranja");
		produto.setPreco(12.98);
		produto.setDescricao("Suco muito bom!");
		produto.setQuantidadeUnidadesEmEstoque(123);
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		produtoDAO.cadastrarProduto(produto);
		entityTransaction.commit();
		System.out.println("Produto cadastrado com sucesso!");
	}
}
