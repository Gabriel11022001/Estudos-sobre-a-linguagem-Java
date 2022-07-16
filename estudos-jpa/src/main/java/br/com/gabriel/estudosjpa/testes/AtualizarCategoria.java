package br.com.gabriel.estudosjpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.gabriel.estudosjpa.dao.CategoriaDAO;
import br.com.gabriel.estudosjpa.modelo.Categoria;

public class AtualizarCategoria {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("estudos-jpa");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			CategoriaDAO categoriaDAO = new CategoriaDAO(entityManager);
			Categoria categoria = categoriaDAO.buscarPeloId(55);
			if (categoria == null) {
				throw new Exception("Não existe uma categoria com esse id!");
			}
			entityTransaction.begin();
			categoria.setNome("BlaBlablaBlaBla");
			entityTransaction.commit();
			System.out.println("Categoria atualizada com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}
}
