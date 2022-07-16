package br.com.gabriel.estudosjpa.testes;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.gabriel.estudosjpa.modelo.Categoria;
import br.com.gabriel.estudosjpa.modelo.Produto;

public class CadastrarProdutoComCategoria {

	private static void cadastrarCategoria() {
		Categoria categoria = new Categoria();
		categoria.setNome("Categoria 1");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("estudos-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(categoria);
		entityTransaction.commit();
		System.out.println("Categoria cadastrada com sucesso!");
	}
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("estudos-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		cadastrarCategoria();
		Categoria categoria = new Categoria();
		categoria.setId(1);
		Produto produto = new Produto();
		produto.setNome("Produto 1");
		produto.setDescricao("Produto de teste 1");
		produto.setPreco(120.88);
		produto.setQuantidadeUnidadesEmEstoque(13);
		produto.setDataCadastro(LocalDate.now());
		produto.setCategoria(categoria);
		entityTransaction.begin();
		entityManager.persist(produto);
		entityTransaction.commit();
		System.out.println("Produto cadastrado com sucesso!");
	}
}
