package com.gabrielsantos.exerciciossobrepoo.exercicio11;

public class BombaCombustivel {

	private double quantidadeLitrosCombustivelNaBomba;
	private double valorLitro;
	private String tipoCombustivel;
	
	public BombaCombustivel(double valorLitro, String tipoCombustivel) {
		this.setValorLitro(valorLitro);
		this.setValorLitro(valorLitro);
	}
	public void setValorLitro(double valorLitro) {
		if (valorLitro <= 0) {
			throw new RuntimeException("O valor do litro deve ser um valor maior que R$0,00!");
		}
		this.valorLitro = valorLitro;
	}
	public double getValorLitro() {
		return this.valorLitro;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		if (tipoCombustivel.isEmpty()) {
			throw new RuntimeException("Informe o tipo do combustivel!");
		}
		this.tipoCombustivel = tipoCombustivel;
	}
	public String getTipoCombustivel() {
		return this.tipoCombustivel;
	}
	public void reabastecerABomba(double quantidadeLitros) {
		if (quantidadeLitros <= 0) {
			throw new RuntimeException("A quantidade de litros de combustível deve ser maior que 0 litros!");
		}
		this.quantidadeLitrosCombustivelNaBomba += quantidadeLitros;
	}
	public void abastecerPorValor(double valor) {
		double quantidadeAbastecido = valor / this.getValorLitro();
		if (quantidadeAbastecido > this.quantidadeLitrosCombustivelNaBomba) {
			throw new RuntimeException("Não existe combustível suficiente na bomba!");
		}
		this.quantidadeLitrosCombustivelNaBomba -= quantidadeAbastecido;
		System.out.println("Quantidade de litros que foram abastecidos: " + quantidadeAbastecido + " litros.");
	}
	public void abastecerPorLitro(double quantidadeLitros) {
		if (quantidadeLitros > this.quantidadeLitrosCombustivelNaBomba) {
			throw new RuntimeException("Não existe combustível suficiente na bomba!");
		}
		this.quantidadeLitrosCombustivelNaBomba -= quantidadeLitros;
		double valorTotal = quantidadeLitros * this.getValorLitro();
		System.out.println("Valor total do abastecimento: R$" + valorTotal);
	}
	public void apresentarQuantidadeCombustivelNaBomba() {
		System.out.println("**************************");
		System.out.println("Quantidade de combustivel na bomba: " + this.quantidadeLitrosCombustivelNaBomba + " litros!");
		System.out.println("**************************");
	}
}
