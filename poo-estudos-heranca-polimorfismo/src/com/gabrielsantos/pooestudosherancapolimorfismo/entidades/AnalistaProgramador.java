package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class AnalistaProgramador extends Funcionario {
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.2;
	}
}
