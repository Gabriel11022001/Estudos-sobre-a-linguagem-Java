package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.utils.Desempenho;

public class ReajusteService {

	public void condecerReajuste(Funcionario funcionario, Desempenho desempenho) {
		if (desempenho == null) {
			throw new IllegalArgumentException("O objeto que representa o desempenho não deve ser igual a null!");
		}
		double porcentagemReajuste = 0;
		double valorReajuste = 0;
		porcentagemReajuste = desempenho.getPercentualReajuste();
		valorReajuste = funcionario.getSalario().doubleValue() * porcentagemReajuste;
		BigDecimal aumento = new BigDecimal(valorReajuste);
		double novoSalarioDouble = valorReajuste + funcionario.getSalario().doubleValue();
		BigDecimal novoSalario = new BigDecimal(novoSalarioDouble);
		funcionario.definirSalario(novoSalario);
	}
}
