
public class CalculadoraTestes {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		System.out.println("Soma: " + calculadora.somar(12, 8.76));
		System.out.println("Soma: " + calculadora.somar(1, 0));
		System.out.println("Soma: " + calculadora.somar(1, -99));
		System.out.println("Soma: " + calculadora.somar(0, 0));
	}
}
