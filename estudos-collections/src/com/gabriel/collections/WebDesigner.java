package com.gabriel.collections;

public class WebDesigner extends Funcionario {

	public WebDesigner() {
	}
	public WebDesigner(String nome, double salario) {
		super(nome, salario);
	}
	@Override
	public double calcularBonificacao() {
		return super.getSalario() * 0.10;
	}
}
