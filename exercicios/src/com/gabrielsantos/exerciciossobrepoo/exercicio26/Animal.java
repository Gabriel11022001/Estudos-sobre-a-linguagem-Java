package com.gabrielsantos.exerciciossobrepoo.exercicio26;

public abstract class Animal {

	private String tipo;
	private String cor;
	
	public Animal(String tipo, String cor) {
		this.setCor(cor);
		this.setTipo(tipo);
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	@Override
	public String toString() {
		return "Cor: " + this.getCor() + " | Tipo: " + this.getTipo();
	}
}
