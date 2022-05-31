package com.gabrielsantos.exerciciossobrepoo.exercicio7;

public class TestaBola {

	public static void main(String[] args) {
		Bola bola1 = new Bola("Azul");
		bola1.trocarCor("Verde");
		Bola bola2 = new Bola("Amarelo");
		bola2.trocarCor("Branco");
		bola1.mostrarCor();
		bola2.mostrarCor();
	}
}
