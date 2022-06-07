package com.gabrielsantos.exerciciossobrepoo.exercicio10;

public class TestaContaCorrente {

	public static void main(String[] args) {
		try {
			ContaCorrente contaCorrente = new ContaCorrente("Gabriel Rodrigues", 1234);
			// contaCorrente.sacar(200);
			contaCorrente.depositar(4000);
			contaCorrente.setNomeCorrentista("Gabriel Rodrigues dos Santos");
			contaCorrente.depositar(200);
			contaCorrente.sacar(1000);
			System.out.println("Nome do correntista: " + contaCorrente.getNomeCorrentista());
			System.out.println("Número da conta: " + contaCorrente.getNumeroConta());
			System.out.println("Saldo: R$" + contaCorrente.getSaldo()); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
