package com.gabrielsantos.exerciciossobrepoo.exercicio19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Passagem {

	private Localidade destino;
	private Localidade origem;
	private double valor;
	private Passageiro passageiro;
	private Date dataIda;
	private Date dataRetorno;
	
	public Passagem(Localidade destino, Localidade origem, double valor, Passageiro passageiro
			, Date dataIda, Date dataRetorno) throws Exception {
		if (destino == null) {
			throw new Exception("Informe a localidade de destino!");
		}
		if (origem == null) {
			throw new Exception("Informe a localidade de origem!");
		}
		if (valor <= 0) {
			throw new Exception("Informe o valor da passagem!");
		}
		if (passageiro == null) {
			throw new Exception("Informe o passageiro!");
		} 
		if (dataIda == null) {
			throw new Exception("Informe a data de ida da viagem!");
		}
		if (dataRetorno == null) {
			throw new Exception("Informe a data de volta da viagem!");
		}
		// Invocar os métodos sets
	}
	public void setDestino(Localidade destino) throws Exception {
		if (destino == null) {
			throw new Exception("Informe o destino!");
		}
		this.destino = destino;
	}
	public Localidade getDestino() throws Exception {
		if (this.destino == null) {
			throw new Exception("O destino não foi definido, informe o destino!");
		}
		return this.destino;
	}
	public void setOrigem(Localidade origem) throws Exception {
		if (this.origem == null) {
			throw new Exception("Informe a origem!");
		}
		this.origem = origem;
	}
	public Localidade getOrigem() throws Exception {
		if (this.origem == null) {
			throw new Exception("A origem ainda não foi definida, informe a origem!");
		}
		return this.origem;
	}
	public void setValor(double valor) throws Exception {
		if (valor < 0) {
			throw new Exception("O valor da passagem não deve ser menor que R$0,00!");
		}
		this.valor = valor;
	}
	public double getValor() throws Exception {
		return this.valor;
	}
	public void setPassageiro(Passageiro passageiro) throws Exception {
		if (passageiro == null) {
			throw new Exception("Informe o passageiro!");
		}
		this.passageiro = passageiro;
	}
	public Passageiro getPassageiro() throws Exception {
		if (this.passageiro == null) {
			throw new Exception("O passageiro não foi informado, informe o passageiro!");
		}
		return this.passageiro;
	}
	public void setDataIda(Date dataIda) throws Exception {
		if (dataIda == null) {
			throw new Exception("Informe a data de ida!");
		}
		this.dataIda = dataIda;
	}
	public Date getDataIda() throws Exception {
		if (this.dataIda == null) {
			throw new Exception("A data de ida não foi informada!");
		}
		return this.dataIda;
	}
	public void setDataRetorno(Date dataRetorno) throws Exception {
		if (dataRetorno == null) {
			throw new Exception("Informe a data de retorno!");
		}
		this.dataRetorno = dataRetorno;
	}
	public Date getDataRetorno() throws Exception {
		if (this.dataRetorno == null) {
			throw new Exception("A data de retorno não foi informada, informe a data de retorno!");
		}
		return this.dataRetorno;
	}
}
