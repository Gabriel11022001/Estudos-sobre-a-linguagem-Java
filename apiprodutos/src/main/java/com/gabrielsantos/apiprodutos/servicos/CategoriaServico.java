package com.gabrielsantos.apiprodutos.servicos;

import com.gabrielsantos.apiprodutos.repositorios.CategoriaRepositorio;
import com.gabrielsantos.apiprodutos.utilitarios.ConteudoResposta;

public class CategoriaServico implements IServico {

	private CategoriaRepositorio categoriaRepositorio;
	
	public CategoriaServico() {
		this.categoriaRepositorio = new CategoriaRepositorio();
	}
}
