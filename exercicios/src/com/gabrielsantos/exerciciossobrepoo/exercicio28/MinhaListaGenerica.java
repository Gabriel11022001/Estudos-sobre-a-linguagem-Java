package com.gabrielsantos.exerciciossobrepoo.exercicio28;

public class MinhaListaGenerica<T> {

	private T[] elementos;
	
	public MinhaListaGenerica() throws Exception {
		this.elementos = (T[]) new Object[1];
		this.elementos[0] = null;
	}
	public void adicionarElemento(T elemento) throws IllegalArgumentException {
		if (elemento == null) {
			throw new IllegalArgumentException("O elemento não pode estar apontando para null!");
		}
		if (this.elementos[0] == null) {
			T[] elementosAux = (T[]) new Object[1];
			elementosAux[0] = elemento;
			this.elementos = elementosAux;
			// System.out.println("Elemento: " + elemento + " adicionado com sucesso na lista!");
			return;
		}
		int quantidadeElementos = this.elementos.length + 1;
		T[] elementosAux = (T[]) new Object[quantidadeElementos];
		for (int i = 0; i < this.elementos.length; i++) {
			elementosAux[i] = this.elementos[i];
		}
		elementosAux[elementosAux.length - 1] = elemento;
		this.elementos = elementosAux;
	}
	public T[] buscarTodosOsElementos() throws Exception {
		if (this.elementos[0] == null) {
			throw new Exception("A lista não possui elementos!");
		}
		return this.elementos;
	}
	public void apresentarElementosDaLista() throws Exception {
		if (this.elementos[0] == null) {
			throw new Exception("A lista não possui elementos!");
		}
		for (T elemento : this.elementos) {
			System.out.println(elemento);
		}
	}
	public T buscarElemento(int indice) throws Exception {
		if (this.elementos[0] == null) {
			throw new Exception("A lista não possui elementos!");
		}
		if (indice > (this.elementos.length - 1) || indice < 0) {
			throw new Exception("Não é possível buscar um elemento na lista por esse índice!");
		}
		T elemento = this.elementos[indice];
		return elemento;
	}
	public T buscarElemento(T elemento) throws Exception {
		if (this.elementos[0] == null) {
			throw new Exception("A lista não possui elementos!");
		}
		T elementoConsulta = null;
		for (T ele : this.elementos) {
			if (ele.equals(elemento)) {
				elementoConsulta = ele;
				break;
			}
		}
		if (elementoConsulta == null) {
			throw new Exception("Esse elemento não está presente na lista!");
		}
		return elementoConsulta;
	}
	public void removerElemento(int indice) throws Exception {
		if (this.elementos[0] == null) {
			throw new Exception("A lista não possui elementos!");
		}
		if (indice < 0 || indice > (this.elementos.length - 1)) {
			throw new Exception("A lista não possui esse índice!");
		}
		T[] elementosAux = (T[]) new Object[this.elementos.length - 1];
		// Está tentando remover do índice 0.
		if (indice == 0) {
			for (int i = 1; i < elementosAux.length; i++) {
				elementosAux[i - 1] = this.elementos[i];
			}
			this.elementos = elementosAux;
		}
		// Está tentando remover do último índice
		if (indice == (this.elementos.length - 1)) {
			
		}
		// Está tentando remover de um índice diferente do primeiro e do último.
		
	}
	public void removerElemento(T elemento) throws Exception {
		
	}
}
