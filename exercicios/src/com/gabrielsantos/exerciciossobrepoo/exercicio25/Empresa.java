package com.gabrielsantos.exerciciossobrepoo.exercicio25;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nome;
	private List<Departamento> departamentos;
	
	public Empresa() {
		this.departamentos = new ArrayList<Departamento>();
	}
	public Empresa(String nome) {
		this.setNome(nome);
		this.departamentos = new ArrayList<Departamento>();
	}
	public void setNome(String nome) {
		if (nome.equals("") || nome.isEmpty()) {
			throw new RuntimeException("Informe o nome da empresa!");
		}
		this.nome = nome;
	}
	public String getNome() {
		if (this.nome.equals("") || this.nome.isEmpty() || this.nome == null) {
			throw new RuntimeException("O nome da empresa ainda não foi informado, informe o nome da empresa!");
		}
		return this.nome;
	}
	public void registrarDepartamentoNaEmpresa(Departamento departamento) {
		if (departamento == null) {
			throw new RuntimeException("Informe o departamento!");
		}
		if (this.departamentos.size() == 10) {
			throw new RuntimeException("A empresa já possui 10 departamentos, não é mais possível adicionar departamentos nessa empresa!");
		}
		System.out.println("Departamento " + departamento.getNome() + " registrado na empresa " + this.getNome());
		this.departamentos.add(departamento);
	}
	public void fornecerAumentoParaFuncionariosDoDepartamento(String nomeDoDepartamento) {
		if (this.departamentos.size() == 0) {
			throw new RuntimeException("Essa empresa ainda não possui departamentos registrados!");
		}
		IBuscaDepartamento buscadorDeDepartamento = (nomeDepartamento, departamentos) -> {
			for (Departamento depar : departamentos) {
				if (depar.getNome().equals(nomeDoDepartamento)) {
					return depar;
				}
			}
			return null;
		};
		Departamento departamento = buscadorDeDepartamento.buscarDepartamento(nomeDoDepartamento, this.departamentos);
		if (departamento == null) {
			throw new RuntimeException("Essa empresa não possui um departamento com esse nome!");
		}
		departamento.fornecerAumentoParaFuncionarios();
	}
	public void apresentarInformacoesSobreAEmpresa() {
		String nomeEmpresa = this.getNome();
		System.out.println("Informações sobre a empresa:");
		System.out.println("Nome: " + nome);
		System.out.println("Informações sobre os departamentos:");
		this.departamentos.forEach((departamento) -> {
			System.out.println("***************************************************");
			System.out.println("Nome do departamento: " + departamento.getNome());
			System.out.println("Funcionários do departamento:");
			List<Funcionario> funcionariosDoDepartamento = departamento.getFuncionarios();
			funcionariosDoDepartamento.forEach((funcionario) -> {
				System.out.println("Nome do funcionário: " + funcionario.getNome());
				System.out.println("Salário: R$" + funcionario.getSalario());
				System.out.println("Data em que foi registrado: " + funcionario.getDataAdmissao().toString());
			});
			System.out.println("***************************************************");
		});
	}
}
