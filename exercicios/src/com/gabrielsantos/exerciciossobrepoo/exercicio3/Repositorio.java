package com.gabrielsantos.exerciciossobrepoo.exercicio3;

public class Repositorio implements IRepositorio {

	private IPessoa[] pessoas;
	
	public Repositorio() {
		this.pessoas = new IPessoa[0];
	}
	@Override
	public void guarda(IPessoa pessoa) {
		if (this.pessoas.length == 0) {
			IPessoa[] pessoasAux = new IPessoa[1];
			pessoasAux[0] = pessoa;
			this.pessoas = pessoasAux;
			System.out.println(pessoa.getNome() + " cadastrado(a) com sucesso!");
			return;
		}
		int novoTamanho = this.pessoas.length + 1;
		IPessoa[] pessoasAux = new IPessoa[novoTamanho];
		for (int cont = 0; cont < this.pessoas.length; cont++) {
			pessoasAux[cont] = this.pessoas[cont];
			System.out.println(pessoa.getNome() + " cadastrado(a) com sucesso!");
		}
		pessoasAux[novoTamanho - 1] = pessoa;
	}
	@Override
	public IPessoa recupera(String cpf) {
		IPessoa pessoa = null;
		for (int cont = 0; cont < this.pessoas.length; cont++) {
			if (this.pessoas[cont].getCpf().equals(cpf)) {
				pessoa = this.pessoas[cont];
			}
		}
		return pessoa;
	}
	@Override
	public IPessoa primeiro() {
		
		return null;
	}
	@Override
	public IPessoa proximo() {
		
		return null;
	}
}
