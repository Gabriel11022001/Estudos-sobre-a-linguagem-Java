package br.com.gabriel.estudosjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gabriel.estudosjpa.modelo.Categoria;

public class CategoriaDAO {
	
	private EntityManager entityManager;
	
	public CategoriaDAO(EntityManager entityManager) throws Exception {
		this.entityManager = entityManager;
	}
	public void cadastrar(Categoria categoria) throws Exception {
		this.entityManager.persist(categoria);
	}
	public void remover(Categoria categoria) throws Exception {
		this.entityManager.remove(categoria);
	}
	public Categoria buscarPeloId(Integer id) throws Exception {
		return this.entityManager.find(Categoria.class, id);
	}
	public List<Categoria> buscarTodas() throws Exception{
		String jpql = "select c from Categoria c";
		return this.entityManager.createQuery(jpql, Categoria.class).getResultList();
	}
	public List<Categoria> buscarCategoriasQueContem(String nome) {
		String jpql = "select c from Categoria c where c.nome like %:nome%";
		return this.entityManager.createQuery(jpql, Categoria.class)
				.setParameter("nome", nome)
				.getResultList();
	}
}
