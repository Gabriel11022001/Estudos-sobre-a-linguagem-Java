package com.gabrielsantos.exerciciossobrepoo.exercicio25;

import java.util.Date;

public class Exercicio25 {

	 public static void main(String[] args) {
		try {
			 Funcionario funcionario1 = new Funcionario("Gabriel", 4000, new Date(2021, 9, 21));
			 Funcionario funcionario2 = new Funcionario("Maria", 4500, new Date(2009, 8, 30));
			 Funcionario funcionario3 = new Funcionario("Pedro", 4100, new Date(2021, 7, 12));
			 Funcionario funcionario4 = new Funcionario("josé", 2500, new Date(2022, 6, 23));
			 Departamento departamentoDeTI = new Departamento("Departamento de TI");
			 Departamento departamentoDeRH = new Departamento("Departamento de recursos humanos");
			 departamentoDeTI.registrarFuncionarioNoDepartamento(funcionario1);
			 departamentoDeRH.registrarFuncionarioNoDepartamento(funcionario4);
			 departamentoDeTI.registrarFuncionarioNoDepartamento(funcionario3);
			 departamentoDeRH.registrarFuncionarioNoDepartamento(funcionario2);
			 Empresa empresa = new Empresa("TEC-Softwares");
			 empresa.registrarDepartamentoNaEmpresa(departamentoDeRH);
			 empresa.registrarDepartamentoNaEmpresa(departamentoDeTI);
			 empresa.apresentarInformacoesSobreAEmpresa();
			 empresa.fornecerAumentoParaFuncionariosDoDepartamento("Departamento de TI");
			 empresa.apresentarInformacoesSobreAEmpresa();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
