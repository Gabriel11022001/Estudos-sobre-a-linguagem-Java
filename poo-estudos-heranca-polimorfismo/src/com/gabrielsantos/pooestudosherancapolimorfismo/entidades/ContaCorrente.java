package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
		System.out.println("Invocando o construtor da classe ContaCorrente!");
	}
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
		System.out.println("Invocando o construtor da classe ContaCorrente!");
	}
	@Override
	public void sacar(double valor) {
		if (valor < 0) {
			System.out.println("Você não pode sacar um valor negativo!");
			return;
		}
		if (valor > super.getSaldo()) {
			System.out.println("Saldo insuficiente!");
			return;
		}
		double novoSaldo = super.getSaldo() - (valor + (valor * 0.2));
		super.setSaldo(novoSaldo);
		System.out.println("Saque de R$" + (valor + (valor * 0.2)) + " realizado com sucesso!");
	}
}
