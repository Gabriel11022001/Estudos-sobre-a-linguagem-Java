package com.gabrielsantos.pooestudosherancapolimorfismo.entidades;

public interface IAutenticavel {

	void setSenha(String senha);
	String getSenha();
	boolean autenticar(String senha);
}
