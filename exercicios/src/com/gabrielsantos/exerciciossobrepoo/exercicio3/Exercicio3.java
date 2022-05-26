package com.gabrielsantos.exerciciossobrepoo.exercicio3;

public class Exercicio3 {

	public static void main(String[] args) {
		Repositorio repositorio = new Repositorio();
		repositorio.guarda(new AnalistaDeSuporte("123.456.789-00", "Gustavo"));
		repositorio.guarda(new AnalistaDeSuporte("123.456.789-01", "Pedro"));
		repositorio.guarda(new AnalistaDeSuporte("123.456.789-02", "Gabriel"));
		repositorio.guarda(new AnalistaDeSuporte("123.456.789-02", "Eduardo"));
		repositorio.guarda(new AnalistaDeSuporte("123.456.789-04", "Maria"));
		repositorio.guarda(new AnalistaDeSuporte("123.456.789-05", "Mariana"));
		repositorio.guarda(new AnalistaDeSuporte("123.456.789-06", "José"));
	}
}
