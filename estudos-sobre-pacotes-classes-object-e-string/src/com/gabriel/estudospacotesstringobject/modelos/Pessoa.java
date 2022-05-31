package com.gabriel.estudospacotesstringobject.modelos;

/**
 * Classe que representa uma pessoa.
 * 
 * @author Gabriel Rodrigues dos Santos
 *
 */
public class Pessoa {

	private String nome;
	private Double altura;
	private Double peso;
	
	/**
	 * Construtor padr�o da classe Pessoa que n�o recebe par�metros.
	 */
	public Pessoa() {
		
	}
	/**
	 * Construtor da classe Pessoa que recebe como par�metro
	 * o nome, a altura e o peso de uma pessoa.
	 * 
	 * @param nome
	 * @param altura
	 * @param peso
	 */
	public Pessoa(String nome, Double altura, Double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	/**
	 * M�todo que retorna o valor da propriedade nome.
	 * 
	 * @return String
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * M�todo que recebe como par�metro o nome de uma pessoa
	 * e atribui o valor passado como par�metro na propriedade nome.
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	/**
	 * M�todo que ao ser invocado apresenta as informa��es
	 * sobre a pessoa.
	 */
	public void apresentarInformacoes() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Altura: " + this.getAltura() + " metros");
		System.out.println("Peso: " + this.getPeso() + " kg");
	}
	@Override
	public String toString() {
		return "Nome: " + this.nome + " | Peso: " + this.peso + "kg | Altura: " + this.altura + " metros"; 
	}
}
