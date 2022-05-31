package com.gabrielsantos.exerciciossobrepoo.exercicio9;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public Pessoa(String nome, double altura, double peso, int idade) throws Exception {
		this.setNome(nome);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setIdade(idade);
	}
	private void setNome(String nome) {
		if (nome.isEmpty()) {
			throw new RuntimeException("Informe o nome da pessoa!");
		}
		this.nome = nome;
	}
	private void setAltura(double altura) throws Exception {
		if (altura <= 0) {
			throw new Exception("A altura deve ser maior que 0 cm!");
		}
		this.altura = altura;
	}
	private void setPeso(double peso) throws Exception {
		if (peso <= 0) {
			throw new Exception("O peso deve ser maior que 0kg!");
		}
		this.peso = peso;
	}
	private void setIdade(int idade) throws Exception {
		if (idade <= 0) {
			throw new Exception("A idade deve ser maior que 0!");
		}
		this.idade = idade;
	}
	public void envelhecer() throws Exception {
		if (this.getIdade() < 21) {
			this.crescer(0.05);
		}
		this.idade++;
	}
	public int getIdade() {
		return this.idade;
	}
	public String getNome() {
		return this.nome;
	}
	public double getAltura() {
		return this.altura;
	}
	public double getPeso() {
		return this.peso;
	}
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " | Altura: " + this.getAltura() + " metros | Peso: " + this.getPeso() + " kg | Idade: " + this.getIdade() + " anos!"; 
	}
	public void engordar(double quantoEngordou) throws Exception {
		if (quantoEngordou <= 0) {
			throw new Exception("Não é possível uma pessoa engordar um valor em kg menor que 0!");
		}
		this.peso += quantoEngordou;
		System.out.println(this.getNome() + " engordou " + quantoEngordou + " kg!");
	}
	public void crescer(double quantoCresceu) throws Exception {
		if (quantoCresceu <= 0) {
			throw new Exception("Não é possível uma pessoa crescer em cm um valor menor ou igual a 0!");
		}
		this.altura += quantoCresceu;
		System.out.println(this.getNome() + " cresceu " + quantoCresceu + " cm!");
	}
	public void emagrecer(double quantoEmagreceu) throws Exception {
		if (quantoEmagreceu <= 0) {
			throw new Exception("Não pé possível uma pessoa emagrecer em kg um valor menor ou igual a 0!");
		}
		this.peso -= quantoEmagreceu;
		System.out.println(this.getNome() + " emagreceu " + quantoEmagreceu + " kg!");
	}
}
