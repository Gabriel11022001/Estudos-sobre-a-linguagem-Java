package com.gabrielsantos.exerciciossobrepoo.exercicio27;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculaIdadesTest {

	@Test
	public void deveriaRetornarUmaIdadeCorreta() throws Exception {
		Pessoa pessoa = new Pessoa();
		pessoa.setDataNascimento(LocalDate.of(2001, 2, 11));
		Integer idade = CalculaIdades.calcularIdade(pessoa);
		Assertions.assertEquals(21, idade);
	}
	@Test
	public void deveriaLancarExcecaoPoisDataNascimentoNaoFoiInformada() throws Exception {
		Pessoa pessoa = new Pessoa();
		Assertions.assertThrows(Exception.class, () -> {
			CalculaIdades.calcularIdade(pessoa);
		});
	}
	@Test
	public void deveriaLancarExcecaoPoisDataNascimentoNaoAntecedeADataDeHoje() throws Exception {
		Pessoa pessoa = new Pessoa();
		pessoa.setDataNascimento(LocalDate.of(2022, 6, 22));
		Assertions.assertThrows(Exception.class, () -> {
			CalculaIdades.calcularIdade(pessoa);
		});
	}
}
