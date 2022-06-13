package com.gabriel.collections;

public abstract class Funcionario {

	private String nome = null;
	private double salario;

	public Funcionario() {
		this.nome = "";
	}
	public Funcionario(String nome, double salario) {
		this.setNome(nome);
		this.setSalario(salario);
	}
	public String getNome() {
		if (this.nome == null) {
			return "";
		}
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		if (salario <= 0) {
			throw new RuntimeException("O salário do funcionário não deve ser menor ou igual a R$0,00!");
		}
		this.salario = salario;
	}
	public abstract double calcularBonificacao();
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			throw new RuntimeException("O objeto para comparação não pode apontar para null!");
		}
		Funcionario funcComparacao = (Funcionario) obj;
		if (funcComparacao.getNome().equals(this.getNome())) {
			return true;
		}
		return false;
	}
}
