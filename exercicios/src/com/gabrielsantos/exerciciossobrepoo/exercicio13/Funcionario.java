package com.gabrielsantos.exerciciossobrepoo.exercicio13;

public class Funcionario {

	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.setSalario(salario);
		this.setNome(nome);
	}
	public void setNome(String nome) {
		if (nome.isEmpty()) {
			throw new RuntimeException("Nome inválido, informe o nome do funcionário!");
		}
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	private void setSalario(double salario) {
		if (salario <= 0) {
			throw new RuntimeException("O salário deve ser maior que R$0,00!");
		}
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public void aumentarSalario(double percentualAumento) {
		if (percentualAumento <= 0) {
			throw new RuntimeException("O percentual de aumento deve ser maior que 0%!");
		}
		double novoSalario = this.getSalario() + (this.getSalario() * (percentualAumento / 100));
		this.setSalario(novoSalario);
	}
}
