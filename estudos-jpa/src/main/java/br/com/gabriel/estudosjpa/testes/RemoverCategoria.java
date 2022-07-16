package br.com.gabriel.estudosjpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.gabriel.estudosjpa.dao.CategoriaDAO;
import br.com.gabriel.estudosjpa.modelo.Categoria;

public class RemoverCategoria {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		CategoriaDAO categoriaDAO = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("estudos-jpa");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			categoriaDAO = new CategoriaDAO(entityManager);
			Categoria categoriaRemover = categoriaDAO.buscarPeloId(5);
			if (categoriaRemover == null) {
				throw new Exception("Não existe uma categoria com esse id!");
			}
			// Abrindo transação
			entityTransaction.begin();
			categoriaDAO.remover(categoriaRemover);
			// Comitando transação
			entityTransaction.commit();
			System.out.println("Categoria removida com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}
}
