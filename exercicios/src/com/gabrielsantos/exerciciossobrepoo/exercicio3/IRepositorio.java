package com.gabrielsantos.exerciciossobrepoo.exercicio3;

public interface IRepositorio {

	void guarda(IPessoa pessoa);
	IPessoa recupera(String cpf);
	IPessoa primeiro();
	IPessoa proximo();
}
