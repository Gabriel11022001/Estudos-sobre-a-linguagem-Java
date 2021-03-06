package com.gabriel.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Empresa {

	private String nome;
	private List<Funcionario> funcionarios;
	private double totalBonificacoesDaEmpresa;
	private Map<String, Funcionario> registrosDeFuncionariosPeloNome;

	public Empresa() {
		this.nome = "";
		this.funcionarios = new ArrayList<Funcionario>();
		this.registrosDeFuncionariosPeloNome = new HashMap<String, Funcionario>();
	}
	public Empresa(String nome) {
		this.setNome(nome);
		this.funcionarios = new ArrayList<>();
		this.registrosDeFuncionariosPeloNome = new HashMap<String, Funcionario>();
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
			throw new RuntimeException("O objeto funcion?rio n?o pode apontar para null!");
		}
		if (funcionario.getNome().equals("") && funcionario.getSalario() == 0) {
			throw new RuntimeException("Informe o nome e o sal?rio do funcion?rio!");
		}
		if (funcionario.getNome().equals("")) {
			throw new RuntimeException("Informe o nome do funcion?rio!");
		}
		if (funcionario.getSalario() == 0) {
			throw new RuntimeException("Informe o sal?rio do funcion?rio!");
		}
		this.totalBonificacoesDaEmpresa += funcionario.calcularBonificacao();
		this.funcionarios.add(funcionario);
		this.registrosDeFuncionariosPeloNome.put(funcionario.getNome(), funcionario);
	}
	public List<Funcionario> getFuncionarios() {
		if (this.funcionarios.size() == 0) {
			throw new RuntimeException("A empresa n?o possui funcionarios registrados!");
		}
		return this.funcionarios;
	}
	public double getTotalBonificacoes() {
		return this.totalBonificacoesDaEmpresa;
	}
	public void apresentarOsFuncionariosDaEmpresa() {
		if (this.getFuncionarios().size() == 0) {
			throw new RuntimeException("A empresa n?o possui funcionarios registrados!");
		}
		for (Funcionario func : this.getFuncionarios()) {
			System.out.println("========================================");
			System.out.println("Nome do funcion?rio: " + func.getNome());
			System.out.println("Sal?rio: R$" + func.getSalario());
			System.out.println("Bonifica??o: R$" + func.calcularBonificacao());
			System.out.println("========================================");
		}
	}
	public void demitirFuncionario(Funcionario funcionario) {
		if (funcionario == null) {
			throw new RuntimeException(
					"A refer?ncia para o objeto do tipo Funcionario n?o deve apontar para null!");
		}
		this.getFuncionarios().remove(funcionario);
		this.registrosDeFuncionariosPeloNome.remove(funcionario.getNome());
		this.totalBonificacoesDaEmpresa -= funcionario.calcularBonificacao();
		System.out.println("Funcion?rio demitido!");
	}
	public boolean funcionarioEstaRegistrado(Funcionario funcionario) {
		return this.funcionarios.contains(funcionario);
	}
	public Funcionario buscarFuncionarioComNome(String nome) {
		return this.registrosDeFuncionariosPeloNome.get(nome);
	}
}