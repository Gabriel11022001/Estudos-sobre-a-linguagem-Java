package br.com.gabriel.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;
import br.com.alura.tdd.utils.DesempenhoADesejar;
import br.com.alura.tdd.utils.DesempenhoBom;
import br.com.alura.tdd.utils.DesempenhoOtimo;

public class ReajusteServiceTest {

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		ReajusteService reajusteService = new ReajusteService();
		Funcionario funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("1000"));
		reajusteService.condecerReajuste(funcionario, new DesempenhoADesejar());
		assertEquals(new BigDecimal("1030"), funcionario.getSalario());
	}
	@Test
	public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
		ReajusteService reajusteService = new ReajusteService();
		Funcionario funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("1000"));
		reajusteService.condecerReajuste(funcionario, new DesempenhoBom());
		assertEquals(new BigDecimal("1150"), funcionario.getSalario());
	}
	@Test
	public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForBom() {
		ReajusteService reajusteService = new ReajusteService();
		Funcionario funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("1000"));
		reajusteService.condecerReajuste(funcionario, new DesempenhoOtimo());
		assertEquals(new BigDecimal("1200"), funcionario.getSalario());
	}
	@Test
	public void deveriaLancarAExcecaoIllegalArgumentException() {
		ReajusteService reajusteService = new ReajusteService();
		Funcionario funcionario = new Funcionario("Gabriel", LocalDate.now(), new BigDecimal("1000"));
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			reajusteService.condecerReajuste(funcionario, null);
		});
	}
}
