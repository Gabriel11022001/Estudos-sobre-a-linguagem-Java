package com.gabrielsantos.exerciciossobrepoo.exercicio21;

public class FornecedorDeAumento {

	public static void darAumento(Empregado empregado, double percentualAumento) throws Exception {
		double salarioAtual = empregado.getSalarioMensal();
		double aumento = salarioAtual * (10.0 / 100.0);
		double novoSalario = salarioAtual + aumento;
		empregado.setSalarioMensal(novoSalario);
		System.out.println("Aumento de R$" + aumento + " fornecido ao empregado " + empregado.getNome());
	}
}
