package com.gabrielsantos.exerciciossobrepoo.exercicio21;

public class Empregado {

	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	public Empregado(String nome, String sobrenome, double salarioMensal) throws Exception {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setSalarioMensal(salarioMensal);
	}
	public void setNome(String nome) throws Exception {
		if (nome.equals("") || nome == null) {
			throw new Exception("Informe o nome do empregado!");
		}
		this.nome = nome;
	}
	public String getNome() throws Exception {
		if (this.nome == null || this.nome.equals("")) {
			throw new Exception("O nome do empregado ainda não foi informado, informe o nome do empregado!");
		}
		return this.nome;
	}
	public void setSobrenome(String sobrenome) throws Exception {
		if (sobrenome == null || sobrenome.equals("")) {
			throw new Exception("Informe o sobrenome do empregado!");
		}
		this.sobrenome = sobrenome;
	}
	public String getSobrenome() throws Exception {
		if (this.sobrenome.equals("") || this.sobrenome == null) {
			throw new Exception("O sobrenome do empregado ainda não foi informado, informe o sobrenome do empregado!");
		}
		return this.sobrenome;
	}
	public void setSalarioMensal(double salarioMensal) throws Exception {
		if (salarioMensal <= 0) {
			throw new Exception("O salário mensal deve ser maior que R$0,00!");
		}
		this.salarioMensal = salarioMensal;
	}
	public double getSalarioMensal() throws Exception {
		if (this.salarioMensal == 0) {
			throw new Exception("O salário mensal ainda não foi informado, informe o salário mensal do empregado!");
		}
		return this.salarioMensal;
	}
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Sobrenome: " + this.sobrenome + "\n" + "Salário mensal: R$" + this.salarioMensal;
	}
	public double calcularSalarioAnual() throws Exception {
		if (this.getSalarioMensal() == 0) {
			throw new Exception("O salário mensal do funcionário ainda não foi informado, informe o salário mensal do funcionário!");
		}
		return this.getSalarioMensal() * 12;
	}
}
