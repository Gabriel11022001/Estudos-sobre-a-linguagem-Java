package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public class SistemaInterno {

	private String senha;
	
	public SistemaInterno() {
		this.senha = "Ol� Mundo!";
	}
	public void autenticar(IAutenticavel autenticavel) {
		if (autenticavel.autenticar(this.senha)) {
			System.out.println("Login efetuado com sucesso!");
			return;
		}
		System.out.println("Senha inv�lida!");
	}
}
