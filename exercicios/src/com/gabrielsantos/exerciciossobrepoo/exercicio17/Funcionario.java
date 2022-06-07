package com.gabrielsantos.exerciciossobrepoo.exercicio17;

public abstract class Funcionario {

	private String nome;
	private double salario;
	private final double salarioFixo;
	
	public Funcionario(String nome, double salario) throws Exception {
		this.setNome(nome);
		this.setSalario(salario);
		this.salarioFixo = salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	protected double getSalarioFixo() {
		return this.salarioFixo;
	}
	public String getNome() {
		return this.nome;
	}
	public void setSalario(double salario) throws Exception {
		if (salario <= 0) {
			throw new Exception("O salário deve ser maior que R$0,00!");
		}
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public abstract void apresentarDados();
}
