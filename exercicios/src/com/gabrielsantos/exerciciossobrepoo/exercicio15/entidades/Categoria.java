package com.gabrielsantos.exerciciossobrepoo.exercicio15.entidades;

public class Categoria {

	private Integer id;
	private String descricao;
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	public boolean setDescricao(String descricao) {
		if (descricao.isEmpty()) {
			return false;
		}
		this.descricao = descricao;
		return true;
	}
	public String getDescricao() {
		return this.descricao;
	}
}
