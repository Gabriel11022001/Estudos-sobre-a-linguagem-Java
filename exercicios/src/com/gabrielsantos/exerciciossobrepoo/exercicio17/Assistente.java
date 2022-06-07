package com.gabrielsantos.exerciciossobrepoo.exercicio17;

public abstract class Assistente extends Funcionario {

	private int numeroMatricula;
	
	public Assistente(String nome, double salario, int numeroMatricula) throws Exception {
		super(nome, salario);
		this.setNumeroMatricula(numeroMatricula);
	}
	public void setNumeroMatricula(int numeroMatricula) throws Exception {
		if (numeroMatricula < 0) {
			throw new Exception("O número da matrícula deve ser maior ou igual a 0!");
		}
		this.numeroMatricula = numeroMatricula;
	}
	public int getNumeroMatricula() {
		return this.numeroMatricula;
	}
}
