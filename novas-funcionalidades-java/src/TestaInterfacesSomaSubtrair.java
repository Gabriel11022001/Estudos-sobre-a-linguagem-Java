
public class TestaInterfacesSomaSubtrair {

	public static void main(String[] args) {
		/**
		 * Um expressão lambda sempre vai estar atrelada a uma interface funcional,
		 * uma interface funcional é uma interface que possui somente um método
		 * abstrato.
		 */
		InterfaceSoma somador = (primeiroValor, segundoValor) -> {
			return primeiroValor + segundoValor;
		};
		InterfaceSubtrair subtrator = (primeiroValor, segundoValor) -> {
			return primeiroValor - segundoValor;
		};
		int soma1 = somador.somar(12, 40);
		System.out.println(soma1);
		int soma2 = somador.somar(23, 23);
		System.out.println(soma2);
		int subtracao1 = subtrator.subtrair(12, 4);
		System.out.println(subtracao1);
	}
}
