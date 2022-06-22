package br.com.gabriel.estudosservlets.models;

public class Empresa {

	private int id;
	private String nome;
	
	public Empresa(int id, String nome) {
		this.setNome(nome);
		this.setId(id);
	}
	public void setNome(String nome) {
		if (nome == null || nome.equals("") || nome.isEmpty()) {
			throw new RuntimeException("Informe o nome da empresa!");
		}
		this.nome = nome;
	}
	public String getNome() {
		if (this.nome == null) {
			throw new RuntimeException("O nome da empresa ainda não foi informado, informe o nome da empresa!");
		}
		return this.nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
