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
			throw new RuntimeException("Informe o nome do funcion�rio!");
		}
		this.nome = nome;
	}
	public String getNome() {
		if (this.nome.equals("") || this.nome == null || this.nome.isEmpty()) {
			throw new RuntimeException("O nome do funcion�rio ainda n�o foi informado, informe o nome do funcion�rio!");
		}
		return this.nome;
	}
	public void setSalario(double salario) {
		if (salario <= 0) {
			throw new RuntimeException("Informe o sal�rio do funcion�rio!");
		}
		this.salario = salario;
	}
	public double getSalario() {
		if (this.salario == 0) {
			throw new RuntimeException("O sal�rio do funcion�rio ainda n�o foi informado, informe o sal�rio do funcion�rio!");
		}
		return this.salario;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		if (dataAdmissao == null) {
			throw new RuntimeException("Informe a data de admiss�o do funcion�rio!");
		}
		this.dataAdmissao = dataAdmissao;
	}
	public Date getDataAdmissao() {
		if (this.dataAdmissao == null) {
			throw new RuntimeException("A data de admiss�o do funcion�rio n�o foi informada, informe a data de admiss�o do mesmo!");
		}
		return this.dataAdmissao;
	}
	public void receberAumento(double percentual) {
		double novoSalario = this.getSalario() + (this.getSalario() * (percentual / 100));
		this.salario = novoSalario;
	}
}
