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
			AnalistaDeSistemas analistaDeSistemas1 = new AnalistaDeSistemas();
			analistaDeSistemas1.setNome("Pedro Gustavo da Silva");
			AnalistaDeSistemas analistaDeSistemas2 = new AnalistaDeSistemas();
			analistaDeSistemas2.setNome("Pedro Gustavo da Silva");
			WebDesigner webDesigner1 = new WebDesigner();
			webDesigner1.setNome("Pedro Gustavo da Silva");
			System.out.println(analistaDeSistemas1.equals(analistaDeSistemas2));
			System.out.println(analistaDeSistemas1.equals(webDesigner1));
			Funcionario func1 = new AnalistaDeSistemas("Maria Fernanda da Silva", 4000);
			Funcionario func2 = new WebDesigner("Eduarda Pereira da Silva", 4000);
			empresa.registrarFuncionario(func1);
			empresa.registrarFuncionario(func2);
			empresa.apresentarOsFuncionariosDaEmpresa();
			if (empresa.buscarFuncionarioComNome("Maria Fernanda da Silva") != null) {
				System.out.println("A Maria Fernanda da Silva está registrada na empresa!");
			} else {
				System.out.println("A Maria Fernanda da Silva não está registrada na empresa!");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
