package com.gabrielsantos.exerciciossobrepoo.exercicio15.tabelas;

import java.util.ArrayList;
import java.util.List;

import com.gabrielsantos.exerciciossobrepoo.exercicio15.ITabela;
import com.gabrielsantos.exerciciossobrepoo.exercicio15.entidades.Categoria;

public class TabelaCategorias implements ITabela<Categoria> {

	private List<Categoria> categorias;
	
	public TabelaCategorias() {
		this.categorias = new ArrayList<Categoria>();
	}
	@Override
	public void cadastrar(Categoria entidade) {
		int id = 0;
		if (this.categorias.size() == 0) {
			id = 1;
		} else {
			for (Categoria cat : this.categorias) {
				id = cat.getId() + 1;
			}	
		}
		entidade.setId(id);
		this.categorias.add(entidade);
		System.out.println("Categoria cadastrada com sucesso!");
	}
	@Override
	public void deletar(Integer id) {
		if (this.categorias.size() == 0) {
			System.out.println("Não existem categorias cadastradas no banco de dados!");
			return;
		}
		int indice = id - 1;
		Categoria cate = this.categorias.get(indice);
		if (cate == null) {
			System.out.println("Essa categoria não está cadastrada no banco de dados!");
			return;
		}
		this.categorias.remove(indice);
		System.out.println("Categoria deletada com sucesso!");
	}
	@Override
	public List<Categoria> buscarTodos() {
		if (this.categorias.size() == 0) {
			System.out.println("Não existem categorias cadastradas no banco de dados!");
			return null;
		}
		return this.categorias;
	}
	@Override
	public Categoria buscarPeloId(Integer id) {
		Categoria cate = this.categorias.get(id - 1);
		if (cate == null) {
			System.out.println("Essa categoria não está cadastrada no banco de dados!");
			return null;
		}
		return cate;
	}
}
