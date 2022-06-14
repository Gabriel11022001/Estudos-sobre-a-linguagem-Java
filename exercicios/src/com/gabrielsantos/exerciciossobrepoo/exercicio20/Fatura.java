package com.gabrielsantos.exerciciossobrepoo.exercicio20;

public class Fatura {

	private String descricao;
	private int numeroFatura;
	private int quantidadeUnidadesItem;
	private double precoPorItem;
	
	public Fatura(String descricao, int numeroFatura, int quantidadeUnidadesItem, double precoPorItem) throws Exception {
		this.setDescricao(descricao);
		this.setNumeroFatura(numeroFatura);
		this.setPrecoPorItem(precoPorItem);
		this.setQuantidadeUnidadesItem(quantidadeUnidadesItem);
	}
	public void setDescricao(String descricao) throws Exception {
		if (descricao.equals("") || descricao.isEmpty()) {
			throw new Exception("Informe a descrição da fatura!");
		}
		this.descricao = descricao;
	}
	public String getDescricao() throws Exception {
		if (this.descricao == null) {
			throw new Exception("A descrição da fatura ainda não foi informada, informe a descrição da fatura!");
		}
		return this.descricao;
	}
	public void setNumeroFatura(int numeroFatura) throws Exception {
		if (numeroFatura <= 0) {
			throw new Exception("Informe o número da matrícula, esse número deve ser maior que 0!");
		}
		this.numeroFatura = numeroFatura;
	}
	public int getNumeroFatura() throws Exception {
		if (this.numeroFatura == 0) {
			throw new Exception("O número da fatura ainda não foi informado, informe o número da fatura!");
		}
		return this.numeroFatura;
	}
	public void setQuantidadeUnidadesItem(int quantidadeUnidadesItem) throws Exception {
		if (quantidadeUnidadesItem <= 0) {
			throw new Exception("Informe a quantidade de unidades do item da fatura!");
		}
		this.quantidadeUnidadesItem = quantidadeUnidadesItem;
	}
	public int getQuantidadeUnidadesItem() throws Exception {
		if (this.quantidadeUnidadesItem == 0) {
			throw new Exception("A quantidade de unidades do item da fatura ainda não foi informado, informe quantos itens foram vendidos na fatura!");
		}
		return this.quantidadeUnidadesItem;
	}
	public void setPrecoPorItem(double precoPorItem) throws Exception {
		if (precoPorItem <= 0) {
			throw new Exception("Informe o preço por item, esse valor deve ser maior que R$0,00!");
		}
		this.precoPorItem = precoPorItem;
	}
	public double getPrecoPorItem() throws Exception {
		if (this.precoPorItem == 0) {
			throw new Exception("O valor por item da fatura não foi informado, informe esse valor!");
		}
		return this.precoPorItem;
	}
	public double calcularValorTotalFatura() throws Exception {
		return this.getQuantidadeUnidadesItem() * this.getPrecoPorItem();
	}
}
