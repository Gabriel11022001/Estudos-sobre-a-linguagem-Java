package com.gabriel.collections;

public class TestaEmpresa {

	public static void main(String[] args) {
		try {
			Empresa empresa = new Empresa();
			empresa.setNome("Empresa 1");
			empresa.registrarFuncionario(new AnalistaDeSistemas("Gabriel", 4000));
			empresa.registrarFuncionario(new AnalistaDeSistemas("Pedro", 4000));
			empresa.registrarFuncionario(new WebDesigner("Maria", 4200));
			System.out.println("Total de bonificações: R$" + empresa.getTotalBonificacoes());
			// empresa.registrarFuncionario(null);
			// empresa.registrarFuncionario(new WebDesigner());
			empresa.registrarFuncionario(new WebDesigner("Eduardo", 5000));
			System.out.println("Total de bonificações: R$" + empresa.getTotalBonificacoes());
			empresa.apresentarOsFuncionariosDaEmpresa();
			System.out.println("Total de bonificaï¿½ï¿½es da empresa: R$" + empresa.getTotalBonificacoes());
			empresa.registrarFuncionario(new AnalistaDeSistemas("José Miguel", 6000));
			System.out.println("Total de bonificações da empresa: R$" + empresa.getTotalBonificacoes());
			Funcionario funcionarioASerDemitido = empresa.getFuncionarios().get(4);
			empresa.demitirFuncionario(funcionarioASerDemitido);
			empresa.apresentarOsFuncionariosDaEmpresa();
			System.out.println("Total de bonificações da empresa: R$" + empresa.getTotalBonificacoes());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
