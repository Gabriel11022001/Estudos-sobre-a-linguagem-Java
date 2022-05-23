package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	public void apresentarDados() {
		System.out.println("****************************");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Salário: R$" + this.getSalario());
		System.out.println("****************************");
	}
}
