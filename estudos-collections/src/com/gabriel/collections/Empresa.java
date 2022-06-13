package com.gabriel.collections;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nome;
	private List<Funcionario> funcionarios;
	private double totalBonificacoesDaEmpresa;

	public Empresa() {
		this.nome = "";
		this.funcionarios = new ArrayList<Funcionario>();
	}
	public Empresa(String nome) {
		this.setNome(nome);
		this.funcionarios = new ArrayList<>();
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.isEmpty() || nome.equals("")) {
			throw new RuntimeException("Informe o nome da empresa!");
		}
		this.nome = nome;
	}
	public void registrarFuncionario(Funcionario funcionario) {
		if (funcionario == null) {
			throw new RuntimeException("O objeto funcion�rio n�o pode apontar para null!");
		}
		if (funcionario.getNome().equals("") && funcionario.getSalario() == 0) {
			throw new RuntimeException("Informe o nome e o sal�rio do funcion�rio!");
		}
		if (funcionario.getNome().equals("")) {
			throw new RuntimeException("Informe o nome do funcion�rio!");
		}
		if (funcionario.getSalario() == 0) {
			throw new RuntimeException("Informe o sal�rio do funcion�rio!");
		}
		this.totalBonificacoesDaEmpresa += funcionario.calcularBonificacao();
		this.funcionarios.add(funcionario);
	}
	public List<Funcionario> getFuncionarios() {
		if (this.funcionarios.size() == 0) {
			throw new RuntimeException("A empresa n�o possui funcionarios registrados!");
		}
		return this.funcionarios;
	}
	public double getTotalBonificacoes() {
		return this.totalBonificacoesDaEmpresa;
	}
	public void apresentarOsFuncionariosDaEmpresa() {
		if (this.getFuncionarios().size() == 0) {
			throw new RuntimeException("A empresa n�o possui funcionarios registrados!");
		}
		for (Funcionario func : this.getFuncionarios()) {
			System.out.println("========================================");
			System.out.println("Nome do funcion�rio: " + func.getNome());
			System.out.println("Sal�rio: R$" + func.getSalario());
			System.out.println("Bonifica��o: R$" + func.calcularBonificacao());
			System.out.println("========================================");
		}
	}
	public void demitirFuncionario(Funcionario funcionario) {
		if (funcionario == null) {
			throw new RuntimeException(
					"A refer�ncia para o objeto do tipo Funcionario n�o deve apontar para null!");
		}
		this.getFuncionarios().remove(funcionario);
		this.totalBonificacoesDaEmpresa -= funcionario.calcularBonificacao();
		System.out.println("Funcion�rio demitido!");
	}
}
