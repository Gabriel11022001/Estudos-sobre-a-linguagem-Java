package com.gabrielsantos.exerciciossobrepoo.exercicio17;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) throws Exception {
		super(nome, salario);
	}
	@Override
	public void apresentarDados() {
		System.out.println("********************************************");
		System.out.println("Apresentando os dados do gerente:");
		System.out.println("Nome: " + super.getNome());
		System.out.println("Salário: R$" + super.getSalario());
		System.out.println("********************************************");
	}
}
