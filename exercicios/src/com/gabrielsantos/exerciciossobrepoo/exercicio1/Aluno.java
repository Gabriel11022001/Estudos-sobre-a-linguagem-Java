package com.gabrielsantos.exerciciossobrepoo.exercicio1;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	private double notaPrimeiraProva;
	private double notaSegundaProva;
	private double notaTrabalho;
	
	public Aluno() {
		this.setNotaPrimeiraProva(-1);
		this.setNotaSegundaProva(-1);
		this.setNotaTrabalho(-1);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	public int getNumeroMatricula() {
		return this.numeroMatricula;
	}
	public void setNotaPrimeiraProva(double notaPrimeiraProva) {
		this.notaPrimeiraProva = notaPrimeiraProva;
	}
	public double getNotaPrimeiraProva() {
		return this.notaPrimeiraProva;
	}
	public void setNotaSegundaProva(double notaSegundaProva) {
		this.notaSegundaProva = notaSegundaProva;
	}
	public double getNotaSegundaProva() {
		return this.notaSegundaProva;
	}
	public void setNotaTrabalho(double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	public double getNotaTrabalho() {
		return this.notaTrabalho;
	}
	public double calcularMedia() {
		return ((this.notaPrimeiraProva * 2.5) + (this.notaSegundaProva * 2.5) + (this.notaTrabalho * 2)) / 7;
	}
	public void apresentarInformacoesSobreAluno() {
		System.out.println("Nome do aluno: " + this.getNome());
		System.out.println("Número de matrícula do aluno: " + this.getNumeroMatricula());
		System.out.println("Nota da primeira prova: " + this.notaPrimeiraProva);
		System.out.println("Nota da segunda prova: " + this.notaSegundaProva);
		System.out.println("Nota do tabalho: " + this.getNotaTrabalho());
	}
}
