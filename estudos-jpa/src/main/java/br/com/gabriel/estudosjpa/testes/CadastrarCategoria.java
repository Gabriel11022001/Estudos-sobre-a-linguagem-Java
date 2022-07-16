package br.com.gabriel.estudosjpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.gabriel.estudosjpa.dao.CategoriaDAO;
import br.com.gabriel.estudosjpa.modelo.Categoria;

public class CadastrarCategoria {

	public static void main(String[] args) {
		EntityTransaction entityTransaction = null;
		EntityManager entityManager = null;
		CategoriaDAO categoriaDAO = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("estudos-jpa");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			categoriaDAO = new CategoriaDAO(entityManager);
			Categoria categoria = new Categoria();
			categoria.setNome("Categoria de teste!");
			entityTransaction.begin();
			categoriaDAO.cadastrar(categoria);
			entityTransaction.commit();
			System.out.println("Categoria cadastrada com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if (entityManager != null) {
				entityManager.close();
				System.out.println("Conexão encerrada!");
			}
		}
	}
}
