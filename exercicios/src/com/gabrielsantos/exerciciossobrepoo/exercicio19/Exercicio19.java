package com.gabrielsantos.exerciciossobrepoo.exercicio19;

import java.util.Date;

public class Exercicio19 {

	public static void main(String[] args) {
		try {
			Localidade origem = new Localidade("Bastos", "BR");
			Localidade destino = new Localidade("São Paulo", "BR");
			Date dataIda = new Date(2022, 8, 12);
			Date dataRetorno = new Date(2022, 9, 12);
			Passageiro passageiro = new Passageiro("Gabriel Rodrigues dos Santos", "123.456.789-00");
			Passagem passagem = new Passagem(destino, origem, 2000, passageiro, dataIda, dataRetorno);
			passagem.apresentarPassagem();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
