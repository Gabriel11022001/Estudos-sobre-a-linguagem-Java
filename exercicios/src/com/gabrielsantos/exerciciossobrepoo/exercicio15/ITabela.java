package com.gabrielsantos.exerciciossobrepoo.exercicio15;

import java.util.List;

public interface ITabela<T> {

	public void cadastrar(T entidade);
	public void deletar(Integer id);
	public List<T> buscarTodos();
	public T buscarPeloId(Integer id);
}
