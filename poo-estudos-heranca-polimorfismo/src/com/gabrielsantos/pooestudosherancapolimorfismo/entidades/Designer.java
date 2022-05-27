package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.083;
	}
}
