package com.gabriel.collections;

public class AnalistaDeSistemas extends Funcionario {

	public AnalistaDeSistemas() {
	}
	public AnalistaDeSistemas(String nome, double salario) {
		super(nome, salario);
	}
	@Override
	public double calcularBonificacao() {
		return super.getSalario() * 0.12;
	}
}
