package com.gabrielsantos.exerciciossobrepoo.exercicio15.entidades;

public class Produto {

	private Integer id;
	private String nome;
	private Double preco;
	private Categoria categoria;
	
	public Produto() {
		this.categoria = new Categoria();
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	public boolean setNome(String nome) {
		if (nome.isEmpty()) {
			return false;
		}
		this.nome = nome;
		return true;
	}
	public String getNome() {
		return this.nome;
	}
	public boolean setPreco(Double preco) {
		if (preco <= 0) {
			return false;
		}
		this.preco = preco;
		return true;
	}
	public Double getPreco() {
		return this.preco;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Categoria getCategoria() {
		return this.categoria;
	}
}
