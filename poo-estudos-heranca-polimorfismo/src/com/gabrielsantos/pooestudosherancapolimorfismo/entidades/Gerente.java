package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class Gerente extends Funcionario {
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.30;
	}
}
