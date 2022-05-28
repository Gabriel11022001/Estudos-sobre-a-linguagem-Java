package com.gabrielsantos.exerciciossobrepoo.exercicio5;

import com.gabrielsantos.exerciciossobrepoo.exercicio4.Pessoa;

public class Agenda {

	private Pessoa[] pessoas;
	
	public Agenda() {
		this.pessoas = new Pessoa[10];
	}
	public void armazenarPessoa(Pessoa pessoa) {
		int qtdPessoasAdicionadas = this.getQuantidadePessoasAdicionadas();
		if (qtdPessoasAdicionadas == 10) {
			System.out.println("A agenda não suporta mais contatos!");
			return;
		}
		this.pessoas[qtdPessoasAdicionadas] = pessoa;
		System.out.println(pessoa.getNome() + " foi adicionado com sucesso na agenda!");
	}
	public void removerPessoa(String nome) {
		int qtdPessoasNaAgenda = this.getQuantidadePessoasAdicionadas();
		if (qtdPessoasNaAgenda == 0) {
			System.out.println("A agenda não possui contatos!");
			return;
		}
		Pessoa[] pessoasAux = new Pessoa[this.pessoas.length - 1];
		int indicePessoa = buscarPessoa(nome);
		if (indicePessoa == -2) {
			System.out.println("Não existe na agenda uma pessoa com esse nome!");
			return;
		}
		indicePessoa--;
		if (indicePessoa == 0) {
			for (int cont = 1; cont < this.pessoas.length; cont++) {
				pessoasAux[cont - 1] = this.pessoas[cont];
			}
			this.pessoas = pessoasAux;
			System.out.println(nome + " removido(a) com sucesso da agenda!");
			return;
		}
		if (indicePessoa == (this.pessoas.length - 1)) {
			for (int cont = 0; cont < (this.pessoas.length - 1); cont++) {
				pessoasAux[cont] = this.pessoas[cont];
			}
			this.pessoas = pessoasAux;
			System.out.println(nome + " removido(a) com sucesso da agenda!");
			return;
		}
		int indiceInicialPrimeiraParte = 0;
		int indiceInicialSegundaParte = indicePessoa + 1;
		for (int cont = indiceInicialPrimeiraParte; cont < indicePessoa; cont++) {
			pessoasAux[cont] = this.pessoas[cont];
		}
		for (int cont = indiceInicialSegundaParte; cont < this.pessoas.length; cont++) {
			pessoasAux[cont - 1] = this.pessoas[cont];
		}
		this.pessoas = pessoasAux;
		System.out.println(nome + " removido(a) com sucesso da agenda!");
	}
	public int buscarPessoa(String nome) {
		// -1 Nenhuma pessoa na agenda
		// -2 Não existe na agenda, uma pessoa com o nome passado como parâmetro
		int posicaoPessoa = -1;
		if (this.getQuantidadePessoasAdicionadas() == 0) {
			return -1;
		}
		for (int cont = 0; cont < this.pessoas.length; cont++) {
			if (this.pessoas[cont] != null) {
				if (this.pessoas[cont].getNome().equals(nome)) {
					posicaoPessoa = cont + 1;
					return posicaoPessoa;
				}
			}
		}
		return -2;
	}
	public void apresentarDadosAgenda() {
		int qtdPessoasNaAgenda = this.getQuantidadePessoasAdicionadas();
		if (qtdPessoasNaAgenda == 0) {
			System.out.println("A agenda não possui contatos!");
			return;
		}
		for (int cont = 0; cont < qtdPessoasNaAgenda; cont++) {
			System.out.println("***********************************");
			System.out.println("Nome do contato: " + this.pessoas[cont].getNome());
			System.out.println("Altura do contato: " + this.pessoas[cont].getAltura());
			System.out.println("Data de nascimento da pessoa: " + this.pessoas[cont].getDataNascimentoFormatada());
			System.out.println("Idade: " + this.pessoas[cont].calcularIdade());
			System.out.println("***********************************");
		}
	}
	public void apresentarDadosDaPessoa(String nome) {
		int qtdPessoasAdicionadas = this.getQuantidadePessoasAdicionadas();
		if (qtdPessoasAdicionadas == 0) {
			System.out.println("A agenda não possui contatos!");
			return;
		}
		Pessoa pessoaConsulta = null;
		int posicaoPessoa = this.buscarPessoa(nome);
		if (posicaoPessoa == -1) {
			System.out.println("Não existem pessoas cadastradas na agenda!");
			return;
		}
		if (posicaoPessoa == -2) {
			System.out.println(nome + " não está cadastrado na agenda!");
			return;
		}
		int indicePessoa = posicaoPessoa - 1;
		pessoaConsulta = this.pessoas[indicePessoa];
		System.out.println("***********************************");
		System.out.println("Nome do contato: " + pessoaConsulta.getNome());
		System.out.println("Altura do contato: " + pessoaConsulta.getAltura());
		System.out.println("Data de nascimento da pessoa: " + pessoaConsulta.getDataNascimentoFormatada());
		System.out.println("Idade: " + pessoaConsulta.calcularIdade());
		System.out.println("***********************************");
	}
	private int getQuantidadePessoasAdicionadas() {
		int qtdPessoasAdicionadas = 0;
		for (int contador = 0; contador < this.pessoas.length; contador++) {
			if (this.pessoas[contador] != null) {
				qtdPessoasAdicionadas++;
			}
		}
		return qtdPessoasAdicionadas;
	}
}
