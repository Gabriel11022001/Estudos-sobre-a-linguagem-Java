package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
		System.out.println("Invocando o construtor da conta poupança!");
	}
	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
		System.out.println("Invocando o construtor da classe ContaPoupanca!");
	}
}
