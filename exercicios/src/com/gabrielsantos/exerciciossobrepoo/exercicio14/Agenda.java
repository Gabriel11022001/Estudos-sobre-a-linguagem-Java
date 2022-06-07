package com.gabrielsantos.exerciciossobrepoo.exercicio14;

import java.util.ArrayList;
import java.util.List;

import com.gabrielsantos.exerciciossobrepoo.exercicio4.Pessoa;

public class Agenda {

	private List<Pessoa> contatos;
	
	public Agenda() {
		this.contatos = new ArrayList<Pessoa>();
	}
	public void armazenarContato(Pessoa contato) {
		if (this.contatos.size() == 10) {
			throw new RuntimeException("A agenda está lotada!");
		}
		this.contatos.add(contato);
		System.out.println(contato.getNome() + " foi adicionado(a) com sucesso na agenda!");
	}
	public void removerContato(String nome) {
		if (this.contatos.size() == 0) {
			throw new RuntimeException("Não existe contatos adicionados na agenda!");
		}
		int indiceContatoAgenda = -1;
		for (int i = 0; i < this.contatos.size(); i++) {
			if (this.contatos.get(i).getNome().equals(nome)) {
				indiceContatoAgenda = i;
			}
		}
		if (indiceContatoAgenda < 0) {
			throw new RuntimeException("Não existe um contato com esse nome na agenda!");
		}
		this.contatos.remove(indiceContatoAgenda);
		System.out.println(nome + " foi removido(a) com sucesso da agenda!");
	}
	public void limparAgenda() {
		if (this.contatos.size() == 0) {
			System.out.println("Não existe contatos na agenda!");
			return;
		}
		this.contatos.clear();
	}
	public void apresentarContatosDaAgenda() {
		if (this.contatos.size() == 0) {
			System.out.println("Não existe contatos na agenda!");
			return;
		}
		for (Pessoa p : this.contatos) {
			System.out.println("************************");
			System.out.println(p.getNome());
			System.out.println("************************");
		}
	}
	public Pessoa buscarContato(String nome) {
		if (this.contatos.size() == 0) {
			throw new RuntimeException("Não existe contatos cadastrados na agenda!");
		}
		int indicePessoa = -1;
		for (int i = 0; i < this.contatos.size(); i++) {
			if (this.contatos.get(i).getNome().equals(nome)) {
				indicePessoa = i;
			}
		}
		if (indicePessoa < 0) {
			throw new RuntimeException("Não existe um contato cadastrado com esse nome!");
		}
		Pessoa contato = this.contatos.get(indicePessoa);
		return contato;
	}
	public void apresentarDadosContato(int indicePessoa) {
		if (this.contatos.size() == 0) {
			throw new RuntimeException("Não existe contatos cadastrados na agenda!");
		}
		Pessoa p = this.contatos.get(indicePessoa);
		System.out.println("====== Dados do contato no índice " + indicePessoa + " ===========");
		System.out.println("Nome do contato: " + p.getNome());
		System.out.println("=============================");
	}
}
