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
			throw new Exception("Informe a descri��o da fatura!");
		}
		this.descricao = descricao;
	}
	public String getDescricao() throws Exception {
		if (this.descricao == null) {
			throw new Exception("A descri��o da fatura ainda n�o foi informada, informe a descri��o da fatura!");
		}
		return this.descricao;
	}
	public void setNumeroFatura(int numeroFatura) throws Exception {
		if (numeroFatura <= 0) {
			throw new Exception("Informe o n�mero da matr�cula, esse n�mero deve ser maior que 0!");
		}
		this.numeroFatura = numeroFatura;
	}
	public int getNumeroFatura() throws Exception {
		if (this.numeroFatura == 0) {
			throw new Exception("O n�mero da fatura ainda n�o foi informado, informe o n�mero da fatura!");
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
			throw new Exception("A quantidade de unidades do item da fatura ainda n�o foi informado, informe quantos itens foram vendidos na fatura!");
		}
		return this.quantidadeUnidadesItem;
	}
	public void setPrecoPorItem(double precoPorItem) throws Exception {
		if (precoPorItem <= 0) {
			throw new Exception("Informe o pre�o por item, esse valor deve ser maior que R$0,00!");
		}
		this.precoPorItem = precoPorItem;
	}
	public double getPrecoPorItem() throws Exception {
		if (this.precoPorItem == 0) {
			throw new Exception("O valor por item da fatura n�o foi informado, informe esse valor!");
		}
		return this.precoPorItem;
	}
	public double calcularValorTotalFatura() throws Exception {
		return this.getQuantidadeUnidadesItem() * this.getPrecoPorItem();
	}
}
