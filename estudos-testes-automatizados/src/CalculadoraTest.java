import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		double soma = calc.somar(10, 5);
		// System.out.println("Soma: " + soma);
		Assert.assertEquals(15.0, soma);
	}
}
