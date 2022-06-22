package br.com.gabriel.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

public class BonusServiceTest {

	@Test
	public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		Funcionario funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("1200"));
		BonusService bonusService = new BonusService();
		BigDecimal retorno = bonusService.calcularBonus(funcionario);
		assertEquals(BigDecimal.ZERO, retorno);
	}
	@Test
	public void bonusDeveriaSerDezPorcentoDoSalario() {
		Funcionario funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("1000"));
		BonusService bonusService = new BonusService();
		BigDecimal retorno = bonusService.calcularBonus(funcionario);
		assertEquals(new BigDecimal("100.0"), retorno);
	}
}
