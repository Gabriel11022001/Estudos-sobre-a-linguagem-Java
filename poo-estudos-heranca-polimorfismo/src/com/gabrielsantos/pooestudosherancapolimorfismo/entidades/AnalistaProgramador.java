package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class AnalistaProgramador extends Funcionario implements IAutenticavel {
	
	private String senha;
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.2;
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
		if (senha.equals(this.getSenha())) {
			return true;
		}
		return false;
	}
}
