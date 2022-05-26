package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
		System.out.println("Invocando o construtor da conta poupan�a!");
	}
	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
		System.out.println("Invocando o construtor da classe ContaPoupanca!");
	}
}
