package com.gabrielsantos.exerciciossobrepoo.exercicio25;

import java.util.Date;

public class Funcionario {

	private String nome;
	private double salario;
	private Date dataAdmissao;
	
	public Funcionario() {}
	public Funcionario(String nome, double salario, Date dataAdmissao) {
		this.setNome(nome);
		this.setDataAdmissao(dataAdmissao);
		this.setSalario(salario);
	}
	public void setNome(String nome) {
		if (nome.equals("") || nome.isEmpty()) {
			throw new RuntimeException("Informe o nome do funcionário!");
		}
		this.nome = nome;
	}
	public String getNome() {
		if (this.nome.equals("") || this.nome == null || this.nome.isEmpty()) {
			throw new RuntimeException("O nome do funcionário ainda não foi informado, informe o nome do funcionário!");
		}
		return this.nome;
	}
	public void setSalario(double salario) {
		if (salario <= 0) {
			throw new RuntimeException("Informe o salário do funcionário!");
		}
		this.salario = salario;
	}
	public double getSalario() {
		if (this.salario == 0) {
			throw new RuntimeException("O salário do funcionário ainda não foi informado, informe o salário do funcionário!");
		}
		return this.salario;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		if (dataAdmissao == null) {
			throw new RuntimeException("Informe a data de admissão do funcionário!");
		}
		this.dataAdmissao = dataAdmissao;
	}
	public Date getDataAdmissao() {
		if (this.dataAdmissao == null) {
			throw new RuntimeException("A data de admissão do funcionário não foi informada, informe a data de admissão do mesmo!");
		}
		return this.dataAdmissao;
	}
	public void receberAumento(double percentual) {
		double novoSalario = this.getSalario() + (this.getSalario() * (percentual / 100));
		this.salario = novoSalario;
	}
}
