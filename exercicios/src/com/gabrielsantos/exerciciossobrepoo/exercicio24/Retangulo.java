package com.gabrielsantos.exerciciossobrepoo.exercicio24;

public class Retangulo {

	private double area;
	private double largura;
	private double altura;
	
	public Retangulo(double altura, double largura) {
		this.setAltura(altura);
		this.setLargura(largura);
		this.setArea();
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	private void setArea() {
		this.area = this.getAltura() * this.getLargura();
	}
	public double getArea() {
		return this.area;
	}
	public double getLargura() {
		return this.largura;
	}
	public double getAltura() {
		return this.altura;
	}
}
