package com.gabrielsantos.apiprodutos.models;

public class Categoria {

	private int id;
	private String descricao;
	
	public Categoria() {}
	public Categoria(int id, String descricao) {
		this.setId(id);
		this.setDescricao(descricao);
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}
}
