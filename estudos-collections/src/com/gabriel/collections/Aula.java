package com.gabriel.collections;

public class Aula implements Comparable<Aula> {

	private String nome;
	private int tempo;

	public Aula(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	@Override
	public String toString() {
		return "Nome da aula: " + this.getNome() + " | Tempo em minutos: " + this.getTempo() + " minutos.";
	}
	@Override
	public int compareTo(Aula aulaComparacao) {
		if (this.getTempo() > aulaComparacao.getTempo()) {
			return 1;
		}
		if (this.getTempo() < aulaComparacao.getTempo()) {
			return -1;
		}
		return 0;
	}
}
