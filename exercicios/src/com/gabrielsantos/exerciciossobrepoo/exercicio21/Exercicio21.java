package com.gabrielsantos.exerciciossobrepoo.exercicio21;

public class Exercicio21 {

	public static void main(String[] args) {
		try {
			Empregado empregado1 = new Empregado("Gabriel", "Rodrigues", 3000);
			Empregado empregado2 = new Empregado("Pedro", "Rodrigues", 3500);
			System.out.println(empregado1);
			System.out.println("Salário anual do " + empregado1.getNome() + ": R$" + empregado1.calcularSalarioAnual());
			System.out.println("**********************************");
			System.out.println(empregado2);
			System.out.println("Salário anual do " + empregado2.getNome() + ": R$" + empregado2.calcularSalarioAnual());
			FornecedorDeAumento.darAumento(empregado1, 10);
			FornecedorDeAumento.darAumento(empregado2, 10);
			System.out.println(empregado1);
			System.out.println("Salário anual do " + empregado1.getNome() + ": R$" + empregado1.calcularSalarioAnual());
			System.out.println(empregado2);
			System.out.println("Salário anual do " + empregado2.getNome() + ": R$" + empregado2.calcularSalarioAnual());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
