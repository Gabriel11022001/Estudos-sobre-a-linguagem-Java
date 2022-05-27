package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class Gerente extends Funcionario implements IAutenticavel {
	
	private String senha;
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.30;
	}
	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String getSenha() {
		return this.senha;
	}
	@Override
	public boolean autenticar(String senha) {
		if (senha.equals(this.senha)) {
			return true;
		}
		return false;
	}
}
