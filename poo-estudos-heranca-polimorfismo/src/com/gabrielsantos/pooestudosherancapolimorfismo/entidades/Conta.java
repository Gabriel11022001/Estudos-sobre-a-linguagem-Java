package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class Conta {

	/**
	 * public -> membros podem ser acessados pela própria classe, objetos e por subclasses.
	 * private -> membros só podem ser acessados pelo própria classe.
	 * protected -> membros podem ser acessados na própria classe e em subclasses.
	 */
	private Titular titular;
	private int numero;
	private int agencia;
	private double saldo;
	private static int quantidadeContas;
	
	public Conta() {
		this.setTitular(new Titular());
		Conta.quantidadeContas++;
	}
	public Conta(int numero, int agencia) {
		this.setAgencia(agencia);
		this.setNumero(numero);
		Conta.quantidadeContas++;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	public Titular getTitular() {
		return this.titular;
	}
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("O número da agência deve ser maior que 0!");
			return;
		}
		this.numero = numero;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("O número da agência deve ser maior que 0!");
			return;
		}
		this.agencia = agencia;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void depositar(double valor) {
		if (valor < 0) {
			System.out.println("Não é possível depositar um valor negativo!");
			return;
		}
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
	}
	public void sacar(double valor) {
		if (valor < 0) {
			System.out.println("Você não pode sacar um valor negativo!");
			return;
		}
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente!");
			return;
		}
		this.saldo -= valor;
		System.out.println("Saque realizado com sucesso!");
	}
	public void transferir(Conta contaDestino, double valor) {
		if (valor < 0) {
			System.out.println("Você não pode transferir um valor negativo!");
			return;
		}
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente!");
			return;
		}
		contaDestino.depositar(valor);
		this.sacar(valor);
		System.out.println("Trânsferencia realizada com sucesso!");
	}
	public static int getQuantidadeContasCriadas() {
		return Conta.quantidadeContas;
	}
}
