package com.gabrielsantos.exerciciossobrepoo.exercicio4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pessoa {

	private String nome;
	private double altura;
	private Date dataNascimento;
	
	public Pessoa() {
		this.dataNascimento = new Date();
	}
	public Pessoa(String nome, double altura, Date dataNascimento) {
		this.nome = nome;
		this.altura = altura;
		this.dataNascimento = dataNascimento;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setDataNascimento(Date dataNascimento) throws Exception {
		Date dataAtual = new Date();
		if (dataNascimento.compareTo(dataAtual) > 0) {
			throw new Exception("A data de nascimento deve ser anterior ou igual a data de hoje!");
		}
		this.dataNascimento = dataNascimento;
	}
	public Date getDataNascimento() {
		return this.dataNascimento;
	}
	public long calcularIdade() {
		long idade = 0;
		Date dataAtual = new Date();
		long difEmMili = dataAtual.getTime() - this.dataNascimento.getTime();
		long difEmDias = TimeUnit.DAYS.convert(difEmMili, TimeUnit.MILLISECONDS);
		double difEmMeses = difEmDias * 0.0329;
		idade = (int) (difEmMeses *  0.0833);
		return idade;
	}
	public String getDataNascimentoFormatada() {
		String dataNascimentoFormatada = "";
		dataNascimentoFormatada = new SimpleDateFormat().format(this.getDataNascimento());
		String dia = dataNascimentoFormatada.substring(0, 2);
		String mes = dataNascimentoFormatada.substring(3, 5);
		String ano = dataNascimentoFormatada.substring(6, 10);
		dataNascimentoFormatada = dia + "/" + mes + "/" + ano;
		return dataNascimentoFormatada;
	}
}
