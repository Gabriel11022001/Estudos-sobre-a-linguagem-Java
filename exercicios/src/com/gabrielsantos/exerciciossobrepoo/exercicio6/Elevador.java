package com.gabrielsantos.exerciciossobrepoo.exercicio6;

import com.gabrielsantos.exerciciossobrepoo.exercicio4.Pessoa;

public class Elevador {

	private int andarAtual;
	private int totalAndares;
	private int capacidadePessoasNoElevador;
	private int quantidadePessoasNoElevador;
	private Pessoa[] pessoasNoElevador;
	
	public Elevador(int capacidadePessoasNoElevador, int totalAndares) {
		this.capacidadePessoasNoElevador = capacidadePessoasNoElevador;
		this.totalAndares = totalAndares;
		this.andarAtual = 0;
		this.quantidadePessoasNoElevador = 0;
		this.pessoasNoElevador = new Pessoa[this.capacidadePessoasNoElevador];
	}
	public void entrarNoElevador(Pessoa pessoa) {
		if (quantidadePessoasNoElevador == capacidadePessoasNoElevador) {
			System.out.println("O elevador está lotado!");
			return;
		}
		if (quantidadePessoasNoElevador == 0) {
			this.pessoasNoElevador[0] = pessoa;
			quantidadePessoasNoElevador++;
			return;
		}
		this.pessoasNoElevador[quantidadePessoasNoElevador] = pessoa;
		quantidadePessoasNoElevador++;
	}
	public void sairDoElevador(String nomePessoa) {
		// Ainda vou implementar
	}
	public void subirAndar() {
		if (this.andarAtual < this.totalAndares) {
			System.out.println("Subindo para o " + (andarAtual + 1) + "° andar!");
			this.andarAtual++;
		} else if (this.andarAtual == totalAndares) {
			System.out.println("Você já está no último andar!");
		}
	}
	public void descerAndar() {
		if (this.andarAtual == 0) {
			System.out.println("Você está no térreo!");
		} else {
			if (this.andarAtual - 1 == 0) {
				System.out.println("Descendo para o térreo!");
			} else {
				System.out.println("Descendo para o " + (this.andarAtual - 1) + "° andar!");	
			}
			this.andarAtual--;
		}
	}
	private boolean verificarSePessoaEstaNoElevador(String nome) {
		for (int contador = 0; contador < this.quantidadePessoasNoElevador; contador++) {
			if (this.pessoasNoElevador[contador].getNome().equals(nome)) {
				return true;
			}
		}
		return false;
	}
	private int getIndicePessoaNoElevador(String nome) {
		int indicePessoa = -1;
		if (this.verificarSePessoaEstaNoElevador(nome) == false) {
			System.out.println(nome + " não está no elevador!");
			return -1;
		}
		int cont = 0;
		while (indicePessoa == -1 && cont < this.quantidadePessoasNoElevador) {
			if (this.pessoasNoElevador[cont].getNome().equals(nome)) {
				indicePessoa = cont;
			}
			cont++;
		}
		return indicePessoa;
	}
	public void apresentarPessoasNoElevador() {
		for (int cont = 0; cont < this.quantidadePessoasNoElevador; cont++) {
			if (this.pessoasNoElevador[cont] != null) {
				System.out.println("Nome da pessoa: " + this.pessoasNoElevador[cont].getNome());	
			}
		}
	}
}
