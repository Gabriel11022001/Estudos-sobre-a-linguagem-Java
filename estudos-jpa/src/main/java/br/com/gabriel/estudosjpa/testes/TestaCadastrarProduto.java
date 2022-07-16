package br.com.gabriel.estudosjpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.gabriel.estudosjpa.modelo.Produto;

public class TestaCadastrarProduto {

	public static void main(String[] args) {
		Produto celular = new Produto();
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		celular.setNome("Celular 2");
		celular.setDescricao("Um celular top!");
		celular.setQuantidadeUnidadesEmEstoque(120);
		celular.setPreco(2500.56);
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("estudos-jpa");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(celular);
		entityTransaction.commit();
		System.out.println("Produto cadastrado com sucesso no banco de dados!");
	}
}
