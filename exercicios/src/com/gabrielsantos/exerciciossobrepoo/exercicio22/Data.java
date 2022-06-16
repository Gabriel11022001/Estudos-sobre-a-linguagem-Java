package com.gabrielsantos.exerciciossobrepoo.exercicio22;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.setMes(mes);
		this.setDia(dia);
		this.setAno(ano);
	}
	public void setDia(int dia) {
		if (dia < 1 || dia > 31) {
			throw new RuntimeException("Nenhum mês possui menos que 1 dia e mais de 31 dias!");
		}
		if (this.mes == 2) {
			if (dia > 29) {
				throw new RuntimeException("O mês de Fevereiro só vai até o dia 29!");
			}
		}
		if (this.mes == 4) {
			if (dia > 30) {
				throw new RuntimeException("O mês de Abril só vai até o dia 30!");
			}
		}
		if (this.mes == 6) {
			if (dia > 30) {
				throw new RuntimeException("O mês de Junho só vai até o dia 30!");
			}
		}
		if (this.mes == 9) {
			if (dia > 30) {
				throw new RuntimeException("O mês de Setembro só vai até o dia 30!");
			}
		}
		if (this.mes == 11) {
			if (dia > 30) {
				throw new RuntimeException("O mês de Novembro só vai até o dia 30!");
			}
		}
		this.dia = dia;
	}
	public int getDia() {
		return this.dia;
	}
	public void setMes(int mes) {
		if (mes < 1 || mes > 12) {
			throw new RuntimeException("Mês inválido, informe um mês entre 1 e 12!");
		}
		this.mes = mes;
	}
	public int getMes() {
		return this.mes;
	}
	public void setAno(int ano) {
		if (ano < 0) {
			throw new RuntimeException("Ano inválido!");
		}
		this.ano = ano;
	}
	public int getAno() {
		return this.ano;
	}
	public void apresentarData() {
		String dataFormatada = "";
		if (this.getDia() < 10) {
			dataFormatada += "0" + this.getDia() + "/";
		} else {
			dataFormatada += this.getDia() + "/";
		}
		if (this.getMes() < 10) {
			dataFormatada += "0" + this.getMes() + "/";
		} else {
			dataFormatada += this.getMes() + "/";
		}
		dataFormatada += this.getAno();
		System.out.println("Data: " + dataFormatada);
	}
}
