package com.gabrielsantos.exerciciossobrepoo.exercicio17;

import java.util.ArrayList;
import java.util.List;

public class Exercicio17 {

	public static void main(String[] args) {
		try {
			Funcionario funcionario1 = new Gerente("Gabriel", 12000);
			Funcionario funcionario2 = new AssistenteAdministrativo("Pedro", 3000, 1234, "Noturno");
			Funcionario funcionario3 = new AssistenteAdministrativo("Maria", 3400, 4567, "Diurno");
			funcionario1.apresentarDados();
			funcionario2.apresentarDados();
			funcionario3.apresentarDados();
			AssistenteAdministrativo assistenteConvertidoFuncionario2 = (AssistenteAdministrativo) funcionario2;
			assistenteConvertidoFuncionario2.setAdicionalNoturno(300);
			assistenteConvertidoFuncionario2.apresentarDados();
			assistenteConvertidoFuncionario2.setAdicionalNoturno(600);
			assistenteConvertidoFuncionario2.apresentarDados();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
