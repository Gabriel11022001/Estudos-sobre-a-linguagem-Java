package com.gabriel.estudospacotesstringobject.testes;

import com.gabriel.estudospacotesstringobject.modelos.Pessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Gabriel");
		pessoa1.setAltura(1.82);
		pessoa1.setPeso(85.0);
		pessoa1.apresentarInformacoes();
	}
}
