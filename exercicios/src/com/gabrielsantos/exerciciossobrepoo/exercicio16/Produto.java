package com.gabrielsantos.exerciciossobrepoo.exercicio16;

public abstract class Produto {

	private String nomeLoja;
	private double preco;
	protected String descricao;
	
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	public String getNomeLoja() {
		return this.nomeLoja;
	}
	public void setPreco(double preco) throws Exception {
		if (preco < 0) {
			throw new Exception("O preço de venda do produto não deve ser menor que R$0,00!");
		}
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	public String getDescricao() {
		return "Produto de informática.";
	}
}
