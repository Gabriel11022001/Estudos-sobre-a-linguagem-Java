package com.gabrielsantos.exerciciossobrepoo.exercicio16;

public class Livro extends Produto {

	private String nomeAutor;
	
	public Livro(String descricao, String nomeAutor) {
		super.descricao = descricao;
		this.nomeAutor = nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public String getNomeAutor() {
		return this.nomeAutor;
	}
	@Override
	public String getDescricao() {
		return super.descricao + " | Autor: " + this.getNomeAutor();
	}
}
