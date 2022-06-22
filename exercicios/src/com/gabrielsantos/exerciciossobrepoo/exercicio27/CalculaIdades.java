package com.gabrielsantos.exerciciossobrepoo.exercicio27;

import java.time.LocalDate;

public class CalculaIdades {

	public static Integer calcularIdade(Pessoa pessoa) throws Exception {
		if (pessoa.getDataNascimento() == null) {
			throw new Exception("A data de nascimento da pessoa não foi informada,"
					+ " informe a data de nascimento da pessoa para que a idade da"
					+ " mesma possa ser calculada!");
		}
		if (LocalDate.now().compareTo(pessoa.getDataNascimento()) <= 0) {
			throw new Exception("A data de nascimento da pessoa deve anteceder a data de hoje!");
		}
		LocalDate dataDeHoje = LocalDate.now();
		Integer idadeEmAnos = dataDeHoje.compareTo(pessoa.getDataNascimento());
		return idadeEmAnos;
	}
}
