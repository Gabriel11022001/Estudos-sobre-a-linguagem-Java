package com.gabrielsantos.exerciciossobrepoo.exercicio25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departamento {

	private String nome;
	private List<Funcionario> funcionarios;
	
	public Departamento() {
		this.funcionarios = new ArrayList<Funcionario>();
	}
	public Departamento(String nome) {
		this.funcionarios = new ArrayList<Funcionario>();
		this.setNome(nome);
	}
	public void setNome(String nome) {
		if (nome.equals("") || nome.isEmpty()) {
			throw new RuntimeException("Informe o nome do departamento!");
		}
		this.nome = nome;
	}
	public String getNome() {
		if (this.nome.equals("") || this.nome == null || this.nome.isEmpty()) {
			throw new RuntimeException("O nome do departamento ainda n�o foi informado, informe o nome do departamento!");
		}
		return this.nome;
	}
	public void registrarFuncionarioNoDepartamento(Funcionario funcionario) {
		if (funcionario == null) {
			throw new RuntimeException("Informe o funcion�rio!");
		}
		if (this.funcionarios.size() == 100) {
			throw new RuntimeException("O departamento j� possui 100 funcion�rios, n�o � mais poss�vel registrar funcion�rios nesse departamento!");
		}
		System.out.println("Funcion�rio " + funcionario.getNome() + " registrado no departamento " + this.getNome());
		this.funcionarios.add(funcionario);
	}
	public void fornecerAumentoParaFuncionarios() {
		if (this.funcionarios.size() == 0) {
			throw new RuntimeException("Esse departamento ainda n�o possui funcion�rios registrados!");
		}
		this.funcionarios.forEach((funcionario) -> {
			funcionario.receberAumento(10);
		});
		System.out.println("Todos os funcion�rios do departamento " + this.getNome() + " receberam um aumento de 10%!");
	}
	public List<Funcionario> getFuncionarios() {
		if (this.funcionarios.size() == 0) {
			throw new RuntimeException("Esse departamento ainda n�o possui funcion�rios!");
		}
		return Collections.unmodifiableList(this.funcionarios);
	}
}
