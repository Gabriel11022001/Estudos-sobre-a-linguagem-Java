package com.gabrielsantos.exerciciossobrepoo.exercicio28;

public class TestaListaGenerica {

	public static void main(String[] args) {
		try {
			MinhaListaGenerica<String> lista = new MinhaListaGenerica<String>();
			lista.adicionarElemento("Gabriel");
			lista.adicionarElemento("Pedro");
			lista.adicionarElemento("Maria");
			lista.adicionarElemento("Gustavo");
			lista.adicionarElemento("José");
			lista.apresentarElementosDaLista();
			String elementoNoIndice0 = lista.buscarElemento(0);
			System.out.println("========================");
			System.out.println(elementoNoIndice0);
			// String elementoNoIndiceInvalido = lista.buscarElemento(12);
			// String elementoNoIndice5 = lista.buscarElemento(5);
			String gabriel = "Gabriel";
			String elementoConsulta = lista.buscarElemento(gabriel);
			System.out.println(elementoConsulta);
			// String elementoConsulta2 = lista.buscarElemento("Eduarda");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
