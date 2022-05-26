package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class GerenciadorDeBonificacao {

	private double totalBonificacoes;
	
	public void calcularTotalBonificacoes(Funcionario funcionario) {
		this.totalBonificacoes += funcionario.getBonificacao();
	}
	public double getTotalBonificacoes() {
		return this.totalBonificacoes;
	}
}
