package br.com.gabrielsantos.gerenciador.models;

public class Empresa {

	private int id;
	private String nome;
	private String cnpj;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return this.cnpj;
	}
}
