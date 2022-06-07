package com.gabrielsantos.exerciciossobrepoo.exercicio16;

public class Mouse extends Produto {

	private String tipo;
	
	public Mouse(String descricao, String tipo) {
		super.descricao = descricao;
		this.tipo = tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	@Override
	public String getDescricao() {
		return super.descricao + " | Autor: " + this.getTipo();
	}
}
