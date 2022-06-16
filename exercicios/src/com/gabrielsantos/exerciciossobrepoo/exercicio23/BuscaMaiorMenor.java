package com.gabrielsantos.exerciciossobrepoo.exercicio23;

import java.util.ArrayList;
import java.util.List;

public class BuscaMaiorMenor {

	private List<Double> valores;
	private Double maior;
	private Double menor;
	
	public BuscaMaiorMenor(Double primeiroValor, Double segundoValor, Double terceiroValor,
			Double quartoValor, Double quintoValor) {
		this.valores = new ArrayList<Double>();
		this.definirValor(primeiroValor);
		this.definirValor(segundoValor);
		this.definirValor(terceiroValor);
		this.definirValor(quartoValor);
		this.definirValor(quintoValor);
		this.setMaior();
		this.setMenor();
	}
	private void definirValor(Double valor) {
		if (valor == null) {
			throw new RuntimeException("O valor deve ser diferente de null!");
		}
		this.valores.add(valor);
	}
	private void setMaior() {
		Double maior = -999999999999999999999.0;
		for (Double v : this.valores) {
			if (v > maior) {
				maior = v;
			}
		}
		this.maior = maior;
	}
	private void setMenor() {
		Double menor = 999999999999999999999999.99;
		for (Double v : this.valores) {
			if (v < menor) {
				menor = v;
			}
		}
		this.menor = menor;
	}
	@Override
	public String toString() {
		String retorno = "Valores:\n";
		for (Double valor : this.valores) {
			retorno += valor + "\n";
		}
		retorno += "Maior valor: " + this.maior + "\n" + "Menor valor: " + this.menor;
		return retorno;
	}
}
