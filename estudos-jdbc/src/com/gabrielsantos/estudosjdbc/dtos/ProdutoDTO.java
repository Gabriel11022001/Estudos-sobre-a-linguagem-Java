package com.gabrielsantos.estudosjdbc.dtos;

public class ProdutoDTO {

	private Integer id;
	private String nome;
	private String descricaoResumida;
	private String descricaoCompleta;
	private Boolean estaAtivo;
	private Double preco;
	private Integer quantidadeUnidadesEmEstoque;
	
	public Integer getQuantidadeUnidadesEmEstoque() {
		return quantidadeUnidadesEmEstoque;
	}
	public void setQuantidadeUnidadesEmEstoque(Integer quantidadeUnidadesEmEstoque) {
		this.quantidadeUnidadesEmEstoque = quantidadeUnidadesEmEstoque;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricaoResumida() {
		return descricaoResumida;
	}
	public void setDescricaoResumida(String descricaoResumida) {
		this.descricaoResumida = descricaoResumida;
	}
	public String getDescricaoCompleta() {
		return descricaoCompleta;
	}
	public void setDescricaoCompleta(String descricaoCompleta) {
		this.descricaoCompleta = descricaoCompleta;
	}
	public Boolean getEstaAtivo() {
		return estaAtivo;
	}
	public void setEstaAtivo(Boolean estaAtivo) {
		this.estaAtivo = estaAtivo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
