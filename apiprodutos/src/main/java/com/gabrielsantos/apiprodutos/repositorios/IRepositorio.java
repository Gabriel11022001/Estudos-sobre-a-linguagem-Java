package com.gabrielsantos.apiprodutos.repositorios;

import java.util.List;

public interface IRepositorio<E> {

	public void salvar(E entidade) throws Exception;
	public void atualizar(E entidade) throws Exception;
	public E buscarPeloId(int id) throws Exception;
	public List<E> buscarTodos() throws Exception;
	public List<E> buscarPelaDescricao(String descricao) throws Exception;
	public void remover(int id) throws Exception;
}
