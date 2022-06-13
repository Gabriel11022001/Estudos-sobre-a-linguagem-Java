package com.gabrielsantos.exerciciossobrepoo.exercicio19;

public class Localidade {

	private String cidade;
	private String pais;
	
	public Localidade(String cidade, String pais) throws Exception {
		this.setCidade(cidade);
		this.setPais(pais);
	}
	public void setCidade(String cidade) throws Exception {
		if (cidade.equals("") || cidade.isEmpty()) {
			throw new Exception("Informe a cidade da localidade!");
		}
		this.cidade = cidade;
	}
	public String getCidade() throws Exception {
		if (this.cidade.equals("") || this.cidade.isEmpty()) {
			throw new Exception("Informe a cidade da localidade!");
		}
		return this.cidade;
	}
	public void setPais(String pais) throws Exception {
		if (pais.equals("") || pais.isEmpty()) {
			throw new Exception("Informe o país da localidade!");
		}
		this.pais = pais;
	}
	public String getPais() throws Exception {
		if (this.pais.equals("") || this.pais.isEmpty()) {
			throw new Exception("Informe o país da localidade!");
		}
		return this.pais;
	}
}
