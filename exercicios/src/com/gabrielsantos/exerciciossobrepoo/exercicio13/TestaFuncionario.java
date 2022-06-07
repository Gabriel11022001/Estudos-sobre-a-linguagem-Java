package com.gabrielsantos.exerciciossobrepoo.exercicio13;

public class TestaFuncionario {

	public static void main(String[] args) {
		try {
			Funcionario funcionario = new Funcionario("Gabriel", 4000);
			System.out.println("Nome do funcion�rio: " + funcionario.getNome());
			System.out.println("Sal�rio do funcion�rio: R$" + funcionario.getSalario());
			funcionario.aumentarSalario(10);
			System.out.println("Sal�rio do funcion�rio: R$" + funcionario.getSalario());
			funcionario.aumentarSalario(8.87);
			System.out.println("Sal�rio do funcion�rio: R$" + funcionario.getSalario());
			// funcionario.aumentarSalario(0);
			// funcionario.aumentarSalario(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
