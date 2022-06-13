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
			throw new RuntimeException("O objeto funcionário não pode apontar para null!");
		}
		if (funcionario.getNome().equals("") && funcionario.getSalario() == 0) {
			throw new RuntimeException("Informe o nome e o salário do funcionário!");
		}
		if (funcionario.getNome().equals("")) {
			throw new RuntimeException("Informe o nome do funcionário!");
		}
		if (funcionario.getSalario() == 0) {
			throw new RuntimeException("Informe o salário do funcionário!");
		}
		this.totalBonificacoesDaEmpresa += funcionario.calcularBonificacao();
		this.funcionarios.add(funcionario);
	}
	public List<Funcionario> getFuncionarios() {
		if (this.funcionarios.size() == 0) {
			throw new RuntimeException("A empresa não possui funcionarios registrados!");
		}
		return this.funcionarios;
	}
	public double getTotalBonificacoes() {
		return this.totalBonificacoesDaEmpresa;
	}
	public void apresentarOsFuncionariosDaEmpresa() {
		if (this.getFuncionarios().size() == 0) {
			throw new RuntimeException("A empresa não possui funcionarios registrados!");
		}
		for (Funcionario func : this.getFuncionarios()) {
			System.out.println("========================================");
			System.out.println("Nome do funcionï¿½rio: " + func.getNome());
			System.out.println("Salário: R$" + func.getSalario());
			System.out.println("Bonificação: R$" + func.calcularBonificacao());
			System.out.println("========================================");
		}
	}
	public void demitirFuncionario(Funcionario funcionario) {
		if (funcionario == null) {
			throw new RuntimeException(
					"A referência para o objeto do tipo Funcionario não deve apontar para null!");
		}
		this.getFuncionarios().remove(funcionario);
		this.totalBonificacoesDaEmpresa -= funcionario.calcularBonificacao();
		System.out.println("Funcionário demitido!");
	}
}
