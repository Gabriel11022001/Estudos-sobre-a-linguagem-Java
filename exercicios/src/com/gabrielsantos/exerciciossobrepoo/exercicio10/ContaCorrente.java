package com.gabrielsantos.exerciciossobrepoo.exercicio10;

public class ContaCorrente {

	private double saldo;
	private String nomeCorrentista;
	private int numeroConta;
	
	public ContaCorrente(String nomeCorrentista, int numeroConta) {
		this.setNomeCorrentista(nomeCorrentista);
		this.setNumeroConta(numeroConta);
	}
	public void setNomeCorrentista(String nomeCorrentista) {
		if (nomeCorrentista.isEmpty()) {
			throw new RuntimeException("O nome do correntista não deve ser vazio!");
		}
		this.nomeCorrentista = nomeCorrentista;
	}
	public String getNomeCorrentista() {
		return this.nomeCorrentista;
	}
	public void setNumeroConta(int numeroConta) {
		if (numeroConta <= 0) {
			throw new RuntimeException("O número da conta não deve ser um valor menor ou igual a zero!");
		}
		this.numeroConta = numeroConta;
	}
	public int getNumeroConta() {
		return this.numeroConta;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void sacar(double valor) throws SaldoInsuficienteException, Exception {
		if (valor > this.getSaldo()) {
			throw new SaldoInsuficienteException("Saldo insuficiente para saque!");
		}
		if (valor <= 0) {
			throw new Exception("Não é possível sacar um valor menor ou igual a 0!");
		}
		this.saldo -= valor;
		System.out.println("Saque de R$" + valor + " realizado com sucesso!");
	}
	public void depositar(double valor) throws Exception {
		if (valor <= 0) {
			throw new Exception("Não é possível depositar um valor menor ou igual a 0!");
		}
		this.saldo += valor;
	}
}
